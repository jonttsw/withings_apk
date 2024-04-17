package com.withings.wiscale2.device.wpa.wpa02.ui.features.cleansing;
/* compiled from: CleansingModeNavigation.kt */
/* loaded from: classes5.dex */
final class n extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f55308a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f55309b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(r8.n nVar, ym0.a aVar) {
        super(4);
        this.f55308a = aVar;
        this.f55309b = nVar;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        l0.c composable = cVar;
        androidx.navigation.d it = dVar;
        num.intValue();
        kotlin.jvm.internal.u.j(composable, "$this$composable");
        kotlin.jvm.internal.u.j(it, "it");
        e0.a(0, 0, aVar, this.f55308a, new m(this.f55309b));
        return nm0.y.f85009a;
    }
}
