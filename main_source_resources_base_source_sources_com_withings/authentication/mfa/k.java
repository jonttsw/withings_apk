package com.withings.authentication.mfa;
/* compiled from: ResolveMultiFactorActivity.kt */
/* loaded from: classes3.dex */
final class k extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ResolveMultiFactorActivity f31636a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ResolveMultiFactorActivity resolveMultiFactorActivity) {
        super(0);
        this.f31636a = resolveMultiFactorActivity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        ResolveMultiFactorActivity resolveMultiFactorActivity = this.f31636a;
        ch.d dVar = resolveMultiFactorActivity.f31565e;
        if (dVar != null) {
            dVar.p().getClass();
            resolveMultiFactorActivity.startActivity(ah.p.e(resolveMultiFactorActivity));
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("intentBuilder");
        throw null;
    }
}
