package com.withings.location.repository;

import androidx.health.connect.client.records.CervicalMucusRecord;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.location.model.GpsLocation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.flow.Flow;
import nm0.y;
import org.joda.time.DateTime;
import qm0.d;
/* compiled from: GpsLocationRepository.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\bf\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cJ\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J;\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\r2\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0015\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H¦@¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005H¦@¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001dÀ\u0006\u0003"}, d2 = {"Lcom/withings/location/repository/GpsLocationRepository;", "", "", "Lcom/withings/location/model/GpsLocation;", "gpsLocations", "Lnm0/y;", "add", "(Ljava/util/List;Lqm0/d;)Ljava/lang/Object;", "", NavigationArguments.USER_ID, "Lorg/joda/time/DateTime;", "from", "to", "Lkotlinx/coroutines/flow/Flow;", "get", "(JLorg/joda/time/DateTime;Lorg/joda/time/DateTime;)Lkotlinx/coroutines/flow/Flow;", "lastUpdate", "", "maxDaysToSync", "", "syncContext", "synchronize", "(JLorg/joda/time/DateTime;ILjava/lang/String;Lqm0/d;)Ljava/lang/Object;", CervicalMucusRecord.Appearance.CLEAR, "(Lqm0/d;)Ljava/lang/Object;", "getAddedGpsLocationsEvents", "()Lkotlinx/coroutines/flow/Flow;", "addedGpsLocationsEvents", "Companion", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface GpsLocationRepository {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: GpsLocationRepository.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\t¨\u0006\f"}, d2 = {"Lcom/withings/location/repository/GpsLocationRepository$Companion;", "", "Lcom/withings/location/repository/GpsLocationRepository;", "get", "()Lcom/withings/location/repository/GpsLocationRepository;", "instance", "Lnm0/y;", "init", "(Lcom/withings/location/repository/GpsLocationRepository;)V", "Lcom/withings/location/repository/GpsLocationRepository;", "<init>", "()V", "core"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static GpsLocationRepository instance;

        private Companion() {
        }

        public final GpsLocationRepository get() {
            GpsLocationRepository gpsLocationRepository = instance;
            if (gpsLocationRepository != null) {
                return gpsLocationRepository;
            }
            throw new IllegalArgumentException("you must init for type before".toString());
        }

        public final void init(GpsLocationRepository instance2) {
            u.j(instance2, "instance");
            instance = instance2;
        }
    }

    /* compiled from: GpsLocationRepository.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Flow get$default(GpsLocationRepository gpsLocationRepository, long j5, DateTime dateTime, DateTime dateTime2, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                dateTime = null;
            }
            if ((i11 & 4) != 0) {
                dateTime2 = null;
            }
            return gpsLocationRepository.get(j5, dateTime, dateTime2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get");
    }

    Object add(List<GpsLocation> list, d<? super y> dVar);

    Object clear(d<? super y> dVar);

    Flow<List<GpsLocation>> get(long j5, DateTime dateTime, DateTime dateTime2);

    Flow<List<GpsLocation>> getAddedGpsLocationsEvents();

    Object synchronize(long j5, DateTime dateTime, int i11, String str, d<? super y> dVar);
}
