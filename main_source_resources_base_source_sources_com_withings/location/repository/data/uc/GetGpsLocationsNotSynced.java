package com.withings.location.repository.data.uc;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.location.model.GpsLocation;
import com.withings.location.repository.data.db.GpsLocationDao;
import com.withings.location.repository.data.mapper.GpsLocationEntityMapper;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.joda.time.DateTime;
import qm0.d;
/* compiled from: GetGpsLocationsNotSynced.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J.\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0086B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/withings/location/repository/data/uc/GetGpsLocationsNotSynced;", "", "", NavigationArguments.USER_ID, "Lorg/joda/time/DateTime;", "from", "to", "", "Lcom/withings/location/model/GpsLocation;", "invoke", "(JLorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/location/repository/data/db/GpsLocationDao;", "dao", "Lcom/withings/location/repository/data/db/GpsLocationDao;", "Lcom/withings/location/repository/data/mapper/GpsLocationEntityMapper;", "mapper", "Lcom/withings/location/repository/data/mapper/GpsLocationEntityMapper;", "<init>", "(Lcom/withings/location/repository/data/db/GpsLocationDao;Lcom/withings/location/repository/data/mapper/GpsLocationEntityMapper;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class GetGpsLocationsNotSynced {
    private final GpsLocationDao dao;
    private final GpsLocationEntityMapper mapper;

    @Inject
    public GetGpsLocationsNotSynced(GpsLocationDao dao, GpsLocationEntityMapper mapper) {
        u.j(dao, "dao");
        u.j(mapper, "mapper");
        this.dao = dao;
        this.mapper = mapper;
    }

    public final Object invoke(long j5, DateTime dateTime, DateTime dateTime2, d<? super List<GpsLocation>> dVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new GetGpsLocationsNotSynced$invoke$2(this, j5, dateTime, dateTime2, null), dVar);
    }
}
