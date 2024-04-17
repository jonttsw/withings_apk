package com.withings.wiscale2.settings;
/* compiled from: Password.kt */
/* loaded from: classes5.dex */
final class n0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.platform.k4 f60198a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SettingsViewModel f60199b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k1.r0<String> f60200c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ k1.r0<String> f60201d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(androidx.compose.ui.platform.k4 k4Var, SettingsViewModel settingsViewModel, k1.r0<String> r0Var, k1.r0<String> r0Var2) {
        super(0);
        this.f60198a = k4Var;
        this.f60199b = settingsViewModel;
        this.f60200c = r0Var;
        this.f60201d = r0Var2;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        androidx.compose.ui.platform.k4 k4Var = this.f60198a;
        if (k4Var != null) {
            k4Var.a();
        }
        this.f60199b.t0(this.f60200c.getValue(), this.f60201d.getValue());
        return nm0.y.f85009a;
    }
}
