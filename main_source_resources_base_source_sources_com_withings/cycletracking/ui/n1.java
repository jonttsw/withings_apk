package com.withings.cycletracking.ui;

import com.withings.wiscale2.C1987R;
/* compiled from: CycleTrackingFactorsScreen.kt */
/* loaded from: classes3.dex */
final class n1 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f35710a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f35711b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(ym0.a aVar, boolean z5) {
        super(2);
        this.f35710a = z5;
        this.f35711b = aVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            com.withings.common.compose.component.l.a(null, ay.b.u(C1987R.string._SAVE_, aVar2), null, !this.f35710a, null, null, false, this.f35711b, aVar2, 0, 117);
        }
        return nm0.y.f85009a;
    }
}
