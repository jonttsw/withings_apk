package com.withings.library.healthscore.domain.heart.v2;

import com.withings.library.healthscore.domain.interfaces.AfibScoreInterface;
import com.withings.library.healthscore.models.api.AfibResultMeasureGroup;
import com.withings.library.healthscore.utils.date.DateUtilsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
/* compiled from: CalculateAFibBurdenScoreV2UseCase.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u0004\u0018\u00010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/healthscore/domain/heart/v2/CalculateAFibBurdenScoreV2UseCase;", "Lcom/withings/library/healthscore/domain/interfaces/AfibScoreInterface;", "()V", "getAFibBurdenScore", "", "afibMeasurements", "", "Lcom/withings/library/healthscore/models/api/AfibResultMeasureGroup;", "startDate", "", "(Ljava/util/List;J)Ljava/lang/Double;", "HealthScore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CalculateAFibBurdenScoreV2UseCase implements AfibScoreInterface {
    @Override // com.withings.library.healthscore.domain.interfaces.AfibScoreInterface
    public Double getAFibBurdenScore(List<AfibResultMeasureGroup> afibMeasurements, long j5) {
        u.j(afibMeasurements, "afibMeasurements");
        ArrayList arrayList = new ArrayList();
        for (Object obj : afibMeasurements) {
            if (((AfibResultMeasureGroup) obj).getDateInMillis() > j5 - DateUtilsKt.getThreeMonthInMillis()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((AfibResultMeasureGroup) next).isAFibDetected()) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(x.y(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(Double.valueOf(DateUtilsKt.getCoefFromDate(((AfibResultMeasureGroup) it2.next()).getDateInMillis(), j5)));
        }
        ArrayList arrayList4 = new ArrayList(x.y(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList4.add(Double.valueOf(DateUtilsKt.getCoefFromDate(((AfibResultMeasureGroup) it3.next()).getDateInMillis(), j5)));
        }
        if (!arrayList.isEmpty()) {
            double d11 = 100;
            return Double.valueOf(Math.min(100.0d, Math.max((1.0d - ((((x.E0(arrayList3) * d11) / x.E0(arrayList4)) * 2.0d) / d11)) * 100.0d, 20.0d)));
        }
        return null;
    }
}
