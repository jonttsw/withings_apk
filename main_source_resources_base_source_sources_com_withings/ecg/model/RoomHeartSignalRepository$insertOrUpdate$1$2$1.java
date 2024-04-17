package com.withings.ecg.model;

import com.withings.ecg.model.HeartSignalMeasurement;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.l;
/* compiled from: RoomHeartSignalRepository.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/withings/ecg/model/HeartSignalMeasurement$Measure;", "invoke", "(Lcom/withings/ecg/model/HeartSignalMeasurement$Measure;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class RoomHeartSignalRepository$insertOrUpdate$1$2$1 extends w implements l<HeartSignalMeasurement.Measure, Boolean> {
    public static final RoomHeartSignalRepository$insertOrUpdate$1$2$1 INSTANCE = new RoomHeartSignalRepository$insertOrUpdate$1$2$1();

    RoomHeartSignalRepository$insertOrUpdate$1$2$1() {
        super(1);
    }

    @Override // ym0.l
    public final Boolean invoke(HeartSignalMeasurement.Measure it) {
        u.j(it, "it");
        return Boolean.valueOf(it.getType() == 11);
    }
}
