package com.withings.programs.model.wellnesstask;

import android.support.v4.media.session.c;
import androidx.appcompat.app.h;
import androidx.glance.appwidget.protobuf.g;
import kotlin.jvm.internal.u;
/* compiled from: ProgressionTask.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/withings/programs/model/wellnesstask/ProgressionTask;", "", "taskIdentifier", "", "status", "", "completionDateInSeconds", "", "(Ljava/lang/String;IJ)V", "completionDateInMillis", "getCompletionDateInMillis", "()J", "getCompletionDateInSeconds", "getStatus", "()I", "getTaskIdentifier", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProgressionTask {
    private final long completionDateInSeconds;
    private final int status;
    private final String taskIdentifier;

    public ProgressionTask(String taskIdentifier, int i11, long j5) {
        u.j(taskIdentifier, "taskIdentifier");
        this.taskIdentifier = taskIdentifier;
        this.status = i11;
        this.completionDateInSeconds = j5;
    }

    public static /* synthetic */ ProgressionTask copy$default(ProgressionTask progressionTask, String str, int i11, long j5, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = progressionTask.taskIdentifier;
        }
        if ((i12 & 2) != 0) {
            i11 = progressionTask.status;
        }
        if ((i12 & 4) != 0) {
            j5 = progressionTask.completionDateInSeconds;
        }
        return progressionTask.copy(str, i11, j5);
    }

    public final String component1() {
        return this.taskIdentifier;
    }

    public final int component2() {
        return this.status;
    }

    public final long component3() {
        return this.completionDateInSeconds;
    }

    public final ProgressionTask copy(String taskIdentifier, int i11, long j5) {
        u.j(taskIdentifier, "taskIdentifier");
        return new ProgressionTask(taskIdentifier, i11, j5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgressionTask)) {
            return false;
        }
        ProgressionTask progressionTask = (ProgressionTask) obj;
        if (u.e(this.taskIdentifier, progressionTask.taskIdentifier) && this.status == progressionTask.status && this.completionDateInSeconds == progressionTask.completionDateInSeconds) {
            return true;
        }
        return false;
    }

    public final long getCompletionDateInMillis() {
        return this.completionDateInSeconds * 1000;
    }

    public final long getCompletionDateInSeconds() {
        return this.completionDateInSeconds;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getTaskIdentifier() {
        return this.taskIdentifier;
    }

    public int hashCode() {
        return Long.hashCode(this.completionDateInSeconds) + h.a(this.status, this.taskIdentifier.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.taskIdentifier;
        int i11 = this.status;
        return c.c(g.b("ProgressionTask(taskIdentifier=", str, ", status=", i11, ", completionDateInSeconds="), this.completionDateInSeconds, ")");
    }
}
