package com.withings.measurements.ui;

import com.withings.measurement.model.MeasurementsVertical;
import fz.a;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: HealthVerticalViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/measurements/ui/ActivityVerticalViewModel;", "Lcom/withings/measurements/ui/o1;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ActivityVerticalViewModel extends o1 {

    /* renamed from: i  reason: collision with root package name */
    private final hz.l f41910i;

    /* renamed from: j  reason: collision with root package name */
    private final hz.a f41911j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public ActivityVerticalViewModel(iz.c measurementItemsByVerticalRepository, rt.a aVar, androidx.lifecycle.u0 savedStateHandle, n20.b bVar, oz.g gVar, oz.h hVar, rt.c cVar, hz.l lVar, hz.a aVar2) {
        super(measurementItemsByVerticalRepository, aVar, cVar, savedStateHandle, MeasurementsVertical.f41862a, bVar, gVar, hVar);
        kotlin.jvm.internal.u.j(measurementItemsByVerticalRepository, "measurementItemsByVerticalRepository");
        kotlin.jvm.internal.u.j(savedStateHandle, "savedStateHandle");
        this.f41910i = lVar;
        this.f41911j = aVar2;
    }

    /* JADX WARN: Type inference failed for: r9v6, types: [ym0.q, kotlin.coroutines.jvm.internal.i] */
    @Override // com.withings.measurements.ui.o1
    public final Flow g0(pt.d dVar, pt.d dVar2, ArrayList arrayList) {
        Double d11;
        Double d12;
        Object obj;
        Double d13;
        Double d14;
        Object obj2;
        pt.b b10 = dVar2.b();
        pt.b b11 = dVar.b();
        gz.b1 b1Var = gz.b1.f69647a;
        boolean z5 = !arrayList.contains(b1Var);
        this.f41910i.getClass();
        if (b10 != null) {
            d11 = b10.c();
        } else {
            d11 = null;
        }
        if (b11 != null) {
            d12 = b11.c();
        } else {
            d12 = null;
        }
        if (!z5) {
            obj = null;
        } else if (d12 != null && d11 != null) {
            obj = new a.m.b(d11.doubleValue() - d12.doubleValue());
        } else {
            obj = a.m.C0963a.f68030a;
        }
        Flow flowOf = FlowKt.flowOf(obj);
        pt.b b12 = dVar2.b();
        pt.b b13 = dVar.b();
        boolean z11 = !arrayList.contains(b1Var);
        this.f41911j.getClass();
        if (b12 != null) {
            d13 = b12.a();
        } else {
            d13 = null;
        }
        if (b13 != null) {
            d14 = b13.a();
        } else {
            d14 = null;
        }
        if (!z11) {
            obj2 = null;
        } else if (d14 != null && d13 != null) {
            obj2 = new a.InterfaceC0950a.b(d13.doubleValue() - d14.doubleValue());
        } else {
            obj2 = a.InterfaceC0950a.C0951a.f68000a;
        }
        return FlowKt.combine(flowOf, FlowKt.flowOf(obj2), new kotlin.coroutines.jvm.internal.i(3, null));
    }
}
