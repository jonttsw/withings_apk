package com.withings.ecg.pdf;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import com.withings.ecg.model.HeartSignalMeasurement;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.Dispatchers;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PDFGenerationActivity.kt */
/* loaded from: classes3.dex */
public final class d extends w implements ym0.l<HeartSignalMeasurement, LiveData<a>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AppCompatActivity f38763a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ b f38764b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(PDFGenerationActivity pDFGenerationActivity, b bVar) {
        super(1);
        this.f38763a = pDFGenerationActivity;
        this.f38764b = bVar;
    }

    @Override // ym0.l
    public final LiveData<a> invoke(HeartSignalMeasurement heartSignalMeasurement) {
        return androidx.lifecycle.h.a(Dispatchers.getIO(), new c(heartSignalMeasurement, this.f38763a, this.f38764b, null), 2);
    }
}
