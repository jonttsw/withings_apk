package com.withings.wiscale2.partner.ui;

import android.app.Application;
import com.withings.partner.model.Partner;
import com.withings.user.User;
import com.withings.util.log.Fail;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import t10.e;
/* compiled from: PartnerExchangesFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.partner.ui.PartnerExchangesViewModel$unregisterPartner$1", f = "PartnerExchangesFragment.kt", l = {401}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class f1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f59002a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ b1 f59003b;

    /* compiled from: PartnerExchangesFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a implements e.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b1 f59004a;

        a(b1 b1Var) {
            this.f59004a = b1Var;
        }

        @Override // t10.e.b
        public final void a(Partner partner) {
            this.f59004a.p0().postValue(0);
        }

        @Override // t10.e.b
        public final void b(Throwable th2) {
            b1 b1Var = this.f59004a;
            b1Var.p0().postValue(Integer.valueOf(b1.f0(b1Var)));
            String message = th2.getMessage();
            if (message == null) {
                message = "";
            }
            Fail.j(message);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(b1 b1Var, qm0.d<? super f1> dVar) {
        super(2, dVar);
        this.f59003b = b1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new f1(this.f59003b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((f1) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Partner partner;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f59002a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            b1 b1Var = this.f59003b;
            t10.e eVar = b1Var.f58912c;
            Application application = b1Var.getApplication();
            User user = b1Var.f58910a;
            partner = b1Var.f58911b;
            a aVar = new a(b1Var);
            this.f59002a = 1;
            if (eVar.p(application, user, partner, aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
