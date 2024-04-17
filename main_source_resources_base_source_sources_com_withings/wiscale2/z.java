package com.withings.wiscale2;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.withings.wiscale2.b0;
import com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ExchangeMuscleMassWithHealthConnectWorker;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
/* loaded from: classes4.dex */
public final class z implements f6.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b0.a f62946a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(b0.a aVar) {
        this.f62946a = aVar;
    }

    @Override // f6.b
    public final androidx.work.o a(Context context, WorkerParameters workerParameters) {
        return new ExchangeMuscleMassWithHealthConnectWorker(context, workerParameters, b0.Y4(this.f62946a.f50287a));
    }
}
