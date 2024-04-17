package com.withings.programs.model.webservice.wellnesstasks;

import androidx.appcompat.app.h;
import androidx.glance.appwidget.protobuf.g;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: WsDates.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/withings/programs/model/webservice/wellnesstasks/WsDates;", "", "dayLabel", "", "dayIndex", "", "listPreviewTasks", "", "Lcom/withings/programs/model/webservice/wellnesstasks/WsPreviewTask;", "(Ljava/lang/String;ILjava/util/List;)V", "getDayIndex", "()I", "getDayLabel", "()Ljava/lang/String;", "getListPreviewTasks", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WsDates {
    @SerializedName("day_index")
    private final int dayIndex;
    @SerializedName(Constants.ScionAnalytics.PARAM_LABEL)
    private final String dayLabel;
    @SerializedName("tasks")
    private final List<WsPreviewTask> listPreviewTasks;

    public WsDates(String dayLabel, int i11, List<WsPreviewTask> listPreviewTasks) {
        u.j(dayLabel, "dayLabel");
        u.j(listPreviewTasks, "listPreviewTasks");
        this.dayLabel = dayLabel;
        this.dayIndex = i11;
        this.listPreviewTasks = listPreviewTasks;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WsDates copy$default(WsDates wsDates, String str, int i11, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = wsDates.dayLabel;
        }
        if ((i12 & 2) != 0) {
            i11 = wsDates.dayIndex;
        }
        if ((i12 & 4) != 0) {
            list = wsDates.listPreviewTasks;
        }
        return wsDates.copy(str, i11, list);
    }

    public final String component1() {
        return this.dayLabel;
    }

    public final int component2() {
        return this.dayIndex;
    }

    public final List<WsPreviewTask> component3() {
        return this.listPreviewTasks;
    }

    public final WsDates copy(String dayLabel, int i11, List<WsPreviewTask> listPreviewTasks) {
        u.j(dayLabel, "dayLabel");
        u.j(listPreviewTasks, "listPreviewTasks");
        return new WsDates(dayLabel, i11, listPreviewTasks);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WsDates)) {
            return false;
        }
        WsDates wsDates = (WsDates) obj;
        if (u.e(this.dayLabel, wsDates.dayLabel) && this.dayIndex == wsDates.dayIndex && u.e(this.listPreviewTasks, wsDates.listPreviewTasks)) {
            return true;
        }
        return false;
    }

    public final int getDayIndex() {
        return this.dayIndex;
    }

    public final String getDayLabel() {
        return this.dayLabel;
    }

    public final List<WsPreviewTask> getListPreviewTasks() {
        return this.listPreviewTasks;
    }

    public int hashCode() {
        return this.listPreviewTasks.hashCode() + h.a(this.dayIndex, this.dayLabel.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.dayLabel;
        int i11 = this.dayIndex;
        return d.i(g.b("WsDates(dayLabel=", str, ", dayIndex=", i11, ", listPreviewTasks="), this.listPreviewTasks, ")");
    }
}
