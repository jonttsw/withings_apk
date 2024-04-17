package com.withings.ecg.details;

import com.withings.ecg.model.HeartSignalMeasurement;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EcgDetailsFragment.kt */
/* loaded from: classes3.dex */
public final class r0 extends kotlin.jvm.internal.w implements ym0.l<HeartSignalMeasurement, String> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ jm.a f38302a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(jm.a aVar) {
        super(1);
        this.f38302a = aVar;
    }

    @Override // ym0.l
    public final String invoke(HeartSignalMeasurement heartSignalMeasurement) {
        int i11;
        Integer attrib;
        HeartSignalMeasurement heartSignalMeasurement2 = heartSignalMeasurement;
        Integer heartRate = heartSignalMeasurement2.getHeartRate();
        HeartSignalMeasurement.Measure measure = (HeartSignalMeasurement.Measure) kotlin.collections.x.K(heartSignalMeasurement2.getMeasures());
        if (measure != null && (attrib = measure.getAttrib()) != null) {
            i11 = attrib.intValue();
        } else {
            i11 = -1;
        }
        if (heartRate != null && heartRate.intValue() > 0 && !bj0.d.p(Integer.valueOf(i11))) {
            return this.f38302a.f(heartRate.intValue(), 11);
        }
        return null;
    }
}
