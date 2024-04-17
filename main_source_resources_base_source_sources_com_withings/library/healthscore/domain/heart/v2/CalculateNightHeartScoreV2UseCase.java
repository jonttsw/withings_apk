package com.withings.library.healthscore.domain.heart.v2;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.library.healthscore.domain.interfaces.NightHeartScoreInterface;
import com.withings.library.healthscore.models.api.SleepTrack;
import com.withings.library.healthscore.utils.date.DateUtilsKt;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import nm0.j;
import pm0.a;
/* compiled from: CalculateNightHeartScoreV2UseCase.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J-\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/withings/library/healthscore/domain/heart/v2/CalculateNightHeartScoreV2UseCase;", "Lcom/withings/library/healthscore/domain/interfaces/NightHeartScoreInterface;", "()V", "getNightHeartScore", "", "isBornGenderFemale", "", "sleepNights", "", "Lcom/withings/library/healthscore/models/api/SleepTrack;", "startDate", "", "(ZLjava/util/List;J)Ljava/lang/Double;", "HealthScore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CalculateNightHeartScoreV2UseCase implements NightHeartScoreInterface {
    @Override // com.withings.library.healthscore.domain.interfaces.NightHeartScoreInterface
    public Double getNightHeartScore(boolean z5, List<SleepTrack> sleepNights, long j5) {
        double max;
        Integer averageHeartRate;
        u.j(sleepNights, "sleepNights");
        ArrayList arrayList = new ArrayList();
        for (Object obj : x.D0(x.Q0(sleepNights), new Comparator() { // from class: com.withings.library.healthscore.domain.heart.v2.CalculateNightHeartScoreV2UseCase$getNightHeartScore$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                return a.b(Long.valueOf(((SleepTrack) t11).getDateInMillis()), Long.valueOf(((SleepTrack) t12).getDateInMillis()));
            }
        })) {
            if (((SleepTrack) obj).getAverageHeartRate() != null) {
                arrayList.add(obj);
            }
        }
        ArrayList<j> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            j jVar = null;
            if (!it.hasNext()) {
                break;
            }
            SleepTrack sleepTrack = (SleepTrack) it.next();
            if (sleepTrack.getAverageHeartRate() != null) {
                jVar = new j(Double.valueOf(DateUtilsKt.getCoefFromDate(sleepTrack.getDateInMillis(), j5) * averageHeartRate.intValue()), Double.valueOf(DateUtilsKt.getCoefFromDate(sleepTrack.getDateInMillis(), j5)));
            }
            if (jVar != null) {
                arrayList2.add(jVar);
            }
        }
        if (!(!arrayList2.isEmpty())) {
            return null;
        }
        double d11 = 0.0d;
        for (j jVar2 : arrayList2) {
            d11 += ((Number) jVar2.c()).doubleValue();
        }
        double d12 = 0.0d;
        for (j jVar3 : arrayList2) {
            d12 += ((Number) jVar3.d()).doubleValue();
        }
        double d13 = d11 / d12;
        if (30.0d <= d13 && d13 <= 200.0d && !z5) {
            max = Math.max(20.0d, 100.0d - (Math.max((double) FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, d13 - 45.0d) * 2.0d));
        } else {
            max = Math.max(20.0d, 100.0d - (Math.max((double) FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, d13 - 50.0d) * 2.0d));
        }
        return Double.valueOf(max);
    }
}
