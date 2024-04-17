package com.withings.authentication.mfa;
/* compiled from: SettingsMfaNavigation.kt */
/* loaded from: classes3.dex */
final class x extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ androidx.navigation.e f32230a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(androidx.navigation.e eVar) {
        super(0);
        this.f32230a = eVar;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        androidx.navigation.e.L(this.f32230a, "recovery_code", null, 6);
        return nm0.y.f85009a;
    }
}
