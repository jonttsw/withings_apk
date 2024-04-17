package com.withings.favorite.model;

import androidx.camera.core.y1;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: Favorite.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/withings/favorite/model/Favorite;", "", NavigationArguments.REMOTE_TASK_ID, "", "isSync", "", "isSelected", "updateDate", "", "(Ljava/lang/String;ZZJ)V", "()Z", "getRemoteTaskId", "()Ljava/lang/String;", "getUpdateDate", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Favorite {
    private final boolean isSelected;
    private final boolean isSync;
    private final String remoteTaskId;
    private final long updateDate;

    public Favorite(String remoteTaskId, boolean z5, boolean z11, long j5) {
        u.j(remoteTaskId, "remoteTaskId");
        this.remoteTaskId = remoteTaskId;
        this.isSync = z5;
        this.isSelected = z11;
        this.updateDate = j5;
    }

    public static /* synthetic */ Favorite copy$default(Favorite favorite, String str, boolean z5, boolean z11, long j5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = favorite.remoteTaskId;
        }
        if ((i11 & 2) != 0) {
            z5 = favorite.isSync;
        }
        boolean z12 = z5;
        if ((i11 & 4) != 0) {
            z11 = favorite.isSelected;
        }
        boolean z13 = z11;
        if ((i11 & 8) != 0) {
            j5 = favorite.updateDate;
        }
        return favorite.copy(str, z12, z13, j5);
    }

    public final String component1() {
        return this.remoteTaskId;
    }

    public final boolean component2() {
        return this.isSync;
    }

    public final boolean component3() {
        return this.isSelected;
    }

    public final long component4() {
        return this.updateDate;
    }

    public final Favorite copy(String remoteTaskId, boolean z5, boolean z11, long j5) {
        u.j(remoteTaskId, "remoteTaskId");
        return new Favorite(remoteTaskId, z5, z11, j5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Favorite)) {
            return false;
        }
        Favorite favorite = (Favorite) obj;
        if (u.e(this.remoteTaskId, favorite.remoteTaskId) && this.isSync == favorite.isSync && this.isSelected == favorite.isSelected && this.updateDate == favorite.updateDate) {
            return true;
        }
        return false;
    }

    public final String getRemoteTaskId() {
        return this.remoteTaskId;
    }

    public final long getUpdateDate() {
        return this.updateDate;
    }

    public int hashCode() {
        return Long.hashCode(this.updateDate) + y1.a(this.isSelected, y1.a(this.isSync, this.remoteTaskId.hashCode() * 31, 31), 31);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final boolean isSync() {
        return this.isSync;
    }

    public String toString() {
        String str = this.remoteTaskId;
        boolean z5 = this.isSync;
        boolean z11 = this.isSelected;
        long j5 = this.updateDate;
        return "Favorite(remoteTaskId=" + str + ", isSync=" + z5 + ", isSelected=" + z11 + ", updateDate=" + j5 + ")";
    }
}
