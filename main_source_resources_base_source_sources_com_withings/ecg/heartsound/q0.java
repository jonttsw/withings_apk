package com.withings.ecg.heartsound;

import android.content.Context;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.learnmore.adapter.LearnMoreEntry;
/* compiled from: HeartSoundOptionSheetFragment.kt */
/* loaded from: classes3.dex */
final class q0 extends kotlin.jvm.internal.w implements ym0.l<LearnMoreEntry, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p0 f38504a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(p0 p0Var) {
        super(1);
        this.f38504a = p0Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(LearnMoreEntry learnMoreEntry) {
        LearnMoreEntry learnMoreEntry2 = learnMoreEntry;
        kotlin.jvm.internal.u.j(learnMoreEntry2, "<name for destructuring parameter 0>");
        String component1 = learnMoreEntry2.component1();
        String component2 = learnMoreEntry2.component2();
        HMWebActivity.a aVar = HMWebActivity.f35395c;
        p0 p0Var = this.f38504a;
        Context requireContext = p0Var.requireContext();
        kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
        p0Var.startActivity(aVar.c(requireContext, component2, component1));
        p0Var.dismiss();
        return nm0.y.f85009a;
    }
}
