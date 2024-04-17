package com.withings.medicalreport.ui;

import com.withings.medicalreport.ui.MedicalReportActivity;
/* compiled from: Activity.kt */
/* loaded from: classes4.dex */
public final class r extends kotlin.jvm.internal.w implements ym0.a<String> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MedicalReportActivity.f f42271a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(MedicalReportActivity.f fVar) {
        super(0);
        this.f42271a = fVar;
    }

    @Override // ym0.a
    public final String invoke() {
        return com.withings.wiscale2.device.hwa08.postinstall.b0.I(this.f42271a.f42190b, "EXTRA_FIRSTNAME");
    }
}
