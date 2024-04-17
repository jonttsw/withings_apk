package com.withings.programs.model.wellnesstask;

import androidx.appcompat.app.h;
import androidx.glance.appwidget.protobuf.g;
import com.withings.vasistas.ws.WsVasistasSerie;
import java.util.List;
import kotlin.jvm.internal.u;
/* compiled from: Task.kt */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/withings/programs/model/wellnesstask/Task;", "", "weekLabel", "", "weekIndex", "", WsVasistasSerie.KEY_DATES, "", "Lcom/withings/programs/model/wellnesstask/Dates;", "(Ljava/lang/String;ILjava/util/List;)V", "getDates", "()Ljava/util/List;", "getWeekIndex", "()I", "getWeekLabel", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Task {
    private final List<Dates> dates;
    private final int weekIndex;
    private final String weekLabel;

    public Task(String weekLabel, int i11, List<Dates> dates) {
        u.j(weekLabel, "weekLabel");
        u.j(dates, "dates");
        this.weekLabel = weekLabel;
        this.weekIndex = i11;
        this.dates = dates;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Task copy$default(Task task, String str, int i11, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = task.weekLabel;
        }
        if ((i12 & 2) != 0) {
            i11 = task.weekIndex;
        }
        if ((i12 & 4) != 0) {
            list = task.dates;
        }
        return task.copy(str, i11, list);
    }

    public final String component1() {
        return this.weekLabel;
    }

    public final int component2() {
        return this.weekIndex;
    }

    public final List<Dates> component3() {
        return this.dates;
    }

    public final Task copy(String weekLabel, int i11, List<Dates> dates) {
        u.j(weekLabel, "weekLabel");
        u.j(dates, "dates");
        return new Task(weekLabel, i11, dates);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Task)) {
            return false;
        }
        Task task = (Task) obj;
        if (u.e(this.weekLabel, task.weekLabel) && this.weekIndex == task.weekIndex && u.e(this.dates, task.dates)) {
            return true;
        }
        return false;
    }

    public final List<Dates> getDates() {
        return this.dates;
    }

    public final int getWeekIndex() {
        return this.weekIndex;
    }

    public final String getWeekLabel() {
        return this.weekLabel;
    }

    public int hashCode() {
        return this.dates.hashCode() + h.a(this.weekIndex, this.weekLabel.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.weekLabel;
        int i11 = this.weekIndex;
        return d.i(g.b("Task(weekLabel=", str, ", weekIndex=", i11, ", dates="), this.dates, ")");
    }
}
