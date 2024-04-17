package com.withings.ecg.details;

import com.withings.ecg.core.HeartDiagnostic;
import com.withings.ecg.model.HeartDiagnosticUI;
import com.withings.ecg.model.HeartDiagnosticUIKt;
import com.withings.ecg.model.HeartSignalMeasurement;
import com.withings.ecg.review.EcgReviewStatusValue;
/* compiled from: EcgInReviewViewModel.kt */
/* loaded from: classes3.dex */
final class h1 extends kotlin.jvm.internal.w implements ym0.q<xw.p<HeartSignalMeasurement, Boolean, rq.b>, HeartSignalMeasurement, Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    public static final h1 f38233a = new kotlin.jvm.internal.w(3);

    @Override // ym0.q
    public final nm0.y invoke(xw.p<HeartSignalMeasurement, Boolean, rq.b> pVar, HeartSignalMeasurement heartSignalMeasurement, Boolean bool) {
        int i11;
        Integer valueOf;
        EcgReviewStatusValue ecgReviewStatusValue;
        Integer attrib;
        xw.p<HeartSignalMeasurement, Boolean, rq.b> livedata = pVar;
        HeartSignalMeasurement measurement = heartSignalMeasurement;
        boolean booleanValue = bool.booleanValue();
        kotlin.jvm.internal.u.j(livedata, "livedata");
        kotlin.jvm.internal.u.j(measurement, "measurement");
        HeartSignalMeasurement.Measure measure = (HeartSignalMeasurement.Measure) kotlin.collections.x.K(measurement.getMeasures());
        if (measure != null && (attrib = measure.getAttrib()) != null) {
            i11 = attrib.intValue();
        } else {
            i11 = 0;
        }
        if (!androidx.compose.foundation.lazy.layout.d.g()) {
            valueOf = measurement.getDiagnostic();
        } else {
            valueOf = Integer.valueOf(HeartDiagnosticUIKt.toUI(HeartDiagnostic.f37985b).getValue());
        }
        HeartDiagnosticUI heartDiagnosticUI = HeartDiagnosticUI.Companion.get(1, valueOf);
        if (bj0.d.p(Integer.valueOf(i11))) {
            if (bj0.d.o(Integer.valueOf(i11))) {
                if (heartDiagnosticUI.getHeartDiagnostic() == HeartDiagnostic.f37986c) {
                    if (booleanValue) {
                        ecgReviewStatusValue = EcgReviewStatusValue.f38858e;
                    } else {
                        ecgReviewStatusValue = EcgReviewStatusValue.f38860g;
                    }
                } else {
                    ecgReviewStatusValue = EcgReviewStatusValue.f38858e;
                }
            } else {
                ecgReviewStatusValue = EcgReviewStatusValue.f38857d;
            }
        } else {
            ecgReviewStatusValue = EcgReviewStatusValue.f38854a;
        }
        livedata.setValue(new rq.b(ecgReviewStatusValue, (rq.a) null, (String) null, 14));
        return nm0.y.f85009a;
    }
}
