package com.withings.library.ecg.compressor;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: EcgCompressor.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0017\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/withings/library/ecg/compressor/EcgCompressor;", "", "()V", "nativeEcgCompressor", "Lcom/withings/library/ecg/compressor/NativeEcgCompressor;", "compressEcg", "", "signalArray", "", "ecg-library_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EcgCompressor {
    private final NativeEcgCompressor nativeEcgCompressor = new NativeEcgCompressor();

    public final byte[] compressEcg(short[] signalArray) {
        u.j(signalArray, "signalArray");
        return this.nativeEcgCompressor.compressEcg(signalArray);
    }
}
