package com.withings.cycletracking.ui;

import androidx.compose.runtime.a;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
/* compiled from: CycleTrackingFactorsScreen.kt */
/* loaded from: classes3.dex */
final class v1 extends kotlin.jvm.internal.w implements ym0.q<l0.i, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1.r0<fr.a> f35759a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.l<fr.a, nm0.y> f35760b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v1(k1.r0<fr.a> r0Var, ym0.l<? super fr.a, nm0.y> lVar) {
        super(3);
        this.f35759a = r0Var;
        this.f35760b = lVar;
    }

    @Override // ym0.q
    public final nm0.y invoke(l0.i iVar, androidx.compose.runtime.a aVar, Integer num) {
        l0.i AnimatedVisibility = iVar;
        androidx.compose.runtime.a aVar2 = aVar;
        num.intValue();
        kotlin.jvm.internal.u.j(AnimatedVisibility, "$this$AnimatedVisibility");
        k1.r0<fr.a> r0Var = this.f35759a;
        fr.a value = r0Var.getValue();
        if (value != null) {
            aVar2.s(-2016667421);
            Object t11 = aVar2.t();
            if (t11 == a.C0060a.a()) {
                t11 = new s1(r0Var);
                aVar2.n(t11);
            }
            ym0.a aVar3 = (ym0.a) t11;
            aVar2.J();
            String u11 = ay.b.u(C1987R.string.account_are_you_sure, aVar2);
            String u12 = ay.b.u(C1987R.string._DELETE_YES_, aVar2);
            t1 t1Var = new t1(this.f35760b, value);
            String u13 = ay.b.u(C1987R.string._CANCEL_, aVar2);
            aVar2.s(-2016667040);
            Object t12 = aVar2.t();
            if (t12 == a.C0060a.a()) {
                t12 = new u1(r0Var);
                aVar2.n(t12);
            }
            aVar2.J();
            wk.p.a(aVar3, null, u11, u12, 0L, t1Var, u13, 0L, (ym0.a) t12, aVar2, 100663302, ConstantsWs.MEASURE_TYPE_VIRUS_SARS_COV_2);
        }
        return nm0.y.f85009a;
    }
}
