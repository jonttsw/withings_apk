package com.withings.fever.ui.temperatureList;

import androidx.compose.runtime.a;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import k1.r0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: TemperatureListActivity.kt */
/* loaded from: classes3.dex */
final class i extends w implements ym0.q<l0.i, androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ r0<ky.d> f39435a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ TemperatureListActivity f39436b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r0<ky.d> r0Var, TemperatureListActivity temperatureListActivity) {
        super(3);
        this.f39435a = r0Var;
        this.f39436b = temperatureListActivity;
    }

    @Override // ym0.q
    public final y invoke(l0.i iVar, androidx.compose.runtime.a aVar, Integer num) {
        l0.i AnimatedVisibility = iVar;
        androidx.compose.runtime.a aVar2 = aVar;
        num.intValue();
        u.j(AnimatedVisibility, "$this$AnimatedVisibility");
        r0<ky.d> r0Var = this.f39435a;
        ky.d value = r0Var.getValue();
        if (value != null) {
            aVar2.s(-729869671);
            Object t11 = aVar2.t();
            if (t11 == a.C0060a.a()) {
                t11 = new f(r0Var);
                aVar2.n(t11);
            }
            ym0.a aVar3 = (ym0.a) t11;
            aVar2.J();
            String u11 = ay.b.u(C1987R.string.account_are_you_sure, aVar2);
            String u12 = ay.b.u(C1987R.string._DELETE_YES_, aVar2);
            g gVar = new g(this.f39436b, value, r0Var);
            String u13 = ay.b.u(C1987R.string._CANCEL_, aVar2);
            aVar2.s(-729868981);
            Object t12 = aVar2.t();
            if (t12 == a.C0060a.a()) {
                t12 = new h(r0Var);
                aVar2.n(t12);
            }
            aVar2.J();
            wk.p.a(aVar3, null, u11, u12, 0L, gVar, u13, 0L, (ym0.a) t12, aVar2, 100663302, ConstantsWs.MEASURE_TYPE_VIRUS_SARS_COV_2);
        }
        return y.f85009a;
    }
}
