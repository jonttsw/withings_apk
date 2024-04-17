package com.withings.ecg.pdf;

import ah.z;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.health.platform.client.proto.x;
import com.itextpdf.text.pdf.n1;
import com.withings.core.utils.WithingsFileProvider;
import com.withings.ecg.details.b2;
import com.withings.ecg.graph.EcgEntry;
import com.withings.ecg.model.HeartDiagnosticUI;
import com.withings.ecg.model.HeartSignalMeasurement;
import com.withings.ecg.model.HeartSignalMeasurementKt;
import com.withings.ecg.model.SignalMeta;
import com.withings.ecg.pdf.b;
import com.withings.ecg.pdf.f;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.ecg.EcgLeadType;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import m0.t;
import nm0.y;
import org.joda.time.DateTime;
import ze.w;
/* compiled from: SixLeadEcgPDF.kt */
/* loaded from: classes3.dex */
public final class r extends x {

    /* renamed from: a  reason: collision with root package name */
    private final jq.b f38832a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<AppCompatActivity> f38833b;

    /* renamed from: c  reason: collision with root package name */
    private final File f38834c;

    /* renamed from: d  reason: collision with root package name */
    private int f38835d;

    /* renamed from: e  reason: collision with root package name */
    private int f38836e;

    /* renamed from: f  reason: collision with root package name */
    private List<? extends Map<EcgLeadType, ? extends List<EcgEntry>>> f38837f;

    public r(AppCompatActivity appCompatActivity, jq.b bVar) {
        this.f38832a = bVar;
        this.f38833b = new WeakReference<>(appCompatActivity);
        this.f38834c = appCompatActivity.getCacheDir();
    }

