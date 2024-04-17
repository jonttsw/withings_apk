package com.withings.plan.android.webservice;

import com.withings.plan.android.model.AcknowledgePurchaseWsResponse;
import com.withings.plan.android.model.PlansWsResponse;
import com.withings.plan.android.model.PurchaseStatusWsResponse;
import kotlin.Metadata;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
/* compiled from: PlansRetrofit1Api.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J\b\u0010\b\u001a\u00020\tH'J\u0012\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u0005H'¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/withings/plan/android/webservice/PlansRetrofit1Api;", "", "acknowledgePurchase", "Lcom/withings/plan/android/model/AcknowledgePurchaseWsResponse;", "token", "", "frequency", "", "getPlans", "Lcom/withings/plan/android/model/PlansWsResponse;", "getPurchaseStatus", "Lcom/withings/plan/android/model/PurchaseStatusWsResponse;", "key", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface PlansRetrofit1Api {
    @POST("/v2/plan?action=createservice")
    @FormUrlEncoded
    AcknowledgePurchaseWsResponse acknowledgePurchase(@Field("token") String str, @Field("frequency") int i11);

    @POST("/v2/plan?action=getbyaccountid")
    PlansWsResponse getPlans();

    @POST("/v2/plan?action=getupsertstatus")
    @FormUrlEncoded
    PurchaseStatusWsResponse getPurchaseStatus(@Field("key") String str);
}
