package com.withings.programs.model.enrolledprogram;

import androidx.appcompat.app.h;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: IterationProgram.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/withings/programs/model/enrolledprogram/IterationProgram;", "", "iteration", "", NavigationArguments.INSTANCE_ID, "", "progression", "Lcom/withings/programs/model/enrolledprogram/Progression;", "(JILcom/withings/programs/model/enrolledprogram/Progression;)V", "getInstanceId", "()I", "getIteration", "()J", "getProgression", "()Lcom/withings/programs/model/enrolledprogram/Progression;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IterationProgram {
    private final int instanceId;
    private final long iteration;
    private final Progression progression;

    public IterationProgram(long j5, int i11, Progression progression) {
        u.j(progression, "progression");
        this.iteration = j5;
        this.instanceId = i11;
        this.progression = progression;
    }

    public static /* synthetic */ IterationProgram copy$default(IterationProgram iterationProgram, long j5, int i11, Progression progression, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j5 = iterationProgram.iteration;
        }
        if ((i12 & 2) != 0) {
            i11 = iterationProgram.instanceId;
        }
        if ((i12 & 4) != 0) {
            progression = iterationProgram.progression;
        }
        return iterationProgram.copy(j5, i11, progression);
    }

    public final long component1() {
        return this.iteration;
    }

    public final int component2() {
        return this.instanceId;
    }

    public final Progression component3() {
        return this.progression;
    }

    public final IterationProgram copy(long j5, int i11, Progression progression) {
        u.j(progression, "progression");
        return new IterationProgram(j5, i11, progression);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IterationProgram)) {
            return false;
        }
        IterationProgram iterationProgram = (IterationProgram) obj;
        if (this.iteration == iterationProgram.iteration && this.instanceId == iterationProgram.instanceId && u.e(this.progression, iterationProgram.progression)) {
            return true;
        }
        return false;
    }

    public final int getInstanceId() {
        return this.instanceId;
    }

    public final long getIteration() {
        return this.iteration;
    }

    public final Progression getProgression() {
        return this.progression;
    }

    public int hashCode() {
        return this.progression.hashCode() + h.a(this.instanceId, Long.hashCode(this.iteration) * 31, 31);
    }

    public String toString() {
        long j5 = this.iteration;
        int i11 = this.instanceId;
        Progression progression = this.progression;
        return "IterationProgram(iteration=" + j5 + ", instanceId=" + i11 + ", progression=" + progression + ")";
    }
}
