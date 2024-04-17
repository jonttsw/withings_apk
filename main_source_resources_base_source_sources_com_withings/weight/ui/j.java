package com.withings.weight.ui;

import androidx.compose.foundation.layout.e1;
import androidx.compose.material3.j5;
import k1.o1;
/* compiled from: SegmentalBodyCompositionActivity.kt */
/* loaded from: classes4.dex */
final class j extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SegmentalBodyCompositionActivity f47621a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ o1<u90.i> f47622b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r8.n f47623c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(SegmentalBodyCompositionActivity segmentalBodyCompositionActivity, o1<? extends u90.i> o1Var, r8.n nVar) {
        super(4);
        this.f47621a = segmentalBodyCompositionActivity;
        this.f47622b = o1Var;
        this.f47623c = nVar;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        j5.e(num, cVar, "$this$composable", dVar, "it");
        androidx.compose.ui.e p11 = ah.k.p(e1.d(androidx.compose.ui.e.f8927a));
        u90.i value = this.f47622b.getValue();
        SegmentalBodyCompositionActivity segmentalBodyCompositionActivity = this.f47621a;
        s90.c.b(value, new e(segmentalBodyCompositionActivity), new f(segmentalBodyCompositionActivity, this.f47623c), new g(segmentalBodyCompositionActivity), new h(segmentalBodyCompositionActivity), new i(segmentalBodyCompositionActivity), p11, aVar, 0, 0);
        return nm0.y.f85009a;
    }
}
