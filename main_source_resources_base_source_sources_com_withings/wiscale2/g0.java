package com.withings.wiscale2;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.withings.wiscale2.b0;
import com.withings.wiscale2.healthsync.huawei.exchange.measuregroups.ExchangeWeightWithHuaweiHealthWorker;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
/* loaded from: classes4.dex */
public final class g0 implements f6.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b0.a f56122a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g0(b0.a aVar) {
        this.f56122a = aVar;
    }

    @Override // f6.b
    public final androidx.work.o a(Context context, WorkerParameters workerParameters) {
        return new ExchangeWeightWithHuaweiHealthWorker(context, workerParameters, b0.Y4(this.f56122a.f50287a));
    }
}
