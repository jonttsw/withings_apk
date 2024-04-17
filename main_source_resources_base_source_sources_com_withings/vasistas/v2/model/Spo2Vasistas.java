package com.withings.vasistas.v2.model;

import androidx.appcompat.app.h;
import com.google.android.gms.internal.mlkit_common.a;
import com.withings.vasistas.v2.model.Vasistas;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
import org.joda.time.Duration;
/* compiled from: Spo2Vasistas.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\rJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0017JL\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\u000bHÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006*"}, d2 = {"Lcom/withings/vasistas/v2/model/Spo2Vasistas;", "Lcom/withings/vasistas/v2/model/Vasistas;", "id", "", "startDate", "Lorg/joda/time/DateTime;", "duration", "Lorg/joda/time/Duration;", "metaData", "Lcom/withings/vasistas/v2/model/Vasistas$MetaData;", "spo2", "", "spo2Quality", "(JLorg/joda/time/DateTime;Lorg/joda/time/Duration;Lcom/withings/vasistas/v2/model/Vasistas$MetaData;ILjava/lang/Integer;)V", "getDuration", "()Lorg/joda/time/Duration;", "getId", "()J", "getMetaData", "()Lcom/withings/vasistas/v2/model/Vasistas$MetaData;", "getSpo2", "()I", "getSpo2Quality", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStartDate", "()Lorg/joda/time/DateTime;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(JLorg/joda/time/DateTime;Lorg/joda/time/Duration;Lcom/withings/vasistas/v2/model/Vasistas$MetaData;ILjava/lang/Integer;)Lcom/withings/vasistas/v2/model/Spo2Vasistas;", "equals", "", "other", "", "hashCode", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Spo2Vasistas extends Vasistas {
    private final Duration duration;

    /* renamed from: id  reason: collision with root package name */
    private final long f46396id;
    private final Vasistas.MetaData metaData;
    private final int spo2;
    private final Integer spo2Quality;
    private final DateTime startDate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Spo2Vasistas(long j5, DateTime startDate, Duration duration, Vasistas.MetaData metaData, int i11, Integer num) {
        super(null);
        u.j(startDate, "startDate");
        u.j(duration, "duration");
        u.j(metaData, "metaData");
        this.f46396id = j5;
        this.startDate = startDate;
        this.duration = duration;
        this.metaData = metaData;
        this.spo2 = i11;
        this.spo2Quality = num;
    }

    public static /* synthetic */ Spo2Vasistas copy$default(Spo2Vasistas spo2Vasistas, long j5, DateTime dateTime, Duration duration, Vasistas.MetaData metaData, int i11, Integer num, int i12, Object obj) {
        long j11;
        DateTime dateTime2;
        Duration duration2;
        Vasistas.MetaData metaData2;
        int i13;
        Integer num2;
        if ((i12 & 1) != 0) {
            j11 = spo2Vasistas.f46396id;
        } else {
            j11 = j5;
        }
        if ((i12 & 2) != 0) {
            dateTime2 = spo2Vasistas.startDate;
        } else {
            dateTime2 = dateTime;
        }
        if ((i12 & 4) != 0) {
            duration2 = spo2Vasistas.duration;
        } else {
            duration2 = duration;
        }
        if ((i12 & 8) != 0) {
            metaData2 = spo2Vasistas.metaData;
        } else {
            metaData2 = metaData;
        }
        if ((i12 & 16) != 0) {
            i13 = spo2Vasistas.spo2;
        } else {
            i13 = i11;
        }
        if ((i12 & 32) != 0) {
            num2 = spo2Vasistas.spo2Quality;
        } else {
            num2 = num;
        }
        return spo2Vasistas.copy(j11, dateTime2, duration2, metaData2, i13, num2);
    }

    public final long component1() {
        return this.f46396id;
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
        return this.spo2;
    }

    public final Integer component6() {
        return this.spo2Quality;
    }

    public final Spo2Vasistas copy(long j5, DateTime startDate, Duration duration, Vasistas.MetaData metaData, int i11, Integer num) {
        u.j(startDate, "startDate");
        u.j(duration, "duration");
        u.j(metaData, "metaData");
        return new Spo2Vasistas(j5, startDate, duration, metaData, i11, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Spo2Vasistas)) {
            return false;
        }
        Spo2Vasistas spo2Vasistas = (Spo2Vasistas) obj;
        if (this.f46396id == spo2Vasistas.f46396id && u.e(this.startDate, spo2Vasistas.startDate) && u.e(this.duration, spo2Vasistas.duration) && u.e(this.metaData, spo2Vasistas.metaData) && this.spo2 == spo2Vasistas.spo2 && u.e(this.spo2Quality, spo2Vasistas.spo2Quality)) {
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
        return this.f46396id;
    }

    @Override // com.withings.vasistas.v2.model.Vasistas
    public Vasistas.MetaData getMetaData() {
        return this.metaData;
    }

    public final int getSpo2() {
        return this.spo2;
    }

    public final Integer getSpo2Quality() {
        return this.spo2Quality;
    }

    @Override // com.withings.vasistas.v2.model.Vasistas
    public DateTime getStartDate() {
        return this.startDate;
    }

    public int hashCode() {
        int hashCode;
        int b10 = a.b(this.startDate, Long.hashCode(this.f46396id) * 31, 31);
        int hashCode2 = this.metaData.hashCode();
        int a11 = h.a(this.spo2, (hashCode2 + ((this.duration.hashCode() + b10) * 31)) * 31, 31);
        Integer num = this.spo2Quality;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return a11 + hashCode;
    }

    public String toString() {
        long j5 = this.f46396id;
        DateTime dateTime = this.startDate;
        Duration duration = this.duration;
        Vasistas.MetaData metaData = this.metaData;
        int i11 = this.spo2;
        Integer num = this.spo2Quality;
        return "Spo2Vasistas(id=" + j5 + ", startDate=" + dateTime + ", duration=" + duration + ", metaData=" + metaData + ", spo2=" + i11 + ", spo2Quality=" + num + ")";
    }
}
