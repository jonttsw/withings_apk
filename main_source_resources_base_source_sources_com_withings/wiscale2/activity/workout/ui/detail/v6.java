package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.Context;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.learnmore.adapter.LearnMoreEntry;
/* compiled from: WorkoutOptionSheetFragment.kt */
/* loaded from: classes4.dex */
final class v6 extends kotlin.jvm.internal.w implements ym0.l<LearnMoreEntry, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ u6 f49754a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ tb0.h1 f49755b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6(u6 u6Var, tb0.h1 h1Var) {
        super(1);
        this.f49754a = u6Var;
        this.f49755b = h1Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(LearnMoreEntry learnMoreEntry) {
        LearnMoreEntry learnMoreEntry2 = learnMoreEntry;
        kotlin.jvm.internal.u.j(learnMoreEntry2, "<name for destructuring parameter 0>");
        String component1 = learnMoreEntry2.component1();
        String component2 = learnMoreEntry2.component2();
        HMWebActivity.a aVar = HMWebActivity.f35395c;
        Context context = this.f49755b.a().getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        this.f49754a.startActivity(aVar.c(context, component2, component1));
        return nm0.y.f85009a;
    }
}
