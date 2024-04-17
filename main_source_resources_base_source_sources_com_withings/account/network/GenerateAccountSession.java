package com.withings.account.network;

import com.withings.account.network.ws.SessionRemoteRepository;
import com.withings.webservices.legacy.withings.model.session.AccountSession;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.u;
import qm0.d;
import sf.c;
/* compiled from: GenerateAccountSession.kt */
/* loaded from: classes3.dex */
public final class GenerateAccountSession {

    /* renamed from: a  reason: collision with root package name */
    private final SessionRemoteRepository f30983a;

    /* compiled from: GenerateAccountSession.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/withings/account/network/GenerateAccountSession$AccountAuthenticationException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "AuthFailed", "Deactivated", "PasswordExpired", "Require2Fa", "Lcom/withings/account/network/GenerateAccountSession$AccountAuthenticationException$AuthFailed;", "Lcom/withings/account/network/GenerateAccountSession$AccountAuthenticationException$Deactivated;", "Lcom/withings/account/network/GenerateAccountSession$AccountAuthenticationException$PasswordExpired;", "Lcom/withings/account/network/GenerateAccountSession$AccountAuthenticationException$Require2Fa;", "android_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static abstract class AccountAuthenticationException extends Exception {

        /* compiled from: GenerateAccountSession.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/account/network/GenerateAccountSession$AccountAuthenticationException$AuthFailed;", "Lcom/withings/account/network/GenerateAccountSession$AccountAuthenticationException;", "android_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes3.dex */
        public static final class AuthFailed extends AccountAuthenticationException {

            /* renamed from: a  reason: collision with root package name */
            private final Exception f30984a;

            public AuthFailed(Exception exc) {
                super(exc.getMessage());
                this.f30984a = exc;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof AuthFailed) && u.e(this.f30984a, ((AuthFailed) obj).f30984a)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return this.f30984a.hashCode();
            }

