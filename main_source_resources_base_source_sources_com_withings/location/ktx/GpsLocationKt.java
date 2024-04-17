package com.withings.location.ktx;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.location.model.GpsLocation;
import com.withings.location.model.Pause;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.ReadableInstant;
/* compiled from: GpsLocation.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0012\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004¨\u0006\b"}, d2 = {"isBetweenPauses", "", "Lcom/withings/location/model/GpsLocation;", "previousPause", "Lcom/withings/location/model/Pause;", "nextPause", "isInPause", ConstantsWs.VASISTAS_CATEGORY_PAUSE, "core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GpsLocationKt {
    public static final boolean isBetweenPauses(GpsLocation gpsLocation, Pause previousPause, Pause nextPause) {
        u.j(gpsLocation, "<this>");
        u.j(previousPause, "previousPause");
        u.j(nextPause, "nextPause");
        if (gpsLocation.getDate().compareTo((ReadableInstant) previousPause.getEnd()) > 0 && gpsLocation.getDate().compareTo((ReadableInstant) nextPause.getStart()) < 0) {
            return true;
        }
        return false;
    }

    public static final boolean isInPause(GpsLocation gpsLocation, Pause pause) {
        u.j(gpsLocation, "<this>");
        u.j(pause, "pause");
        if (gpsLocation.getDate().compareTo((ReadableInstant) pause.getEnd()) <= 0 && gpsLocation.getDate().compareTo((ReadableInstant) pause.getStart()) >= 0) {
            return true;
        }
        return false;
    }
}
