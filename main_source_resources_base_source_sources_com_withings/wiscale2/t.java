package com.withings.wiscale2;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.withings.wiscale2.b0;
import com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ExchangeDiscretHeartRateWithHealthConnectWorker;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
/* loaded from: classes4.dex */
public final class t implements f6.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b0.a f61721a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(b0.a aVar) {
        this.f61721a = aVar;
    }

    @Override // f6.b
    public final androidx.work.o a(Context context, WorkerParameters workerParameters) {
        return new ExchangeDiscretHeartRateWithHealthConnectWorker(context, workerParameters, b0.Y4(this.f61721a.f50287a));
    }
}
