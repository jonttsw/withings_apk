package com.withings.programs.model.enrolled;

import androidx.activity.result.c;
import androidx.appcompat.app.h;
import androidx.camera.camera2.internal.q2;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.programs.model.IterationComparisonKt;
import com.withings.programs.model.enrolledprogram.Menu;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.l;
import kotlin.collections.x;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: EnrolledIteration.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b,\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0085\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J\u0011\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u0000H\u0096\u0002J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010%J\u000b\u00103\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010-J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0016J\t\u00109\u001a\u00020\u0005HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0011\u0010;\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u009a\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u0010>J\u0013\u0010?\u001a\u00020\u00132\b\u00100\u001a\u0004\u0018\u00010@HÖ\u0003J\t\u0010A\u001a\u00020\u0003HÖ\u0001J\u0006\u0010B\u001a\u00020\u0013J\u0006\u0010C\u001a\u00020\u0013J\u0006\u0010D\u001a\u00020\u0013J\t\u0010E\u001a\u00020\u000bHÖ\u0001R\u001e\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001bR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010&\u001a\u0004\b$\u0010%R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001f\"\u0004\b(\u0010)R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001dR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001bR\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-¨\u0006F"}, d2 = {"Lcom/withings/programs/model/enrolled/EnrolledIteration;", "", NavigationArguments.INSTANCE_ID, "", "iteration", "", NavigationArguments.PROGRAM_ID, "status", "end", "start", "fullSummary", "", "menu", "", "Lcom/withings/programs/model/enrolledprogram/Menu;", "programSwToken", "progress", "summary", "unread", "", "(IJIILjava/lang/Long;JLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)V", "getEnd", "()Ljava/lang/Long;", "setEnd", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getFullSummary", "()Ljava/lang/String;", "getInstanceId", "()I", "getIteration", "()J", "getMenu", "()Ljava/util/List;", "getProgramId", "getProgramSwToken", "getProgress", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStart", "setStart", "(J)V", "getStatus", "getSummary", "getUnread", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "compareTo", "other", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(IJIILjava/lang/Long;JLjava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/withings/programs/model/enrolled/EnrolledIteration;", "equals", "", "hashCode", "isActive", "isFinishedOrArchived", "isIterationFinished", "toString", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EnrolledIteration implements Comparable<EnrolledIteration> {
    private Long end;
    private final String fullSummary;
    private final int instanceId;
    private final long iteration;
    private final List<Menu> menu;
    private final int programId;
    private final String programSwToken;
    private final Integer progress;
    private long start;
    private final int status;
    private final String summary;
    private final Boolean unread;

    public EnrolledIteration(int i11, long j5, int i12, int i13, Long l5, long j11, String str, List<Menu> list, String str2, Integer num, String str3, Boolean bool) {
        this.instanceId = i11;
        this.iteration = j5;
        this.programId = i12;
        this.status = i13;
        this.end = l5;
        this.start = j11;
        this.fullSummary = str;
        this.menu = list;
        this.programSwToken = str2;
        this.progress = num;
        this.summary = str3;
        this.unread = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EnrolledIteration copy$default(EnrolledIteration enrolledIteration, int i11, long j5, int i12, int i13, Long l5, long j11, String str, List list, String str2, Integer num, String str3, Boolean bool, int i14, Object obj) {
        int i15;
        long j12;
        int i16;
        int i17;
        Long l6;
        long j13;
        String str4;
        List<Menu> list2;
        String str5;
        Integer num2;
        String str6;
        Boolean bool2;
        if ((i14 & 1) != 0) {
            i15 = enrolledIteration.instanceId;
        } else {
            i15 = i11;
        }
        if ((i14 & 2) != 0) {
            j12 = enrolledIteration.iteration;
        } else {
            j12 = j5;
        }
        if ((i14 & 4) != 0) {
            i16 = enrolledIteration.programId;
        } else {
            i16 = i12;
        }
        if ((i14 & 8) != 0) {
            i17 = enrolledIteration.status;
        } else {
            i17 = i13;
        }
        if ((i14 & 16) != 0) {
            l6 = enrolledIteration.end;
        } else {
            l6 = l5;
        }
        if ((i14 & 32) != 0) {
            j13 = enrolledIteration.start;
        } else {
            j13 = j11;
        }
        if ((i14 & 64) != 0) {
            str4 = enrolledIteration.fullSummary;
        } else {
            str4 = str;
        }
        if ((i14 & 128) != 0) {
            list2 = enrolledIteration.menu;
        } else {
            list2 = list;
        }
        if ((i14 & 256) != 0) {
            str5 = enrolledIteration.programSwToken;
        } else {
            str5 = str2;
        }
        if ((i14 & 512) != 0) {
            num2 = enrolledIteration.progress;
        } else {
            num2 = num;
        }
        if ((i14 & 1024) != 0) {
            str6 = enrolledIteration.summary;
        } else {
            str6 = str3;
        }
        if ((i14 & ModuleCopy.f28574b) != 0) {
            bool2 = enrolledIteration.unread;
        } else {
            bool2 = bool;
        }
        return enrolledIteration.copy(i15, j12, i16, i17, l6, j13, str4, list2, str5, num2, str6, bool2);
    }

    public final int component1() {
        return this.instanceId;
    }

    public final Integer component10() {
        return this.progress;
    }

    public final String component11() {
        return this.summary;
    }

    public final Boolean component12() {
        return this.unread;
    }

    public final long component2() {
        return this.iteration;
    }

    public final int component3() {
        return this.programId;
    }

    public final int component4() {
        return this.status;
    }

    public final Long component5() {
        return this.end;
    }

    public final long component6() {
        return this.start;
    }

    public final String component7() {
        return this.fullSummary;
    }

    public final List<Menu> component8() {
        return this.menu;
    }

    public final String component9() {
        return this.programSwToken;
    }

    public final EnrolledIteration copy(int i11, long j5, int i12, int i13, Long l5, long j11, String str, List<Menu> list, String str2, Integer num, String str3, Boolean bool) {
        return new EnrolledIteration(i11, j5, i12, i13, l5, j11, str, list, str2, num, str3, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnrolledIteration)) {
            return false;
        }
        EnrolledIteration enrolledIteration = (EnrolledIteration) obj;
        if (this.instanceId == enrolledIteration.instanceId && this.iteration == enrolledIteration.iteration && this.programId == enrolledIteration.programId && this.status == enrolledIteration.status && u.e(this.end, enrolledIteration.end) && this.start == enrolledIteration.start && u.e(this.fullSummary, enrolledIteration.fullSummary) && u.e(this.menu, enrolledIteration.menu) && u.e(this.programSwToken, enrolledIteration.programSwToken) && u.e(this.progress, enrolledIteration.progress) && u.e(this.summary, enrolledIteration.summary) && u.e(this.unread, enrolledIteration.unread)) {
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

    public final int getInstanceId() {
        return this.instanceId;
    }

    public final long getIteration() {
        return this.iteration;
    }

    public final List<Menu> getMenu() {
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
        int a11 = h.a(this.status, h.a(this.programId, c.a(this.iteration, Integer.hashCode(this.instanceId) * 31, 31), 31), 31);
        Long l5 = this.end;
        int i11 = 0;
        if (l5 == null) {
            hashCode = 0;
        } else {
            hashCode = l5.hashCode();
        }
        int a12 = c.a(this.start, (a11 + hashCode) * 31, 31);
        String str = this.fullSummary;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i12 = (a12 + hashCode2) * 31;
        List<Menu> list = this.menu;
        if (list == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = list.hashCode();
        }
        int i13 = (i12 + hashCode3) * 31;
        String str2 = this.programSwToken;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        Integer num = this.progress;
        if (num == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num.hashCode();
        }
        int i15 = (i14 + hashCode5) * 31;
        String str3 = this.summary;
        if (str3 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str3.hashCode();
        }
        int i16 = (i15 + hashCode6) * 31;
        Boolean bool = this.unread;
        if (bool != null) {
            i11 = bool.hashCode();
        }
        return i16 + i11;
    }

    public final boolean isActive() {
        return x.W(1, 2).contains(Integer.valueOf(this.status));
    }

    public final boolean isFinishedOrArchived() {
        return l.m(new Integer[]{3, 4, 5}, Integer.valueOf(this.status));
    }

    public final boolean isIterationFinished() {
        if (this.status == 3) {
            return true;
        }
        return false;
    }

    public final void setEnd(Long l5) {
        this.end = l5;
    }

    public final void setStart(long j5) {
        this.start = j5;
    }

    public String toString() {
        int i11 = this.instanceId;
        long j5 = this.iteration;
        int i12 = this.programId;
        int i13 = this.status;
        Long l5 = this.end;
        long j11 = this.start;
        String str = this.fullSummary;
        List<Menu> list = this.menu;
        String str2 = this.programSwToken;
        Integer num = this.progress;
        String str3 = this.summary;
        Boolean bool = this.unread;
        StringBuilder sb2 = new StringBuilder("EnrolledIteration(instanceId=");
        sb2.append(i11);
        sb2.append(", iteration=");
        sb2.append(j5);
        q2.c(sb2, ", programId=", i12, ", status=", i13);
        sb2.append(", end=");
        sb2.append(l5);
        sb2.append(", start=");
        sb2.append(j11);
        sb2.append(", fullSummary=");
        sb2.append(str);
        sb2.append(", menu=");
        sb2.append(list);
        sb2.append(", programSwToken=");
        sb2.append(str2);
        sb2.append(", progress=");
        sb2.append(num);
        sb2.append(", summary=");
        sb2.append(str3);
        sb2.append(", unread=");
        sb2.append(bool);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // java.lang.Comparable
    public int compareTo(EnrolledIteration other) {
        u.j(other, "other");
        if (u.e(this, other)) {
            return 0;
        }
        Long l5 = this.end;
        long j5 = this.start;
        return IterationComparisonKt.iterationComparison(this.status, other.status, l5, other.end, j5, other.start);
    }

    public /* synthetic */ EnrolledIteration(int i11, long j5, int i12, int i13, Long l5, long j11, String str, List list, String str2, Integer num, String str3, Boolean bool, int i14, m mVar) {
        this(i11, j5, i12, i13, l5, j11, (i14 & 64) != 0 ? null : str, (i14 & 128) != 0 ? null : list, (i14 & 256) != 0 ? null : str2, (i14 & 512) != 0 ? null : num, (i14 & 1024) != 0 ? null : str3, (i14 & ModuleCopy.f28574b) != 0 ? null : bool);
    }
}
