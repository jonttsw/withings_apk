package com.withings.programs.model.webservice.wellnesstasks;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: WsTasks.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/withings/programs/model/webservice/wellnesstasks/WsTasks;", "", "progression", "", "Lcom/withings/programs/model/webservice/wellnesstasks/WsProgressionTask;", "data", "Lcom/withings/programs/model/webservice/wellnesstasks/WsTask;", "(Ljava/util/List;Ljava/util/List;)V", "getData", "()Ljava/util/List;", "getProgression", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WsTasks {
    @SerializedName("data")
    private final List<WsTask> data;
    @SerializedName("progression")
    private final List<WsProgressionTask> progression;

    public WsTasks(List<WsProgressionTask> progression, List<WsTask> data) {
        u.j(progression, "progression");
        u.j(data, "data");
        this.progression = progression;
        this.data = data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WsTasks copy$default(WsTasks wsTasks, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = wsTasks.progression;
        }
        if ((i11 & 2) != 0) {
            list2 = wsTasks.data;
        }
        return wsTasks.copy(list, list2);
    }

    public final List<WsProgressionTask> component1() {
        return this.progression;
    }

    public final List<WsTask> component2() {
        return this.data;
    }

    public final WsTasks copy(List<WsProgressionTask> progression, List<WsTask> data) {
        u.j(progression, "progression");
        u.j(data, "data");
        return new WsTasks(progression, data);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WsTasks)) {
            return false;
        }
        WsTasks wsTasks = (WsTasks) obj;
        if (u.e(this.progression, wsTasks.progression) && u.e(this.data, wsTasks.data)) {
            return true;
        }
        return false;
    }

    public final List<WsTask> getData() {
        return this.data;
    }

    public final List<WsProgressionTask> getProgression() {
        return this.progression;
    }

    public int hashCode() {
        return this.data.hashCode() + (this.progression.hashCode() * 31);
    }

    public String toString() {
        List<WsProgressionTask> list = this.progression;
        List<WsTask> list2 = this.data;
        return "WsTasks(progression=" + list + ", data=" + list2 + ")";
    }
}
