package com.withings.core.data.aggregate;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import en0.r;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: GetDailyUserProgressionForMeasureTypeUseCase.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J/\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/withings/core/data/aggregate/GetDailyUserProgressionForMeasureTypeUseCase;", "", "getActiveMinutesUseCase", "Lcom/withings/core/data/aggregate/GetActiveMinutesUseCase;", "getStepsUseCase", "Lcom/withings/core/data/aggregate/GetStepsUseCase;", "(Lcom/withings/core/data/aggregate/GetActiveMinutesUseCase;Lcom/withings/core/data/aggregate/GetStepsUseCase;)V", "getProgression", "", NavigationArguments.USER_ID, "", "measureType", "", "date", "Lorg/joda/time/DateTime;", "goal", "(JILorg/joda/time/DateTime;Ljava/lang/Double;)Ljava/lang/Double;", "core-data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetDailyUserProgressionForMeasureTypeUseCase {
    private final GetActiveMinutesUseCase getActiveMinutesUseCase;
    private final GetStepsUseCase getStepsUseCase;

    public GetDailyUserProgressionForMeasureTypeUseCase(GetActiveMinutesUseCase getActiveMinutesUseCase, GetStepsUseCase getStepsUseCase) {
        u.j(getActiveMinutesUseCase, "getActiveMinutesUseCase");
        u.j(getStepsUseCase, "getStepsUseCase");
        this.getActiveMinutesUseCase = getActiveMinutesUseCase;
        this.getStepsUseCase = getStepsUseCase;
    }

    public final Double getProgression(long j5, int i11, DateTime date, Double d11) {
        u.j(date, "date");
        if (i11 != 36) {
            if (i11 != 199) {
                return null;
            }
            double activeMinutes = this.getActiveMinutesUseCase.getActiveMinutes(j5, date);
            if (d11 != null) {
                activeMinutes = r.e(activeMinutes, d11.doubleValue());
            }
            return Double.valueOf(activeMinutes);
        }
        double steps = this.getStepsUseCase.getSteps(j5, date);
        if (d11 != null) {
            steps = r.e(steps, d11.doubleValue());
        }
        return Double.valueOf(steps);
    }
}
