package com.withings.library.ecg;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: EcgSignal.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/withings/library/ecg/EcgSignal;", "", "raw", "", "signalType", "Lcom/withings/library/ecg/EcgSignalType;", "signalFormat", "Lcom/withings/library/ecg/EcgSignalFormat;", "([BLcom/withings/library/ecg/EcgSignalType;Lcom/withings/library/ecg/EcgSignalFormat;)V", "getRaw", "()[B", "getSignalFormat", "()Lcom/withings/library/ecg/EcgSignalFormat;", "getSignalType", "()Lcom/withings/library/ecg/EcgSignalType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ecg-library_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EcgSignal {
    private final byte[] raw;
    private final EcgSignalFormat signalFormat;
    private final EcgSignalType signalType;

    public EcgSignal(byte[] raw, EcgSignalType signalType, EcgSignalFormat signalFormat) {
        u.j(raw, "raw");
        u.j(signalType, "signalType");
        u.j(signalFormat, "signalFormat");
        this.raw = raw;
        this.signalType = signalType;
        this.signalFormat = signalFormat;
    }

    public static /* synthetic */ EcgSignal copy$default(EcgSignal ecgSignal, byte[] bArr, EcgSignalType ecgSignalType, EcgSignalFormat ecgSignalFormat, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bArr = ecgSignal.raw;
        }
        if ((i11 & 2) != 0) {
            ecgSignalType = ecgSignal.signalType;
        }
        if ((i11 & 4) != 0) {
            ecgSignalFormat = ecgSignal.signalFormat;
        }
        return ecgSignal.copy(bArr, ecgSignalType, ecgSignalFormat);
    }

    public final byte[] component1() {
        return this.raw;
    }

    public final EcgSignalType component2() {
        return this.signalType;
    }

    public final EcgSignalFormat component3() {
        return this.signalFormat;
    }

    public final EcgSignal copy(byte[] raw, EcgSignalType signalType, EcgSignalFormat signalFormat) {
        u.j(raw, "raw");
        u.j(signalType, "signalType");
        u.j(signalFormat, "signalFormat");
        return new EcgSignal(raw, signalType, signalFormat);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EcgSignal)) {
            return false;
        }
        EcgSignal ecgSignal = (EcgSignal) obj;
        if (u.e(this.raw, ecgSignal.raw) && this.signalType == ecgSignal.signalType && this.signalFormat == ecgSignal.signalFormat) {
            return true;
        }
        return false;
    }

    public final byte[] getRaw() {
        return this.raw;
    }

    public final EcgSignalFormat getSignalFormat() {
        return this.signalFormat;
    }

    public final EcgSignalType getSignalType() {
        return this.signalType;
    }

    public int hashCode() {
        int hashCode = this.signalType.hashCode();
        return this.signalFormat.hashCode() + ((hashCode + (Arrays.hashCode(this.raw) * 31)) * 31);
    }

    public String toString() {
        return "EcgSignal(raw=" + Arrays.toString(this.raw) + ", signalType=" + this.signalType + ", signalFormat=" + this.signalFormat + ')';
    }
}
