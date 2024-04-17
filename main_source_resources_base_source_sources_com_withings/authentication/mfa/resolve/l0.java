package com.withings.authentication.mfa.resolve;

import kotlin.collections.s0;
/* compiled from: MfaResolveScreen.kt */
/* loaded from: classes3.dex */
final class l0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MfaResolutionViewModel f32169a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c f32170b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(MfaResolutionViewModel mfaResolutionViewModel, c cVar) {
        super(0);
        this.f32169a = mfaResolutionViewModel;
        this.f32170b = cVar;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        int i11 = v70.a.f103433b;
        v70.a.e("resend_confirmation_code_2FA", "2FA", s0.i(new nm0.j("flow_step_name", "resend_confirmation_code_2FA")), false, 8);
        this.f32169a.T0(this.f32170b);
        return nm0.y.f85009a;
    }
}
