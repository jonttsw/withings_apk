package com.withings.clinicalstudy.repository;

import androidx.activity.result.c;
import androidx.appcompat.app.h;
import androidx.work.impl.g;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: RoomPatientSessionDao.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003JL\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\tHÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\r¨\u0006$"}, d2 = {"Lcom/withings/clinicalstudy/repository/PatientSessionEntity;", "", "id", "", "patientId", "", "startTime", "endTime", "ecgCount", "", "workoutCount", "(Ljava/lang/Long;Ljava/lang/String;JJII)V", "getEcgCount", "()I", "getEndTime", "()J", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getPatientId", "()Ljava/lang/String;", "getStartTime", "getWorkoutCount", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Long;Ljava/lang/String;JJII)Lcom/withings/clinicalstudy/repository/PatientSessionEntity;", "equals", "", "other", "hashCode", "toString", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PatientSessionEntity {
    private final int ecgCount;
    private final long endTime;

    /* renamed from: id  reason: collision with root package name */
    private final Long f32912id;
    private final String patientId;
    private final long startTime;
    private final int workoutCount;

    public PatientSessionEntity(Long l5, String patientId, long j5, long j11, int i11, int i12) {
        u.j(patientId, "patientId");
        this.f32912id = l5;
        this.patientId = patientId;
        this.startTime = j5;
        this.endTime = j11;
        this.ecgCount = i11;
        this.workoutCount = i12;
    }

    public static /* synthetic */ PatientSessionEntity copy$default(PatientSessionEntity patientSessionEntity, Long l5, String str, long j5, long j11, int i11, int i12, int i13, Object obj) {
        Long l6;
        String str2;
        long j12;
        long j13;
        int i14;
        int i15;
        if ((i13 & 1) != 0) {
            l6 = patientSessionEntity.f32912id;
        } else {
            l6 = l5;
        }
        if ((i13 & 2) != 0) {
            str2 = patientSessionEntity.patientId;
        } else {
            str2 = str;
        }
        if ((i13 & 4) != 0) {
            j12 = patientSessionEntity.startTime;
        } else {
            j12 = j5;
        }
        if ((i13 & 8) != 0) {
            j13 = patientSessionEntity.endTime;
        } else {
            j13 = j11;
        }
        if ((i13 & 16) != 0) {
            i14 = patientSessionEntity.ecgCount;
        } else {
            i14 = i11;
        }
        if ((i13 & 32) != 0) {
            i15 = patientSessionEntity.workoutCount;
        } else {
            i15 = i12;
        }
        return patientSessionEntity.copy(l6, str2, j12, j13, i14, i15);
    }

    public final Long component1() {
        return this.f32912id;
    }

    public final String component2() {
        return this.patientId;
    }

    public final long component3() {
        return this.startTime;
    }

    public final long component4() {
        return this.endTime;
    }

    public final int component5() {
        return this.ecgCount;
    }

    public final int component6() {
        return this.workoutCount;
    }

    public final PatientSessionEntity copy(Long l5, String patientId, long j5, long j11, int i11, int i12) {
        u.j(patientId, "patientId");
        return new PatientSessionEntity(l5, patientId, j5, j11, i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PatientSessionEntity)) {
            return false;
        }
        PatientSessionEntity patientSessionEntity = (PatientSessionEntity) obj;
        if (u.e(this.f32912id, patientSessionEntity.f32912id) && u.e(this.patientId, patientSessionEntity.patientId) && this.startTime == patientSessionEntity.startTime && this.endTime == patientSessionEntity.endTime && this.ecgCount == patientSessionEntity.ecgCount && this.workoutCount == patientSessionEntity.workoutCount) {
            return true;
        }
        return false;
    }

    public final int getEcgCount() {
        return this.ecgCount;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final Long getId() {
        return this.f32912id;
    }

    public final String getPatientId() {
        return this.patientId;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final int getWorkoutCount() {
        return this.workoutCount;
    }

    public int hashCode() {
        int hashCode;
        Long l5 = this.f32912id;
        if (l5 == null) {
            hashCode = 0;
        } else {
            hashCode = l5.hashCode();
        }
        return Integer.hashCode(this.workoutCount) + h.a(this.ecgCount, c.a(this.endTime, c.a(this.startTime, d.c(this.patientId, hashCode * 31, 31), 31), 31), 31);
    }

    public String toString() {
        Long l5 = this.f32912id;
        String str = this.patientId;
        long j5 = this.startTime;
        long j11 = this.endTime;
        int i11 = this.ecgCount;
        int i12 = this.workoutCount;
        StringBuilder sb2 = new StringBuilder("PatientSessionEntity(id=");
        sb2.append(l5);
        sb2.append(", patientId=");
        sb2.append(str);
        sb2.append(", startTime=");
        sb2.append(j5);
        g.d(sb2, ", endTime=", j11, ", ecgCount=");
        sb2.append(i11);
        sb2.append(", workoutCount=");
        sb2.append(i12);
        sb2.append(")");
        return sb2.toString();
    }

    public /* synthetic */ PatientSessionEntity(Long l5, String str, long j5, long j11, int i11, int i12, int i13, m mVar) {
        this((i13 & 1) != 0 ? null : l5, str, j5, (i13 & 8) != 0 ? 0L : j11, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? 0 : i12);
    }
}
