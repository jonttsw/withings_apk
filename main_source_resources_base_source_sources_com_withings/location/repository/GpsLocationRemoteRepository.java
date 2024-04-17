package com.withings.location.repository;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.location.model.VasistasResponse;
import kotlin.Metadata;
import nm0.y;
import qm0.d;
/* compiled from: GpsLocationRemoteRepository.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J<\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\r\u0010\u000eJ,\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lcom/withings/location/repository/GpsLocationRemoteRepository;", "", "", "syncContext", "withSyncContext", "(Ljava/lang/String;)Lcom/withings/location/repository/GpsLocationRemoteRepository;", "", NavigationArguments.USER_ID, "startDate", "endDate", "measureTypes", "category", "Lcom/withings/location/model/VasistasResponse;", "getVasistas", "(JJJLjava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "vasistasSeries", "Lnm0/y;", "storeVasistas", "(JLjava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface GpsLocationRemoteRepository {

    /* compiled from: GpsLocationRemoteRepository.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object getVasistas$default(GpsLocationRemoteRepository gpsLocationRemoteRepository, long j5, long j11, long j12, String str, String str2, d dVar, int i11, Object obj) {
        String str3;
        if (obj == null) {
            if ((i11 & 16) != 0) {
                str3 = null;
            } else {
                str3 = str2;
            }
            return gpsLocationRemoteRepository.getVasistas(j5, j11, j12, str, str3, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getVasistas");
    }

    static /* synthetic */ Object storeVasistas$default(GpsLocationRemoteRepository gpsLocationRemoteRepository, long j5, String str, String str2, d dVar, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 4) != 0) {
                str2 = null;
            }
            return gpsLocationRemoteRepository.storeVasistas(j5, str, str2, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: storeVasistas");
    }

    Object getVasistas(long j5, long j11, long j12, String str, String str2, d<? super VasistasResponse> dVar);

    Object storeVasistas(long j5, String str, String str2, d<? super y> dVar);

    GpsLocationRemoteRepository withSyncContext(String str);
}
