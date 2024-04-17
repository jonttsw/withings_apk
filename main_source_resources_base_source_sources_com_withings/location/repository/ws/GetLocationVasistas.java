package com.withings.location.repository.ws;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.location.repository.GpsLocationRemoteRepository;
import com.withings.location.repository.data.uc.SaveGpsLocations;
import com.withings.location.repository.ws.model.GpsLocationSerializer;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: GetLastLocationVasistas.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB!\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ&\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0082@¢\u0006\u0004\b\b\u0010\tJ0\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0086B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/withings/location/repository/ws/GetLocationVasistas;", "", "", NavigationArguments.USER_ID, "", "Lcom/withings/location/model/VasistasSeries;", "series", "Lnm0/y;", "insertLocationsFromWs", "(JLjava/util/List;Lqm0/d;)Ljava/lang/Object;", "Lorg/joda/time/DateTime;", "start", "end", "", "syncContext", "invoke", "(JLorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/location/repository/data/uc/SaveGpsLocations;", "saveGpsLocations", "Lcom/withings/location/repository/data/uc/SaveGpsLocations;", "Lcom/withings/location/repository/ws/model/GpsLocationSerializer;", "gpsLocationSerializer", "Lcom/withings/location/repository/ws/model/GpsLocationSerializer;", "Lcom/withings/location/repository/GpsLocationRemoteRepository;", "gpsLocationRemoteRepository", "Lcom/withings/location/repository/GpsLocationRemoteRepository;", "<init>", "(Lcom/withings/location/repository/data/uc/SaveGpsLocations;Lcom/withings/location/repository/ws/model/GpsLocationSerializer;Lcom/withings/location/repository/GpsLocationRemoteRepository;)V", "Companion", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class GetLocationVasistas {
    public static final Companion Companion = new Companion(null);
    private static final long SYNC_WINDOW_MILLIS = 21600000;
    private final GpsLocationRemoteRepository gpsLocationRemoteRepository;
    private final GpsLocationSerializer gpsLocationSerializer;
    private final SaveGpsLocations saveGpsLocations;

    /* compiled from: GetLastLocationVasistas.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/withings/location/repository/ws/GetLocationVasistas$Companion;", "", "()V", "SYNC_WINDOW_MILLIS", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    @Inject
    public GetLocationVasistas(SaveGpsLocations saveGpsLocations, GpsLocationSerializer gpsLocationSerializer, GpsLocationRemoteRepository gpsLocationRemoteRepository) {
        u.j(saveGpsLocations, "saveGpsLocations");
        u.j(gpsLocationSerializer, "gpsLocationSerializer");
        u.j(gpsLocationRemoteRepository, "gpsLocationRemoteRepository");
        this.saveGpsLocations = saveGpsLocations;
        this.gpsLocationSerializer = gpsLocationSerializer;
        this.gpsLocationRemoteRepository = gpsLocationRemoteRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object insertLocationsFromWs(long r6, java.util.List<com.withings.location.model.VasistasSeries> r8, qm0.d<? super nm0.y> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.withings.location.repository.ws.GetLocationVasistas$insertLocationsFromWs$1
            if (r0 == 0) goto L13
            r0 = r9
            com.withings.location.repository.ws.GetLocationVasistas$insertLocationsFromWs$1 r0 = (com.withings.location.repository.ws.GetLocationVasistas$insertLocationsFromWs$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.location.repository.ws.GetLocationVasistas$insertLocationsFromWs$1 r0 = new com.withings.location.repository.ws.GetLocationVasistas$insertLocationsFromWs$1
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            long r6 = r0.J$0
            java.lang.Object r8 = r0.L$1
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r2 = r0.L$0
            com.withings.location.repository.ws.GetLocationVasistas r2 = (com.withings.location.repository.ws.GetLocationVasistas) r2
            nm0.l.b(r9)
            goto L43
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            nm0.l.b(r9)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
            r2 = r5
        L43:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L66
            java.lang.Object r9 = r8.next()
            com.withings.location.model.VasistasSeries r9 = (com.withings.location.model.VasistasSeries) r9
            com.withings.location.repository.ws.model.GpsLocationSerializer r4 = r2.gpsLocationSerializer
            java.util.List r9 = r4.getGpsLocations(r6, r9)
            com.withings.location.repository.data.uc.SaveGpsLocations r4 = r2.saveGpsLocations
            r0.L$0 = r2
            r0.L$1 = r8
            r0.J$0 = r6
            r0.label = r3
            java.lang.Object r9 = r4.invoke(r9, r0)
            if (r9 != r1) goto L43
            return r1
        L66:
            nm0.y r6 = nm0.y.f85009a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.location.repository.ws.GetLocationVasistas.insertLocationsFromWs(long, java.util.List, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0112 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0113  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0110 -> B:13:0x0043). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(long r28, org.joda.time.DateTime r30, org.joda.time.DateTime r31, java.lang.String r32, qm0.d<? super nm0.y> r33) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.location.repository.ws.GetLocationVasistas.invoke(long, org.joda.time.DateTime, org.joda.time.DateTime, java.lang.String, qm0.d):java.lang.Object");
    }
}
