package com.withings.location.repository.ws;

import com.google.gson.JsonArray;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.location.model.GpsLocation;
import com.withings.location.model.VasistasSeries;
import com.withings.location.repository.GpsLocationRemoteRepository;
import com.withings.location.repository.data.uc.DeleteGpsLocations;
import com.withings.location.repository.data.uc.GetFirstAndLastGpsLocationNotSyncedDates;
import com.withings.location.repository.data.uc.GetGpsLocationsNotSynced;
import com.withings.location.repository.data.uc.SaveGpsLocations;
import com.withings.location.repository.ws.model.GpsLocationSerializer;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import nm0.y;
import qm0.d;
import s00.c;
/* compiled from: SendLocationVasistas.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ,2\u00020\u0001:\u0001,BI\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b*\u0010+J\u001e\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0082@¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086B¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lcom/withings/location/repository/ws/SendLocationVasistas;", "", "", "Lcom/withings/location/model/GpsLocation;", "locations", "Lnm0/y;", "setLocationsAsSynced", "(Ljava/util/List;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/location/model/VasistasSeries;", "Lcom/google/gson/JsonArray;", "toJsonArray", "(Lcom/withings/location/model/VasistasSeries;)Lcom/google/gson/JsonArray;", "", NavigationArguments.USER_ID, "", "syncContext", "invoke", "(JLjava/lang/String;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/location/repository/data/uc/GetFirstAndLastGpsLocationNotSyncedDates;", "getFirstAndLastNotSyncedDatesForUser", "Lcom/withings/location/repository/data/uc/GetFirstAndLastGpsLocationNotSyncedDates;", "Lcom/withings/location/repository/data/uc/GetGpsLocationsNotSynced;", "getGpsLocationsNotSynced", "Lcom/withings/location/repository/data/uc/GetGpsLocationsNotSynced;", "Lcom/withings/location/repository/data/uc/SaveGpsLocations;", "saveGpsLocations", "Lcom/withings/location/repository/data/uc/SaveGpsLocations;", "Lcom/withings/location/repository/data/uc/DeleteGpsLocations;", "deleteGpsLocations", "Lcom/withings/location/repository/data/uc/DeleteGpsLocations;", "Lcom/withings/location/repository/ws/model/GpsLocationSerializer;", "gpsLocationSerializer", "Lcom/withings/location/repository/ws/model/GpsLocationSerializer;", "Lcom/withings/location/repository/GpsLocationRemoteRepository;", "gpsLocationRemoteRepository", "Lcom/withings/location/repository/GpsLocationRemoteRepository;", "Ls00/c;", "gsonHandler", "Ls00/c;", "Lcom/withings/location/repository/ws/PartitionOneLocationPerSeconds;", "partitionOneLocationPerSeconds", "Lcom/withings/location/repository/ws/PartitionOneLocationPerSeconds;", "<init>", "(Lcom/withings/location/repository/data/uc/GetFirstAndLastGpsLocationNotSyncedDates;Lcom/withings/location/repository/data/uc/GetGpsLocationsNotSynced;Lcom/withings/location/repository/data/uc/SaveGpsLocations;Lcom/withings/location/repository/data/uc/DeleteGpsLocations;Lcom/withings/location/repository/ws/model/GpsLocationSerializer;Lcom/withings/location/repository/GpsLocationRemoteRepository;Ls00/c;Lcom/withings/location/repository/ws/PartitionOneLocationPerSeconds;)V", "Companion", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SendLocationVasistas {
    public static final Companion Companion = new Companion(null);
    private static final long SYNC_WINDOW_MILLIS = 3600000;
    private final DeleteGpsLocations deleteGpsLocations;
    private final GetFirstAndLastGpsLocationNotSyncedDates getFirstAndLastNotSyncedDatesForUser;
    private final GetGpsLocationsNotSynced getGpsLocationsNotSynced;
    private final GpsLocationRemoteRepository gpsLocationRemoteRepository;
    private final GpsLocationSerializer gpsLocationSerializer;
    private final c gsonHandler;
    private final PartitionOneLocationPerSeconds partitionOneLocationPerSeconds;
    private final SaveGpsLocations saveGpsLocations;

    /* compiled from: SendLocationVasistas.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/withings/location/repository/ws/SendLocationVasistas$Companion;", "", "()V", "SYNC_WINDOW_MILLIS", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    @Inject
    public SendLocationVasistas(GetFirstAndLastGpsLocationNotSyncedDates getFirstAndLastNotSyncedDatesForUser, GetGpsLocationsNotSynced getGpsLocationsNotSynced, SaveGpsLocations saveGpsLocations, DeleteGpsLocations deleteGpsLocations, GpsLocationSerializer gpsLocationSerializer, GpsLocationRemoteRepository gpsLocationRemoteRepository, c gsonHandler, PartitionOneLocationPerSeconds partitionOneLocationPerSeconds) {
        u.j(getFirstAndLastNotSyncedDatesForUser, "getFirstAndLastNotSyncedDatesForUser");
        u.j(getGpsLocationsNotSynced, "getGpsLocationsNotSynced");
        u.j(saveGpsLocations, "saveGpsLocations");
        u.j(deleteGpsLocations, "deleteGpsLocations");
        u.j(gpsLocationSerializer, "gpsLocationSerializer");
        u.j(gpsLocationRemoteRepository, "gpsLocationRemoteRepository");
        u.j(gsonHandler, "gsonHandler");
        u.j(partitionOneLocationPerSeconds, "partitionOneLocationPerSeconds");
        this.getFirstAndLastNotSyncedDatesForUser = getFirstAndLastNotSyncedDatesForUser;
        this.getGpsLocationsNotSynced = getGpsLocationsNotSynced;
        this.saveGpsLocations = saveGpsLocations;
        this.deleteGpsLocations = deleteGpsLocations;
        this.gpsLocationSerializer = gpsLocationSerializer;
        this.gpsLocationRemoteRepository = gpsLocationRemoteRepository;
        this.gsonHandler = gsonHandler;
        this.partitionOneLocationPerSeconds = partitionOneLocationPerSeconds;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object setLocationsAsSynced(List<GpsLocation> list, d<? super y> dVar) {
        if (!list.isEmpty()) {
            List<GpsLocation> list2 = list;
            ArrayList arrayList = new ArrayList(x.y(list2, 10));
            for (GpsLocation gpsLocation : list2) {
                arrayList.add(GpsLocation.copy$default(gpsLocation, 0L, null, GpsLocation.MetaData.copy$default(gpsLocation.getMetadata(), 0L, true, 1, null), null, null, 0.0f, 0.0f, 123, null));
            }
            Object invoke = this.saveGpsLocations.invoke(arrayList, dVar);
            if (invoke == CoroutineSingletons.f76214a) {
                return invoke;
            }
            return y.f85009a;
        }
        return y.f85009a;
    }

    private final JsonArray toJsonArray(VasistasSeries vasistasSeries) {
        JsonArray jsonArray = new JsonArray();
        jsonArray.add(this.gsonHandler.b().create().toJsonTree(vasistasSeries));
        return jsonArray;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x017e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0199 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x01b5 -> B:49:0x01b9). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(long r25, java.lang.String r27, qm0.d<? super nm0.y> r28) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.location.repository.ws.SendLocationVasistas.invoke(long, java.lang.String, qm0.d):java.lang.Object");
    }
}
