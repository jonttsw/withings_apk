package com.withings.screen.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: WsModels.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/withings/screen/model/WsDeviceScreensByUsers;", "", "userid", "", "wsDeviceScreens", "", "Lcom/withings/screen/model/WsDeviceScreen;", "(JLjava/util/List;)V", "getUserid", "()J", "getWsDeviceScreens", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WsDeviceScreensByUsers {
    @SerializedName("userid")
    private final long userid;
    @SerializedName("screens")
    private final List<WsDeviceScreen> wsDeviceScreens;

    public WsDeviceScreensByUsers(long j5, List<WsDeviceScreen> wsDeviceScreens) {
        u.j(wsDeviceScreens, "wsDeviceScreens");
        this.userid = j5;
        this.wsDeviceScreens = wsDeviceScreens;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WsDeviceScreensByUsers copy$default(WsDeviceScreensByUsers wsDeviceScreensByUsers, long j5, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j5 = wsDeviceScreensByUsers.userid;
        }
        if ((i11 & 2) != 0) {
            list = wsDeviceScreensByUsers.wsDeviceScreens;
        }
        return wsDeviceScreensByUsers.copy(j5, list);
    }

    public final long component1() {
        return this.userid;
    }

    public final List<WsDeviceScreen> component2() {
        return this.wsDeviceScreens;
    }

    public final WsDeviceScreensByUsers copy(long j5, List<WsDeviceScreen> wsDeviceScreens) {
        u.j(wsDeviceScreens, "wsDeviceScreens");
        return new WsDeviceScreensByUsers(j5, wsDeviceScreens);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WsDeviceScreensByUsers)) {
            return false;
        }
        WsDeviceScreensByUsers wsDeviceScreensByUsers = (WsDeviceScreensByUsers) obj;
        if (this.userid == wsDeviceScreensByUsers.userid && u.e(this.wsDeviceScreens, wsDeviceScreensByUsers.wsDeviceScreens)) {
            return true;
        }
        return false;
    }

    public final long getUserid() {
        return this.userid;
    }

    public final List<WsDeviceScreen> getWsDeviceScreens() {
        return this.wsDeviceScreens;
    }

    public int hashCode() {
        return this.wsDeviceScreens.hashCode() + (Long.hashCode(this.userid) * 31);
    }

    public String toString() {
        long j5 = this.userid;
        List<WsDeviceScreen> list = this.wsDeviceScreens;
        return "WsDeviceScreensByUsers(userid=" + j5 + ", wsDeviceScreens=" + list + ")";
    }
}
