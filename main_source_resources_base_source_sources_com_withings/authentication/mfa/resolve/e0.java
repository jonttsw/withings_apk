package com.withings.authentication.mfa.resolve;
/* compiled from: MfaResolveScreen.kt */
/* loaded from: classes3.dex */
final class e0 extends kotlin.jvm.internal.w implements ym0.l<String, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MfaResolutionViewModel f32061a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c f32062b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(MfaResolutionViewModel mfaResolutionViewModel, c cVar) {
        super(1);
        this.f32061a = mfaResolutionViewModel;
        this.f32062b = cVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(String str) {
        String code = str;
        kotlin.jvm.internal.u.j(code, "code");
        this.f32061a.R0(code, this.f32062b);
        return nm0.y.f85009a;
    }
}
