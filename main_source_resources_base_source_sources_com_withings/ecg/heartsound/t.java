package com.withings.ecg.heartsound;

import com.withings.ecg.model.HeartDiagnosticUI;
import com.withings.ecg.model.HeartSignalMeasurement;
/* compiled from: HeartSoundDetailsFragment.kt */
/* loaded from: classes3.dex */
final class t extends kotlin.jvm.internal.w implements ym0.l<HeartSignalMeasurement, nm0.j<HeartDiagnosticUI, HeartSignalMeasurement>> {

    /* renamed from: a  reason: collision with root package name */
    public static final t f38532a = new kotlin.jvm.internal.w(1);

    @Override // ym0.l
    public final nm0.j<HeartDiagnosticUI, HeartSignalMeasurement> invoke(HeartSignalMeasurement heartSignalMeasurement) {
        HeartSignalMeasurement heartSignalMeasurement2 = heartSignalMeasurement;
        return new nm0.j<>(HeartDiagnosticUI.Companion.get(2, heartSignalMeasurement2.getDiagnostic()), heartSignalMeasurement2);
    }
}
