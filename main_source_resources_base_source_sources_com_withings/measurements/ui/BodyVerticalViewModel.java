package com.withings.measurements.ui;

import com.withings.measurement.model.MeasurementsVertical;
import fz.a;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: HealthVerticalViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/measurements/ui/BodyVerticalViewModel;", "Lcom/withings/measurements/ui/o1;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class BodyVerticalViewModel extends o1 {

    /* renamed from: i  reason: collision with root package name */
    private final hz.c f41912i;

    /* renamed from: j  reason: collision with root package name */
    private final hz.d f41913j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public BodyVerticalViewModel(iz.c measurementItemsByVerticalRepository, rt.a aVar, n20.b bVar, oz.g gVar, androidx.lifecycle.u0 savedStateHandle, oz.h hVar, rt.c cVar, hz.c cVar2, hz.d dVar) {
        super(measurementItemsByVerticalRepository, aVar, cVar, savedStateHandle, MeasurementsVertical.f41863b, bVar, gVar, hVar);
        kotlin.jvm.internal.u.j(measurementItemsByVerticalRepository, "measurementItemsByVerticalRepository");
        kotlin.jvm.internal.u.j(savedStateHandle, "savedStateHandle");
        this.f41912i = cVar2;
        this.f41913j = dVar;
    }

    /* JADX WARN: Type inference failed for: r8v6, types: [ym0.q, kotlin.coroutines.jvm.internal.i] */
    @Override // com.withings.measurements.ui.o1
    public final Flow g0(pt.d dVar, pt.d dVar2, ArrayList arrayList) {
        Double d11;
        Double d12;
        Object obj;
        Double d13;
        Double d14;
        Object obj2;
        pt.c d15 = dVar2.d();
        pt.c d16 = dVar.d();
        boolean z5 = !arrayList.contains(gz.j1.f69727a);
        this.f41912i.getClass();
        if (d15 != null) {
            d11 = d15.a();
        } else {
            d11 = null;
        }
        if (d16 != null) {
            d12 = d16.a();
        } else {
            d12 = null;
        }
        if (!z5) {
            obj = null;
        } else if (d11 != null && d12 != null) {
            obj = new a.c.b(d11.doubleValue() - d12.doubleValue());
        } else {
            obj = a.c.C0954a.f68006a;
        }
        Flow flowOf = FlowKt.flowOf(obj);
        pt.c d17 = dVar2.d();
        pt.c d18 = dVar.d();
        boolean z11 = !arrayList.contains(gz.e.f69672a);
        this.f41913j.getClass();
        if (d17 != null) {
            d13 = d17.b();
        } else {
            d13 = null;
        }
        if (d18 != null) {
            d14 = d18.b();
        } else {
            d14 = null;
        }
        if (!z11) {
            obj2 = null;
        } else if (d14 != null && d13 != null) {
            obj2 = new a.d.b(d13.doubleValue() - d14.doubleValue());
        } else {
            obj2 = a.d.C0955a.f68009a;
        }
        return FlowKt.combine(flowOf, FlowKt.flowOf(obj2), new kotlin.coroutines.jvm.internal.i(3, null));
    }
}
