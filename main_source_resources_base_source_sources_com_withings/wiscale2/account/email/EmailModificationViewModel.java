package com.withings.wiscale2.account.email;

import android.content.Context;
import android.util.Patterns;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.e1;
import androidx.lifecycle.g1;
import androidx.lifecycle.h0;
import androidx.lifecycle.h1;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.withings.account.core.model.Account;
import com.withings.account.network.ws.AccountRemoteRepository;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import nm0.k;
import nm0.o;
import nm0.y;
import xw.p;
/* compiled from: EmailModificationActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/account/email/EmailModificationViewModel;", "Landroidx/lifecycle/g1;", "a", com.huawei.hms.feature.dynamic.e.b.f28627a, "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class EmailModificationViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f48038a;

    /* renamed from: b  reason: collision with root package name */
    private final vf.c f48039b;

    /* renamed from: c  reason: collision with root package name */
    private final lg.a f48040c;

    /* renamed from: d  reason: collision with root package name */
    private final t00.d f48041d;

    /* renamed from: e  reason: collision with root package name */
    private final AccountRemoteRepository f48042e;

    /* renamed from: f  reason: collision with root package name */
    private final k0<Long> f48043f;

    /* renamed from: g  reason: collision with root package name */
    private final j0 f48044g;

    /* renamed from: h  reason: collision with root package name */
    private final j0 f48045h;

    /* renamed from: i  reason: collision with root package name */
    private final androidx.lifecycle.f f48046i;

    /* renamed from: j  reason: collision with root package name */
    private final p<String, a, nm0.j<String, a>> f48047j;

    /* renamed from: k  reason: collision with root package name */
    private final k0<o<String, String, String>> f48048k;

    /* renamed from: l  reason: collision with root package name */
    private final k0<b> f48049l;

    /* renamed from: m  reason: collision with root package name */
    private final k0<Integer> f48050m;

    /* renamed from: n  reason: collision with root package name */
    private final k0<Boolean> f48051n;

    /* compiled from: EmailModificationActivity.kt */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f48052a;

        /* renamed from: b  reason: collision with root package name */
        private final String f48053b;

        /* renamed from: c  reason: collision with root package name */
        private final String f48054c;

        /* renamed from: d  reason: collision with root package name */
        private final int f48055d;

        public a(int i11, String str, String str2, boolean z5) {
            this.f48052a = z5;
            this.f48053b = str;
            this.f48054c = str2;
            this.f48055d = i11;
        }

        public final String a() {
            return this.f48053b;
        }

        public final String b() {
            return this.f48054c;
        }

        public final boolean c() {
            return this.f48052a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f48052a == aVar.f48052a && u.e(this.f48053b, aVar.f48053b) && u.e(this.f48054c, aVar.f48054c) && this.f48055d == aVar.f48055d) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int c11 = defpackage.d.c(this.f48053b, Boolean.hashCode(this.f48052a) * 31, 31);
            String str = this.f48054c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return Integer.hashCode(this.f48055d) + ((c11 + hashCode) * 31);
        }

        public final String toString() {
            return "EmailStatus(isValidated=" + this.f48052a + ", emailStatus=" + this.f48053b + ", requestedEmail=" + this.f48054c + ", emailStatusStyle=" + this.f48055d + ")";
        }
    }

    /* compiled from: EmailModificationActivity.kt */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: b  reason: collision with root package name */
        private final int f48057b;

        /* renamed from: a  reason: collision with root package name */
        private final int f48056a = C1987R.string.emailChange_accountNotValidatedEmailSentTitle;

        /* renamed from: c  reason: collision with root package name */
        private final int f48058c = C1987R.string._OK_;

        public b(int i11) {
            this.f48057b = i11;
        }

        public final int a() {
            return this.f48058c;
        }

        public final int b() {
            return this.f48057b;
        }

        public final int c() {
            return this.f48056a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f48056a == bVar.f48056a && this.f48057b == bVar.f48057b && this.f48058c == bVar.f48058c) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f48058c) + androidx.appcompat.app.h.a(this.f48057b, Integer.hashCode(this.f48056a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("EmailValidationResponse(titleResId=");
            sb2.append(this.f48056a);
            sb2.append(", messageResId=");
            sb2.append(this.f48057b);
            sb2.append(", buttonResId=");
            return androidx.camera.camera2.internal.e.c(sb2, this.f48058c, ")");
        }
    }

    /* compiled from: EmailModificationActivity.kt */
    /* loaded from: classes4.dex */
    static final class c extends w implements ym0.l<Long, LiveData<Account>> {
        c() {
            super(1);
        }

        @Override // ym0.l
        public final LiveData<Account> invoke(Long l5) {
            return androidx.lifecycle.h.a(Dispatchers.getIO(), new k(EmailModificationViewModel.this, null), 2);
        }
    }

    /* compiled from: EmailModificationActivity.kt */
    /* loaded from: classes4.dex */
    static final class d extends w implements ym0.l<Account, a> {
        d() {
            super(1);
        }

        @Override // ym0.l
        public final a invoke(Account account) {
            Account account2 = account;
            u.j(account2, "account");
            return EmailModificationViewModel.k0(EmailModificationViewModel.this, account2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EmailModificationActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.account.email.EmailModificationViewModel$resendEmailValidation$1", f = "EmailModificationActivity.kt", l = {272}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f48061a;

        e(qm0.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new e(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((e) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object a11;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f48061a;
            EmailModificationViewModel emailModificationViewModel = EmailModificationViewModel.this;
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        nm0.l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    nm0.l.b(obj);
                    AccountRemoteRepository accountRemoteRepository = emailModificationViewModel.f48042e;
                    this.f48061a = 1;
                    if (accountRemoteRepository.requestEmailValidation(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                a11 = y.f85009a;
            } catch (Throwable th2) {
                a11 = nm0.l.a(th2);
            }
            if (!(a11 instanceof k.a)) {
                y yVar = (y) a11;
                emailModificationViewModel.A0().postValue(Boolean.FALSE);
                emailModificationViewModel.y0().postValue(new b(C1987R.string.emailChange_accountNotValidatedEmailSentMessage));
            }
            if (nm0.k.b(a11) != null) {
                emailModificationViewModel.A0().postValue(Boolean.FALSE);
                emailModificationViewModel.y0().postValue(new b(C1987R.string._ERROR_CONNECTION_TIMEOUT_));
            }
            return y.f85009a;
        }
    }

    /* compiled from: EmailModificationActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.account.email.EmailModificationViewModel$userEmailLiveData$1", f = "EmailModificationActivity.kt", l = {ConstantsWs.WS_STATUS_NODATAFOUND}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class f extends kotlin.coroutines.jvm.internal.i implements ym0.p<h0<String>, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f48063a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f48064b;

        f(qm0.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            f fVar = new f(dVar);
            fVar.f48064b = obj;
            return fVar;
        }

        @Override // ym0.p
        public final Object invoke(h0<String> h0Var, qm0.d<? super y> dVar) {
            return ((f) create(h0Var, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f48063a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                String b10 = EmailModificationViewModel.this.f48039b.h().b();
                this.f48063a = 1;
                if (((h0) this.f48064b).emit(b10, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    @Inject
    public EmailModificationViewModel(Context context, vf.c accountManager, lg.a aVar, t00.d networkSyncManager, AccountRemoteRepository accountRemoteRepository) {
        u.j(accountManager, "accountManager");
        u.j(networkSyncManager, "networkSyncManager");
        u.j(accountRemoteRepository, "accountRemoteRepository");
        this.f48038a = context;
        this.f48039b = accountManager;
        this.f48040c = aVar;
        this.f48041d = networkSyncManager;
        this.f48042e = accountRemoteRepository.withSyncContext("view_email_modification");
        k0<Long> b10 = xw.d.b(Long.valueOf(System.currentTimeMillis()));
        this.f48043f = b10;
        j0 c11 = e1.c(b10, new c());
        this.f48044g = c11;
        j0 b11 = e1.b(c11, new d());
        this.f48045h = b11;
        androidx.lifecycle.f a11 = androidx.lifecycle.h.a(Dispatchers.getIO(), new f(null), 2);
        this.f48046i = a11;
        this.f48047j = xw.a.b(new nm0.j(a11, b11));
        this.f48048k = new k0<>();
        this.f48049l = new k0<>();
        this.f48050m = new k0<>();
        this.f48051n = new k0<>();
    }

    public static final a k0(EmailModificationViewModel emailModificationViewModel, Account account) {
        emailModificationViewModel.getClass();
        Account.b.a f11 = account.i().f();
        boolean z5 = f11 instanceof Account.b.a.C0405b;
        Context context = emailModificationViewModel.f48038a;
        if (z5) {
            String string = context.getString(C1987R.string.emailChange_accountPending);
            u.i(string, "getString(...)");
            return new a(C1987R.style.body1, string, ((Account.b.a.C0405b) f11).a(), false);
        } else if ((f11 instanceof Account.b.a.d) || (f11 instanceof Account.b.a.C0404a)) {
            String string2 = context.getString(C1987R.string.emailChange_accountValidated);
            u.i(string2, "getString(...)");
            return new a(C1987R.style.body1, string2, null, true);
        } else if (f11 instanceof Account.b.a.c) {
            String string3 = context.getString(C1987R.string.emailChange_accountNotValidated);
            u.i(string3, "getString(...)");
            return new a(C1987R.style.error, string3, account.b(), false);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final k0<Boolean> A0() {
        return this.f48051n;
    }

    public final p<String, a, nm0.j<String, a>> B0() {
        return this.f48047j;
    }

    public final androidx.lifecycle.f F0() {
        return this.f48046i;
    }

    public final void G0() {
        this.f48051n.postValue(Boolean.TRUE);
        BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new e(null), 2, null);
    }

    public final void q0(String currentEmail, String newEmail, String confirmationEmail) {
        String str;
        String string;
        boolean z5;
        u.j(currentEmail, "currentEmail");
        u.j(newEmail, "newEmail");
        u.j(confirmationEmail, "confirmationEmail");
        int length = newEmail.length();
        Context context = this.f48038a;
        if (length == 0) {
            str = context.getString(C1987R.string._LOGIN_EMPTY_EMAIL_);
        } else if (!Patterns.EMAIL_ADDRESS.matcher(newEmail).matches()) {
            str = context.getString(C1987R.string._LOGIN_INVALID_EMAIL_);
        } else if (!u.e(newEmail, confirmationEmail)) {
            str = context.getString(C1987R.string.emailChange_differentFields);
        } else if (u.e(newEmail, currentEmail)) {
            str = context.getString(C1987R.string.emailChange_isNotDifferent);
        } else {
            str = null;
        }
        if (str == null) {
            if (confirmationEmail.length() == 0) {
                string = context.getString(C1987R.string._LOGIN_EMPTY_EMAIL_);
            } else if (!Patterns.EMAIL_ADDRESS.matcher(confirmationEmail).matches()) {
                string = context.getString(C1987R.string._LOGIN_INVALID_EMAIL_);
            }
            k0<Boolean> k0Var = this.f48051n;
            if (str == null && string != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            k0Var.postValue(Boolean.valueOf(z5));
            this.f48048k.postValue(new o<>(str, string, newEmail));
            if (str != null && string == null) {
                BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new m(this, newEmail, null), 2, null);
                return;
            }
        }
        string = null;
        k0<Boolean> k0Var2 = this.f48051n;
        if (str == null) {
        }
        z5 = false;
        k0Var2.postValue(Boolean.valueOf(z5));
        this.f48048k.postValue(new o<>(str, string, newEmail));
        if (str != null) {
        }
    }

    public final j0 r0() {
        return this.f48045h;
    }

    public final k0<Integer> t0() {
        return this.f48050m;
    }

    public final k0<b> y0() {
        return this.f48049l;
    }

    public final k0<o<String, String, String>> z0() {
        return this.f48048k;
    }
}
