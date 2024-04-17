package com.withings.programs.model.webservice.wellnesstasks;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: WsWellnessTasks.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/withings/programs/model/webservice/wellnesstasks/WsWellnessTasks;", "", "tasks", "Lcom/withings/programs/model/webservice/wellnesstasks/WsTasks;", "(Lcom/withings/programs/model/webservice/wellnesstasks/WsTasks;)V", "getTasks", "()Lcom/withings/programs/model/webservice/wellnesstasks/WsTasks;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WsWellnessTasks {
    @SerializedName("tasks")
    private final WsTasks tasks;

    public WsWellnessTasks(WsTasks tasks) {
        u.j(tasks, "tasks");
        this.tasks = tasks;
    }

    public static /* synthetic */ WsWellnessTasks copy$default(WsWellnessTasks wsWellnessTasks, WsTasks wsTasks, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            wsTasks = wsWellnessTasks.tasks;
        }
        return wsWellnessTasks.copy(wsTasks);
    }

    public final WsTasks component1() {
        return this.tasks;
    }

    public final WsWellnessTasks copy(WsTasks tasks) {
        u.j(tasks, "tasks");
        return new WsWellnessTasks(tasks);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof WsWellnessTasks) && u.e(this.tasks, ((WsWellnessTasks) obj).tasks)) {
            return true;
        }
        return false;
    }

    public final WsTasks getTasks() {
        return this.tasks;
    }

    public int hashCode() {
        return this.tasks.hashCode();
    }

    public String toString() {
        WsTasks wsTasks = this.tasks;
        return "WsWellnessTasks(tasks=" + wsTasks + ")";
    }
}
