package com.withings.measurements.ui;

import com.withings.measurement.model.MeasurementsVertical;
import fz.a;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: HealthVerticalViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/measurements/ui/SleepVerticalViewModel;", "Lcom/withings/measurements/ui/o1;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SleepVerticalViewModel extends o1 {

    /* renamed from: i  reason: collision with root package name */
    private final hz.j f42014i;

    /* renamed from: j  reason: collision with root package name */
    private final hz.i f42015j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public SleepVerticalViewModel(iz.c measurementItemsByVerticalRepository, rt.a aVar, n20.b bVar, oz.g gVar, androidx.lifecycle.u0 savedStateHandle, oz.h hVar, rt.c cVar, hz.j jVar, hz.i iVar) {
        super(measurementItemsByVerticalRepository, aVar, cVar, savedStateHandle, MeasurementsVertical.f41867f, bVar, gVar, hVar);
        kotlin.jvm.internal.u.j(measurementItemsByVerticalRepository, "measurementItemsByVerticalRepository");
        kotlin.jvm.internal.u.j(savedStateHandle, "savedStateHandle");
        this.f42014i = jVar;
        this.f42015j = iVar;
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
        pt.g i11 = dVar2.i();
        pt.g i12 = dVar.i();
        boolean z5 = !arrayList.contains(gz.v0.f69831a);
        this.f42014i.getClass();
        if (i11 != null) {
            d11 = i11.d();
        } else {
            d11 = null;
        }
        if (i12 != null) {
            d12 = i12.d();
        } else {
            d12 = null;
        }
        if (!z5) {
            obj = null;
        } else if (d12 != null && d11 != null) {
            obj = new a.k.b(d11.doubleValue() - d12.doubleValue());
        } else {
            obj = a.k.C0961a.f68025a;
        }
        Flow flowOf = FlowKt.flowOf(obj);
        pt.g i13 = dVar2.i();
        pt.g i14 = dVar.i();
        boolean z11 = !arrayList.contains(gz.s0.f69798a);
        this.f42015j.getClass();
        if (i13 != null) {
            d13 = i13.b();
        } else {
            d13 = null;
        }
        if (i14 != null) {
            d14 = i14.b();
        } else {
            d14 = null;
        }
        if (!z11) {
            obj2 = null;
        } else if (d14 != null && d13 != null) {
            obj2 = new a.j.b(d13.doubleValue() - d14.doubleValue());
        } else {
            obj2 = a.j.C0960a.f68022a;
        }
        return FlowKt.combine(flowOf, FlowKt.flowOf(obj2), new kotlin.coroutines.jvm.internal.i(3, null));
    }
}
