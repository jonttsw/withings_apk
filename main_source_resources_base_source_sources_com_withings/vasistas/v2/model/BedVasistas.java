package com.withings.vasistas.v2.model;

import androidx.appcompat.app.h;
import androidx.camera.camera2.internal.l0;
import androidx.camera.camera2.internal.q2;
import com.google.android.gms.internal.mlkit_common.a;
import com.google.protobuf.t;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.withings.vasistas.v2.model.Vasistas;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import org.joda.time.Duration;
/* compiled from: BedVasistas.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b)\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u000b¢\u0006\u0002\u0010\u0014J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0016J\t\u0010,\u001a\u00020\u000bHÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0007HÆ\u0003J\t\u0010/\u001a\u00020\tHÆ\u0003J\t\u00100\u001a\u00020\u000bHÆ\u0003J\t\u00101\u001a\u00020\u000bHÆ\u0003J\t\u00102\u001a\u00020\u000eHÆ\u0003J\t\u00103\u001a\u00020\u000eHÆ\u0003J\t\u00104\u001a\u00020\u000bHÆ\u0003J\u008a\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000bHÆ\u0001¢\u0006\u0002\u00106J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:HÖ\u0003J\t\u0010;\u001a\u00020\u000bHÖ\u0001J\t\u0010<\u001a\u00020=HÖ\u0001R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0013\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006>"}, d2 = {"Lcom/withings/vasistas/v2/model/BedVasistas;", "Lcom/withings/vasistas/v2/model/Vasistas;", "id", "", "startDate", "Lorg/joda/time/DateTime;", "duration", "Lorg/joda/time/Duration;", "metaData", "Lcom/withings/vasistas/v2/model/Vasistas$MetaData;", "sleepLevel", "", "hr", "met", "", "calories", "snoringDurationRatio", "apneaHypopneaIndex", "breathingProbability", "respiratoryRate", "(JLorg/joda/time/DateTime;Lorg/joda/time/Duration;Lcom/withings/vasistas/v2/model/Vasistas$MetaData;IIDDILjava/lang/Integer;Ljava/lang/Integer;I)V", "getApneaHypopneaIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBreathingProbability", "getCalories", "()D", "getDuration", "()Lorg/joda/time/Duration;", "getHr", "()I", "getId", "()J", "getMet", "getMetaData", "()Lcom/withings/vasistas/v2/model/Vasistas$MetaData;", "getRespiratoryRate", "getSleepLevel", "getSnoringDurationRatio", "getStartDate", "()Lorg/joda/time/DateTime;", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JLorg/joda/time/DateTime;Lorg/joda/time/Duration;Lcom/withings/vasistas/v2/model/Vasistas$MetaData;IIDDILjava/lang/Integer;Ljava/lang/Integer;I)Lcom/withings/vasistas/v2/model/BedVasistas;", "equals", "", "other", "", "hashCode", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BedVasistas extends Vasistas {
    private final Integer apneaHypopneaIndex;
    private final Integer breathingProbability;
    private final double calories;
    private final Duration duration;

    /* renamed from: hr  reason: collision with root package name */
    private final int f46388hr;

    /* renamed from: id  reason: collision with root package name */
    private final long f46389id;
    private final double met;
    private final Vasistas.MetaData metaData;
    private final int respiratoryRate;
    private final int sleepLevel;
    private final int snoringDurationRatio;
    private final DateTime startDate;

    public /* synthetic */ BedVasistas(long j5, DateTime dateTime, Duration duration, Vasistas.MetaData metaData, int i11, int i12, double d11, double d12, int i13, Integer num, Integer num2, int i14, int i15, m mVar) {
        this(j5, dateTime, duration, metaData, i11, i12, d11, d12, i13, (i15 & 512) != 0 ? null : num, (i15 & 1024) != 0 ? null : num2, i14);
    }

    public static /* synthetic */ BedVasistas copy$default(BedVasistas bedVasistas, long j5, DateTime dateTime, Duration duration, Vasistas.MetaData metaData, int i11, int i12, double d11, double d12, int i13, Integer num, Integer num2, int i14, int i15, Object obj) {
        long j11;
        DateTime dateTime2;
        Duration duration2;
        Vasistas.MetaData metaData2;
        int i16;
        int i17;
        double d13;
        double d14;
        int i18;
        Integer num3;
        Integer num4;
        int i19;
        if ((i15 & 1) != 0) {
            j11 = bedVasistas.f46389id;
        } else {
            j11 = j5;
        }
        if ((i15 & 2) != 0) {
            dateTime2 = bedVasistas.startDate;
        } else {
            dateTime2 = dateTime;
        }
        if ((i15 & 4) != 0) {
            duration2 = bedVasistas.duration;
        } else {
            duration2 = duration;
        }
        if ((i15 & 8) != 0) {
            metaData2 = bedVasistas.metaData;
        } else {
            metaData2 = metaData;
        }
        if ((i15 & 16) != 0) {
            i16 = bedVasistas.sleepLevel;
        } else {
            i16 = i11;
        }
        if ((i15 & 32) != 0) {
            i17 = bedVasistas.f46388hr;
        } else {
            i17 = i12;
        }
        if ((i15 & 64) != 0) {
            d13 = bedVasistas.met;
        } else {
            d13 = d11;
        }
        if ((i15 & 128) != 0) {
            d14 = bedVasistas.calories;
        } else {
            d14 = d12;
        }
        if ((i15 & 256) != 0) {
            i18 = bedVasistas.snoringDurationRatio;
        } else {
            i18 = i13;
        }
        if ((i15 & 512) != 0) {
            num3 = bedVasistas.apneaHypopneaIndex;
        } else {
            num3 = num;
        }
        if ((i15 & 1024) != 0) {
            num4 = bedVasistas.breathingProbability;
        } else {
            num4 = num2;
        }
        if ((i15 & ModuleCopy.f28574b) != 0) {
            i19 = bedVasistas.respiratoryRate;
        } else {
            i19 = i14;
        }
        return bedVasistas.copy(j11, dateTime2, duration2, metaData2, i16, i17, d13, d14, i18, num3, num4, i19);
    }

    public final long component1() {
        return this.f46389id;
    }

    public final Integer component10() {
        return this.apneaHypopneaIndex;
    }

    public final Integer component11() {
        return this.breathingProbability;
    }

    public final int component12() {
        return this.respiratoryRate;
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

    public final int component6() {
        return this.f46388hr;
    }

    public final double component7() {
        return this.met;
    }

    public final double component8() {
        return this.calories;
    }

    public final int component9() {
        return this.snoringDurationRatio;
    }

    public final BedVasistas copy(long j5, DateTime startDate, Duration duration, Vasistas.MetaData metaData, int i11, int i12, double d11, double d12, int i13, Integer num, Integer num2, int i14) {
        u.j(startDate, "startDate");
        u.j(duration, "duration");
        u.j(metaData, "metaData");
        return new BedVasistas(j5, startDate, duration, metaData, i11, i12, d11, d12, i13, num, num2, i14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BedVasistas)) {
            return false;
        }
        BedVasistas bedVasistas = (BedVasistas) obj;
        if (this.f46389id == bedVasistas.f46389id && u.e(this.startDate, bedVasistas.startDate) && u.e(this.duration, bedVasistas.duration) && u.e(this.metaData, bedVasistas.metaData) && this.sleepLevel == bedVasistas.sleepLevel && this.f46388hr == bedVasistas.f46388hr && Double.compare(this.met, bedVasistas.met) == 0 && Double.compare(this.calories, bedVasistas.calories) == 0 && this.snoringDurationRatio == bedVasistas.snoringDurationRatio && u.e(this.apneaHypopneaIndex, bedVasistas.apneaHypopneaIndex) && u.e(this.breathingProbability, bedVasistas.breathingProbability) && this.respiratoryRate == bedVasistas.respiratoryRate) {
            return true;
        }
        return false;
    }

    public final Integer getApneaHypopneaIndex() {
        return this.apneaHypopneaIndex;
    }

    public final Integer getBreathingProbability() {
        return this.breathingProbability;
    }

    public final double getCalories() {
        return this.calories;
    }

    @Override // com.withings.vasistas.v2.model.Vasistas
    public Duration getDuration() {
        return this.duration;
    }

    public final int getHr() {
        return this.f46388hr;
    }

    @Override // com.withings.vasistas.v2.model.Vasistas
    public long getId() {
        return this.f46389id;
    }

    public final double getMet() {
        return this.met;
    }

    @Override // com.withings.vasistas.v2.model.Vasistas
    public Vasistas.MetaData getMetaData() {
        return this.metaData;
    }

    public final int getRespiratoryRate() {
        return this.respiratoryRate;
    }

    public final int getSleepLevel() {
        return this.sleepLevel;
    }

    public final int getSnoringDurationRatio() {
        return this.snoringDurationRatio;
    }

    @Override // com.withings.vasistas.v2.model.Vasistas
    public DateTime getStartDate() {
        return this.startDate;
    }

    public int hashCode() {
        int hashCode;
        int b10 = a.b(this.startDate, Long.hashCode(this.f46389id) * 31, 31);
        int a11 = h.a(this.snoringDurationRatio, l0.a(this.calories, l0.a(this.met, h.a(this.f46388hr, h.a(this.sleepLevel, (this.metaData.hashCode() + ((this.duration.hashCode() + b10) * 31)) * 31, 31), 31), 31), 31), 31);
        Integer num = this.apneaHypopneaIndex;
        int i11 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i12 = (a11 + hashCode) * 31;
        Integer num2 = this.breathingProbability;
        if (num2 != null) {
            i11 = num2.hashCode();
        }
        return Integer.hashCode(this.respiratoryRate) + ((i12 + i11) * 31);
    }

    public String toString() {
        long j5 = this.f46389id;
        DateTime dateTime = this.startDate;
        Duration duration = this.duration;
        Vasistas.MetaData metaData = this.metaData;
        int i11 = this.sleepLevel;
        int i12 = this.f46388hr;
        double d11 = this.met;
        double d12 = this.calories;
        int i13 = this.snoringDurationRatio;
        Integer num = this.apneaHypopneaIndex;
        Integer num2 = this.breathingProbability;
        int i14 = this.respiratoryRate;
        StringBuilder sb2 = new StringBuilder("BedVasistas(id=");
        sb2.append(j5);
        sb2.append(", startDate=");
        sb2.append(dateTime);
        sb2.append(", duration=");
        sb2.append(duration);
        sb2.append(", metaData=");
        sb2.append(metaData);
        q2.c(sb2, ", sleepLevel=", i11, ", hr=", i12);
        t.d(sb2, ", met=", d11, ", calories=");
        sb2.append(d12);
        sb2.append(", snoringDurationRatio=");
        sb2.append(i13);
        sb2.append(", apneaHypopneaIndex=");
        sb2.append(num);
        sb2.append(", breathingProbability=");
        sb2.append(num2);
        sb2.append(", respiratoryRate=");
        sb2.append(i14);
        sb2.append(")");
        return sb2.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BedVasistas(long j5, DateTime startDate, Duration duration, Vasistas.MetaData metaData, int i11, int i12, double d11, double d12, int i13, Integer num, Integer num2, int i14) {
        super(null);
        u.j(startDate, "startDate");
        u.j(duration, "duration");
        u.j(metaData, "metaData");
        this.f46389id = j5;
        this.startDate = startDate;
        this.duration = duration;
        this.metaData = metaData;
        this.sleepLevel = i11;
        this.f46388hr = i12;
        this.met = d11;
        this.calories = d12;
        this.snoringDurationRatio = i13;
        this.apneaHypopneaIndex = num;
        this.breathingProbability = num2;
        this.respiratoryRate = i14;
    }
}
