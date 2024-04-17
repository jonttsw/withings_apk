package com.withings.vasistas.model;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: ElevationVasistas.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toVasistas", "Lcom/withings/vasistas/model/Vasistas;", "Lcom/withings/vasistas/model/ElevationVasistas;", "core-data-vasistas_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ElevationVasistasKt {
    public static final Vasistas toVasistas(ElevationVasistas elevationVasistas) {
        u.j(elevationVasistas, "<this>");
        Vasistas vasistas = new Vasistas(null, null, null, 0, null, null, null, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0.0f, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0L, null, null, null, null, null, false, 0, 0, 0, null, null, null, null, false, null, -1, 2047, null);
        vasistas.setStartDate(elevationVasistas.getStartDate());
        vasistas.setDurationMillis((int) elevationVasistas.getDurationMillis());
        vasistas.setId(Long.valueOf(elevationVasistas.getId()));
        vasistas.setUserId(Long.valueOf(elevationVasistas.getUserId()));
        vasistas.setAscent(elevationVasistas.getAscent());
        vasistas.setDeviceModel(elevationVasistas.getDeviceModel());
        vasistas.setSyncedToWs(elevationVasistas.getSyncedToWs());
        return vasistas;
    }
}
