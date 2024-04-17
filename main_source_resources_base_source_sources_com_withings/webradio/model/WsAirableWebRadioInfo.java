package com.withings.webradio.model;

import androidx.appcompat.app.h;
import androidx.camera.camera2.internal.e;
import com.withings.manualLogging.data.webservice.healthAttribute.GetHealthAttributeResponse;
import kotlin.Metadata;
/* compiled from: WsAirableWebRadioResponse.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/withings/webradio/model/WsAirableWebRadioInfo;", "", "size", "", "limit", GetHealthAttributeResponse.FIELD_OFFSET_NAME, "(III)V", "getLimit", "()I", "getOffset", "getSize", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "webradio_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WsAirableWebRadioInfo {
    private final int limit;
    private final int offset;
    private final int size;

    public WsAirableWebRadioInfo(int i11, int i12, int i13) {
        this.size = i11;
        this.limit = i12;
        this.offset = i13;
    }

    public static /* synthetic */ WsAirableWebRadioInfo copy$default(WsAirableWebRadioInfo wsAirableWebRadioInfo, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = wsAirableWebRadioInfo.size;
        }
        if ((i14 & 2) != 0) {
            i12 = wsAirableWebRadioInfo.limit;
        }
        if ((i14 & 4) != 0) {
            i13 = wsAirableWebRadioInfo.offset;
        }
        return wsAirableWebRadioInfo.copy(i11, i12, i13);
    }

    public final int component1() {
        return this.size;
    }

    public final int component2() {
        return this.limit;
    }

    public final int component3() {
        return this.offset;
    }

    public final WsAirableWebRadioInfo copy(int i11, int i12, int i13) {
        return new WsAirableWebRadioInfo(i11, i12, i13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WsAirableWebRadioInfo)) {
            return false;
        }
        WsAirableWebRadioInfo wsAirableWebRadioInfo = (WsAirableWebRadioInfo) obj;
        if (this.size == wsAirableWebRadioInfo.size && this.limit == wsAirableWebRadioInfo.limit && this.offset == wsAirableWebRadioInfo.offset) {
            return true;
        }
        return false;
    }

    public final int getLimit() {
        return this.limit;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final int getSize() {
        return this.size;
    }

    public int hashCode() {
        return Integer.hashCode(this.offset) + h.a(this.limit, Integer.hashCode(this.size) * 31, 31);
    }

    public String toString() {
        int i11 = this.size;
        int i12 = this.limit;
        return e.c(h.e("WsAirableWebRadioInfo(size=", i11, ", limit=", i12, ", offset="), this.offset, ")");
    }
}
