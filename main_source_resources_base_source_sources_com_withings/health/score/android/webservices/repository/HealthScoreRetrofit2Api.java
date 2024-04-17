package com.withings.health.score.android.webservices.repository;

import com.withings.health.score.android.webservices.model.BatchStoreResponsesWs;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.manualLogging.data.webservice.healthAttribute.GetHealthAttributeResponse;
import fr0.c;
import fr0.e;
import fr0.f;
import fr0.o;
import fr0.t;
import kotlin.Metadata;
import nm0.y;
import qm0.d;
/* compiled from: HealthScoreRetrofit2Api.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J8\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u00022\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0004\b\u000f\u0010\u0010J$\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u0007H§@¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lcom/withings/health/score/android/webservices/repository/HealthScoreRetrofit2Api;", "", "", NavigationArguments.USER_ID, "timestamp", "", "algorithmVersion", "", "scores", "Lnm0/y;", "createScores", "(JJILjava/lang/String;Lqm0/d;)Ljava/lang/Object;", "lastUpdate", GetHealthAttributeResponse.FIELD_OFFSET_NAME, "Lcom/withings/health/score/android/webservices/repository/GetScoreResponse;", "getScores", "(JJLjava/lang/Integer;Lqm0/d;)Ljava/lang/Object;", "batchScores", "Lcom/withings/health/score/android/webservices/model/BatchStoreResponsesWs;", "batchStores", "(JLjava/lang/String;Lqm0/d;)Ljava/lang/Object;", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface HealthScoreRetrofit2Api {

    /* compiled from: HealthScoreRetrofit2Api.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object getScores$default(HealthScoreRetrofit2Api healthScoreRetrofit2Api, long j5, long j11, Integer num, d dVar, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 4) != 0) {
                num = null;
            }
            return healthScoreRetrofit2Api.getScores(j5, j11, num, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getScores");
    }

    @e
    @o("v2/healthscore?action=batchstore")
    Object batchStores(@c("userid") long j5, @c("batchscores") String str, d<? super BatchStoreResponsesWs> dVar);

    @e
    @o("v2/healthscore?action=store")
    Object createScores(@c("userid") long j5, @c("timestamp") long j11, @c("algo") int i11, @c("scores") String str, d<? super y> dVar);

    @f("v2/healthscore?action=list")
    Object getScores(@t("userid") long j5, @t("lastupdate") long j11, @t("offset") Integer num, d<? super GetScoreResponse> dVar);
}
