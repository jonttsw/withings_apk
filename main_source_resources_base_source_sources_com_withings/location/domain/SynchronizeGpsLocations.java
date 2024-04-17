package com.withings.location.domain;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.location.repository.GpsLocationRepository;
import com.withings.webservices.legacy.lastupdate.LastUpdate;
import com.withings.webservices.legacy.lastupdate.UserLastUpdate;
import com.withings.webservices.legacy.sync.BaseSyncAction;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import org.joda.time.DateTime;
/* compiled from: SynchronizeGpsLocations.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/withings/location/domain/SynchronizeGpsLocations;", "Lcom/withings/webservices/legacy/sync/BaseSyncAction;", "Lnm0/y;", "run", "()V", "Lcom/withings/location/repository/GpsLocationRepository;", "gpsLocationRepository", "Lcom/withings/location/repository/GpsLocationRepository;", "", NavigationArguments.USER_ID, "J", "", "maxDaysToSync", "I", "<init>", "(Lcom/withings/location/repository/GpsLocationRepository;JI)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SynchronizeGpsLocations extends BaseSyncAction {
    private final GpsLocationRepository gpsLocationRepository;
    private final int maxDaysToSync;
    private final long userId;

    public SynchronizeGpsLocations(GpsLocationRepository gpsLocationRepository, long j5, int i11) {
        u.j(gpsLocationRepository, "gpsLocationRepository");
        this.gpsLocationRepository = gpsLocationRepository;
        this.userId = j5;
        this.maxDaysToSync = i11;
    }

    @Override // com.withings.webservices.legacy.sync.BaseSyncAction, com.withings.webservices.legacy.sync.SyncAction.WithSyncContext, com.withings.webservices.legacy.sync.SyncAction, vh.a
    public void run() {
        DateTime dateTime;
        UserLastUpdate user;
        LastUpdate lastUpdate = getLastUpdate();
        if (lastUpdate != null && (user = lastUpdate.getUser(this.userId)) != null) {
            dateTime = user.getVasistasForCategory("location");
        } else {
            dateTime = null;
        }
        BuildersKt__BuildersKt.runBlocking$default(null, new SynchronizeGpsLocations$run$1(this, dateTime, null), 1, null);
    }
}
