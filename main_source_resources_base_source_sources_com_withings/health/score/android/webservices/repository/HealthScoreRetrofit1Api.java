package com.withings.health.score.android.webservices.repository;

import com.withings.health.score.android.webservices.model.BatchStoreResponsesWs;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.manualLogging.data.webservice.healthAttribute.GetHealthAttributeResponse;
import kotlin.Metadata;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Query;
/* compiled from: HealthScoreRetrofit1Api.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J0\u0010\b\u001a\u00020\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\u00052\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u0007H'J-\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u000f\u001a\u00020\u00052\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000bH'¢\u0006\u0002\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/withings/health/score/android/webservices/repository/HealthScoreRetrofit1Api;", "", "batchStores", "Lcom/withings/health/score/android/webservices/model/BatchStoreResponsesWs;", NavigationArguments.USER_ID, "", "batchScores", "", "createScores", "timestamp", "algorithmVersion", "", "scores", "getScores", "Lcom/withings/health/score/android/webservices/repository/GetScoreResponse;", "lastUpdate", GetHealthAttributeResponse.FIELD_OFFSET_NAME, "(JJLjava/lang/Integer;)Lcom/withings/health/score/android/webservices/repository/GetScoreResponse;", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface HealthScoreRetrofit1Api {

    /* compiled from: HealthScoreRetrofit1Api.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ GetScoreResponse getScores$default(HealthScoreRetrofit1Api healthScoreRetrofit1Api, long j5, long j11, Integer num, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 4) != 0) {
                num = null;
            }
            return healthScoreRetrofit1Api.getScores(j5, j11, num);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getScores");
    }

    @POST("/v2/healthscore?action=batchstore")
    @FormUrlEncoded
    BatchStoreResponsesWs batchStores(@Field("userid") long j5, @Field("batchscores") String str);

    @POST("/v2/healthscore?action=store")
    @FormUrlEncoded
    Object createScores(@Field("userid") long j5, @Field("timestamp") long j11, @Field("algo") int i11, @Field("scores") String str);

    @GET("/v2/healthscore?action=list")
    GetScoreResponse getScores(@Query("userid") long j5, @Query("lastupdate") long j11, @Query("offset") Integer num);
}
