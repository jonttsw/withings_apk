package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.Context;
import androidx.lifecycle.LiveData;
import com.withings.workout.category.model.WorkoutCategory;
/* compiled from: WorkoutNotification.kt */
/* loaded from: classes4.dex */
final class h6 extends kotlin.jvm.internal.w implements ym0.l<WorkoutCategory, LiveData<x5>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LiveData<Boolean> f49224a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LiveData<Boolean> f49225b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Context f49226c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(androidx.lifecycle.k0 k0Var, androidx.lifecycle.j0 j0Var, Context context) {
        super(1);
        this.f49224a = k0Var;
        this.f49225b = j0Var;
        this.f49226c = context;
    }

    @Override // ym0.l
    public final LiveData<x5> invoke(WorkoutCategory workoutCategory) {
        WorkoutCategory workoutCategory2 = workoutCategory;
        kotlin.jvm.internal.u.j(workoutCategory2, "workoutCategory");
        if (workoutCategory2.isGpsRelevant()) {
            return androidx.lifecycle.e1.c(this.f49224a, new g6(this.f49226c, this.f49225b));
        }
        return xw.d.a(null);
    }
}
