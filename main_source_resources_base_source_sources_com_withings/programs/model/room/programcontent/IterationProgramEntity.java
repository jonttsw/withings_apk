package com.withings.programs.model.room.programcontent;

import androidx.activity.result.c;
import androidx.appcompat.app.h;
import androidx.camera.camera2.internal.q2;
import androidx.work.impl.g;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: IterationProgramEntity.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b1\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003¢\u0006\u0002\u0010\u0013J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010$J\u0010\u00100\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010,J\u000b\u00101\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0005HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u00108\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u009e\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010<J\u0013\u0010=\u001a\u00020\u00102\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020\u0003HÖ\u0001J\t\u0010@\u001a\u00020\u000bHÖ\u0001R\"\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u001e\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001f\"\u0004\b'\u0010(R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001aR\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010-\u001a\u0004\b+\u0010,¨\u0006A"}, d2 = {"Lcom/withings/programs/model/room/programcontent/IterationProgramEntity;", "", NavigationArguments.PROGRAM_ID, "", "iteration", "", NavigationArguments.INSTANCE_ID, "status", "start", "end", "menu", "", "summary", "fullSummary", "progress", "unread", "", "programSwToken", "id", "(IJIIJLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;I)V", "getEnd", "()Ljava/lang/Long;", "setEnd", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getFullSummary", "()Ljava/lang/String;", "getId", "()I", "getInstanceId", "getIteration", "()J", "getMenu", "getProgramId", "getProgramSwToken", "getProgress", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStart", "setStart", "(J)V", "getStatus", "getSummary", "getUnread", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(IJIIJLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;I)Lcom/withings/programs/model/room/programcontent/IterationProgramEntity;", "equals", "other", "hashCode", "toString", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IterationProgramEntity {
    private Long end;
    private final String fullSummary;

    /* renamed from: id  reason: collision with root package name */
    private final int f43735id;
    private final int instanceId;
    private final long iteration;
    private final String menu;
    private final int programId;
    private final String programSwToken;
    private final Integer progress;
    private long start;
    private final int status;
    private final String summary;
    private final Boolean unread;

    public IterationProgramEntity(int i11, long j5, int i12, int i13, long j11, Long l5, String str, String str2, String str3, Integer num, Boolean bool, String str4, int i14) {
        this.programId = i11;
        this.iteration = j5;
        this.instanceId = i12;
        this.status = i13;
        this.start = j11;
        this.end = l5;
        this.menu = str;
        this.summary = str2;
        this.fullSummary = str3;
        this.progress = num;
        this.unread = bool;
        this.programSwToken = str4;
        this.f43735id = i14;
    }

    public static /* synthetic */ IterationProgramEntity copy$default(IterationProgramEntity iterationProgramEntity, int i11, long j5, int i12, int i13, long j11, Long l5, String str, String str2, String str3, Integer num, Boolean bool, String str4, int i14, int i15, Object obj) {
        int i16;
        long j12;
        int i17;
        int i18;
        long j13;
        Long l6;
        String str5;
        String str6;
        String str7;
        Integer num2;
        Boolean bool2;
        String str8;
        int i19;
        if ((i15 & 1) != 0) {
            i16 = iterationProgramEntity.programId;
        } else {
            i16 = i11;
        }
        if ((i15 & 2) != 0) {
            j12 = iterationProgramEntity.iteration;
        } else {
            j12 = j5;
        }
        if ((i15 & 4) != 0) {
            i17 = iterationProgramEntity.instanceId;
        } else {
            i17 = i12;
        }
        if ((i15 & 8) != 0) {
            i18 = iterationProgramEntity.status;
        } else {
            i18 = i13;
        }
        if ((i15 & 16) != 0) {
            j13 = iterationProgramEntity.start;
        } else {
            j13 = j11;
        }
        if ((i15 & 32) != 0) {
            l6 = iterationProgramEntity.end;
        } else {
            l6 = l5;
        }
        if ((i15 & 64) != 0) {
            str5 = iterationProgramEntity.menu;
        } else {
            str5 = str;
        }
        if ((i15 & 128) != 0) {
            str6 = iterationProgramEntity.summary;
        } else {
            str6 = str2;
        }
        if ((i15 & 256) != 0) {
            str7 = iterationProgramEntity.fullSummary;
        } else {
            str7 = str3;
        }
        if ((i15 & 512) != 0) {
            num2 = iterationProgramEntity.progress;
        } else {
            num2 = num;
        }
        if ((i15 & 1024) != 0) {
            bool2 = iterationProgramEntity.unread;
        } else {
            bool2 = bool;
        }
        if ((i15 & ModuleCopy.f28574b) != 0) {
            str8 = iterationProgramEntity.programSwToken;
        } else {
            str8 = str4;
        }
        if ((i15 & 4096) != 0) {
            i19 = iterationProgramEntity.f43735id;
        } else {
            i19 = i14;
        }
        return iterationProgramEntity.copy(i16, j12, i17, i18, j13, l6, str5, str6, str7, num2, bool2, str8, i19);
    }

    public final int component1() {
        return this.programId;
    }

    public final Integer component10() {
        return this.progress;
    }

    public final Boolean component11() {
        return this.unread;
    }

    public final String component12() {
        return this.programSwToken;
    }

    public final int component13() {
        return this.f43735id;
    }

    public final long component2() {
        return this.iteration;
    }

    public final int component3() {
        return this.instanceId;
    }

    public final int component4() {
        return this.status;
    }

    public final long component5() {
        return this.start;
    }

    public final Long component6() {
        return this.end;
    }

    public final String component7() {
        return this.menu;
    }

    public final String component8() {
        return this.summary;
    }

    public final String component9() {
        return this.fullSummary;
    }

    public final IterationProgramEntity copy(int i11, long j5, int i12, int i13, long j11, Long l5, String str, String str2, String str3, Integer num, Boolean bool, String str4, int i14) {
        return new IterationProgramEntity(i11, j5, i12, i13, j11, l5, str, str2, str3, num, bool, str4, i14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IterationProgramEntity)) {
            return false;
        }
        IterationProgramEntity iterationProgramEntity = (IterationProgramEntity) obj;
        if (this.programId == iterationProgramEntity.programId && this.iteration == iterationProgramEntity.iteration && this.instanceId == iterationProgramEntity.instanceId && this.status == iterationProgramEntity.status && this.start == iterationProgramEntity.start && u.e(this.end, iterationProgramEntity.end) && u.e(this.menu, iterationProgramEntity.menu) && u.e(this.summary, iterationProgramEntity.summary) && u.e(this.fullSummary, iterationProgramEntity.fullSummary) && u.e(this.progress, iterationProgramEntity.progress) && u.e(this.unread, iterationProgramEntity.unread) && u.e(this.programSwToken, iterationProgramEntity.programSwToken) && this.f43735id == iterationProgramEntity.f43735id) {
            return true;
        }
        return false;
    }

    public final Long getEnd() {
        return this.end;
    }

    public final String getFullSummary() {
        return this.fullSummary;
    }

    public final int getId() {
        return this.f43735id;
    }

    public final int getInstanceId() {
        return this.instanceId;
    }

    public final long getIteration() {
        return this.iteration;
    }

    public final String getMenu() {
        return this.menu;
    }

    public final int getProgramId() {
        return this.programId;
    }

    public final String getProgramSwToken() {
        return this.programSwToken;
    }

    public final Integer getProgress() {
        return this.progress;
    }

    public final long getStart() {
        return this.start;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final Boolean getUnread() {
        return this.unread;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int a11 = c.a(this.start, h.a(this.status, h.a(this.instanceId, c.a(this.iteration, Integer.hashCode(this.programId) * 31, 31), 31), 31), 31);
        Long l5 = this.end;
        int i11 = 0;
        if (l5 == null) {
            hashCode = 0;
        } else {
            hashCode = l5.hashCode();
        }
        int i12 = (a11 + hashCode) * 31;
        String str = this.menu;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        String str2 = this.summary;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        String str3 = this.fullSummary;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i15 = (i14 + hashCode4) * 31;
        Integer num = this.progress;
        if (num == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num.hashCode();
        }
        int i16 = (i15 + hashCode5) * 31;
        Boolean bool = this.unread;
        if (bool == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = bool.hashCode();
        }
        int i17 = (i16 + hashCode6) * 31;
        String str4 = this.programSwToken;
        if (str4 != null) {
            i11 = str4.hashCode();
        }
        return Integer.hashCode(this.f43735id) + ((i17 + i11) * 31);
    }

    public final void setEnd(Long l5) {
        this.end = l5;
    }

    public final void setStart(long j5) {
        this.start = j5;
    }

    public String toString() {
        int i11 = this.programId;
        long j5 = this.iteration;
        int i12 = this.instanceId;
        int i13 = this.status;
        long j11 = this.start;
        Long l5 = this.end;
        String str = this.menu;
        String str2 = this.summary;
        String str3 = this.fullSummary;
        Integer num = this.progress;
        Boolean bool = this.unread;
        String str4 = this.programSwToken;
        int i14 = this.f43735id;
        StringBuilder sb2 = new StringBuilder("IterationProgramEntity(programId=");
        sb2.append(i11);
        sb2.append(", iteration=");
        sb2.append(j5);
        q2.c(sb2, ", instanceId=", i12, ", status=", i13);
        g.d(sb2, ", start=", j11, ", end=");
        sb2.append(l5);
        sb2.append(", menu=");
        sb2.append(str);
        sb2.append(", summary=");
        b.d(sb2, str2, ", fullSummary=", str3, ", progress=");
        sb2.append(num);
        sb2.append(", unread=");
        sb2.append(bool);
        sb2.append(", programSwToken=");
        sb2.append(str4);
        sb2.append(", id=");
        sb2.append(i14);
        sb2.append(")");
        return sb2.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ IterationProgramEntity(int r20, long r21, int r23, int r24, long r25, java.lang.Long r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, java.lang.Integer r31, java.lang.Boolean r32, java.lang.String r33, int r34, int r35, kotlin.jvm.internal.m r36) {
        /*
            r19 = this;
            r0 = r35
            r1 = r0 & 64
            r2 = 0
            if (r1 == 0) goto L9
            r12 = r2
            goto Lb
        L9:
            r12 = r28
        Lb:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L11
            r13 = r2
            goto L13
        L11:
            r13 = r29
        L13:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L19
            r14 = r2
            goto L1b
        L19:
            r14 = r30
        L1b:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L21
            r15 = r2
            goto L23
        L21:
            r15 = r31
        L23:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L2a
            r16 = r2
            goto L2c
        L2a:
            r16 = r32
        L2c:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L33
            r17 = r2
            goto L35
        L33:
            r17 = r33
        L35:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L53
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = r20
            r0.append(r1)
            r2 = r23
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            int r0 = java.lang.Integer.parseInt(r0)
            r18 = r0
            goto L59
        L53:
            r1 = r20
            r2 = r23
            r18 = r34
        L59:
            r3 = r19
            r4 = r20
            r5 = r21
            r7 = r23
            r8 = r24
            r9 = r25
            r11 = r27
            r3.<init>(r4, r5, r7, r8, r9, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.programs.model.room.programcontent.IterationProgramEntity.<init>(int, long, int, int, long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Boolean, java.lang.String, int, int, kotlin.jvm.internal.m):void");
    }
}
