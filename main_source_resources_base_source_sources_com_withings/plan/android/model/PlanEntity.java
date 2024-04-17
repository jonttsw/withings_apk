package com.withings.plan.android.model;

import androidx.appcompat.app.h;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: PlanEntity.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\rJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\\\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\tHÖ\u0001J\t\u0010(\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006)"}, d2 = {"Lcom/withings/plan/android/model/PlanEntity;", "", "id", "", "accountId", "deviceId", "state", "", "type", "", "startDate", "Lorg/joda/time/DateTime;", "modified", "(JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;ILorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V", "getAccountId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getDeviceId", "getId", "()J", "getModified", "()Lorg/joda/time/DateTime;", "getStartDate", "getState", "()Ljava/lang/String;", "getType", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;ILorg/joda/time/DateTime;Lorg/joda/time/DateTime;)Lcom/withings/plan/android/model/PlanEntity;", "equals", "", "other", "hashCode", "toString", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PlanEntity {
    private final Long accountId;
    private final Long deviceId;

    /* renamed from: id  reason: collision with root package name */
    private final long f43730id;
    private final DateTime modified;
    private final DateTime startDate;
    private final String state;
    private final int type;

    public PlanEntity(long j5, Long l5, Long l6, String state, int i11, DateTime dateTime, DateTime dateTime2) {
        u.j(state, "state");
        this.f43730id = j5;
        this.accountId = l5;
        this.deviceId = l6;
        this.state = state;
        this.type = i11;
        this.startDate = dateTime;
        this.modified = dateTime2;
    }

    public static /* synthetic */ PlanEntity copy$default(PlanEntity planEntity, long j5, Long l5, Long l6, String str, int i11, DateTime dateTime, DateTime dateTime2, int i12, Object obj) {
        long j11;
        Long l11;
        Long l12;
        String str2;
        int i13;
        DateTime dateTime3;
        DateTime dateTime4;
        if ((i12 & 1) != 0) {
            j11 = planEntity.f43730id;
        } else {
            j11 = j5;
        }
        if ((i12 & 2) != 0) {
            l11 = planEntity.accountId;
        } else {
            l11 = l5;
        }
        if ((i12 & 4) != 0) {
            l12 = planEntity.deviceId;
        } else {
            l12 = l6;
        }
        if ((i12 & 8) != 0) {
            str2 = planEntity.state;
        } else {
            str2 = str;
        }
        if ((i12 & 16) != 0) {
            i13 = planEntity.type;
        } else {
            i13 = i11;
        }
        if ((i12 & 32) != 0) {
            dateTime3 = planEntity.startDate;
        } else {
            dateTime3 = dateTime;
        }
        if ((i12 & 64) != 0) {
            dateTime4 = planEntity.modified;
        } else {
            dateTime4 = dateTime2;
        }
        return planEntity.copy(j11, l11, l12, str2, i13, dateTime3, dateTime4);
    }

    public final long component1() {
        return this.f43730id;
    }

    public final Long component2() {
        return this.accountId;
    }

    public final Long component3() {
        return this.deviceId;
    }

    public final String component4() {
        return this.state;
    }

    public final int component5() {
        return this.type;
    }

    public final DateTime component6() {
        return this.startDate;
    }

    public final DateTime component7() {
        return this.modified;
    }

    public final PlanEntity copy(long j5, Long l5, Long l6, String state, int i11, DateTime dateTime, DateTime dateTime2) {
        u.j(state, "state");
        return new PlanEntity(j5, l5, l6, state, i11, dateTime, dateTime2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlanEntity)) {
            return false;
        }
        PlanEntity planEntity = (PlanEntity) obj;
        if (this.f43730id == planEntity.f43730id && u.e(this.accountId, planEntity.accountId) && u.e(this.deviceId, planEntity.deviceId) && u.e(this.state, planEntity.state) && this.type == planEntity.type && u.e(this.startDate, planEntity.startDate) && u.e(this.modified, planEntity.modified)) {
            return true;
        }
        return false;
    }

    public final Long getAccountId() {
        return this.accountId;
    }

    public final Long getDeviceId() {
        return this.deviceId;
    }

    public final long getId() {
        return this.f43730id;
    }

    public final DateTime getModified() {
        return this.modified;
    }

    public final DateTime getStartDate() {
        return this.startDate;
    }

    public final String getState() {
        return this.state;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = Long.hashCode(this.f43730id) * 31;
        Long l5 = this.accountId;
        int i11 = 0;
        if (l5 == null) {
            hashCode = 0;
        } else {
            hashCode = l5.hashCode();
        }
        int i12 = (hashCode4 + hashCode) * 31;
        Long l6 = this.deviceId;
        if (l6 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l6.hashCode();
        }
        int a11 = h.a(this.type, d.c(this.state, (i12 + hashCode2) * 31, 31), 31);
        DateTime dateTime = this.startDate;
        if (dateTime == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = dateTime.hashCode();
        }
        int i13 = (a11 + hashCode3) * 31;
        DateTime dateTime2 = this.modified;
        if (dateTime2 != null) {
            i11 = dateTime2.hashCode();
        }
        return i13 + i11;
    }

    public String toString() {
        long j5 = this.f43730id;
        Long l5 = this.accountId;
        Long l6 = this.deviceId;
        String str = this.state;
        int i11 = this.type;
        DateTime dateTime = this.startDate;
        DateTime dateTime2 = this.modified;
        return "PlanEntity(id=" + j5 + ", accountId=" + l5 + ", deviceId=" + l6 + ", state=" + str + ", type=" + i11 + ", startDate=" + dateTime + ", modified=" + dateTime2 + ")";
    }
}
