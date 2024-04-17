package com.withings.wiscale2.settings;
/* compiled from: Password.kt */
/* loaded from: classes5.dex */
final class u0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.platform.k4 f60318a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f60319b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ SettingsViewModel f60320c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ k1.r0<String> f60321d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ k1.r0<String> f60322e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(k1.r0 r0Var, k1.r0 r0Var2, k1.r0 r0Var3, androidx.compose.ui.platform.k4 k4Var, SettingsViewModel settingsViewModel) {
        super(0);
        this.f60318a = k4Var;
        this.f60319b = r0Var;
        this.f60320c = settingsViewModel;
        this.f60321d = r0Var2;
        this.f60322e = r0Var3;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        androidx.compose.ui.platform.k4 k4Var = this.f60318a;
        if (k4Var != null) {
            k4Var.a();
        }
        if (this.f60319b.getValue().booleanValue()) {
            this.f60320c.t0(this.f60321d.getValue(), this.f60322e.getValue());
        }
        return nm0.y.f85009a;
    }
}
