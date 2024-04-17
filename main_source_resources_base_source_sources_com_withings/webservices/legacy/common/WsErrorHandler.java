package com.withings.webservices.legacy.common;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.webservices.legacy.common.BlockBackgroundCallsInterceptor;
import com.withings.webservices.legacy.common.exception.AccountDoesntExistException;
import com.withings.webservices.legacy.common.exception.AlreadyAssociatedException;
import com.withings.webservices.legacy.common.exception.AlreadyExistsException;
import com.withings.webservices.legacy.common.exception.BlockedCallException;
import com.withings.webservices.legacy.common.exception.ComeBackLaterException;
import com.withings.webservices.legacy.common.exception.EmailExistsException;
import com.withings.webservices.legacy.common.exception.InvalidParamsException;
import com.withings.webservices.legacy.common.exception.InvalidSessionException;
import com.withings.webservices.legacy.common.exception.LinkUserDeviceException;
import com.withings.webservices.legacy.common.exception.NotImplementedException;
import com.withings.webservices.legacy.common.exception.ObjectNotFoundException;
import com.withings.webservices.legacy.common.exception.SynchroTimeException;
import com.withings.webservices.legacy.common.exception.TooBigException;
import com.withings.webservices.legacy.common.exception.TooManyRequestException;
import com.withings.webservices.legacy.common.exception.UnauthorizedException;
import com.withings.webservices.legacy.common.exception.UnauthorizedPasswordException;
import com.withings.webservices.legacy.common.exception.UnspecifiedException;
import com.withings.webservices.legacy.common.exception.UnverifiedSessionException;
import com.withings.webservices.legacy.common.exception.WrongOldPasswordException;
import com.withings.webservices.legacy.common.exception.WrongPermException;
import com.withings.webservices.legacy.common.exception.WrongRelationException;
import com.withings.webservices.legacy.common.exception.WrongStatusException;
import com.withings.webservices.legacy.common.exception.WsAuthFailedException;
import retrofit.ErrorHandler;
import retrofit.RetrofitError;
/* loaded from: classes4.dex */
public class WsErrorHandler implements ErrorHandler {
    private BlockBackgroundCallsInterceptor blockBackgroundCallsInterceptor;
    private final WSHandlerDelegate errorCallback;
    private SessionIdProvider sessionIdProvider;

    public WsErrorHandler(SessionIdProvider sessionIdProvider, BlockBackgroundCallsInterceptor blockBackgroundCallsInterceptor, WSHandlerDelegate wSHandlerDelegate) {
        this.sessionIdProvider = sessionIdProvider;
        this.blockBackgroundCallsInterceptor = blockBackgroundCallsInterceptor;
        this.errorCallback = wSHandlerDelegate;
    }

    private void blockFutureCallsIfNecessary(RetrofitError retrofitError, Throwable th2) {
        TooManyRequestException tooManyRequestException;
        Integer timeToWaitSeconds;
        if ((th2 instanceof TooManyRequestException) && this.blockBackgroundCallsInterceptor != null && (timeToWaitSeconds = (tooManyRequestException = (TooManyRequestException) th2).getTimeToWaitSeconds()) != null) {
            this.blockBackgroundCallsInterceptor.blockCallsForSeconds(timeToWaitSeconds.intValue(), new BlockBackgroundCallsInterceptor.MetaData(retrofitError.getUrl(), tooManyRequestException.getStatus(), System.currentTimeMillis(), timeToWaitSeconds.intValue()));
        }
    }

