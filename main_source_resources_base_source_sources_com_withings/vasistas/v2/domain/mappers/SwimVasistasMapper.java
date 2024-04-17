package com.withings.vasistas.v2.domain.mappers;

import com.withings.vasistas.model.Vasistas;
import com.withings.vasistas.v2.model.SwimVasistas;
import com.withings.vasistas.v2.model.Vasistas;
import com.withings.vasistas.ws.WsVasistasSerie;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import org.joda.time.Duration;
/* compiled from: SwimVasistasMapper.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004¨\u0006\t"}, d2 = {"Lcom/withings/vasistas/v2/domain/mappers/SwimVasistasMapper;", "", "()V", "fromVasistas", "Lcom/withings/vasistas/v2/model/SwimVasistas;", WsVasistasSerie.KEY_VASISTAS, "Lcom/withings/vasistas/model/Vasistas;", "toVasistas", "swimVasistas", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SwimVasistasMapper {
    public final SwimVasistas fromVasistas(Vasistas vasistas) {
        long j5;
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
        return new SwimVasistas(j5, startDate, duration, new Vasistas.MetaData(j11, Long.valueOf(vasistas.getDeviceId()), vasistas.getDeviceModel(), vasistas.getVersion(), vasistas.getAppPfmId(), vasistas.getAlgoVersion(), vasistas.isSyncedToWs()), vasistas.getSwimType(), vasistas.getSwimLaps(), vasistas.getSwimMovements());
    }

    public final com.withings.vasistas.model.Vasistas toVasistas(SwimVasistas swimVasistas) {
        long j5;
        u.j(swimVasistas, "swimVasistas");
        com.withings.vasistas.model.Vasistas vasistas = new com.withings.vasistas.model.Vasistas(null, null, null, 0, null, null, null, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0.0f, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0L, null, null, null, null, null, false, 0, 0, 0, null, null, null, null, false, null, -1, 2047, null);
        vasistas.setId(Long.valueOf(swimVasistas.getId()));
        vasistas.setType(Vasistas.VasistasType.SWIM);
        vasistas.setCategory(Vasistas.Category.SWIM);
        vasistas.setStartDate(swimVasistas.getStartDate());
        vasistas.setDurationMillis((int) swimVasistas.getDuration().getMillis());
        vasistas.setUserId(Long.valueOf(swimVasistas.getMetaData().getUserId()));
        Long deviceId = swimVasistas.getMetaData().getDeviceId();
        if (deviceId != null) {
            j5 = deviceId.longValue();
        } else {
            j5 = 0;
        }
        vasistas.setDeviceId(j5);
        vasistas.setDeviceModel(swimVasistas.getMetaData().getDeviceModel());
        vasistas.setVersion(swimVasistas.getMetaData().getVersion());
        vasistas.setAppPfmId(swimVasistas.getMetaData().getAppPlatformId());
        vasistas.setAlgoVersion(swimVasistas.getMetaData().getAlgoVersion());
        vasistas.setSyncedToWs(swimVasistas.getMetaData().isSynced());
        vasistas.setSwimType(swimVasistas.getSwimType());
        vasistas.setSwimLaps(swimVasistas.getSwimLaps());
        vasistas.setSwimMovements(swimVasistas.getSwimMovements());
        return vasistas;
    }
}
