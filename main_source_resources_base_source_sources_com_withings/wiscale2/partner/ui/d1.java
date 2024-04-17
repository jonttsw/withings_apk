package com.withings.wiscale2.partner.ui;

import android.app.Application;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.partner.model.Partner;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* compiled from: PartnerExchangesFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.partner.ui.PartnerExchangesViewModel$partnerExports$1$1", f = "PartnerExchangesFragment.kt", l = {ConstantsWs.WS_STATUS_FIRMWARE_NOT_VALIDATED, ConstantsWs.WS_STATUS_FIRMWARE_NOT_VALIDATED}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class d1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<List<? extends d0>>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f58948a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f58949b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ b1 f58950c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Partner f58951d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(b1 b1Var, Partner partner, qm0.d<? super d1> dVar) {
        super(2, dVar);
        this.f58950c = b1Var;
        this.f58951d = partner;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        d1 d1Var = new d1(this.f58950c, this.f58951d, dVar);
        d1Var.f58949b = obj;
        return d1Var;
    }

    @Override // ym0.p
    public final Object invoke(androidx.lifecycle.h0<List<? extends d0>> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((d1) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        androidx.lifecycle.h0 h0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f58948a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    nm0.l.b(obj);
                    return nm0.y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h0Var = (androidx.lifecycle.h0) this.f58949b;
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            h0Var = (androidx.lifecycle.h0) this.f58949b;
            Application application = this.f58950c.getApplication();
            this.f58949b = h0Var;
            this.f58948a = 1;
            obj = a1.a(application, this.f58951d, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        this.f58949b = null;
        this.f58948a = 2;
        if (h0Var.emit(obj, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return nm0.y.f85009a;
    }
}
