package com.withings.wiscale2.device.wpa.wpa02.ui.features.cleansing;
/* compiled from: CleansingModeNavigation.kt */
/* loaded from: classes5.dex */
final class f extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ r8.n f55277a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f55278b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(r8.n nVar, ym0.a<nm0.y> aVar) {
        super(0);
        this.f55277a = nVar;
        this.f55278b = aVar;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        r8.n nVar = this.f55277a;
        kotlin.jvm.internal.u.j(nVar, "<this>");
        androidx.navigation.e.L(nVar, "device_connect_state", null, 6);
        this.f55278b.invoke();
        return nm0.y.f85009a;
    }
}
