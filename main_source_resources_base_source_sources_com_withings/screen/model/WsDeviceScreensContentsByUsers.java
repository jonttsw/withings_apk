package com.withings.screen.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: WsModels.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/withings/screen/model/WsDeviceScreensContentsByUsers;", "", "userid", "", "screensContentHolders", "", "Lcom/withings/screen/model/WsDeviceScreenContentHolder;", "(JLjava/util/List;)V", "getScreensContentHolders", "()Ljava/util/List;", "getUserid", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WsDeviceScreensContentsByUsers {
    @SerializedName("screens")
    private final List<WsDeviceScreenContentHolder> screensContentHolders;
    @SerializedName("userid")
    private final long userid;

    public WsDeviceScreensContentsByUsers(long j5, List<WsDeviceScreenContentHolder> screensContentHolders) {
        u.j(screensContentHolders, "screensContentHolders");
        this.userid = j5;
        this.screensContentHolders = screensContentHolders;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WsDeviceScreensContentsByUsers copy$default(WsDeviceScreensContentsByUsers wsDeviceScreensContentsByUsers, long j5, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j5 = wsDeviceScreensContentsByUsers.userid;
        }
        if ((i11 & 2) != 0) {
            list = wsDeviceScreensContentsByUsers.screensContentHolders;
        }
        return wsDeviceScreensContentsByUsers.copy(j5, list);
    }

    public final long component1() {
        return this.userid;
    }

    public final List<WsDeviceScreenContentHolder> component2() {
        return this.screensContentHolders;
    }

    public final WsDeviceScreensContentsByUsers copy(long j5, List<WsDeviceScreenContentHolder> screensContentHolders) {
        u.j(screensContentHolders, "screensContentHolders");
        return new WsDeviceScreensContentsByUsers(j5, screensContentHolders);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WsDeviceScreensContentsByUsers)) {
            return false;
        }
        WsDeviceScreensContentsByUsers wsDeviceScreensContentsByUsers = (WsDeviceScreensContentsByUsers) obj;
        if (this.userid == wsDeviceScreensContentsByUsers.userid && u.e(this.screensContentHolders, wsDeviceScreensContentsByUsers.screensContentHolders)) {
            return true;
        }
        return false;
    }

    public final List<WsDeviceScreenContentHolder> getScreensContentHolders() {
        return this.screensContentHolders;
    }

    public final long getUserid() {
        return this.userid;
    }

    public int hashCode() {
        return this.screensContentHolders.hashCode() + (Long.hashCode(this.userid) * 31);
    }

    public String toString() {
        long j5 = this.userid;
        List<WsDeviceScreenContentHolder> list = this.screensContentHolders;
        return "WsDeviceScreensContentsByUsers(userid=" + j5 + ", screensContentHolders=" + list + ")";
    }
}
