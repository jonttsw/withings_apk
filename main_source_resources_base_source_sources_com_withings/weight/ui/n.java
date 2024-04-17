package com.withings.weight.ui;

import androidx.navigation.c0;
/* compiled from: SegmentalBodyCompositionActivity.kt */
/* loaded from: classes4.dex */
final class n extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SegmentalBodyCompositionActivity f47762a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f47763b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(SegmentalBodyCompositionActivity segmentalBodyCompositionActivity, r8.n nVar) {
        super(4);
        this.f47762a = segmentalBodyCompositionActivity;
        this.f47763b = nVar;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        l0.c composable = cVar;
        androidx.navigation.d it = dVar;
        androidx.compose.runtime.a aVar2 = aVar;
        num.intValue();
        kotlin.jvm.internal.u.j(composable, "$this$composable");
        kotlin.jvm.internal.u.j(it, "it");
        SegmentalBodyCompositionActivity segmentalBodyCompositionActivity = this.f47762a;
        r8.n nVar = this.f47763b;
        e.j.a(0, 1, aVar2, new k(segmentalBodyCompositionActivity, nVar), false);
        com.withings.tutorials.ui.screens.g.f45305a.e(Long.valueOf(SegmentalBodyCompositionActivity.A3(segmentalBodyCompositionActivity)), androidx.navigation.compose.r.c(new c0[0], aVar2), new l(segmentalBodyCompositionActivity, nVar), new m(segmentalBodyCompositionActivity, nVar), null, aVar2, 64, 16);
        return nm0.y.f85009a;
    }
}
