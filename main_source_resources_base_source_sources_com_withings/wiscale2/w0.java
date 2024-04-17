package com.withings.wiscale2;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.withings.wiscale2.activity.workout.model.WorkoutManager;
import com.withings.wiscale2.b0;
import com.withings.wiscale2.vo2max.ComputeVo2Max;
import com.withings.workout.category.model.WorkoutCategoryManager;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
/* loaded from: classes4.dex */
public final class w0 implements f6.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b0.a f62890a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w0(b0.a aVar) {
        this.f62890a = aVar;
    }

    @Override // f6.b
    public final androidx.work.o a(Context context, WorkerParameters workerParameters) {
        b0.a aVar = this.f62890a;
        return new ComputeVo2Max(context, workerParameters, b0.i8(aVar.f50287a), aVar.f50287a.S8(), (WorkoutManager) aVar.f50287a.f50223p1.get(), (WorkoutCategoryManager) aVar.f50287a.K1.get(), (kn.e) aVar.f50287a.f50251u.get(), (m70.i) aVar.f50287a.f50258v0.get());
    }
}
