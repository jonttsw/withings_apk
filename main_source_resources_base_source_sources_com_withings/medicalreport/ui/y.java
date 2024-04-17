package com.withings.medicalreport.ui;

import androidx.lifecycle.h0;
import com.withings.medicalreport.model.MedicalReport;
import org.joda.time.DateTime;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PdfPreviewViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.medicalreport.ui.PdfPreviewViewModel$pdfData$1", f = "PdfPreviewViewModel.kt", l = {57, 66, 68, 73, 75}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class y extends kotlin.coroutines.jvm.internal.i implements ym0.p<h0<f0>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f42297a;

    /* renamed from: b  reason: collision with root package name */
    String f42298b;

    /* renamed from: c  reason: collision with root package name */
    String f42299c;

    /* renamed from: d  reason: collision with root package name */
    String f42300d;

    /* renamed from: e  reason: collision with root package name */
    MedicalReport f42301e;

    /* renamed from: f  reason: collision with root package name */
    long f42302f;

    /* renamed from: g  reason: collision with root package name */
    int f42303g;

    /* renamed from: h  reason: collision with root package name */
    private /* synthetic */ Object f42304h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ String f42305i;

    /* renamed from: j  reason: collision with root package name */
    final /* synthetic */ DateTime f42306j;

    /* renamed from: k  reason: collision with root package name */
    final /* synthetic */ DateTime f42307k;

    /* renamed from: l  reason: collision with root package name */
    final /* synthetic */ z f42308l;

    /* renamed from: m  reason: collision with root package name */
    final /* synthetic */ long f42309m;

    /* renamed from: n  reason: collision with root package name */
    final /* synthetic */ String f42310n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(String str, DateTime dateTime, DateTime dateTime2, z zVar, long j5, String str2, qm0.d<? super y> dVar) {
        super(2, dVar);
        this.f42305i = str;
        this.f42306j = dateTime;
        this.f42307k = dateTime2;
        this.f42308l = zVar;
        this.f42309m = j5;
        this.f42310n = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        y yVar = new y(this.f42305i, this.f42306j, this.f42307k, this.f42308l, this.f42309m, this.f42310n, dVar);
        yVar.f42304h = obj;
        return yVar;
    }

    @Override // ym0.p
    public final Object invoke(h0<f0> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((y) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ec A[Catch: all -> 0x004b, TRY_LEAVE, TryCatch #3 {all -> 0x004b, blocks: (B:14:0x0046, B:35:0x00e6, B:37:0x00ec, B:19:0x005f, B:28:0x0096, B:29:0x00a4), top: B:77:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0206  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x010f -> B:41:0x0115). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0120 -> B:42:0x011c). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.medicalreport.ui.y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
