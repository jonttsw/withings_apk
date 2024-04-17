package com.withings.programs.model.enrolled;

import cp0.n;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import pm0.a;
/* compiled from: EnrolledDetail.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0006\u0010\u0016\u001a\u00020\rJ\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/withings/programs/model/enrolled/EnrolledDetail;", "", "enrolledState", "Lcom/withings/programs/model/enrolled/EnrolledState;", "iterations", "", "Lcom/withings/programs/model/enrolled/EnrolledIteration;", "(Lcom/withings/programs/model/enrolled/EnrolledState;Ljava/util/List;)V", "getEnrolledState", "()Lcom/withings/programs/model/enrolled/EnrolledState;", "getIterations", "()Ljava/util/List;", "atLeastOneIterationFinished", "", "component1", "component2", "copy", "equals", "other", "getLastIteration", "hashCode", "", "isLastIterationFinished", "lastFinishedIteration", "runningIteration", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EnrolledDetail {
    private final EnrolledState enrolledState;
    private final List<EnrolledIteration> iterations;

    public EnrolledDetail(EnrolledState enrolledState, List<EnrolledIteration> list) {
        this.enrolledState = enrolledState;
        this.iterations = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EnrolledDetail copy$default(EnrolledDetail enrolledDetail, EnrolledState enrolledState, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            enrolledState = enrolledDetail.enrolledState;
        }
        if ((i11 & 2) != 0) {
            list = enrolledDetail.iterations;
        }
        return enrolledDetail.copy(enrolledState, list);
    }

    public final boolean atLeastOneIterationFinished() {
        List<EnrolledIteration> list = this.iterations;
        if (list == null) {
            return false;
        }
        List<EnrolledIteration> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (EnrolledIteration enrolledIteration : list2) {
            if (enrolledIteration.getStatus() == 3) {
                return true;
            }
        }
        return false;
    }

    public final EnrolledState component1() {
        return this.enrolledState;
    }

    public final List<EnrolledIteration> component2() {
        return this.iterations;
    }

    public final EnrolledDetail copy(EnrolledState enrolledState, List<EnrolledIteration> list) {
        return new EnrolledDetail(enrolledState, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnrolledDetail)) {
            return false;
        }
        EnrolledDetail enrolledDetail = (EnrolledDetail) obj;
        if (u.e(this.enrolledState, enrolledDetail.enrolledState) && u.e(this.iterations, enrolledDetail.iterations)) {
            return true;
        }
        return false;
    }

    public final EnrolledState getEnrolledState() {
        return this.enrolledState;
    }

    public final List<EnrolledIteration> getIterations() {
        return this.iterations;
    }

    public final EnrolledIteration getLastIteration() {
        List<EnrolledIteration> list = this.iterations;
        if (list != null) {
            return (EnrolledIteration) x.Y(list);
        }
        return null;
    }

    public int hashCode() {
        int hashCode;
        EnrolledState enrolledState = this.enrolledState;
        int i11 = 0;
        if (enrolledState == null) {
            hashCode = 0;
        } else {
            hashCode = enrolledState.hashCode();
        }
        int i12 = hashCode * 31;
        List<EnrolledIteration> list = this.iterations;
        if (list != null) {
            i11 = list.hashCode();
        }
        return i12 + i11;
    }

    public final boolean isLastIterationFinished() {
        EnrolledIteration lastIteration = getLastIteration();
        if (lastIteration == null || lastIteration.getStatus() != 3) {
            return false;
        }
        return true;
    }

    public final EnrolledIteration lastFinishedIteration() {
        List<EnrolledIteration> list = this.iterations;
        EnrolledIteration enrolledIteration = null;
        if (list == null) {
            return null;
        }
        Iterator<Object> it = n.y(x.t(list), new Comparator() { // from class: com.withings.programs.model.enrolled.EnrolledDetail$lastFinishedIteration$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                return a.b(Long.valueOf(((EnrolledIteration) t11).getStart()), Long.valueOf(((EnrolledIteration) t12).getStart()));
            }
        }).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((EnrolledIteration) next).getStatus() == 3) {
                enrolledIteration = next;
            }
        }
        return enrolledIteration;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.withings.programs.model.enrolled.EnrolledIteration runningIteration() {
        /*
            r6 = this;
            java.util.List<com.withings.programs.model.enrolled.EnrolledIteration> r0 = r6.iterations
            r1 = 0
            if (r0 == 0) goto L29
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L27
            java.lang.Object r2 = r0.next()
            r3 = r2
            com.withings.programs.model.enrolled.EnrolledIteration r3 = (com.withings.programs.model.enrolled.EnrolledIteration) r3
            int r4 = r3.getStatus()
            r5 = 2
            if (r4 == r5) goto L26
            int r3 = r3.getStatus()
            r4 = 1
            if (r3 != r4) goto Lb
        L26:
            r1 = r2
        L27:
            com.withings.programs.model.enrolled.EnrolledIteration r1 = (com.withings.programs.model.enrolled.EnrolledIteration) r1
        L29:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.programs.model.enrolled.EnrolledDetail.runningIteration():com.withings.programs.model.enrolled.EnrolledIteration");
    }

    public String toString() {
        EnrolledState enrolledState = this.enrolledState;
        List<EnrolledIteration> list = this.iterations;
        return "EnrolledDetail(enrolledState=" + enrolledState + ", iterations=" + list + ")";
    }
}
