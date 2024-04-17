package com.withings.wiscale2.activity.workout.ui.detail;

import androidx.recyclerview.widget.RecyclerView;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
/* compiled from: AllWorkoutsActivity.kt */
/* loaded from: classes4.dex */
public final class d extends RecyclerView.p {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AllWorkoutsActivity f49154a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(AllWorkoutsActivity allWorkoutsActivity) {
        this.f49154a = allWorkoutsActivity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public final void b(RecyclerView recyclerView, int i11, int i12) {
        o7 o7Var;
        kotlin.jvm.internal.u.j(recyclerView, "recyclerView");
        if (i12 > 0 && !recyclerView.canScrollVertically(1)) {
            o7Var = this.f49154a.f49023o;
            if (o7Var != null) {
                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(o7Var), Dispatchers.getIO(), null, new s7(o7Var, null), 2, null);
            } else {
                kotlin.jvm.internal.u.s("viewModel");
                throw null;
            }
        }
    }
}
