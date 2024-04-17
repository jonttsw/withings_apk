package com.withings.library.healthscore.models.api;

import androidx.activity.result.c;
import androidx.camera.core.v;
import com.withings.library.healthscore.models.internal.common.Measurement;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: SleepTrack.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u000bJ:\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006 "}, d2 = {"Lcom/withings/library/healthscore/models/api/SleepTrack;", "Lcom/withings/library/healthscore/models/internal/common/Measurement;", "dateInMillis", "", "withingsSleepScore", "averageHeartRate", "", "apneaHypopneaIndex", "", "(JJLjava/lang/Integer;Ljava/lang/Double;)V", "getApneaHypopneaIndex", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getAverageHeartRate", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDateInMillis", "()J", "getWithingsSleepScore", "component1", "component2", "component3", "component4", "copy", "(JJLjava/lang/Integer;Ljava/lang/Double;)Lcom/withings/library/healthscore/models/api/SleepTrack;", "equals", "", "other", "", "hashCode", "toString", "", "HealthScore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SleepTrack implements Measurement {
    private final Double apneaHypopneaIndex;
    private final Integer averageHeartRate;
    private final long dateInMillis;
    private final long withingsSleepScore;

    public SleepTrack(long j5, long j11, Integer num, Double d11) {
        this.dateInMillis = j5;
        this.withingsSleepScore = j11;
        this.averageHeartRate = num;
        this.apneaHypopneaIndex = d11;
    }

    public static /* synthetic */ SleepTrack copy$default(SleepTrack sleepTrack, long j5, long j11, Integer num, Double d11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j5 = sleepTrack.dateInMillis;
        }
        long j12 = j5;
        if ((i11 & 2) != 0) {
            j11 = sleepTrack.withingsSleepScore;
        }
        long j13 = j11;
        if ((i11 & 4) != 0) {
            num = sleepTrack.averageHeartRate;
        }
        Integer num2 = num;
        if ((i11 & 8) != 0) {
            d11 = sleepTrack.apneaHypopneaIndex;
        }
        return sleepTrack.copy(j12, j13, num2, d11);
    }

    public final long component1() {
        return this.dateInMillis;
    }

    public final long component2() {
        return this.withingsSleepScore;
    }

    public final Integer component3() {
        return this.averageHeartRate;
    }

    public final Double component4() {
        return this.apneaHypopneaIndex;
    }

    public final SleepTrack copy(long j5, long j11, Integer num, Double d11) {
        return new SleepTrack(j5, j11, num, d11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SleepTrack)) {
            return false;
        }
        SleepTrack sleepTrack = (SleepTrack) obj;
        if (this.dateInMillis == sleepTrack.dateInMillis && this.withingsSleepScore == sleepTrack.withingsSleepScore && u.e(this.averageHeartRate, sleepTrack.averageHeartRate) && u.e(this.apneaHypopneaIndex, sleepTrack.apneaHypopneaIndex)) {
            return true;
        }
        return false;
    }

    public final Double getApneaHypopneaIndex() {
        return this.apneaHypopneaIndex;
    }

    public final Integer getAverageHeartRate() {
        return this.averageHeartRate;
    }

    @Override // com.withings.library.healthscore.models.internal.common.Measurement
    public long getDateInMillis() {
        return this.dateInMillis;
    }

    public final long getWithingsSleepScore() {
        return this.withingsSleepScore;
    }

    public int hashCode() {
        int hashCode;
        int a11 = c.a(this.withingsSleepScore, Long.hashCode(this.dateInMillis) * 31, 31);
        Integer num = this.averageHeartRate;
        int i11 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i12 = (a11 + hashCode) * 31;
        Double d11 = this.apneaHypopneaIndex;
        if (d11 != null) {
            i11 = d11.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        long j5 = this.dateInMillis;
        long j11 = this.withingsSleepScore;
        Integer num = this.averageHeartRate;
        Double d11 = this.apneaHypopneaIndex;
        StringBuilder e11 = v.e("SleepTrack(dateInMillis=", j5, ", withingsSleepScore=");
        e11.append(j11);
        e11.append(", averageHeartRate=");
        e11.append(num);
        e11.append(", apneaHypopneaIndex=");
        e11.append(d11);
        e11.append(")");
        return e11.toString();
    }
}
