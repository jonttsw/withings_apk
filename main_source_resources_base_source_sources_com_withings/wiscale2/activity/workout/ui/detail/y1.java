package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.Context;
import android.content.Intent;
import com.withings.wiscale2.activity.workout.ui.map.WorkoutMapActivity;
import com.withings.wiscale2.track.data.Track;
import com.withings.workout.category.model.WorkoutCategory;
/* compiled from: WorkoutDetailFragment.kt */
/* loaded from: classes4.dex */
final class y1 extends kotlin.jvm.internal.w implements ym0.l<n4, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ x1 f49826a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(x1 x1Var) {
        super(1);
        this.f49826a = x1Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(n4 n4Var) {
        n4 it = n4Var;
        kotlin.jvm.internal.u.j(it, "it");
        x1 x1Var = this.f49826a;
        j3 j3Var = x1Var.f49788p;
        if (j3Var != null) {
            nm0.j jVar = (nm0.j) j3Var.s1().getValue();
            if (jVar != null) {
                WorkoutCategory category = (WorkoutCategory) jVar.b();
                WorkoutMapActivity.a aVar = WorkoutMapActivity.f49844s;
                Context requireContext = x1Var.requireContext();
                kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
                Long id2 = ((Track) jVar.a()).getId();
                kotlin.jvm.internal.u.g(id2);
                long longValue = id2.longValue();
                aVar.getClass();
                kotlin.jvm.internal.u.j(category, "category");
                Intent putExtra = new Intent(requireContext, WorkoutMapActivity.class).putExtra("extra_track", longValue).putExtra("extra_category", category);
                kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
                x1Var.startActivity(putExtra);
            }
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("viewModel");
        throw null;
    }
}
