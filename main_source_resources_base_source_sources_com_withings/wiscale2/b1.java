package com.withings.wiscale2;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.withings.wiscale2.b0;
import com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ExchangeBodyTemperatureWithHealthConnectWorker;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
/* loaded from: classes4.dex */
public final class b1 implements f6.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b0.a f50290a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b1(b0.a aVar) {
        this.f50290a = aVar;
    }

    @Override // f6.b
    public final androidx.work.o a(Context context, WorkerParameters workerParameters) {
        return new ExchangeBodyTemperatureWithHealthConnectWorker(context, workerParameters, b0.Y4(this.f50290a.f50287a));
    }
}
