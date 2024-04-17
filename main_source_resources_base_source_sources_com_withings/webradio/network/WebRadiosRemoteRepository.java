package com.withings.webradio.network;

import com.withings.webradio.model.WsAirableWebRadioResponse;
import com.withings.webservices.legacy.withings.model.airable.WsAirableSubCategoryList;
import com.withings.webservices.legacy.withings.model.airable.WsAirableTree;
import kotlin.Metadata;
import org.apache.http.cookie.ClientCookie;
import qm0.d;
/* compiled from: WebRadiosRemoteRepository.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u000b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\r\u0010\t¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/withings/webradio/network/WebRadiosRemoteRepository;", "", "", "syncContext", "withSyncContext", "(Ljava/lang/String;)Lcom/withings/webradio/network/WebRadiosRemoteRepository;", ClientCookie.PATH_ATTR, "Lcom/withings/webservices/legacy/withings/model/airable/WsAirableSubCategoryList;", "getAirableSubCategory", "(Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "Lcom/withings/webradio/model/WsAirableWebRadioResponse;", "getAirableWebRadios", "Lcom/withings/webservices/legacy/withings/model/airable/WsAirableTree;", "getAirableTree", "webradio_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface WebRadiosRemoteRepository {
    Object getAirableSubCategory(String str, d<? super WsAirableSubCategoryList> dVar);

    Object getAirableTree(String str, d<? super WsAirableTree> dVar);

    Object getAirableWebRadios(String str, d<? super WsAirableWebRadioResponse> dVar);

    WebRadiosRemoteRepository withSyncContext(String str);
}
