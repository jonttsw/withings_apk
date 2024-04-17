package com.withings.qrcode;

import android.content.Context;
import androidx.camera.view.PreviewView;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import ym0.l;
/* compiled from: QRCodeScannerActivity.kt */
/* loaded from: classes4.dex */
final /* synthetic */ class a extends s implements l<Context, PreviewView> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public a(QRCodeScannerActivity qRCodeScannerActivity) {
        super(1, qRCodeScannerActivity, QRCodeScannerActivity.class, "getPreview", "getPreview(Landroid/content/Context;)Landroidx/camera/view/PreviewView;", 0);
    }

    @Override // ym0.l
    public final PreviewView invoke(Context context) {
        Context p02 = context;
        u.j(p02, "p0");
        return QRCodeScannerActivity.D3((QRCodeScannerActivity) this.receiver, p02);
    }
}
