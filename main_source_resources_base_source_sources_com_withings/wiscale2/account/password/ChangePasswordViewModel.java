package com.withings.wiscale2.account.password;

import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import androidx.lifecycle.k0;
import com.withings.account.core.model.Account;
import com.withings.account.network.ws.AccountRemoteRepository;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.network.android.PasswordHasNoDigitException;
import com.withings.network.android.PasswordHasNoLowercaseException;
import com.withings.network.android.PasswordHasNoUppercaseException;
import com.withings.network.android.PasswordTooLongException;
import com.withings.network.android.PasswordTooShortException;
import com.withings.webservices.legacy.common.exception.WrongOldPasswordException;
import com.withings.wiscale2.C1987R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import nm0.k;
import nm0.y;
import sf.c;
/* compiled from: PasswordEditionFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/account/password/ChangePasswordViewModel;", "Landroidx/lifecycle/g1;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ChangePasswordViewModel extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final AccountRemoteRepository f48095a;

    /* renamed from: b  reason: collision with root package name */
    private final vf.c f48096b;

    /* renamed from: c  reason: collision with root package name */
    private final k0<Integer> f48097c;

    /* renamed from: d  reason: collision with root package name */
    private final k0<Integer> f48098d;

    /* renamed from: e  reason: collision with root package name */
    private final k0<Integer> f48099e;

    /* renamed from: f  reason: collision with root package name */
    private final k0<Boolean> f48100f;

    /* renamed from: g  reason: collision with root package name */
    private final k0<Boolean> f48101g;

    /* renamed from: h  reason: collision with root package name */
    private final k0<String> f48102h;

    /* renamed from: i  reason: collision with root package name */
    private final k0<Boolean> f48103i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PasswordEditionFragment.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.account.password.ChangePasswordViewModel$changePassword$1", f = "PasswordEditionFragment.kt", l = {ConstantsWs.WS_STATUS_NOPRIMARYUSER}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        ChangePasswordViewModel f48104a;

        /* renamed from: b  reason: collision with root package name */
        String f48105b;

        /* renamed from: c  reason: collision with root package name */
        int f48106c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f48107d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangePasswordViewModel f48108e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f48109f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, ChangePasswordViewModel changePasswordViewModel, String str2, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f48107d = str;
            this.f48108e = changePasswordViewModel;
            this.f48109f = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f48107d, this.f48108e, this.f48109f, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object a11;
            ChangePasswordViewModel changePasswordViewModel;
            String str;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f48106c;
            ChangePasswordViewModel changePasswordViewModel2 = this.f48108e;
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        str = this.f48105b;
                        changePasswordViewModel = this.f48104a;
                        nm0.l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    nm0.l.b(obj);
                    String d11 = androidx.camera.core.impl.utils.k.d(this.f48107d);
                    String str2 = this.f48109f;
                    AccountRemoteRepository accountRemoteRepository = changePasswordViewModel2.f48095a;
                    this.f48104a = changePasswordViewModel2;
                    this.f48105b = str2;
                    this.f48106c = 1;
                    if (AccountRemoteRepository.changePassword$default(accountRemoteRepository, d11, str2, null, this, 4, null) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    changePasswordViewModel = changePasswordViewModel2;
                    str = str2;
                }
                Account h11 = changePasswordViewModel.f48096b.h();
                if (h11.i().d() instanceof c.C1619c) {
                    changePasswordViewModel.f48096b.n(Account.a(h11, null, false, null, null, null, Account.b.a(h11.i(), 0L, new c.C1619c(str, h11.i().d().b()), false, null, 111), false, false, false, 479));
                }
                a11 = y.f85009a;
            } catch (Throwable th2) {
                a11 = nm0.l.a(th2);
            }
            if (!(a11 instanceof k.a)) {
                y yVar = (y) a11;
                changePasswordViewModel2.t0().setValue(Boolean.FALSE);
                changePasswordViewModel2.r0().setValue(Boolean.TRUE);
            }
            Throwable b10 = nm0.k.b(a11);
            if (b10 != null) {
                changePasswordViewModel2.t0().setValue(Boolean.FALSE);
                if (b10 instanceof WrongOldPasswordException) {
                    changePasswordViewModel2.q0().setValue(new Integer((int) C1987R.string._INCORRECT_OLD_PASSWORD_));
                } else if (b10 instanceof PasswordTooShortException) {
                    changePasswordViewModel2.p0().setValue(new Integer((int) C1987R.string.passwordUpdate_passwordTooShort));
                } else if (b10 instanceof PasswordTooLongException) {
                    changePasswordViewModel2.p0().setValue(new Integer((int) C1987R.string.account_password_error_tooLong));
                } else if ((b10 instanceof PasswordHasNoUppercaseException) || (b10 instanceof PasswordHasNoLowercaseException) || (b10 instanceof PasswordHasNoDigitException)) {
                    changePasswordViewModel2.p0().setValue(new Integer((int) C1987R.string.passwordUpdate_passwordTooWeak));
                } else {
                    changePasswordViewModel2.j0().setValue(b10.getMessage());
                }
            }
            return y.f85009a;
        }
    }

    @Inject
    public ChangePasswordViewModel(AccountRemoteRepository accountRemoteRepository, vf.c accountManager) {
        u.j(accountRemoteRepository, "accountRemoteRepository");
        u.j(accountManager, "accountManager");
        this.f48095a = accountRemoteRepository;
        this.f48096b = accountManager;
        this.f48097c = new k0<>();
        this.f48098d = new k0<>();
        this.f48099e = new k0<>();
        this.f48100f = new k0<>();
        this.f48101g = new k0<>();
        this.f48102h = new k0<>();
        this.f48103i = new k0<>();
    }

    public final void i0(String old, String str, String confirm) {
        Integer value;
        Integer value2;
        u.j(old, "old");
        u.j(str, "new");
        u.j(confirm, "confirm");
        k0<Integer> k0Var = this.f48097c;
        k0Var.setValue(0);
        k0<Integer> k0Var2 = this.f48098d;
        k0Var2.setValue(0);
        k0<Integer> k0Var3 = this.f48099e;
        k0Var3.setValue(0);
        this.f48102h.setValue(null);
        if (old.length() == 0) {
            k0Var.setValue(Integer.valueOf((int) C1987R.string._LOGIN_EMPTY_PASSWORD_));
        }
        if (str.length() == 0) {
            k0Var2.setValue(Integer.valueOf((int) C1987R.string._LOGIN_EMPTY_PASSWORD_));
        } else if (str.length() < 8) {
            k0Var2.setValue(Integer.valueOf((int) C1987R.string._AC_PASSWORD_TOO_SHORT_));
        }
        if (confirm.length() == 0) {
            k0Var3.setValue(Integer.valueOf((int) C1987R.string._LOGIN_EMPTY_PASSWORD_));
        } else if (confirm.length() < 8) {
            k0Var3.setValue(Integer.valueOf((int) C1987R.string._AC_PASSWORD_TOO_SHORT_));
        } else if (!u.e(confirm, str)) {
            k0Var3.setValue(Integer.valueOf((int) C1987R.string._AC_PASSWORDS_DO_NOT_MATCH_));
        }
        Integer value3 = k0Var.getValue();
        if (value3 != null && value3.intValue() == 0 && (value = k0Var2.getValue()) != null && value.intValue() == 0 && (value2 = k0Var3.getValue()) != null && value2.intValue() == 0) {
            this.f48100f.setValue(Boolean.TRUE);
            BuildersKt__Builders_commonKt.launch$default(h1.a(this), Dispatchers.getIO(), null, new a(old, this, str, null), 2, null);
        }
    }

    public final k0<String> j0() {
        return this.f48102h;
    }

    public final k0<Integer> k0() {
        return this.f48099e;
    }

    public final k0<Boolean> m0() {
        return this.f48103i;
    }

    public final k0<Integer> p0() {
        return this.f48098d;
    }

    public final k0<Integer> q0() {
        return this.f48097c;
    }

    public final k0<Boolean> r0() {
        return this.f48101g;
    }

    public final k0<Boolean> t0() {
        return this.f48100f;
    }
}
