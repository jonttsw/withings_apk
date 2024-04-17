package com.withings.authentication.mfa;

import android.content.Context;
import com.withings.authentication.mfa.recovery.login.LoginRecoveryCodeViewModel;
/* compiled from: ResolveMultiFactorActivity.kt */
/* loaded from: classes3.dex */
final class m extends kotlin.jvm.internal.w implements ym0.l<r8.m, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ResolveMultiFactorActivity f31639a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f31640b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Context f31641c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ResolveMultiFactorActivity resolveMultiFactorActivity, r8.n nVar, Context context) {
        super(1);
        this.f31639a = resolveMultiFactorActivity;
        this.f31640b = nVar;
        this.f31641c = context;
    }

    @Override // ym0.l
    public final nm0.y invoke(r8.m mVar) {
        r8.m NavHost = mVar;
        kotlin.jvm.internal.u.j(NavHost, "$this$NavHost");
        ResolveMultiFactorActivity resolveMultiFactorActivity = this.f31639a;
        LoginRecoveryCodeViewModel D3 = ResolveMultiFactorActivity.D3(resolveMultiFactorActivity);
        TwoFactorMultiAccountViewModel F3 = ResolveMultiFactorActivity.F3(resolveMultiFactorActivity);
        Context context = this.f31641c;
        kh.r.a(NavHost, D3, F3, this.f31640b, null, new i(resolveMultiFactorActivity, context), new j(resolveMultiFactorActivity), new k(resolveMultiFactorActivity), new l(resolveMultiFactorActivity, context), false);
        return nm0.y.f85009a;
    }
}
