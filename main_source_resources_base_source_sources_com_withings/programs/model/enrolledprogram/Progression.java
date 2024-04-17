package com.withings.programs.model.enrolledprogram;

import androidx.activity.result.c;
import androidx.camera.camera2.internal.h2;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: Progression.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b%\b\u0086\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\u0011J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0010\u0010,\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010#J\u000b\u0010-\u001a\u0004\u0018\u00010\u000bHÆ\u0003J|\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010/J\u0013\u00100\u001a\u00020\u000f2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0003HÖ\u0001J\t\u00103\u001a\u00020\u000bHÖ\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#¨\u00064"}, d2 = {"Lcom/withings/programs/model/enrolledprogram/Progression;", "", "status", "", "start", "", "end", "menu", "", "Lcom/withings/programs/model/enrolledprogram/Menu;", "summary", "", "fullSummary", "progress", "unread", "", "programSwToken", "(IJLjava/lang/Long;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;)V", "getEnd", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getFullSummary", "()Ljava/lang/String;", "getMenu", "()Ljava/util/List;", "getProgramSwToken", "getProgress", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStart", "()J", "getStatus", "()I", "getSummary", "getUnread", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(IJLjava/lang/Long;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/withings/programs/model/enrolledprogram/Progression;", "equals", "other", "hashCode", "toString", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Progression {
    private final Long end;
    private final String fullSummary;
    private final List<Menu> menu;
    private final String programSwToken;
    private final Integer progress;
    private final long start;
    private final int status;
    private final String summary;
    private final Boolean unread;

    public Progression(int i11, long j5, Long l5, List<Menu> list, String str, String str2, Integer num, Boolean bool, String str3) {
        this.status = i11;
        this.start = j5;
        this.end = l5;
        this.menu = list;
        this.summary = str;
        this.fullSummary = str2;
        this.progress = num;
        this.unread = bool;
        this.programSwToken = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Progression copy$default(Progression progression, int i11, long j5, Long l5, List list, String str, String str2, Integer num, Boolean bool, String str3, int i12, Object obj) {
        int i13;
        long j11;
        Long l6;
        List<Menu> list2;
        String str4;
        String str5;
        Integer num2;
        Boolean bool2;
        String str6;
        if ((i12 & 1) != 0) {
            i13 = progression.status;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            j11 = progression.start;
        } else {
            j11 = j5;
        }
        if ((i12 & 4) != 0) {
            l6 = progression.end;
        } else {
            l6 = l5;
        }
        if ((i12 & 8) != 0) {
            list2 = progression.menu;
        } else {
            list2 = list;
        }
        if ((i12 & 16) != 0) {
            str4 = progression.summary;
        } else {
            str4 = str;
        }
        if ((i12 & 32) != 0) {
            str5 = progression.fullSummary;
        } else {
            str5 = str2;
        }
        if ((i12 & 64) != 0) {
            num2 = progression.progress;
        } else {
            num2 = num;
        }
        if ((i12 & 128) != 0) {
            bool2 = progression.unread;
        } else {
            bool2 = bool;
        }
        if ((i12 & 256) != 0) {
            str6 = progression.programSwToken;
        } else {
            str6 = str3;
        }
        return progression.copy(i13, j11, l6, list2, str4, str5, num2, bool2, str6);
    }

    public final int component1() {
        return this.status;
    }

    public final long component2() {
        return this.start;
    }

    public final Long component3() {
        return this.end;
    }

    public final List<Menu> component4() {
        return this.menu;
    }

    public final String component5() {
        return this.summary;
    }

    public final String component6() {
        return this.fullSummary;
    }

    public final Integer component7() {
        return this.progress;
    }

    public final Boolean component8() {
        return this.unread;
    }

    public final String component9() {
        return this.programSwToken;
    }

    public final Progression copy(int i11, long j5, Long l5, List<Menu> list, String str, String str2, Integer num, Boolean bool, String str3) {
        return new Progression(i11, j5, l5, list, str, str2, num, bool, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Progression)) {
            return false;
        }
        Progression progression = (Progression) obj;
        if (this.status == progression.status && this.start == progression.start && u.e(this.end, progression.end) && u.e(this.menu, progression.menu) && u.e(this.summary, progression.summary) && u.e(this.fullSummary, progression.fullSummary) && u.e(this.progress, progression.progress) && u.e(this.unread, progression.unread) && u.e(this.programSwToken, progression.programSwToken)) {
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

    public final List<Menu> getMenu() {
        return this.menu;
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
        int a11 = c.a(this.start, Integer.hashCode(this.status) * 31, 31);
        Long l5 = this.end;
        int i11 = 0;
        if (l5 == null) {
            hashCode = 0;
        } else {
            hashCode = l5.hashCode();
        }
        int i12 = (a11 + hashCode) * 31;
        List<Menu> list = this.menu;
        if (list == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        String str = this.summary;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        String str2 = this.fullSummary;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
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
        String str3 = this.programSwToken;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return i17 + i11;
    }

    public String toString() {
        int i11 = this.status;
        long j5 = this.start;
        Long l5 = this.end;
        List<Menu> list = this.menu;
        String str = this.summary;
        String str2 = this.fullSummary;
        Integer num = this.progress;
        Boolean bool = this.unread;
        String str3 = this.programSwToken;
        StringBuilder sb2 = new StringBuilder("Progression(status=");
        sb2.append(i11);
        sb2.append(", start=");
        sb2.append(j5);
        sb2.append(", end=");
        sb2.append(l5);
        sb2.append(", menu=");
        sb2.append(list);
        b.d(sb2, ", summary=", str, ", fullSummary=", str2);
        sb2.append(", progress=");
        sb2.append(num);
        sb2.append(", unread=");
        sb2.append(bool);
        return h2.c(sb2, ", programSwToken=", str3, ")");
    }

    public /* synthetic */ Progression(int i11, long j5, Long l5, List list, String str, String str2, Integer num, Boolean bool, String str3, int i12, m mVar) {
        this(i11, j5, l5, (i12 & 8) != 0 ? null : list, (i12 & 16) != 0 ? null : str, (i12 & 32) != 0 ? null : str2, (i12 & 64) != 0 ? null : num, (i12 & 128) != 0 ? null : bool, (i12 & 256) != 0 ? null : str3);
    }
}
