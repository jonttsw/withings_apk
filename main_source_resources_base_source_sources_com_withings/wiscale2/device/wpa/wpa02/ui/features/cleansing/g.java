package com.withings.wiscale2.device.wpa.wpa02.ui.features.cleansing;
/* compiled from: CleansingModeNavigation.kt */
/* loaded from: classes5.dex */
final class g extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f55280a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f55281b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f55282c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(r8.n nVar, ym0.a aVar, ym0.a aVar2) {
        super(4);
        this.f55280a = aVar;
        this.f55281b = nVar;
        this.f55282c = aVar2;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        l0.c composable = cVar;
        androidx.navigation.d it = dVar;
        num.intValue();
        kotlin.jvm.internal.u.j(composable, "$this$composable");
        kotlin.jvm.internal.u.j(it, "it");
        d.a(0, 0, aVar, new f(this.f55281b, this.f55282c), this.f55280a);
        return nm0.y.f85009a;
    }
}
