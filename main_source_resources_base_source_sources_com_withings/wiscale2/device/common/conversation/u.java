package com.withings.wiscale2.device.common.conversation;

import com.withings.vasistas.model.Vasistas;
import java.util.Arrays;
import org.joda.time.DateTime;
/* compiled from: VasistasSyncConversation.kt */
/* loaded from: classes5.dex */
final class u {

    /* renamed from: a  reason: collision with root package name */
    private final u70.i f50854a;

    /* renamed from: b  reason: collision with root package name */
    private final DateTime f50855b;

    public u(u70.i iVar, DateTime dateTime) {
        this.f50854a = iVar;
        this.f50855b = dateTime;
    }

    public final boolean a(Vasistas vasistas) {
        String str;
        boolean isAfterNow = vasistas.getEnd().minusMinutes(1).isAfterNow();
        u70.i iVar = this.f50854a;
        if (isAfterNow) {
            Vasistas.VasistasType type = vasistas.getType();
            if (type != null) {
                str = type.name();
            } else {
                str = null;
            }
            x70.b.g(this, iVar, "Vasistas sent by the tracker is in the future : " + str + " : " + vasistas, new Object[0]);
        } else if (vasistas.getStartDate().getMillis() == 0) {
            x70.b.g(this, iVar, "Vasistas sent by the tracker has 0 as start timestamp", new Object[0]);
        } else {
            DateTime dateTime = this.f50855b;
            if (dateTime != null && vasistas.getStartDate().isBefore(dateTime)) {
                DateTime startDate = vasistas.getStartDate();
                x70.b.g(this, iVar, String.format("Vasistas date (" + startDate + ") is before the start date asked " + dateTime, Arrays.copyOf(new Object[0], 0)), new Object[0]);
            } else if (vasistas.getCategory() != Vasistas.Category.CORE_TEMPERATURE) {
                return true;
            } else {
                float coreTemperature = vasistas.getCoreTemperature();
                if (35.0f <= coreTemperature && coreTemperature <= 43.0f) {
                    return true;
                }
                x70.b.g(this, iVar, "Core temperature vasistas can't be lower than 35 or higher than 43", new Object[0]);
            }
        }
        return false;
    }
}
