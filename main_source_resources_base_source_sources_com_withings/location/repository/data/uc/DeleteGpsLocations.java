package com.withings.location.repository.data.uc;

import com.withings.location.model.GpsLocation;
import com.withings.location.repository.data.db.GpsLocationDao;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import nm0.y;
import qm0.d;
/* compiled from: DeleteGpsLocations.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0086B¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/withings/location/repository/data/uc/DeleteGpsLocations;", "", "", "Lcom/withings/location/model/GpsLocation;", "gpsLocations", "Lnm0/y;", "invoke", "(Ljava/util/List;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/location/repository/data/db/GpsLocationDao;", "dao", "Lcom/withings/location/repository/data/db/GpsLocationDao;", "<init>", "(Lcom/withings/location/repository/data/db/GpsLocationDao;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class DeleteGpsLocations {
    private final GpsLocationDao dao;

    @Inject
    public DeleteGpsLocations(GpsLocationDao dao) {
        u.j(dao, "dao");
        this.dao = dao;
    }

    public final Object invoke(List<GpsLocation> list, d<? super y> dVar) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new DeleteGpsLocations$invoke$2(list, this, null), dVar);
        if (withContext == CoroutineSingletons.f76214a) {
            return withContext;
        }
        return y.f85009a;
    }
}
