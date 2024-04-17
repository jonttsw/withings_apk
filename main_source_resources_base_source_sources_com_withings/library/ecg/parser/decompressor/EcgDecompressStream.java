package com.withings.library.ecg.parser.decompressor;

import androidx.activity.b;
import kotlin.Metadata;
/* compiled from: EcgDecompressor.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\n\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/withings/library/ecg/parser/decompressor/EcgDecompressStream;", "", "lastValueType", "", "lastValPartial", "", "lastValue", "", "(IZS)V", "getLastValPartial", "()Z", "getLastValue", "()S", "getLastValueType", "()I", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "ecg-library_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EcgDecompressStream {
    private final boolean lastValPartial;
    private final short lastValue;
    private final int lastValueType;

    public EcgDecompressStream(int i11, boolean z5, short s11) {
        this.lastValueType = i11;
        this.lastValPartial = z5;
        this.lastValue = s11;
    }

    public static /* synthetic */ EcgDecompressStream copy$default(EcgDecompressStream ecgDecompressStream, int i11, boolean z5, short s11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = ecgDecompressStream.lastValueType;
        }
        if ((i12 & 2) != 0) {
            z5 = ecgDecompressStream.lastValPartial;
        }
        if ((i12 & 4) != 0) {
            s11 = ecgDecompressStream.lastValue;
        }
        return ecgDecompressStream.copy(i11, z5, s11);
    }

    public final int component1() {
        return this.lastValueType;
    }

    public final boolean component2() {
        return this.lastValPartial;
    }

    public final short component3() {
        return this.lastValue;
    }

    public final EcgDecompressStream copy(int i11, boolean z5, short s11) {
        return new EcgDecompressStream(i11, z5, s11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EcgDecompressStream)) {
            return false;
        }
        EcgDecompressStream ecgDecompressStream = (EcgDecompressStream) obj;
        if (this.lastValueType == ecgDecompressStream.lastValueType && this.lastValPartial == ecgDecompressStream.lastValPartial && this.lastValue == ecgDecompressStream.lastValue) {
            return true;
        }
        return false;
    }

    public final boolean getLastValPartial() {
        return this.lastValPartial;
    }

    public final short getLastValue() {
        return this.lastValue;
    }

    public final int getLastValueType() {
        return this.lastValueType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = Integer.hashCode(this.lastValueType) * 31;
        boolean z5 = this.lastValPartial;
        int i11 = z5;
        if (z5 != 0) {
            i11 = 1;
        }
        return Short.hashCode(this.lastValue) + ((hashCode + i11) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("EcgDecompressStream(lastValueType=");
        sb2.append(this.lastValueType);
        sb2.append(", lastValPartial=");
        sb2.append(this.lastValPartial);
        sb2.append(", lastValue=");
        return b.c(sb2, this.lastValue, ')');
    }
}
