package com.withings.authentication.verifyauthentication;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VerifyAuthenticationActivity.kt */
/* loaded from: classes3.dex */
public final class t extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ VerifyAuthenticationActivity f32698a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ androidx.navigation.e f32699b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f32700c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(VerifyAuthenticationActivity verifyAuthenticationActivity, androidx.navigation.e eVar, int i11) {
        super(2);
        this.f32698a = verifyAuthenticationActivity;
        this.f32699b = eVar;
        this.f32700c = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f32700c | 1);
        VerifyAuthenticationActivity.K3(this.f32698a, this.f32699b, aVar, g11);
        return nm0.y.f85009a;
    }
}
