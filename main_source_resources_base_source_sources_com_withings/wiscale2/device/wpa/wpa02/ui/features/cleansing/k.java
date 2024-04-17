package com.withings.wiscale2.device.wpa.wpa02.ui.features.cleansing;
/* compiled from: CleansingModeNavigation.kt */
/* loaded from: classes5.dex */
final class k extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f55295a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f55296b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(r8.n nVar, ym0.a aVar) {
        super(0);
        this.f55295a = aVar;
        this.f55296b = nVar;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        this.f55295a.invoke();
        androidx.navigation.e.P(this.f55296b, "cleansing_mode_introduction", false);
        return nm0.y.f85009a;
    }
}
