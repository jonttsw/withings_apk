package com.withings.library.healthscore.domain.sleep.v2;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.library.healthscore.domain.interfaces.WithingsSleepScoreInterface;
import com.withings.library.healthscore.models.api.SleepTrack;
import com.withings.library.healthscore.utils.date.DateUtilsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import nm0.j;
/* compiled from: CalculateWithingsSleepScoreV2UseCase.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u0004\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/healthscore/domain/sleep/v2/CalculateWithingsSleepScoreV2UseCase;", "Lcom/withings/library/healthscore/domain/interfaces/WithingsSleepScoreInterface;", "()V", "getWithingsSleepScore", "", "sleepNights", "", "Lcom/withings/library/healthscore/models/api/SleepTrack;", "startDate", "", "(Ljava/util/List;J)Ljava/lang/Double;", "HealthScore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CalculateWithingsSleepScoreV2UseCase implements WithingsSleepScoreInterface {
    @Override // com.withings.library.healthscore.domain.interfaces.WithingsSleepScoreInterface
    public Double getWithingsSleepScore(List<SleepTrack> sleepNights, long j5) {
        u.j(sleepNights, "sleepNights");
        List<SleepTrack> list = sleepNights;
        ArrayList<j> arrayList = new ArrayList(x.y(list, 10));
        for (SleepTrack sleepTrack : list) {
            arrayList.add(new j(Double.valueOf(DateUtilsKt.getCoefFromDate(sleepTrack.getDateInMillis(), j5) * sleepTrack.getWithingsSleepScore()), Double.valueOf(DateUtilsKt.getCoefFromDate(sleepTrack.getDateInMillis(), j5))));
        }
        if (!arrayList.isEmpty()) {
            double d11 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            double d12 = 0.0d;
            for (j jVar : arrayList) {
                d12 += ((Number) jVar.c()).doubleValue();
            }
            for (j jVar2 : arrayList) {
                d11 += ((Number) jVar2.d()).doubleValue();
            }
            return Double.valueOf(Math.min(100.0d, Math.max(20.0d, d12 / d11)));
        }
        return null;
    }
}
