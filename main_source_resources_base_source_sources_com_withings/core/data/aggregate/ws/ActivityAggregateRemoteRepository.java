package com.withings.core.data.aggregate.ws;

import com.withings.core.data.aggregate.ws.WsAggregate;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.manualLogging.data.webservice.healthAttribute.GetHealthAttributeResponse;
import com.withings.vasistas.ws.WsVasistasSerie;
import com.withings.webservices.legacy.common.exception.AlreadyExistsException;
import com.withings.webservices.legacy.common.exception.SynchroTimeException;
import kotlin.Metadata;
import qm0.d;
/* compiled from: ActivityAggregateRemoteRepository.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\tH¦@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lcom/withings/core/data/aggregate/ws/ActivityAggregateRemoteRepository;", "", "", "syncContext", "withSyncContext", "(Ljava/lang/String;)Lcom/withings/core/data/aggregate/ws/ActivityAggregateRemoteRepository;", "", NavigationArguments.USER_ID, "lastUpdate", "", GetHealthAttributeResponse.FIELD_OFFSET_NAME, "Lcom/withings/core/data/aggregate/ws/WsAggregate$Response;", "getAggregate", "(JJILqm0/d;)Ljava/lang/Object;", "aggregateJson", WsVasistasSerie.KEY_MODEL, "Lcom/withings/core/data/aggregate/ws/StoreAggregateResponse;", "storeAggregate", "(JLjava/lang/String;ILqm0/d;)Ljava/lang/Object;", "core-data_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface ActivityAggregateRemoteRepository {
    Object getAggregate(long j5, long j11, int i11, d<? super WsAggregate.Response> dVar);

    Object storeAggregate(long j5, String str, int i11, d<? super StoreAggregateResponse> dVar) throws AlreadyExistsException, SynchroTimeException;

    ActivityAggregateRemoteRepository withSyncContext(String str);
}
