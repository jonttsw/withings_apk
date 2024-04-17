package com.withings.favorite.model.room.entity;

import androidx.activity.result.c;
import androidx.camera.camera2.internal.h2;
import androidx.camera.core.y1;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: FavoriteEntity.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/withings/favorite/model/room/entity/FavoriteEntity;", "", NavigationArguments.REMOTE_TASK_ID, "", "isSync", "", "isSelected", "updatedDate", "", "type", "(Ljava/lang/String;ZZJLjava/lang/String;)V", "()Z", "getRemoteTaskId", "()Ljava/lang/String;", "getType", "getUpdatedDate", "()J", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FavoriteEntity {
    private final boolean isSelected;
    private final boolean isSync;
    private final String remoteTaskId;
    private final String type;
    private final long updatedDate;

    public FavoriteEntity(String remoteTaskId, boolean z5, boolean z11, long j5, String type) {
        u.j(remoteTaskId, "remoteTaskId");
        u.j(type, "type");
        this.remoteTaskId = remoteTaskId;
        this.isSync = z5;
        this.isSelected = z11;
        this.updatedDate = j5;
        this.type = type;
    }

    public static /* synthetic */ FavoriteEntity copy$default(FavoriteEntity favoriteEntity, String str, boolean z5, boolean z11, long j5, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = favoriteEntity.remoteTaskId;
        }
        if ((i11 & 2) != 0) {
            z5 = favoriteEntity.isSync;
        }
        boolean z12 = z5;
        if ((i11 & 4) != 0) {
            z11 = favoriteEntity.isSelected;
        }
        boolean z13 = z11;
        if ((i11 & 8) != 0) {
            j5 = favoriteEntity.updatedDate;
        }
        long j11 = j5;
        if ((i11 & 16) != 0) {
            str2 = favoriteEntity.type;
        }
        return favoriteEntity.copy(str, z12, z13, j11, str2);
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
        return this.updatedDate;
    }

    public final String component5() {
        return this.type;
    }

    public final FavoriteEntity copy(String remoteTaskId, boolean z5, boolean z11, long j5, String type) {
        u.j(remoteTaskId, "remoteTaskId");
        u.j(type, "type");
        return new FavoriteEntity(remoteTaskId, z5, z11, j5, type);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FavoriteEntity)) {
            return false;
        }
        FavoriteEntity favoriteEntity = (FavoriteEntity) obj;
        if (u.e(this.remoteTaskId, favoriteEntity.remoteTaskId) && this.isSync == favoriteEntity.isSync && this.isSelected == favoriteEntity.isSelected && this.updatedDate == favoriteEntity.updatedDate && u.e(this.type, favoriteEntity.type)) {
            return true;
        }
        return false;
    }

    public final String getRemoteTaskId() {
        return this.remoteTaskId;
    }

    public final String getType() {
        return this.type;
    }

    public final long getUpdatedDate() {
        return this.updatedDate;
    }

    public int hashCode() {
        return this.type.hashCode() + c.a(this.updatedDate, y1.a(this.isSelected, y1.a(this.isSync, this.remoteTaskId.hashCode() * 31, 31), 31), 31);
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
        long j5 = this.updatedDate;
        String str2 = this.type;
        StringBuilder sb2 = new StringBuilder("FavoriteEntity(remoteTaskId=");
        sb2.append(str);
        sb2.append(", isSync=");
        sb2.append(z5);
        sb2.append(", isSelected=");
        sb2.append(z11);
        sb2.append(", updatedDate=");
        sb2.append(j5);
        return h2.c(sb2, ", type=", str2, ")");
    }
}
