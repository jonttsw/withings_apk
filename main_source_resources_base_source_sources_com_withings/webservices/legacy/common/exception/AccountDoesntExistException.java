package com.withings.webservices.legacy.common.exception;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.SerializedName;
import com.withings.webservices.legacy.common.exception.WrongStatusException;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import org.jivesoftware.smack.sasl.packet.SaslStreamElements;
/* compiled from: AccountDoesntExistException.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000b\fB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/withings/webservices/legacy/common/exception/AccountDoesntExistException;", "Lcom/withings/webservices/legacy/common/exception/WrongStatusException$Runtime;", "url", "", "conversion", "Lcom/withings/webservices/legacy/common/exception/WrongStatusException$Conversion;", SaslStreamElements.Response.ELEMENT, "Lcom/withings/webservices/legacy/common/exception/AccountDoesntExistException$Response;", "(Ljava/lang/String;Lcom/withings/webservices/legacy/common/exception/WrongStatusException$Conversion;Lcom/withings/webservices/legacy/common/exception/AccountDoesntExistException$Response;)V", "getResponse", "()Lcom/withings/webservices/legacy/common/exception/AccountDoesntExistException$Response;", "Companion", "Response", "webservices-legacy_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AccountDoesntExistException extends WrongStatusException.Runtime {
    public static final Companion Companion = new Companion(null);
    private final Response response;

    /* compiled from: AccountDoesntExistException.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/withings/webservices/legacy/common/exception/AccountDoesntExistException$Companion;", "", "()V", "fromWrongStatusException", "Lcom/withings/webservices/legacy/common/exception/WrongStatusException$Runtime;", "url", "", "conversionException", "Lcom/withings/webservices/legacy/common/exception/WrongStatusException$Conversion;", "webservices-legacy_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final WrongStatusException.Runtime fromWrongStatusException(String url, WrongStatusException.Conversion conversionException) {
            u.j(url, "url");
            u.j(conversionException, "conversionException");
            try {
                Response response = (Response) new GsonBuilder().create().fromJson(conversionException.getBody(), (Class<Object>) Response.class);
                u.g(response);
                return new AccountDoesntExistException(url, conversionException, response);
            } catch (JsonSyntaxException unused) {
                return new WrongStatusException.Runtime(url, conversionException);
            }
        }

        private Companion() {
        }
    }

    /* compiled from: AccountDoesntExistException.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/webservices/legacy/common/exception/AccountDoesntExistException$Response;", "", "accountCreationToken", "", "(Ljava/lang/String;)V", "getAccountCreationToken", "()Ljava/lang/String;", "webservices-legacy_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Response {
        @SerializedName("account_creation_token")
        private final String accountCreationToken;

        public Response(String accountCreationToken) {
            u.j(accountCreationToken, "accountCreationToken");
            this.accountCreationToken = accountCreationToken;
        }

        public final String getAccountCreationToken() {
            return this.accountCreationToken;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountDoesntExistException(String url, WrongStatusException.Conversion conversion, Response response) {
        super(url, conversion);
        u.j(url, "url");
        u.j(conversion, "conversion");
        u.j(response, "response");
        this.response = response;
    }

    public static final WrongStatusException.Runtime fromWrongStatusException(String str, WrongStatusException.Conversion conversion) {
        return Companion.fromWrongStatusException(str, conversion);
    }

    public final Response getResponse() {
        return this.response;
    }
}
