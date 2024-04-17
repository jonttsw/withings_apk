package com.withings.location.repository.ws.api;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.location.model.VasistasResponse;
import fr0.c;
import fr0.e;
import fr0.o;
import kotlin.Metadata;
import nm0.y;
import qm0.d;
/* compiled from: LocationVasistasRetrofit2Api.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JB\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H§@¢\u0006\u0004\b\n\u0010\u000bJ.\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H§@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/withings/location/repository/ws/api/LocationVasistasRetrofit2Api;", "", "", NavigationArguments.USER_ID, "startDate", "endDate", "", "measureTypes", "category", "Lcom/withings/location/model/VasistasResponse;", "getVasistas", "(JJJLjava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "vasistasSeries", "Lnm0/y;", "storeVasistas", "(JLjava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface LocationVasistasRetrofit2Api {
    @e
    @o("v2/measure?action=getvasistas")
    Object getVasistas(@c("userid") long j5, @c("startdate") long j11, @c("enddate") long j12, @c(encoded = false, value = "meastype") String str, @c("vasistas_category") String str2, d<? super VasistasResponse> dVar);

    @e
    @o("v2/measure?action=storewamhf")
    Object storeVasistas(@c("userid") long j5, @c("measuregrps") String str, @c("vasistas_category") String str2, d<? super y> dVar);
}
