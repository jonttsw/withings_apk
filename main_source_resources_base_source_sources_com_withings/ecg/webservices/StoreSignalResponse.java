package com.withings.ecg.webservices;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: Models.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/withings/ecg/webservices/StoreSignalResponse;", "", "signal", "Lcom/withings/ecg/webservices/StoreSignal;", "(Lcom/withings/ecg/webservices/StoreSignal;)V", "getSignal", "()Lcom/withings/ecg/webservices/StoreSignal;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ecg_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StoreSignalResponse {
    public static final int $stable = 8;
    @SerializedName("signal")
    private final StoreSignal signal;

    public StoreSignalResponse(StoreSignal signal) {
        u.j(signal, "signal");
        this.signal = signal;
    }

    public static /* synthetic */ StoreSignalResponse copy$default(StoreSignalResponse storeSignalResponse, StoreSignal storeSignal, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            storeSignal = storeSignalResponse.signal;
        }
        return storeSignalResponse.copy(storeSignal);
    }

    public final StoreSignal component1() {
        return this.signal;
    }

    public final StoreSignalResponse copy(StoreSignal signal) {
        u.j(signal, "signal");
        return new StoreSignalResponse(signal);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof StoreSignalResponse) && u.e(this.signal, ((StoreSignalResponse) obj).signal)) {
            return true;
        }
        return false;
    }

    public final StoreSignal getSignal() {
        return this.signal;
    }

    public int hashCode() {
        return this.signal.hashCode();
    }

    public String toString() {
        StoreSignal storeSignal = this.signal;
        return "StoreSignalResponse(signal=" + storeSignal + ")";
    }
}
