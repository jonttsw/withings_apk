package com.withings.core.data.aggregate.ws;

import com.withings.core.data.aggregate.ws.WsAggregate;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.manualLogging.data.webservice.healthAttribute.GetHealthAttributeResponse;
import com.withings.vasistas.ws.WsVasistasSerie;
import com.withings.webservices.legacy.common.exception.AlreadyExistsException;
import com.withings.webservices.legacy.common.exception.SynchroTimeException;
import kotlin.Metadata;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
/* compiled from: ActivityAggregateRetrofit1Api.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\bH'J(\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0001\u0010\r\u001a\u00020\bH'¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/withings/core/data/aggregate/ws/ActivityAggregateRetrofit1Api;", "", "getAggregate", "Lcom/withings/core/data/aggregate/ws/WsAggregate$Response;", NavigationArguments.USER_ID, "", "lastUpdate", GetHealthAttributeResponse.FIELD_OFFSET_NAME, "", "storeAggregate", "Lcom/withings/core/data/aggregate/ws/StoreAggregateResponse;", "aggregateJson", "", WsVasistasSerie.KEY_MODEL, "core-data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ActivityAggregateRetrofit1Api {
    @POST("/v2/measure?action=getagregatewam")
    @FormUrlEncoded
    WsAggregate.Response getAggregate(@Field("userid") long j5, @Field("lastupdate") long j11, @Field("offset") int i11);

    @POST("/v2/measure?action=storeagregatewam")
    @FormUrlEncoded
    StoreAggregateResponse storeAggregate(@Field("userid") long j5, @Field("agreg") String str, @Field("model") int i11) throws AlreadyExistsException, SynchroTimeException;
}
