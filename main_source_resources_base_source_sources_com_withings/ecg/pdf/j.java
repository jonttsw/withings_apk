package com.withings.ecg.pdf;

import android.widget.FrameLayout;
import androidx.health.platform.client.proto.x;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: PDFGenerationActivity.kt */
/* loaded from: classes3.dex */
final class j extends w implements ym0.l<a, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ PDFGenerationActivity f38799a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(PDFGenerationActivity pDFGenerationActivity) {
        super(1);
        this.f38799a = pDFGenerationActivity;
    }

    @Override // ym0.l
    public final y invoke(a aVar) {
        a aVar2 = aVar;
        x c11 = aVar2.c();
        FrameLayout pdfPage = PDFGenerationActivity.z3(this.f38799a).f78053a;
        u.i(pdfPage, "pdfPage");
        c11.c(pdfPage, aVar2);
        return y.f85009a;
    }
}
