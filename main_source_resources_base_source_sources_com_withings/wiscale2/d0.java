package com.withings.wiscale2;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.withings.wiscale2.b0;
import com.withings.wiscale2.healthsync.google.healthconnect.exchange.measuregroups.ExchangeVo2maxWithHealthConnectWorker;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
/* loaded from: classes4.dex */
public final class d0 implements f6.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b0.a f50485a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d0(b0.a aVar) {
        this.f50485a = aVar;
    }

    @Override // f6.b
    public final androidx.work.o a(Context context, WorkerParameters workerParameters) {
        return new ExchangeVo2maxWithHealthConnectWorker(context, workerParameters, b0.Y4(this.f50485a.f50287a));
    }
}
