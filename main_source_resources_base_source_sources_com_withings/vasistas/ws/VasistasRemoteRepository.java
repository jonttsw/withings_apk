package com.withings.vasistas.ws;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.vasistas.ws.WsVasistasSerie;
import kotlin.Metadata;
import nm0.y;
/* compiled from: VasistasRemoteRepository.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J<\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\r\u0010\u000eJ,\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0011\u0010\u0012J4\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u0013H¦@¢\u0006\u0004\b\u0011\u0010\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lcom/withings/vasistas/ws/VasistasRemoteRepository;", "", "", "syncContext", "withSyncContext", "(Ljava/lang/String;)Lcom/withings/vasistas/ws/VasistasRemoteRepository;", "", NavigationArguments.USER_ID, "startDate", "endDate", "category", "measureTypes", "Lcom/withings/vasistas/ws/WsVasistasSerie$Response;", "getVasistas", "(JJJLjava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "vasistasSerie", "Lnm0/y;", "storeVasistas", "(JLjava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "", "deviceId", "(JLjava/lang/String;Ljava/lang/String;ILqm0/d;)Ljava/lang/Object;", "core-data-vasistas_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface VasistasRemoteRepository {
    Object getVasistas(long j5, long j11, long j12, String str, String str2, qm0.d<? super WsVasistasSerie.Response> dVar);

    Object storeVasistas(long j5, String str, String str2, int i11, qm0.d<? super y> dVar);

    Object storeVasistas(long j5, String str, String str2, qm0.d<? super y> dVar);

    VasistasRemoteRepository withSyncContext(String str);
}
