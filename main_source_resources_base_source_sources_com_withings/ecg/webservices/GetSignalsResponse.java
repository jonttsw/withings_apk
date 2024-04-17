package com.withings.ecg.webservices;

import androidx.appcompat.app.h;
import com.google.gson.annotations.SerializedName;
import com.withings.manualLogging.data.webservice.healthAttribute.GetHealthAttributeResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: Models.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/withings/ecg/webservices/GetSignalsResponse;", "", "signals", "", "Lcom/withings/ecg/webservices/SignalResponse;", GetHealthAttributeResponse.FIELD_OFFSET_NAME, "", GetHealthAttributeResponse.FIELD_HAS_MORE_NAME, "", "(Ljava/util/List;IZ)V", "getMore", "()Z", "getOffset", "()I", "getSignals", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "ecg_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetSignalsResponse {
    public static final int $stable = 8;
    private final boolean more;
    private final int offset;
    @SerializedName("signals")
    private final List<SignalResponse> signals;

    public GetSignalsResponse() {
        this(null, 0, false, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetSignalsResponse copy$default(GetSignalsResponse getSignalsResponse, List list, int i11, boolean z5, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            list = getSignalsResponse.signals;
        }
        if ((i12 & 2) != 0) {
            i11 = getSignalsResponse.offset;
        }
        if ((i12 & 4) != 0) {
            z5 = getSignalsResponse.more;
        }
        return getSignalsResponse.copy(list, i11, z5);
    }

    public final List<SignalResponse> component1() {
        return this.signals;
    }

    public final int component2() {
        return this.offset;
    }

    public final boolean component3() {
        return this.more;
    }

    public final GetSignalsResponse copy(List<SignalResponse> list, int i11, boolean z5) {
        return new GetSignalsResponse(list, i11, z5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetSignalsResponse)) {
            return false;
        }
        GetSignalsResponse getSignalsResponse = (GetSignalsResponse) obj;
        if (u.e(this.signals, getSignalsResponse.signals) && this.offset == getSignalsResponse.offset && this.more == getSignalsResponse.more) {
            return true;
        }
        return false;
    }

    public final boolean getMore() {
        return this.more;
    }

    public final int getOffset() {
        return this.offset;
    }

    public final List<SignalResponse> getSignals() {
        return this.signals;
    }

    public int hashCode() {
        int hashCode;
        List<SignalResponse> list = this.signals;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return Boolean.hashCode(this.more) + h.a(this.offset, hashCode * 31, 31);
    }

    public String toString() {
        List<SignalResponse> list = this.signals;
        int i11 = this.offset;
        boolean z5 = this.more;
        StringBuilder sb2 = new StringBuilder("GetSignalsResponse(signals=");
        sb2.append(list);
        sb2.append(", offset=");
        sb2.append(i11);
        sb2.append(", more=");
        return h.d(sb2, z5, ")");
    }

    public GetSignalsResponse(List<SignalResponse> list, int i11, boolean z5) {
        this.signals = list;
        this.offset = i11;
        this.more = z5;
    }

    public /* synthetic */ GetSignalsResponse(List list, int i11, boolean z5, int i12, m mVar) {
        this((i12 & 1) != 0 ? null : list, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? false : z5);
    }
}
