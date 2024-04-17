package com.withings.ecg.details;

import com.withings.ecg.details.b0;
import com.withings.ecg.model.HeartSignalMeasurement;
import com.withings.ecg.model.Signal;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EcgDetailsFragment.kt */
/* loaded from: classes3.dex */
public final class q0 extends kotlin.jvm.internal.w implements ym0.l<nm0.j<HeartSignalMeasurement, b0.a>, b0.b> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b0 f38294a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(b0 b0Var) {
        super(1);
        this.f38294a = b0Var;
    }

    @Override // ym0.l
    public final b0.b invoke(nm0.j<HeartSignalMeasurement, b0.a> jVar) {
        List<HeartSignalMeasurement.Measure> measures;
        HeartSignalMeasurement.Measure measure;
        Signal signal;
        String signalPath;
        HeartSignalMeasurement a11 = jVar.a();
        boolean z5 = false;
        if (a11 != null && (signal = a11.getSignal()) != null && (signalPath = signal.getSignalPath()) != null && signalPath.length() > 0) {
            z5 = true;
        }
        Integer num = null;
        if (!z5) {
            b0 b0Var = this.f38294a;
            b0Var.getClass();
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(b0Var), Dispatchers.getIO(), null, new f0(b0Var, null), 2, null);
        }
        if (a11 != null && (measures = a11.getMeasures()) != null && (measure = (HeartSignalMeasurement.Measure) kotlin.collections.x.K(measures)) != null) {
            num = measure.getAttrib();
        }
        return new b0.b(z5, bj0.d.p(num));
    }
}
