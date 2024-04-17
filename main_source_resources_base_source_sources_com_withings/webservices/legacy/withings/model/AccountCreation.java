package com.withings.webservices.legacy.withings.model;

import com.google.gson.annotations.SerializedName;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.jvm.internal.u;
/* compiled from: AccountCreation.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0019\u001a\u00020\u0005R$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/withings/webservices/legacy/withings/model/AccountCreation;", "", "()V", ConstantsWs.JSON_ACCOUNT_KEY_ACCOUNTS, "", "Lcom/withings/webservices/legacy/withings/model/AccountCreation$Account;", "getAccounts", "()Ljava/util/List;", "setAccounts", "(Ljava/util/List;)V", "providerToken", "", "getProviderToken", "()Ljava/lang/String;", "setProviderToken", "(Ljava/lang/String;)V", "requireSecureSession", "", "getRequireSecureSession", "()Z", "setRequireSecureSession", "(Z)V", "sessionId", "getSessionId", "setSessionId", "getAccount", "Account", "webservices-legacy_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AccountCreation {
    @SerializedName("account")
    private List<Account> accounts = i0.f76187a;
    @SerializedName("providertoken")
    private String providerToken;
    @SerializedName("require_secure_session")
    private boolean requireSecureSession;
    @SerializedName(ConstantsWs.JSON_SESSION_KEY_SESSIONID)
    private String sessionId;

    /* compiled from: AccountCreation.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/withings/webservices/legacy/withings/model/AccountCreation$Account;", "", "()V", "activationCode", "", "getActivationCode", "()Ljava/lang/String;", "setActivationCode", "(Ljava/lang/String;)V", ConstantsWs.JSON_ACCOUNT_KEY_DEBUG, "", "getDebug", "()I", "setDebug", "(I)V", "id", "", "getId", "()J", "setId", "(J)V", "webservices-legacy_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Account {
        private String activationCode;
        private int debug;

        /* renamed from: id  reason: collision with root package name */
        private long f46859id;

        public final String getActivationCode() {
            return this.activationCode;
        }

        public final int getDebug() {
            return this.debug;
        }

        public final long getId() {
            return this.f46859id;
        }

        public final void setActivationCode(String str) {
            this.activationCode = str;
        }

        public final void setDebug(int i11) {
            this.debug = i11;
        }

        public final void setId(long j5) {
            this.f46859id = j5;
        }
    }

    public final Account getAccount() {
        return this.accounts.get(0);
    }

    public final List<Account> getAccounts() {
        return this.accounts;
    }

    public final String getProviderToken() {
        return this.providerToken;
    }

    public final boolean getRequireSecureSession() {
        return this.requireSecureSession;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final void setAccounts(List<Account> list) {
        u.j(list, "<set-?>");
        this.accounts = list;
    }

    public final void setProviderToken(String str) {
        this.providerToken = str;
    }

    public final void setRequireSecureSession(boolean z5) {
        this.requireSecureSession = z5;
    }

    public final void setSessionId(String str) {
        this.sessionId = str;
    }
}
