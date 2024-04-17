package com.withings.vasistas.v2.model;

import androidx.appcompat.app.h;
import androidx.camera.camera2.internal.q2;
import com.google.android.gms.internal.mlkit_common.a;
import com.withings.vasistas.v2.model.Vasistas;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import org.joda.time.Duration;
/* compiled from: SwimVasistas.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003JO\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\u000bHÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018¨\u0006*"}, d2 = {"Lcom/withings/vasistas/v2/model/SwimVasistas;", "Lcom/withings/vasistas/v2/model/Vasistas;", "id", "", "startDate", "Lorg/joda/time/DateTime;", "duration", "Lorg/joda/time/Duration;", "metaData", "Lcom/withings/vasistas/v2/model/Vasistas$MetaData;", "swimType", "", "swimLaps", "swimMovements", "(JLorg/joda/time/DateTime;Lorg/joda/time/Duration;Lcom/withings/vasistas/v2/model/Vasistas$MetaData;III)V", "getDuration", "()Lorg/joda/time/Duration;", "getId", "()J", "getMetaData", "()Lcom/withings/vasistas/v2/model/Vasistas$MetaData;", "getStartDate", "()Lorg/joda/time/DateTime;", "getSwimLaps", "()I", "getSwimMovements", "getSwimType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SwimVasistas extends Vasistas {
    private final Duration duration;

    /* renamed from: id  reason: collision with root package name */
    private final long f46397id;
    private final Vasistas.MetaData metaData;
    private final DateTime startDate;
    private final int swimLaps;
    private final int swimMovements;
    private final int swimType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwimVasistas(long j5, DateTime startDate, Duration duration, Vasistas.MetaData metaData, int i11, int i12, int i13) {
        super(null);
        u.j(startDate, "startDate");
        u.j(duration, "duration");
        u.j(metaData, "metaData");
        this.f46397id = j5;
        this.startDate = startDate;
        this.duration = duration;
        this.metaData = metaData;
        this.swimType = i11;
        this.swimLaps = i12;
        this.swimMovements = i13;
    }

    public static /* synthetic */ SwimVasistas copy$default(SwimVasistas swimVasistas, long j5, DateTime dateTime, Duration duration, Vasistas.MetaData metaData, int i11, int i12, int i13, int i14, Object obj) {
        long j11;
        DateTime dateTime2;
        Duration duration2;
        Vasistas.MetaData metaData2;
        int i15;
        int i16;
        int i17;
        if ((i14 & 1) != 0) {
            j11 = swimVasistas.f46397id;
        } else {
            j11 = j5;
        }
        if ((i14 & 2) != 0) {
            dateTime2 = swimVasistas.startDate;
        } else {
            dateTime2 = dateTime;
        }
        if ((i14 & 4) != 0) {
            duration2 = swimVasistas.duration;
        } else {
            duration2 = duration;
        }
        if ((i14 & 8) != 0) {
            metaData2 = swimVasistas.metaData;
        } else {
            metaData2 = metaData;
        }
        if ((i14 & 16) != 0) {
            i15 = swimVasistas.swimType;
        } else {
            i15 = i11;
        }
        if ((i14 & 32) != 0) {
            i16 = swimVasistas.swimLaps;
        } else {
            i16 = i12;
        }
        if ((i14 & 64) != 0) {
            i17 = swimVasistas.swimMovements;
        } else {
            i17 = i13;
        }
        return swimVasistas.copy(j11, dateTime2, duration2, metaData2, i15, i16, i17);
    }

    public final long component1() {
        return this.f46397id;
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
        return this.swimType;
    }

    public final int component6() {
        return this.swimLaps;
    }

    public final int component7() {
        return this.swimMovements;
    }

    public final SwimVasistas copy(long j5, DateTime startDate, Duration duration, Vasistas.MetaData metaData, int i11, int i12, int i13) {
        u.j(startDate, "startDate");
        u.j(duration, "duration");
        u.j(metaData, "metaData");
        return new SwimVasistas(j5, startDate, duration, metaData, i11, i12, i13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SwimVasistas)) {
            return false;
        }
        SwimVasistas swimVasistas = (SwimVasistas) obj;
        if (this.f46397id == swimVasistas.f46397id && u.e(this.startDate, swimVasistas.startDate) && u.e(this.duration, swimVasistas.duration) && u.e(this.metaData, swimVasistas.metaData) && this.swimType == swimVasistas.swimType && this.swimLaps == swimVasistas.swimLaps && this.swimMovements == swimVasistas.swimMovements) {
            return true;
        }
        return false;
    }

    @Override // com.withings.vasistas.v2.model.Vasistas
    public Duration getDuration() {
        return this.duration;
    }

    @Override // com.withings.vasistas.v2.model.Vasistas
    public long getId() {
        return this.f46397id;
    }

    @Override // com.withings.vasistas.v2.model.Vasistas
    public Vasistas.MetaData getMetaData() {
        return this.metaData;
    }

    @Override // com.withings.vasistas.v2.model.Vasistas
    public DateTime getStartDate() {
        return this.startDate;
    }

    public final int getSwimLaps() {
        return this.swimLaps;
    }

    public final int getSwimMovements() {
        return this.swimMovements;
    }

    public final int getSwimType() {
        return this.swimType;
    }

    public int hashCode() {
        int b10 = a.b(this.startDate, Long.hashCode(this.f46397id) * 31, 31);
        int hashCode = this.metaData.hashCode();
        return Integer.hashCode(this.swimMovements) + h.a(this.swimLaps, h.a(this.swimType, (hashCode + ((this.duration.hashCode() + b10) * 31)) * 31, 31), 31);
    }

    public String toString() {
        long j5 = this.f46397id;
        DateTime dateTime = this.startDate;
        Duration duration = this.duration;
        Vasistas.MetaData metaData = this.metaData;
        int i11 = this.swimType;
        int i12 = this.swimLaps;
        int i13 = this.swimMovements;
        StringBuilder sb2 = new StringBuilder("SwimVasistas(id=");
        sb2.append(j5);
        sb2.append(", startDate=");
        sb2.append(dateTime);
        sb2.append(", duration=");
        sb2.append(duration);
        sb2.append(", metaData=");
        sb2.append(metaData);
        q2.c(sb2, ", swimType=", i11, ", swimLaps=", i12);
        sb2.append(", swimMovements=");
        sb2.append(i13);
        sb2.append(")");
        return sb2.toString();
    }
}
