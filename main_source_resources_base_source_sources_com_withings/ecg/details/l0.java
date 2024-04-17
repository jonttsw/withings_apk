package com.withings.ecg.details;

import android.content.Context;
import com.withings.ecg.graph.EcgEntry;
import com.withings.ecg.model.HeartSignalMeasurement;
import java.util.List;
/* compiled from: EcgDetailsFragment.kt */
/* loaded from: classes3.dex */
final class l0 extends kotlin.jvm.internal.w implements ym0.l<List<EcgEntry>, o2> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b0 f38255a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ HeartSignalMeasurement f38256b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(b0 b0Var, HeartSignalMeasurement heartSignalMeasurement) {
        super(1);
        this.f38255a = b0Var;
        this.f38256b = heartSignalMeasurement;
    }

    @Override // ym0.l
    public final o2 invoke(List<EcgEntry> list) {
        List<EcgEntry> signal = list;
        kotlin.jvm.internal.u.j(signal, "signal");
        b0 b0Var = this.f38255a;
        Context context = b0Var.f38097a;
        Context context2 = b0Var.f38097a;
        kotlin.jvm.internal.u.j(context2, "<this>");
        HeartSignalMeasurement ecg = this.f38256b;
        kotlin.jvm.internal.u.i(ecg, "$ecg");
        return new o2(ecg, signal, wq.a.n(wq.a.g(context2).x, context) / 25.0f);
    }
}
