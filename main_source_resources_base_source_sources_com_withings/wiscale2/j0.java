package com.withings.wiscale2;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.withings.wiscale2.b0;
import com.withings.wiscale2.healthsync.samsung.ImportStepsFromSHealth;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DaggerHealthmateApplication_HiltComponents_SingletonC.java */
/* loaded from: classes4.dex */
public final class j0 implements f6.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b0.a f57969a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j0(b0.a aVar) {
        this.f57969a = aVar;
    }

    @Override // f6.b
    public final androidx.work.o a(Context context, WorkerParameters workerParameters) {
        return new ImportStepsFromSHealth(context, workerParameters, b0.z5(this.f57969a.f50287a));
    }
}
