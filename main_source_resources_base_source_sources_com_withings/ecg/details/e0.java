package com.withings.ecg.details;

import com.withings.ecg.core.HeartDiagnostic;
import com.withings.ecg.details.b0;
import com.withings.ecg.model.HeartDiagnosticUI;
import com.withings.ecg.model.HeartDiagnosticUIKt;
import com.withings.ecg.model.HeartSignalMeasurement;
import com.withings.ecg.model.HeartSignalMeasurementKt;
import com.withings.wiscale2.C1987R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EcgDetailsFragment.kt */
/* loaded from: classes3.dex */
public final class e0 extends kotlin.jvm.internal.w implements ym0.q<xw.p<HeartSignalMeasurement, Boolean, b0.a>, HeartSignalMeasurement, Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b0 f38180a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(b0 b0Var) {
        super(3);
        this.f38180a = b0Var;
    }

    @Override // ym0.q
    public final nm0.y invoke(xw.p<HeartSignalMeasurement, Boolean, b0.a> pVar, HeartSignalMeasurement heartSignalMeasurement, Boolean bool) {
        int i11;
        Integer valueOf;
        jq.b bVar;
        Integer num;
        jq.d dVar;
        int i12;
        b0.a aVar;
        Integer attrib;
        Integer attrib2;
        xw.p<HeartSignalMeasurement, Boolean, b0.a> livedata = pVar;
        HeartSignalMeasurement measurement = heartSignalMeasurement;
        boolean booleanValue = bool.booleanValue();
        kotlin.jvm.internal.u.j(livedata, "livedata");
        kotlin.jvm.internal.u.j(measurement, "measurement");
        HeartSignalMeasurement.Measure measure = (HeartSignalMeasurement.Measure) kotlin.collections.x.K(measurement.getMeasures());
        if (measure != null && (attrib2 = measure.getAttrib()) != null) {
            i11 = attrib2.intValue();
        } else {
            i11 = 0;
        }
        int i13 = i11;
        if (!androidx.compose.foundation.lazy.layout.d.g()) {
            valueOf = measurement.getDiagnostic();
        } else {
            valueOf = Integer.valueOf(HeartDiagnosticUIKt.toUI(HeartDiagnostic.f37985b).getValue());
        }
        HeartDiagnosticUI.Companion companion = HeartDiagnosticUI.Companion;
        HeartDiagnosticUI heartDiagnosticUI = companion.get(1, valueOf);
        if (!bj0.d.p(Integer.valueOf(i13))) {
            bVar = this.f38180a.f38102f;
            jq.e a11 = bVar.a(measurement.getDeviceModel());
            int value = heartDiagnosticUI.getValue();
            Integer classification = HeartSignalMeasurementKt.getClassification(measurement);
            HeartSignalMeasurement.Measure diagnosticMeasure = HeartSignalMeasurementKt.getDiagnosticMeasure(measurement);
            if (diagnosticMeasure != null) {
                num = diagnosticMeasure.getAlgoVersion();
            } else {
                num = null;
            }
            jq.d a12 = a11.a(1, value, classification, num);
            dVar = jq.a.f74740a;
            if (kotlin.jvm.internal.u.e(a12, dVar)) {
                heartDiagnosticUI = HeartDiagnosticUI.copy$default(heartDiagnosticUI, null, 0, 0, C1987R.color.statusUndefined, C1987R.drawable.ic_help2_white_24dp, null, 39, null);
            }
            HeartDiagnosticUI heartDiagnosticUI2 = heartDiagnosticUI;
            boolean o11 = bj0.d.o(Integer.valueOf(i13));
            boolean z5 = kotlin.collections.x.z(kotlin.collections.x.W(12, 13), Integer.valueOf(i13));
            HeartSignalMeasurement.Measure measure2 = (HeartSignalMeasurement.Measure) kotlin.collections.x.K(measurement.getMeasures());
            if (measure2 != null && (attrib = measure2.getAttrib()) != null) {
                i12 = attrib.intValue();
            } else {
                i12 = -1;
            }
            aVar = new b0.a(heartDiagnosticUI2, o11, z5, i12, a12.e(), a12.c(), a12.b(), a12.f());
        } else {
            boolean o12 = bj0.d.o(Integer.valueOf(i13));
            int i14 = C1987R.string.status_secondary_take_another_ECG;
            if (o12) {
                if (heartDiagnosticUI.getHeartDiagnostic() == HeartDiagnostic.f37986c) {
                    HeartDiagnosticUI heartDiagnosticUI3 = companion.get(1, measurement.getDiagnostic());
                    if (booleanValue) {
                        i14 = C1987R.string.status_secondary_resultsSoon;
                    }
                    aVar = new b0.a(heartDiagnosticUI3, true, false, i13, C1987R.string.status_signal_too_noisy, Integer.valueOf(i14), C1987R.string.ecg_review_reviewFailed_description, C1987R.string.ecg_detail_staticUnderstandEcgMeasurementUrl);
                } else {
                    aVar = new b0.a(companion.get(1, measurement.getDiagnostic()), true, false, i13, C1987R.string.status_inReview, Integer.valueOf((int) C1987R.string.status_secondary_resultsSoon), C1987R.string.ecg_review_inReview_description, C1987R.string.ecg_detail_staticUnderstandEcgMeasurementUrl);
                }
            } else {
                aVar = new b0.a(companion.get(1, measurement.getDiagnostic()), false, true, i13, C1987R.string.status_reviewFailed, Integer.valueOf((int) C1987R.string.status_secondary_take_another_ECG), C1987R.string.ecg_review_reviewFailed_description, C1987R.string.ecg_detail_staticUnderstandEcgMeasurementUrl);
            }
        }
        livedata.setValue(aVar);
        return nm0.y.f85009a;
    }
}
