package com.withings.wiscale2.account.password;

import com.withings.account.network.ws.AccountRemoteRepository;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import nm0.k;
import nm0.y;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PasswordEditionFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.account.password.ChangePasswordViewModel$sendPasswordLink$1", f = "PasswordEditionFragment.kt", l = {ConstantsWs.WS_STATUS_PUSHERROR}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f48134a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ChangePasswordViewModel f48135b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ChangePasswordViewModel changePasswordViewModel, qm0.d<? super a> dVar) {
        super(2, dVar);
        this.f48135b = changePasswordViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new a(this.f48135b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f48134a;
        ChangePasswordViewModel changePasswordViewModel = this.f48135b;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                String b10 = changePasswordViewModel.f48096b.h().b();
                AccountRemoteRepository accountRemoteRepository = changePasswordViewModel.f48095a;
                this.f48134a = 1;
                if (accountRemoteRepository.requestNewPassword(b10, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            a11 = y.f85009a;
        } catch (Throwable th2) {
            a11 = nm0.l.a(th2);
        }
        if (!(a11 instanceof k.a)) {
            y yVar = (y) a11;
            changePasswordViewModel.m0().setValue(Boolean.TRUE);
        }
        if (nm0.k.b(a11) != null) {
            changePasswordViewModel.m0().setValue(Boolean.FALSE);
        }
        return y.f85009a;
    }
}
