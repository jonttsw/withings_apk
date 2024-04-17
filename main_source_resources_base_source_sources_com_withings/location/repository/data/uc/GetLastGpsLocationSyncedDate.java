package com.withings.location.repository.data.uc;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.location.repository.data.db.GpsLocationDao;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.joda.time.DateTime;
import qm0.d;
/* compiled from: GetLastGpsLocationSyncedDate.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086B¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/withings/location/repository/data/uc/GetLastGpsLocationSyncedDate;", "", "", NavigationArguments.USER_ID, "Lorg/joda/time/DateTime;", "invoke", "(JLqm0/d;)Ljava/lang/Object;", "Lcom/withings/location/repository/data/db/GpsLocationDao;", "gpsLocationDao", "Lcom/withings/location/repository/data/db/GpsLocationDao;", "<init>", "(Lcom/withings/location/repository/data/db/GpsLocationDao;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class GetLastGpsLocationSyncedDate {
    private final GpsLocationDao gpsLocationDao;

    @Inject
    public GetLastGpsLocationSyncedDate(GpsLocationDao gpsLocationDao) {
        u.j(gpsLocationDao, "gpsLocationDao");
        this.gpsLocationDao = gpsLocationDao;
    }

    public final Object invoke(long j5, d<? super DateTime> dVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new GetLastGpsLocationSyncedDate$invoke$2(this, j5, null), dVar);
    }
}
