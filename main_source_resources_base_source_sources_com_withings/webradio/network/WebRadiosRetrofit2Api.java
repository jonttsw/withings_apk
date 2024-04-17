package com.withings.webradio.network;

import com.withings.webradio.model.WsAirableWebRadioResponse;
import com.withings.webservices.legacy.withings.model.airable.WsAirableSubCategoryList;
import com.withings.webservices.legacy.withings.model.airable.WsAirableTree;
import fr0.c;
import fr0.e;
import fr0.o;
import kotlin.Metadata;
import org.apache.http.cookie.ClientCookie;
import qm0.d;
/* compiled from: WebRadiosRetrofit2Api.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\b\u001a\u00020\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\b\u0010\u0006J\u001c\u0010\n\u001a\u00020\t2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\n\u0010\u0006¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/withings/webradio/network/WebRadiosRetrofit2Api;", "", "", ClientCookie.PATH_ATTR, "Lcom/withings/webservices/legacy/withings/model/airable/WsAirableSubCategoryList;", "getAirableSubCategory", "(Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/webradio/model/WsAirableWebRadioResponse;", "getAirableWebRadios", "Lcom/withings/webservices/legacy/withings/model/airable/WsAirableTree;", "getAirableTree", "webradio_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface WebRadiosRetrofit2Api {
    @e
    @o("v2/partner?action=getdata&method=GET&brand=29")
    Object getAirableSubCategory(@c("path") String str, d<? super WsAirableSubCategoryList> dVar);

    @e
    @o("v2/partner?action=getdata&method=GET&brand=29")
    Object getAirableTree(@c("path") String str, d<? super WsAirableTree> dVar);

    @e
    @o("v2/partner?action=getdata&method=GET&brand=29")
    Object getAirableWebRadios(@c("path") String str, d<? super WsAirableWebRadioResponse> dVar);
}
