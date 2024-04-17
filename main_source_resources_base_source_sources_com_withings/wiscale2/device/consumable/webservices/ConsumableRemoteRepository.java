package com.withings.wiscale2.device.consumable.webservices;

import com.withings.wiscale2.device.consumable.model.GetConsumableResponse;
import kotlin.Metadata;
import qm0.d;
import u70.i;
/* compiled from: ConsumableRemoteRepository.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/withings/wiscale2/device/consumable/webservices/ConsumableRemoteRepository;", "", "", "syncContext", "withSyncContext", "(Ljava/lang/String;)Lcom/withings/wiscale2/device/consumable/webservices/ConsumableRemoteRepository;", "Lu70/i;", "mac", "Lcom/withings/wiscale2/device/consumable/model/GetConsumableResponse;", "get", "(Lu70/i;Lqm0/d;)Ljava/lang/Object;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public interface ConsumableRemoteRepository {
    Object get(i iVar, d<? super GetConsumableResponse> dVar);

    ConsumableRemoteRepository withSyncContext(String str);
}
