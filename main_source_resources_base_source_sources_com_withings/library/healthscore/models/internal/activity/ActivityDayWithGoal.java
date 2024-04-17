package com.withings.library.healthscore.models.internal.activity;

import androidx.activity.result.c;
import androidx.appcompat.app.h;
import androidx.camera.core.v;
import androidx.work.impl.g;
import com.withings.library.healthscore.models.internal.common.Measurement;
import kotlin.Metadata;
import kotlinx.serialization.Serializable;
/* compiled from: ActivityDayWithGoal.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J;\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u0007HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\r¨\u0006$"}, d2 = {"Lcom/withings/library/healthscore/models/internal/activity/ActivityDayWithGoal;", "Lcom/withings/library/healthscore/models/internal/common/Measurement;", "dateInMillis", "", "vigorousActivityInMin", "moderateActivityInMin", "stepsForTheDay", "", "stepsGoalForTheDay", "(JJJII)V", "getDateInMillis$annotations", "()V", "getDateInMillis", "()J", "getModerateActivityInMin$annotations", "getModerateActivityInMin", "getStepsForTheDay$annotations", "getStepsForTheDay", "()I", "getStepsGoalForTheDay$annotations", "getStepsGoalForTheDay", "getVigorousActivityInMin$annotations", "getVigorousActivityInMin", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "", "HealthScore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes4.dex */
public final class ActivityDayWithGoal implements Measurement {
    private final long dateInMillis;
    private final long moderateActivityInMin;
    private final int stepsForTheDay;
    private final int stepsGoalForTheDay;
    private final long vigorousActivityInMin;

    public ActivityDayWithGoal(long j5, long j11, long j12, int i11, int i12) {
        this.dateInMillis = j5;
        this.vigorousActivityInMin = j11;
        this.moderateActivityInMin = j12;
        this.stepsForTheDay = i11;
        this.stepsGoalForTheDay = i12;
    }

    public static /* synthetic */ ActivityDayWithGoal copy$default(ActivityDayWithGoal activityDayWithGoal, long j5, long j11, long j12, int i11, int i12, int i13, Object obj) {
        long j13;
        long j14;
        long j15;
        int i14;
        int i15;
        if ((i13 & 1) != 0) {
            j13 = activityDayWithGoal.dateInMillis;
        } else {
            j13 = j5;
        }
        if ((i13 & 2) != 0) {
            j14 = activityDayWithGoal.vigorousActivityInMin;
        } else {
            j14 = j11;
        }
        if ((i13 & 4) != 0) {
            j15 = activityDayWithGoal.moderateActivityInMin;
        } else {
            j15 = j12;
        }
        if ((i13 & 8) != 0) {
            i14 = activityDayWithGoal.stepsForTheDay;
        } else {
            i14 = i11;
        }
        if ((i13 & 16) != 0) {
            i15 = activityDayWithGoal.stepsGoalForTheDay;
        } else {
            i15 = i12;
        }
        return activityDayWithGoal.copy(j13, j14, j15, i14, i15);
    }

    public final long component1() {
        return this.dateInMillis;
    }

    public final long component2() {
        return this.vigorousActivityInMin;
    }

    public final long component3() {
        return this.moderateActivityInMin;
    }

    public final int component4() {
        return this.stepsForTheDay;
    }

    public final int component5() {
        return this.stepsGoalForTheDay;
    }

    public final ActivityDayWithGoal copy(long j5, long j11, long j12, int i11, int i12) {
        return new ActivityDayWithGoal(j5, j11, j12, i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityDayWithGoal)) {
            return false;
        }
        ActivityDayWithGoal activityDayWithGoal = (ActivityDayWithGoal) obj;
        if (this.dateInMillis == activityDayWithGoal.dateInMillis && this.vigorousActivityInMin == activityDayWithGoal.vigorousActivityInMin && this.moderateActivityInMin == activityDayWithGoal.moderateActivityInMin && this.stepsForTheDay == activityDayWithGoal.stepsForTheDay && this.stepsGoalForTheDay == activityDayWithGoal.stepsGoalForTheDay) {
            return true;
        }
        return false;
    }

    @Override // com.withings.library.healthscore.models.internal.common.Measurement
    public long getDateInMillis() {
        return this.dateInMillis;
    }

    public final long getModerateActivityInMin() {
        return this.moderateActivityInMin;
    }

    public final int getStepsForTheDay() {
        return this.stepsForTheDay;
    }

    public final int getStepsGoalForTheDay() {
        return this.stepsGoalForTheDay;
    }

    public final long getVigorousActivityInMin() {
        return this.vigorousActivityInMin;
    }

    public int hashCode() {
        return Integer.hashCode(this.stepsGoalForTheDay) + h.a(this.stepsForTheDay, c.a(this.moderateActivityInMin, c.a(this.vigorousActivityInMin, Long.hashCode(this.dateInMillis) * 31, 31), 31), 31);
    }

    public String toString() {
        long j5 = this.dateInMillis;
        long j11 = this.vigorousActivityInMin;
        long j12 = this.moderateActivityInMin;
        int i11 = this.stepsForTheDay;
        int i12 = this.stepsGoalForTheDay;
        StringBuilder e11 = v.e("ActivityDayWithGoal(dateInMillis=", j5, ", vigorousActivityInMin=");
        e11.append(j11);
        g.d(e11, ", moderateActivityInMin=", j12, ", stepsForTheDay=");
        e11.append(i11);
        e11.append(", stepsGoalForTheDay=");
        e11.append(i12);
        e11.append(")");
        return e11.toString();
    }

    public static /* synthetic */ void getDateInMillis$annotations() {
    }

    public static /* synthetic */ void getModerateActivityInMin$annotations() {
    }

    public static /* synthetic */ void getStepsForTheDay$annotations() {
    }

    public static /* synthetic */ void getStepsGoalForTheDay$annotations() {
    }

    public static /* synthetic */ void getVigorousActivityInMin$annotations() {
    }
}
