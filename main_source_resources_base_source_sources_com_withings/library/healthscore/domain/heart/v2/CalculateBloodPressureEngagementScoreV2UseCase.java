package com.withings.library.healthscore.domain.heart.v2;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.library.healthscore.domain.common.ComputeMeasurementDaysUseCase;
import com.withings.library.healthscore.domain.heart.IsHighBloodPressureUseCase;
import com.withings.library.healthscore.domain.interfaces.BloodPressureEngagementScoreInterface;
import com.withings.library.healthscore.models.api.BloodPressureMeasureGroup;
import com.withings.library.healthscore.utils.date.DateUtilsKt;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import pm0.a;
/* compiled from: CalculateBloodPressureEngagementScoreV2UseCase.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J=\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/withings/library/healthscore/domain/heart/v2/CalculateBloodPressureEngagementScoreV2UseCase;", "Lcom/withings/library/healthscore/domain/interfaces/BloodPressureEngagementScoreInterface;", "computeMeasurementDaysUseCase", "Lcom/withings/library/healthscore/domain/common/ComputeMeasurementDaysUseCase;", "isHighBloodPressureUseCase", "Lcom/withings/library/healthscore/domain/heart/IsHighBloodPressureUseCase;", "(Lcom/withings/library/healthscore/domain/common/ComputeMeasurementDaysUseCase;Lcom/withings/library/healthscore/domain/heart/IsHighBloodPressureUseCase;)V", "getBloodPressureEngagementScore", "", "isUsCountry", "", "bloodPressuresData", "", "Lcom/withings/library/healthscore/models/api/BloodPressureMeasureGroup;", "numberOfWeekOfTheAcquisition", "", "startDate", "", "hasBloodPressureData", "(ZLjava/util/List;IJZ)Ljava/lang/Double;", "HealthScore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CalculateBloodPressureEngagementScoreV2UseCase implements BloodPressureEngagementScoreInterface {
    private final ComputeMeasurementDaysUseCase computeMeasurementDaysUseCase;
    private final IsHighBloodPressureUseCase isHighBloodPressureUseCase;

    public CalculateBloodPressureEngagementScoreV2UseCase(ComputeMeasurementDaysUseCase computeMeasurementDaysUseCase, IsHighBloodPressureUseCase isHighBloodPressureUseCase) {
        u.j(computeMeasurementDaysUseCase, "computeMeasurementDaysUseCase");
        u.j(isHighBloodPressureUseCase, "isHighBloodPressureUseCase");
        this.computeMeasurementDaysUseCase = computeMeasurementDaysUseCase;
        this.isHighBloodPressureUseCase = isHighBloodPressureUseCase;
    }

    @Override // com.withings.library.healthscore.domain.interfaces.BloodPressureEngagementScoreInterface
    public Double getBloodPressureEngagementScore(boolean z5, List<BloodPressureMeasureGroup> bloodPressuresData, int i11, long j5, boolean z11) {
        Object next;
        Integer num;
        boolean z12;
        double coefSumForNumberOfWeek;
        Double d11;
        u.j(bloodPressuresData, "bloodPressuresData");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : x.D0(bloodPressuresData, new Comparator() { // from class: com.withings.library.healthscore.domain.heart.v2.CalculateBloodPressureEngagementScoreV2UseCase$getBloodPressureEngagementScore$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                return a.b(Long.valueOf(((BloodPressureMeasureGroup) t11).getDateInMillis()), Long.valueOf(((BloodPressureMeasureGroup) t12).getDateInMillis()));
            }
        })) {
            if (hashSet.add(Integer.valueOf(DateUtilsKt.getDay(((BloodPressureMeasureGroup) obj).getDateInMillis())))) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (this.isHighBloodPressureUseCase.execute(z5, (BloodPressureMeasureGroup) obj2)) {
                arrayList2.add(obj2);
            }
        }
        int execute = this.computeMeasurementDaysUseCase.execute(arrayList);
        int execute2 = this.computeMeasurementDaysUseCase.execute(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (((BloodPressureMeasureGroup) obj3).getDateInMillis() > j5 - DateUtilsKt.getThreeMonthInMillis()) {
                arrayList3.add(obj3);
            }
        }
        Iterator it = arrayList3.iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                long dateInMillis = ((BloodPressureMeasureGroup) next).getDateInMillis();
                do {
                    Object next2 = it.next();
                    long dateInMillis2 = ((BloodPressureMeasureGroup) next2).getDateInMillis();
                    if (dateInMillis > dateInMillis2) {
                        next = next2;
                        dateInMillis = dateInMillis2;
                    }
                } while (it.hasNext());
            }
        }
        BloodPressureMeasureGroup bloodPressureMeasureGroup = (BloodPressureMeasureGroup) next;
        if (bloodPressureMeasureGroup != null) {
            num = Integer.valueOf(DateUtilsKt.getDay(j5) - DateUtilsKt.getDay(bloodPressureMeasureGroup.getDateInMillis()));
        } else {
            num = null;
        }
        long j11 = 4626322717216342016L;
        if (num == null) {
            if (execute <= 2) {
                return null;
            }
            return Double.valueOf(20.0d);
        }
        int day = DateUtilsKt.getDay(j5);
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            Object next3 = it2.next();
            if (it2.hasNext()) {
                long dateInMillis3 = ((BloodPressureMeasureGroup) next3).getDateInMillis();
                while (true) {
                    Object next4 = it2.next();
                    long dateInMillis4 = ((BloodPressureMeasureGroup) next4).getDateInMillis();
                    if (dateInMillis3 > dateInMillis4) {
                        next3 = next4;
                        dateInMillis3 = dateInMillis4;
                    }
                    if (!it2.hasNext()) {
                        break;
                    }
                    j11 = j11;
                }
            }
            int day2 = day - DateUtilsKt.getDay(((BloodPressureMeasureGroup) next3).getDateInMillis());
            int intValue = num.intValue() / 7;
            if (execute2 > 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            double coefSumForNumberOfWeek2 = DateUtilsKt.getCoefSumForNumberOfWeek(intValue);
            int intValue2 = num.intValue() % 7;
            double coefForWeek = DateUtilsKt.getCoefForWeek(intValue + 1);
            ArrayList<BloodPressureMeasureGroup> arrayList4 = new ArrayList();
            for (Object obj4 : arrayList) {
                if (((BloodPressureMeasureGroup) obj4).getDateInMillis() > j5 - DateUtilsKt.getThreeMonthInMillis()) {
                    arrayList4.add(obj4);
                }
            }
            double d12 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            for (BloodPressureMeasureGroup bloodPressureMeasureGroup2 : arrayList4) {
                d12 += DateUtilsKt.getCoefFromDate(bloodPressureMeasureGroup2.getDateInMillis(), j5);
            }
            double d13 = 100 * d12;
            if (day2 < i11 * 7) {
                if (intValue == 0) {
                    coefSumForNumberOfWeek = coefSumForNumberOfWeek2 * intValue2;
                } else {
                    coefSumForNumberOfWeek = (coefSumForNumberOfWeek2 * 7) + (coefForWeek * intValue2);
                }
            } else {
                coefSumForNumberOfWeek = DateUtilsKt.getCoefSumForNumberOfWeek(i11) * 7;
            }
            double d14 = d13 / coefSumForNumberOfWeek;
            if (z12) {
                d11 = Double.valueOf(Math.log((1 + d14) / 5.2d) * 41.66666666666667d);
            } else if (!z12) {
                d11 = Double.valueOf(Math.log(1 + d14) * 83.33333333333334d);
            } else {
                d11 = null;
            }
            if (d11 != null) {
                return Double.valueOf(Math.max(20.0d, Math.min(100.0d, d11.doubleValue())));
            }
            if (z11) {
                return Double.valueOf(20.0d);
            }
            return null;
        }
        throw new NoSuchElementException();
    }
}
