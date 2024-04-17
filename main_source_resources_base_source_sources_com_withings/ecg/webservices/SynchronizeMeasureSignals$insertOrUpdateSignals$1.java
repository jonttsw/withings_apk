package com.withings.ecg.webservices;

import com.withings.ecg.model.HeartSignalMeasurement;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.l;
/* compiled from: SynchronizeMeasureSignals.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/withings/ecg/model/HeartSignalMeasurement;", "invoke", "(Lcom/withings/ecg/model/HeartSignalMeasurement;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SynchronizeMeasureSignals$insertOrUpdateSignals$1 extends w implements l<HeartSignalMeasurement, Boolean> {
    final /* synthetic */ long $localLastUpdate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SynchronizeMeasureSignals$insertOrUpdateSignals$1(long j5) {
        super(1);
        this.$localLastUpdate = j5;
    }

    @Override // ym0.l
    public final Boolean invoke(HeartSignalMeasurement it) {
        u.j(it, "it");
        return Boolean.valueOf(it.getModified() > this.$localLastUpdate);
    }
}
