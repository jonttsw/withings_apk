package com.withings.wiscale2.partner.ui;

import android.content.Context;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.partner.model.Partner;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* compiled from: PartnerActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.partner.ui.PartnerViewModel$partnerExports$1$1", f = "PartnerActivity.kt", l = {ConstantsWs.WS_STATUS_WRONGSTARTMACADDRESS, ConstantsWs.WS_STATUS_WRONGSTARTMACADDRESS}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class g2 extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<List<? extends d0>>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f59088a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f59089b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ f2 f59090c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Partner f59091d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(Partner partner, f2 f2Var, qm0.d dVar) {
        super(2, dVar);
        this.f59090c = f2Var;
        this.f59091d = partner;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        g2 g2Var = new g2(this.f59091d, this.f59090c, dVar);
        g2Var.f59089b = obj;
        return g2Var;
    }

    @Override // ym0.p
    public final Object invoke(androidx.lifecycle.h0<List<? extends d0>> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((g2) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        androidx.lifecycle.h0 h0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f59088a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    nm0.l.b(obj);
                    return nm0.y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h0Var = (androidx.lifecycle.h0) this.f59089b;
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            h0Var = (androidx.lifecycle.h0) this.f59089b;
            Context B0 = this.f59090c.B0();
            this.f59089b = h0Var;
            this.f59088a = 1;
            obj = a1.a(B0, this.f59091d, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        this.f59089b = null;
        this.f59088a = 2;
        if (h0Var.emit(obj, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return nm0.y.f85009a;
    }
}
