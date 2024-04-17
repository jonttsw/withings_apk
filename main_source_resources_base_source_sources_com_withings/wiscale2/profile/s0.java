package com.withings.wiscale2.profile;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ProfileFragment.kt */
/* loaded from: classes5.dex */
public final class s0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ q f59464a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(q qVar) {
        super(0);
        this.f59464a = qVar;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        q qVar = this.f59464a;
        Context requireContext = qVar.requireContext();
        kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
        q.x1(qVar, requireContext);
        return nm0.y.f85009a;
    }
}
