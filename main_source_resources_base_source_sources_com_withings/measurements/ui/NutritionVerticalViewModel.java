package com.withings.measurements.ui;

import com.withings.measurement.model.MeasurementsVertical;
import fz.a;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: HealthVerticalViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/measurements/ui/NutritionVerticalViewModel;", "Lcom/withings/measurements/ui/o1;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NutritionVerticalViewModel extends o1 {

    /* renamed from: i  reason: collision with root package name */
    private final hz.k f42010i;

    /* renamed from: j  reason: collision with root package name */
    private final hz.h f42011j;

    /* renamed from: k  reason: collision with root package name */
    private final hz.n f42012k;

    /* renamed from: l  reason: collision with root package name */
    private final hz.g f42013l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public NutritionVerticalViewModel(iz.c measurementItemsByVerticalRepository, rt.a aVar, n20.b bVar, oz.g gVar, androidx.lifecycle.u0 savedStateHandle, oz.h hVar, rt.c cVar, hz.k kVar, hz.h hVar2, hz.n nVar, hz.g gVar2) {
        super(measurementItemsByVerticalRepository, aVar, cVar, savedStateHandle, MeasurementsVertical.f41865d, bVar, gVar, hVar);
        kotlin.jvm.internal.u.j(measurementItemsByVerticalRepository, "measurementItemsByVerticalRepository");
        kotlin.jvm.internal.u.j(savedStateHandle, "savedStateHandle");
        this.f42010i = kVar;
        this.f42011j = hVar2;
        this.f42012k = nVar;
        this.f42013l = gVar2;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.coroutines.jvm.internal.i, ym0.s] */
    @Override // com.withings.measurements.ui.o1
    public final Flow g0(pt.d dVar, pt.d dVar2, ArrayList arrayList) {
        a.h.C0958a c0958a;
        a.p.C0965a c0965a;
        a.i.C0959a c0959a;
        a.l.C0962a c0962a;
        boolean z5 = !arrayList.contains(gz.h0.f69711a);
        this.f42013l.getClass();
        if (!z5) {
            c0958a = null;
        } else {
            c0958a = new a.h.C0958a();
        }
        Flow flowOf = FlowKt.flowOf(c0958a);
        boolean z11 = !arrayList.contains(gz.f1.f69696a);
        this.f42012k.getClass();
        if (!z11) {
            c0965a = null;
        } else {
            c0965a = new a.p.C0965a();
        }
        Flow flowOf2 = FlowKt.flowOf(c0965a);
        boolean z12 = !arrayList.contains(gz.o0.f69767a);
        this.f42011j.getClass();
        if (!z12) {
            c0959a = null;
        } else {
            c0959a = new a.i.C0959a();
        }
        Flow flowOf3 = FlowKt.flowOf(c0959a);
        boolean z13 = !arrayList.contains(gz.z0.f69852a);
        this.f42010i.getClass();
        if (!z13) {
            c0962a = null;
        } else {
            c0962a = new a.l.C0962a();
        }
        return FlowKt.combine(flowOf, flowOf2, flowOf3, FlowKt.flowOf(c0962a), new kotlin.coroutines.jvm.internal.i(5, null));
    }
}
