package com.withings.library.healthscore.domain.sleep.v2;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.library.healthscore.domain.interfaces.SleepApneaScoreInterface;
import com.withings.library.healthscore.models.api.SleepTrack;
import com.withings.library.healthscore.utils.date.DateUtilsKt;
import en0.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import nm0.j;
/* compiled from: CalculateSleepApneaBurdenScoreV2UseCase.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u0004\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/healthscore/domain/sleep/v2/CalculateSleepApneaBurdenScoreV2UseCase;", "Lcom/withings/library/healthscore/domain/interfaces/SleepApneaScoreInterface;", "()V", "getSleepApneaScore", "", "sleepNights", "", "Lcom/withings/library/healthscore/models/api/SleepTrack;", "startDate", "", "(Ljava/util/List;J)Ljava/lang/Double;", "HealthScore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CalculateSleepApneaBurdenScoreV2UseCase implements SleepApneaScoreInterface {
    @Override // com.withings.library.healthscore.domain.interfaces.SleepApneaScoreInterface
    public Double getSleepApneaScore(List<SleepTrack> sleepNights, long j5) {
        double d11;
        double d12;
        double atan;
        j jVar;
        j jVar2;
        u.j(sleepNights, "sleepNights");
        ArrayList arrayList = new ArrayList();
        for (Object obj : sleepNights) {
            if (((SleepTrack) obj).getApneaHypopneaIndex() != null) {
                arrayList.add(obj);
            }
        }
        if (!(!arrayList.isEmpty())) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            SleepTrack sleepTrack = (SleepTrack) next;
            if (sleepTrack.getApneaHypopneaIndex() != null && r.o(15.0d, 29.0d).c(sleepTrack.getApneaHypopneaIndex())) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            SleepTrack sleepTrack2 = (SleepTrack) next2;
            if (sleepTrack2.getApneaHypopneaIndex() != null && sleepTrack2.getApneaHypopneaIndex().doubleValue() > 30.0d) {
                arrayList3.add(next2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            SleepTrack sleepTrack3 = (SleepTrack) it3.next();
            if (sleepTrack3.getApneaHypopneaIndex() != null) {
                jVar2 = new j(Double.valueOf(DateUtilsKt.getCoefFromDate(sleepTrack3.getDateInMillis(), j5) * 1), Double.valueOf(DateUtilsKt.getCoefFromDate(sleepTrack3.getDateInMillis(), j5)));
            } else {
                jVar2 = null;
            }
            if (jVar2 != null) {
                arrayList4.add(jVar2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            SleepTrack sleepTrack4 = (SleepTrack) it4.next();
            Double apneaHypopneaIndex = sleepTrack4.getApneaHypopneaIndex();
            if (apneaHypopneaIndex != null) {
                jVar = new j(Double.valueOf(DateUtilsKt.getCoefFromDate(sleepTrack4.getDateInMillis(), j5) * apneaHypopneaIndex.doubleValue()), Double.valueOf(DateUtilsKt.getCoefFromDate(sleepTrack4.getDateInMillis(), j5)));
            } else {
                jVar = null;
            }
            if (jVar != null) {
                arrayList5.add(jVar);
            }
        }
        ArrayList arrayList6 = new ArrayList(x.y(arrayList, 10));
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            arrayList6.add(Double.valueOf(DateUtilsKt.getCoefFromDate(((SleepTrack) it5.next()).getDateInMillis(), j5)));
        }
        double E0 = x.E0(arrayList6);
        if (arrayList5.isEmpty() && arrayList4.isEmpty()) {
            return Double.valueOf(100.0d);
        }
        if (!arrayList4.isEmpty()) {
            Iterator it6 = arrayList4.iterator();
            double d13 = 0.0d;
            while (it6.hasNext()) {
                d13 += ((Number) ((j) it6.next()).d()).doubleValue();
            }
            d11 = (d13 * 100.0d) / E0;
        } else {
            d11 = 0.0d;
        }
        if (!arrayList5.isEmpty()) {
            Iterator it7 = arrayList5.iterator();
            double d14 = 0.0d;
            while (it7.hasNext()) {
                d14 += ((Number) ((j) it7.next()).d()).doubleValue();
            }
            d12 = (d14 * 100.0d) / E0;
        } else {
            d12 = 0.0d;
        }
        if (d12 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            atan = 100 - (Math.atan(((d11 / 2) + d12) / 12) * 58.82352941176471d);
        } else {
            atan = 100 - (Math.atan(d11 / 19) * 58.82352941176471d);
        }
        return Double.valueOf(Math.min(100.0d, Math.max(20.0d, Math.min(100.0d, atan))));
    }
}
