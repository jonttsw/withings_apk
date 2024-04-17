package com.withings.wiscale2.settings;
/* compiled from: Password.kt */
/* loaded from: classes5.dex */
final class y0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.platform.k4 f60386a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SettingsViewModel f60387b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k1.r0<String> f60388c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(androidx.compose.ui.platform.k4 k4Var, SettingsViewModel settingsViewModel, k1.r0<String> r0Var) {
        super(0);
        this.f60386a = k4Var;
        this.f60387b = settingsViewModel;
        this.f60388c = r0Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        androidx.compose.ui.platform.k4 k4Var = this.f60386a;
        if (k4Var != null) {
            k4Var.a();
        }
        this.f60387b.t0(this.f60388c.getValue(), null);
        return nm0.y.f85009a;
    }
}
