package com.withings.vasistas.ws;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.vasistas.ws.WsVasistasSerie;
import com.withings.webservices.legacy.common.exception.WsAuthFailedException;
import kotlin.Metadata;
import nm0.y;
/* compiled from: VasistasRetrofit2Api.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JF\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0004\b\n\u0010\u000bJ2\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0006H§@¢\u0006\u0004\b\u000e\u0010\u000fJ<\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u000e\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lcom/withings/vasistas/ws/VasistasRetrofit2Api;", "", "", NavigationArguments.USER_ID, "startDate", "endDate", "", "category", "measureTypes", "Lcom/withings/vasistas/ws/WsVasistasSerie$Response;", "getVasistas", "(JJJLjava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "vasistasSerie", "Lnm0/y;", "storeVasistas", "(JLjava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "", "deviceId", "(JLjava/lang/String;Ljava/lang/String;ILqm0/d;)Ljava/lang/Object;", "core-data-vasistas_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface VasistasRetrofit2Api {
    @fr0.e
    @fr0.o("v2/measure?action=getvasistas")
    Object getVasistas(@fr0.c("userid") long j5, @fr0.c("startdate") long j11, @fr0.c("enddate") long j12, @fr0.c("vasistas_category") String str, @fr0.c(encoded = false, value = "meastype") String str2, qm0.d<? super WsVasistasSerie.Response> dVar);

    @fr0.e
    @fr0.o("v2/measure?action=storewamhf")
    Object storeVasistas(@fr0.c("userid") long j5, @fr0.c("vasistas_category") String str, @fr0.c("measuregrps") String str2, @fr0.c("deviceid") int i11, qm0.d<? super y> dVar) throws WsAuthFailedException;

    @fr0.e
    @fr0.o("v2/measure?action=storewamhf")
    Object storeVasistas(@fr0.c("userid") long j5, @fr0.c("vasistas_category") String str, @fr0.c("measuregrps") String str2, qm0.d<? super y> dVar);
}
