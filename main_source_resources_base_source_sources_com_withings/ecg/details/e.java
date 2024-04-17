package com.withings.ecg.details;

import android.app.Application;
import androidx.lifecycle.LiveData;
import com.withings.ecg.model.HeartSignalMeasurement;
import com.withings.ecg.model.HeartSignalMeasurementKt;
import com.withings.ecg.model.HeartSignalRepository;
import com.withings.ecg.model.Signal;
import com.withings.library.ecg.diag.DiagnosticResult;
import com.withings.library.ecg.diag.Qrs;
import java.util.ArrayList;
/* compiled from: EcgDebugScreenActivity.kt */
/* loaded from: classes3.dex */
public final class e extends androidx.lifecycle.b {

    /* renamed from: a  reason: collision with root package name */
    private final HeartSignalRepository f38173a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveData<HeartSignalMeasurement> f38174b;

    /* renamed from: c  reason: collision with root package name */
    private final androidx.lifecycle.j0 f38175c;

    /* renamed from: d  reason: collision with root package name */
    private final androidx.lifecycle.j0 f38176d;

    /* compiled from: EcgDebugScreenActivity.kt */
    /* loaded from: classes3.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.l<DiagnosticResult, String> {
        a() {
            super(1);
        }

        @Override // ym0.l
        public final String invoke(DiagnosticResult diagnosticResult) {
            Long l5;
            String str;
            String str2;
            Signal signal;
            DiagnosticResult diagnosticResult2 = diagnosticResult;
            HeartSignalMeasurement heartSignalMeasurement = (HeartSignalMeasurement) e.this.f38174b.getValue();
            String str3 = null;
            if (heartSignalMeasurement != null && (signal = heartSignalMeasurement.getSignal()) != null) {
                l5 = signal.getSignalId();
            } else {
                l5 = null;
            }
            if (diagnosticResult2 != null) {
                String str4 = "Diagnostic : " + diagnosticResult2.getAfibStatus() + "\nHR : " + diagnosticResult2.getHeartRate() + "\n\n";
                int[] featuresForDebug = diagnosticResult2.getFeaturesForDebug();
                int i11 = 0;
                if (featuresForDebug != null) {
                    ArrayList arrayList = new ArrayList(featuresForDebug.length);
                    int length = featuresForDebug.length;
                    int i12 = 0;
                    int i13 = 0;
                    while (i12 < length) {
                        arrayList.add(i13 + " -> " + featuresForDebug[i12]);
                        i12++;
                        i13++;
                    }
                    str = kotlin.collections.x.R(arrayList, "\n", null, null, null, 62);
                } else {
                    str = null;
                }
                String b10 = androidx.activity.a0.b("Features :\n\n", str);
                int[] probsForDebug = diagnosticResult2.getProbsForDebug();
                if (probsForDebug != null) {
                    ArrayList arrayList2 = new ArrayList(probsForDebug.length);
                    int length2 = probsForDebug.length;
                    int i14 = 0;
                    int i15 = 0;
                    while (i14 < length2) {
                        arrayList2.add(i15 + " -> " + probsForDebug[i14]);
                        i14++;
                        i15++;
                    }
                    str2 = kotlin.collections.x.R(arrayList2, "\n", null, null, null, 62);
                } else {
                    str2 = null;
                }
                String b11 = androidx.activity.a0.b("\n\nProbabilities :\n\n", str2);
                Qrs[] qrsForDebug = diagnosticResult2.getQrsForDebug();
                if (qrsForDebug != null) {
                    ArrayList arrayList3 = new ArrayList(qrsForDebug.length);
                    int length3 = qrsForDebug.length;
                    int i16 = 0;
                    while (i11 < length3) {
                        Qrs qrs = qrsForDebug[i11];
                        arrayList3.add(i16 + " -> (" + qrs.getStart() + ", " + qrs.getWidth() + ")");
                        i11++;
                        i16++;
                    }
                    str3 = kotlin.collections.x.R(arrayList3, "\n", null, null, null, 62);
                }
                str3 = androidx.camera.camera2.internal.p2.c(str4, b10, b11, androidx.activity.a0.b("\n\nQrs (start, width) :\n\n", str3));
            }
            return "Signal id : " + l5 + "\n" + str3;
        }
    }

    /* compiled from: EcgDebugScreenActivity.kt */
    /* loaded from: classes3.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.l<DiagnosticResult, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f38178a = new kotlin.jvm.internal.w(1);

        @Override // ym0.l
        public final Boolean invoke(DiagnosticResult diagnosticResult) {
            boolean z5;
            if (diagnosticResult == null) {
                z5 = true;
            } else {
                z5 = false;
            }
            return Boolean.valueOf(z5);
        }
    }

    /* compiled from: EcgDebugScreenActivity.kt */
    /* loaded from: classes3.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.l<HeartSignalMeasurement, DiagnosticResult> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Application f38179a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Application application) {
            super(1);
            this.f38179a = application;
        }

        @Override // ym0.l
        public final DiagnosticResult invoke(HeartSignalMeasurement heartSignalMeasurement) {
            HeartSignalMeasurement heartSignalMeasurement2 = heartSignalMeasurement;
            if (heartSignalMeasurement2 != null) {
                return HeartSignalMeasurementKt.computeEcgDiagnostic(heartSignalMeasurement2, this.f38179a);
            }
            return null;
        }
    }

    public e(Application application, HeartSignalRepository heartSignalRepository, long j5) {
        super(application);
        this.f38173a = heartSignalRepository;
        LiveData<HeartSignalMeasurement> heartSignalLiveData = heartSignalRepository.getHeartSignalLiveData(j5);
        this.f38174b = heartSignalLiveData;
        androidx.lifecycle.j0 b10 = androidx.lifecycle.e1.b(heartSignalLiveData, new c(application));
        this.f38175c = androidx.lifecycle.e1.b(b10, new a());
        this.f38176d = androidx.lifecycle.e1.b(b10, b.f38178a);
    }

    public final androidx.lifecycle.j0 g0() {
        return this.f38175c;
    }

    public final androidx.lifecycle.j0 i0() {
        return this.f38176d;
    }
}
