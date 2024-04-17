package com.withings.wiscale2;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.withings.wiscale2.b0;
import com.withings.wiscale2.healthsync.google.healthconnect.exchange.tracks.ExchangeActivityWithHealthConnectWorker;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
/* loaded from: classes4.dex */
public final class y0 implements f6.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b0.a f62939a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y0(b0.a aVar) {
        this.f62939a = aVar;
    }

    @Override // f6.b
    public final androidx.work.o a(Context context, WorkerParameters workerParameters) {
        b0.a aVar = this.f62939a;
        return new ExchangeActivityWithHealthConnectWorker(context, workerParameters, b0.Z4(aVar.f50287a), b0.W5(aVar.f50287a));
    }
}
