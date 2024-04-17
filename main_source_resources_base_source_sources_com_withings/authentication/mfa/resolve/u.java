package com.withings.authentication.mfa.resolve;

import kotlin.collections.s0;
/* compiled from: MfaResolveScreen.kt */
/* loaded from: classes3.dex */
final class u extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MfaResolutionViewModel f32195a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c f32196b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(MfaResolutionViewModel mfaResolutionViewModel, c cVar) {
        super(0);
        this.f32195a = mfaResolutionViewModel;
        this.f32196b = cVar;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        int i11 = v70.a.f103433b;
        v70.a.e("resend_confirmation_code_2FA", "2FA", s0.i(new nm0.j("flow_step_name", "resend_confirmation_code_2FA")), false, 8);
        this.f32195a.T0(this.f32196b);
        return nm0.y.f85009a;
    }
}
