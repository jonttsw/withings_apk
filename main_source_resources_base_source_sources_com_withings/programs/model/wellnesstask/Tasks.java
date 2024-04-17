package com.withings.programs.model.wellnesstask;

import java.util.List;
import kotlin.jvm.internal.u;
/* compiled from: Tasks.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/withings/programs/model/wellnesstask/Tasks;", "", "progressionTasks", "", "Lcom/withings/programs/model/wellnesstask/ProgressionTask;", "tasks", "Lcom/withings/programs/model/wellnesstask/Task;", "(Ljava/util/List;Ljava/util/List;)V", "getProgressionTasks", "()Ljava/util/List;", "getTasks", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Tasks {
    private final List<ProgressionTask> progressionTasks;
    private final List<Task> tasks;

    public Tasks(List<ProgressionTask> progressionTasks, List<Task> tasks) {
        u.j(progressionTasks, "progressionTasks");
        u.j(tasks, "tasks");
        this.progressionTasks = progressionTasks;
        this.tasks = tasks;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Tasks copy$default(Tasks tasks, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = tasks.progressionTasks;
        }
        if ((i11 & 2) != 0) {
            list2 = tasks.tasks;
        }
        return tasks.copy(list, list2);
    }

    public final List<ProgressionTask> component1() {
        return this.progressionTasks;
    }

    public final List<Task> component2() {
        return this.tasks;
    }

    public final Tasks copy(List<ProgressionTask> progressionTasks, List<Task> tasks) {
        u.j(progressionTasks, "progressionTasks");
        u.j(tasks, "tasks");
        return new Tasks(progressionTasks, tasks);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tasks)) {
            return false;
        }
        Tasks tasks = (Tasks) obj;
        if (u.e(this.progressionTasks, tasks.progressionTasks) && u.e(this.tasks, tasks.tasks)) {
            return true;
        }
        return false;
    }

    public final List<ProgressionTask> getProgressionTasks() {
        return this.progressionTasks;
    }

    public final List<Task> getTasks() {
        return this.tasks;
    }

    public int hashCode() {
        return this.tasks.hashCode() + (this.progressionTasks.hashCode() * 31);
    }

    public String toString() {
        List<ProgressionTask> list = this.progressionTasks;
        List<Task> list2 = this.tasks;
        return "Tasks(progressionTasks=" + list + ", tasks=" + list2 + ")";
    }
}
