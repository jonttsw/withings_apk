package com.withings.factor.remote.repository.api;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import hr.a;
import hr.b;
import kotlin.Metadata;
import org.jivesoftware.smackx.disco.packet.DiscoverItems;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
/* compiled from: FactorRetrofit1Api.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001JE\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00022\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\n\u0010\u000bJE\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00022\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0010\u001a\u00020\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u00022\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u00020\r2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u0002H'¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018À\u0006\u0003"}, d2 = {"Lcom/withings/factor/remote/repository/api/FactorRetrofit1Api;", "", "", NavigationArguments.USER_ID, "", "factorType", "startDate", "endDate", "numberOfPills", "Lhr/b;", "store", "(JIJLjava/lang/Long;Ljava/lang/Integer;)Lhr/b;", "factorId", "Lnm0/y;", DiscoverItems.Item.UPDATE_ACTION, "(JJJLjava/lang/Long;Ljava/lang/Integer;)V", "updateEnd", "(JJLjava/lang/Long;)V", "lastUpdate", "Lhr/a;", "get", "(JLjava/lang/Long;)Lhr/a;", "delete", "(JJ)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface FactorRetrofit1Api {
    @POST("/v2/cyclefactor?action=delete")
    @FormUrlEncoded
    void delete(@Field("userid") long j5, @Field("cyclefactorid") long j11);

    @POST("/v2/cyclefactor?action=get")
    @FormUrlEncoded
    a get(@Field("userid") long j5, @Field("lastupdate") Long l5);

    @POST("/v2/cyclefactor?action=store")
    @FormUrlEncoded
    b store(@Field("userid") long j5, @Field("factor_type") int i11, @Field("startdate") long j11, @Field("enddate") Long l5, @Field("nb_of_pills") Integer num);

    @POST("/v2/cyclefactor?action=update")
    @FormUrlEncoded
    void update(@Field("userid") long j5, @Field("cyclefactorid") long j11, @Field("startdate") long j12, @Field("enddate") Long l5, @Field("nb_of_pills") Integer num);

    @POST("/v2/cyclefactor?action=update")
    @FormUrlEncoded
    void updateEnd(@Field("userid") long j5, @Field("cyclefactorid") long j11, @Field("enddate") Long l5);
}
