package com.withings.wiscale2.healthsync.google.fit;

import com.google.android.gms.fitness.data.DataPoint;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
/* compiled from: MeasureImportWorker.kt */
/* loaded from: classes5.dex */
final class k extends w implements ym0.l<DataPoint, ky.d> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MeasureImportWorker f56463a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(MeasureImportWorker measureImportWorker) {
        super(1);
        this.f56463a = measureImportWorker;
    }

    @Override // ym0.l
    public final ky.d invoke(DataPoint dataPoint) {
        DataPoint dataPoint2 = dataPoint;
        u.j(dataPoint2, "dataPoint");
        return MeasureImportWorker.o(this.f56463a, dataPoint2);
    }
}
