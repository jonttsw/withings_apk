package com.withings.vasistas.v2.domain.mappers;

import com.withings.vasistas.model.Vasistas;
import com.withings.vasistas.v2.model.PauseVasistas;
import com.withings.vasistas.v2.model.Vasistas;
import com.withings.vasistas.ws.WsVasistasSerie;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import org.joda.time.Duration;
/* compiled from: PauseVasistasMapper.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004¨\u0006\t"}, d2 = {"Lcom/withings/vasistas/v2/domain/mappers/PauseVasistasMapper;", "", "()V", "fromVasistas", "Lcom/withings/vasistas/v2/model/PauseVasistas;", WsVasistasSerie.KEY_VASISTAS, "Lcom/withings/vasistas/model/Vasistas;", "toVasistas", "pauseVasistas", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PauseVasistasMapper {
    public final PauseVasistas fromVasistas(Vasistas vasistas) {
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
        Integer pauseType = vasistas.getPauseType();
        if (pauseType != null) {
            i11 = pauseType.intValue();
        } else {
            i11 = 0;
        }
        return new PauseVasistas(j5, startDate, duration, metaData, i11);
    }

    public final com.withings.vasistas.model.Vasistas toVasistas(PauseVasistas pauseVasistas) {
        long j5;
        u.j(pauseVasistas, "pauseVasistas");
        com.withings.vasistas.model.Vasistas vasistas = new com.withings.vasistas.model.Vasistas(null, null, null, 0, null, null, null, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0.0f, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0L, null, null, null, null, null, false, 0, 0, 0, null, null, null, null, false, null, -1, 2047, null);
        vasistas.setId(Long.valueOf(pauseVasistas.getId()));
        vasistas.setType(Vasistas.VasistasType.EMPTY);
        vasistas.setCategory(Vasistas.Category.PAUSE);
        vasistas.setStartDate(pauseVasistas.getStartDate());
        vasistas.setDurationMillis((int) pauseVasistas.getDuration().getMillis());
        vasistas.setUserId(Long.valueOf(pauseVasistas.getMetaData().getUserId()));
        Long deviceId = pauseVasistas.getMetaData().getDeviceId();
        if (deviceId != null) {
            j5 = deviceId.longValue();
        } else {
            j5 = 0;
        }
        vasistas.setDeviceId(j5);
        vasistas.setDeviceModel(pauseVasistas.getMetaData().getDeviceModel());
        vasistas.setVersion(pauseVasistas.getMetaData().getVersion());
        vasistas.setAppPfmId(pauseVasistas.getMetaData().getAppPlatformId());
        vasistas.setAlgoVersion(pauseVasistas.getMetaData().getAlgoVersion());
        vasistas.setSyncedToWs(pauseVasistas.getMetaData().isSynced());
        vasistas.setPauseType(Integer.valueOf(pauseVasistas.getPauseType()));
        return vasistas;
    }
}
