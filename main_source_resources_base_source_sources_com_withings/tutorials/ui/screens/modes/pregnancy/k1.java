package com.withings.tutorials.ui.screens.modes.pregnancy;

import com.withings.common.compose.component.ColorStyle;
import com.withings.wiscale2.C1987R;
/* compiled from: PregnancyMode.kt */
/* loaded from: classes4.dex */
final class k1 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1.r0<Double> f45963a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f45964b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(k1.r0<Double> r0Var, ym0.a<nm0.y> aVar) {
        super(2);
        this.f45963a = r0Var;
        this.f45964b = aVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        boolean z5;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            String u11 = ay.b.u(C1987R.string._NEXT_, aVar2);
            ColorStyle colorStyle = ColorStyle.f33322a;
            if (this.f45963a.getValue() != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            com.withings.common.compose.component.l.a(null, u11, null, z5, colorStyle, null, false, this.f45964b, aVar2, 24576, 101);
        }
        return nm0.y.f85009a;
    }
}
