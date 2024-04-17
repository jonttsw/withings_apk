package com.withings.factor.remote.repository;

import com.withings.factor.remote.model.WsFactor;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import java.util.List;
import kotlin.Metadata;
import nm0.y;
import org.jivesoftware.smackx.disco.packet.DiscoverItems;
import qm0.d;
/* compiled from: RemoteFactorRepository.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H¦@¢\u0006\u0004\b\u000b\u0010\fJ<\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\rH¦@¢\u0006\u0004\b\u0012\u0010\u0013J<\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\rH¦@¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"Lcom/withings/factor/remote/repository/RemoteFactorRepository;", "", "", "syncContext", "withSyncContext", "(Ljava/lang/String;)Lcom/withings/factor/remote/repository/RemoteFactorRepository;", "", NavigationArguments.USER_ID, "lastUpdateInSeconds", "", "Lcom/withings/factor/remote/model/WsFactor;", "get", "(JLjava/lang/Long;Lqm0/d;)Ljava/lang/Object;", "", "factorType", "startDateInSeconds", "endDateInSeconds", "numberOfPills", "store", "(JIJLjava/lang/Long;Ljava/lang/Integer;Lqm0/d;)Ljava/lang/Object;", "factorId", "Lnm0/y;", DiscoverItems.Item.UPDATE_ACTION, "(JJJLjava/lang/Long;Ljava/lang/Integer;Lqm0/d;)Ljava/lang/Object;", "updateEnd", "(JJJLqm0/d;)Ljava/lang/Object;", "delete", "(JJLqm0/d;)Ljava/lang/Object;", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface RemoteFactorRepository {
    Object delete(long j5, long j11, d<? super y> dVar);

    Object get(long j5, Long l5, d<? super List<WsFactor>> dVar);

    Object store(long j5, int i11, long j11, Long l5, Integer num, d<? super Long> dVar);

    Object update(long j5, long j11, long j12, Long l5, Integer num, d<? super y> dVar);

    Object updateEnd(long j5, long j11, long j12, d<? super y> dVar);

    RemoteFactorRepository withSyncContext(String str);
}
