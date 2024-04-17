package com.withings.weight.ui;

import androidx.activity.b0;
import androidx.navigation.c0;
import com.withings.library.authentication.api.ConstantsWs;
import u90.i;
/* compiled from: SegmentalBodyCompositionActivity.kt */
/* loaded from: classes4.dex */
final class p extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SegmentalBodyCompositionActivity f47767a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(SegmentalBodyCompositionActivity segmentalBodyCompositionActivity) {
        super(2);
        this.f47767a = segmentalBodyCompositionActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            r8.n c11 = androidx.navigation.compose.r.c(new c0[0], aVar2);
            c11.D().b(b0.v(aVar2));
            SegmentalBodyCompositionActivity segmentalBodyCompositionActivity = this.f47767a;
            androidx.navigation.compose.s.b(c11, SegmentalBodyCompositionDestination.f47605d.d(), null, null, null, null, null, null, null, new o(segmentalBodyCompositionActivity, h6.b.a(SegmentalBodyCompositionActivity.B3(segmentalBodyCompositionActivity).A0(), i.b.f101632a, aVar2, 56), c11), aVar2, 8, ConstantsWs.WS_STATUS_WRONG_STRIPE_ENV);
        }
        return nm0.y.f85009a;
    }
}
