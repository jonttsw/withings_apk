package com.withings.prediction.local.model;

import androidx.activity.result.c;
import androidx.appcompat.app.h;
import androidx.camera.core.v;
import androidx.camera.core.y1;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.Instant;
/* compiled from: PredictionEntity.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003JY\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\bHÆ\u0001J\u0013\u0010$\u001a\u00020\u000b2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0006HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019¨\u0006)"}, d2 = {"Lcom/withings/prediction/local/model/PredictionEntity;", "", "wsId", "", NavigationArguments.USER_ID, "type", "", "start", "Lorg/joda/time/Instant;", "end", "active", "", ConstantsWs.JSON_ACCOUNT_KEY_CREATED, "modified", "(JJILorg/joda/time/Instant;Lorg/joda/time/Instant;ZLorg/joda/time/Instant;Lorg/joda/time/Instant;)V", "getActive", "()Z", "getCreated", "()Lorg/joda/time/Instant;", "getEnd", "getModified", "getStart", "getType", "()I", "getUserId", "()J", "getWsId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PredictionEntity {
    private final boolean active;
    private final Instant created;
    private final Instant end;
    private final Instant modified;
    private final Instant start;
    private final int type;
    private final long userId;
    private final long wsId;

    public PredictionEntity(long j5, long j11, int i11, Instant start, Instant end, boolean z5, Instant created, Instant modified) {
        u.j(start, "start");
        u.j(end, "end");
        u.j(created, "created");
        u.j(modified, "modified");
        this.wsId = j5;
        this.userId = j11;
        this.type = i11;
        this.start = start;
        this.end = end;
        this.active = z5;
        this.created = created;
        this.modified = modified;
    }

    public static /* synthetic */ PredictionEntity copy$default(PredictionEntity predictionEntity, long j5, long j11, int i11, Instant instant, Instant instant2, boolean z5, Instant instant3, Instant instant4, int i12, Object obj) {
        long j12;
        long j13;
        int i13;
        Instant instant5;
        Instant instant6;
        boolean z11;
        Instant instant7;
        Instant instant8;
        if ((i12 & 1) != 0) {
            j12 = predictionEntity.wsId;
        } else {
            j12 = j5;
        }
        if ((i12 & 2) != 0) {
            j13 = predictionEntity.userId;
        } else {
            j13 = j11;
        }
        if ((i12 & 4) != 0) {
            i13 = predictionEntity.type;
        } else {
            i13 = i11;
        }
        if ((i12 & 8) != 0) {
            instant5 = predictionEntity.start;
        } else {
            instant5 = instant;
        }
        if ((i12 & 16) != 0) {
            instant6 = predictionEntity.end;
        } else {
            instant6 = instant2;
        }
        if ((i12 & 32) != 0) {
            z11 = predictionEntity.active;
        } else {
            z11 = z5;
        }
        if ((i12 & 64) != 0) {
            instant7 = predictionEntity.created;
        } else {
            instant7 = instant3;
        }
        if ((i12 & 128) != 0) {
            instant8 = predictionEntity.modified;
        } else {
            instant8 = instant4;
        }
        return predictionEntity.copy(j12, j13, i13, instant5, instant6, z11, instant7, instant8);
    }

    public final long component1() {
        return this.wsId;
    }

    public final long component2() {
        return this.userId;
    }

    public final int component3() {
        return this.type;
    }

    public final Instant component4() {
        return this.start;
    }

    public final Instant component5() {
        return this.end;
    }

    public final boolean component6() {
        return this.active;
    }

    public final Instant component7() {
        return this.created;
    }

    public final Instant component8() {
        return this.modified;
    }

    public final PredictionEntity copy(long j5, long j11, int i11, Instant start, Instant end, boolean z5, Instant created, Instant modified) {
        u.j(start, "start");
        u.j(end, "end");
        u.j(created, "created");
        u.j(modified, "modified");
        return new PredictionEntity(j5, j11, i11, start, end, z5, created, modified);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PredictionEntity)) {
            return false;
        }
        PredictionEntity predictionEntity = (PredictionEntity) obj;
        if (this.wsId == predictionEntity.wsId && this.userId == predictionEntity.userId && this.type == predictionEntity.type && u.e(this.start, predictionEntity.start) && u.e(this.end, predictionEntity.end) && this.active == predictionEntity.active && u.e(this.created, predictionEntity.created) && u.e(this.modified, predictionEntity.modified)) {
            return true;
        }
        return false;
    }

    public final boolean getActive() {
        return this.active;
    }

    public final Instant getCreated() {
        return this.created;
    }

    public final Instant getEnd() {
        return this.end;
    }

    public final Instant getModified() {
        return this.modified;
    }

    public final Instant getStart() {
        return this.start;
    }

    public final int getType() {
        return this.type;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final long getWsId() {
        return this.wsId;
    }

    public int hashCode() {
        return this.modified.hashCode() + b.a(this.created, y1.a(this.active, b.a(this.end, b.a(this.start, h.a(this.type, c.a(this.userId, Long.hashCode(this.wsId) * 31, 31), 31), 31), 31), 31), 31);
    }

    public String toString() {
        long j5 = this.wsId;
        long j11 = this.userId;
        int i11 = this.type;
        Instant instant = this.start;
        Instant instant2 = this.end;
        boolean z5 = this.active;
        Instant instant3 = this.created;
        Instant instant4 = this.modified;
        StringBuilder e11 = v.e("PredictionEntity(wsId=", j5, ", userId=");
        e11.append(j11);
        e11.append(", type=");
        e11.append(i11);
        e11.append(", start=");
        e11.append(instant);
        e11.append(", end=");
        e11.append(instant2);
        e11.append(", active=");
        e11.append(z5);
        e11.append(", created=");
        e11.append(instant3);
        e11.append(", modified=");
        e11.append(instant4);
        e11.append(")");
        return e11.toString();
    }
}
