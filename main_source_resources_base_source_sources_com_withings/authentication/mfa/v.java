package com.withings.authentication.mfa;

import com.withings.library.authentication.api.ConstantsWs;
/* compiled from: SettingsMfaNavigation.kt */
/* loaded from: classes3.dex */
final class v extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ androidx.navigation.e f32228a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(androidx.navigation.e eVar) {
        super(0);
        this.f32228a = eVar;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        androidx.navigation.e.L(this.f32228a, ConstantsWs.AUTHENTICATION_TYPE_TOTP, null, 6);
        return nm0.y.f85009a;
    }
}
