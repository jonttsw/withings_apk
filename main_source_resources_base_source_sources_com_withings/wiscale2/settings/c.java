package com.withings.wiscale2.settings;
/* compiled from: AccountAndSecurity.kt */
/* loaded from: classes5.dex */
final class c extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SettingsViewModel f59889a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f59890b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f59891c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SettingsViewModel settingsViewModel, ym0.a<nm0.y> aVar, k1.r0<Boolean> r0Var) {
        super(0);
        this.f59889a = settingsViewModel;
        this.f59890b = aVar;
        this.f59891c = r0Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        if (this.f59889a.M0()) {
            this.f59891c.setValue(Boolean.TRUE);
        } else {
            this.f59890b.invoke();
        }
        return nm0.y.f85009a;
    }
}
