package com.withings.authentication;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AuthenticationActivity.kt */
/* loaded from: classes3.dex */
public final class v extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AuthenticationActivity f32622a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f32623b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f32624c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(AuthenticationActivity authenticationActivity, r8.n nVar, int i11) {
        super(2);
        this.f32622a = authenticationActivity;
        this.f32623b = nVar;
        this.f32624c = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f32624c | 1);
        AuthenticationActivity.E3(this.f32622a, this.f32623b, aVar, g11);
        return nm0.y.f85009a;
    }
}
