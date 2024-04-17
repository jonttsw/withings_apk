package com.withings.library.ecg.parser.decompressor;

import com.withings.library.ecg.p003native.EcgNative;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: NativeEcgDecompressor.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/withings/library/ecg/parser/decompressor/NativeEcgDecompressor;", "", "Lcom/withings/library/ecg/parser/decompressor/EcgDecompressStream;", "ecgDecompressInit", "()Lcom/withings/library/ecg/parser/decompressor/EcgDecompressStream;", "", "compressedSignal", "", "lastValueType", "", "lastValPartial", "", "lastValue", "Lcom/withings/library/ecg/parser/decompressor/DecompressResult;", "decompressEcg", "([BIZS)Lcom/withings/library/ecg/parser/decompressor/DecompressResult;", "Lnm0/y;", "decompressEcgFragLost", "(IZS)V", "<init>", "()V", "ecg-library_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes4.dex */
public final class NativeEcgDecompressor {
    public final DecompressResult decompressEcg(byte[] compressedSignal, int i11, boolean z5, short s11) {
        u.j(compressedSignal, "compressedSignal");
        return EcgNative.INSTANCE.decompressEcg(compressedSignal, i11, z5, s11);
    }

    public final void decompressEcgFragLost(int i11, boolean z5, short s11) {
        EcgNative.INSTANCE.decompressEcgFragLost(i11, z5, s11);
    }

    public final EcgDecompressStream ecgDecompressInit() {
        return EcgNative.INSTANCE.ecgDecompressInit();
    }
}
