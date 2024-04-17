package com.withings.wiscale2.settings;
/* compiled from: Password.kt */
/* loaded from: classes5.dex */
final class z0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.platform.k4 f60401a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SettingsViewModel f60402b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k1.r0<String> f60403c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(androidx.compose.ui.platform.k4 k4Var, SettingsViewModel settingsViewModel, k1.r0<String> r0Var) {
        super(0);
        this.f60401a = k4Var;
        this.f60402b = settingsViewModel;
        this.f60403c = r0Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        androidx.compose.ui.platform.k4 k4Var = this.f60401a;
        if (k4Var != null) {
            k4Var.a();
        }
        this.f60402b.t0(this.f60403c.getValue(), null);
        return nm0.y.f85009a;
    }
}
