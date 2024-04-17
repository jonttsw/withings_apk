package com.withings.prediction.remote.repository.api;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import fr0.c;
import fr0.e;
import fr0.o;
import kotlin.Metadata;
import qm0.d;
/* compiled from: PredictionRetrofit2Api.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J2\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/withings/prediction/remote/repository/api/PredictionRetrofit2Api;", "", "", NavigationArguments.USER_ID, "", "type", "lastUpdateInSeconds", "Lcom/withings/prediction/remote/repository/api/GetPredictionResponse;", "get", "(JLjava/lang/Integer;Ljava/lang/Long;Lqm0/d;)Ljava/lang/Object;", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface PredictionRetrofit2Api {
    @e
    @o("v2/prediction?action=get")
    Object get(@c("userid") long j5, @c("prediction_type") Integer num, @c("lastupdate") Long l5, d<? super GetPredictionResponse> dVar);
}
