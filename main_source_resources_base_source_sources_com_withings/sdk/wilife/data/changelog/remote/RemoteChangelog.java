package com.withings.sdk.wilife.data.changelog.remote;

import androidx.fragment.app.o;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: RemoteChangelog.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/withings/sdk/wilife/data/changelog/remote/RemoteChangelog;", "", "changelog", "", "(Ljava/lang/String;)V", "getChangelog", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "wilife-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RemoteChangelog {
    @SerializedName("changelog")
    private final String changelog;

    public RemoteChangelog(String changelog) {
        u.j(changelog, "changelog");
        this.changelog = changelog;
    }

    public static /* synthetic */ RemoteChangelog copy$default(RemoteChangelog remoteChangelog, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = remoteChangelog.changelog;
        }
        return remoteChangelog.copy(str);
    }

    public final String component1() {
        return this.changelog;
    }

    public final RemoteChangelog copy(String changelog) {
        u.j(changelog, "changelog");
        return new RemoteChangelog(changelog);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof RemoteChangelog) && u.e(this.changelog, ((RemoteChangelog) obj).changelog)) {
            return true;
        }
        return false;
    }

    public final String getChangelog() {
        return this.changelog;
    }

    public int hashCode() {
        return this.changelog.hashCode();
    }

    public String toString() {
        return o.d("RemoteChangelog(changelog=", this.changelog, ")");
    }
}
