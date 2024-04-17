package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.Context;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.views.view.SectionView;
import com.withings.wiscale2.C1987R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WorkoutDetailFragment.kt */
/* loaded from: classes4.dex */
public final class e3 extends kotlin.jvm.internal.w implements ym0.l<SectionView, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ x1 f49172a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f49173b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(x1 x1Var, String str) {
        super(1);
        this.f49172a = x1Var;
        this.f49173b = str;
    }

    @Override // ym0.l
    public final nm0.y invoke(SectionView sectionView) {
        SectionView it = sectionView;
        kotlin.jvm.internal.u.j(it, "it");
        HMWebActivity.a aVar = HMWebActivity.f35395c;
        x1 x1Var = this.f49172a;
        Context requireContext = x1Var.requireContext();
        kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
        x1Var.startActivity(aVar.c(requireContext, x1Var.getString(C1987R.string._HELP_CENTER_), this.f49173b));
        return nm0.y.f85009a;
    }
}
