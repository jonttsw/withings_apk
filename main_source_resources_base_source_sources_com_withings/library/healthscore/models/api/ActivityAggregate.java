package com.withings.library.healthscore.models.api;

import androidx.appcompat.app.h;
import androidx.camera.camera2.internal.q2;
import com.withings.library.healthscore.models.internal.common.Measurement;
import kotlin.Metadata;
/* compiled from: ActivityAggregate.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/withings/library/healthscore/models/api/ActivityAggregate;", "Lcom/withings/library/healthscore/models/internal/common/Measurement;", "dateInMillis", "", "activeMinuteVigorous", "", "activeMinuteModerate", "stepsForTheDay", "(JIII)V", "getActiveMinuteModerate", "()I", "getActiveMinuteVigorous", "getDateInMillis", "()J", "getStepsForTheDay", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "", "HealthScore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ActivityAggregate implements Measurement {
    private final int activeMinuteModerate;
    private final int activeMinuteVigorous;
    private final long dateInMillis;
    private final int stepsForTheDay;

    public ActivityAggregate(long j5, int i11, int i12, int i13) {
        this.dateInMillis = j5;
        this.activeMinuteVigorous = i11;
        this.activeMinuteModerate = i12;
        this.stepsForTheDay = i13;
    }

    public static /* synthetic */ ActivityAggregate copy$default(ActivityAggregate activityAggregate, long j5, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            j5 = activityAggregate.dateInMillis;
        }
        long j11 = j5;
        if ((i14 & 2) != 0) {
            i11 = activityAggregate.activeMinuteVigorous;
        }
        int i15 = i11;
        if ((i14 & 4) != 0) {
            i12 = activityAggregate.activeMinuteModerate;
        }
        int i16 = i12;
        if ((i14 & 8) != 0) {
            i13 = activityAggregate.stepsForTheDay;
        }
        return activityAggregate.copy(j11, i15, i16, i13);
    }

    public final long component1() {
        return this.dateInMillis;
    }

    public final int component2() {
        return this.activeMinuteVigorous;
    }

    public final int component3() {
        return this.activeMinuteModerate;
    }

    public final int component4() {
        return this.stepsForTheDay;
    }

    public final ActivityAggregate copy(long j5, int i11, int i12, int i13) {
        return new ActivityAggregate(j5, i11, i12, i13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityAggregate)) {
            return false;
        }
        ActivityAggregate activityAggregate = (ActivityAggregate) obj;
        if (this.dateInMillis == activityAggregate.dateInMillis && this.activeMinuteVigorous == activityAggregate.activeMinuteVigorous && this.activeMinuteModerate == activityAggregate.activeMinuteModerate && this.stepsForTheDay == activityAggregate.stepsForTheDay) {
            return true;
        }
        return false;
    }

    public final int getActiveMinuteModerate() {
        return this.activeMinuteModerate;
    }

    public final int getActiveMinuteVigorous() {
        return this.activeMinuteVigorous;
    }

    @Override // com.withings.library.healthscore.models.internal.common.Measurement
    public long getDateInMillis() {
        return this.dateInMillis;
    }

    public final int getStepsForTheDay() {
        return this.stepsForTheDay;
    }

    public int hashCode() {
        return Integer.hashCode(this.stepsForTheDay) + h.a(this.activeMinuteModerate, h.a(this.activeMinuteVigorous, Long.hashCode(this.dateInMillis) * 31, 31), 31);
    }

    public String toString() {
        long j5 = this.dateInMillis;
        int i11 = this.activeMinuteVigorous;
        int i12 = this.activeMinuteModerate;
        int i13 = this.stepsForTheDay;
        StringBuilder sb2 = new StringBuilder("ActivityAggregate(dateInMillis=");
        sb2.append(j5);
        sb2.append(", activeMinuteVigorous=");
        sb2.append(i11);
        q2.c(sb2, ", activeMinuteModerate=", i12, ", stepsForTheDay=", i13);
        sb2.append(")");
        return sb2.toString();
    }
}
