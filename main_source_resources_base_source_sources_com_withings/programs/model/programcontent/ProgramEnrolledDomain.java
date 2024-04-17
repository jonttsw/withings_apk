package com.withings.programs.model.programcontent;

import androidx.appcompat.app.h;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import kotlin.Metadata;
/* compiled from: ProgramEnrolledDomain.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/withings/programs/model/programcontent/ProgramEnrolledDomain;", "", "modified", "", NavigationArguments.PROGRAM_ID, "", NavigationArguments.USER_ID, "(JIJ)V", "getModified", "()J", "getProgramId", "()I", "getUserId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProgramEnrolledDomain {
    private final long modified;
    private final int programId;
    private final long userId;

    public ProgramEnrolledDomain(long j5, int i11, long j11) {
        this.modified = j5;
        this.programId = i11;
        this.userId = j11;
    }

    public static /* synthetic */ ProgramEnrolledDomain copy$default(ProgramEnrolledDomain programEnrolledDomain, long j5, int i11, long j11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j5 = programEnrolledDomain.modified;
        }
        long j12 = j5;
        if ((i12 & 2) != 0) {
            i11 = programEnrolledDomain.programId;
        }
        int i13 = i11;
        if ((i12 & 4) != 0) {
            j11 = programEnrolledDomain.userId;
        }
        return programEnrolledDomain.copy(j12, i13, j11);
    }

    public final long component1() {
        return this.modified;
    }

    public final int component2() {
        return this.programId;
    }

    public final long component3() {
        return this.userId;
    }

    public final ProgramEnrolledDomain copy(long j5, int i11, long j11) {
        return new ProgramEnrolledDomain(j5, i11, j11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgramEnrolledDomain)) {
            return false;
        }
        ProgramEnrolledDomain programEnrolledDomain = (ProgramEnrolledDomain) obj;
        if (this.modified == programEnrolledDomain.modified && this.programId == programEnrolledDomain.programId && this.userId == programEnrolledDomain.userId) {
            return true;
        }
        return false;
    }

    public final long getModified() {
        return this.modified;
    }

    public final int getProgramId() {
        return this.programId;
    }

    public final long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return Long.hashCode(this.userId) + h.a(this.programId, Long.hashCode(this.modified) * 31, 31);
    }

    public String toString() {
        long j5 = this.modified;
        int i11 = this.programId;
        long j11 = this.userId;
        return "ProgramEnrolledDomain(modified=" + j5 + ", programId=" + i11 + ", userId=" + j11 + ")";
    }
}
