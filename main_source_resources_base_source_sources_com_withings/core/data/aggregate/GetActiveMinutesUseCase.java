package com.withings.core.data.aggregate;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
/* compiled from: GetActiveMinutesUseCase.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/withings/core/data/aggregate/GetActiveMinutesUseCase;", "", "activityAggregateManager", "Lcom/withings/core/data/aggregate/ActivityAggregateManager;", "(Lcom/withings/core/data/aggregate/ActivityAggregateManager;)V", "getActiveMinutes", "", NavigationArguments.USER_ID, "", "date", "Lorg/joda/time/DateTime;", "core-data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetActiveMinutesUseCase {
    private final ActivityAggregateManager activityAggregateManager;

    public GetActiveMinutesUseCase(ActivityAggregateManager activityAggregateManager) {
        u.j(activityAggregateManager, "activityAggregateManager");
        this.activityAggregateManager = activityAggregateManager;
    }

    public final int getActiveMinutes(long j5, DateTime date) {
        Long l5;
        u.j(date, "date");
        ActivityAggregate aggregateForDay = this.activityAggregateManager.getAggregateForDay(j5, date);
        if (aggregateForDay != null) {
            l5 = Long.valueOf(aggregateForDay.getTimeWithActiveMet());
        } else {
            l5 = null;
        }
        if (l5 != null) {
            return (int) (l5.longValue() / ((long) DateTimeConstants.MILLIS_PER_MINUTE));
        }
        return 0;
    }
}
