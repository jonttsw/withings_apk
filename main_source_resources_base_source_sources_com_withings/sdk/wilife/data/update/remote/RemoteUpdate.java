package com.withings.sdk.wilife.data.update.remote;

import androidx.appcompat.app.h;
import androidx.compose.material3.d;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: RemoteUpdate.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0007HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/withings/sdk/wilife/data/update/remote/RemoteUpdate;", "", "build", "", "version", "", "isRequired", "", "(ILjava/lang/String;Z)V", "getBuild", "()I", "()Z", "getVersion", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "wilife-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RemoteUpdate {
    private final int build;
    @SerializedName("is_required")
    private final boolean isRequired;
    private final String version;

    public RemoteUpdate(int i11, String version, boolean z5) {
        u.j(version, "version");
        this.build = i11;
        this.version = version;
        this.isRequired = z5;
    }

    public static /* synthetic */ RemoteUpdate copy$default(RemoteUpdate remoteUpdate, int i11, String str, boolean z5, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = remoteUpdate.build;
        }
        if ((i12 & 2) != 0) {
            str = remoteUpdate.version;
        }
        if ((i12 & 4) != 0) {
            z5 = remoteUpdate.isRequired;
        }
        return remoteUpdate.copy(i11, str, z5);
    }

    public final int component1() {
        return this.build;
    }

    public final String component2() {
        return this.version;
    }

    public final boolean component3() {
        return this.isRequired;
    }

    public final RemoteUpdate copy(int i11, String version, boolean z5) {
        u.j(version, "version");
        return new RemoteUpdate(i11, version, z5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemoteUpdate)) {
            return false;
        }
        RemoteUpdate remoteUpdate = (RemoteUpdate) obj;
        if (this.build == remoteUpdate.build && u.e(this.version, remoteUpdate.version) && this.isRequired == remoteUpdate.isRequired) {
            return true;
        }
        return false;
    }

    public final int getBuild() {
        return this.build;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isRequired) + d.c(this.version, Integer.hashCode(this.build) * 31, 31);
    }

    public final boolean isRequired() {
        return this.isRequired;
    }

    public String toString() {
        int i11 = this.build;
        String str = this.version;
        return h.d(d.a("RemoteUpdate(build=", i11, ", version=", str, ", isRequired="), this.isRequired, ")");
    }
}
