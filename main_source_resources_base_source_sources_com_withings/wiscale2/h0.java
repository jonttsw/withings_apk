package com.withings.wiscale2;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.withings.partner.ws.PartnerRemoteRepository;
import com.withings.wiscale2.b0;
import com.withings.wiscale2.partner.actions.FetchRunkeeperActivitiesWorker;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
/* loaded from: classes4.dex */
public final class h0 implements f6.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b0.a f56163a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h0(b0.a aVar) {
        this.f56163a = aVar;
    }

    @Override // f6.b
    public final androidx.work.o a(Context context, WorkerParameters workerParameters) {
        dagger.internal.d dVar;
        b0.a aVar = this.f56163a;
        dVar = aVar.f50287a.f50157e1;
        return new FetchRunkeeperActivitiesWorker(context, workerParameters, (PartnerRemoteRepository) aVar.f50287a.f50211n1.get(), (t10.e) aVar.f50287a.f50217o1.get(), (ua0.a) ((b0.a) dVar).get());
    }
}
