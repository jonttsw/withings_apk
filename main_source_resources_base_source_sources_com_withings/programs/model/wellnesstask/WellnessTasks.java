package com.withings.programs.model.wellnesstask;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.u;
/* compiled from: WellnessTasks.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/withings/programs/model/wellnesstask/WellnessTasks;", "", "tasks", "Lcom/withings/programs/model/wellnesstask/Tasks;", "(Lcom/withings/programs/model/wellnesstask/Tasks;)V", "getTasks", "()Lcom/withings/programs/model/wellnesstask/Tasks;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WellnessTasks {
    @SerializedName("tasks")
    private final Tasks tasks;

    public WellnessTasks(Tasks tasks) {
        u.j(tasks, "tasks");
        this.tasks = tasks;
    }

    public static /* synthetic */ WellnessTasks copy$default(WellnessTasks wellnessTasks, Tasks tasks, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            tasks = wellnessTasks.tasks;
        }
        return wellnessTasks.copy(tasks);
    }

    public final Tasks component1() {
        return this.tasks;
    }

    public final WellnessTasks copy(Tasks tasks) {
        u.j(tasks, "tasks");
        return new WellnessTasks(tasks);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof WellnessTasks) && u.e(this.tasks, ((WellnessTasks) obj).tasks)) {
            return true;
        }
        return false;
    }

    public final Tasks getTasks() {
        return this.tasks;
    }

    public int hashCode() {
        return this.tasks.hashCode();
    }

    public String toString() {
        Tasks tasks = this.tasks;
        return "WellnessTasks(tasks=" + tasks + ")";
    }
}
