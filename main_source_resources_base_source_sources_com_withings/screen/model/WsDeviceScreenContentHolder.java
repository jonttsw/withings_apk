package com.withings.screen.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: WsModels.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/withings/screen/model/WsDeviceScreenContentHolder;", "", "screenId", "", "contents", "", "Lcom/withings/screen/model/WsDeviceScreenContent;", "(JLjava/util/List;)V", "getContents", "()Ljava/util/List;", "getScreenId", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WsDeviceScreenContentHolder {
    private final List<WsDeviceScreenContent> contents;
    @SerializedName("id")
    private final long screenId;

    public WsDeviceScreenContentHolder(long j5, List<WsDeviceScreenContent> list) {
        this.screenId = j5;
        this.contents = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WsDeviceScreenContentHolder copy$default(WsDeviceScreenContentHolder wsDeviceScreenContentHolder, long j5, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j5 = wsDeviceScreenContentHolder.screenId;
        }
        if ((i11 & 2) != 0) {
            list = wsDeviceScreenContentHolder.contents;
        }
        return wsDeviceScreenContentHolder.copy(j5, list);
    }

    public final long component1() {
        return this.screenId;
    }

    public final List<WsDeviceScreenContent> component2() {
        return this.contents;
    }

    public final WsDeviceScreenContentHolder copy(long j5, List<WsDeviceScreenContent> list) {
        return new WsDeviceScreenContentHolder(j5, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WsDeviceScreenContentHolder)) {
            return false;
        }
        WsDeviceScreenContentHolder wsDeviceScreenContentHolder = (WsDeviceScreenContentHolder) obj;
        if (this.screenId == wsDeviceScreenContentHolder.screenId && u.e(this.contents, wsDeviceScreenContentHolder.contents)) {
            return true;
        }
        return false;
    }

    public final List<WsDeviceScreenContent> getContents() {
        return this.contents;
    }

    public final long getScreenId() {
        return this.screenId;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = Long.hashCode(this.screenId) * 31;
        List<WsDeviceScreenContent> list = this.contents;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        long j5 = this.screenId;
        List<WsDeviceScreenContent> list = this.contents;
        return "WsDeviceScreenContentHolder(screenId=" + j5 + ", contents=" + list + ")";
    }
}
