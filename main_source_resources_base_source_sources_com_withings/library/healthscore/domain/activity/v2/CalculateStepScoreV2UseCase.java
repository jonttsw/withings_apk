package com.withings.library.healthscore.domain.activity.v2;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.library.healthscore.domain.interfaces.StepScoreInterface;
import com.withings.library.healthscore.models.internal.activity.ActivityDayWithGoal;
import com.withings.library.healthscore.utils.date.DateUtilsKt;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import nm0.o;
import pm0.a;
/* compiled from: CalculateStepScoreV2UseCase.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u0004\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/healthscore/domain/activity/v2/CalculateStepScoreV2UseCase;", "Lcom/withings/library/healthscore/domain/interfaces/StepScoreInterface;", "()V", "getStepScore", "", "activityAggregates", "", "Lcom/withings/library/healthscore/models/internal/activity/ActivityDayWithGoal;", "startDate", "", "(Ljava/util/List;J)Ljava/lang/Double;", "HealthScore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CalculateStepScoreV2UseCase implements StepScoreInterface {
    @Override // com.withings.library.healthscore.domain.interfaces.StepScoreInterface
    public Double getStepScore(List<ActivityDayWithGoal> activityAggregates, long j5) {
        double d11;
        u.j(activityAggregates, "activityAggregates");
        List<ActivityDayWithGoal> list = activityAggregates;
        ArrayList arrayList = new ArrayList(x.y(list, 10));
        for (ActivityDayWithGoal activityDayWithGoal : list) {
            arrayList.add(new o(Double.valueOf(DateUtilsKt.getCoefFromDate(activityDayWithGoal.getDateInMillis(), j5) * activityDayWithGoal.getStepsForTheDay()), Double.valueOf(DateUtilsKt.getCoefFromDate(activityDayWithGoal.getDateInMillis(), j5) * activityDayWithGoal.getStepsGoalForTheDay()), Double.valueOf(DateUtilsKt.getCoefFromDate(activityDayWithGoal.getDateInMillis(), j5))));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            d11 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            if (!hasNext) {
                break;
            }
            Object next = it.next();
            if (((Number) ((o) next).d()).doubleValue() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                arrayList2.add(next);
            }
        }
        List<o> D0 = x.D0(arrayList2, new Comparator() { // from class: com.withings.library.healthscore.domain.activity.v2.CalculateStepScoreV2UseCase$getStepScore$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                return a.b((Double) ((o) t11).e(), (Double) ((o) t12).e());
            }
        });
        double d12 = 0.0d;
        for (o oVar : D0) {
            d12 += ((Number) oVar.d()).doubleValue();
        }
        double d13 = 0.0d;
        for (o oVar2 : D0) {
            d13 += ((Number) oVar2.f()).doubleValue();
        }
        double d14 = d12 / d13;
        double d15 = 0.0d;
        for (o oVar3 : D0) {
            d15 += ((Number) oVar3.e()).doubleValue();
        }
        for (o oVar4 : D0) {
            d11 += ((Number) oVar4.f()).doubleValue();
        }
        double d16 = d15 / d11;
        if (d14 > 100.0d) {
            double d17 = d14 * 100.0d;
            if (d16 < 1000.0d) {
                d16 = 1000.0d;
            }
            return Double.valueOf(Math.max(20.0d, Math.min(100.0d, d17 / d16)));
        }
        return null;
    }
}
