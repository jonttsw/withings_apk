package com.withings.programs.model.room.wifittask;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: TaskWithContentView.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\tJ0\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\r\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/withings/programs/model/room/wifittask/TaskWithContentView;", "", "content", "", "completionDateInMillis", "", "programLastUpdate", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "getCompletionDateInMillis", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getContent", "()Ljava/lang/String;", "getProgramLastUpdate", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)Lcom/withings/programs/model/room/wifittask/TaskWithContentView;", "equals", "", "other", "hashCode", "", "toString", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TaskWithContentView {
    private final Long completionDateInMillis;
    private final String content;
    private final Long programLastUpdate;

    public TaskWithContentView(String content, Long l5, Long l6) {
        u.j(content, "content");
        this.content = content;
        this.completionDateInMillis = l5;
        this.programLastUpdate = l6;
    }

    public static /* synthetic */ TaskWithContentView copy$default(TaskWithContentView taskWithContentView, String str, Long l5, Long l6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = taskWithContentView.content;
        }
        if ((i11 & 2) != 0) {
            l5 = taskWithContentView.completionDateInMillis;
        }
        if ((i11 & 4) != 0) {
            l6 = taskWithContentView.programLastUpdate;
        }
        return taskWithContentView.copy(str, l5, l6);
    }

    public final String component1() {
        return this.content;
    }

    public final Long component2() {
        return this.completionDateInMillis;
    }

    public final Long component3() {
        return this.programLastUpdate;
    }

    public final TaskWithContentView copy(String content, Long l5, Long l6) {
        u.j(content, "content");
        return new TaskWithContentView(content, l5, l6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaskWithContentView)) {
            return false;
        }
        TaskWithContentView taskWithContentView = (TaskWithContentView) obj;
        if (u.e(this.content, taskWithContentView.content) && u.e(this.completionDateInMillis, taskWithContentView.completionDateInMillis) && u.e(this.programLastUpdate, taskWithContentView.programLastUpdate)) {
            return true;
        }
        return false;
    }

    public final Long getCompletionDateInMillis() {
        return this.completionDateInMillis;
    }

    public final String getContent() {
        return this.content;
    }

    public final Long getProgramLastUpdate() {
        return this.programLastUpdate;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.content.hashCode() * 31;
        Long l5 = this.completionDateInMillis;
        int i11 = 0;
        if (l5 == null) {
            hashCode = 0;
        } else {
            hashCode = l5.hashCode();
        }
        int i12 = (hashCode2 + hashCode) * 31;
        Long l6 = this.programLastUpdate;
        if (l6 != null) {
            i11 = l6.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        String str = this.content;
        Long l5 = this.completionDateInMillis;
        Long l6 = this.programLastUpdate;
        return "TaskWithContentView(content=" + str + ", completionDateInMillis=" + l5 + ", programLastUpdate=" + l6 + ")";
    }
}
