package com.withings.wiscale2.heart.heartrate;

import android.content.Context;
import android.view.View;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.learnmore.adapter.LearnMoreEntry;
/* compiled from: HeartRateOptionSheetFragment.kt */
/* loaded from: classes5.dex */
final class b1 extends kotlin.jvm.internal.w implements ym0.l<LearnMoreEntry, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a1 f57555a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ View f57556b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(a1 a1Var, View view) {
        super(1);
        this.f57555a = a1Var;
        this.f57556b = view;
    }

    @Override // ym0.l
    public final nm0.y invoke(LearnMoreEntry learnMoreEntry) {
        LearnMoreEntry learnMoreEntry2 = learnMoreEntry;
        kotlin.jvm.internal.u.j(learnMoreEntry2, "<name for destructuring parameter 0>");
        String component1 = learnMoreEntry2.component1();
        String component2 = learnMoreEntry2.component2();
        HMWebActivity.a aVar = HMWebActivity.f35395c;
        Context context = this.f57556b.getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        this.f57555a.startActivity(aVar.c(context, component2, component1));
        return nm0.y.f85009a;
    }
}
