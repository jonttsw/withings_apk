package com.withings.ecg.pdf;

import android.graphics.Bitmap;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.e1;
import com.withings.library.authentication.api.ConstantsWs;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
/* compiled from: SixLeadEcgPDF.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.ecg.pdf.SixLeadEcgPDF$saveViewAsBitmap$2", f = "SixLeadEcgPDF.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class p extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ kq.e f38819a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r f38820b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f38821c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(int i11, kq.e eVar, r rVar, qm0.d dVar) {
        super(2, dVar);
        this.f38819a = eVar;
        this.f38820b = rVar;
        this.f38821c = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new p(this.f38821c, this.f38819a, this.f38820b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((p) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        File file;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        ConstraintLayout containerPdf = this.f38819a.f78091d;
        u.i(containerPdf, "containerPdf");
        Bitmap a11 = e1.a(containerPdf, Bitmap.Config.ARGB_8888);
        file = this.f38820b.f38834c;
        File file2 = new File(file, ConstantsWs.JSON_SESSION_KEY_ECG);
        file2.mkdirs();
        FileOutputStream fileOutputStream = new FileOutputStream(new File(file2, androidx.camera.camera2.internal.e.c(new StringBuilder("doctor-ecg-"), this.f38821c, ".jpg")));
        try {
            a11.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            ge0.d.a(fileOutputStream, null);
            a11.recycle();
            return y.f85009a;
        } finally {
        }
    }
}
