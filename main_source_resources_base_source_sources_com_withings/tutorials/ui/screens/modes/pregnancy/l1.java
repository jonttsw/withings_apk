package com.withings.tutorials.ui.screens.modes.pregnancy;

import com.withings.common.compose.component.ColorStyle;
import com.withings.wiscale2.C1987R;
/* compiled from: PregnancyMode.kt */
/* loaded from: classes4.dex */
final class l1 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f45970a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(ym0.a<nm0.y> aVar) {
        super(2);
        this.f45970a = aVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            com.withings.common.compose.component.l.c(null, ay.b.u(C1987R.string._PREVIOUS_, aVar2), null, false, ColorStyle.f33322a, null, false, this.f45970a, aVar2, 24576, 109);
        }
        return nm0.y.f85009a;
    }
}
