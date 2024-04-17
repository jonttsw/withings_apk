package com.withings.library.healthscore.domain.sleep.v2;

import com.withings.library.healthscore.domain.interfaces.SleepEngagementScoreInterface;
import com.withings.library.healthscore.models.api.SleepTrack;
import com.withings.library.healthscore.utils.date.DateUtilsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
/* compiled from: CalculateSleepEngagementScoreV2UseCase.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J5\u0010\u0003\u001a\u0004\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/withings/library/healthscore/domain/sleep/v2/CalculateSleepEngagementScoreV2UseCase;", "Lcom/withings/library/healthscore/domain/interfaces/SleepEngagementScoreInterface;", "()V", "getSleepEngagementScore", "", "sleepNights", "", "Lcom/withings/library/healthscore/models/api/SleepTrack;", "numberOfWeekOfTheAcquisition", "", "dateOfScoreInMilli", "", "hasSleepData", "", "(Ljava/util/List;IJZ)Ljava/lang/Double;", "HealthScore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CalculateSleepEngagementScoreV2UseCase implements SleepEngagementScoreInterface {
    @Override // com.withings.library.healthscore.domain.interfaces.SleepEngagementScoreInterface
    public Double getSleepEngagementScore(List<SleepTrack> sleepNights, int i11, long j5, boolean z5) {
        double coefSumForNumberOfWeek;
        u.j(sleepNights, "sleepNights");
        if (!sleepNights.isEmpty()) {
            int day = DateUtilsKt.getDay(j5) - DateUtilsKt.getDay(((SleepTrack) x.I(sleepNights)).getDateInMillis());
            int i12 = day / 7;
            double coefSumForNumberOfWeek2 = DateUtilsKt.getCoefSumForNumberOfWeek(i12);
            int i13 = day % 7;
            double coefForWeek = DateUtilsKt.getCoefForWeek(i12 + 1);
            List<SleepTrack> list = sleepNights;
            ArrayList arrayList = new ArrayList(x.y(list, 10));
            for (SleepTrack sleepTrack : list) {
                arrayList.add(Double.valueOf(DateUtilsKt.getCoefFromDate(sleepTrack.getDateInMillis(), j5)));
            }
            double E0 = 100 * x.E0(arrayList);
            if (day < i11 * 7) {
                if (i12 == 0) {
                    coefSumForNumberOfWeek = coefSumForNumberOfWeek2 * i13;
                } else {
                    coefSumForNumberOfWeek = (coefSumForNumberOfWeek2 * 7) + (coefForWeek * i13);
                }
            } else {
                coefSumForNumberOfWeek = DateUtilsKt.getCoefSumForNumberOfWeek(i11) * 7;
            }
            double d11 = E0 / coefSumForNumberOfWeek;
            if (d11 < 10.0d) {
                return Double.valueOf(20.0d);
            }
            if (d11 > 75.0d) {
                return Double.valueOf(100.0d);
            }
            return Double.valueOf(Math.max(20.0d, Math.min(100.0d, Math.atan(d11 / 50.0d) * 100.0d)));
        } else if (z5) {
            return Double.valueOf(20.0d);
        } else {
            return null;
        }
    }
}
