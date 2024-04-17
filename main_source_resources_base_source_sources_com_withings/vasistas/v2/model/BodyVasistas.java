package com.withings.vasistas.v2.model;

import androidx.appcompat.app.h;
import androidx.camera.camera2.internal.q2;
import com.google.android.gms.internal.mlkit_common.a;
import com.withings.vasistas.v2.model.Vasistas;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import org.joda.time.Duration;
/* compiled from: BodyVasistas.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\tHÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\t\u0010$\u001a\u00020\u000bHÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\t\u0010&\u001a\u00020\u000bHÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003Jc\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000bHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020\u000bHÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u00060"}, d2 = {"Lcom/withings/vasistas/v2/model/BodyVasistas;", "Lcom/withings/vasistas/v2/model/Vasistas;", "id", "", "startDate", "Lorg/joda/time/DateTime;", "duration", "Lorg/joda/time/Duration;", "metaData", "Lcom/withings/vasistas/v2/model/Vasistas$MetaData;", "hr", "", "hrQuality", "hrLevel", "hrState", "skinTemperature", "(JLorg/joda/time/DateTime;Lorg/joda/time/Duration;Lcom/withings/vasistas/v2/model/Vasistas$MetaData;IIIII)V", "getDuration", "()Lorg/joda/time/Duration;", "getHr", "()I", "getHrLevel", "getHrQuality", "getHrState", "getId", "()J", "getMetaData", "()Lcom/withings/vasistas/v2/model/Vasistas$MetaData;", "getSkinTemperature", "getStartDate", "()Lorg/joda/time/DateTime;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BodyVasistas extends Vasistas {
    private final Duration duration;

    /* renamed from: hr  reason: collision with root package name */
    private final int f46390hr;
    private final int hrLevel;
    private final int hrQuality;
    private final int hrState;

    /* renamed from: id  reason: collision with root package name */
    private final long f46391id;
    private final Vasistas.MetaData metaData;
    private final int skinTemperature;
    private final DateTime startDate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BodyVasistas(long j5, DateTime startDate, Duration duration, Vasistas.MetaData metaData, int i11, int i12, int i13, int i14, int i15) {
        super(null);
        u.j(startDate, "startDate");
        u.j(duration, "duration");
        u.j(metaData, "metaData");
        this.f46391id = j5;
        this.startDate = startDate;
        this.duration = duration;
        this.metaData = metaData;
        this.f46390hr = i11;
        this.hrQuality = i12;
        this.hrLevel = i13;
        this.hrState = i14;
        this.skinTemperature = i15;
    }

    public static /* synthetic */ BodyVasistas copy$default(BodyVasistas bodyVasistas, long j5, DateTime dateTime, Duration duration, Vasistas.MetaData metaData, int i11, int i12, int i13, int i14, int i15, int i16, Object obj) {
        long j11;
        DateTime dateTime2;
        Duration duration2;
        Vasistas.MetaData metaData2;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        if ((i16 & 1) != 0) {
            j11 = bodyVasistas.f46391id;
        } else {
            j11 = j5;
        }
        if ((i16 & 2) != 0) {
            dateTime2 = bodyVasistas.startDate;
        } else {
            dateTime2 = dateTime;
        }
        if ((i16 & 4) != 0) {
            duration2 = bodyVasistas.duration;
        } else {
            duration2 = duration;
        }
        if ((i16 & 8) != 0) {
            metaData2 = bodyVasistas.metaData;
        } else {
            metaData2 = metaData;
        }
        if ((i16 & 16) != 0) {
            i17 = bodyVasistas.f46390hr;
        } else {
            i17 = i11;
        }
        if ((i16 & 32) != 0) {
            i18 = bodyVasistas.hrQuality;
        } else {
            i18 = i12;
        }
        if ((i16 & 64) != 0) {
            i19 = bodyVasistas.hrLevel;
        } else {
            i19 = i13;
        }
        if ((i16 & 128) != 0) {
            i21 = bodyVasistas.hrState;
        } else {
            i21 = i14;
        }
        if ((i16 & 256) != 0) {
            i22 = bodyVasistas.skinTemperature;
        } else {
            i22 = i15;
        }
        return bodyVasistas.copy(j11, dateTime2, duration2, metaData2, i17, i18, i19, i21, i22);
    }

    public final long component1() {
        return this.f46391id;
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
        return this.f46390hr;
    }

    public final int component6() {
        return this.hrQuality;
    }

    public final int component7() {
        return this.hrLevel;
    }

    public final int component8() {
        return this.hrState;
    }

    public final int component9() {
        return this.skinTemperature;
    }

    public final BodyVasistas copy(long j5, DateTime startDate, Duration duration, Vasistas.MetaData metaData, int i11, int i12, int i13, int i14, int i15) {
        u.j(startDate, "startDate");
        u.j(duration, "duration");
        u.j(metaData, "metaData");
        return new BodyVasistas(j5, startDate, duration, metaData, i11, i12, i13, i14, i15);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BodyVasistas)) {
            return false;
        }
        BodyVasistas bodyVasistas = (BodyVasistas) obj;
        if (this.f46391id == bodyVasistas.f46391id && u.e(this.startDate, bodyVasistas.startDate) && u.e(this.duration, bodyVasistas.duration) && u.e(this.metaData, bodyVasistas.metaData) && this.f46390hr == bodyVasistas.f46390hr && this.hrQuality == bodyVasistas.hrQuality && this.hrLevel == bodyVasistas.hrLevel && this.hrState == bodyVasistas.hrState && this.skinTemperature == bodyVasistas.skinTemperature) {
            return true;
        }
        return false;
    }

    @Override // com.withings.vasistas.v2.model.Vasistas
    public Duration getDuration() {
        return this.duration;
    }

    public final int getHr() {
        return this.f46390hr;
    }

    public final int getHrLevel() {
        return this.hrLevel;
    }

    public final int getHrQuality() {
        return this.hrQuality;
    }

    public final int getHrState() {
        return this.hrState;
    }

    @Override // com.withings.vasistas.v2.model.Vasistas
    public long getId() {
        return this.f46391id;
    }

    @Override // com.withings.vasistas.v2.model.Vasistas
    public Vasistas.MetaData getMetaData() {
        return this.metaData;
    }

    public final int getSkinTemperature() {
        return this.skinTemperature;
    }

    @Override // com.withings.vasistas.v2.model.Vasistas
    public DateTime getStartDate() {
        return this.startDate;
    }

    public int hashCode() {
        int b10 = a.b(this.startDate, Long.hashCode(this.f46391id) * 31, 31);
        int hashCode = this.metaData.hashCode();
        return Integer.hashCode(this.skinTemperature) + h.a(this.hrState, h.a(this.hrLevel, h.a(this.hrQuality, h.a(this.f46390hr, (hashCode + ((this.duration.hashCode() + b10) * 31)) * 31, 31), 31), 31), 31);
    }

    public String toString() {
        long j5 = this.f46391id;
        DateTime dateTime = this.startDate;
        Duration duration = this.duration;
        Vasistas.MetaData metaData = this.metaData;
        int i11 = this.f46390hr;
        int i12 = this.hrQuality;
        int i13 = this.hrLevel;
        int i14 = this.hrState;
        int i15 = this.skinTemperature;
        StringBuilder sb2 = new StringBuilder("BodyVasistas(id=");
        sb2.append(j5);
        sb2.append(", startDate=");
        sb2.append(dateTime);
        sb2.append(", duration=");
        sb2.append(duration);
        sb2.append(", metaData=");
        sb2.append(metaData);
        q2.c(sb2, ", hr=", i11, ", hrQuality=", i12);
        q2.c(sb2, ", hrLevel=", i13, ", hrState=", i14);
        sb2.append(", skinTemperature=");
        sb2.append(i15);
        sb2.append(")");
        return sb2.toString();
    }
}
