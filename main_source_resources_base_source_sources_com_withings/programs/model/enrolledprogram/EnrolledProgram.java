package com.withings.programs.model.enrolledprogram;

import androidx.activity.result.c;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: EnrolledProgram.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\fHÆ\u0003JC\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, d2 = {"Lcom/withings/programs/model/enrolledprogram/EnrolledProgram;", "", NavigationArguments.PROGRAM_ID, "", "modified", "", "deployment", "", "iterationPrograms", "", "Lcom/withings/programs/model/enrolledprogram/IterationProgram;", "specifics", "Lcom/withings/programs/model/enrolledprogram/Specifics;", "(IJLjava/lang/String;Ljava/util/List;Lcom/withings/programs/model/enrolledprogram/Specifics;)V", "getDeployment", "()Ljava/lang/String;", "getIterationPrograms", "()Ljava/util/List;", "getModified", "()J", "getProgramId", "()I", "getSpecifics", "()Lcom/withings/programs/model/enrolledprogram/Specifics;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EnrolledProgram {
    private final String deployment;
    private final List<IterationProgram> iterationPrograms;
    private final long modified;
    private final int programId;
    private final Specifics specifics;

    public EnrolledProgram(int i11, long j5, String deployment, List<IterationProgram> iterationPrograms, Specifics specifics) {
        u.j(deployment, "deployment");
        u.j(iterationPrograms, "iterationPrograms");
        this.programId = i11;
        this.modified = j5;
        this.deployment = deployment;
        this.iterationPrograms = iterationPrograms;
        this.specifics = specifics;
    }

    public static /* synthetic */ EnrolledProgram copy$default(EnrolledProgram enrolledProgram, int i11, long j5, String str, List list, Specifics specifics, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = enrolledProgram.programId;
        }
        if ((i12 & 2) != 0) {
            j5 = enrolledProgram.modified;
        }
        long j11 = j5;
        if ((i12 & 4) != 0) {
            str = enrolledProgram.deployment;
        }
        String str2 = str;
        List<IterationProgram> list2 = list;
        if ((i12 & 8) != 0) {
            list2 = enrolledProgram.iterationPrograms;
        }
        List list3 = list2;
        if ((i12 & 16) != 0) {
            specifics = enrolledProgram.specifics;
        }
        return enrolledProgram.copy(i11, j11, str2, list3, specifics);
    }

    public final int component1() {
        return this.programId;
    }

    public final long component2() {
        return this.modified;
    }

    public final String component3() {
        return this.deployment;
    }

    public final List<IterationProgram> component4() {
        return this.iterationPrograms;
    }

    public final Specifics component5() {
        return this.specifics;
    }

    public final EnrolledProgram copy(int i11, long j5, String deployment, List<IterationProgram> iterationPrograms, Specifics specifics) {
        u.j(deployment, "deployment");
        u.j(iterationPrograms, "iterationPrograms");
        return new EnrolledProgram(i11, j5, deployment, iterationPrograms, specifics);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnrolledProgram)) {
            return false;
        }
        EnrolledProgram enrolledProgram = (EnrolledProgram) obj;
        if (this.programId == enrolledProgram.programId && this.modified == enrolledProgram.modified && u.e(this.deployment, enrolledProgram.deployment) && u.e(this.iterationPrograms, enrolledProgram.iterationPrograms) && u.e(this.specifics, enrolledProgram.specifics)) {
            return true;
        }
        return false;
    }

    public final String getDeployment() {
        return this.deployment;
    }

    public final List<IterationProgram> getIterationPrograms() {
        return this.iterationPrograms;
    }

    public final long getModified() {
        return this.modified;
    }

    public final int getProgramId() {
        return this.programId;
    }

    public final Specifics getSpecifics() {
        return this.specifics;
    }

    public int hashCode() {
        int hashCode;
        int b10 = e.b(this.iterationPrograms, d.c(this.deployment, c.a(this.modified, Integer.hashCode(this.programId) * 31, 31), 31), 31);
        Specifics specifics = this.specifics;
        if (specifics == null) {
            hashCode = 0;
        } else {
            hashCode = specifics.hashCode();
        }
        return b10 + hashCode;
    }

    public String toString() {
        int i11 = this.programId;
        long j5 = this.modified;
        String str = this.deployment;
        List<IterationProgram> list = this.iterationPrograms;
        Specifics specifics = this.specifics;
        return "EnrolledProgram(programId=" + i11 + ", modified=" + j5 + ", deployment=" + str + ", iterationPrograms=" + list + ", specifics=" + specifics + ")";
    }

    public /* synthetic */ EnrolledProgram(int i11, long j5, String str, List list, Specifics specifics, int i12, m mVar) {
        this(i11, j5, str, list, (i12 & 16) != 0 ? null : specifics);
    }
}
