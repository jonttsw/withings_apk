package com.withings.leaderboard.repositories.data;

import androidx.compose.material3.d;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: SharePublicKey.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006!"}, d2 = {"Lcom/withings/leaderboard/repositories/data/SharePublicKey;", "", "id", "", "shorturl", "", "hash", "object", "ownerType", "ownerId", "", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getHash", "()Ljava/lang/String;", "getId", "()I", "getObject", "getOwnerId", "()J", "getOwnerType", "getShorturl", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "leaderboard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SharePublicKey {
    public static final int $stable = 0;
    private final String hash;
    @SerializedName("publickeyid")

    /* renamed from: id  reason: collision with root package name */
    private final int f40610id;
    private final String object;
    @SerializedName("ownerid")
    private final long ownerId;
    @SerializedName("ownertype")
    private final String ownerType;
    private final String shorturl;

    public SharePublicKey(int i11, String shorturl, String hash, String object, String ownerType, long j5) {
        u.j(shorturl, "shorturl");
        u.j(hash, "hash");
        u.j(object, "object");
        u.j(ownerType, "ownerType");
        this.f40610id = i11;
        this.shorturl = shorturl;
        this.hash = hash;
        this.object = object;
        this.ownerType = ownerType;
        this.ownerId = j5;
    }

    public static /* synthetic */ SharePublicKey copy$default(SharePublicKey sharePublicKey, int i11, String str, String str2, String str3, String str4, long j5, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = sharePublicKey.f40610id;
        }
        if ((i12 & 2) != 0) {
            str = sharePublicKey.shorturl;
        }
        String str5 = str;
        if ((i12 & 4) != 0) {
            str2 = sharePublicKey.hash;
        }
        String str6 = str2;
        if ((i12 & 8) != 0) {
            str3 = sharePublicKey.object;
        }
        String str7 = str3;
        if ((i12 & 16) != 0) {
            str4 = sharePublicKey.ownerType;
        }
        String str8 = str4;
        if ((i12 & 32) != 0) {
            j5 = sharePublicKey.ownerId;
        }
        return sharePublicKey.copy(i11, str5, str6, str7, str8, j5);
    }

    public final int component1() {
        return this.f40610id;
    }

    public final String component2() {
        return this.shorturl;
    }

    public final String component3() {
        return this.hash;
    }

    public final String component4() {
        return this.object;
    }

    public final String component5() {
        return this.ownerType;
    }

    public final long component6() {
        return this.ownerId;
    }

    public final SharePublicKey copy(int i11, String shorturl, String hash, String object, String ownerType, long j5) {
        u.j(shorturl, "shorturl");
        u.j(hash, "hash");
        u.j(object, "object");
        u.j(ownerType, "ownerType");
        return new SharePublicKey(i11, shorturl, hash, object, ownerType, j5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharePublicKey)) {
            return false;
        }
        SharePublicKey sharePublicKey = (SharePublicKey) obj;
        if (this.f40610id == sharePublicKey.f40610id && u.e(this.shorturl, sharePublicKey.shorturl) && u.e(this.hash, sharePublicKey.hash) && u.e(this.object, sharePublicKey.object) && u.e(this.ownerType, sharePublicKey.ownerType) && this.ownerId == sharePublicKey.ownerId) {
            return true;
        }
        return false;
    }

    public final String getHash() {
        return this.hash;
    }

    public final int getId() {
        return this.f40610id;
    }

    public final String getObject() {
        return this.object;
    }

    public final long getOwnerId() {
        return this.ownerId;
    }

    public final String getOwnerType() {
        return this.ownerType;
    }

    public final String getShorturl() {
        return this.shorturl;
    }

    public int hashCode() {
        return Long.hashCode(this.ownerId) + d.c(this.ownerType, d.c(this.object, d.c(this.hash, d.c(this.shorturl, Integer.hashCode(this.f40610id) * 31, 31), 31), 31), 31);
    }

    public String toString() {
        int i11 = this.f40610id;
        String str = this.shorturl;
        String str2 = this.hash;
        String str3 = this.object;
        String str4 = this.ownerType;
        long j5 = this.ownerId;
        StringBuilder a11 = d.a("SharePublicKey(id=", i11, ", shorturl=", str, ", hash=");
        b.d(a11, str2, ", object=", str3, ", ownerType=");
        a11.append(str4);
        a11.append(", ownerId=");
        a11.append(j5);
        a11.append(")");
        return a11.toString();
    }
}
