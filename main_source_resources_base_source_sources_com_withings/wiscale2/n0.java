package com.withings.wiscale2;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.withings.wiscale2.b0;
import com.withings.wiscale2.healthsync.google.fit.MeasureImportWorker;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
/* loaded from: classes4.dex */
public final class n0 implements f6.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b0.a f58720a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n0(b0.a aVar) {
        this.f58720a = aVar;
    }

    @Override // f6.b
    public final androidx.work.o a(Context context, WorkerParameters workerParameters) {
        dagger.internal.d dVar;
        b0.a aVar = this.f58720a;
        ny.a J = aVar.f50287a.J();
        dVar = aVar.f50287a.f50276y0;
        return new MeasureImportWorker(context, workerParameters, J, (iy.d) dVar.get(), (m70.i) aVar.f50287a.f50258v0.get(), (t10.e) aVar.f50287a.f50217o1.get(), (iy.e) aVar.f50287a.L0.get(), (sw.a) aVar.f50287a.f50264w0.get());
    }
}
