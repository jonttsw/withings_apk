package com.withings.nutrisync.ui;
/* compiled from: VitaminCDatavizActivity.kt */
/* loaded from: classes4.dex */
final class i extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ VitaminCDatavizActivity f43267a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f43268b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f43269c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(VitaminCDatavizActivity vitaminCDatavizActivity, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2) {
        super(4);
        this.f43267a = vitaminCDatavizActivity;
        this.f43268b = aVar;
        this.f43269c = aVar2;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        l0.c composable = cVar;
        androidx.navigation.d it = dVar;
        num.intValue();
        kotlin.jvm.internal.u.j(composable, "$this$composable");
        kotlin.jvm.internal.u.j(it, "it");
        VitaminCDatavizActivity vitaminCDatavizActivity = this.f43267a;
        f fVar = new f(vitaminCDatavizActivity);
        g gVar = new g(vitaminCDatavizActivity);
        h hVar = new h(vitaminCDatavizActivity);
        e0.a(null, fVar, this.f43268b, gVar, this.f43269c, hVar, aVar, 4096, 1);
        return nm0.y.f85009a;
    }
}
