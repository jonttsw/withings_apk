package com.withings.cycletracking.ui;

import androidx.compose.runtime.a;
import com.withings.common.compose.component.ColorStyle;
import com.withings.wiscale2.C1987R;
/* compiled from: CycleTrackingFactorsScreen.kt */
/* loaded from: classes3.dex */
final class p1 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f35728a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f35729b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(k1.r0 r0Var, boolean z5) {
        super(2);
        this.f35728a = z5;
        this.f35729b = r0Var;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            String u11 = ay.b.u(C1987R.string.cycle_tracking_factors_edit_delete, aVar2);
            ColorStyle colorStyle = ColorStyle.f33323b;
            boolean z5 = !this.f35728a;
            aVar2.s(290388798);
            Object t11 = aVar2.t();
            if (t11 == a.C0060a.a()) {
                t11 = new o1(this.f35729b);
                aVar2.n(t11);
            }
            aVar2.J();
            com.withings.common.compose.component.l.a(null, u11, null, z5, colorStyle, null, false, (ym0.a) t11, aVar2, 12607488, 101);
        }
        return nm0.y.f85009a;
    }
}
