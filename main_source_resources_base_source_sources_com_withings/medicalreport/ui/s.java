package com.withings.medicalreport.ui;

import com.withings.medicalreport.ui.MedicalReportActivity;
/* compiled from: Activity.kt */
/* loaded from: classes4.dex */
public final class s extends kotlin.jvm.internal.w implements ym0.a<String> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MedicalReportActivity.g f42272a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(MedicalReportActivity.g gVar) {
        super(0);
        this.f42272a = gVar;
    }

    @Override // ym0.a
    public final String invoke() {
        return com.withings.wiscale2.device.hwa08.postinstall.b0.I(this.f42272a.f42192b, "EXTRA_LASTNAME");
    }
}