            @Override // java.lang.Throwable
            public final String toString() {
                return "AuthFailed(exception=" + this.f30984a + ")";
            }
        }

        /* compiled from: GenerateAccountSession.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/account/network/GenerateAccountSession$AccountAuthenticationException$Deactivated;", "Lcom/withings/account/network/GenerateAccountSession$AccountAuthenticationException;", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes3.dex */
        public static final class Deactivated extends AccountAuthenticationException {

            /* renamed from: a  reason: collision with root package name */
            public static final Deactivated f30985a = new Deactivated();

            private Deactivated() {
                super("The account is deactivated, need to log out");
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Deactivated)) {
                    return false;
                }
                Deactivated deactivated = (Deactivated) obj;
                return true;
            }

            public final int hashCode() {
                return -72922031;
            }

            @Override // java.lang.Throwable
            public final String toString() {
                return "Deactivated";
            }
        }

        /* compiled from: GenerateAccountSession.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/account/network/GenerateAccountSession$AccountAuthenticationException$PasswordExpired;", "Lcom/withings/account/network/GenerateAccountSession$AccountAuthenticationException;", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes3.dex */
        public static final class PasswordExpired extends AccountAuthenticationException {

            /* renamed from: a  reason: collision with root package name */
            public static final PasswordExpired f30986a = new PasswordExpired();

            private PasswordExpired() {
                super("The password is expired, need to change it");
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PasswordExpired)) {
                    return false;
                }
                PasswordExpired passwordExpired = (PasswordExpired) obj;
                return true;
            }

            public final int hashCode() {
                return -1129077397;
            }

            @Override // java.lang.Throwable
            public final String toString() {
                return "PasswordExpired";
            }
        }

        /* compiled from: GenerateAccountSession.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/account/network/GenerateAccountSession$AccountAuthenticationException$Require2Fa;", "Lcom/withings/account/network/GenerateAccountSession$AccountAuthenticationException;", "android_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes3.dex */
        public static final class Require2Fa extends AccountAuthenticationException {

            /* renamed from: a  reason: collision with root package name */
            private final a f30987a;

            public Require2Fa(a aVar) {
                super("Session is not verified, calls will fail");
                this.f30987a = aVar;
            }

            public final a a() {
                return this.f30987a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof Require2Fa) && u.e(this.f30987a, ((Require2Fa) obj).f30987a)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return this.f30987a.hashCode();
            }

            @Override // java.lang.Throwable
            public final String toString() {
                return "Require2Fa(result=" + this.f30987a + ")";
            }
        }
    }

    /* compiled from: GenerateAccountSession.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final c f30988a;

        /* renamed from: b  reason: collision with root package name */
        private final AccountSession f30989b;

        public a(c cVar, AccountSession accountSession) {
            this.f30988a = cVar;
            this.f30989b = accountSession;
        }

        public final AccountSession a() {
            return this.f30989b;
        }

        public final c b() {
            return this.f30988a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (u.e(this.f30988a, aVar.f30988a) && u.e(this.f30989b, aVar.f30989b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            c cVar = this.f30988a;
            if (cVar == null) {
                hashCode = 0;
            } else {
                hashCode = cVar.hashCode();
            }
            return this.f30989b.hashCode() + (hashCode * 31);
        }

        public final String toString() {
            return "Result(newAuthentication=" + this.f30988a + ", accountSession=" + this.f30989b + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GenerateAccountSession.kt */
    @e(c = "com.withings.account.network.GenerateAccountSession", f = "GenerateAccountSession.kt", l = {24}, m = "generate")
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        c f30990a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f30991b;

        /* renamed from: d  reason: collision with root package name */
        int f30993d;

        b(d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f30991b = obj;
            this.f30993d |= Integer.MIN_VALUE;
            return GenerateAccountSession.this.a(null, null, null, this);
        }
    }

    @Inject
    public GenerateAccountSession(SessionRemoteRepository sessionRemoteRepository) {
        u.j(sessionRemoteRepository, "sessionRemoteRepository");
        this.f30983a = sessionRemoteRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r11, com.withings.account.core.model.Account.b r12, java.lang.String r13, qm0.d<? super com.withings.account.network.GenerateAccountSession.a> r14) throws com.withings.account.network.GenerateAccountSession.AccountAuthenticationException {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.withings.account.network.GenerateAccountSession.b
            if (r0 == 0) goto L13
            r0 = r14
            com.withings.account.network.GenerateAccountSession$b r0 = (com.withings.account.network.GenerateAccountSession.b) r0
            int r1 = r0.f30993d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30993d = r1
            goto L18
        L13:
            com.withings.account.network.GenerateAccountSession$b r0 = new com.withings.account.network.GenerateAccountSession$b
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f30991b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f30993d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            sf.c r11 = r0.f30990a
            nm0.l.b(r14)
            goto L58
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            nm0.l.b(r14)
            com.withings.account.network.ws.SessionRemoteRepository r14 = r10.f30983a
            com.withings.account.network.ws.SessionRemoteRepository r6 = r14.withSyncContext(r13)
            sf.c r12 = r12.d()
            r0.f30990a = r12
            r0.f30993d = r3
            kotlinx.coroutines.CoroutineDispatcher r13 = kotlinx.coroutines.Dispatchers.getIO()
            com.withings.account.network.a r14 = new com.withings.account.network.a
            r9 = 0
            r4 = r14
            r5 = r12
            r7 = r11
            r8 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.Object r14 = kotlinx.coroutines.BuildersKt.withContext(r13, r14, r0)
            if (r14 != r1) goto L57
            return r1
        L57:
            r11 = r12
        L58:
            com.withings.webservices.legacy.withings.model.session.AccountSession r14 = (com.withings.webservices.legacy.withings.model.session.AccountSession) r14
            java.lang.String r12 = r14.mProviderToken
            if (r12 == 0) goto La0
            java.lang.String r13 = r14.mAuthToken
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.u.j(r11, r0)
            boolean r0 = r11 instanceof sf.c.b.C1618b
            if (r0 == 0) goto L73
            sf.c$b$b r0 = new sf.c$b$b
            java.lang.String r11 = r11.b()
            r0.<init>(r13, r12, r11)
            goto La1
        L73:
            boolean r0 = r11 instanceof sf.c.b.a
            if (r0 == 0) goto L81
            sf.c$b$a r0 = new sf.c$b$a
            java.lang.String r11 = r11.b()
            r0.<init>(r13, r12, r11)
            goto La1
        L81:
            boolean r0 = r11 instanceof sf.c.C1619c
            if (r0 == 0) goto L8f
            sf.c$b$b r0 = new sf.c$b$b
            java.lang.String r11 = r11.b()
            r0.<init>(r13, r12, r11)
            goto La1
        L8f:
            boolean r0 = r11 instanceof sf.c.a
            if (r0 == 0) goto L9a
            sf.c$a r11 = (sf.c.a) r11
            sf.c$a r0 = sf.c.a.c(r11, r13, r12)
            goto La1
        L9a:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        La0:
            r0 = 0
        La1:
            com.withings.account.network.GenerateAccountSession$a r11 = new com.withings.account.network.GenerateAccountSession$a
            r11.<init>(r0, r14)
            boolean r12 = r14.isSecureSessionRequired()
            if (r12 == 0) goto Lb9
            boolean r12 = r14.isSecure()
            if (r12 == 0) goto Lb3
            goto Lb9
        Lb3:
            com.withings.account.network.GenerateAccountSession$AccountAuthenticationException$Require2Fa r12 = new com.withings.account.network.GenerateAccountSession$AccountAuthenticationException$Require2Fa
            r12.<init>(r11)
            throw r12
        Lb9:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.account.network.GenerateAccountSession.a(java.lang.String, com.withings.account.core.model.Account$b, java.lang.String, qm0.d):java.lang.Object");
    }
}
