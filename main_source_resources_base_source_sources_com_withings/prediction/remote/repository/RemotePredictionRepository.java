package com.withings.prediction.remote.repository;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.prediction.remote.model.WsPrediction;
import java.util.List;
import kotlin.Metadata;
import qm0.d;
/* compiled from: RemotePredictionRepository.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H¦@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lcom/withings/prediction/remote/repository/RemotePredictionRepository;", "", "", "syncContext", "withSyncContext", "(Ljava/lang/String;)Lcom/withings/prediction/remote/repository/RemotePredictionRepository;", "", NavigationArguments.USER_ID, "", "type", "lastUpdateInSeconds", "", "Lcom/withings/prediction/remote/model/WsPrediction;", "get", "(JLjava/lang/Integer;Ljava/lang/Long;Lqm0/d;)Ljava/lang/Object;", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface RemotePredictionRepository {

    /* compiled from: RemotePredictionRepository.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object get$default(RemotePredictionRepository remotePredictionRepository, long j5, Integer num, Long l5, d dVar, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                num = null;
            }
            return remotePredictionRepository.get(j5, num, l5, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get");
    }

    Object get(long j5, Integer num, Long l5, d<? super List<WsPrediction>> dVar);

    RemotePredictionRepository withSyncContext(String str);
}
