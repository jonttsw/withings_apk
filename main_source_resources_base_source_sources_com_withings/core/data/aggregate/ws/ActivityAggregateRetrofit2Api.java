package com.withings.core.data.aggregate.ws;

import com.withings.core.data.aggregate.ws.WsAggregate;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.manualLogging.data.webservice.healthAttribute.GetHealthAttributeResponse;
import com.withings.vasistas.ws.WsVasistasSerie;
import com.withings.webservices.legacy.common.exception.AlreadyExistsException;
import com.withings.webservices.legacy.common.exception.SynchroTimeException;
import fr0.c;
import fr0.e;
import fr0.o;
import kotlin.Metadata;
import qm0.d;
/* compiled from: ActivityAggregateRetrofit2Api.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J.\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\b\u0010\tJ0\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\f\u001a\u00020\u0005H§@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/withings/core/data/aggregate/ws/ActivityAggregateRetrofit2Api;", "", "", NavigationArguments.USER_ID, "lastUpdate", "", GetHealthAttributeResponse.FIELD_OFFSET_NAME, "Lcom/withings/core/data/aggregate/ws/WsAggregate$Response;", "getAggregate", "(JJILqm0/d;)Ljava/lang/Object;", "", "aggregateJson", WsVasistasSerie.KEY_MODEL, "Lcom/withings/core/data/aggregate/ws/StoreAggregateResponse;", "storeAggregate", "(JLjava/lang/String;ILqm0/d;)Ljava/lang/Object;", "core-data_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface ActivityAggregateRetrofit2Api {
    @e
    @o("v2/measure?action=getagregatewam")
    Object getAggregate(@c("userid") long j5, @c("lastupdate") long j11, @c("offset") int i11, d<? super WsAggregate.Response> dVar);

    @e
    @o("v2/measure?action=storeagregatewam")
    Object storeAggregate(@c("userid") long j5, @c("agreg") String str, @c("model") int i11, d<? super StoreAggregateResponse> dVar) throws AlreadyExistsException, SynchroTimeException;
}
