package com.withings.prediction.remote.repository.api;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import kotlin.Metadata;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
/* compiled from: PredictionRetrofit1Api.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J/\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005H'¢\u0006\u0002\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/withings/prediction/remote/repository/api/PredictionRetrofit1Api;", "", "get", "Lcom/withings/prediction/remote/repository/api/GetPredictionResponse;", NavigationArguments.USER_ID, "", "type", "", "lastUpdateInSeconds", "(JLjava/lang/Integer;Ljava/lang/Long;)Lcom/withings/prediction/remote/repository/api/GetPredictionResponse;", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface PredictionRetrofit1Api {
    @POST("/v2/prediction?action=get")
    @FormUrlEncoded
    GetPredictionResponse get(@Field("userid") long j5, @Field("prediction_type") Integer num, @Field("lastupdate") Long l5);
}
