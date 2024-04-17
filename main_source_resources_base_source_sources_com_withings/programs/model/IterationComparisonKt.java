package com.withings.programs.model;

import kotlin.Metadata;
/* compiled from: IterationComparison.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\u001aA\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0000¢\u0006\u0002\u0010\t\u001a\u001d\u0010\n\u001a\u00020\u000b*\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0002\u0010\r\u001a\u0014\u0010\u000e\u001a\u00020\u000b*\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0002\u001a\u0014\u0010\u000f\u001a\u00020\u000b*\u00020\u00012\u0006\u0010\f\u001a\u00020\u0001H\u0002\u001a\u001d\u0010\u0010\u001a\u00020\u000b*\u0004\u0018\u00010\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0002\u0010\r\u001a\u0014\u0010\u0011\u001a\u00020\u000b*\u00020\u00012\u0006\u0010\f\u001a\u00020\u0001H\u0002¨\u0006\u0012"}, d2 = {"iterationComparison", "", "currentStatus", "otherStatus", "currentEnd", "", "otherEnd", "currentStart", "otherStart", "(IILjava/lang/Long;Ljava/lang/Long;JJ)I", "checkEndDateComparedTo", "", "other", "(Ljava/lang/Long;Ljava/lang/Long;)Z", "checkStartDateComparedTo", "checkStatusComparedTo", "sameEndDate", "sameStatus", "core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IterationComparisonKt {
    private static final boolean checkEndDateComparedTo(Long l5, Long l6) {
        if (l5 != null && l6 == null) {
            return true;
        }
        return false;
    }

    private static final boolean checkStartDateComparedTo(long j5, long j11) {
        if (j5 < j11) {
            return true;
        }
        return false;
    }

    private static final boolean checkStatusComparedTo(int i11, int i12) {
        if (i11 != 2 && i12 == 2) {
            return true;
        }
        return false;
    }

    public static final int iterationComparison(int i11, int i12, Long l5, Long l6, long j5, long j11) {
        if (!checkStatusComparedTo(i11, i12) && ((!sameStatus(i11, i12) || !checkEndDateComparedTo(l5, l6)) && (!sameStatus(i11, i12) || !sameEndDate(l5, l6) || !checkStartDateComparedTo(j5, j11)))) {
            return 1;
        }
        return -1;
    }

    private static final boolean sameEndDate(Long l5, Long l6) {
        if (l5 == null && l6 == null) {
            return true;
        }
        return false;
    }

    private static final boolean sameStatus(int i11, int i12) {
        if (i11 == 2 && i12 == 2) {
            return true;
        }
        return false;
    }
}
