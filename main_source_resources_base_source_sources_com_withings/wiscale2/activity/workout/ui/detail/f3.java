package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.Context;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.views.view.SectionView;
import com.withings.wiscale2.C1987R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WorkoutDetailFragment.kt */
/* loaded from: classes4.dex */
public final class f3 extends kotlin.jvm.internal.w implements ym0.l<SectionView, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ x1 f49188a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(x1 x1Var) {
        super(1);
        this.f49188a = x1Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(SectionView sectionView) {
        SectionView it = sectionView;
        kotlin.jvm.internal.u.j(it, "it");
        HMWebActivity.a aVar = HMWebActivity.f35395c;
        x1 x1Var = this.f49188a;
        Context requireContext = x1Var.requireContext();
        kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
        String string = x1Var.getString(C1987R.string._HELP_CENTER_);
        String string2 = x1Var.getString(C1987R.string.cbtWorkout_contentPlaceholder);
        kotlin.jvm.internal.u.i(string2, "getString(...)");
        x1Var.startActivity(aVar.c(requireContext, string, string2));
        return nm0.y.f85009a;
    }
}
