package com.withings.programs.model.programcontent;

import com.withings.library.authentication.api.ConstantsWs;
import dp0.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: ProgramContentDomain.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/withings/programs/model/programcontent/ProgramContentDomain;", "", "enrolledDetail", "Lcom/withings/programs/model/programcontent/ProgramEnrolledDomain;", "iterations", "", "Lcom/withings/programs/model/programcontent/ProgramIterationDomain;", "programDetail", "Lcom/withings/programs/model/programcontent/ProgramDetailDomain;", "(Lcom/withings/programs/model/programcontent/ProgramEnrolledDomain;Ljava/util/List;Lcom/withings/programs/model/programcontent/ProgramDetailDomain;)V", "getEnrolledDetail", "()Lcom/withings/programs/model/programcontent/ProgramEnrolledDomain;", "getIterations", "()Ljava/util/List;", "getProgramDetail", "()Lcom/withings/programs/model/programcontent/ProgramDetailDomain;", "component1", "component2", "component3", "copy", "equals", "", "other", "getLastIteration", "hashCode", "", "toString", "", "Companion", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProgramContentDomain {
    public static final Companion Companion = new Companion(null);
    private final ProgramEnrolledDomain enrolledDetail;
    private final List<ProgramIterationDomain> iterations;
    private final ProgramDetailDomain programDetail;

    /* compiled from: ProgramContentDomain.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0003\u001a\u00020\u0004*\u0004\u0018\u00010\u0005J\f\u0010\u0006\u001a\u00020\u0004*\u0004\u0018\u00010\u0005¨\u0006\u0007"}, d2 = {"Lcom/withings/programs/model/programcontent/ProgramContentDomain$Companion;", "", "()V", "isDataComplete", "", "Lcom/withings/programs/model/programcontent/ProgramContentDomain;", "isDataLoaded", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final boolean isDataComplete(ProgramContentDomain programContentDomain) {
            ProgramDetailDomain programDetail;
            String programOverview;
            if (programContentDomain != null && (programDetail = programContentDomain.getProgramDetail()) != null && (programOverview = programDetail.getProgramOverview()) != null) {
                return !j.D(programOverview);
            }
            return false;
        }

        public final boolean isDataLoaded(ProgramContentDomain programContentDomain) {
            String str;
            ProgramDetailDomain programDetail;
            if (programContentDomain != null && (programDetail = programContentDomain.getProgramDetail()) != null) {
                str = programDetail.getData();
            } else {
                str = null;
            }
            if (str != null && !u.e(programContentDomain.getProgramDetail().getData(), ConstantsWs.PARAMETER_VALUE_NULL)) {
                return true;
            }
            return false;
        }

        private Companion() {
        }
    }

    public ProgramContentDomain(ProgramEnrolledDomain programEnrolledDomain, List<ProgramIterationDomain> list, ProgramDetailDomain programDetail) {
        u.j(programDetail, "programDetail");
        this.enrolledDetail = programEnrolledDomain;
        this.iterations = list;
        this.programDetail = programDetail;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProgramContentDomain copy$default(ProgramContentDomain programContentDomain, ProgramEnrolledDomain programEnrolledDomain, List list, ProgramDetailDomain programDetailDomain, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            programEnrolledDomain = programContentDomain.enrolledDetail;
        }
        if ((i11 & 2) != 0) {
            list = programContentDomain.iterations;
        }
        if ((i11 & 4) != 0) {
            programDetailDomain = programContentDomain.programDetail;
        }
        return programContentDomain.copy(programEnrolledDomain, list, programDetailDomain);
    }

    public final ProgramEnrolledDomain component1() {
        return this.enrolledDetail;
    }

    public final List<ProgramIterationDomain> component2() {
        return this.iterations;
    }

    public final ProgramDetailDomain component3() {
        return this.programDetail;
    }

    public final ProgramContentDomain copy(ProgramEnrolledDomain programEnrolledDomain, List<ProgramIterationDomain> list, ProgramDetailDomain programDetail) {
        u.j(programDetail, "programDetail");
        return new ProgramContentDomain(programEnrolledDomain, list, programDetail);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgramContentDomain)) {
            return false;
        }
        ProgramContentDomain programContentDomain = (ProgramContentDomain) obj;
        if (u.e(this.enrolledDetail, programContentDomain.enrolledDetail) && u.e(this.iterations, programContentDomain.iterations) && u.e(this.programDetail, programContentDomain.programDetail)) {
            return true;
        }
        return false;
    }

    public final ProgramEnrolledDomain getEnrolledDetail() {
        return this.enrolledDetail;
    }

    public final List<ProgramIterationDomain> getIterations() {
        return this.iterations;
    }

    public final ProgramIterationDomain getLastIteration() {
        List<ProgramIterationDomain> list = this.iterations;
        if (list != null) {
            return (ProgramIterationDomain) x.Y(list);
        }
        return null;
    }

    public final ProgramDetailDomain getProgramDetail() {
        return this.programDetail;
    }

    public int hashCode() {
        int hashCode;
        ProgramEnrolledDomain programEnrolledDomain = this.enrolledDetail;
        int i11 = 0;
        if (programEnrolledDomain == null) {
            hashCode = 0;
        } else {
            hashCode = programEnrolledDomain.hashCode();
        }
        int i12 = hashCode * 31;
        List<ProgramIterationDomain> list = this.iterations;
        if (list != null) {
            i11 = list.hashCode();
        }
        return this.programDetail.hashCode() + ((i12 + i11) * 31);
    }

    public String toString() {
        ProgramEnrolledDomain programEnrolledDomain = this.enrolledDetail;
        List<ProgramIterationDomain> list = this.iterations;
        ProgramDetailDomain programDetailDomain = this.programDetail;
        return "ProgramContentDomain(enrolledDetail=" + programEnrolledDomain + ", iterations=" + list + ", programDetail=" + programDetailDomain + ")";
    }
}
