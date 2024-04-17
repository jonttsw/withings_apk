package com.withings.ecg.heartsound;

import android.content.Context;
import android.view.View;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.ecg.model.HeartDiagnosticUI;
import com.withings.ecg.model.HeartDiagnosticUIKt;
import com.withings.ecg.model.HeartSignalMeasurement;
import com.withings.ecg.model.HeartSignalMeasurementKt;
import com.withings.wiscale2.C1987R;
/* compiled from: HeartSoundDetailsFragment.kt */
/* loaded from: classes3.dex */
final class i extends kotlin.jvm.internal.w implements ym0.l<nm0.j<? extends HeartDiagnosticUI, HeartSignalMeasurement>, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f38475a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(d dVar) {
        super(1);
        this.f38475a = dVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(nm0.j<? extends HeartDiagnosticUI, HeartSignalMeasurement> jVar) {
        Integer num;
        nm0.j<? extends HeartDiagnosticUI, HeartSignalMeasurement> jVar2 = jVar;
        kotlin.jvm.internal.u.j(jVar2, "<name for destructuring parameter 0>");
        final HeartDiagnosticUI a11 = jVar2.a();
        HeartSignalMeasurement b10 = jVar2.b();
        kotlin.jvm.internal.u.g(b10);
        Integer classification = HeartSignalMeasurementKt.getClassification(b10);
        int deviceModel = b10.getDeviceModel();
        HeartSignalMeasurement.Measure diagnosticMeasure = HeartSignalMeasurementKt.getDiagnosticMeasure(b10);
        if (diagnosticMeasure != null) {
            num = diagnosticMeasure.getAlgoVersion();
        } else {
            num = null;
        }
        final d dVar = this.f38475a;
        jq.d x12 = d.x1(dVar, a11, classification, deviceModel, num);
        dVar.D1().f78071c.x(C1987R.drawable.ic_circle_black_12dp, a11.getColorRes());
        dVar.D1().f78071c.setLabel(dVar.getString(x12.e()));
        dVar.D1().f78071c.setOnClickListener(new View.OnClickListener() { // from class: com.withings.ecg.heartsound.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d this$0 = d.this;
                kotlin.jvm.internal.u.j(this$0, "this$0");
                HeartDiagnosticUI diagnostic = a11;
                kotlin.jvm.internal.u.j(diagnostic, "$diagnostic");
                HMWebActivity.a aVar = HMWebActivity.f35395c;
                Context context = view.getContext();
                kotlin.jvm.internal.u.i(context, "getContext(...)");
                String string = this$0.getString(HeartDiagnosticUIKt.getStaticUrl(diagnostic, false));
                kotlin.jvm.internal.u.i(string, "getString(...)");
                this$0.startActivity(aVar.c(context, null, string));
            }
        });
        dVar.D1().f78070b.setButtonClickListener(new h(dVar, a11));
        dVar.D1().f78070b.setMessage(x12.b());
        return nm0.y.f85009a;
    }
}
