package com.withings.vasistas.v2.model;

import androidx.appcompat.app.h;
import androidx.camera.camera2.internal.q2;
import com.google.android.gms.internal.mlkit_common.a;
import com.withings.vasistas.v2.model.Vasistas;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import org.joda.time.Duration;
/* compiled from: AhiVasistas.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003JE\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u000bHÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006'"}, d2 = {"Lcom/withings/vasistas/v2/model/AhiVasistas;", "Lcom/withings/vasistas/v2/model/Vasistas;", "id", "", "startDate", "Lorg/joda/time/DateTime;", "duration", "Lorg/joda/time/Duration;", "metaData", "Lcom/withings/vasistas/v2/model/Vasistas$MetaData;", "apneaHypopneaIndex", "", "breathingDisturbanceProbability", "(JLorg/joda/time/DateTime;Lorg/joda/time/Duration;Lcom/withings/vasistas/v2/model/Vasistas$MetaData;II)V", "getApneaHypopneaIndex", "()I", "getBreathingDisturbanceProbability", "getDuration", "()Lorg/joda/time/Duration;", "getId", "()J", "getMetaData", "()Lcom/withings/vasistas/v2/model/Vasistas$MetaData;", "getStartDate", "()Lorg/joda/time/DateTime;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AhiVasistas extends Vasistas {
    private final int apneaHypopneaIndex;
    private final int breathingDisturbanceProbability;
    private final Duration duration;

    /* renamed from: id  reason: collision with root package name */
    private final long f46387id;
    private final Vasistas.MetaData metaData;
    private final DateTime startDate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AhiVasistas(long j5, DateTime startDate, Duration duration, Vasistas.MetaData metaData, int i11, int i12) {
        super(null);
        u.j(startDate, "startDate");
        u.j(duration, "duration");
        u.j(metaData, "metaData");
        this.f46387id = j5;
        this.startDate = startDate;
        this.duration = duration;
        this.metaData = metaData;
        this.apneaHypopneaIndex = i11;
        this.breathingDisturbanceProbability = i12;
    }

    public static /* synthetic */ AhiVasistas copy$default(AhiVasistas ahiVasistas, long j5, DateTime dateTime, Duration duration, Vasistas.MetaData metaData, int i11, int i12, int i13, Object obj) {
        long j11;
        DateTime dateTime2;
        Duration duration2;
        Vasistas.MetaData metaData2;
        int i14;
        int i15;
        if ((i13 & 1) != 0) {
            j11 = ahiVasistas.f46387id;
        } else {
            j11 = j5;
        }
        if ((i13 & 2) != 0) {
            dateTime2 = ahiVasistas.startDate;
        } else {
            dateTime2 = dateTime;
        }
        if ((i13 & 4) != 0) {
            duration2 = ahiVasistas.duration;
        } else {
            duration2 = duration;
        }
        if ((i13 & 8) != 0) {
            metaData2 = ahiVasistas.metaData;
        } else {
            metaData2 = metaData;
        }
        if ((i13 & 16) != 0) {
            i14 = ahiVasistas.apneaHypopneaIndex;
        } else {
            i14 = i11;
        }
        if ((i13 & 32) != 0) {
            i15 = ahiVasistas.breathingDisturbanceProbability;
        } else {
            i15 = i12;
        }
        return ahiVasistas.copy(j11, dateTime2, duration2, metaData2, i14, i15);
    }

    public final long component1() {
        return this.f46387id;
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
        return this.apneaHypopneaIndex;
    }

    public final int component6() {
        return this.breathingDisturbanceProbability;
    }

    public final AhiVasistas copy(long j5, DateTime startDate, Duration duration, Vasistas.MetaData metaData, int i11, int i12) {
        u.j(startDate, "startDate");
        u.j(duration, "duration");
        u.j(metaData, "metaData");
        return new AhiVasistas(j5, startDate, duration, metaData, i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AhiVasistas)) {
            return false;
        }
        AhiVasistas ahiVasistas = (AhiVasistas) obj;
        if (this.f46387id == ahiVasistas.f46387id && u.e(this.startDate, ahiVasistas.startDate) && u.e(this.duration, ahiVasistas.duration) && u.e(this.metaData, ahiVasistas.metaData) && this.apneaHypopneaIndex == ahiVasistas.apneaHypopneaIndex && this.breathingDisturbanceProbability == ahiVasistas.breathingDisturbanceProbability) {
            return true;
        }
        return false;
    }

    public final int getApneaHypopneaIndex() {
        return this.apneaHypopneaIndex;
    }

    public final int getBreathingDisturbanceProbability() {
        return this.breathingDisturbanceProbability;
    }

    @Override // com.withings.vasistas.v2.model.Vasistas
    public Duration getDuration() {
        return this.duration;
    }

    @Override // com.withings.vasistas.v2.model.Vasistas
    public long getId() {
        return this.f46387id;
    }

    @Override // com.withings.vasistas.v2.model.Vasistas
    public Vasistas.MetaData getMetaData() {
        return this.metaData;
    }

    @Override // com.withings.vasistas.v2.model.Vasistas
    public DateTime getStartDate() {
        return this.startDate;
    }

    public int hashCode() {
        int b10 = a.b(this.startDate, Long.hashCode(this.f46387id) * 31, 31);
        int hashCode = this.metaData.hashCode();
        return Integer.hashCode(this.breathingDisturbanceProbability) + h.a(this.apneaHypopneaIndex, (hashCode + ((this.duration.hashCode() + b10) * 31)) * 31, 31);
    }

    public String toString() {
        long j5 = this.f46387id;
        DateTime dateTime = this.startDate;
        Duration duration = this.duration;
        Vasistas.MetaData metaData = this.metaData;
        int i11 = this.apneaHypopneaIndex;
        int i12 = this.breathingDisturbanceProbability;
        StringBuilder sb2 = new StringBuilder("AhiVasistas(id=");
        sb2.append(j5);
        sb2.append(", startDate=");
        sb2.append(dateTime);
        sb2.append(", duration=");
        sb2.append(duration);
        sb2.append(", metaData=");
        sb2.append(metaData);
        q2.c(sb2, ", apneaHypopneaIndex=", i11, ", breathingDisturbanceProbability=", i12);
        sb2.append(")");
        return sb2.toString();
    }
}
