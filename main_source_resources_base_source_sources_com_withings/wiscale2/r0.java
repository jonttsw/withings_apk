package com.withings.wiscale2;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.withings.core.data.aggregate.ActivityAggregateManager;
import com.withings.vasistas.v2.repository.VasistasRepository;
import com.withings.wiscale2.activity.model.builder.RecomputeAggregate;
import com.withings.wiscale2.activity.workout.model.WorkoutManager;
import com.withings.wiscale2.b0;
import com.withings.workout.category.model.WorkoutCategoryManager;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
/* loaded from: classes4.dex */
public final class r0 implements f6.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b0.a f59572a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r0(b0.a aVar) {
        this.f59572a = aVar;
    }

    @Override // f6.b
    public final androidx.work.o a(Context context, WorkerParameters workerParameters) {
        dagger.internal.d dVar;
        dagger.internal.d dVar2;
        fy.l F8;
        b0.a aVar = this.f59572a;
        kn.e eVar = (kn.e) aVar.f50287a.f50251u.get();
        m70.i iVar = (m70.i) aVar.f50287a.f50258v0.get();
        lj0.h0 h0Var = (lj0.h0) aVar.f50287a.W0.get();
        VasistasRepository vasistasRepository = (VasistasRepository) ((b0.a) aVar.f50287a.X0).get();
        WorkoutManager workoutManager = (WorkoutManager) aVar.f50287a.f50223p1.get();
        ei0.q qVar = (ei0.q) aVar.f50287a.J1.get();
        dVar = aVar.f50287a.Q2;
        lj0.r rVar = (lj0.r) dVar.get();
        dVar2 = aVar.f50287a.R2;
        lj0.g gVar = (lj0.g) dVar2.get();
        ActivityAggregateManager activityAggregateManager = (ActivityAggregateManager) aVar.f50287a.F1.get();
        F8 = aVar.f50287a.F8();
        return new RecomputeAggregate(context, workerParameters, eVar, iVar, h0Var, vasistasRepository, workoutManager, qVar, rVar, gVar, activityAggregateManager, F8, (WorkoutCategoryManager) aVar.f50287a.K1.get());
    }
}
