package com.withings.programs.model.webservice.wellnesstasks;

import android.support.v4.media.session.c;
import androidx.appcompat.app.h;
import androidx.glance.appwidget.protobuf.g;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: WsProgressionTask.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\t\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/withings/programs/model/webservice/wellnesstasks/WsProgressionTask;", "", "taskIdentifier", "", "status", "", "completionDateInSeconds", "", "(Ljava/lang/String;IJ)V", "completionDateInMillis", "getCompletionDateInMillis", "()J", "getCompletionDateInSeconds$annotations", "()V", "getCompletionDateInSeconds", "getStatus", "()I", "getTaskIdentifier", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WsProgressionTask {
    @SerializedName("completion_date")
    private final long completionDateInSeconds;
    @SerializedName("status")
    private final int status;
    @SerializedName("task_identifier")
    private final String taskIdentifier;

    public WsProgressionTask(String taskIdentifier, int i11, long j5) {
        u.j(taskIdentifier, "taskIdentifier");
        this.taskIdentifier = taskIdentifier;
        this.status = i11;
        this.completionDateInSeconds = j5;
    }

    public static /* synthetic */ WsProgressionTask copy$default(WsProgressionTask wsProgressionTask, String str, int i11, long j5, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = wsProgressionTask.taskIdentifier;
        }
        if ((i12 & 2) != 0) {
            i11 = wsProgressionTask.status;
        }
        if ((i12 & 4) != 0) {
            j5 = wsProgressionTask.completionDateInSeconds;
        }
        return wsProgressionTask.copy(str, i11, j5);
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

    public final WsProgressionTask copy(String taskIdentifier, int i11, long j5) {
        u.j(taskIdentifier, "taskIdentifier");
        return new WsProgressionTask(taskIdentifier, i11, j5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WsProgressionTask)) {
            return false;
        }
        WsProgressionTask wsProgressionTask = (WsProgressionTask) obj;
        if (u.e(this.taskIdentifier, wsProgressionTask.taskIdentifier) && this.status == wsProgressionTask.status && this.completionDateInSeconds == wsProgressionTask.completionDateInSeconds) {
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
        return c.c(g.b("WsProgressionTask(taskIdentifier=", str, ", status=", i11, ", completionDateInSeconds="), this.completionDateInSeconds, ")");
    }

    public static /* synthetic */ void getCompletionDateInSeconds$annotations() {
    }
}
