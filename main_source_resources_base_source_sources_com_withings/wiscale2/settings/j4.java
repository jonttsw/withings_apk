package com.withings.wiscale2.settings;
/* compiled from: SettingsActivity.kt */
/* loaded from: classes5.dex */
final class j4 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SettingsActivity f60077a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f60078b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k1.r0<String> f60079c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(SettingsActivity settingsActivity, r8.n nVar, k1.r0<String> r0Var) {
        super(0);
        this.f60077a = settingsActivity;
        this.f60078b = nVar;
        this.f60079c = r0Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        if (kotlin.jvm.internal.u.e(this.f60079c.getValue(), "privacy")) {
            this.f60077a.finish();
        } else {
            this.f60078b.N();
        }
        return nm0.y.f85009a;
    }
}
