package com.withings.qrcode;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.Iterator;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* compiled from: QRCodeScannerActivity.kt */
/* loaded from: classes4.dex */
final class d extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f43869a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ QRCodeScannerActivity f43870b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i11, QRCodeScannerActivity qRCodeScannerActivity) {
        super(2);
        this.f43869a = i11;
        this.f43870b = qRCodeScannerActivity;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        Object obj;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            QRCodeAnalyzerType.f43849b.getClass();
            Iterator it = ((kotlin.collections.c) QRCodeAnalyzerType.a()).iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((QRCodeAnalyzerType) obj).b() == this.f43869a) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            QRCodeAnalyzerType qRCodeAnalyzerType = (QRCodeAnalyzerType) obj;
            if (qRCodeAnalyzerType == null) {
                qRCodeAnalyzerType = QRCodeAnalyzerType.f43850c;
            }
            if (qRCodeAnalyzerType == QRCodeAnalyzerType.f43850c) {
                QRCodeScannerActivity qRCodeScannerActivity = this.f43870b;
                parcelableSnapshotMutableState = qRCodeScannerActivity.f43861g;
                boolean booleanValue = ((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue();
                i40.c.c(0, aVar2, new b(qRCodeScannerActivity), new c(qRCodeScannerActivity), new a(qRCodeScannerActivity), booleanValue);
            }
        }
        return y.f85009a;
    }
}
