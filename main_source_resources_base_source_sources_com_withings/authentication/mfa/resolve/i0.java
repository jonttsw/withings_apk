package com.withings.authentication.mfa.resolve;
/* compiled from: MfaResolveScreen.kt */
/* loaded from: classes3.dex */
final class i0 extends kotlin.jvm.internal.w implements ym0.l<String, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MfaResolutionViewModel f32155a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c f32156b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(MfaResolutionViewModel mfaResolutionViewModel, c cVar) {
        super(1);
        this.f32155a = mfaResolutionViewModel;
        this.f32156b = cVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(String str) {
        String code = str;
        kotlin.jvm.internal.u.j(code, "code");
        this.f32155a.R0(code, this.f32156b);
        return nm0.y.f85009a;
    }
}
