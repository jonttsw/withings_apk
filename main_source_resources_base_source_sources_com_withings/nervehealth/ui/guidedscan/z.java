package com.withings.nervehealth.ui.guidedscan;

import com.withings.common.compose.component.ColorStyle;
import com.withings.common.compose.component.l2;
import com.withings.wiscale2.C1987R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NerveHealthGuidedScanScreen.kt */
/* loaded from: classes4.dex */
public final class z extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f42708a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f42709b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f42710c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(ym0.a aVar, ym0.a aVar2, boolean z5) {
        super(2);
        this.f42708a = z5;
        this.f42709b = aVar;
        this.f42710c = aVar2;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else if (this.f42708a) {
            aVar2.s(1853968488);
            com.withings.common.compose.component.l.a(null, ay.b.u(C1987R.string.nerveHealth_guidedScan_activity_button_finish, aVar2), new l2.a(d1.d.a()), false, ColorStyle.f33324c, null, false, this.f42709b, aVar2, 24576, 105);
            aVar2.J();
        } else {
            aVar2.s(1853968856);
            com.withings.common.compose.component.l.a(null, ay.b.u(C1987R.string.nerveHealth_guidedScan_tuto2_button_launch, aVar2), null, false, null, null, false, this.f42710c, aVar2, 0, 125);
            aVar2.J();
        }
        return nm0.y.f85009a;
    }
}
