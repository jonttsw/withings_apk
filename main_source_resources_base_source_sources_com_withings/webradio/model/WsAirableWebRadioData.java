package com.withings.webradio.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: WsAirableWebRadioResponse.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/withings/webradio/model/WsAirableWebRadioData;", "", "list", "", "Lcom/withings/webradio/model/WebRadio;", "collection", "Lcom/withings/webradio/model/WsAirableWebRadioInfo;", "(Ljava/util/List;Lcom/withings/webradio/model/WsAirableWebRadioInfo;)V", "getCollection", "()Lcom/withings/webradio/model/WsAirableWebRadioInfo;", "getList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "webradio_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WsAirableWebRadioData {
    @SerializedName("collection")
    private final WsAirableWebRadioInfo collection;
    @SerializedName("data")
    private final List<WebRadio> list;

    public WsAirableWebRadioData(List<WebRadio> list, WsAirableWebRadioInfo collection) {
        u.j(list, "list");
        u.j(collection, "collection");
        this.list = list;
        this.collection = collection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WsAirableWebRadioData copy$default(WsAirableWebRadioData wsAirableWebRadioData, List list, WsAirableWebRadioInfo wsAirableWebRadioInfo, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = wsAirableWebRadioData.list;
        }
        if ((i11 & 2) != 0) {
            wsAirableWebRadioInfo = wsAirableWebRadioData.collection;
        }
        return wsAirableWebRadioData.copy(list, wsAirableWebRadioInfo);
    }

    public final List<WebRadio> component1() {
        return this.list;
    }

    public final WsAirableWebRadioInfo component2() {
        return this.collection;
    }

    public final WsAirableWebRadioData copy(List<WebRadio> list, WsAirableWebRadioInfo collection) {
        u.j(list, "list");
        u.j(collection, "collection");
        return new WsAirableWebRadioData(list, collection);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WsAirableWebRadioData)) {
            return false;
        }
        WsAirableWebRadioData wsAirableWebRadioData = (WsAirableWebRadioData) obj;
        if (u.e(this.list, wsAirableWebRadioData.list) && u.e(this.collection, wsAirableWebRadioData.collection)) {
            return true;
        }
        return false;
    }

    public final WsAirableWebRadioInfo getCollection() {
        return this.collection;
    }

    public final List<WebRadio> getList() {
        return this.list;
    }

    public int hashCode() {
        return this.collection.hashCode() + (this.list.hashCode() * 31);
    }

    public String toString() {
        List<WebRadio> list = this.list;
        WsAirableWebRadioInfo wsAirableWebRadioInfo = this.collection;
        return "WsAirableWebRadioData(list=" + list + ", collection=" + wsAirableWebRadioInfo + ")";
    }
}
