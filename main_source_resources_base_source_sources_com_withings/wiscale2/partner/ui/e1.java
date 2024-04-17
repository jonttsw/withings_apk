package com.withings.wiscale2.partner.ui;

import android.app.Application;
import com.withings.partner.model.Partner;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* compiled from: PartnerExchangesFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.partner.ui.PartnerExchangesViewModel$partnerImports$1$1", f = "PartnerExchangesFragment.kt", l = {393, 393}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class e1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<List<? extends d0>>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f58992a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f58993b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ b1 f58994c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Partner f58995d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(b1 b1Var, Partner partner, qm0.d<? super e1> dVar) {
        super(2, dVar);
        this.f58994c = b1Var;
        this.f58995d = partner;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        e1 e1Var = new e1(this.f58994c, this.f58995d, dVar);
        e1Var.f58993b = obj;
        return e1Var;
    }

    @Override // ym0.p
    public final Object invoke(androidx.lifecycle.h0<List<? extends d0>> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((e1) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        androidx.lifecycle.h0 h0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f58992a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    nm0.l.b(obj);
                    return nm0.y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h0Var = (androidx.lifecycle.h0) this.f58993b;
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            h0Var = (androidx.lifecycle.h0) this.f58993b;
            Application application = this.f58994c.getApplication();
            this.f58993b = h0Var;
            this.f58992a = 1;
            obj = a1.b(application, this.f58995d, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        this.f58993b = null;
        this.f58992a = 2;
        if (h0Var.emit(obj, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return nm0.y.f85009a;
    }
}
