package com.withings.target.data.api;

import com.withings.target.data.api.model.TargetSeriesWS;
import com.withings.target.data.api.model.TargetSingleWS;
import com.withings.webservices.legacy.common.exception.ObjectNotFoundException;
import fr0.c;
import fr0.e;
import fr0.o;
import kotlin.Metadata;
import org.jivesoftware.smackx.rsm.packet.RSMSet;
import org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement;
import qm0.d;
/* compiled from: TargetRetrofit2Api.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J$\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\n\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0004\b\n\u0010\u000bJ:\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\f2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\b\u0001\u0010\u000f\u001a\u00020\fH§@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lcom/withings/target/data/api/TargetRetrofit2Api;", "", "", "userid", "lastUpdate", "Lcom/withings/target/data/api/model/TargetSeriesWS;", "get", "(JJLqm0/d;)Ljava/lang/Object;", "", "targets", RSMSet.ELEMENT, "(JLjava/lang/String;Lqm0/d;)Ljava/lang/Object;", "", "type", ValidateElement.RangeValidateElement.METHOD, "measureType", "Lcom/withings/target/data/api/model/TargetSingleWS;", "unset", "(JILjava/lang/Integer;ILqm0/d;)Ljava/lang/Object;", "target_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface TargetRetrofit2Api {
    @e
    @o("v2/target?action=get")
    Object get(@c("userid") long j5, @c("lastupdate") long j11, d<? super TargetSeriesWS> dVar);

    @e
    @o("v2/target?action=set")
    Object set(@c("userid") long j5, @c("series") String str, d<? super TargetSeriesWS> dVar);

    @e
    @o("v2/target?action=unset")
    Object unset(@c("userid") long j5, @c("target_type") int i11, @c("range") Integer num, @c("target_id") int i12, d<? super TargetSingleWS> dVar) throws ObjectNotFoundException;
}
