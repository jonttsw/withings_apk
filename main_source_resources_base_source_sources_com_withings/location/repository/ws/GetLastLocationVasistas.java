package com.withings.location.repository.ws;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.location.repository.data.uc.GetLastGpsLocationSyncedDate;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import qm0.d;
/* compiled from: GetLastLocationVasistas.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J2\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/withings/location/repository/ws/GetLastLocationVasistas;", "", "", NavigationArguments.USER_ID, "Lorg/joda/time/DateTime;", "lastUpdate", "", "syncContext", "", "maxDaysToSync", "Lnm0/y;", "invoke", "(JLorg/joda/time/DateTime;Ljava/lang/String;ILqm0/d;)Ljava/lang/Object;", "Lcom/withings/location/repository/data/uc/GetLastGpsLocationSyncedDate;", "getLastSync", "Lcom/withings/location/repository/data/uc/GetLastGpsLocationSyncedDate;", "Lcom/withings/location/repository/ws/GetLocationVasistas;", "getLocationVasistas", "Lcom/withings/location/repository/ws/GetLocationVasistas;", "<init>", "(Lcom/withings/location/repository/data/uc/GetLastGpsLocationSyncedDate;Lcom/withings/location/repository/ws/GetLocationVasistas;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class GetLastLocationVasistas {
    private final GetLastGpsLocationSyncedDate getLastSync;
    private final GetLocationVasistas getLocationVasistas;

    @Inject
    public GetLastLocationVasistas(GetLastGpsLocationSyncedDate getLastSync, GetLocationVasistas getLocationVasistas) {
        u.j(getLastSync, "getLastSync");
        u.j(getLocationVasistas, "getLocationVasistas");
        this.getLastSync = getLastSync;
        this.getLocationVasistas = getLocationVasistas;
    }

    public static /* synthetic */ Object invoke$default(GetLastLocationVasistas getLastLocationVasistas, long j5, DateTime dateTime, String str, int i11, d dVar, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return getLastLocationVasistas.invoke(j5, dateTime, str, i11, dVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:1|(2:3|(14:5|6|7|8|(1:(1:(6:12|13|14|(1:16)|17|18)(2:21|22))(1:23))(2:40|(2:42|43)(4:44|(1:46)(1:51)|47|(1:49)(1:50)))|24|(1:26)(1:39)|27|(2:29|(1:31))|38|33|(5:35|(1:37)|13|14|(0))|17|18))|54|6|7|8|(0)(0)|24|(0)(0)|27|(0)|38|33|(0)|17|18) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a9, code lost:
        if (r0 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00cd, code lost:
        r0 = nm0.l.a(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b2 A[Catch: all -> 0x0031, TRY_ENTER, TryCatch #0 {all -> 0x0031, blocks: (B:13:0x002c, B:49:0x00ca, B:46:0x00b2), top: B:57:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(long r15, org.joda.time.DateTime r17, java.lang.String r18, int r19, qm0.d<? super nm0.y> r20) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.location.repository.ws.GetLastLocationVasistas.invoke(long, org.joda.time.DateTime, java.lang.String, int, qm0.d):java.lang.Object");
    }
}
