package com.withings.programs.model;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.joda.time.DateTime;
/* compiled from: LastIterationDate.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/withings/programs/model/LastIterationDate;", "", "iterationDate", "Lorg/joda/time/DateTime;", NavigationArguments.PROGRAM_ID, "", "(Lorg/joda/time/DateTime;I)V", "getIterationDate", "()Lorg/joda/time/DateTime;", "getProgramId", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LastIterationDate {
    private final DateTime iterationDate;
    private final int programId;

    public LastIterationDate(DateTime dateTime, int i11) {
        this.iterationDate = dateTime;
        this.programId = i11;
    }

    public static /* synthetic */ LastIterationDate copy$default(LastIterationDate lastIterationDate, DateTime dateTime, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            dateTime = lastIterationDate.iterationDate;
        }
        if ((i12 & 2) != 0) {
            i11 = lastIterationDate.programId;
        }
        return lastIterationDate.copy(dateTime, i11);
    }

    public final DateTime component1() {
        return this.iterationDate;
    }

    public final int component2() {
        return this.programId;
    }

    public final LastIterationDate copy(DateTime dateTime, int i11) {
        return new LastIterationDate(dateTime, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LastIterationDate)) {
            return false;
        }
        LastIterationDate lastIterationDate = (LastIterationDate) obj;
        if (u.e(this.iterationDate, lastIterationDate.iterationDate) && this.programId == lastIterationDate.programId) {
            return true;
        }
        return false;
    }

    public final DateTime getIterationDate() {
        return this.iterationDate;
    }

    public final int getProgramId() {
        return this.programId;
    }

    public int hashCode() {
        int hashCode;
        DateTime dateTime = this.iterationDate;
        if (dateTime == null) {
            hashCode = 0;
        } else {
            hashCode = dateTime.hashCode();
        }
        return Integer.hashCode(this.programId) + (hashCode * 31);
    }

    public String toString() {
        DateTime dateTime = this.iterationDate;
        int i11 = this.programId;
        return "LastIterationDate(iterationDate=" + dateTime + ", programId=" + i11 + ")";
    }
}
