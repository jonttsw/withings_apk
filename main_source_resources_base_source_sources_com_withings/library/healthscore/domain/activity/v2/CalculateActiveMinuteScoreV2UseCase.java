package com.withings.library.healthscore.domain.activity.v2;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.library.healthscore.domain.interfaces.ActiveMinuteScoreInterface;
import com.withings.library.healthscore.models.internal.activity.ActivityDayWithGoal;
import com.withings.library.healthscore.utils.date.DateUtilsKt;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import nm0.j;
import pm0.a;
/* compiled from: CalculateActiveMinuteScoreV2UseCase.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u0004\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/healthscore/domain/activity/v2/CalculateActiveMinuteScoreV2UseCase;", "Lcom/withings/library/healthscore/domain/interfaces/ActiveMinuteScoreInterface;", "()V", "getActiveMinuteScore", "", "activityAggregates", "", "Lcom/withings/library/healthscore/models/internal/activity/ActivityDayWithGoal;", "startDate", "", "(Ljava/util/List;J)Ljava/lang/Double;", "HealthScore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CalculateActiveMinuteScoreV2UseCase implements ActiveMinuteScoreInterface {
    @Override // com.withings.library.healthscore.domain.interfaces.ActiveMinuteScoreInterface
    public Double getActiveMinuteScore(List<ActivityDayWithGoal> activityAggregates, long j5) {
        long j11;
        u.j(activityAggregates, "activityAggregates");
        List<ActivityDayWithGoal> list = activityAggregates;
        ArrayList<ActivityDayWithGoal> arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            ActivityDayWithGoal activityDayWithGoal = (ActivityDayWithGoal) next;
            Iterator<T> it2 = list.iterator();
            if (it2.hasNext()) {
                obj = it2.next();
                if (it2.hasNext()) {
                    long dateInMillis = ((ActivityDayWithGoal) obj).getDateInMillis();
                    do {
                        Object next2 = it2.next();
                        long dateInMillis2 = ((ActivityDayWithGoal) next2).getDateInMillis();
                        if (dateInMillis > dateInMillis2) {
                            obj = next2;
                            dateInMillis = dateInMillis2;
                        }
                    } while (it2.hasNext());
                }
            }
            ActivityDayWithGoal activityDayWithGoal2 = (ActivityDayWithGoal) obj;
            if (activityDayWithGoal2 != null) {
                j11 = DateUtilsKt.getWeekNumber(activityDayWithGoal2.getDateInMillis());
            } else {
                j11 = 0;
            }
            if (DateUtilsKt.getWeekNumber(activityDayWithGoal.getDateInMillis()) > j11) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(x.y(arrayList, 10));
        for (ActivityDayWithGoal activityDayWithGoal3 : arrayList) {
            arrayList2.add(new j(Double.valueOf(DateUtilsKt.getCoefFromDate(activityDayWithGoal3.getDateInMillis(), j5) * (activityDayWithGoal3.getModerateActivityInMin() + (activityDayWithGoal3.getVigorousActivityInMin() * 2))), Double.valueOf(DateUtilsKt.getCoefFromDate(activityDayWithGoal3.getDateInMillis(), j5))));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (((Number) ((j) obj2).c()).doubleValue() > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                arrayList3.add(obj2);
            }
        }
        List<j> D0 = x.D0(arrayList3, new Comparator() { // from class: com.withings.library.healthscore.domain.activity.v2.CalculateActiveMinuteScoreV2UseCase$getActiveMinuteScore$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                return a.b((Double) ((j) t11).d(), (Double) ((j) t12).d());
            }
        });
        double d11 = 0.0d;
        for (j jVar : D0) {
            d11 += ((Number) jVar.c()).doubleValue();
        }
        HashSet hashSet = new HashSet();
        ArrayList<j> arrayList4 = new ArrayList();
        for (Object obj3 : D0) {
            if (hashSet.add(Double.valueOf(((Number) ((j) obj3).d()).doubleValue()))) {
                arrayList4.add(obj3);
            }
        }
        double d12 = 0.0d;
        for (j jVar2 : arrayList4) {
            d12 += ((Number) jVar2.d()).doubleValue();
        }
        double d13 = d11 / d12;
        if (d13 <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            return null;
        }
        return Double.valueOf(Math.max(20.0d, Math.min(100.0d, d13 / 6.0d)));
    }
}
