package com.withings.insight.android.repository;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.insight.core.model.HealthInsightResponse;
import kotlin.Metadata;
import retrofit.http.GET;
import retrofit.http.Query;
/* compiled from: HealthInsightRetrofit1Api.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/withings/insight/android/repository/HealthInsightRetrofit1Api;", "", "getInsights", "Lcom/withings/insight/core/model/HealthInsightResponse;", NavigationArguments.USER_ID, "", "lastUpdate", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface HealthInsightRetrofit1Api {
    @GET("v2/healthinsight?action=get")
    HealthInsightResponse getInsights(@Query("userid") long j5, @Query("lastupdate") long j11);
}
