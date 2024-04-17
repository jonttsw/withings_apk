package com.withings.location.repository.data.uc;

import com.withings.location.model.GpsLocation;
import com.withings.location.repository.data.db.GpsLocationDao;
import com.withings.location.repository.data.mapper.GpsLocationEntityMapper;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import nm0.y;
import qm0.d;
/* compiled from: SaveGpsLocations.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0086B¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/withings/location/repository/data/uc/SaveGpsLocations;", "", "", "Lcom/withings/location/model/GpsLocation;", "gpsLocations", "Lnm0/y;", "invoke", "(Ljava/util/List;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/location/repository/data/db/GpsLocationDao;", "dao", "Lcom/withings/location/repository/data/db/GpsLocationDao;", "Lcom/withings/location/repository/data/mapper/GpsLocationEntityMapper;", "mapper", "Lcom/withings/location/repository/data/mapper/GpsLocationEntityMapper;", "<init>", "(Lcom/withings/location/repository/data/db/GpsLocationDao;Lcom/withings/location/repository/data/mapper/GpsLocationEntityMapper;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SaveGpsLocations {
    private final GpsLocationDao dao;
    private final GpsLocationEntityMapper mapper;

    @Inject
    public SaveGpsLocations(GpsLocationDao dao, GpsLocationEntityMapper mapper) {
        u.j(dao, "dao");
        u.j(mapper, "mapper");
        this.dao = dao;
        this.mapper = mapper;
    }

    public final Object invoke(List<GpsLocation> list, d<? super y> dVar) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new SaveGpsLocations$invoke$2(this, list, null), dVar);
        if (withContext == CoroutineSingletons.f76214a) {
            return withContext;
        }
        return y.f85009a;
    }
}
