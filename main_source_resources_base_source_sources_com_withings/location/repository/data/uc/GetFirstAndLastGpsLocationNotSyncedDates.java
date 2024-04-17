package com.withings.location.repository.data.uc;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.location.repository.data.db.GpsLocationDao;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import nm0.j;
import org.joda.time.DateTime;
import qm0.d;
/* compiled from: GetFirstAndLastGpsLocationNotSyncedDates.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\u0006\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086B¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/withings/location/repository/data/uc/GetFirstAndLastGpsLocationNotSyncedDates;", "", "", NavigationArguments.USER_ID, "Lnm0/j;", "Lorg/joda/time/DateTime;", "invoke", "(JLqm0/d;)Ljava/lang/Object;", "Lcom/withings/location/repository/data/db/GpsLocationDao;", "dao", "Lcom/withings/location/repository/data/db/GpsLocationDao;", "<init>", "(Lcom/withings/location/repository/data/db/GpsLocationDao;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class GetFirstAndLastGpsLocationNotSyncedDates {
    private final GpsLocationDao dao;

    @Inject
    public GetFirstAndLastGpsLocationNotSyncedDates(GpsLocationDao dao) {
        u.j(dao, "dao");
        this.dao = dao;
    }

    public final Object invoke(long j5, d<? super j<DateTime, DateTime>> dVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new GetFirstAndLastGpsLocationNotSyncedDates$invoke$2(this, j5, null), dVar);
    }
}
