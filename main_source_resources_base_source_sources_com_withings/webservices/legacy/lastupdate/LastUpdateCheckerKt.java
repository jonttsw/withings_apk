package com.withings.webservices.legacy.lastupdate;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import org.joda.time.Instant;
/* compiled from: LastUpdateChecker.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0006\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0007¨\u0006\b"}, d2 = {"shouldMakeCallForLastUpdate", "", "localLastUpdate", "", "remoteLastUpdate", "(JLjava/lang/Long;)Z", "Lorg/joda/time/DateTime;", "Lorg/joda/time/Instant;", "webservices-legacy_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LastUpdateCheckerKt {
    public static final boolean shouldMakeCallForLastUpdate(long j5, Long l5) {
        if ((l5 != null ? l5.longValue() : 0L) != 0) {
            if (j5 < (l5 != null ? l5.longValue() : 0L)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean shouldMakeCallForLastUpdate(DateTime dateTime, long j5) {
        u.j(dateTime, "<this>");
        return dateTime.getMillis() != 0 && j5 < dateTime.getMillis();
    }

    public static final boolean shouldMakeCallForLastUpdate(DateTime dateTime, DateTime localLastUpdate) {
        u.j(dateTime, "<this>");
        u.j(localLastUpdate, "localLastUpdate");
        return shouldMakeCallForLastUpdate(dateTime, localLastUpdate.getMillis());
    }

    public static final boolean shouldMakeCallForLastUpdate(DateTime dateTime, Instant localLastUpdate) {
        u.j(dateTime, "<this>");
        u.j(localLastUpdate, "localLastUpdate");
        return shouldMakeCallForLastUpdate(dateTime, localLastUpdate.getMillis());
    }
}
