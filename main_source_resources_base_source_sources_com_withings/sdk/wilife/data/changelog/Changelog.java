package com.withings.sdk.wilife.data.changelog;

import androidx.annotation.Keep;
import androidx.fragment.app.o;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: Changelog.kt */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/withings/sdk/wilife/data/changelog/Changelog;", "", "changelog", "", "(Ljava/lang/String;)V", "getChangelog", "()Ljava/lang/String;", "setChangelog", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "wilife-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Changelog {
    private String changelog;

    public Changelog(String changelog) {
        u.j(changelog, "changelog");
        this.changelog = changelog;
    }

    public static /* synthetic */ Changelog copy$default(Changelog changelog, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = changelog.changelog;
        }
        return changelog.copy(str);
    }

    public final String component1() {
        return this.changelog;
    }

    public final Changelog copy(String changelog) {
        u.j(changelog, "changelog");
        return new Changelog(changelog);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Changelog) && u.e(this.changelog, ((Changelog) obj).changelog)) {
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

    public final void setChangelog(String str) {
        u.j(str, "<set-?>");
        this.changelog = str;
    }

    public String toString() {
        return o.d("Changelog(changelog=", this.changelog, ")");
    }
}
