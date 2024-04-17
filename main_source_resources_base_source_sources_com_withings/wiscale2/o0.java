package com.withings.wiscale2;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.withings.wiscale2.appupgrade.workers.MigrateLocalFeaturesWorker;
import com.withings.wiscale2.b0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
/* loaded from: classes4.dex */
public final class o0 implements f6.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b0.a f58807a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o0(b0.a aVar) {
        this.f58807a = aVar;
    }

    @Override // f6.b
    public final androidx.work.o a(Context context, WorkerParameters workerParameters) {
        return new MigrateLocalFeaturesWorker(context, workerParameters, (com.withings.wiscale2.device.common.feature.u) this.f58807a.f50287a.N2.get());
    }
}