    public static final Object h(kq.e eVar, SignalMeta signalMeta, r rVar, qm0.d dVar, DateTime dateTime) {
        Context applicationContext;
        int i11 = rVar.f38836e + 1;
        rVar.f38836e = i11;
        if (i11 < rVar.f38835d) {
            Object withContext = BuildersKt.withContext(Dispatchers.getMain(), new o(eVar, signalMeta, rVar, null, dateTime), dVar);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            if (withContext != coroutineSingletons) {
                withContext = y.f85009a;
            }
            if (withContext != coroutineSingletons) {
                return y.f85009a;
            }
            return withContext;
        }
        WeakReference<AppCompatActivity> weakReference = rVar.f38833b;
        AppCompatActivity appCompatActivity = weakReference.get();
        if (appCompatActivity != null && (applicationContext = appCompatActivity.getApplicationContext()) != null) {
            ze.y yVar = w.f110518a;
            ze.i iVar = new ze.i(yVar);
            File file = new File(rVar.f38834c, ConstantsWs.JSON_SESSION_KEY_ECG);
            file.mkdirs();
            File file2 = new File(file, androidx.fragment.app.o.d("ecg-signal-", dateTime.toString("MM-dd-yyyy_hh:mm_a"), ".pdf"));
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                n1.z(iVar, fileOutputStream);
                iVar.a();
                int i12 = rVar.f38835d;
                for (int i13 = 0; i13 < i12; i13++) {
                    iVar.b();
                    iVar.e(0.0f, 0.0f, 0.0f, 0.0f);
                    com.itextpdf.text.c k02 = com.itextpdf.text.c.k0(wm0.b.c(new File(file, "doctor-ecg-" + i13 + ".jpg")));
                    k02.N0(0.0f, 0.0f);
                    k02.O(0.0f);
                    k02.M0(yVar);
                    iVar.d(k02);
                }
                iVar.close();
                y yVar2 = y.f85009a;
                ge0.d.a(fileOutputStream, null);
                ch.h m11 = ((f.a) ah.o.c(applicationContext, f.a.class)).d().m();
                Context context = eVar.a().getContext();
                u.i(context, "getContext(...)");
                int i14 = WithingsFileProvider.f35394f;
                Context context2 = eVar.a().getContext();
                u.i(context2, "getContext(...)");
                Intent addFlags = ((z) m11).b(context, WithingsFileProvider.a.a(context2, file2), false, null).addFlags(1);
                u.i(addFlags, "addFlags(...)");
                eVar.a().getContext().startActivity(addFlags);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ge0.d.a(fileOutputStream, th2);
                    throw th3;
                }
            }
        }
        eVar.f78091d.invalidate();
        AppCompatActivity appCompatActivity2 = weakReference.get();
        if (appCompatActivity2 != null) {
            appCompatActivity2.finish();
        }
        return y.f85009a;
    }

    public static final Object i(kq.e eVar, SignalMeta signalMeta, r rVar, qm0.d dVar, DateTime dateTime) {
        rVar.getClass();
        Object withContext = BuildersKt.withContext(Dispatchers.getMain(), new o(eVar, signalMeta, rVar, null, dateTime), dVar);
        if (withContext != CoroutineSingletons.f76214a) {
            return y.f85009a;
        }
        return withContext;
    }

    @Override // androidx.health.platform.client.proto.x
    public final void c(FrameLayout frameLayout, a ecgPDFData) {
        int i11;
        String str;
        Integer num;
        String f11;
        int i12;
        u.j(ecgPDFData, "ecgPDFData");
        kq.e b10 = kq.e.b(LayoutInflater.from(frameLayout.getContext()), frameLayout);
        User e11 = ecgPDFData.e();
        b10.f78096i.setText(e11.o());
        String string = b10.a().getContext().getString(C1987R.string.vo2MaxDetails_comparison_yearsOld_formatted, String.valueOf(e11.d()));
        u.i(string, "getString(...)");
        Context context = b10.a().getContext();
        if (e11.p() == 0) {
            i11 = C1987R.string._WTI_MALE_;
        } else {
            i11 = C1987R.string._WTI_FEMALE_;
        }
        String string2 = context.getString(i11);
        u.i(string2, "getString(...)");
        b10.f78095h.setText(b10.a().getContext().getString(C1987R.string.ecg_pdf_user_caracteristics_wbs08, string, string2));
        Integer heartRate = ecgPDFData.b().getHeartRate();
        if (heartRate != null && heartRate.intValue() > 0) {
            str = String.valueOf(ecgPDFData.b().getHeartRate());
        } else {
            str = "-";
        }
        String string3 = b10.a().getContext().getString(C1987R.string.ecg_detail_pdf_heartRateMean, str);
        u.i(string3, "getString(...)");
        b.a a11 = ecgPDFData.a();
        if (a11 != null) {
            String string4 = b10.a().getContext().getString(C1987R.string.ecg_detail_pdf_additionalInfo, a11.b(), a11.a(), a11.c(), a11.d());
            u.i(string4, "getString(...)");
            String str2 = string3 + " ● " + string4;
            if (str2 != null) {
                string3 = str2;
            }
        }
        b10.f78089b.setText(string3);
        HeartSignalMeasurement b11 = ecgPDFData.b();
        HeartDiagnosticUI heartDiagnosticUI = HeartDiagnosticUI.Companion.get(1, b11.getDiagnostic());
        jq.e a12 = this.f38832a.a(b11.getDeviceModel());
        int value = heartDiagnosticUI.getValue();
        Integer classification = HeartSignalMeasurementKt.getClassification(b11);
        HeartSignalMeasurement.Measure diagnosticMeasure = HeartSignalMeasurementKt.getDiagnosticMeasure(b11);
        if (diagnosticMeasure != null) {
            num = diagnosticMeasure.getAlgoVersion();
        } else {
            num = null;
        }
        String string5 = b10.a().getContext().getString(a12.a(1, value, classification, num).e());
        TextView textView = b10.f78092e;
        textView.setText(string5);
        Context context2 = textView.getContext();
        u.i(context2, "getContext(...)");
        textView.setCompoundDrawablesWithIntrinsicBounds(y70.a.a(C1987R.drawable.ic_circle_black_16dp, context2, heartDiagnosticUI.getColorRes()), (Drawable) null, (Drawable) null, (Drawable) null);
        HeartSignalMeasurement b12 = ecgPDFData.b();
        String abstractDateTime = b12.getTimestamp().toString(b10.a().getContext().getString(C1987R.string._DATE_EEEE_MMMM_D_));
        DateTime timestamp = b12.getTimestamp();
        Context context3 = b10.a().getContext();
        u.i(context3, "getContext(...)");
        f11 = b50.b.f(timestamp, context3, "hh:mm a", "HH:mm");
        b10.f78094g.setText(b10.a().getContext().getString(C1987R.string.ecg_detail_pdf_DateCreation, abstractDateTime, f11, String.valueOf(HeartSignalMeasurementKt.getDurationSeconds(b12.getSignal().getMeta())), ""));
        int deviceModel = ecgPDFData.b().getDeviceModel();
        if (deviceModel != 10) {
            if (deviceModel != 44) {
                if (deviceModel != 91) {
                    switch (deviceModel) {
                        case 93:
                        case 94:
                        case 95:
                            i12 = C1987R.string.ecg_detail_pdf_characteristics_hwa09;
                            break;
                        default:
                            i12 = C1987R.string.ecg_detail_pdf_characteristics_unknownDevice;
                            break;
                    }
                } else {
                    i12 = C1987R.string.ecg_detail_pdf_characteristics_hwa08;
                }
            } else {
                i12 = C1987R.string.ecg_detail_pdf_characteristics_wpm04;
            }
        } else {
            i12 = C1987R.string.ecg_detail_pdf_characteristics_wbs08;
        }
        Context context4 = b10.a().getContext();
        String str3 = androidx.compose.foundation.lazy.layout.d.f4447f;
        if (str3 != null) {
            b10.f78090c.setText(context4.getString(i12, str3));
            b2 d11 = ecgPDFData.d();
            AppCompatActivity appCompatActivity = this.f38833b.get();
            if (appCompatActivity != null) {
                BuildersKt__Builders_commonKt.launch$default(t.l(appCompatActivity), null, null, new q(d11, this, b10, null), 3, null);
                return;
            }
            return;
        }
        u.s("versionName");
        throw null;
    }
}
