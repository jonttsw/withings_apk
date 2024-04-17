package com.withings.leaderboard.utils;

import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.common.sdkinternal.i;
import com.google.mlkit.vision.barcode.internal.d;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import zd.b;
/* compiled from: QRCodeAnalyzer.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzd/a;", "invoke", "()Lzd/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class QRCodeAnalyzer$barcodeScanner$2 extends w implements ym0.a<zd.a> {
    public static final QRCodeAnalyzer$barcodeScanner$2 INSTANCE = new QRCodeAnalyzer$barcodeScanner$2();

    QRCodeAnalyzer$barcodeScanner$2() {
        super(0);
    }

    @Override // ym0.a
    public final zd.a invoke() {
        b.a aVar = new b.a();
        aVar.b(new int[0]);
        zd.b a11 = aVar.a();
        Preconditions.checkNotNull(a11, "You must provide a valid BarcodeScannerOptions.");
        return ((d) i.c().a(d.class)).a(a11);
    }
}
