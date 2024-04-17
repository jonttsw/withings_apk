package com.withings.target.data.api;

import com.withings.target.data.api.model.TargetSeriesWS;
import com.withings.target.data.api.model.TargetSingleWS;
import kotlin.Metadata;
import org.jivesoftware.smackx.rsm.packet.RSMSet;
import org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement;
import qm0.d;
/* compiled from: TargetRemoteRepository.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H¦@¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\r\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\r\u0010\u000eJ2\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH¦@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lcom/withings/target/data/api/TargetRemoteRepository;", "", "", "syncContext", "withSyncContext", "(Ljava/lang/String;)Lcom/withings/target/data/api/TargetRemoteRepository;", "", "userid", "lastUpdate", "Lcom/withings/target/data/api/model/TargetSeriesWS;", "get", "(JJLqm0/d;)Ljava/lang/Object;", "targets", RSMSet.ELEMENT, "(JLjava/lang/String;Lqm0/d;)Ljava/lang/Object;", "", "type", ValidateElement.RangeValidateElement.METHOD, "measureType", "Lcom/withings/target/data/api/model/TargetSingleWS;", "unset", "(JILjava/lang/Integer;ILqm0/d;)Ljava/lang/Object;", "target_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface TargetRemoteRepository {
    Object get(long j5, long j11, d<? super TargetSeriesWS> dVar);

    Object set(long j5, String str, d<? super TargetSeriesWS> dVar);

    Object unset(long j5, int i11, Integer num, int i12, d<? super TargetSingleWS> dVar);

    TargetRemoteRepository withSyncContext(String str);
}
