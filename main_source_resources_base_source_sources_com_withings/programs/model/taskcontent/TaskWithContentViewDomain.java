package com.withings.programs.model.taskcontent;

import androidx.camera.core.y1;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: TaskWithContentViewDomain.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ:\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000fR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/withings/programs/model/taskcontent/TaskWithContentViewDomain;", "", "completionDateInMillis", "", "content", "", NavigationArguments.IS_COMPLETED, "", "programLastUpdate", "(Ljava/lang/Long;Ljava/lang/String;ZLjava/lang/Long;)V", "getCompletionDateInMillis", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getContent", "()Ljava/lang/String;", "()Z", "getProgramLastUpdate", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Long;Ljava/lang/String;ZLjava/lang/Long;)Lcom/withings/programs/model/taskcontent/TaskWithContentViewDomain;", "equals", "other", "hashCode", "", "toString", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TaskWithContentViewDomain {
    private final Long completionDateInMillis;
    private final String content;
    private final boolean isCompleted;
    private final Long programLastUpdate;

    public TaskWithContentViewDomain(Long l5, String content, boolean z5, Long l6) {
        u.j(content, "content");
        this.completionDateInMillis = l5;
        this.content = content;
        this.isCompleted = z5;
        this.programLastUpdate = l6;
    }

    public static /* synthetic */ TaskWithContentViewDomain copy$default(TaskWithContentViewDomain taskWithContentViewDomain, Long l5, String str, boolean z5, Long l6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l5 = taskWithContentViewDomain.completionDateInMillis;
        }
        if ((i11 & 2) != 0) {
            str = taskWithContentViewDomain.content;
        }
        if ((i11 & 4) != 0) {
            z5 = taskWithContentViewDomain.isCompleted;
        }
        if ((i11 & 8) != 0) {
            l6 = taskWithContentViewDomain.programLastUpdate;
        }
        return taskWithContentViewDomain.copy(l5, str, z5, l6);
    }

    public final Long component1() {
        return this.completionDateInMillis;
    }

    public final String component2() {
        return this.content;
    }

    public final boolean component3() {
        return this.isCompleted;
    }

    public final Long component4() {
        return this.programLastUpdate;
    }

    public final TaskWithContentViewDomain copy(Long l5, String content, boolean z5, Long l6) {
        u.j(content, "content");
        return new TaskWithContentViewDomain(l5, content, z5, l6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaskWithContentViewDomain)) {
            return false;
        }
        TaskWithContentViewDomain taskWithContentViewDomain = (TaskWithContentViewDomain) obj;
        if (u.e(this.completionDateInMillis, taskWithContentViewDomain.completionDateInMillis) && u.e(this.content, taskWithContentViewDomain.content) && this.isCompleted == taskWithContentViewDomain.isCompleted && u.e(this.programLastUpdate, taskWithContentViewDomain.programLastUpdate)) {
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
        Long l5 = this.completionDateInMillis;
        int i11 = 0;
        if (l5 == null) {
            hashCode = 0;
        } else {
            hashCode = l5.hashCode();
        }
        int a11 = y1.a(this.isCompleted, d.c(this.content, hashCode * 31, 31), 31);
        Long l6 = this.programLastUpdate;
        if (l6 != null) {
            i11 = l6.hashCode();
        }
        return a11 + i11;
    }

    public final boolean isCompleted() {
        return this.isCompleted;
    }

    public String toString() {
        Long l5 = this.completionDateInMillis;
        String str = this.content;
        boolean z5 = this.isCompleted;
        Long l6 = this.programLastUpdate;
        return "TaskWithContentViewDomain(completionDateInMillis=" + l5 + ", content=" + str + ", isCompleted=" + z5 + ", programLastUpdate=" + l6 + ")";
    }
}
