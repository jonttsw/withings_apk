package com.withings.library.ecg.parser;

import com.withings.library.ecg.parser.decompressor.EcgDecompressor;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import ym0.a;
/* compiled from: EcgSampleParser.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/withings/library/ecg/parser/decompressor/EcgDecompressor;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
final class EcgSampleParser$decompressor$2 extends w implements a<EcgDecompressor> {
    public static final EcgSampleParser$decompressor$2 INSTANCE = new EcgSampleParser$decompressor$2();

    EcgSampleParser$decompressor$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ym0.a
    public final EcgDecompressor invoke() {
        return new EcgDecompressor();
    }
}
