package com.withings.ecg.webservices;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: Models.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/withings/ecg/webservices/GetSignalResponse;", "", "signal", "Lcom/withings/ecg/webservices/SignalResponse;", "(Lcom/withings/ecg/webservices/SignalResponse;)V", "getSignal", "()Lcom/withings/ecg/webservices/SignalResponse;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ecg_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetSignalResponse {
    public static final int $stable = 8;
    @SerializedName("signal")
    private final SignalResponse signal;

    public GetSignalResponse() {
        this(null, 1, null);
    }

    public static /* synthetic */ GetSignalResponse copy$default(GetSignalResponse getSignalResponse, SignalResponse signalResponse, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            signalResponse = getSignalResponse.signal;
        }
        return getSignalResponse.copy(signalResponse);
    }

    public final SignalResponse component1() {
        return this.signal;
    }

    public final GetSignalResponse copy(SignalResponse signalResponse) {
        return new GetSignalResponse(signalResponse);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof GetSignalResponse) && u.e(this.signal, ((GetSignalResponse) obj).signal)) {
            return true;
        }
        return false;
    }

    public final SignalResponse getSignal() {
        return this.signal;
    }

    public int hashCode() {
        SignalResponse signalResponse = this.signal;
        if (signalResponse == null) {
            return 0;
        }
        return signalResponse.hashCode();
    }

    public String toString() {
        SignalResponse signalResponse = this.signal;
        return "GetSignalResponse(signal=" + signalResponse + ")";
    }

    public GetSignalResponse(SignalResponse signalResponse) {
        this.signal = signalResponse;
    }

    public /* synthetic */ GetSignalResponse(SignalResponse signalResponse, int i11, m mVar) {
        this((i11 & 1) != 0 ? null : signalResponse);
    }
}