    private Throwable convertToWithingsException(RetrofitError retrofitError, WrongStatusException.Conversion conversion) {
        String url = retrofitError.getUrl();
        switch (conversion.getStatus()) {
            case 100:
            case 102:
            case 103:
            case ConstantsWs.WS_STATUS_WRONGACCOUNTID /* 238 */:
                return new WsAuthFailedException(url, conversion);
            case 214:
                return new WrongPermException(url, conversion);
            case 217:
            case ConstantsWs.WS_STATUS_OBJECT_NOTFOUND /* 380 */:
                return new ObjectNotFoundException(url, conversion);
            case 229:
            case ConstantsWs.WS_STATUS_ALREADY_EXIST /* 520 */:
            case ConstantsWs.WS_STATUS_DBERROR /* 2552 */:
                return AlreadyExistsException.fromWrongStatusException(url, conversion);
            case ConstantsWs.WS_STATUS_UNVERIFIED_SESSION /* 239 */:
                return new UnverifiedSessionException(url, conversion);
            case 250:
            case 501:
                return new InvalidSessionException(url, conversion);
            case ConstantsWs.WS_STATUS_TOOBIG /* 265 */:
                return new TooBigException(url, conversion);
            case ConstantsWs.WS_STATUS_UNAUTHORIZED /* 277 */:
                return new UnauthorizedException(url, conversion);
            case ConstantsWs.WS_STATUS_WRONGRELATION /* 286 */:
                return new WrongRelationException(url, conversion);
            case ConstantsWs.WS_STATUS_UNKNOWN_ACCOUNT /* 327 */:
                return AccountDoesntExistException.fromWrongStatusException(url, conversion);
            case ConstantsWs.WS_STATUS_WRONG_OLD_PASSWORD /* 349 */:
                return new WrongOldPasswordException(url, conversion);
            case 503:
                return new InvalidParamsException(url, conversion);
            case 504:
                return new EmailExistsException(url, conversion);
            case ConstantsWs.WS_STATUS_ERROR_LINK_USER_DEVICE /* 516 */:
                return new LinkUserDeviceException(url, conversion);
            case ConstantsWs.WS_STATUS_ALREADY_ASSOCIATED /* 517 */:
                return new AlreadyAssociatedException(url, conversion);
            case ConstantsWs.WS_STATUS_ERROR_SYNCHROTIME /* 518 */:
                return new SynchroTimeException(url, conversion);
            case ConstantsWs.WS_STATUS_UNAUTHORIZED_PASSWORD /* 534 */:
                return new UnauthorizedPasswordException(url, conversion);
            case ConstantsWs.WS_STATUS_TOO_MANY_REQUEST /* 601 */:
            case ConstantsWs.WS_STATUS_TOO_MANY_REQUEST_BACKGROUND /* 602 */:
                return TooManyRequestException.fromWrongStatusException(url, conversion);
            case 1053:
                return ComeBackLaterException.fromWrongStatusException(url, conversion);
            case ConstantsWs.WS_STATUS_NOTIMPLEMENTED /* 2554 */:
                return new NotImplementedException(url, conversion);
            case ConstantsWs.WS_STATUS_UNSPECIFIED /* 2555 */:
                return new UnspecifiedException(url, conversion);
            default:
                return new WrongStatusException.Runtime(url, conversion);
        }
    }

    private void invalidSessionIfNecessary(Throwable th2) {
        SessionIdProvider sessionIdProvider;
        if ((th2 instanceof InvalidSessionException) && (sessionIdProvider = this.sessionIdProvider) != null) {
            sessionIdProvider.invalidateSession();
        }
    }

    private boolean isRetrofitTrace(StackTraceElement stackTraceElement) {
        if (stackTraceElement.getClassName().equals(getClass().getName())) {
            return true;
        }
        return !stackTraceElement.getClassName().startsWith("com.withings");
    }

    private StackTraceElement[] removeRetrofitTrace(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i11 = 0;
        while (i11 < length && isRetrofitTrace(stackTraceElementArr[i11])) {
            i11++;
        }
        int length2 = stackTraceElementArr.length - i11;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[length2];
        System.arraycopy(stackTraceElementArr, i11, stackTraceElementArr2, 0, length2);
        return stackTraceElementArr2;
    }

    @Override // retrofit.ErrorHandler
    public Throwable handleError(RetrofitError retrofitError) {
        Throwable th2;
        Throwable cause = retrofitError.getCause();
        if (this.errorCallback != null && (cause instanceof WrongStatusException.Conversion)) {
            WrongStatusException.Conversion conversion = (WrongStatusException.Conversion) cause;
            th2 = convertToWithingsException(retrofitError, conversion);
            this.errorCallback.onErrorHandler(conversion.getStatus());
        } else {
            th2 = retrofitError;
        }
        if (cause instanceof WsAuthFailedException) {
            return new WsAuthFailedException.Runtime((WsAuthFailedException) cause);
        }
        if (cause instanceof BlockedCallException) {
            return cause;
        }
        if (cause instanceof WrongStatusException.Runtime) {
            blockFutureCallsIfNecessary(retrofitError, cause);
            return cause;
        }
        if (cause instanceof WrongStatusException.Conversion) {
            th2 = convertToWithingsException(retrofitError, (WrongStatusException.Conversion) cause);
        }
        invalidSessionIfNecessary(th2);
        blockFutureCallsIfNecessary(retrofitError, th2);
        th2.setStackTrace(removeRetrofitTrace(th2.getStackTrace()));
        return th2;
    }

    public void setBlockBackgroundCallsInterceptor(BlockBackgroundCallsInterceptor blockBackgroundCallsInterceptor) {
        this.blockBackgroundCallsInterceptor = blockBackgroundCallsInterceptor;
    }

    public void setSessionProvider(SessionIdProvider sessionIdProvider) {
        this.sessionIdProvider = sessionIdProvider;
    }
}
