package com.withings.wiscale2;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.withings.wiscale2.b0;
import com.withings.wiscale2.healthsync.samsung.InsertMeasureToSamsungWorker;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
/* loaded from: classes4.dex */
public final class l0 implements f6.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b0.a f57982a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l0(b0.a aVar) {
        this.f57982a = aVar;
    }

    @Override // f6.b
    public final androidx.work.o a(Context context, WorkerParameters workerParameters) {
        zx.v Q8;
        b0.a aVar = this.f57982a;
        Q8 = aVar.f50287a.Q8();
        return new InsertMeasureToSamsungWorker(context, workerParameters, Q8, (iy.e) aVar.f50287a.L0.get());
    }
}
