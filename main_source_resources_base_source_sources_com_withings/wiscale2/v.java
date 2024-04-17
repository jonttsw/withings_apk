package com.withings.wiscale2;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.withings.wiscale2.b0;
import com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ExchangeFatMassWithHealthConnectWorker;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
/* loaded from: classes4.dex */
public final class v implements f6.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b0.a f62175a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(b0.a aVar) {
        this.f62175a = aVar;
    }

    @Override // f6.b
    public final androidx.work.o a(Context context, WorkerParameters workerParameters) {
        return new ExchangeFatMassWithHealthConnectWorker(context, workerParameters, b0.Y4(this.f62175a.f50287a));
    }
}
