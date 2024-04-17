package com.withings.programs.model.enrolled;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import kotlin.Metadata;
/* compiled from: EnrolledState.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/withings/programs/model/enrolled/EnrolledState;", "", "modified", "", NavigationArguments.PROGRAM_ID, "", "(JI)V", "getModified", "()J", "getProgramId", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EnrolledState {
    private final long modified;
    private final int programId;

    public EnrolledState(long j5, int i11) {
        this.modified = j5;
        this.programId = i11;
    }

    public static /* synthetic */ EnrolledState copy$default(EnrolledState enrolledState, long j5, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j5 = enrolledState.modified;
        }
        if ((i12 & 2) != 0) {
            i11 = enrolledState.programId;
        }
        return enrolledState.copy(j5, i11);
    }

    public final long component1() {
        return this.modified;
    }

    public final int component2() {
        return this.programId;
    }

    public final EnrolledState copy(long j5, int i11) {
        return new EnrolledState(j5, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnrolledState)) {
            return false;
        }
        EnrolledState enrolledState = (EnrolledState) obj;
        if (this.modified == enrolledState.modified && this.programId == enrolledState.programId) {
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

    public int hashCode() {
        return Integer.hashCode(this.programId) + (Long.hashCode(this.modified) * 31);
    }

    public String toString() {
        long j5 = this.modified;
        int i11 = this.programId;
        return "EnrolledState(modified=" + j5 + ", programId=" + i11 + ")";
    }
}
