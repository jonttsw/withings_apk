package com.withings.library.ecg.compressor;

import com.withings.library.ecg.p003native.EcgNative;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: NativeEcgCompressor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0017\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/ecg/compressor/NativeEcgCompressor;", "", "()V", "compressEcg", "", "rawSignalArray", "", "ecg-library_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NativeEcgCompressor {
    public final byte[] compressEcg(short[] rawSignalArray) {
        u.j(rawSignalArray, "rawSignalArray");
        return EcgNative.INSTANCE.compressEcg(rawSignalArray);
    }
}
