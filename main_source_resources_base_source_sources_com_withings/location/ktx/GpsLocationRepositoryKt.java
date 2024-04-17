package com.withings.location.ktx;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.location.model.GpsLocation;
import com.withings.location.repository.GpsLocationRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.flow.FlowKt;
import org.joda.time.DateTime;
import qm0.d;
/* compiled from: GpsLocationRepository.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u001a:\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0086@¢\u0006\u0004\b\b\u0010\t\u001a7\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/withings/location/repository/GpsLocationRepository;", "", NavigationArguments.USER_ID, "Lorg/joda/time/DateTime;", "from", "to", "", "Lcom/withings/location/model/GpsLocation;", "getOnce", "(Lcom/withings/location/repository/GpsLocationRepository;JLorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lqm0/d;)Ljava/lang/Object;", "getOnceBlocking", "(Lcom/withings/location/repository/GpsLocationRepository;JLorg/joda/time/DateTime;Lorg/joda/time/DateTime;)Ljava/util/List;", "core"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class GpsLocationRepositoryKt {
    public static final Object getOnce(GpsLocationRepository gpsLocationRepository, long j5, DateTime dateTime, DateTime dateTime2, d<? super List<GpsLocation>> dVar) {
        return FlowKt.first(gpsLocationRepository.get(j5, dateTime, dateTime2), dVar);
    }

    public static /* synthetic */ Object getOnce$default(GpsLocationRepository gpsLocationRepository, long j5, DateTime dateTime, DateTime dateTime2, d dVar, int i11, Object obj) {
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i11 & 2) != 0) {
            dateTime3 = null;
        } else {
            dateTime3 = dateTime;
        }
        if ((i11 & 4) != 0) {
            dateTime4 = null;
        } else {
            dateTime4 = dateTime2;
        }
        return getOnce(gpsLocationRepository, j5, dateTime3, dateTime4, dVar);
    }

    public static final List<GpsLocation> getOnceBlocking(GpsLocationRepository gpsLocationRepository, long j5, DateTime dateTime, DateTime dateTime2) {
        Object runBlocking$default;
        u.j(gpsLocationRepository, "<this>");
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new GpsLocationRepositoryKt$getOnceBlocking$1(gpsLocationRepository, j5, dateTime, dateTime2, null), 1, null);
        return (List) runBlocking$default;
    }

    public static /* synthetic */ List getOnceBlocking$default(GpsLocationRepository gpsLocationRepository, long j5, DateTime dateTime, DateTime dateTime2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            dateTime = null;
        }
        if ((i11 & 4) != 0) {
            dateTime2 = null;
        }
        return getOnceBlocking(gpsLocationRepository, j5, dateTime, dateTime2);
    }
}
