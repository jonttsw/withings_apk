package com.withings.ecg.model;

import androidx.camera.core.y1;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: HeartSignalMeasurement.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J.\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0007HÖ\u0001R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lcom/withings/ecg/model/Signal;", "", "signalId", "", "meta", "Lcom/withings/ecg/model/SignalMeta;", "signalPath", "", "(Ljava/lang/Long;Lcom/withings/ecg/model/SignalMeta;Ljava/lang/String;)V", "getMeta", "()Lcom/withings/ecg/model/SignalMeta;", "setMeta", "(Lcom/withings/ecg/model/SignalMeta;)V", "getSignalId", "()Ljava/lang/Long;", "setSignalId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getSignalPath", "()Ljava/lang/String;", "setSignalPath", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "(Ljava/lang/Long;Lcom/withings/ecg/model/SignalMeta;Ljava/lang/String;)Lcom/withings/ecg/model/Signal;", "equals", "", "other", "hashCode", "", "toString", "ecg_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Signal {
    public static final int $stable = 8;
    private SignalMeta meta;
    private Long signalId;
    private String signalPath;

    public Signal(Long l5, SignalMeta meta, String signalPath) {
        u.j(meta, "meta");
        u.j(signalPath, "signalPath");
        this.signalId = l5;
        this.meta = meta;
        this.signalPath = signalPath;
    }

    public static /* synthetic */ Signal copy$default(Signal signal, Long l5, SignalMeta signalMeta, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l5 = signal.signalId;
        }
        if ((i11 & 2) != 0) {
            signalMeta = signal.meta;
        }
        if ((i11 & 4) != 0) {
            str = signal.signalPath;
        }
        return signal.copy(l5, signalMeta, str);
    }

    public final Long component1() {
        return this.signalId;
    }

    public final SignalMeta component2() {
        return this.meta;
    }

    public final String component3() {
        return this.signalPath;
    }

    public final Signal copy(Long l5, SignalMeta meta, String signalPath) {
        u.j(meta, "meta");
        u.j(signalPath, "signalPath");
        return new Signal(l5, meta, signalPath);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Signal)) {
            return false;
        }
        Signal signal = (Signal) obj;
        if (u.e(this.signalId, signal.signalId) && u.e(this.meta, signal.meta) && u.e(this.signalPath, signal.signalPath)) {
            return true;
        }
        return false;
    }

    public final SignalMeta getMeta() {
        return this.meta;
    }

    public final Long getSignalId() {
        return this.signalId;
    }

    public final String getSignalPath() {
        return this.signalPath;
    }

    public int hashCode() {
        int hashCode;
        Long l5 = this.signalId;
        if (l5 == null) {
            hashCode = 0;
        } else {
            hashCode = l5.hashCode();
        }
        int hashCode2 = this.meta.hashCode();
        return this.signalPath.hashCode() + ((hashCode2 + (hashCode * 31)) * 31);
    }

    public final void setMeta(SignalMeta signalMeta) {
        u.j(signalMeta, "<set-?>");
        this.meta = signalMeta;
    }

    public final void setSignalId(Long l5) {
        this.signalId = l5;
    }

    public final void setSignalPath(String str) {
        u.j(str, "<set-?>");
        this.signalPath = str;
    }

    public String toString() {
        Long l5 = this.signalId;
        SignalMeta signalMeta = this.meta;
        String str = this.signalPath;
        StringBuilder sb2 = new StringBuilder("Signal(signalId=");
        sb2.append(l5);
        sb2.append(", meta=");
        sb2.append(signalMeta);
        sb2.append(", signalPath=");
        return y1.e(sb2, str, ")");
    }

    public /* synthetic */ Signal(Long l5, SignalMeta signalMeta, String str, int i11, m mVar) {
        this((i11 & 1) != 0 ? null : l5, signalMeta, (i11 & 4) != 0 ? "" : str);
    }
}
