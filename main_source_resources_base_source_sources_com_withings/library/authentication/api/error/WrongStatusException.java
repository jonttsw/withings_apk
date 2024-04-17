package com.withings.library.authentication.api.error;

import com.withings.library.authentication.utils.TimeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smackx.delay.packet.DelayInformation;
/* compiled from: WrongStatusException.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0010\u0018\u00002\u00060\u0001j\u0002`\u0002:\u001c\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006,"}, d2 = {"Lcom/withings/library/authentication/api/error/WrongStatusException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "status", "", "error", "", Message.BODY, "Lkotlinx/serialization/json/JsonElement;", "(ILjava/lang/String;Lkotlinx/serialization/json/JsonElement;)V", "getBody", "()Lkotlinx/serialization/json/JsonElement;", "getError", "()Ljava/lang/String;", "getStatus", "()I", "AccountDoesntExistException", "AlreadyAssociatedException", "AlreadyExistsException", "AuthFailedException", "AuthTimeoutException", "ComeBackLaterException", "CreateUserUnauthorizedException", "EmailAlreadyLinkedException", "EmailExistsException", "ExpiredCreationTokenException", "InvalidParamsException", "InvalidSessionException", "LinkUserDeviceException", "LogingErrorException", "ObjectNotFoundException", "PartnerScaleAlreadyUsedException", "RedirectException", "ScaleSingleUserAutoAssignException", "ShortCodeExpiredException", "SynchroTimeException", "TokenExpiredException", "TooBigException", "TooManyRequestException", "UnauthorizedException", "UnauthorizedPasswordException", "UnspecifiedException", "WrongOldPasswordException", "WrongRelationException", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public class WrongStatusException extends Exception {
    private final JsonElement body;
    private final String error;
    private final int status;

    /* compiled from: WrongStatusException.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/withings/library/authentication/api/error/WrongStatusException$AccountDoesntExistException;", "Lcom/withings/library/authentication/api/error/WrongStatusException;", "exception", "(Lcom/withings/library/authentication/api/error/WrongStatusException;)V", "accountCreationToken", "", "getAccountCreationToken", "()Ljava/lang/String;", "email", "getEmail", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class AccountDoesntExistException extends WrongStatusException {
        private final String accountCreationToken;
        private final String email;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AccountDoesntExistException(WrongStatusException exception) {
            super(exception.getStatus(), exception.getError(), exception.getBody());
            String str;
            JsonObject jsonObject;
            JsonElement jsonElement;
            JsonPrimitive jsonPrimitive;
            JsonObject jsonObject2;
            JsonElement jsonElement2;
            JsonPrimitive jsonPrimitive2;
            u.j(exception, "exception");
            JsonElement body = getBody();
            String str2 = null;
            if (body != null && (jsonObject2 = JsonElementKt.getJsonObject(body)) != null && (jsonElement2 = (JsonElement) jsonObject2.get((Object) "account_creation_token")) != null && (jsonPrimitive2 = JsonElementKt.getJsonPrimitive(jsonElement2)) != null) {
                str = jsonPrimitive2.getContent();
            } else {
                str = null;
            }
            u.g(str);
            this.accountCreationToken = str;
            JsonElement body2 = getBody();
            if (body2 != null && (jsonObject = JsonElementKt.getJsonObject(body2)) != null && (jsonElement = (JsonElement) jsonObject.get((Object) "email")) != null && (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) != null) {
                str2 = jsonPrimitive.getContent();
            }
            this.email = str2;
        }

        public final String getAccountCreationToken() {
            return this.accountCreationToken;
        }

        public final String getEmail() {
            return this.email;
        }
    }

    /* compiled from: WrongStatusException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/library/authentication/api/error/WrongStatusException$AlreadyAssociatedException;", "Lcom/withings/library/authentication/api/error/WrongStatusException;", "exception", "(Lcom/withings/library/authentication/api/error/WrongStatusException;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class AlreadyAssociatedException extends WrongStatusException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AlreadyAssociatedException(WrongStatusException exception) {
            super(exception.getStatus(), exception.getError(), exception.getBody());
            u.j(exception, "exception");
        }
    }

    /* compiled from: WrongStatusException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/library/authentication/api/error/WrongStatusException$AlreadyExistsException;", "Lcom/withings/library/authentication/api/error/WrongStatusException;", "exception", "(Lcom/withings/library/authentication/api/error/WrongStatusException;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class AlreadyExistsException extends WrongStatusException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AlreadyExistsException(WrongStatusException exception) {
            super(exception.getStatus(), exception.getError(), exception.getBody());
            u.j(exception, "exception");
        }
    }

    /* compiled from: WrongStatusException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/library/authentication/api/error/WrongStatusException$AuthFailedException;", "Lcom/withings/library/authentication/api/error/WrongStatusException;", "exception", "(Lcom/withings/library/authentication/api/error/WrongStatusException;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class AuthFailedException extends WrongStatusException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AuthFailedException(WrongStatusException exception) {
            super(exception.getStatus(), exception.getError(), exception.getBody());
            u.j(exception, "exception");
        }
    }

    /* compiled from: WrongStatusException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/library/authentication/api/error/WrongStatusException$AuthTimeoutException;", "Lcom/withings/library/authentication/api/error/WrongStatusException;", "exception", "(Lcom/withings/library/authentication/api/error/WrongStatusException;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class AuthTimeoutException extends WrongStatusException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AuthTimeoutException(WrongStatusException exception) {
            super(exception.getStatus(), exception.getError(), exception.getBody());
            u.j(exception, "exception");
        }
    }

    /* compiled from: WrongStatusException.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/withings/library/authentication/api/error/WrongStatusException$ComeBackLaterException;", "Lcom/withings/library/authentication/api/error/WrongStatusException;", "exception", "(Lcom/withings/library/authentication/api/error/WrongStatusException;)V", DelayInformation.ELEMENT, "", "getDelay", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ComeBackLaterException extends WrongStatusException {
        private final Integer delay;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ComeBackLaterException(WrongStatusException exception) {
            super(exception.getStatus(), exception.getError(), exception.getBody());
            Integer num;
            JsonObject jsonObject;
            JsonElement jsonElement;
            JsonPrimitive jsonPrimitive;
            u.j(exception, "exception");
            JsonElement body = getBody();
            if (body != null && (jsonObject = JsonElementKt.getJsonObject(body)) != null && (jsonElement = (JsonElement) jsonObject.get((Object) DelayInformation.ELEMENT)) != null && (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) != null) {
                num = Integer.valueOf(JsonElementKt.getInt(jsonPrimitive));
            } else {
                num = null;
            }
            this.delay = num;
        }

        public final Integer getDelay() {
            return this.delay;
        }
    }

    /* compiled from: WrongStatusException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/library/authentication/api/error/WrongStatusException$CreateUserUnauthorizedException;", "Lcom/withings/library/authentication/api/error/WrongStatusException;", "exception", "(Lcom/withings/library/authentication/api/error/WrongStatusException;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class CreateUserUnauthorizedException extends WrongStatusException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CreateUserUnauthorizedException(WrongStatusException exception) {
            super(exception.getStatus(), exception.getError(), exception.getBody());
            u.j(exception, "exception");
        }
    }

    /* compiled from: WrongStatusException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/library/authentication/api/error/WrongStatusException$EmailAlreadyLinkedException;", "Lcom/withings/library/authentication/api/error/WrongStatusException;", "exception", "(Lcom/withings/library/authentication/api/error/WrongStatusException;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class EmailAlreadyLinkedException extends WrongStatusException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EmailAlreadyLinkedException(WrongStatusException exception) {
            super(exception.getStatus(), exception.getError(), exception.getBody());
            u.j(exception, "exception");
        }
    }

    /* compiled from: WrongStatusException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/library/authentication/api/error/WrongStatusException$EmailExistsException;", "Lcom/withings/library/authentication/api/error/WrongStatusException;", "exception", "(Lcom/withings/library/authentication/api/error/WrongStatusException;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class EmailExistsException extends WrongStatusException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EmailExistsException(WrongStatusException exception) {
            super(exception.getStatus(), exception.getError(), exception.getBody());
            u.j(exception, "exception");
        }
    }

    /* compiled from: WrongStatusException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/library/authentication/api/error/WrongStatusException$ExpiredCreationTokenException;", "Lcom/withings/library/authentication/api/error/WrongStatusException;", "exception", "(Lcom/withings/library/authentication/api/error/WrongStatusException;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ExpiredCreationTokenException extends WrongStatusException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExpiredCreationTokenException(WrongStatusException exception) {
            super(exception.getStatus(), exception.getError(), exception.getBody());
            u.j(exception, "exception");
        }
    }

    /* compiled from: WrongStatusException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/library/authentication/api/error/WrongStatusException$InvalidParamsException;", "Lcom/withings/library/authentication/api/error/WrongStatusException;", "exception", "(Lcom/withings/library/authentication/api/error/WrongStatusException;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class InvalidParamsException extends WrongStatusException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidParamsException(WrongStatusException exception) {
            super(exception.getStatus(), exception.getError(), exception.getBody());
            u.j(exception, "exception");
        }
    }

    /* compiled from: WrongStatusException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/library/authentication/api/error/WrongStatusException$InvalidSessionException;", "Lcom/withings/library/authentication/api/error/WrongStatusException;", "exception", "(Lcom/withings/library/authentication/api/error/WrongStatusException;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class InvalidSessionException extends WrongStatusException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidSessionException(WrongStatusException exception) {
            super(exception.getStatus(), exception.getError(), exception.getBody());
            u.j(exception, "exception");
        }
    }

    /* compiled from: WrongStatusException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/library/authentication/api/error/WrongStatusException$LinkUserDeviceException;", "Lcom/withings/library/authentication/api/error/WrongStatusException;", "exception", "(Lcom/withings/library/authentication/api/error/WrongStatusException;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class LinkUserDeviceException extends WrongStatusException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LinkUserDeviceException(WrongStatusException exception) {
            super(exception.getStatus(), exception.getError(), exception.getBody());
            u.j(exception, "exception");
        }
    }

    /* compiled from: WrongStatusException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/library/authentication/api/error/WrongStatusException$LogingErrorException;", "Lcom/withings/library/authentication/api/error/WrongStatusException;", "exception", "(Lcom/withings/library/authentication/api/error/WrongStatusException;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class LogingErrorException extends WrongStatusException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LogingErrorException(WrongStatusException exception) {
            super(exception.getStatus(), exception.getError(), exception.getBody());
            u.j(exception, "exception");
        }
    }

    /* compiled from: WrongStatusException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/library/authentication/api/error/WrongStatusException$ObjectNotFoundException;", "Lcom/withings/library/authentication/api/error/WrongStatusException;", "exception", "(Lcom/withings/library/authentication/api/error/WrongStatusException;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ObjectNotFoundException extends WrongStatusException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ObjectNotFoundException(WrongStatusException exception) {
            super(exception.getStatus(), exception.getError(), exception.getBody());
            u.j(exception, "exception");
        }
    }

    /* compiled from: WrongStatusException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/library/authentication/api/error/WrongStatusException$PartnerScaleAlreadyUsedException;", "Lcom/withings/library/authentication/api/error/WrongStatusException;", "exception", "(Lcom/withings/library/authentication/api/error/WrongStatusException;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class PartnerScaleAlreadyUsedException extends WrongStatusException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PartnerScaleAlreadyUsedException(WrongStatusException exception) {
            super(exception.getStatus(), exception.getError(), exception.getBody());
            u.j(exception, "exception");
        }
    }

    /* compiled from: WrongStatusException.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withings/library/authentication/api/error/WrongStatusException$RedirectException;", "Lcom/withings/library/authentication/api/error/WrongStatusException;", "exception", "redirectPlatformId", "", "(Lcom/withings/library/authentication/api/error/WrongStatusException;I)V", "getRedirectPlatformId", "()I", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class RedirectException extends WrongStatusException {
        private final int redirectPlatformId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RedirectException(WrongStatusException exception, int i11) {
            super(exception.getStatus(), exception.getError(), exception.getBody());
            u.j(exception, "exception");
            this.redirectPlatformId = i11;
        }

        public final int getRedirectPlatformId() {
            return this.redirectPlatformId;
        }
    }

    /* compiled from: WrongStatusException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/library/authentication/api/error/WrongStatusException$ScaleSingleUserAutoAssignException;", "Lcom/withings/library/authentication/api/error/WrongStatusException;", "exception", "(Lcom/withings/library/authentication/api/error/WrongStatusException;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ScaleSingleUserAutoAssignException extends WrongStatusException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ScaleSingleUserAutoAssignException(WrongStatusException exception) {
            super(exception.getStatus(), exception.getError(), exception.getBody());
            u.j(exception, "exception");
        }
    }

    /* compiled from: WrongStatusException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/library/authentication/api/error/WrongStatusException$ShortCodeExpiredException;", "Lcom/withings/library/authentication/api/error/WrongStatusException;", "exception", "(Lcom/withings/library/authentication/api/error/WrongStatusException;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class ShortCodeExpiredException extends WrongStatusException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShortCodeExpiredException(WrongStatusException exception) {
            super(exception.getStatus(), exception.getError(), exception.getBody());
            u.j(exception, "exception");
        }
    }

    /* compiled from: WrongStatusException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/library/authentication/api/error/WrongStatusException$SynchroTimeException;", "Lcom/withings/library/authentication/api/error/WrongStatusException;", "exception", "(Lcom/withings/library/authentication/api/error/WrongStatusException;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class SynchroTimeException extends WrongStatusException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SynchroTimeException(WrongStatusException exception) {
            super(exception.getStatus(), exception.getError(), exception.getBody());
            u.j(exception, "exception");
        }
    }

    /* compiled from: WrongStatusException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/library/authentication/api/error/WrongStatusException$TokenExpiredException;", "Lcom/withings/library/authentication/api/error/WrongStatusException;", "exception", "(Lcom/withings/library/authentication/api/error/WrongStatusException;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class TokenExpiredException extends WrongStatusException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TokenExpiredException(WrongStatusException exception) {
            super(exception.getStatus(), exception.getError(), exception.getBody());
            u.j(exception, "exception");
        }
    }

    /* compiled from: WrongStatusException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/library/authentication/api/error/WrongStatusException$TooBigException;", "Lcom/withings/library/authentication/api/error/WrongStatusException;", "exception", "(Lcom/withings/library/authentication/api/error/WrongStatusException;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class TooBigException extends WrongStatusException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TooBigException(WrongStatusException exception) {
            super(exception.getStatus(), exception.getError(), exception.getBody());
            u.j(exception, "exception");
        }
    }

    /* compiled from: WrongStatusException.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withings/library/authentication/api/error/WrongStatusException$TooManyRequestException;", "Lcom/withings/library/authentication/api/error/WrongStatusException;", "exception", "(Lcom/withings/library/authentication/api/error/WrongStatusException;)V", "nextAuthorizedRequestTimestamp", "", "getNextAuthorizedRequestTimestamp", "()J", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class TooManyRequestException extends WrongStatusException {
        private final long nextAuthorizedRequestTimestamp;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TooManyRequestException(WrongStatusException exception) {
            super(exception.getStatus(), exception.getError(), exception.getBody());
            int i11;
            JsonObject jsonObject;
            JsonElement jsonElement;
            JsonPrimitive jsonPrimitive;
            u.j(exception, "exception");
            long systemTimeInMillis = TimeKt.getSystemTimeInMillis();
            JsonElement body = getBody();
            if (body != null && (jsonObject = JsonElementKt.getJsonObject(body)) != null && (jsonElement = (JsonElement) jsonObject.get((Object) "wait_seconds")) != null && (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement)) != null) {
                i11 = JsonElementKt.getInt(jsonPrimitive);
            } else {
                i11 = 0;
            }
            this.nextAuthorizedRequestTimestamp = systemTimeInMillis + (i11 * 1000);
        }

        public final long getNextAuthorizedRequestTimestamp() {
            return this.nextAuthorizedRequestTimestamp;
        }
    }

    /* compiled from: WrongStatusException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/library/authentication/api/error/WrongStatusException$UnauthorizedException;", "Lcom/withings/library/authentication/api/error/WrongStatusException;", "exception", "(Lcom/withings/library/authentication/api/error/WrongStatusException;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class UnauthorizedException extends WrongStatusException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnauthorizedException(WrongStatusException exception) {
            super(exception.getStatus(), exception.getError(), exception.getBody());
            u.j(exception, "exception");
        }
    }

    /* compiled from: WrongStatusException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/library/authentication/api/error/WrongStatusException$UnauthorizedPasswordException;", "Lcom/withings/library/authentication/api/error/WrongStatusException;", "exception", "(Lcom/withings/library/authentication/api/error/WrongStatusException;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class UnauthorizedPasswordException extends WrongStatusException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnauthorizedPasswordException(WrongStatusException exception) {
            super(exception.getStatus(), exception.getError(), exception.getBody());
            u.j(exception, "exception");
        }
    }

    /* compiled from: WrongStatusException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/library/authentication/api/error/WrongStatusException$UnspecifiedException;", "Lcom/withings/library/authentication/api/error/WrongStatusException;", "exception", "(Lcom/withings/library/authentication/api/error/WrongStatusException;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class UnspecifiedException extends WrongStatusException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnspecifiedException(WrongStatusException exception) {
            super(exception.getStatus(), exception.getError(), exception.getBody());
            u.j(exception, "exception");
        }
    }

    /* compiled from: WrongStatusException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/library/authentication/api/error/WrongStatusException$WrongOldPasswordException;", "Lcom/withings/library/authentication/api/error/WrongStatusException;", "exception", "(Lcom/withings/library/authentication/api/error/WrongStatusException;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class WrongOldPasswordException extends WrongStatusException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WrongOldPasswordException(WrongStatusException exception) {
            super(exception.getStatus(), exception.getError(), exception.getBody());
            u.j(exception, "exception");
        }
    }

    /* compiled from: WrongStatusException.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/library/authentication/api/error/WrongStatusException$WrongRelationException;", "Lcom/withings/library/authentication/api/error/WrongStatusException;", "exception", "(Lcom/withings/library/authentication/api/error/WrongStatusException;)V", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class WrongRelationException extends WrongStatusException {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WrongRelationException(WrongStatusException exception) {
            super(exception.getStatus(), exception.getError(), exception.getBody());
            u.j(exception, "exception");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public WrongStatusException(int r3, java.lang.String r4, kotlinx.serialization.json.JsonElement r5) {
        /*
            r2 = this;
            java.lang.String r0 = "error"
            kotlin.jvm.internal.u.j(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Status code returned is "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = " ("
            r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.String r0 = androidx.camera.core.y1.e(r0, r4, r1)
            r2.<init>(r0)
            r2.status = r3
            r2.error = r4
            r2.body = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.api.error.WrongStatusException.<init>(int, java.lang.String, kotlinx.serialization.json.JsonElement):void");
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
}
