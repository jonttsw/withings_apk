package com.withings.screen.model;

import android.support.v4.media.session.c;
import androidx.compose.material3.d;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
/* compiled from: WsModels.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003JD\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0012\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lcom/withings/screen/model/WsDeviceScreenContent;", "", XHTMLText.STYLE, "", "message", "", "startDate", "", "endDate", "modified", "(ILjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;J)V", "getEndDate", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMessage", "()Ljava/lang/String;", "getModified", "()J", "getStartDate", "getStyle", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "(ILjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;J)Lcom/withings/screen/model/WsDeviceScreenContent;", "equals", "", "other", "hashCode", "toString", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WsDeviceScreenContent {
    @SerializedName("enddate")
    private final Long endDate;
    @SerializedName(RemoteMessageConst.MessageBody.MSG)
    private final String message;
    private final long modified;
    @SerializedName("startdate")
    private final Long startDate;
    private final int style;

    public WsDeviceScreenContent(int i11, String message, Long l5, Long l6, long j5) {
        u.j(message, "message");
        this.style = i11;
        this.message = message;
        this.startDate = l5;
        this.endDate = l6;
        this.modified = j5;
    }

    public static /* synthetic */ WsDeviceScreenContent copy$default(WsDeviceScreenContent wsDeviceScreenContent, int i11, String str, Long l5, Long l6, long j5, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = wsDeviceScreenContent.style;
        }
        if ((i12 & 2) != 0) {
            str = wsDeviceScreenContent.message;
        }
        String str2 = str;
        if ((i12 & 4) != 0) {
            l5 = wsDeviceScreenContent.startDate;
        }
        Long l11 = l5;
        if ((i12 & 8) != 0) {
            l6 = wsDeviceScreenContent.endDate;
        }
        Long l12 = l6;
        if ((i12 & 16) != 0) {
            j5 = wsDeviceScreenContent.modified;
        }
        return wsDeviceScreenContent.copy(i11, str2, l11, l12, j5);
    }

    public final int component1() {
        return this.style;
    }

    public final String component2() {
        return this.message;
    }

    public final Long component3() {
        return this.startDate;
    }

    public final Long component4() {
        return this.endDate;
    }

    public final long component5() {
        return this.modified;
    }

    public final WsDeviceScreenContent copy(int i11, String message, Long l5, Long l6, long j5) {
        u.j(message, "message");
        return new WsDeviceScreenContent(i11, message, l5, l6, j5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WsDeviceScreenContent)) {
            return false;
        }
        WsDeviceScreenContent wsDeviceScreenContent = (WsDeviceScreenContent) obj;
        if (this.style == wsDeviceScreenContent.style && u.e(this.message, wsDeviceScreenContent.message) && u.e(this.startDate, wsDeviceScreenContent.startDate) && u.e(this.endDate, wsDeviceScreenContent.endDate) && this.modified == wsDeviceScreenContent.modified) {
            return true;
        }
        return false;
    }

    public final Long getEndDate() {
        return this.endDate;
    }

    public final String getMessage() {
        return this.message;
    }

    public final long getModified() {
        return this.modified;
    }

    public final Long getStartDate() {
        return this.startDate;
    }

    public final int getStyle() {
        return this.style;
    }

    public int hashCode() {
        int hashCode;
        int c11 = d.c(this.message, Integer.hashCode(this.style) * 31, 31);
        Long l5 = this.startDate;
        int i11 = 0;
        if (l5 == null) {
            hashCode = 0;
        } else {
            hashCode = l5.hashCode();
        }
        int i12 = (c11 + hashCode) * 31;
        Long l6 = this.endDate;
        if (l6 != null) {
            i11 = l6.hashCode();
        }
        return Long.hashCode(this.modified) + ((i12 + i11) * 31);
    }

    public String toString() {
        int i11 = this.style;
        String str = this.message;
        Long l5 = this.startDate;
        Long l6 = this.endDate;
        long j5 = this.modified;
        StringBuilder a11 = d.a("WsDeviceScreenContent(style=", i11, ", message=", str, ", startDate=");
        a11.append(l5);
        a11.append(", endDate=");
        a11.append(l6);
        a11.append(", modified=");
        return c.c(a11, j5, ")");
    }
}
