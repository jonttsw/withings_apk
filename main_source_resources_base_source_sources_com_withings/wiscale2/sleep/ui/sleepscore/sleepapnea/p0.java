package com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea;

import android.content.Context;
import android.view.View;
/* compiled from: SleepDisorderGraphFragment.kt */
/* loaded from: classes5.dex */
final class p0 extends kotlin.jvm.internal.w implements ym0.l<View, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ o0 f61427a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(o0 o0Var) {
        super(1);
        this.f61427a = o0Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(View view) {
        View it = view;
        kotlin.jvm.internal.u.j(it, "it");
        Context context = it.getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        o0.y1(this.f61427a, context);
        return nm0.y.f85009a;
    }
}
