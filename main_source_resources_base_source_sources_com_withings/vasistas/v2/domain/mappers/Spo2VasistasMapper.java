package com.withings.vasistas.v2.domain.mappers;

import com.withings.vasistas.model.Vasistas;
import com.withings.vasistas.v2.model.Spo2Vasistas;
import com.withings.vasistas.v2.model.Vasistas;
import com.withings.vasistas.ws.WsVasistasSerie;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import org.joda.time.Duration;
/* compiled from: Spo2VasistasMapper.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004¨\u0006\t"}, d2 = {"Lcom/withings/vasistas/v2/domain/mappers/Spo2VasistasMapper;", "", "()V", "fromVasistas", "Lcom/withings/vasistas/v2/model/Spo2Vasistas;", WsVasistasSerie.KEY_VASISTAS, "Lcom/withings/vasistas/model/Vasistas;", "toVasistas", "spo2Vasistas", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Spo2VasistasMapper {
    public final Spo2Vasistas fromVasistas(Vasistas vasistas) {
        long j5;
        int i11;
        u.j(vasistas, "vasistas");
        Long id2 = vasistas.getId();
        long j11 = 0;
        if (id2 != null) {
            j5 = id2.longValue();
        } else {
            j5 = 0;
        }
        DateTime startDate = vasistas.getStartDate();
        Duration duration = new Duration(vasistas.getDurationMillis());
        Long userId = vasistas.getUserId();
        if (userId != null) {
            j11 = userId.longValue();
        }
        Vasistas.MetaData metaData = new Vasistas.MetaData(j11, Long.valueOf(vasistas.getDeviceId()), vasistas.getDeviceModel(), vasistas.getVersion(), vasistas.getAppPfmId(), vasistas.getAlgoVersion(), vasistas.isSyncedToWs());
        Integer spo2 = vasistas.getSpo2();
        if (spo2 != null) {
            i11 = spo2.intValue();
        } else {
            i11 = 0;
        }
        return new Spo2Vasistas(j5, startDate, duration, metaData, i11, vasistas.getSpo2Quality());
    }

    public final com.withings.vasistas.model.Vasistas toVasistas(Spo2Vasistas spo2Vasistas) {
        long j5;
        u.j(spo2Vasistas, "spo2Vasistas");
        com.withings.vasistas.model.Vasistas vasistas = new com.withings.vasistas.model.Vasistas(null, null, null, 0, null, null, null, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0.0f, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0L, null, null, null, null, null, false, 0, 0, 0, null, null, null, null, false, null, -1, 2047, null);
        vasistas.setId(Long.valueOf(spo2Vasistas.getId()));
        vasistas.setType(Vasistas.VasistasType.SPO2);
        vasistas.setCategory(Vasistas.Category.SPO2);
        vasistas.setStartDate(spo2Vasistas.getStartDate());
        vasistas.setDurationMillis((int) spo2Vasistas.getDuration().getMillis());
        vasistas.setUserId(Long.valueOf(spo2Vasistas.getMetaData().getUserId()));
        Long deviceId = spo2Vasistas.getMetaData().getDeviceId();
        if (deviceId != null) {
            j5 = deviceId.longValue();
        } else {
            j5 = 0;
        }
        vasistas.setDeviceId(j5);
        vasistas.setDeviceModel(spo2Vasistas.getMetaData().getDeviceModel());
        vasistas.setVersion(spo2Vasistas.getMetaData().getVersion());
        vasistas.setAppPfmId(spo2Vasistas.getMetaData().getAppPlatformId());
        vasistas.setAlgoVersion(spo2Vasistas.getMetaData().getAlgoVersion());
        vasistas.setSyncedToWs(spo2Vasistas.getMetaData().isSynced());
        vasistas.setSpo2(Integer.valueOf(spo2Vasistas.getSpo2()));
        vasistas.setSpo2Quality(spo2Vasistas.getSpo2Quality());
        return vasistas;
    }
}
