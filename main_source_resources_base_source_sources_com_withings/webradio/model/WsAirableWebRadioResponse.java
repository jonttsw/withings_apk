package com.withings.webradio.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: WsAirableWebRadioResponse.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/withings/webradio/model/WsAirableWebRadioResponse;", "", "data", "Lcom/withings/webradio/model/WsAirableWebRadioData;", "(Lcom/withings/webradio/model/WsAirableWebRadioData;)V", "getData", "()Lcom/withings/webradio/model/WsAirableWebRadioData;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "webradio_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WsAirableWebRadioResponse {
    @SerializedName("data")
    private final WsAirableWebRadioData data;

    public WsAirableWebRadioResponse(WsAirableWebRadioData data) {
        u.j(data, "data");
        this.data = data;
    }

    public static /* synthetic */ WsAirableWebRadioResponse copy$default(WsAirableWebRadioResponse wsAirableWebRadioResponse, WsAirableWebRadioData wsAirableWebRadioData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            wsAirableWebRadioData = wsAirableWebRadioResponse.data;
        }
        return wsAirableWebRadioResponse.copy(wsAirableWebRadioData);
    }

    public final WsAirableWebRadioData component1() {
        return this.data;
    }

    public final WsAirableWebRadioResponse copy(WsAirableWebRadioData data) {
        u.j(data, "data");
        return new WsAirableWebRadioResponse(data);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof WsAirableWebRadioResponse) && u.e(this.data, ((WsAirableWebRadioResponse) obj).data)) {
            return true;
        }
        return false;
    }

    public final WsAirableWebRadioData getData() {
        return this.data;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    public String toString() {
        WsAirableWebRadioData wsAirableWebRadioData = this.data;
        return "WsAirableWebRadioResponse(data=" + wsAirableWebRadioData + ")";
    }
}
