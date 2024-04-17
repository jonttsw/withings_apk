package com.withings.vasistas.v2.model;

import com.google.android.gms.internal.mlkit_common.a;
import com.withings.vasistas.v2.model.Vasistas;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import org.joda.time.Duration;
/* compiled from: ElevationVasistas.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003J;\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006%"}, d2 = {"Lcom/withings/vasistas/v2/model/ElevationVasistas;", "Lcom/withings/vasistas/v2/model/Vasistas;", "id", "", "startDate", "Lorg/joda/time/DateTime;", "duration", "Lorg/joda/time/Duration;", "metaData", "Lcom/withings/vasistas/v2/model/Vasistas$MetaData;", "ascent", "", "(JLorg/joda/time/DateTime;Lorg/joda/time/Duration;Lcom/withings/vasistas/v2/model/Vasistas$MetaData;D)V", "getAscent", "()D", "getDuration", "()Lorg/joda/time/Duration;", "getId", "()J", "getMetaData", "()Lcom/withings/vasistas/v2/model/Vasistas$MetaData;", "getStartDate", "()Lorg/joda/time/DateTime;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ElevationVasistas extends Vasistas {
    private final double ascent;
    private final Duration duration;

    /* renamed from: id  reason: collision with root package name */
    private final long f46393id;
    private final Vasistas.MetaData metaData;
    private final DateTime startDate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ElevationVasistas(long j5, DateTime startDate, Duration duration, Vasistas.MetaData metaData, double d11) {
        super(null);
        u.j(startDate, "startDate");
        u.j(duration, "duration");
        u.j(metaData, "metaData");
        this.f46393id = j5;
        this.startDate = startDate;
        this.duration = duration;
        this.metaData = metaData;
        this.ascent = d11;
    }

    public static /* synthetic */ ElevationVasistas copy$default(ElevationVasistas elevationVasistas, long j5, DateTime dateTime, Duration duration, Vasistas.MetaData metaData, double d11, int i11, Object obj) {
        long j11;
        DateTime dateTime2;
        Duration duration2;
        Vasistas.MetaData metaData2;
        double d12;
        if ((i11 & 1) != 0) {
            j11 = elevationVasistas.f46393id;
        } else {
            j11 = j5;
        }
        if ((i11 & 2) != 0) {
            dateTime2 = elevationVasistas.startDate;
        } else {
            dateTime2 = dateTime;
        }
        if ((i11 & 4) != 0) {
            duration2 = elevationVasistas.duration;
        } else {
            duration2 = duration;
        }
        if ((i11 & 8) != 0) {
            metaData2 = elevationVasistas.metaData;
        } else {
            metaData2 = metaData;
        }
        if ((i11 & 16) != 0) {
            d12 = elevationVasistas.ascent;
        } else {
            d12 = d11;
        }
        return elevationVasistas.copy(j11, dateTime2, duration2, metaData2, d12);
    }

    public final long component1() {
        return this.f46393id;
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

    public final double component5() {
        return this.ascent;
    }

    public final ElevationVasistas copy(long j5, DateTime startDate, Duration duration, Vasistas.MetaData metaData, double d11) {
        u.j(startDate, "startDate");
        u.j(duration, "duration");
        u.j(metaData, "metaData");
        return new ElevationVasistas(j5, startDate, duration, metaData, d11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ElevationVasistas)) {
            return false;
        }
        ElevationVasistas elevationVasistas = (ElevationVasistas) obj;
        if (this.f46393id == elevationVasistas.f46393id && u.e(this.startDate, elevationVasistas.startDate) && u.e(this.duration, elevationVasistas.duration) && u.e(this.metaData, elevationVasistas.metaData) && Double.compare(this.ascent, elevationVasistas.ascent) == 0) {
            return true;
        }
        return false;
    }

    public final double getAscent() {
        return this.ascent;
    }

    @Override // com.withings.vasistas.v2.model.Vasistas
    public Duration getDuration() {
        return this.duration;
    }

    @Override // com.withings.vasistas.v2.model.Vasistas
    public long getId() {
        return this.f46393id;
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
        int b10 = a.b(this.startDate, Long.hashCode(this.f46393id) * 31, 31);
        int hashCode = this.metaData.hashCode();
        return Double.hashCode(this.ascent) + ((hashCode + ((this.duration.hashCode() + b10) * 31)) * 31);
    }

    public String toString() {
        long j5 = this.f46393id;
        DateTime dateTime = this.startDate;
        Duration duration = this.duration;
        Vasistas.MetaData metaData = this.metaData;
        double d11 = this.ascent;
        return "ElevationVasistas(id=" + j5 + ", startDate=" + dateTime + ", duration=" + duration + ", metaData=" + metaData + ", ascent=" + d11 + ")";
    }
}
