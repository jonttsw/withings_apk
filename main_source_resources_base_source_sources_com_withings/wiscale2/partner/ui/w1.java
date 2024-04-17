package com.withings.wiscale2.partner.ui;

import android.content.Context;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.partner.model.Partner;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: PartnerIntroFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.partner.ui.PartnerIntroFragment$requestAssociateInAppPartner$1$1", f = "PartnerIntroFragment.kt", l = {ConstantsWs.WS_STATUS_WRONGTZNAME}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class w1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f59235a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1 f59236b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(k1 k1Var, qm0.d<? super w1> dVar) {
        super(2, dVar);
        this.f59236b = k1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new w1(this.f59236b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((w1) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f59235a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            k1 k1Var = this.f59236b;
            t10.e eVar = k1Var.f59140l;
            if (eVar != null) {
                Context requireContext = k1Var.requireContext();
                kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
                long q11 = k1.A1(k1Var).q();
                Partner B1 = k1Var.B1();
                this.f59235a = 1;
                if (eVar.j(q11, requireContext, B1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                kotlin.jvm.internal.u.s("partnerManager");
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}
