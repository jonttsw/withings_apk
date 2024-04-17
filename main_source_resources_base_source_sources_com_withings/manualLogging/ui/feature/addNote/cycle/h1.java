package com.withings.manualLogging.ui.feature.addNote.cycle;

import androidx.compose.material3.j5;
/* compiled from: CycleManualLoggingNavigation.kt */
/* loaded from: classes4.dex */
final class h1 extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ u0 f41023a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ g3 f41024b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f41025c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ androidx.activity.z f41026d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ym0.l<g3, nm0.y> f41027e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h1(u0 u0Var, g3 g3Var, ym0.a<nm0.y> aVar, androidx.activity.z zVar, ym0.l<? super g3, nm0.y> lVar) {
        super(4);
        this.f41023a = u0Var;
        this.f41024b = g3Var;
        this.f41025c = aVar;
        this.f41026d = zVar;
        this.f41027e = lVar;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        j5.e(num, cVar, "$this$composable", dVar, "it");
        ym0.a<nm0.y> f11 = this.f41023a.f();
        g3 g3Var = this.f41024b;
        rx.q.a(g3Var.f(), s1.b.b(aVar2, 2043740551, new f1(g3Var)), this.f41025c, f11, new g1(g3Var, this.f41027e), this.f41026d, aVar2, 262192, 0);
        return nm0.y.f85009a;
    }
}
