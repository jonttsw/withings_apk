package com.withings.location.repository.ws;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import qm0.d;
import r70.c;
/* compiled from: SynchronizeLocationVasistas.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J2\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/withings/location/repository/ws/SynchronizeLocationVasistas;", "", "", NavigationArguments.USER_ID, "Lorg/joda/time/DateTime;", "lastUpdate", "", "syncContext", "", "maxDaysToSync", "Lnm0/y;", "invoke", "(JLorg/joda/time/DateTime;Ljava/lang/String;ILqm0/d;)Ljava/lang/Object;", "Lr70/c;", "userRepository", "Lr70/c;", "Lcom/withings/location/repository/ws/GetLastLocationVasistas;", "getLastLocationVasistas", "Lcom/withings/location/repository/ws/GetLastLocationVasistas;", "Lcom/withings/location/repository/ws/SendLocationVasistas;", "sendLocationVasistas", "Lcom/withings/location/repository/ws/SendLocationVasistas;", "<init>", "(Lr70/c;Lcom/withings/location/repository/ws/GetLastLocationVasistas;Lcom/withings/location/repository/ws/SendLocationVasistas;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SynchronizeLocationVasistas {
    private final GetLastLocationVasistas getLastLocationVasistas;
    private final SendLocationVasistas sendLocationVasistas;
    private final c userRepository;

    @Inject
    public SynchronizeLocationVasistas(c userRepository, GetLastLocationVasistas getLastLocationVasistas, SendLocationVasistas sendLocationVasistas) {
        u.j(userRepository, "userRepository");
        u.j(getLastLocationVasistas, "getLastLocationVasistas");
        u.j(sendLocationVasistas, "sendLocationVasistas");
        this.userRepository = userRepository;
        this.getLastLocationVasistas = getLastLocationVasistas;
        this.sendLocationVasistas = sendLocationVasistas;
    }

    public static /* synthetic */ Object invoke$default(SynchronizeLocationVasistas synchronizeLocationVasistas, long j5, DateTime dateTime, String str, int i11, d dVar, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return synchronizeLocationVasistas.invoke(j5, dateTime, str, i11, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(long r18, org.joda.time.DateTime r20, java.lang.String r21, int r22, qm0.d<? super nm0.y> r23) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.location.repository.ws.SynchronizeLocationVasistas.invoke(long, org.joda.time.DateTime, java.lang.String, int, qm0.d):java.lang.Object");
    }
}
