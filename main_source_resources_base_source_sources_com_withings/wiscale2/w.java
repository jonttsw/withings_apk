package com.withings.wiscale2;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.withings.wiscale2.b0;
import com.withings.wiscale2.healthsync.google.healthconnect.exchange.vasistas.ExchangeFloorsClimbedWithHealthConnectWorker;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
/* loaded from: classes4.dex */
public final class w implements f6.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b0.a f62889a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(b0.a aVar) {
        this.f62889a = aVar;
    }

    @Override // f6.b
    public final androidx.work.o a(Context context, WorkerParameters workerParameters) {
        b0.a aVar = this.f62889a;
        return new ExchangeFloorsClimbedWithHealthConnectWorker(context, workerParameters, b0.a5(aVar.f50287a), b0.z5(aVar.f50287a));
    }
}
