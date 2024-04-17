package com.withings.core.data.aggregate;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: GetStepsUseCase.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/withings/core/data/aggregate/GetStepsUseCase;", "", "activityAggregateManager", "Lcom/withings/core/data/aggregate/ActivityAggregateManager;", "(Lcom/withings/core/data/aggregate/ActivityAggregateManager;)V", "getLastAggregate", "Lcom/withings/core/data/aggregate/ActivityAggregate;", NavigationArguments.USER_ID, "", "getStepGoalPercentage", "", "steps", "goal", "getSteps", "", "date", "Lorg/joda/time/DateTime;", "Companion", "core-data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetStepsUseCase {
    public static final Companion Companion = new Companion(null);
    private static final int PERCENTAGE_VALUE = 100;
    private final ActivityAggregateManager activityAggregateManager;

    /* compiled from: GetStepsUseCase.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/withings/core/data/aggregate/GetStepsUseCase$Companion;", "", "()V", "PERCENTAGE_VALUE", "", "core-data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }

    public GetStepsUseCase(ActivityAggregateManager activityAggregateManager) {
        u.j(activityAggregateManager, "activityAggregateManager");
        this.activityAggregateManager = activityAggregateManager;
    }

    public final ActivityAggregate getLastAggregate(long j5) {
        return this.activityAggregateManager.getLastAggregate(j5);
    }

    public final float getStepGoalPercentage(float f11, float f12) {
        return (float) Math.floor((f11 / f12) * 100);
    }

    public final double getSteps(long j5, DateTime date) {
        u.j(date, "date");
        ActivityAggregate aggregateForDay = this.activityAggregateManager.getAggregateForDay(j5, date);
        if (aggregateForDay != null) {
            return aggregateForDay.getSteps();
        }
        return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
    }
}
