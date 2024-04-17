package com.withings.factor.local.model;

import androidx.activity.result.c;
import androidx.appcompat.app.h;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import org.joda.time.Instant;
/* compiled from: FactorEntity.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b)\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0002\u0010\u0011J\u0010\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\t\u0010'\u001a\u00020\tHÆ\u0003J\t\u0010(\u001a\u00020\tHÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001aJ\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\t\u0010,\u001a\u00020\tHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010/\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u00100\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0088\u0001\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u00102J\u0013\u00103\u001a\u00020\r2\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020\u0007HÖ\u0001J\t\u00106\u001a\u000207HÖ\u0001R\u0011\u0010\u000f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0010\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b%\u0010\u001a¨\u00068"}, d2 = {"Lcom/withings/factor/local/model/FactorEntity;", "", "id", "", "wsId", NavigationArguments.USER_ID, "type", "", "start", "Lorg/joda/time/Instant;", "end", "numberOfPills", "deleted", "", "deletionDate", ConstantsWs.JSON_ACCOUNT_KEY_CREATED, "modified", "(Ljava/lang/Long;Ljava/lang/Long;JILorg/joda/time/Instant;Lorg/joda/time/Instant;Ljava/lang/Integer;Ljava/lang/Boolean;Lorg/joda/time/Instant;Lorg/joda/time/Instant;Lorg/joda/time/Instant;)V", "getCreated", "()Lorg/joda/time/Instant;", "getDeleted", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getDeletionDate", "getEnd", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getModified", "getNumberOfPills", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStart", "getType", "()I", "getUserId", "()J", "getWsId", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Long;Ljava/lang/Long;JILorg/joda/time/Instant;Lorg/joda/time/Instant;Ljava/lang/Integer;Ljava/lang/Boolean;Lorg/joda/time/Instant;Lorg/joda/time/Instant;Lorg/joda/time/Instant;)Lcom/withings/factor/local/model/FactorEntity;", "equals", "other", "hashCode", "toString", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FactorEntity {
    private final Instant created;
    private final Boolean deleted;
    private final Instant deletionDate;
    private final Instant end;

    /* renamed from: id  reason: collision with root package name */
    private final Long f39101id;
    private final Instant modified;
    private final Integer numberOfPills;
    private final Instant start;
    private final int type;
    private final long userId;
    private final Long wsId;

    public FactorEntity(Long l5, Long l6, long j5, int i11, Instant start, Instant instant, Integer num, Boolean bool, Instant instant2, Instant created, Instant modified) {
        u.j(start, "start");
        u.j(created, "created");
        u.j(modified, "modified");
        this.f39101id = l5;
        this.wsId = l6;
        this.userId = j5;
        this.type = i11;
        this.start = start;
        this.end = instant;
        this.numberOfPills = num;
        this.deleted = bool;
        this.deletionDate = instant2;
        this.created = created;
        this.modified = modified;
    }

    public static /* synthetic */ FactorEntity copy$default(FactorEntity factorEntity, Long l5, Long l6, long j5, int i11, Instant instant, Instant instant2, Integer num, Boolean bool, Instant instant3, Instant instant4, Instant instant5, int i12, Object obj) {
        Long l11;
        Long l12;
        long j11;
        int i13;
        Instant instant6;
        Instant instant7;
        Integer num2;
        Boolean bool2;
        Instant instant8;
        Instant instant9;
        Instant instant10;
        if ((i12 & 1) != 0) {
            l11 = factorEntity.f39101id;
        } else {
            l11 = l5;
        }
        if ((i12 & 2) != 0) {
            l12 = factorEntity.wsId;
        } else {
            l12 = l6;
        }
        if ((i12 & 4) != 0) {
            j11 = factorEntity.userId;
        } else {
            j11 = j5;
        }
        if ((i12 & 8) != 0) {
            i13 = factorEntity.type;
        } else {
            i13 = i11;
        }
        if ((i12 & 16) != 0) {
            instant6 = factorEntity.start;
        } else {
            instant6 = instant;
        }
        if ((i12 & 32) != 0) {
            instant7 = factorEntity.end;
        } else {
            instant7 = instant2;
        }
        if ((i12 & 64) != 0) {
            num2 = factorEntity.numberOfPills;
        } else {
            num2 = num;
        }
        if ((i12 & 128) != 0) {
            bool2 = factorEntity.deleted;
        } else {
            bool2 = bool;
        }
        if ((i12 & 256) != 0) {
            instant8 = factorEntity.deletionDate;
        } else {
            instant8 = instant3;
        }
        if ((i12 & 512) != 0) {
            instant9 = factorEntity.created;
        } else {
            instant9 = instant4;
        }
        if ((i12 & 1024) != 0) {
            instant10 = factorEntity.modified;
        } else {
            instant10 = instant5;
        }
        return factorEntity.copy(l11, l12, j11, i13, instant6, instant7, num2, bool2, instant8, instant9, instant10);
    }

    public final Long component1() {
        return this.f39101id;
    }

    public final Instant component10() {
        return this.created;
    }

    public final Instant component11() {
        return this.modified;
    }

    public final Long component2() {
        return this.wsId;
    }

    public final long component3() {
        return this.userId;
    }

    public final int component4() {
        return this.type;
    }

    public final Instant component5() {
        return this.start;
    }

    public final Instant component6() {
        return this.end;
    }

    public final Integer component7() {
        return this.numberOfPills;
    }

    public final Boolean component8() {
        return this.deleted;
    }

    public final Instant component9() {
        return this.deletionDate;
    }

    public final FactorEntity copy(Long l5, Long l6, long j5, int i11, Instant start, Instant instant, Integer num, Boolean bool, Instant instant2, Instant created, Instant modified) {
        u.j(start, "start");
        u.j(created, "created");
        u.j(modified, "modified");
        return new FactorEntity(l5, l6, j5, i11, start, instant, num, bool, instant2, created, modified);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FactorEntity)) {
            return false;
        }
        FactorEntity factorEntity = (FactorEntity) obj;
        if (u.e(this.f39101id, factorEntity.f39101id) && u.e(this.wsId, factorEntity.wsId) && this.userId == factorEntity.userId && this.type == factorEntity.type && u.e(this.start, factorEntity.start) && u.e(this.end, factorEntity.end) && u.e(this.numberOfPills, factorEntity.numberOfPills) && u.e(this.deleted, factorEntity.deleted) && u.e(this.deletionDate, factorEntity.deletionDate) && u.e(this.created, factorEntity.created) && u.e(this.modified, factorEntity.modified)) {
            return true;
        }
        return false;
    }

    public final Instant getCreated() {
        return this.created;
    }

    public final Boolean getDeleted() {
        return this.deleted;
    }

    public final Instant getDeletionDate() {
        return this.deletionDate;
    }

    public final Instant getEnd() {
        return this.end;
    }

    public final Long getId() {
        return this.f39101id;
    }

    public final Instant getModified() {
        return this.modified;
    }

    public final Integer getNumberOfPills() {
        return this.numberOfPills;
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

    public final Long getWsId() {
        return this.wsId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        Long l5 = this.f39101id;
        int i11 = 0;
        if (l5 == null) {
            hashCode = 0;
        } else {
            hashCode = l5.hashCode();
        }
        int i12 = hashCode * 31;
        Long l6 = this.wsId;
        if (l6 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l6.hashCode();
        }
        int a11 = b.a(this.start, h.a(this.type, c.a(this.userId, (i12 + hashCode2) * 31, 31), 31), 31);
        Instant instant = this.end;
        if (instant == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = instant.hashCode();
        }
        int i13 = (a11 + hashCode3) * 31;
        Integer num = this.numberOfPills;
        if (num == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        Boolean bool = this.deleted;
        if (bool == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = bool.hashCode();
        }
        int i15 = (i14 + hashCode5) * 31;
        Instant instant2 = this.deletionDate;
        if (instant2 != null) {
            i11 = instant2.hashCode();
        }
        return this.modified.hashCode() + b.a(this.created, (i15 + i11) * 31, 31);
    }

    public String toString() {
        Long l5 = this.f39101id;
        Long l6 = this.wsId;
        long j5 = this.userId;
        int i11 = this.type;
        Instant instant = this.start;
        Instant instant2 = this.end;
        Integer num = this.numberOfPills;
        Boolean bool = this.deleted;
        Instant instant3 = this.deletionDate;
        Instant instant4 = this.created;
        Instant instant5 = this.modified;
        return "FactorEntity(id=" + l5 + ", wsId=" + l6 + ", userId=" + j5 + ", type=" + i11 + ", start=" + instant + ", end=" + instant2 + ", numberOfPills=" + num + ", deleted=" + bool + ", deletionDate=" + instant3 + ", created=" + instant4 + ", modified=" + instant5 + ")";
    }

    public /* synthetic */ FactorEntity(Long l5, Long l6, long j5, int i11, Instant instant, Instant instant2, Integer num, Boolean bool, Instant instant3, Instant instant4, Instant instant5, int i12, m mVar) {
        this((i12 & 1) != 0 ? null : l5, l6, j5, i11, instant, instant2, num, bool, instant3, instant4, instant5);
    }
}
