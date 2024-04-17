package com.withings.wiscale2.activity.workout.category.ui;

import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
import kotlin.jvm.internal.u;
/* compiled from: Extensions.kt */
/* loaded from: classes4.dex */
public final class h implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ChooseWorkoutCategoryActivity f48700a;

    public h(ChooseWorkoutCategoryActivity chooseWorkoutCategoryActivity) {
        this.f48700a = chooseWorkoutCategoryActivity;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends g1> U create(Class<U> modelClass) {
        u.j(modelClass, "modelClass");
        ChooseWorkoutCategoryActivity chooseWorkoutCategoryActivity = this.f48700a;
        g gVar = chooseWorkoutCategoryActivity.f48660h;
        if (gVar != null) {
            return gVar.a(ChooseWorkoutCategoryActivity.z3(chooseWorkoutCategoryActivity).q());
        }
        u.s("viewModelFactory");
        throw null;
    }
}
