package com.withings.target.data.api;

import com.withings.target.data.api.model.TargetSeriesWS;
import com.withings.target.data.api.model.TargetSingleWS;
import com.withings.webservices.legacy.common.exception.ObjectNotFoundException;
import kotlin.Metadata;
import org.jivesoftware.smackx.rsm.packet.RSMSet;
import org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
/* compiled from: TargetRetrofit1Api.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'J\u001e\u0010\u0007\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\tH'J7\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\f\u001a\u00020\r2\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0001\u0010\u000f\u001a\u00020\rH'¢\u0006\u0002\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lcom/withings/target/data/api/TargetRetrofit1Api;", "", "get", "Lcom/withings/target/data/api/model/TargetSeriesWS;", "userid", "", "lastUpdate", RSMSet.ELEMENT, "targets", "", "unset", "Lcom/withings/target/data/api/model/TargetSingleWS;", "type", "", ValidateElement.RangeValidateElement.METHOD, "measureType", "(JILjava/lang/Integer;I)Lcom/withings/target/data/api/model/TargetSingleWS;", "target_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface TargetRetrofit1Api {
    @POST("/v2/target?action=get")
    @FormUrlEncoded
    TargetSeriesWS get(@Field("userid") long j5, @Field("lastupdate") long j11);

    @POST("/v2/target?action=set")
    @FormUrlEncoded
    TargetSeriesWS set(@Field("userid") long j5, @Field("series") String str);

    @POST("/v2/target?action=unset")
    @FormUrlEncoded
    TargetSingleWS unset(@Field("userid") long j5, @Field("target_type") int i11, @Field("range") Integer num, @Field("target_id") int i12) throws ObjectNotFoundException;
}
