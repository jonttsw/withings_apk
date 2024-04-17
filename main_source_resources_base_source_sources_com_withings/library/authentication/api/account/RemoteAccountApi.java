package com.withings.library.authentication.api.account;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.authentication.api.httpclient.HttpClientRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: RemoteAccountApi.kt */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 N2\u00020\u0001:\u0001NB\u000f\u0012\u0006\u0010J\u001a\u00020I¢\u0006\u0004\bL\u0010MJ+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJC\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\fJ#\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\fJ3\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ;\u0010 \u001a\u00020\u001f2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b \u0010!J3\u0010#\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b#\u0010$J#\u0010%\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b%\u0010\fJC\u0010+\u001a\u00020*2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b+\u0010,JC\u0010.\u001a\u00020*2\u0006\u0010'\u001a\u00020&2\u0006\u0010-\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b.\u0010,J#\u00100\u001a\u00020/2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b0\u0010\fJ#\u00101\u001a\u00020/2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b1\u0010\fJ#\u00103\u001a\u0002022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b3\u0010\fJ+\u00107\u001a\u0002062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00105\u001a\u0002042\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b7\u00108J+\u0010:\u001a\u0002092\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b:\u0010\tJC\u0010>\u001a\u00020=2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010;\u001a\u00020\u00022\u0006\u0010<\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&2\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b>\u0010?J3\u0010D\u001a\u00020C2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010@\u001a\u0002042\u0006\u0010B\u001a\u00020A2\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\bD\u0010EJ;\u0010G\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010B\u001a\u0002042\u0006\u0010F\u001a\u00020\u00022\u0006\u0010@\u001a\u0002042\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010K\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006O"}, d2 = {"Lcom/withings/library/authentication/api/account/RemoteAccountApi;", "Lcom/withings/library/authentication/api/account/AccountApi;", "", "sessionId", "phoneNumber", "Lcom/withings/library/authentication/login/Server;", "server", "Lnm0/y;", "setupPhoneAndRequestConfirmationCode", "(Ljava/lang/String;Ljava/lang/String;Lcom/withings/library/authentication/login/Server;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/api/account/RequestConfirmationResponse;", "requestConfirmationCode", "(Ljava/lang/String;Lcom/withings/library/authentication/login/Server;Lqm0/d;)Ljava/lang/Object;", "confirmationCode", "token", "Lcom/withings/library/authentication/api/VirtualDeviceInformation;", "virtualDeviceInformation", "", "rememberDevice", "checkConfirmationCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withings/library/authentication/api/VirtualDeviceInformation;ZLcom/withings/library/authentication/login/Server;Lqm0/d;)Ljava/lang/Object;", "deletePhoneForSession", "Lcom/withings/library/authentication/api/account/authentication/AuthenticationResponse;", "getAuthentication", "email", CommonConstant.ReqAccessTokenParam.LANGUAGE_LABEL, "state", "sendShortCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withings/library/authentication/login/Server;Lqm0/d;)Ljava/lang/Object;", "shortCode", "deviceUuid", "Lcom/withings/library/authentication/api/account/authsession/AuthSession;", "provideShortCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withings/library/authentication/api/VirtualDeviceInformation;Lcom/withings/library/authentication/login/Server;Lqm0/d;)Ljava/lang/Object;", "jwtToken", "provideJWTToken", "(Ljava/lang/String;Ljava/lang/String;Lcom/withings/library/authentication/api/VirtualDeviceInformation;Lcom/withings/library/authentication/login/Server;Lqm0/d;)Ljava/lang/Object;", "requestNewPassword", "Lcom/withings/library/authentication/login/ProviderType;", "providerType", com.huawei.hms.support.feature.result.CommonConstant.KEY_ID_TOKEN, "clientId", "Lcom/withings/library/authentication/api/auth/accountsession/AccountSession;", "loginWithExternalProviderAndIdToken", "(Lcom/withings/library/authentication/login/ProviderType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withings/library/authentication/api/VirtualDeviceInformation;Lcom/withings/library/authentication/login/Server;Lqm0/d;)Ljava/lang/Object;", "providerCode", "loginWithExternalProviderAndProviderCode", "Lcom/withings/library/authentication/api/account/RecoveryCodeResponse;", "getRecoveryCode", "generateRecoveryCode", "Lcom/withings/library/authentication/api/account/CloudResponse;", "getClouds", "", "platformId", "Lcom/withings/library/authentication/api/account/JwtResponse;", "requestJwt", "(Ljava/lang/String;ILcom/withings/library/authentication/login/Server;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/api/account/partnersession/PartnerSessionResponse;", "requestPartnerSession", "accountCreationToken", "prefLang", "Lcom/withings/library/authentication/api/account/AccountCreationResponse;", "createAccountWithToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withings/library/authentication/login/ProviderType;Lcom/withings/library/authentication/login/Server;Lqm0/d;)Ljava/lang/Object;", "appliType", "", "accountId", "Lcom/withings/library/authentication/api/account/AccountContextResponse;", "getAccountContext", "(Ljava/lang/String;IJLcom/withings/library/authentication/login/Server;Lqm0/d;)Ljava/lang/Object;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "updateAccountContext", "(Ljava/lang/String;ILjava/lang/String;ILcom/withings/library/authentication/login/Server;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/library/authentication/api/httpclient/HttpClientRepository;", "httpClientRepository", "Lcom/withings/library/authentication/api/httpclient/HttpClientRepository;", "<init>", "(Lcom/withings/library/authentication/api/httpclient/HttpClientRepository;)V", "Companion", "Authentication_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RemoteAccountApi implements AccountApi {
    public static final Companion Companion = new Companion(null);
    public static final int IDACLPFL_VALUE = 2;
    private final HttpClientRepository httpClientRepository;

    /* compiled from: RemoteAccountApi.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/withings/library/authentication/api/account/RemoteAccountApi$Companion;", "", "()V", "IDACLPFL_VALUE", "", "Authentication_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    public RemoteAccountApi(HttpClientRepository httpClientRepository) {
        u.j(httpClientRepository, "httpClientRepository");
        this.httpClientRepository = httpClientRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e1  */
    @Override // com.withings.library.authentication.api.account.AccountApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object checkConfirmationCode(java.lang.String r7, java.lang.String r8, java.lang.String r9, com.withings.library.authentication.api.VirtualDeviceInformation r10, boolean r11, com.withings.library.authentication.login.Server r12, qm0.d<? super nm0.y> r13) {
        /*
            r6 = this;
            boolean r0 = r13 instanceof com.withings.library.authentication.api.account.RemoteAccountApi$checkConfirmationCode$1
            if (r0 == 0) goto L13
            r0 = r13
            com.withings.library.authentication.api.account.RemoteAccountApi$checkConfirmationCode$1 r0 = (com.withings.library.authentication.api.account.RemoteAccountApi$checkConfirmationCode$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.api.account.RemoteAccountApi$checkConfirmationCode$1 r0 = new com.withings.library.authentication.api.account.RemoteAccountApi$checkConfirmationCode$1
            r0.<init>(r6, r13)
        L18:
            java.lang.Object r13 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            nm0.l.b(r13)
            goto Lda
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            nm0.l.b(r13)
            goto Lb9
        L38:
            nm0.l.b(r13)
            com.withings.library.authentication.api.httpclient.HttpClientRepository r13 = r6.httpClientRepository
            qk0.a r12 = r13.getHttpClient(r12)
            zk0.d r13 = new zk0.d
            r13.<init>()
            com.withings.library.authentication.api.account.RemoteAccountApi$checkConfirmationCode$2$1 r2 = com.withings.library.authentication.api.account.RemoteAccountApi$checkConfirmationCode$2$1.INSTANCE
            r13.o(r2)
            el0.z$a r2 = el0.z.f65720b
            el0.b0 r2 = el0.d0.a()
            java.lang.String r5 = "sessionid"
            r2.e(r5, r7)
            java.lang.String r7 = "code"
            r2.e(r7, r8)
            java.lang.String r7 = com.withings.library.authentication.utils.api.BooleanToKtorStringKt.toKtorString(r11)
            java.lang.String r8 = "is_secure"
            r2.e(r8, r7)
            java.lang.String r7 = "token"
            r2.e(r7, r9)
            java.lang.String r7 = r10.getModelName()
            java.lang.String r8 = "modelname"
            r2.e(r8, r7)
            java.lang.String r7 = "typename"
            java.lang.String r8 = r10.getTypeName()
            r2.e(r7, r8)
            java.lang.String r7 = "os"
            java.lang.String r8 = r10.getOs()
            r2.e(r7, r8)
            java.lang.String r7 = "apppfm"
            java.lang.String r8 = r10.getOs()
            r2.e(r7, r8)
            java.lang.String r7 = "appliver"
            java.lang.String r8 = r10.getAppVersion()
            r2.e(r7, r8)
            java.lang.String r7 = "appname"
            java.lang.String r8 = r10.getAppName()
            r2.e(r7, r8)
            java.lang.String r7 = "osversion"
            java.lang.String r8 = r10.getOsVersion()
            r2.e(r7, r8)
            el0.z r7 = r2.n()
            bl0.g r7 = androidx.compose.material.n3.c(r7, r13, r13, r12)
            r0.label = r4
            java.lang.Object r13 = r7.b(r0)
            if (r13 != r1) goto Lb9
            return r1
        Lb9:
            bl0.c r13 = (bl0.c) r13
            rk0.a r7 = r13.b()
            java.lang.Class<com.withings.library.authentication.api.StubResponse> r8 = com.withings.library.authentication.api.StubResponse.class
            fn0.o r9 = kotlin.jvm.internal.q0.l(r8)
            java.lang.reflect.Type r10 = fn0.t.f(r9)
            fn0.d r8 = kotlin.jvm.internal.q0.b(r8)
            kl0.a r8 = androidx.camera.camera2.internal.s2.y(r10, r8, r9)
            r0.label = r3
            java.lang.Object r13 = r7.a(r8, r0)
            if (r13 != r1) goto Lda
            return r1
        Lda:
            if (r13 == 0) goto Le1
            com.withings.library.authentication.api.StubResponse r13 = (com.withings.library.authentication.api.StubResponse) r13
            nm0.y r7 = nm0.y.f85009a
            return r7
        Le1:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r8 = "null cannot be cast to non-null type com.withings.library.authentication.api.StubResponse"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.api.account.RemoteAccountApi.checkConfirmationCode(java.lang.String, java.lang.String, java.lang.String, com.withings.library.authentication.api.VirtualDeviceInformation, boolean, com.withings.library.authentication.login.Server, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c7  */
    @Override // com.withings.library.authentication.api.account.AccountApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object createAccountWithToken(java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, com.withings.library.authentication.login.ProviderType r13, com.withings.library.authentication.login.Server r14, qm0.d<? super com.withings.library.authentication.api.account.AccountCreationResponse> r15) {
        /*
            r8 = this;
            boolean r0 = r15 instanceof com.withings.library.authentication.api.account.RemoteAccountApi$createAccountWithToken$1
            if (r0 == 0) goto L13
            r0 = r15
            com.withings.library.authentication.api.account.RemoteAccountApi$createAccountWithToken$1 r0 = (com.withings.library.authentication.api.account.RemoteAccountApi$createAccountWithToken$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.api.account.RemoteAccountApi$createAccountWithToken$1 r0 = new com.withings.library.authentication.api.account.RemoteAccountApi$createAccountWithToken$1
            r0.<init>(r8, r15)
        L18:
            java.lang.Object r15 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            nm0.l.b(r15)
            goto Lc2
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            nm0.l.b(r15)
            goto La1
        L37:
            nm0.l.b(r15)
            long r5 = com.withings.library.authentication.login.SessionKt.getSESSION_TIME_TO_LIVE()
            ep0.a$a r15 = ep0.a.f65838b
            kotlin.time.DurationUnit r15 = kotlin.time.DurationUnit.f78024d
            long r5 = ep0.a.q(r5, r15)
            com.withings.library.authentication.api.httpclient.HttpClientRepository r15 = r8.httpClientRepository
            qk0.a r14 = r15.getHttpClient(r14)
            zk0.d r15 = new zk0.d
            r15.<init>()
            com.withings.library.authentication.api.account.RemoteAccountApi$createAccountWithToken$2$1 r2 = com.withings.library.authentication.api.account.RemoteAccountApi$createAccountWithToken$2$1.INSTANCE
            r15.o(r2)
            el0.z$a r2 = el0.z.f65720b
            el0.b0 r2 = el0.d0.a()
            java.lang.String r7 = "email"
            r2.e(r7, r9)
            java.lang.String r9 = "account_creation_token"
            r2.e(r9, r10)
            java.lang.String r9 = "preflang"
            r2.e(r9, r11)
            java.lang.String r9 = "branding"
            java.lang.String r10 = "1"
            r2.e(r9, r10)
            java.lang.String r9 = "idaclpfl"
            java.lang.String r10 = "2"
            r2.e(r9, r10)
            java.lang.String r9 = "uuid"
            r2.e(r9, r12)
            java.lang.String r9 = "authprovider"
            java.lang.String r10 = r13.getValue()
            r2.e(r9, r10)
            java.lang.String r9 = "duration"
            java.lang.String r10 = java.lang.String.valueOf(r5)
            r2.e(r9, r10)
            el0.z r9 = r2.n()
            bl0.g r9 = androidx.compose.material.n3.c(r9, r15, r15, r14)
            r0.label = r4
            java.lang.Object r15 = r9.b(r0)
            if (r15 != r1) goto La1
            return r1
        La1:
            bl0.c r15 = (bl0.c) r15
            rk0.a r9 = r15.b()
            java.lang.Class<com.withings.library.authentication.api.account.AccountCreationResponse> r10 = com.withings.library.authentication.api.account.AccountCreationResponse.class
            fn0.o r11 = kotlin.jvm.internal.q0.l(r10)
            java.lang.reflect.Type r12 = fn0.t.f(r11)
            fn0.d r10 = kotlin.jvm.internal.q0.b(r10)
            kl0.a r10 = androidx.camera.camera2.internal.s2.y(r12, r10, r11)
            r0.label = r3
            java.lang.Object r15 = r9.a(r10, r0)
            if (r15 != r1) goto Lc2
            return r1
        Lc2:
            if (r15 == 0) goto Lc7
            com.withings.library.authentication.api.account.AccountCreationResponse r15 = (com.withings.library.authentication.api.account.AccountCreationResponse) r15
            return r15
        Lc7:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            java.lang.String r10 = "null cannot be cast to non-null type com.withings.library.authentication.api.account.AccountCreationResponse"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.api.account.RemoteAccountApi.createAccountWithToken(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.withings.library.authentication.login.ProviderType, com.withings.library.authentication.login.Server, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008d  */
    @Override // com.withings.library.authentication.api.account.AccountApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object deletePhoneForSession(java.lang.String r7, com.withings.library.authentication.login.Server r8, qm0.d<? super nm0.y> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.withings.library.authentication.api.account.RemoteAccountApi$deletePhoneForSession$1
            if (r0 == 0) goto L13
            r0 = r9
            com.withings.library.authentication.api.account.RemoteAccountApi$deletePhoneForSession$1 r0 = (com.withings.library.authentication.api.account.RemoteAccountApi$deletePhoneForSession$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.api.account.RemoteAccountApi$deletePhoneForSession$1 r0 = new com.withings.library.authentication.api.account.RemoteAccountApi$deletePhoneForSession$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            nm0.l.b(r9)
            goto L86
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            nm0.l.b(r9)
            goto L65
        L36:
            nm0.l.b(r9)
            com.withings.library.authentication.api.httpclient.HttpClientRepository r9 = r6.httpClientRepository
            qk0.a r8 = r9.getHttpClient(r8)
            zk0.d r9 = new zk0.d
            r9.<init>()
            com.withings.library.authentication.api.account.RemoteAccountApi$deletePhoneForSession$2$1 r2 = com.withings.library.authentication.api.account.RemoteAccountApi$deletePhoneForSession$2$1.INSTANCE
            r9.o(r2)
            el0.z$a r2 = el0.z.f65720b
            el0.b0 r2 = el0.d0.a()
            java.lang.String r5 = "sessionid"
            r2.e(r5, r7)
            el0.z r7 = r2.n()
            bl0.g r7 = androidx.compose.material.n3.c(r7, r9, r9, r8)
            r0.label = r4
            java.lang.Object r9 = r7.b(r0)
            if (r9 != r1) goto L65
            return r1
        L65:
            bl0.c r9 = (bl0.c) r9
            rk0.a r7 = r9.b()
            java.lang.Class<com.withings.library.authentication.api.StubResponse> r8 = com.withings.library.authentication.api.StubResponse.class
            fn0.o r9 = kotlin.jvm.internal.q0.l(r8)
            java.lang.reflect.Type r2 = fn0.t.f(r9)
            fn0.d r8 = kotlin.jvm.internal.q0.b(r8)
            kl0.a r8 = androidx.camera.camera2.internal.s2.y(r2, r8, r9)
            r0.label = r3
            java.lang.Object r9 = r7.a(r8, r0)
            if (r9 != r1) goto L86
            return r1
        L86:
            if (r9 == 0) goto L8d
            com.withings.library.authentication.api.StubResponse r9 = (com.withings.library.authentication.api.StubResponse) r9
            nm0.y r7 = nm0.y.f85009a
            return r7
        L8d:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r8 = "null cannot be cast to non-null type com.withings.library.authentication.api.StubResponse"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.api.account.RemoteAccountApi.deletePhoneForSession(java.lang.String, com.withings.library.authentication.login.Server, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    @Override // com.withings.library.authentication.api.account.AccountApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object generateRecoveryCode(java.lang.String r7, com.withings.library.authentication.login.Server r8, qm0.d<? super com.withings.library.authentication.api.account.RecoveryCodeResponse> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.withings.library.authentication.api.account.RemoteAccountApi$generateRecoveryCode$1
            if (r0 == 0) goto L13
            r0 = r9
            com.withings.library.authentication.api.account.RemoteAccountApi$generateRecoveryCode$1 r0 = (com.withings.library.authentication.api.account.RemoteAccountApi$generateRecoveryCode$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.api.account.RemoteAccountApi$generateRecoveryCode$1 r0 = new com.withings.library.authentication.api.account.RemoteAccountApi$generateRecoveryCode$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            nm0.l.b(r9)
            goto L86
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            nm0.l.b(r9)
            goto L65
        L36:
            nm0.l.b(r9)
            com.withings.library.authentication.api.httpclient.HttpClientRepository r9 = r6.httpClientRepository
            qk0.a r8 = r9.getHttpClient(r8)
            zk0.d r9 = new zk0.d
            r9.<init>()
            com.withings.library.authentication.api.account.RemoteAccountApi$generateRecoveryCode$2$1 r2 = com.withings.library.authentication.api.account.RemoteAccountApi$generateRecoveryCode$2$1.INSTANCE
            r9.o(r2)
            el0.z$a r2 = el0.z.f65720b
            el0.b0 r2 = el0.d0.a()
            java.lang.String r5 = "sessionid"
            r2.e(r5, r7)
            el0.z r7 = r2.n()
            bl0.g r7 = androidx.compose.material.n3.c(r7, r9, r9, r8)
            r0.label = r4
            java.lang.Object r9 = r7.b(r0)
            if (r9 != r1) goto L65
            return r1
        L65:
            bl0.c r9 = (bl0.c) r9
            rk0.a r7 = r9.b()
            java.lang.Class<com.withings.library.authentication.api.account.RecoveryCodeResponse> r8 = com.withings.library.authentication.api.account.RecoveryCodeResponse.class
            fn0.o r9 = kotlin.jvm.internal.q0.l(r8)
            java.lang.reflect.Type r2 = fn0.t.f(r9)
            fn0.d r8 = kotlin.jvm.internal.q0.b(r8)
            kl0.a r8 = androidx.camera.camera2.internal.s2.y(r2, r8, r9)
            r0.label = r3
            java.lang.Object r9 = r7.a(r8, r0)
            if (r9 != r1) goto L86
            return r1
        L86:
            if (r9 == 0) goto L8b
            com.withings.library.authentication.api.account.RecoveryCodeResponse r9 = (com.withings.library.authentication.api.account.RecoveryCodeResponse) r9
            return r9
        L8b:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r8 = "null cannot be cast to non-null type com.withings.library.authentication.api.account.RecoveryCodeResponse"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.api.account.RemoteAccountApi.generateRecoveryCode(java.lang.String, com.withings.library.authentication.login.Server, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    @Override // com.withings.library.authentication.api.account.AccountApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getAccountContext(java.lang.String r7, int r8, long r9, com.withings.library.authentication.login.Server r11, qm0.d<? super com.withings.library.authentication.api.account.AccountContextResponse> r12) {
        /*
            r6 = this;
            boolean r0 = r12 instanceof com.withings.library.authentication.api.account.RemoteAccountApi$getAccountContext$1
            if (r0 == 0) goto L13
            r0 = r12
            com.withings.library.authentication.api.account.RemoteAccountApi$getAccountContext$1 r0 = (com.withings.library.authentication.api.account.RemoteAccountApi$getAccountContext$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.api.account.RemoteAccountApi$getAccountContext$1 r0 = new com.withings.library.authentication.api.account.RemoteAccountApi$getAccountContext$1
            r0.<init>(r6, r12)
        L18:
            java.lang.Object r12 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            nm0.l.b(r12)
            goto L98
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            nm0.l.b(r12)
            goto L77
        L36:
            nm0.l.b(r12)
            com.withings.library.authentication.api.httpclient.HttpClientRepository r12 = r6.httpClientRepository
            qk0.a r11 = r12.getHttpClient(r11)
            zk0.d r12 = new zk0.d
            r12.<init>()
            com.withings.library.authentication.api.account.RemoteAccountApi$getAccountContext$2$1 r2 = com.withings.library.authentication.api.account.RemoteAccountApi$getAccountContext$2$1.INSTANCE
            r12.o(r2)
            el0.z$a r2 = el0.z.f65720b
            el0.b0 r2 = el0.d0.a()
            java.lang.String r5 = "sessionid"
            r2.e(r5, r7)
            java.lang.String r7 = "applitype"
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r2.e(r7, r8)
            java.lang.String r7 = "accountid"
            java.lang.String r8 = java.lang.String.valueOf(r9)
            r2.e(r7, r8)
            el0.z r7 = r2.n()
            bl0.g r7 = androidx.compose.material.n3.c(r7, r12, r12, r11)
            r0.label = r4
            java.lang.Object r12 = r7.b(r0)
            if (r12 != r1) goto L77
            return r1
        L77:
            bl0.c r12 = (bl0.c) r12
            rk0.a r7 = r12.b()
            java.lang.Class<com.withings.library.authentication.api.account.AccountContextResponse> r8 = com.withings.library.authentication.api.account.AccountContextResponse.class
            fn0.o r9 = kotlin.jvm.internal.q0.l(r8)
            java.lang.reflect.Type r10 = fn0.t.f(r9)
            fn0.d r8 = kotlin.jvm.internal.q0.b(r8)
            kl0.a r8 = androidx.camera.camera2.internal.s2.y(r10, r8, r9)
            r0.label = r3
            java.lang.Object r12 = r7.a(r8, r0)
            if (r12 != r1) goto L98
            return r1
        L98:
            if (r12 == 0) goto L9d
            com.withings.library.authentication.api.account.AccountContextResponse r12 = (com.withings.library.authentication.api.account.AccountContextResponse) r12
            return r12
        L9d:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r8 = "null cannot be cast to non-null type com.withings.library.authentication.api.account.AccountContextResponse"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.api.account.RemoteAccountApi.getAccountContext(java.lang.String, int, long, com.withings.library.authentication.login.Server, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    @Override // com.withings.library.authentication.api.account.AccountApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getAuthentication(java.lang.String r7, com.withings.library.authentication.login.Server r8, qm0.d<? super com.withings.library.authentication.api.account.authentication.AuthenticationResponse> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.withings.library.authentication.api.account.RemoteAccountApi$getAuthentication$1
            if (r0 == 0) goto L13
            r0 = r9
            com.withings.library.authentication.api.account.RemoteAccountApi$getAuthentication$1 r0 = (com.withings.library.authentication.api.account.RemoteAccountApi$getAuthentication$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.api.account.RemoteAccountApi$getAuthentication$1 r0 = new com.withings.library.authentication.api.account.RemoteAccountApi$getAuthentication$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            nm0.l.b(r9)
            goto L86
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            nm0.l.b(r9)
            goto L65
        L36:
            nm0.l.b(r9)
            com.withings.library.authentication.api.httpclient.HttpClientRepository r9 = r6.httpClientRepository
            qk0.a r8 = r9.getHttpClient(r8)
            zk0.d r9 = new zk0.d
            r9.<init>()
            com.withings.library.authentication.api.account.RemoteAccountApi$getAuthentication$2$1 r2 = com.withings.library.authentication.api.account.RemoteAccountApi$getAuthentication$2$1.INSTANCE
            r9.o(r2)
            el0.z$a r2 = el0.z.f65720b
            el0.b0 r2 = el0.d0.a()
            java.lang.String r5 = "sessionid"
            r2.e(r5, r7)
            el0.z r7 = r2.n()
            bl0.g r7 = androidx.compose.material.n3.c(r7, r9, r9, r8)
            r0.label = r4
            java.lang.Object r9 = r7.b(r0)
            if (r9 != r1) goto L65
            return r1
        L65:
            bl0.c r9 = (bl0.c) r9
            rk0.a r7 = r9.b()
            java.lang.Class<com.withings.library.authentication.api.account.authentication.AuthenticationResponse> r8 = com.withings.library.authentication.api.account.authentication.AuthenticationResponse.class
            fn0.o r9 = kotlin.jvm.internal.q0.l(r8)
            java.lang.reflect.Type r2 = fn0.t.f(r9)
            fn0.d r8 = kotlin.jvm.internal.q0.b(r8)
            kl0.a r8 = androidx.camera.camera2.internal.s2.y(r2, r8, r9)
            r0.label = r3
            java.lang.Object r9 = r7.a(r8, r0)
            if (r9 != r1) goto L86
            return r1
        L86:
            if (r9 == 0) goto L8b
            com.withings.library.authentication.api.account.authentication.AuthenticationResponse r9 = (com.withings.library.authentication.api.account.authentication.AuthenticationResponse) r9
            return r9
        L8b:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r8 = "null cannot be cast to non-null type com.withings.library.authentication.api.account.authentication.AuthenticationResponse"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.api.account.RemoteAccountApi.getAuthentication(java.lang.String, com.withings.library.authentication.login.Server, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    @Override // com.withings.library.authentication.api.account.AccountApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getClouds(java.lang.String r7, com.withings.library.authentication.login.Server r8, qm0.d<? super com.withings.library.authentication.api.account.CloudResponse> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.withings.library.authentication.api.account.RemoteAccountApi$getClouds$1
            if (r0 == 0) goto L13
            r0 = r9
            com.withings.library.authentication.api.account.RemoteAccountApi$getClouds$1 r0 = (com.withings.library.authentication.api.account.RemoteAccountApi$getClouds$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.api.account.RemoteAccountApi$getClouds$1 r0 = new com.withings.library.authentication.api.account.RemoteAccountApi$getClouds$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            nm0.l.b(r9)
            goto L86
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            nm0.l.b(r9)
            goto L65
        L36:
            nm0.l.b(r9)
            com.withings.library.authentication.api.httpclient.HttpClientRepository r9 = r6.httpClientRepository
            qk0.a r8 = r9.getHttpClient(r8)
            zk0.d r9 = new zk0.d
            r9.<init>()
            com.withings.library.authentication.api.account.RemoteAccountApi$getClouds$2$1 r2 = com.withings.library.authentication.api.account.RemoteAccountApi$getClouds$2$1.INSTANCE
            r9.o(r2)
            el0.z$a r2 = el0.z.f65720b
            el0.b0 r2 = el0.d0.a()
            java.lang.String r5 = "sessionid"
            r2.e(r5, r7)
            el0.z r7 = r2.n()
            bl0.g r7 = androidx.compose.material.n3.c(r7, r9, r9, r8)
            r0.label = r4
            java.lang.Object r9 = r7.b(r0)
            if (r9 != r1) goto L65
            return r1
        L65:
            bl0.c r9 = (bl0.c) r9
            rk0.a r7 = r9.b()
            java.lang.Class<com.withings.library.authentication.api.account.CloudResponse> r8 = com.withings.library.authentication.api.account.CloudResponse.class
            fn0.o r9 = kotlin.jvm.internal.q0.l(r8)
            java.lang.reflect.Type r2 = fn0.t.f(r9)
            fn0.d r8 = kotlin.jvm.internal.q0.b(r8)
            kl0.a r8 = androidx.camera.camera2.internal.s2.y(r2, r8, r9)
            r0.label = r3
            java.lang.Object r9 = r7.a(r8, r0)
            if (r9 != r1) goto L86
            return r1
        L86:
            if (r9 == 0) goto L8b
            com.withings.library.authentication.api.account.CloudResponse r9 = (com.withings.library.authentication.api.account.CloudResponse) r9
            return r9
        L8b:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r8 = "null cannot be cast to non-null type com.withings.library.authentication.api.account.CloudResponse"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.api.account.RemoteAccountApi.getClouds(java.lang.String, com.withings.library.authentication.login.Server, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    @Override // com.withings.library.authentication.api.account.AccountApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getRecoveryCode(java.lang.String r7, com.withings.library.authentication.login.Server r8, qm0.d<? super com.withings.library.authentication.api.account.RecoveryCodeResponse> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.withings.library.authentication.api.account.RemoteAccountApi$getRecoveryCode$1
            if (r0 == 0) goto L13
            r0 = r9
            com.withings.library.authentication.api.account.RemoteAccountApi$getRecoveryCode$1 r0 = (com.withings.library.authentication.api.account.RemoteAccountApi$getRecoveryCode$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.api.account.RemoteAccountApi$getRecoveryCode$1 r0 = new com.withings.library.authentication.api.account.RemoteAccountApi$getRecoveryCode$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            nm0.l.b(r9)
            goto L86
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            nm0.l.b(r9)
            goto L65
        L36:
            nm0.l.b(r9)
            com.withings.library.authentication.api.httpclient.HttpClientRepository r9 = r6.httpClientRepository
            qk0.a r8 = r9.getHttpClient(r8)
            zk0.d r9 = new zk0.d
            r9.<init>()
            com.withings.library.authentication.api.account.RemoteAccountApi$getRecoveryCode$2$1 r2 = com.withings.library.authentication.api.account.RemoteAccountApi$getRecoveryCode$2$1.INSTANCE
            r9.o(r2)
            el0.z$a r2 = el0.z.f65720b
            el0.b0 r2 = el0.d0.a()
            java.lang.String r5 = "sessionid"
            r2.e(r5, r7)
            el0.z r7 = r2.n()
            bl0.g r7 = androidx.compose.material.n3.c(r7, r9, r9, r8)
            r0.label = r4
            java.lang.Object r9 = r7.b(r0)
            if (r9 != r1) goto L65
            return r1
        L65:
            bl0.c r9 = (bl0.c) r9
            rk0.a r7 = r9.b()
            java.lang.Class<com.withings.library.authentication.api.account.RecoveryCodeResponse> r8 = com.withings.library.authentication.api.account.RecoveryCodeResponse.class
            fn0.o r9 = kotlin.jvm.internal.q0.l(r8)
            java.lang.reflect.Type r2 = fn0.t.f(r9)
            fn0.d r8 = kotlin.jvm.internal.q0.b(r8)
            kl0.a r8 = androidx.camera.camera2.internal.s2.y(r2, r8, r9)
            r0.label = r3
            java.lang.Object r9 = r7.a(r8, r0)
            if (r9 != r1) goto L86
            return r1
        L86:
            if (r9 == 0) goto L8b
            com.withings.library.authentication.api.account.RecoveryCodeResponse r9 = (com.withings.library.authentication.api.account.RecoveryCodeResponse) r9
            return r9
        L8b:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r8 = "null cannot be cast to non-null type com.withings.library.authentication.api.account.RecoveryCodeResponse"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.api.account.RemoteAccountApi.getRecoveryCode(java.lang.String, com.withings.library.authentication.login.Server, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0104 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x010f  */
    @Override // com.withings.library.authentication.api.account.AccountApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object loginWithExternalProviderAndIdToken(com.withings.library.authentication.login.ProviderType r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, com.withings.library.authentication.api.VirtualDeviceInformation r17, com.withings.library.authentication.login.Server r18, qm0.d<? super com.withings.library.authentication.api.auth.accountsession.AccountSession> r19) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.api.account.RemoteAccountApi.loginWithExternalProviderAndIdToken(com.withings.library.authentication.login.ProviderType, java.lang.String, java.lang.String, java.lang.String, com.withings.library.authentication.api.VirtualDeviceInformation, com.withings.library.authentication.login.Server, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0104 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x010f  */
    @Override // com.withings.library.authentication.api.account.AccountApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object loginWithExternalProviderAndProviderCode(com.withings.library.authentication.login.ProviderType r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, com.withings.library.authentication.api.VirtualDeviceInformation r17, com.withings.library.authentication.login.Server r18, qm0.d<? super com.withings.library.authentication.api.auth.accountsession.AccountSession> r19) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.api.account.RemoteAccountApi.loginWithExternalProviderAndProviderCode(com.withings.library.authentication.login.ProviderType, java.lang.String, java.lang.String, java.lang.String, com.withings.library.authentication.api.VirtualDeviceInformation, com.withings.library.authentication.login.Server, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f7  */
    @Override // com.withings.library.authentication.api.account.AccountApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object provideJWTToken(java.lang.String r7, java.lang.String r8, com.withings.library.authentication.api.VirtualDeviceInformation r9, com.withings.library.authentication.login.Server r10, qm0.d<? super com.withings.library.authentication.api.account.authsession.AuthSession> r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof com.withings.library.authentication.api.account.RemoteAccountApi$provideJWTToken$1
            if (r0 == 0) goto L13
            r0 = r11
            com.withings.library.authentication.api.account.RemoteAccountApi$provideJWTToken$1 r0 = (com.withings.library.authentication.api.account.RemoteAccountApi$provideJWTToken$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.api.account.RemoteAccountApi$provideJWTToken$1 r0 = new com.withings.library.authentication.api.account.RemoteAccountApi$provideJWTToken$1
            r0.<init>(r6, r11)
        L18:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            nm0.l.b(r11)
            goto Lec
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            nm0.l.b(r11)
            goto Lcb
        L38:
            nm0.l.b(r11)
            com.withings.library.authentication.api.httpclient.HttpClientRepository r11 = r6.httpClientRepository
            qk0.a r10 = r11.getHttpClient(r10)
            zk0.d r11 = new zk0.d
            r11.<init>()
            com.withings.library.authentication.api.account.RemoteAccountApi$provideJWTToken$2$1 r2 = com.withings.library.authentication.api.account.RemoteAccountApi$provideJWTToken$2$1.INSTANCE
            r11.o(r2)
            el0.z$a r2 = el0.z.f65720b
            el0.b0 r2 = el0.d0.a()
            java.lang.String r5 = "jwt"
            r2.e(r5, r7)
            java.lang.String r7 = "uuid"
            r2.e(r7, r8)
            com.withings.library.authentication.login.ProviderType$WITHINGS r7 = com.withings.library.authentication.login.ProviderType.WITHINGS.INSTANCE
            java.lang.String r7 = r7.getValue()
            java.lang.String r8 = "authprovider"
            r2.e(r8, r7)
            long r7 = com.withings.library.authentication.login.SessionKt.getSESSION_TIME_TO_LIVE()
            ep0.a$a r5 = ep0.a.f65838b
            kotlin.time.DurationUnit r5 = kotlin.time.DurationUnit.f78024d
            long r7 = ep0.a.q(r7, r5)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r8 = "duration"
            r2.e(r8, r7)
            java.lang.String r7 = r9.getModelName()
            java.lang.String r8 = "modelname"
            r2.e(r8, r7)
            java.lang.String r7 = "typename"
            java.lang.String r8 = r9.getTypeName()
            r2.e(r7, r8)
            java.lang.String r7 = "os"
            java.lang.String r8 = r9.getOs()
            r2.e(r7, r8)
            java.lang.String r7 = "apppfm"
            java.lang.String r8 = r9.getOs()
            r2.e(r7, r8)
            java.lang.String r7 = "appliver"
            java.lang.String r8 = r9.getAppVersion()
            r2.e(r7, r8)
            java.lang.String r7 = "appname"
            java.lang.String r8 = r9.getAppName()
            r2.e(r7, r8)
            java.lang.String r7 = "osversion"
            java.lang.String r8 = r9.getOsVersion()
            r2.e(r7, r8)
            el0.z r7 = r2.n()
            bl0.g r7 = androidx.compose.material.n3.c(r7, r11, r11, r10)
            r0.label = r4
            java.lang.Object r11 = r7.b(r0)
            if (r11 != r1) goto Lcb
            return r1
        Lcb:
            bl0.c r11 = (bl0.c) r11
            rk0.a r7 = r11.b()
            java.lang.Class<com.withings.library.authentication.api.account.authsession.RemoteAuthSession> r8 = com.withings.library.authentication.api.account.authsession.RemoteAuthSession.class
            fn0.o r9 = kotlin.jvm.internal.q0.l(r8)
            java.lang.reflect.Type r10 = fn0.t.f(r9)
            fn0.d r8 = kotlin.jvm.internal.q0.b(r8)
            kl0.a r8 = androidx.camera.camera2.internal.s2.y(r10, r8, r9)
            r0.label = r3
            java.lang.Object r11 = r7.a(r8, r0)
            if (r11 != r1) goto Lec
            return r1
        Lec:
            if (r11 == 0) goto Lf7
            com.withings.library.authentication.api.account.authsession.RemoteAuthSession r11 = (com.withings.library.authentication.api.account.authsession.RemoteAuthSession) r11
            com.withings.library.authentication.login.ProviderType$WITHINGS r7 = com.withings.library.authentication.login.ProviderType.WITHINGS.INSTANCE
            com.withings.library.authentication.api.account.authsession.AuthSession r7 = com.withings.library.authentication.api.account.authsession.RemoteAuthSessionKt.toAuthSession(r11, r7)
            return r7
        Lf7:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r8 = "null cannot be cast to non-null type com.withings.library.authentication.api.account.authsession.RemoteAuthSession"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.api.account.RemoteAccountApi.provideJWTToken(java.lang.String, java.lang.String, com.withings.library.authentication.api.VirtualDeviceInformation, com.withings.library.authentication.login.Server, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fc  */
    @Override // com.withings.library.authentication.api.account.AccountApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object provideShortCode(java.lang.String r7, java.lang.String r8, java.lang.String r9, com.withings.library.authentication.api.VirtualDeviceInformation r10, com.withings.library.authentication.login.Server r11, qm0.d<? super com.withings.library.authentication.api.account.authsession.AuthSession> r12) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.api.account.RemoteAccountApi.provideShortCode(java.lang.String, java.lang.String, java.lang.String, com.withings.library.authentication.api.VirtualDeviceInformation, com.withings.library.authentication.login.Server, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    @Override // com.withings.library.authentication.api.account.AccountApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object requestConfirmationCode(java.lang.String r7, com.withings.library.authentication.login.Server r8, qm0.d<? super com.withings.library.authentication.api.account.RequestConfirmationResponse> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.withings.library.authentication.api.account.RemoteAccountApi$requestConfirmationCode$1
            if (r0 == 0) goto L13
            r0 = r9
            com.withings.library.authentication.api.account.RemoteAccountApi$requestConfirmationCode$1 r0 = (com.withings.library.authentication.api.account.RemoteAccountApi$requestConfirmationCode$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.api.account.RemoteAccountApi$requestConfirmationCode$1 r0 = new com.withings.library.authentication.api.account.RemoteAccountApi$requestConfirmationCode$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            nm0.l.b(r9)
            goto L86
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            nm0.l.b(r9)
            goto L65
        L36:
            nm0.l.b(r9)
            com.withings.library.authentication.api.httpclient.HttpClientRepository r9 = r6.httpClientRepository
            qk0.a r8 = r9.getHttpClient(r8)
            zk0.d r9 = new zk0.d
            r9.<init>()
            com.withings.library.authentication.api.account.RemoteAccountApi$requestConfirmationCode$2$1 r2 = com.withings.library.authentication.api.account.RemoteAccountApi$requestConfirmationCode$2$1.INSTANCE
            r9.o(r2)
            el0.z$a r2 = el0.z.f65720b
            el0.b0 r2 = el0.d0.a()
            java.lang.String r5 = "sessionid"
            r2.e(r5, r7)
            el0.z r7 = r2.n()
            bl0.g r7 = androidx.compose.material.n3.c(r7, r9, r9, r8)
            r0.label = r4
            java.lang.Object r9 = r7.b(r0)
            if (r9 != r1) goto L65
            return r1
        L65:
            bl0.c r9 = (bl0.c) r9
            rk0.a r7 = r9.b()
            java.lang.Class<com.withings.library.authentication.api.account.RequestConfirmationResponse> r8 = com.withings.library.authentication.api.account.RequestConfirmationResponse.class
            fn0.o r9 = kotlin.jvm.internal.q0.l(r8)
            java.lang.reflect.Type r2 = fn0.t.f(r9)
            fn0.d r8 = kotlin.jvm.internal.q0.b(r8)
            kl0.a r8 = androidx.camera.camera2.internal.s2.y(r2, r8, r9)
            r0.label = r3
            java.lang.Object r9 = r7.a(r8, r0)
            if (r9 != r1) goto L86
            return r1
        L86:
            if (r9 == 0) goto L8b
            com.withings.library.authentication.api.account.RequestConfirmationResponse r9 = (com.withings.library.authentication.api.account.RequestConfirmationResponse) r9
            return r9
        L8b:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r8 = "null cannot be cast to non-null type com.withings.library.authentication.api.account.RequestConfirmationResponse"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.api.account.RemoteAccountApi.requestConfirmationCode(java.lang.String, com.withings.library.authentication.login.Server, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    @Override // com.withings.library.authentication.api.account.AccountApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object requestJwt(java.lang.String r7, int r8, com.withings.library.authentication.login.Server r9, qm0.d<? super com.withings.library.authentication.api.account.JwtResponse> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.withings.library.authentication.api.account.RemoteAccountApi$requestJwt$1
            if (r0 == 0) goto L13
            r0 = r10
            com.withings.library.authentication.api.account.RemoteAccountApi$requestJwt$1 r0 = (com.withings.library.authentication.api.account.RemoteAccountApi$requestJwt$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.api.account.RemoteAccountApi$requestJwt$1 r0 = new com.withings.library.authentication.api.account.RemoteAccountApi$requestJwt$1
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            nm0.l.b(r10)
            goto L8f
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            nm0.l.b(r10)
            goto L6e
        L36:
            nm0.l.b(r10)
            com.withings.library.authentication.api.httpclient.HttpClientRepository r10 = r6.httpClientRepository
            qk0.a r9 = r10.getHttpClient(r9)
            zk0.d r10 = new zk0.d
            r10.<init>()
            com.withings.library.authentication.api.account.RemoteAccountApi$requestJwt$2$1 r2 = com.withings.library.authentication.api.account.RemoteAccountApi$requestJwt$2$1.INSTANCE
            r10.o(r2)
            el0.z$a r2 = el0.z.f65720b
            el0.b0 r2 = el0.d0.a()
            java.lang.String r5 = "sessionid"
            r2.e(r5, r7)
            java.lang.String r7 = "platformid"
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r2.e(r7, r8)
            el0.z r7 = r2.n()
            bl0.g r7 = androidx.compose.material.n3.c(r7, r10, r10, r9)
            r0.label = r4
            java.lang.Object r10 = r7.b(r0)
            if (r10 != r1) goto L6e
            return r1
        L6e:
            bl0.c r10 = (bl0.c) r10
            rk0.a r7 = r10.b()
            java.lang.Class<com.withings.library.authentication.api.account.JwtResponse> r8 = com.withings.library.authentication.api.account.JwtResponse.class
            fn0.o r9 = kotlin.jvm.internal.q0.l(r8)
            java.lang.reflect.Type r10 = fn0.t.f(r9)
            fn0.d r8 = kotlin.jvm.internal.q0.b(r8)
            kl0.a r8 = androidx.camera.camera2.internal.s2.y(r10, r8, r9)
            r0.label = r3
            java.lang.Object r10 = r7.a(r8, r0)
            if (r10 != r1) goto L8f
            return r1
        L8f:
            if (r10 == 0) goto L94
            com.withings.library.authentication.api.account.JwtResponse r10 = (com.withings.library.authentication.api.account.JwtResponse) r10
            return r10
        L94:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r8 = "null cannot be cast to non-null type com.withings.library.authentication.api.account.JwtResponse"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.api.account.RemoteAccountApi.requestJwt(java.lang.String, int, com.withings.library.authentication.login.Server, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
    @Override // com.withings.library.authentication.api.account.AccountApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object requestNewPassword(java.lang.String r7, com.withings.library.authentication.login.Server r8, qm0.d<? super nm0.y> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.withings.library.authentication.api.account.RemoteAccountApi$requestNewPassword$1
            if (r0 == 0) goto L13
            r0 = r9
            com.withings.library.authentication.api.account.RemoteAccountApi$requestNewPassword$1 r0 = (com.withings.library.authentication.api.account.RemoteAccountApi$requestNewPassword$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.api.account.RemoteAccountApi$requestNewPassword$1 r0 = new com.withings.library.authentication.api.account.RemoteAccountApi$requestNewPassword$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            nm0.l.b(r9)
            goto L8d
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            nm0.l.b(r9)
            goto L6c
        L36:
            nm0.l.b(r9)
            com.withings.library.authentication.api.httpclient.HttpClientRepository r9 = r6.httpClientRepository
            qk0.a r8 = r9.getHttpClient(r8)
            zk0.d r9 = new zk0.d
            r9.<init>()
            com.withings.library.authentication.api.account.RemoteAccountApi$requestNewPassword$2$1 r2 = com.withings.library.authentication.api.account.RemoteAccountApi$requestNewPassword$2$1.INSTANCE
            r9.o(r2)
            el0.z$a r2 = el0.z.f65720b
            el0.b0 r2 = el0.d0.a()
            java.lang.String r5 = "email"
            r2.e(r5, r7)
            java.lang.String r7 = "type"
            java.lang.String r5 = "password"
            r2.e(r7, r5)
            el0.z r7 = r2.n()
            bl0.g r7 = androidx.compose.material.n3.c(r7, r9, r9, r8)
            r0.label = r4
            java.lang.Object r9 = r7.b(r0)
            if (r9 != r1) goto L6c
            return r1
        L6c:
            bl0.c r9 = (bl0.c) r9
            rk0.a r7 = r9.b()
            java.lang.Class<com.withings.library.authentication.api.StubResponse> r8 = com.withings.library.authentication.api.StubResponse.class
            fn0.o r9 = kotlin.jvm.internal.q0.l(r8)
            java.lang.reflect.Type r2 = fn0.t.f(r9)
            fn0.d r8 = kotlin.jvm.internal.q0.b(r8)
            kl0.a r8 = androidx.camera.camera2.internal.s2.y(r2, r8, r9)
            r0.label = r3
            java.lang.Object r9 = r7.a(r8, r0)
            if (r9 != r1) goto L8d
            return r1
        L8d:
            if (r9 == 0) goto L94
            com.withings.library.authentication.api.StubResponse r9 = (com.withings.library.authentication.api.StubResponse) r9
            nm0.y r7 = nm0.y.f85009a
            return r7
        L94:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r8 = "null cannot be cast to non-null type com.withings.library.authentication.api.StubResponse"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.api.account.RemoteAccountApi.requestNewPassword(java.lang.String, com.withings.library.authentication.login.Server, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a5  */
    @Override // com.withings.library.authentication.api.account.AccountApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object requestPartnerSession(java.lang.String r9, java.lang.String r10, com.withings.library.authentication.login.Server r11, qm0.d<? super com.withings.library.authentication.api.account.partnersession.PartnerSessionResponse> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.withings.library.authentication.api.account.RemoteAccountApi$requestPartnerSession$1
            if (r0 == 0) goto L13
            r0 = r12
            com.withings.library.authentication.api.account.RemoteAccountApi$requestPartnerSession$1 r0 = (com.withings.library.authentication.api.account.RemoteAccountApi$requestPartnerSession$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.api.account.RemoteAccountApi$requestPartnerSession$1 r0 = new com.withings.library.authentication.api.account.RemoteAccountApi$requestPartnerSession$1
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            nm0.l.b(r12)
            goto La0
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            nm0.l.b(r12)
            goto L7f
        L36:
            nm0.l.b(r12)
            long r5 = com.withings.library.authentication.login.SessionKt.getSESSION_TIME_TO_LIVE()
            ep0.a$a r12 = ep0.a.f65838b
            kotlin.time.DurationUnit r12 = kotlin.time.DurationUnit.f78024d
            long r5 = ep0.a.q(r5, r12)
            com.withings.library.authentication.api.httpclient.HttpClientRepository r12 = r8.httpClientRepository
            qk0.a r11 = r12.getHttpClient(r11)
            zk0.d r12 = new zk0.d
            r12.<init>()
            com.withings.library.authentication.api.account.RemoteAccountApi$requestPartnerSession$2$1 r2 = com.withings.library.authentication.api.account.RemoteAccountApi$requestPartnerSession$2$1.INSTANCE
            r12.o(r2)
            el0.z$a r2 = el0.z.f65720b
            el0.b0 r2 = el0.d0.a()
            java.lang.String r7 = "sessionid"
            r2.e(r7, r9)
            java.lang.String r9 = "uuid"
            r2.e(r9, r10)
            java.lang.String r9 = "duration"
            java.lang.String r10 = java.lang.String.valueOf(r5)
            r2.e(r9, r10)
            el0.z r9 = r2.n()
            bl0.g r9 = androidx.compose.material.n3.c(r9, r12, r12, r11)
            r0.label = r4
            java.lang.Object r12 = r9.b(r0)
            if (r12 != r1) goto L7f
            return r1
        L7f:
            bl0.c r12 = (bl0.c) r12
            rk0.a r9 = r12.b()
            java.lang.Class<com.withings.library.authentication.api.account.partnersession.PartnerSessionResponse> r10 = com.withings.library.authentication.api.account.partnersession.PartnerSessionResponse.class
            fn0.o r11 = kotlin.jvm.internal.q0.l(r10)
            java.lang.reflect.Type r12 = fn0.t.f(r11)
            fn0.d r10 = kotlin.jvm.internal.q0.b(r10)
            kl0.a r10 = androidx.camera.camera2.internal.s2.y(r12, r10, r11)
            r0.label = r3
            java.lang.Object r12 = r9.a(r10, r0)
            if (r12 != r1) goto La0
            return r1
        La0:
            if (r12 == 0) goto La5
            com.withings.library.authentication.api.account.partnersession.PartnerSessionResponse r12 = (com.withings.library.authentication.api.account.partnersession.PartnerSessionResponse) r12
            return r12
        La5:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            java.lang.String r10 = "null cannot be cast to non-null type com.withings.library.authentication.api.account.partnersession.PartnerSessionResponse"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.api.account.RemoteAccountApi.requestPartnerSession(java.lang.String, java.lang.String, com.withings.library.authentication.login.Server, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097  */
    @Override // com.withings.library.authentication.api.account.AccountApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object sendShortCode(java.lang.String r7, java.lang.String r8, java.lang.String r9, com.withings.library.authentication.login.Server r10, qm0.d<? super nm0.y> r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof com.withings.library.authentication.api.account.RemoteAccountApi$sendShortCode$1
            if (r0 == 0) goto L13
            r0 = r11
            com.withings.library.authentication.api.account.RemoteAccountApi$sendShortCode$1 r0 = (com.withings.library.authentication.api.account.RemoteAccountApi$sendShortCode$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.api.account.RemoteAccountApi$sendShortCode$1 r0 = new com.withings.library.authentication.api.account.RemoteAccountApi$sendShortCode$1
            r0.<init>(r6, r11)
        L18:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            nm0.l.b(r11)
            goto L90
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            nm0.l.b(r11)
            goto L6f
        L36:
            nm0.l.b(r11)
            com.withings.library.authentication.api.httpclient.HttpClientRepository r11 = r6.httpClientRepository
            qk0.a r10 = r11.getHttpClient(r10)
            zk0.d r11 = new zk0.d
            r11.<init>()
            com.withings.library.authentication.api.account.RemoteAccountApi$sendShortCode$2$1 r2 = com.withings.library.authentication.api.account.RemoteAccountApi$sendShortCode$2$1.INSTANCE
            r11.o(r2)
            el0.z$a r2 = el0.z.f65720b
            el0.b0 r2 = el0.d0.a()
            java.lang.String r5 = "email"
            r2.e(r5, r7)
            java.lang.String r7 = "lang"
            r2.e(r7, r8)
            java.lang.String r7 = "state"
            r2.e(r7, r9)
            el0.z r7 = r2.n()
            bl0.g r7 = androidx.compose.material.n3.c(r7, r11, r11, r10)
            r0.label = r4
            java.lang.Object r11 = r7.b(r0)
            if (r11 != r1) goto L6f
            return r1
        L6f:
            bl0.c r11 = (bl0.c) r11
            rk0.a r7 = r11.b()
            java.lang.Class<com.withings.library.authentication.api.StubResponse> r8 = com.withings.library.authentication.api.StubResponse.class
            fn0.o r9 = kotlin.jvm.internal.q0.l(r8)
            java.lang.reflect.Type r10 = fn0.t.f(r9)
            fn0.d r8 = kotlin.jvm.internal.q0.b(r8)
            kl0.a r8 = androidx.camera.camera2.internal.s2.y(r10, r8, r9)
            r0.label = r3
            java.lang.Object r11 = r7.a(r8, r0)
            if (r11 != r1) goto L90
            return r1
        L90:
            if (r11 == 0) goto L97
            com.withings.library.authentication.api.StubResponse r11 = (com.withings.library.authentication.api.StubResponse) r11
            nm0.y r7 = nm0.y.f85009a
            return r7
        L97:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r8 = "null cannot be cast to non-null type com.withings.library.authentication.api.StubResponse"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.api.account.RemoteAccountApi.sendShortCode(java.lang.String, java.lang.String, java.lang.String, com.withings.library.authentication.login.Server, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
    @Override // com.withings.library.authentication.api.account.AccountApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object setupPhoneAndRequestConfirmationCode(java.lang.String r7, java.lang.String r8, com.withings.library.authentication.login.Server r9, qm0.d<? super nm0.y> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof com.withings.library.authentication.api.account.RemoteAccountApi$setupPhoneAndRequestConfirmationCode$1
            if (r0 == 0) goto L13
            r0 = r10
            com.withings.library.authentication.api.account.RemoteAccountApi$setupPhoneAndRequestConfirmationCode$1 r0 = (com.withings.library.authentication.api.account.RemoteAccountApi$setupPhoneAndRequestConfirmationCode$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.api.account.RemoteAccountApi$setupPhoneAndRequestConfirmationCode$1 r0 = new com.withings.library.authentication.api.account.RemoteAccountApi$setupPhoneAndRequestConfirmationCode$1
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            nm0.l.b(r10)
            goto L8b
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            nm0.l.b(r10)
            goto L6a
        L36:
            nm0.l.b(r10)
            com.withings.library.authentication.api.httpclient.HttpClientRepository r10 = r6.httpClientRepository
            qk0.a r9 = r10.getHttpClient(r9)
            zk0.d r10 = new zk0.d
            r10.<init>()
            com.withings.library.authentication.api.account.RemoteAccountApi$setupPhoneAndRequestConfirmationCode$2$1 r2 = com.withings.library.authentication.api.account.RemoteAccountApi$setupPhoneAndRequestConfirmationCode$2$1.INSTANCE
            r10.o(r2)
            el0.z$a r2 = el0.z.f65720b
            el0.b0 r2 = el0.d0.a()
            java.lang.String r5 = "sessionid"
            r2.e(r5, r7)
            java.lang.String r7 = "phonenumber"
            r2.e(r7, r8)
            el0.z r7 = r2.n()
            bl0.g r7 = androidx.compose.material.n3.c(r7, r10, r10, r9)
            r0.label = r4
            java.lang.Object r10 = r7.b(r0)
            if (r10 != r1) goto L6a
            return r1
        L6a:
            bl0.c r10 = (bl0.c) r10
            rk0.a r7 = r10.b()
            java.lang.Class<com.withings.library.authentication.api.StubResponse> r8 = com.withings.library.authentication.api.StubResponse.class
            fn0.o r9 = kotlin.jvm.internal.q0.l(r8)
            java.lang.reflect.Type r10 = fn0.t.f(r9)
            fn0.d r8 = kotlin.jvm.internal.q0.b(r8)
            kl0.a r8 = androidx.camera.camera2.internal.s2.y(r10, r8, r9)
            r0.label = r3
            java.lang.Object r10 = r7.a(r8, r0)
            if (r10 != r1) goto L8b
            return r1
        L8b:
            if (r10 == 0) goto L92
            com.withings.library.authentication.api.StubResponse r10 = (com.withings.library.authentication.api.StubResponse) r10
            nm0.y r7 = nm0.y.f85009a
            return r7
        L92:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r8 = "null cannot be cast to non-null type com.withings.library.authentication.api.StubResponse"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.api.account.RemoteAccountApi.setupPhoneAndRequestConfirmationCode(java.lang.String, java.lang.String, com.withings.library.authentication.login.Server, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a4  */
    @Override // com.withings.library.authentication.api.account.AccountApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object updateAccountContext(java.lang.String r7, int r8, java.lang.String r9, int r10, com.withings.library.authentication.login.Server r11, qm0.d<? super nm0.y> r12) {
        /*
            r6 = this;
            boolean r0 = r12 instanceof com.withings.library.authentication.api.account.RemoteAccountApi$updateAccountContext$1
            if (r0 == 0) goto L13
            r0 = r12
            com.withings.library.authentication.api.account.RemoteAccountApi$updateAccountContext$1 r0 = (com.withings.library.authentication.api.account.RemoteAccountApi$updateAccountContext$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.library.authentication.api.account.RemoteAccountApi$updateAccountContext$1 r0 = new com.withings.library.authentication.api.account.RemoteAccountApi$updateAccountContext$1
            r0.<init>(r6, r12)
        L18:
            java.lang.Object r12 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            nm0.l.b(r12)
            goto L9d
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            nm0.l.b(r12)
            goto L7c
        L36:
            nm0.l.b(r12)
            com.withings.library.authentication.api.httpclient.HttpClientRepository r12 = r6.httpClientRepository
            qk0.a r11 = r12.getHttpClient(r11)
            zk0.d r12 = new zk0.d
            r12.<init>()
            com.withings.library.authentication.api.account.RemoteAccountApi$updateAccountContext$2$1 r2 = com.withings.library.authentication.api.account.RemoteAccountApi$updateAccountContext$2$1.INSTANCE
            r12.o(r2)
            el0.z$a r2 = el0.z.f65720b
            el0.b0 r2 = el0.d0.a()
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r5 = "applitype"
            r2.e(r5, r10)
            java.lang.String r10 = "context"
            r2.e(r10, r9)
            java.lang.String r9 = "sessionid"
            r2.e(r9, r7)
            java.lang.String r7 = "accountid"
            java.lang.String r8 = java.lang.String.valueOf(r8)
            r2.e(r7, r8)
            el0.z r7 = r2.n()
            bl0.g r7 = androidx.compose.material.n3.c(r7, r12, r12, r11)
            r0.label = r4
            java.lang.Object r12 = r7.b(r0)
            if (r12 != r1) goto L7c
            return r1
        L7c:
            bl0.c r12 = (bl0.c) r12
            rk0.a r7 = r12.b()
            java.lang.Class<com.withings.library.authentication.api.StubResponse> r8 = com.withings.library.authentication.api.StubResponse.class
            fn0.o r9 = kotlin.jvm.internal.q0.l(r8)
            java.lang.reflect.Type r10 = fn0.t.f(r9)
            fn0.d r8 = kotlin.jvm.internal.q0.b(r8)
            kl0.a r8 = androidx.camera.camera2.internal.s2.y(r10, r8, r9)
            r0.label = r3
            java.lang.Object r12 = r7.a(r8, r0)
            if (r12 != r1) goto L9d
            return r1
        L9d:
            if (r12 == 0) goto La4
            com.withings.library.authentication.api.StubResponse r12 = (com.withings.library.authentication.api.StubResponse) r12
            nm0.y r7 = nm0.y.f85009a
            return r7
        La4:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r8 = "null cannot be cast to non-null type com.withings.library.authentication.api.StubResponse"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.authentication.api.account.RemoteAccountApi.updateAccountContext(java.lang.String, int, java.lang.String, int, com.withings.library.authentication.login.Server, qm0.d):java.lang.Object");
    }
}
