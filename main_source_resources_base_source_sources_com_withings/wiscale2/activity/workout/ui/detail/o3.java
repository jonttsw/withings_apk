package com.withings.wiscale2.activity.workout.ui.detail;

import androidx.lifecycle.LiveData;
import com.withings.vasistas.model.Vasistas;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WorkoutDetailViewModel.kt */
/* loaded from: classes4.dex */
public final class o3 extends kotlin.jvm.internal.w implements ym0.l<List<Vasistas>, LiveData<ab0.i>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ j3 f49510a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(j3 j3Var) {
        super(1);
        this.f49510a = j3Var;
    }

    @Override // ym0.l
    public final LiveData<ab0.i> invoke(List<Vasistas> list) {
        List<Vasistas> pauseVasistas = list;
        kotlin.jvm.internal.u.j(pauseVasistas, "pauseVasistas");
        j3 j3Var = this.f49510a;
        return androidx.lifecycle.e1.c(j3Var.f49273w, new n3(j3Var, pauseVasistas));
    }
}
