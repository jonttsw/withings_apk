package com.withings.library.ecg.parser.decompressor;

import kotlin.Metadata;
/* compiled from: EcgDecompressor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withings/library/ecg/parser/decompressor/DecompressionException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "errorCode", "", "(I)V", "getErrorCode", "()I", "ecg-library_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DecompressionException extends Exception {
    private final int errorCode;

    public DecompressionException(int i11) {
        this.errorCode = i11;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }
}
