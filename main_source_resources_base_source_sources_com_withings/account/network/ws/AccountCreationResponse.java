package com.withings.account.network.ws;

import androidx.appcompat.app.h;
import androidx.camera.camera2.internal.h2;
import androidx.camera.camera2.internal.l0;
import com.google.gson.annotations.SerializedName;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
/* compiled from: WsModels.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001fB+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J7\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u000b\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011¨\u0006 "}, d2 = {"Lcom/withings/account/network/ws/AccountCreationResponse;", "", "sessionId", "", "providerToken", ConstantsWs.JSON_ACCOUNT_KEY_ACCOUNTS, "", "Lcom/withings/account/network/ws/AccountCreationResponse$Account;", "requireSecureSession", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "account", "getAccount", "()Lcom/withings/account/network/ws/AccountCreationResponse$Account;", "getAccounts", "()Ljava/util/List;", "getProviderToken", "()Ljava/lang/String;", "getRequireSecureSession", "()Z", "getSessionId", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "Account", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AccountCreationResponse {
    public static final int $stable = 8;
    @SerializedName("account")
    private final List<Account> accounts;
    @SerializedName("providertoken")
    private final String providerToken;
    @SerializedName("require_secure_session")
    private final boolean requireSecureSession;
    @SerializedName(ConstantsWs.JSON_SESSION_KEY_SESSIONID)
    private final String sessionId;

    /* compiled from: WsModels.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/withings/account/network/ws/AccountCreationResponse$Account;", "", "id", "", ConstantsWs.JSON_ACCOUNT_KEY_DEBUG, "", "activationCode", "", "(JILjava/lang/String;)V", "getActivationCode", "()Ljava/lang/String;", "getDebug", "()I", "getId", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Account {
        public static final int $stable = 0;
        @SerializedName(ConstantsWs.JSON_ACCOUNT_KEY_ACTIVATIONCODE)
        private final String activationCode;
        @SerializedName(ConstantsWs.JSON_ACCOUNT_KEY_DEBUG)
        private final int debug;
        @SerializedName("id")

        /* renamed from: id  reason: collision with root package name */
        private final long f30999id;

        public Account(long j5, int i11, String activationCode) {
            u.j(activationCode, "activationCode");
            this.f30999id = j5;
            this.debug = i11;
            this.activationCode = activationCode;
        }

        public static /* synthetic */ Account copy$default(Account account, long j5, int i11, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                j5 = account.f30999id;
            }
            if ((i12 & 2) != 0) {
                i11 = account.debug;
            }
            if ((i12 & 4) != 0) {
                str = account.activationCode;
            }
            return account.copy(j5, i11, str);
        }

        public final long component1() {
            return this.f30999id;
        }

        public final int component2() {
            return this.debug;
        }

        public final String component3() {
            return this.activationCode;
        }

        public final Account copy(long j5, int i11, String activationCode) {
            u.j(activationCode, "activationCode");
            return new Account(j5, i11, activationCode);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Account)) {
                return false;
            }
            Account account = (Account) obj;
            if (this.f30999id == account.f30999id && this.debug == account.debug && u.e(this.activationCode, account.activationCode)) {
                return true;
            }
            return false;
        }

        public final String getActivationCode() {
            return this.activationCode;
        }

        public final int getDebug() {
            return this.debug;
        }

        public final long getId() {
            return this.f30999id;
        }

        public int hashCode() {
            return this.activationCode.hashCode() + h.a(this.debug, Long.hashCode(this.f30999id) * 31, 31);
        }

        public String toString() {
            long j5 = this.f30999id;
            int i11 = this.debug;
            String str = this.activationCode;
            StringBuilder sb2 = new StringBuilder("Account(id=");
            sb2.append(j5);
            sb2.append(", debug=");
            sb2.append(i11);
            return h2.c(sb2, ", activationCode=", str, ")");
        }
    }

    public AccountCreationResponse(String sessionId, String providerToken, List<Account> accounts, boolean z5) {
        u.j(sessionId, "sessionId");
        u.j(providerToken, "providerToken");
        u.j(accounts, "accounts");
        this.sessionId = sessionId;
        this.providerToken = providerToken;
        this.accounts = accounts;
        this.requireSecureSession = z5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AccountCreationResponse copy$default(AccountCreationResponse accountCreationResponse, String str, String str2, List list, boolean z5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = accountCreationResponse.sessionId;
        }
        if ((i11 & 2) != 0) {
            str2 = accountCreationResponse.providerToken;
        }
        if ((i11 & 4) != 0) {
            list = accountCreationResponse.accounts;
        }
        if ((i11 & 8) != 0) {
            z5 = accountCreationResponse.requireSecureSession;
        }
        return accountCreationResponse.copy(str, str2, list, z5);
    }

    public final String component1() {
        return this.sessionId;
    }

    public final String component2() {
        return this.providerToken;
    }

    public final List<Account> component3() {
        return this.accounts;
    }

    public final boolean component4() {
        return this.requireSecureSession;
    }

    public final AccountCreationResponse copy(String sessionId, String providerToken, List<Account> accounts, boolean z5) {
        u.j(sessionId, "sessionId");
        u.j(providerToken, "providerToken");
        u.j(accounts, "accounts");
        return new AccountCreationResponse(sessionId, providerToken, accounts, z5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountCreationResponse)) {
            return false;
        }
        AccountCreationResponse accountCreationResponse = (AccountCreationResponse) obj;
        if (u.e(this.sessionId, accountCreationResponse.sessionId) && u.e(this.providerToken, accountCreationResponse.providerToken) && u.e(this.accounts, accountCreationResponse.accounts) && this.requireSecureSession == accountCreationResponse.requireSecureSession) {
            return true;
        }
        return false;
    }

    public final Account getAccount() {
        return (Account) x.I(this.accounts);
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

    public int hashCode() {
        return Boolean.hashCode(this.requireSecureSession) + e.b(this.accounts, d.c(this.providerToken, this.sessionId.hashCode() * 31, 31), 31);
    }

    public String toString() {
        String str = this.sessionId;
        String str2 = this.providerToken;
        List<Account> list = this.accounts;
        boolean z5 = this.requireSecureSession;
        StringBuilder b10 = l0.b("AccountCreationResponse(sessionId=", str, ", providerToken=", str2, ", accounts=");
        b10.append(list);
        b10.append(", requireSecureSession=");
        b10.append(z5);
        b10.append(")");
        return b10.toString();
    }
}
