package com.withings.library.authentication.api.account;

import androidx.appcompat.app.h;
import androidx.camera.camera2.internal.l0;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
/* compiled from: AccountCreationResponse.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 82\u00020\u0001:\u000298B5\u0012\u0006\u0010\u0016\u001a\u00020\n\u0012\u0006\u0010\u0017\u001a\u00020\n\u0012\u0006\u0010\u0018\u001a\u00020\n\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0013¢\u0006\u0004\b2\u00103B[\b\u0017\u0012\u0006\u00104\u001a\u00020\u001e\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0001\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u0013\u0012\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b2\u00107J(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JH\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\n2\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u001a\u001a\u00020\u0013HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001d\u0010\fJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00132\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0016\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\fR \u0010\u0017\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010$\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010\fR \u0010\u0018\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010$\u0012\u0004\b+\u0010'\u001a\u0004\b*\u0010\fR&\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010,\u0012\u0004\b.\u0010'\u001a\u0004\b-\u0010\u0012R \u0010\u001a\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010/\u0012\u0004\b1\u0010'\u001a\u0004\b0\u0010\u0015¨\u0006:"}, d2 = {"Lcom/withings/library/authentication/api/account/AccountCreationResponse;", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Lnm0/y;", "write$Self", "(Lcom/withings/library/authentication/api/account/AccountCreationResponse;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "component1", "()Ljava/lang/String;", "component2", "component3", "", "Lcom/withings/library/authentication/api/account/Account;", "component4", "()Ljava/util/List;", "", "component5", "()Z", "sessionId", "providerToken", "authToken", ConstantsWs.JSON_ACCOUNT_KEY_ACCOUNTS, "requireSecureSession", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)Lcom/withings/library/authentication/api/account/AccountCreationResponse;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSessionId", "getSessionId$annotations", "()V", "getProviderToken", "getProviderToken$annotations", "getAuthToken", "getAuthToken$annotations", "Ljava/util/List;", "getAccounts", "getAccounts$annotations", "Z", "getRequireSecureSession", "getRequireSecureSession$annotations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "Authentication_release"}, k = 1, mv = {1, 9, 0})
@Serializable
/* loaded from: classes4.dex */
public final class AccountCreationResponse {
    private final List<Account> accounts;
    private final String authToken;
    private final String providerToken;
    private final boolean requireSecureSession;
    private final String sessionId;
    public static final Companion Companion = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(Account$$serializer.INSTANCE), null};

    /* compiled from: AccountCreationResponse.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/withings/library/authentication/api/account/AccountCreationResponse$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/withings/library/authentication/api/account/AccountCreationResponse;", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final KSerializer<AccountCreationResponse> serializer() {
            return AccountCreationResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ AccountCreationResponse(int i11, String str, String str2, String str3, List list, boolean z5, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i11 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i11, 31, AccountCreationResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.sessionId = str;
        this.providerToken = str2;
        this.authToken = str3;
        this.accounts = list;
        this.requireSecureSession = z5;
    }

    public static /* synthetic */ AccountCreationResponse copy$default(AccountCreationResponse accountCreationResponse, String str, String str2, String str3, List list, boolean z5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = accountCreationResponse.sessionId;
        }
        if ((i11 & 2) != 0) {
            str2 = accountCreationResponse.providerToken;
        }
        String str4 = str2;
        if ((i11 & 4) != 0) {
            str3 = accountCreationResponse.authToken;
        }
        String str5 = str3;
        List<Account> list2 = list;
        if ((i11 & 8) != 0) {
            list2 = accountCreationResponse.accounts;
        }
        List list3 = list2;
        if ((i11 & 16) != 0) {
            z5 = accountCreationResponse.requireSecureSession;
        }
        return accountCreationResponse.copy(str, str4, str5, list3, z5);
    }

    public static final /* synthetic */ void write$Self(AccountCreationResponse accountCreationResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, accountCreationResponse.sessionId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, accountCreationResponse.providerToken);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, accountCreationResponse.authToken);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 3, kSerializerArr[3], accountCreationResponse.accounts);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 4, accountCreationResponse.requireSecureSession);
    }

    public final String component1() {
        return this.sessionId;
    }

    public final String component2() {
        return this.providerToken;
    }

    public final String component3() {
        return this.authToken;
    }

    public final List<Account> component4() {
        return this.accounts;
    }

    public final boolean component5() {
        return this.requireSecureSession;
    }

    public final AccountCreationResponse copy(String sessionId, String providerToken, String authToken, List<Account> accounts, boolean z5) {
        u.j(sessionId, "sessionId");
        u.j(providerToken, "providerToken");
        u.j(authToken, "authToken");
        u.j(accounts, "accounts");
        return new AccountCreationResponse(sessionId, providerToken, authToken, accounts, z5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountCreationResponse)) {
            return false;
        }
        AccountCreationResponse accountCreationResponse = (AccountCreationResponse) obj;
        if (u.e(this.sessionId, accountCreationResponse.sessionId) && u.e(this.providerToken, accountCreationResponse.providerToken) && u.e(this.authToken, accountCreationResponse.authToken) && u.e(this.accounts, accountCreationResponse.accounts) && this.requireSecureSession == accountCreationResponse.requireSecureSession) {
            return true;
        }
        return false;
    }

    public final List<Account> getAccounts() {
        return this.accounts;
    }

    public final String getAuthToken() {
        return this.authToken;
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

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int b10 = e.b(this.accounts, d.c(this.authToken, d.c(this.providerToken, this.sessionId.hashCode() * 31, 31), 31), 31);
        boolean z5 = this.requireSecureSession;
        int i11 = z5;
        if (z5 != 0) {
            i11 = 1;
        }
        return b10 + i11;
    }

    public String toString() {
        String str = this.sessionId;
        String str2 = this.providerToken;
        String str3 = this.authToken;
        List<Account> list = this.accounts;
        boolean z5 = this.requireSecureSession;
        StringBuilder b10 = l0.b("AccountCreationResponse(sessionId=", str, ", providerToken=", str2, ", authToken=");
        c.d(b10, str3, ", accounts=", list, ", requireSecureSession=");
        return h.d(b10, z5, ")");
    }

    public AccountCreationResponse(String sessionId, String providerToken, String authToken, List<Account> accounts, boolean z5) {
        u.j(sessionId, "sessionId");
        u.j(providerToken, "providerToken");
        u.j(authToken, "authToken");
        u.j(accounts, "accounts");
        this.sessionId = sessionId;
        this.providerToken = providerToken;
        this.authToken = authToken;
        this.accounts = accounts;
        this.requireSecureSession = z5;
    }

    public static /* synthetic */ void getAccounts$annotations() {
    }

    public static /* synthetic */ void getAuthToken$annotations() {
    }

    public static /* synthetic */ void getProviderToken$annotations() {
    }

    public static /* synthetic */ void getRequireSecureSession$annotations() {
    }

    public static /* synthetic */ void getSessionId$annotations() {
    }
}
