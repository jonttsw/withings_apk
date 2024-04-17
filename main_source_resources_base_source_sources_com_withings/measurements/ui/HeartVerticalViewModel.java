package com.withings.measurements.ui;

import com.withings.measurement.model.MeasurementsVertical;
import fz.a;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: HealthVerticalViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/measurements/ui/HeartVerticalViewModel;", "Lcom/withings/measurements/ui/o1;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class HeartVerticalViewModel extends o1 {

    /* renamed from: i  reason: collision with root package name */
    private final hz.f f41931i;

    /* renamed from: j  reason: collision with root package name */
    private final hz.b f41932j;

    /* renamed from: k  reason: collision with root package name */
    private final hz.m f41933k;

    /* renamed from: l  reason: collision with root package name */
    private final hz.e f41934l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public HeartVerticalViewModel(iz.c measurementItemsByVerticalRepository, rt.a aVar, n20.b bVar, oz.g gVar, androidx.lifecycle.u0 savedStateHandle, oz.h hVar, rt.c cVar, hz.f fVar, hz.b bVar2, hz.m mVar, hz.e eVar) {
        super(measurementItemsByVerticalRepository, aVar, cVar, savedStateHandle, MeasurementsVertical.f41864c, bVar, gVar, hVar);
        kotlin.jvm.internal.u.j(measurementItemsByVerticalRepository, "measurementItemsByVerticalRepository");
        kotlin.jvm.internal.u.j(savedStateHandle, "savedStateHandle");
        this.f41931i = fVar;
        this.f41932j = bVar2;
        this.f41933k = mVar;
        this.f41934l = eVar;
    }

    /* JADX WARN: Type inference failed for: r11v6, types: [kotlin.coroutines.jvm.internal.i, ym0.s] */
    @Override // com.withings.measurements.ui.o1
    public final Flow g0(pt.d dVar, pt.d dVar2, ArrayList arrayList) {
        Double d11;
        Double d12;
        Object obj;
        Double d13;
        Double d14;
        Object obj2;
        Double d15;
        Double d16;
        Object obj3;
        Double d17;
        Double d18;
        Object obj4;
        pt.f g11 = dVar2.g();
        pt.f g12 = dVar.g();
        boolean z5 = !arrayList.contains(gz.z.f69851a);
        this.f41931i.getClass();
        if (g11 != null) {
            d11 = g11.g();
        } else {
            d11 = null;
        }
        if (g12 != null) {
            d12 = g12.g();
        } else {
            d12 = null;
        }
        if (!z5) {
            obj = null;
        } else if (d12 != null && d11 != null) {
            obj = new a.g.b(d11.doubleValue() - d12.doubleValue());
        } else {
            obj = a.g.C0957a.f68015a;
        }
        Flow flowOf = FlowKt.flowOf(obj);
        pt.f g13 = dVar2.g();
        pt.f g14 = dVar.g();
        boolean z11 = !arrayList.contains(gz.c.f69648a);
        this.f41932j.getClass();
        if (g13 != null) {
            d13 = g13.c();
        } else {
            d13 = null;
        }
        if (g14 != null) {
            d14 = g14.c();
        } else {
            d14 = null;
        }
        if (!z11) {
            obj2 = null;
        } else if (d14 != null && d13 != null) {
            obj2 = new a.b.C0953b(d13.doubleValue() - d14.doubleValue());
        } else {
            obj2 = a.b.C0952a.f68003a;
        }
        Flow flowOf2 = FlowKt.flowOf(obj2);
        pt.f g15 = dVar2.g();
        pt.f g16 = dVar.g();
        boolean z12 = !arrayList.contains(gz.d1.f69671a);
        this.f41933k.getClass();
        if (g15 != null) {
            d15 = g15.i();
        } else {
            d15 = null;
        }
        if (g16 != null) {
            d16 = g16.i();
        } else {
            d16 = null;
        }
        if (!z12) {
            obj3 = null;
        } else if (d16 != null && d15 != null) {
            obj3 = new a.o.b(d15.doubleValue() - d16.doubleValue());
        } else {
            obj3 = a.o.C0964a.f68033a;
        }
        Flow flowOf3 = FlowKt.flowOf(obj3);
        pt.f g17 = dVar2.g();
        pt.f g18 = dVar.g();
        boolean z13 = !arrayList.contains(new gz.a(false));
        this.f41934l.getClass();
        if (g17 != null) {
            d17 = g17.c();
        } else {
            d17 = null;
        }
        if (g18 != null) {
            d18 = g18.c();
        } else {
            d18 = null;
        }
        if (!z13) {
            obj4 = null;
        } else if (d17 != null && d18 != null) {
            obj4 = new a.e.b(d17.doubleValue() - d18.doubleValue());
        } else {
            obj4 = a.e.C0956a.f68012a;
        }
        return FlowKt.combine(flowOf, flowOf2, flowOf3, FlowKt.flowOf(obj4), new kotlin.coroutines.jvm.internal.i(5, null));
    }
}
