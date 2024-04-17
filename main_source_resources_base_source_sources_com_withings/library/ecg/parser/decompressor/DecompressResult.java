package com.withings.library.ecg.parser.decompressor;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: EcgDecompressor.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0017\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/withings/library/ecg/parser/decompressor/DecompressResult;", "", "lastValueType", "", "lastValPartial", "", "lastValue", "", "decompressedStream", "", "(IZS[S)V", "getDecompressedStream", "()[S", "getLastValPartial", "()Z", "getLastValue", "()S", "getLastValueType", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "ecg-library_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DecompressResult {
    private final short[] decompressedStream;
    private final boolean lastValPartial;
    private final short lastValue;
    private final int lastValueType;

    public DecompressResult(int i11, boolean z5, short s11, short[] decompressedStream) {
        u.j(decompressedStream, "decompressedStream");
        this.lastValueType = i11;
        this.lastValPartial = z5;
        this.lastValue = s11;
        this.decompressedStream = decompressedStream;
    }

    public static /* synthetic */ DecompressResult copy$default(DecompressResult decompressResult, int i11, boolean z5, short s11, short[] sArr, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = decompressResult.lastValueType;
        }
        if ((i12 & 2) != 0) {
            z5 = decompressResult.lastValPartial;
        }
        if ((i12 & 4) != 0) {
            s11 = decompressResult.lastValue;
        }
        if ((i12 & 8) != 0) {
            sArr = decompressResult.decompressedStream;
        }
        return decompressResult.copy(i11, z5, s11, sArr);
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

    public final short[] component4() {
        return this.decompressedStream;
    }

    public final DecompressResult copy(int i11, boolean z5, short s11, short[] decompressedStream) {
        u.j(decompressedStream, "decompressedStream");
        return new DecompressResult(i11, z5, s11, decompressedStream);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DecompressResult)) {
            return false;
        }
        DecompressResult decompressResult = (DecompressResult) obj;
        if (this.lastValueType == decompressResult.lastValueType && this.lastValPartial == decompressResult.lastValPartial && this.lastValue == decompressResult.lastValue && u.e(this.decompressedStream, decompressResult.decompressedStream)) {
            return true;
        }
        return false;
    }

    public final short[] getDecompressedStream() {
        return this.decompressedStream;
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
        int hashCode2 = Short.hashCode(this.lastValue);
        return Arrays.hashCode(this.decompressedStream) + ((hashCode2 + ((hashCode + i11) * 31)) * 31);
    }

    public String toString() {
        return "DecompressResult(lastValueType=" + this.lastValueType + ", lastValPartial=" + this.lastValPartial + ", lastValue=" + ((int) this.lastValue) + ", decompressedStream=" + Arrays.toString(this.decompressedStream) + ')';
    }
}
