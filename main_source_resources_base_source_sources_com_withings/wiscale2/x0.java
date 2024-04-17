package com.withings.wiscale2;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.withings.wiscale2.activity.workout.model.WorkoutManager;
import com.withings.wiscale2.b0;
import com.withings.wiscale2.vo2max.DeleteVo2Max;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
/* loaded from: classes4.dex */
public final class x0 implements f6.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b0.a f62931a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public x0(b0.a aVar) {
        this.f62931a = aVar;
    }

    @Override // f6.b
    public final androidx.work.o a(Context context, WorkerParameters workerParameters) {
        b0.a aVar = this.f62931a;
        return new DeleteVo2Max(context, workerParameters, b0.h8(aVar.f50287a), (WorkoutManager) aVar.f50287a.f50223p1.get(), (r70.c) aVar.f50287a.T0.get());
    }
}
