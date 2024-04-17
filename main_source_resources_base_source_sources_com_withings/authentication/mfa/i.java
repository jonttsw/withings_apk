package com.withings.authentication.mfa;

import android.content.Context;
/* compiled from: ResolveMultiFactorActivity.kt */
/* loaded from: classes3.dex */
final class i extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ResolveMultiFactorActivity f31629a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f31630b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ResolveMultiFactorActivity resolveMultiFactorActivity, Context context) {
        super(0);
        this.f31629a = resolveMultiFactorActivity;
        this.f31630b = context;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        ch.d dVar = this.f31629a.f31565e;
        if (dVar != null) {
            dVar.p().getClass();
            Context context = this.f31630b;
            androidx.core.content.a.startActivity(context, ah.p.e(context), null);
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("intentBuilder");
        throw null;
    }
}
