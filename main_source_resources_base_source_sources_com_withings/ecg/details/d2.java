package com.withings.ecg.details;

import android.content.Context;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.learnmore.adapter.LearnMoreEntry;
/* compiled from: EcgOptionSheetFragment.kt */
/* loaded from: classes3.dex */
final class d2 extends kotlin.jvm.internal.w implements ym0.l<LearnMoreEntry, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c2 f38172a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(c2 c2Var) {
        super(1);
        this.f38172a = c2Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(LearnMoreEntry learnMoreEntry) {
        LearnMoreEntry learnMoreEntry2 = learnMoreEntry;
        kotlin.jvm.internal.u.j(learnMoreEntry2, "<name for destructuring parameter 0>");
        String component1 = learnMoreEntry2.component1();
        String component2 = learnMoreEntry2.component2();
        HMWebActivity.a aVar = HMWebActivity.f35395c;
        c2 c2Var = this.f38172a;
        Context requireContext = c2Var.requireContext();
        kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
        c2Var.startActivity(aVar.c(requireContext, component2, component1));
        return nm0.y.f85009a;
    }
}
