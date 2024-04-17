package com.withings.network.android.interceptors;

import com.google.gson.JsonElement;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.network.android.PasswordHasNoDigitException;
import com.withings.network.android.PasswordHasNoLowercaseException;
import com.withings.network.android.PasswordHasNoUppercaseException;
import com.withings.network.android.PasswordTooLongException;
import com.withings.network.android.PasswordTooShortException;
import com.withings.webservices.legacy.common.exception.AccountDoesntExistException;
import com.withings.webservices.legacy.common.exception.AlreadyAssociatedException;
import com.withings.webservices.legacy.common.exception.AlreadyExistsException;
import com.withings.webservices.legacy.common.exception.BlockedCallException;
import com.withings.webservices.legacy.common.exception.ComeBackLaterException;
import com.withings.webservices.legacy.common.exception.CreateUserUnauthorizedException;
import com.withings.webservices.legacy.common.exception.EmailAlreadyLinkedException;
import com.withings.webservices.legacy.common.exception.EmailExistsException;
import com.withings.webservices.legacy.common.exception.InvalidParamsException;
import com.withings.webservices.legacy.common.exception.InvalidSessionException;
import com.withings.webservices.legacy.common.exception.LinkUserDeviceException;
import com.withings.webservices.legacy.common.exception.LoginException;
import com.withings.webservices.legacy.common.exception.NotImplementedException;
import com.withings.webservices.legacy.common.exception.ObjectNotFoundException;
import com.withings.webservices.legacy.common.exception.PartnerScaleAlreadyUsedException;
import com.withings.webservices.legacy.common.exception.ScaleSingleUserAutoAssignException;
import com.withings.webservices.legacy.common.exception.ShortCodeExpiredException;
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
import dp0.j;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jivesoftware.smack.packet.Message;
import retrofit.ErrorHandler;
import retrofit.RetrofitError;
import s00.c;
import s00.d;
import s00.e;
/* compiled from: ErrorHandler.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u00011B-\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\b\u0010'\u001a\u0004\u0018\u00010&\u0012\b\u0010*\u001a\u0004\u0018\u00010)\u0012\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b/\u00100J%\u0010\u0007\u001a\u00020\u0003*\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u00020\u0003*\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u0007\u0010\u001dJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"R\u0016\u0010$\u001a\u0004\u0018\u00010#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010'\u001a\u0004\u0018\u00010&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010*\u001a\u0004\u0018\u00010)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00062"}, d2 = {"Lcom/withings/network/android/interceptors/WithingsErrorHandler;", "Lretrofit/ErrorHandler;", "Lokhttp3/Interceptor;", "", "cause", "", "url", "handleError", "(Ljava/lang/Throwable;Ljava/lang/Throwable;Ljava/lang/String;)Ljava/lang/Throwable;", "Lcom/withings/webservices/legacy/common/exception/WrongStatusException$Conversion;", "toWithingsException", "(Lcom/withings/webservices/legacy/common/exception/WrongStatusException$Conversion;Ljava/lang/String;)Ljava/lang/Throwable;", "exception", "Lnm0/y;", "invalidSessionIfNecessary", "(Ljava/lang/Throwable;)V", "blockFutureCallsIfNecessary", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "", "Ljava/lang/StackTraceElement;", "stackTrace", "removeRetrofitTrace", "([Ljava/lang/StackTraceElement;)[Ljava/lang/StackTraceElement;", "stackTraceElement", "", "isRetrofitTrace", "(Ljava/lang/StackTraceElement;)Z", "Lretrofit/RetrofitError;", "error", "(Lretrofit/RetrofitError;)Ljava/lang/Throwable;", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "Ls00/e;", "sessionIdProvider", "Ls00/e;", "Lcom/withings/network/android/interceptors/BlockBackgroundCallsInterceptor;", "blockBackgroundCallsInterceptor", "Lcom/withings/network/android/interceptors/BlockBackgroundCallsInterceptor;", "Ls00/d$b;", "errorCallback", "Ls00/d$b;", "Ls00/c;", "gsonHandler", "Ls00/c;", "<init>", "(Ls00/e;Lcom/withings/network/android/interceptors/BlockBackgroundCallsInterceptor;Ls00/d$b;Ls00/c;)V", "BaseObject", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class WithingsErrorHandler implements ErrorHandler, Interceptor {
    private final BlockBackgroundCallsInterceptor blockBackgroundCallsInterceptor;
    private final d.b errorCallback;
    private final c gsonHandler;
    private final e sessionIdProvider;

    /* compiled from: ErrorHandler.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/withings/network/android/interceptors/WithingsErrorHandler$BaseObject;", "", "status", "", "error", "", Message.BODY, "Lcom/google/gson/JsonElement;", "(ILjava/lang/String;Lcom/google/gson/JsonElement;)V", "getBody", "()Lcom/google/gson/JsonElement;", "getError", "()Ljava/lang/String;", "getStatus", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class BaseObject {
        private final JsonElement body;
        private final String error;
        private final int status;

        public BaseObject(int i11, String str, JsonElement jsonElement) {
            this.status = i11;
            this.error = str;
            this.body = jsonElement;
        }

        public static /* synthetic */ BaseObject copy$default(BaseObject baseObject, int i11, String str, JsonElement jsonElement, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = baseObject.status;
            }
            if ((i12 & 2) != 0) {
                str = baseObject.error;
            }
            if ((i12 & 4) != 0) {
                jsonElement = baseObject.body;
            }
            return baseObject.copy(i11, str, jsonElement);
        }

        public final int component1() {
            return this.status;
        }

        public final String component2() {
            return this.error;
        }

        public final JsonElement component3() {
            return this.body;
        }

        public final BaseObject copy(int i11, String str, JsonElement jsonElement) {
            return new BaseObject(i11, str, jsonElement);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BaseObject)) {
                return false;
            }
            BaseObject baseObject = (BaseObject) obj;
            if (this.status == baseObject.status && u.e(this.error, baseObject.error) && u.e(this.body, baseObject.body)) {
                return true;
            }
            return false;
        }

        public final JsonElement getBody() {
            return this.body;
        }

        public final String getError() {
            return this.error;
        }

        public final int getStatus() {
            return this.status;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = Integer.hashCode(this.status) * 31;
            String str = this.error;
            int i11 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i12 = (hashCode2 + hashCode) * 31;
            JsonElement jsonElement = this.body;
            if (jsonElement != null) {
                i11 = jsonElement.hashCode();
            }
            return i12 + i11;
        }

        public String toString() {
            int i11 = this.status;
            String str = this.error;
            JsonElement jsonElement = this.body;
            StringBuilder a11 = androidx.compose.material3.d.a("BaseObject(status=", i11, ", error=", str, ", body=");
            a11.append(jsonElement);
            a11.append(")");
            return a11.toString();
        }
    }

    public WithingsErrorHandler(e eVar, BlockBackgroundCallsInterceptor blockBackgroundCallsInterceptor, d.b bVar, c gsonHandler) {
        u.j(gsonHandler, "gsonHandler");
        this.sessionIdProvider = eVar;
        this.blockBackgroundCallsInterceptor = blockBackgroundCallsInterceptor;
        this.errorCallback = bVar;
        this.gsonHandler = gsonHandler;
    }

    private final void blockFutureCallsIfNecessary(String str, Throwable th2) {
        TooManyRequestException tooManyRequestException;
        Integer timeToWaitSeconds;
        BlockBackgroundCallsInterceptor blockBackgroundCallsInterceptor = this.blockBackgroundCallsInterceptor;
        if ((th2 instanceof TooManyRequestException) && blockBackgroundCallsInterceptor != null && (timeToWaitSeconds = (tooManyRequestException = (TooManyRequestException) th2).getTimeToWaitSeconds()) != null) {
            blockBackgroundCallsInterceptor.blockCallsForSeconds(timeToWaitSeconds.intValue(), new BlockMetaData(str, tooManyRequestException.getStatus(), System.currentTimeMillis(), timeToWaitSeconds.intValue()));
        }
    }

    private final void invalidSessionIfNecessary(Throwable th2) {
        e eVar;
        if ((th2 instanceof InvalidSessionException) && (eVar = this.sessionIdProvider) != null) {
            eVar.invalidateSession();
        }
    }

    private final boolean isRetrofitTrace(StackTraceElement stackTraceElement) {
        if (!u.e(stackTraceElement.getClassName(), WithingsErrorHandler.class.getName())) {
            String className = stackTraceElement.getClassName();
            u.i(className, "getClassName(...)");
            if (j.R(className, "com.withings", false)) {
                return false;
            }
        }
        return true;
    }

    private final StackTraceElement[] removeRetrofitTrace(StackTraceElement[] stackTraceElementArr) {
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

    private final Throwable toWithingsException(WrongStatusException.Conversion conversion, String str) {
        switch (conversion.getStatus()) {
            case 100:
            case 102:
            case 103:
            case ConstantsWs.WS_STATUS_WRONGACCOUNTID /* 238 */:
                return new WsAuthFailedException(str, conversion);
            case 214:
                return new WrongPermException(str, conversion);
            case 217:
            case ConstantsWs.WS_STATUS_OBJECT_NOTFOUND /* 380 */:
                return new ObjectNotFoundException(str, conversion);
            case 229:
            case ConstantsWs.WS_STATUS_ALREADY_EXIST /* 520 */:
            case ConstantsWs.WS_STATUS_DBERROR /* 2552 */:
                return AlreadyExistsException.Companion.fromWrongStatusException(str, conversion);
            case ConstantsWs.WS_STATUS_UNVERIFIED_SESSION /* 239 */:
                return new UnverifiedSessionException(str, conversion);
            case 250:
            case 501:
                return new InvalidSessionException(str, conversion);
            case ConstantsWs.WS_STATUS_TOOBIG /* 265 */:
                return new TooBigException(str, conversion);
            case ConstantsWs.WS_STATUS_UNAUTHORIZED /* 277 */:
                return new UnauthorizedException(str, conversion);
            case ConstantsWs.WS_STATUS_WRONGRELATION /* 286 */:
                return new WrongRelationException(str, conversion);
            case ConstantsWs.WS_STATUS_UNKNOWN_ACCOUNT /* 327 */:
                return AccountDoesntExistException.Companion.fromWrongStatusException(str, conversion);
            case ConstantsWs.WS_STATUS_WRONG_OLD_PASSWORD /* 349 */:
                return new WrongOldPasswordException(str, conversion);
            case ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED /* 384 */:
                return new LoginException(str, conversion);
            case 503:
                return new InvalidParamsException(str, conversion);
            case 504:
                return new EmailExistsException(str, conversion);
            case 512:
                return new ShortCodeExpiredException(str, conversion);
            case ConstantsWs.WS_STATUS_ERROR_LINK_USER_DEVICE /* 516 */:
                return new LinkUserDeviceException(str, conversion);
            case ConstantsWs.WS_STATUS_ALREADY_ASSOCIATED /* 517 */:
                return new AlreadyAssociatedException(str, conversion);
            case ConstantsWs.WS_STATUS_ERROR_SYNCHROTIME /* 518 */:
                return new SynchroTimeException(str, conversion);
            case ConstantsWs.WS_STATUS_UNAUTHORIZED_PASSWORD /* 534 */:
                return new UnauthorizedPasswordException(str, conversion);
            case ConstantsWs.WS_STATUS_INVALID_PASSWORD_TOO_SHORT /* 536 */:
                return new PasswordTooShortException(str, conversion);
            case ConstantsWs.WS_STATUS_INVALID_PASSWORD_NO_LOWERCASE /* 537 */:
                return new PasswordHasNoLowercaseException(str, conversion);
            case ConstantsWs.WS_STATUS_INVALID_PASSWORD_NO_UPPERCASE /* 538 */:
                return new PasswordHasNoUppercaseException(str, conversion);
            case ConstantsWs.WS_STATUS_INVALID_PASSWORD_NO_DIGIT /* 539 */:
                return new PasswordHasNoDigitException(str, conversion);
            case ConstantsWs.WS_STATUS_INVALID_PASSWORD_TOO_LONG /* 568 */:
                return new PasswordTooLongException(str, conversion);
            case ConstantsWs.WS_STATUS_TOO_MANY_REQUEST /* 601 */:
            case ConstantsWs.WS_STATUS_TOO_MANY_REQUEST_BACKGROUND /* 602 */:
                WrongStatusException.Runtime fromWrongStatusException = TooManyRequestException.fromWrongStatusException(str, conversion);
                u.i(fromWrongStatusException, "fromWrongStatusException(...)");
                return fromWrongStatusException;
            case 1053:
                WrongStatusException.Runtime fromWrongStatusException2 = ComeBackLaterException.fromWrongStatusException(str, conversion);
                u.i(fromWrongStatusException2, "fromWrongStatusException(...)");
                return fromWrongStatusException2;
            case ConstantsWs.WS_STATUS_NOTIMPLEMENTED /* 2554 */:
                return new NotImplementedException(str, conversion);
            case ConstantsWs.WS_STATUS_UNSPECIFIED /* 2555 */:
                return new UnspecifiedException(str, conversion);
            case ConstantsWs.WS_STATUS_EMAIL_ALREADY_LINKED_TO_EXISTING_USER /* 3026 */:
                return new EmailAlreadyLinkedException(str, conversion);
            case ConstantsWs.WS_STATUS_PARTNER_CREATE_USER_UNAUTHORIZED /* 3030 */:
                return new CreateUserUnauthorizedException(str, conversion);
            case ConstantsWs.WS_STATUS_PARTNER_SCALE_SINGLE_USER_AUTO_ASSIGN /* 3031 */:
                return new ScaleSingleUserAutoAssignException(str, conversion);
            case ConstantsWs.WS_STATUS_PARTNER_SCALE_ALREADY_USED /* 3032 */:
                return new PartnerScaleAlreadyUsedException(str, conversion);
            default:
                return new WrongStatusException.Runtime(str, conversion);
        }
    }

    @Override // retrofit.ErrorHandler
    public Throwable handleError(RetrofitError error) {
        u.j(error, "error");
        Throwable cause = error.getCause();
        String url = error.getUrl();
        if (url == null) {
            url = ConstantsWs.PARAMETER_VALUE_NULL;
        }
        return handleError(error, cause, url);
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        u.j(chain, "chain");
        Request request = chain.request();
        String httpUrl = request.url().toString();
        try {
            Response proceed = chain.proceed(request);
            ResponseBody body = proceed.body();
            if (body != null) {
                BaseObject baseObject = (BaseObject) this.gsonHandler.b().create().fromJson(body.string(), (Class<Object>) BaseObject.class);
                if (baseObject.getStatus() != 0) {
                    int status = baseObject.getStatus();
                    String error = baseObject.getError();
                    if (error == null) {
                        error = "";
                    }
                    throw toWithingsException(new WrongStatusException.Conversion(status, error, baseObject.getBody()), httpUrl);
                }
                return proceed.newBuilder().body(ResponseBody.Companion.create(String.valueOf(baseObject.getBody()), body.contentType())).build();
            }
            return proceed;
        } catch (Exception e11) {
            throw new WrappedWSException(handleError(e11, e11, httpUrl));
        }
    }

    private final Throwable handleError(Throwable th2, Throwable th3, String str) {
        Throwable cause;
        if (th3 instanceof RetrofitError) {
            RetrofitError retrofitError = (RetrofitError) th3;
            return (retrofitError.getKind() != RetrofitError.Kind.NETWORK || (cause = retrofitError.getCause()) == null) ? th3 : cause;
        } else if (th3 instanceof WsAuthFailedException) {
            return new WsAuthFailedException.Runtime((WsAuthFailedException) th3);
        } else {
            if (th3 instanceof BlockedCallException) {
                return th3;
            }
            if (th3 instanceof WrongStatusException.Runtime) {
                d.b bVar = this.errorCallback;
                if (bVar != null) {
                    bVar.onErrorHandler(((WrongStatusException.Runtime) th3).getStatus());
                }
                blockFutureCallsIfNecessary(str, th3);
                return th3;
            }
            if (th3 instanceof WrongStatusException.Conversion) {
                d.b bVar2 = this.errorCallback;
                if (bVar2 != null) {
                    bVar2.onErrorHandler(((WrongStatusException.Conversion) th3).getStatus());
                }
                th2 = toWithingsException((WrongStatusException.Conversion) th3, str);
            }
            invalidSessionIfNecessary(th2);
            blockFutureCallsIfNecessary(str, th2);
            StackTraceElement[] stackTrace = th2.getStackTrace();
            u.i(stackTrace, "getStackTrace(...)");
            th2.setStackTrace(removeRetrofitTrace(stackTrace));
            return th2;
        }
    }
}
