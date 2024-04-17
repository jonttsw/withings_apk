package com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea;

import android.content.Context;
import android.view.View;
/* compiled from: SleepDisorderDetailsFragment.kt */
/* loaded from: classes5.dex */
final class v extends kotlin.jvm.internal.w implements ym0.l<View, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ s f61470a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(s sVar) {
        super(1);
        this.f61470a = sVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(View view) {
        View it = view;
        kotlin.jvm.internal.u.j(it, "it");
        s sVar = this.f61470a;
        Context requireContext = sVar.requireContext();
        kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
        s.F1(sVar, requireContext);
        return nm0.y.f85009a;
    }
}
