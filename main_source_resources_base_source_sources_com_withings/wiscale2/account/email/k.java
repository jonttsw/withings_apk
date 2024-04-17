package com.withings.wiscale2.account.email;

import androidx.lifecycle.h0;
import com.withings.account.core.model.Account;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import nm0.y;
import ym0.p;
/* compiled from: EmailModificationActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.account.email.EmailModificationViewModel$accountLiveData$1$1", f = "EmailModificationActivity.kt", l = {ConstantsWs.WS_STATUS_WRONG_DATE_FORMAT}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class k extends kotlin.coroutines.jvm.internal.i implements p<h0<Account>, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f48082a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f48083b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ EmailModificationViewModel f48084c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(EmailModificationViewModel emailModificationViewModel, qm0.d<? super k> dVar) {
        super(2, dVar);
        this.f48084c = emailModificationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        k kVar = new k(this.f48084c, dVar);
        kVar.f48083b = obj;
        return kVar;
    }

    @Override // ym0.p
    public final Object invoke(h0<Account> h0Var, qm0.d<? super y> dVar) {
        return ((k) create(h0Var, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f48082a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            Account h11 = this.f48084c.f48039b.h();
            this.f48082a = 1;
            if (((h0) this.f48083b).emit(h11, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }
}
