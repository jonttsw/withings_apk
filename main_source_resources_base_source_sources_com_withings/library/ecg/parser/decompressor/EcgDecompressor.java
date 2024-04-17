package com.withings.library.ecg.parser.decompressor;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
/* compiled from: EcgDecompressor.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0017\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\tJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/withings/library/ecg/parser/decompressor/EcgDecompressor;", "", "", "compressedSignal", "", "decompressEcg", "([B)[S", "Lnm0/y;", "decompressEcgFragLost", "()V", "Lcom/withings/library/ecg/parser/decompressor/NativeEcgDecompressor;", "nativeEcgDecompressor", "Lcom/withings/library/ecg/parser/decompressor/NativeEcgDecompressor;", "Lcom/withings/library/ecg/parser/decompressor/EcgDecompressStream;", "decompressContext", "Lcom/withings/library/ecg/parser/decompressor/EcgDecompressStream;", "<init>", "ecg-library_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes4.dex */
public final class EcgDecompressor {
    private EcgDecompressStream decompressContext;
    private final NativeEcgDecompressor nativeEcgDecompressor;

    public EcgDecompressor() {
        NativeEcgDecompressor nativeEcgDecompressor = new NativeEcgDecompressor();
        this.nativeEcgDecompressor = nativeEcgDecompressor;
        this.decompressContext = nativeEcgDecompressor.ecgDecompressInit();
    }

    public final short[] decompressEcg(byte[] compressedSignal) {
        u.j(compressedSignal, "compressedSignal");
        EcgDecompressStream ecgDecompressStream = this.decompressContext;
        if (ecgDecompressStream != null) {
            DecompressResult decompressEcg = this.nativeEcgDecompressor.decompressEcg(compressedSignal, ecgDecompressStream.getLastValueType(), ecgDecompressStream.getLastValPartial(), ecgDecompressStream.getLastValue());
            this.decompressContext = new EcgDecompressStream(ecgDecompressStream.getLastValueType(), ecgDecompressStream.getLastValPartial(), ecgDecompressStream.getLastValue());
            short[] decompressedStream = decompressEcg.getDecompressedStream();
            if (decompressedStream != null) {
                return decompressedStream;
            }
        }
        ArrayList arrayList = new ArrayList(compressedSignal.length);
        for (byte b10 : compressedSignal) {
            arrayList.add(Short.valueOf(b10));
        }
        return x.V0(arrayList);
    }

    public final void decompressEcgFragLost() {
        EcgDecompressStream ecgDecompressStream = this.decompressContext;
        if (ecgDecompressStream != null) {
            this.nativeEcgDecompressor.decompressEcgFragLost(ecgDecompressStream.getLastValueType(), ecgDecompressStream.getLastValPartial(), ecgDecompressStream.getLastValue());
        }
    }
}
