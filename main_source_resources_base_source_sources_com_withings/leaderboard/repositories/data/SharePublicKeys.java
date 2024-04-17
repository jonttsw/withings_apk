package com.withings.leaderboard.repositories.data;

import bn.d;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: SharePublicKey.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/withings/leaderboard/repositories/data/SharePublicKeys;", "", "list", "", "Lcom/withings/leaderboard/repositories/data/SharePublicKey;", "(Ljava/util/List;)V", "getList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "leaderboard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SharePublicKeys {
    public static final int $stable = 8;
    @SerializedName("publickeys")
    private final List<SharePublicKey> list;

    public SharePublicKeys(List<SharePublicKey> list) {
        u.j(list, "list");
        this.list = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SharePublicKeys copy$default(SharePublicKeys sharePublicKeys, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = sharePublicKeys.list;
        }
        return sharePublicKeys.copy(list);
    }

    public final List<SharePublicKey> component1() {
        return this.list;
    }

    public final SharePublicKeys copy(List<SharePublicKey> list) {
        u.j(list, "list");
        return new SharePublicKeys(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof SharePublicKeys) && u.e(this.list, ((SharePublicKeys) obj).list)) {
            return true;
        }
        return false;
    }

    public final List<SharePublicKey> getList() {
        return this.list;
    }

    public int hashCode() {
        return this.list.hashCode();
    }

    public String toString() {
        return d.b("SharePublicKeys(list=", this.list, ")");
    }
}
