package com.withings.ecg.pdf;

import androidx.appcompat.app.AppCompatActivity;
import androidx.health.platform.client.proto.x;
import androidx.lifecycle.h0;
import com.withings.ecg.model.HeartSignalMeasurement;
import com.withings.user.User;
import nm0.y;
/* compiled from: PDFGenerationActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.ecg.pdf.GenerationViewModel$ecgDetail$1$1", f = "PDFGenerationActivity.kt", l = {103, 105}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class c extends kotlin.coroutines.jvm.internal.i implements ym0.p<h0<a>, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    b f38754a;

    /* renamed from: b  reason: collision with root package name */
    HeartSignalMeasurement f38755b;

    /* renamed from: c  reason: collision with root package name */
    x f38756c;

    /* renamed from: d  reason: collision with root package name */
    User f38757d;

    /* renamed from: e  reason: collision with root package name */
    int f38758e;

    /* renamed from: f  reason: collision with root package name */
    private /* synthetic */ Object f38759f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ HeartSignalMeasurement f38760g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ AppCompatActivity f38761h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ b f38762i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(HeartSignalMeasurement heartSignalMeasurement, AppCompatActivity appCompatActivity, b bVar, qm0.d<? super c> dVar) {
        super(2, dVar);
        this.f38760g = heartSignalMeasurement;
        this.f38761h = appCompatActivity;
        this.f38762i = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        c cVar = new c(this.f38760g, this.f38761h, this.f38762i, dVar);
        cVar.f38759f = obj;
        return cVar;
    }

    @Override // ym0.p
    public final Object invoke(h0<a> h0Var, qm0.d<? super y> dVar) {
        return ((c) create(h0Var, dVar)).invokeSuspend(y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010d A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.ecg.pdf.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
