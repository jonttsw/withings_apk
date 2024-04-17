package com.withings.plan.android.webservice;

import com.withings.plan.android.model.AcknowledgePurchaseWsResponse;
import com.withings.plan.android.model.PlansWsResponse;
import com.withings.plan.android.model.PurchaseStatusWsResponse;
import fr0.c;
import fr0.e;
import fr0.o;
import kotlin.Metadata;
import qm0.d;
/* compiled from: PlansRetrofit2Api.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J$\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\f\u001a\u00020\u0005H§@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/withings/plan/android/webservice/PlansRetrofit2Api;", "", "Lcom/withings/plan/android/model/PlansWsResponse;", "getPlans", "(Lqm0/d;)Ljava/lang/Object;", "", "token", "", "frequency", "Lcom/withings/plan/android/model/AcknowledgePurchaseWsResponse;", "acknowledgePurchase", "(Ljava/lang/String;ILqm0/d;)Ljava/lang/Object;", "key", "Lcom/withings/plan/android/model/PurchaseStatusWsResponse;", "getPurchaseStatus", "(Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface PlansRetrofit2Api {
    @e
    @o("v2/plan?action=createservice")
    Object acknowledgePurchase(@c("token") String str, @c("frequency") int i11, d<? super AcknowledgePurchaseWsResponse> dVar);

    @o("v2/plan?action=getbyaccountid")
    Object getPlans(d<? super PlansWsResponse> dVar);

    @e
    @o("v2/plan?action=getupsertstatus")
    Object getPurchaseStatus(@c("key") String str, d<? super PurchaseStatusWsResponse> dVar);
}
