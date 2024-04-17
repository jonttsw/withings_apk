package com.withings.vasistas.model;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: AHIVasistas.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toVasistas", "Lcom/withings/vasistas/model/Vasistas;", "Lcom/withings/vasistas/model/AHIVasistas;", "core-data-vasistas_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AHIVasistasKt {
    public static final Vasistas toVasistas(AHIVasistas aHIVasistas) {
        u.j(aHIVasistas, "<this>");
        Vasistas vasistas = new Vasistas(null, null, null, 0, null, null, null, 0.0f, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0.0f, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0L, null, null, null, null, null, false, 0, 0, 0, null, null, null, null, false, null, -1, 2047, null);
        vasistas.setStartDate(aHIVasistas.getStartDate());
        vasistas.setDurationMillis((int) aHIVasistas.getDurationMillis());
        vasistas.setId(Long.valueOf(aHIVasistas.getId()));
        vasistas.setUserId(Long.valueOf(aHIVasistas.getUserId()));
        vasistas.setApneaHypopneaIndex(Integer.valueOf(aHIVasistas.getApneaHypopneaIndex()));
        vasistas.setBreathingProbability(Integer.valueOf(aHIVasistas.getBreathingDisturbanceProbability()));
        vasistas.setDeviceModel(aHIVasistas.getDeviceModel());
        vasistas.setSyncedToWs(aHIVasistas.getSyncedToWs());
        return vasistas;
    }
}
