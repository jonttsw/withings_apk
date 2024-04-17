package com.withings.library.authentication.api.error;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.authentication.api.error.WrongStatusException;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
/* compiled from: WrongStatusException.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0000¨\u0006\u0002"}, d2 = {"toWithingsException", "Lcom/withings/library/authentication/api/error/WrongStatusException;", "Authentication_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WrongStatusExceptionKt {
    public static final WrongStatusException toWithingsException(WrongStatusException wrongStatusException) {
        WrongStatusException authFailedException;
        Integer num;
        WrongStatusException.RedirectException redirectException;
        JsonObject jsonObject;
        JsonElement jsonElement;
        JsonPrimitive jsonPrimitive;
        u.j(wrongStatusException, "<this>");
        switch (wrongStatusException.getStatus()) {
            case 100:
            case 102:
            case 103:
            case ConstantsWs.WS_STATUS_WRONGACCOUNTID /* 238 */:
                authFailedException = new WrongStatusException.AuthFailedException(wrongStatusException);
                return authFailedException;
            case 217:
            case ConstantsWs.WS_STATUS_OBJECT_NOTFOUND /* 380 */:
                authFailedException = new WrongStatusException.ObjectNotFoundException(wrongStatusException);
                return authFailedException;
            case 229:
            case ConstantsWs.WS_STATUS_ALREADY_EXIST /* 520 */:
            case ConstantsWs.WS_STATUS_DBERROR /* 2552 */:
                authFailedException = new WrongStatusException.AlreadyExistsException(wrongStatusException);
                return authFailedException;
            case 250:
            case 501:
                authFailedException = new WrongStatusException.InvalidSessionException(wrongStatusException);
                return authFailedException;
            case ConstantsWs.WS_STATUS_TOOBIG /* 265 */:
                authFailedException = new WrongStatusException.TooBigException(wrongStatusException);
                return authFailedException;
            case ConstantsWs.WS_STATUS_UNAUTHORIZED /* 277 */:
                JsonElement body = wrongStatusException.getBody();
                if (body != null && (jsonObject = JsonElementKt.getJsonObject(body)) != null && (jsonElement = (JsonElement) jsonObject.get((Object) "platformid")) != null && (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) != null) {
                    num = Integer.valueOf(JsonElementKt.getInt(jsonPrimitive));
                } else {
                    num = null;
                }
                if (num == null) {
                    authFailedException = new WrongStatusException.UnauthorizedException(wrongStatusException);
                    return authFailedException;
                }
                redirectException = new WrongStatusException.RedirectException(wrongStatusException, num.intValue());
                return redirectException;
            case ConstantsWs.WS_STATUS_WRONGRELATION /* 286 */:
                authFailedException = new WrongStatusException.WrongRelationException(wrongStatusException);
                return authFailedException;
            case ConstantsWs.WS_STATUS_UNKNOWN_ACCOUNT /* 327 */:
                authFailedException = new WrongStatusException.AccountDoesntExistException(wrongStatusException);
                return authFailedException;
            case ConstantsWs.WS_STATUS_WRONG_OLD_PASSWORD /* 349 */:
                authFailedException = new WrongStatusException.WrongOldPasswordException(wrongStatusException);
                return authFailedException;
            case 360:
                JsonElement body2 = wrongStatusException.getBody();
                u.g(body2);
                Object obj = JsonElementKt.getJsonObject(body2).get((Object) "platformid");
                u.g(obj);
                redirectException = new WrongStatusException.RedirectException(wrongStatusException, JsonElementKt.getInt(JsonElementKt.getJsonPrimitive((JsonElement) obj)));
                return redirectException;
            case ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED /* 384 */:
                authFailedException = new WrongStatusException.LogingErrorException(wrongStatusException);
                return authFailedException;
            case 503:
                authFailedException = new WrongStatusException.InvalidParamsException(wrongStatusException);
                return authFailedException;
            case 504:
                authFailedException = new WrongStatusException.EmailExistsException(wrongStatusException);
                return authFailedException;
            case 512:
                authFailedException = new WrongStatusException.ShortCodeExpiredException(wrongStatusException);
                return authFailedException;
            case ConstantsWs.WS_STATUS_EXPIRED_CREATION_TOKEN /* 513 */:
                authFailedException = new WrongStatusException.ExpiredCreationTokenException(wrongStatusException);
                return authFailedException;
            case ConstantsWs.WS_STATUS_EXPIRED_PROVIDER_TOKEN /* 514 */:
                authFailedException = new WrongStatusException.ExpiredCreationTokenException(wrongStatusException);
                return authFailedException;
            case ConstantsWs.WS_STATUS_ERROR_LINK_USER_DEVICE /* 516 */:
                authFailedException = new WrongStatusException.LinkUserDeviceException(wrongStatusException);
                return authFailedException;
            case ConstantsWs.WS_STATUS_ALREADY_ASSOCIATED /* 517 */:
                authFailedException = new WrongStatusException.AlreadyAssociatedException(wrongStatusException);
                return authFailedException;
            case ConstantsWs.WS_STATUS_ERROR_SYNCHROTIME /* 518 */:
                authFailedException = new WrongStatusException.SynchroTimeException(wrongStatusException);
                return authFailedException;
            case ConstantsWs.WS_STATUS_UNAUTHORIZED_PASSWORD /* 534 */:
                authFailedException = new WrongStatusException.UnauthorizedPasswordException(wrongStatusException);
                return authFailedException;
            case ConstantsWs.WS_STATUS_AUTH_TIMEOUT /* 561 */:
                authFailedException = new WrongStatusException.AuthTimeoutException(wrongStatusException);
                return authFailedException;
            case ConstantsWs.WS_STATUS_TOO_MANY_REQUEST /* 601 */:
            case ConstantsWs.WS_STATUS_TOO_MANY_REQUEST_BACKGROUND /* 602 */:
                authFailedException = new WrongStatusException.TooManyRequestException(wrongStatusException);
                return authFailedException;
            case 1053:
                authFailedException = new WrongStatusException.ComeBackLaterException(wrongStatusException);
                return authFailedException;
            case ConstantsWs.WS_STATUS_UNSPECIFIED /* 2555 */:
                authFailedException = new WrongStatusException.UnspecifiedException(wrongStatusException);
                return authFailedException;
            case ConstantsWs.WS_STATUS_EMAIL_ALREADY_LINKED_TO_EXISTING_USER /* 3026 */:
                authFailedException = new WrongStatusException.EmailAlreadyLinkedException(wrongStatusException);
                return authFailedException;
            case ConstantsWs.WS_STATUS_PARTNER_CREATE_USER_UNAUTHORIZED /* 3030 */:
                authFailedException = new WrongStatusException.CreateUserUnauthorizedException(wrongStatusException);
                return authFailedException;
            case ConstantsWs.WS_STATUS_PARTNER_SCALE_SINGLE_USER_AUTO_ASSIGN /* 3031 */:
                authFailedException = new WrongStatusException.ScaleSingleUserAutoAssignException(wrongStatusException);
                return authFailedException;
            case ConstantsWs.WS_STATUS_PARTNER_SCALE_ALREADY_USED /* 3032 */:
                authFailedException = new WrongStatusException.PartnerScaleAlreadyUsedException(wrongStatusException);
                return authFailedException;
            default:
                return wrongStatusException;
        }
    }
}
