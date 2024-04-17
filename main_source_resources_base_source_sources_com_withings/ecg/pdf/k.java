package com.withings.ecg.pdf;

import com.withings.ecg.pdf.PDFGenerationActivity;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import kotlin.jvm.internal.w;
/* compiled from: Activity.kt */
/* loaded from: classes3.dex */
public final class k extends w implements ym0.a<Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ PDFGenerationActivity.c f38800a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(PDFGenerationActivity.c cVar) {
        super(0);
        this.f38800a = cVar;
    }

    @Override // ym0.a
    public final Long invoke() {
        return Long.valueOf(b0.E(this.f38800a.f38731b, "ecgId"));
    }
}
