package com.withings.vasistas.v2.model;

import androidx.appcompat.app.h;
import androidx.camera.camera2.internal.l0;
import com.google.android.gms.internal.mlkit_common.a;
import com.withings.vasistas.v2.model.Vasistas;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import org.joda.time.Duration;
/* compiled from: TrackerSleepVasistas.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\t\u0010\"\u001a\u00020\rHÆ\u0003J\t\u0010#\u001a\u00020\rHÆ\u0003JO\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020\u000bHÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006,"}, d2 = {"Lcom/withings/vasistas/v2/model/TrackerSleepVasistas;", "Lcom/withings/vasistas/v2/model/Vasistas;", "id", "", "startDate", "Lorg/joda/time/DateTime;", "duration", "Lorg/joda/time/Duration;", "metaData", "Lcom/withings/vasistas/v2/model/Vasistas$MetaData;", "sleepLevel", "", "met", "", "calories", "(JLorg/joda/time/DateTime;Lorg/joda/time/Duration;Lcom/withings/vasistas/v2/model/Vasistas$MetaData;IDD)V", "getCalories", "()D", "getDuration", "()Lorg/joda/time/Duration;", "getId", "()J", "getMet", "getMetaData", "()Lcom/withings/vasistas/v2/model/Vasistas$MetaData;", "getSleepLevel", "()I", "getStartDate", "()Lorg/joda/time/DateTime;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TrackerSleepVasistas extends Vasistas {
    private final double calories;
    private final Duration duration;

    /* renamed from: id  reason: collision with root package name */
    private final long f46398id;
    private final double met;
    private final Vasistas.MetaData metaData;
    private final int sleepLevel;
    private final DateTime startDate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackerSleepVasistas(long j5, DateTime startDate, Duration duration, Vasistas.MetaData metaData, int i11, double d11, double d12) {
        super(null);
        u.j(startDate, "startDate");
        u.j(duration, "duration");
        u.j(metaData, "metaData");
        this.f46398id = j5;
        this.startDate = startDate;
        this.duration = duration;
        this.metaData = metaData;
        this.sleepLevel = i11;
        this.met = d11;
        this.calories = d12;
    }

    public static /* synthetic */ TrackerSleepVasistas copy$default(TrackerSleepVasistas trackerSleepVasistas, long j5, DateTime dateTime, Duration duration, Vasistas.MetaData metaData, int i11, double d11, double d12, int i12, Object obj) {
        long j11;
        DateTime dateTime2;
        Duration duration2;
        Vasistas.MetaData metaData2;
        int i13;
        double d13;
        double d14;
        if ((i12 & 1) != 0) {
            j11 = trackerSleepVasistas.f46398id;
        } else {
            j11 = j5;
        }
        if ((i12 & 2) != 0) {
            dateTime2 = trackerSleepVasistas.startDate;
        } else {
            dateTime2 = dateTime;
        }
        if ((i12 & 4) != 0) {
            duration2 = trackerSleepVasistas.duration;
        } else {
            duration2 = duration;
        }
        if ((i12 & 8) != 0) {
            metaData2 = trackerSleepVasistas.metaData;
        } else {
            metaData2 = metaData;
        }
        if ((i12 & 16) != 0) {
            i13 = trackerSleepVasistas.sleepLevel;
        } else {
            i13 = i11;
        }
        if ((i12 & 32) != 0) {
            d13 = trackerSleepVasistas.met;
        } else {
            d13 = d11;
        }
        if ((i12 & 64) != 0) {
            d14 = trackerSleepVasistas.calories;
        } else {
            d14 = d12;
        }
        return trackerSleepVasistas.copy(j11, dateTime2, duration2, metaData2, i13, d13, d14);
    }

    public final long component1() {
        return this.f46398id;
    }

    public final DateTime component2() {
        return this.startDate;
    }

    public final Duration component3() {
        return this.duration;
    }

    public final Vasistas.MetaData component4() {
        return this.metaData;
    }

    public final int component5() {
        return this.sleepLevel;
    }

    public final double component6() {
        return this.met;
    }

    public final double component7() {
        return this.calories;
    }

    public final TrackerSleepVasistas copy(long j5, DateTime startDate, Duration duration, Vasistas.MetaData metaData, int i11, double d11, double d12) {
        u.j(startDate, "startDate");
        u.j(duration, "duration");
        u.j(metaData, "metaData");
        return new TrackerSleepVasistas(j5, startDate, duration, metaData, i11, d11, d12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackerSleepVasistas)) {
            return false;
        }
        TrackerSleepVasistas trackerSleepVasistas = (TrackerSleepVasistas) obj;
        if (this.f46398id == trackerSleepVasistas.f46398id && u.e(this.startDate, trackerSleepVasistas.startDate) && u.e(this.duration, trackerSleepVasistas.duration) && u.e(this.metaData, trackerSleepVasistas.metaData) && this.sleepLevel == trackerSleepVasistas.sleepLevel && Double.compare(this.met, trackerSleepVasistas.met) == 0 && Double.compare(this.calories, trackerSleepVasistas.calories) == 0) {
            return true;
        }
        return false;
    }

    public final double getCalories() {
        return this.calories;
    }

    @Override // com.withings.vasistas.v2.model.Vasistas
    public Duration getDuration() {
        return this.duration;
    }

    @Override // com.withings.vasistas.v2.model.Vasistas
    public long getId() {
        return this.f46398id;
    }

    public final double getMet() {
        return this.met;
    }

    @Override // com.withings.vasistas.v2.model.Vasistas
    public Vasistas.MetaData getMetaData() {
        return this.metaData;
    }

    public final int getSleepLevel() {
        return this.sleepLevel;
    }

    @Override // com.withings.vasistas.v2.model.Vasistas
    public DateTime getStartDate() {
        return this.startDate;
    }

    public int hashCode() {
        int b10 = a.b(this.startDate, Long.hashCode(this.f46398id) * 31, 31);
        int hashCode = this.metaData.hashCode();
        return Double.hashCode(this.calories) + l0.a(this.met, h.a(this.sleepLevel, (hashCode + ((this.duration.hashCode() + b10) * 31)) * 31, 31), 31);
    }

    public String toString() {
        long j5 = this.f46398id;
        DateTime dateTime = this.startDate;
        Duration duration = this.duration;
        Vasistas.MetaData metaData = this.metaData;
        int i11 = this.sleepLevel;
        double d11 = this.met;
        double d12 = this.calories;
        return "TrackerSleepVasistas(id=" + j5 + ", startDate=" + dateTime + ", duration=" + duration + ", metaData=" + metaData + ", sleepLevel=" + i11 + ", met=" + d11 + ", calories=" + d12 + ")";
    }
}
