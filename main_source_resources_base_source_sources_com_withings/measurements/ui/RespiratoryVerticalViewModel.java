package com.withings.measurements.ui;

import com.withings.measurement.model.MeasurementsVertical;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: HealthVerticalViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/measurements/ui/RespiratoryVerticalViewModel;", "Lcom/withings/measurements/ui/o1;", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RespiratoryVerticalViewModel extends o1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Inject
    public RespiratoryVerticalViewModel(iz.c measurementItemsByVerticalRepository, rt.a aVar, n20.b bVar, oz.g gVar, androidx.lifecycle.u0 savedStateHandle, oz.h hVar, rt.c cVar) {
        super(measurementItemsByVerticalRepository, aVar, cVar, savedStateHandle, MeasurementsVertical.f41866e, bVar, gVar, hVar);
        kotlin.jvm.internal.u.j(measurementItemsByVerticalRepository, "measurementItemsByVerticalRepository");
        kotlin.jvm.internal.u.j(savedStateHandle, "savedStateHandle");
    }

    @Override // com.withings.measurements.ui.o1
    public final Flow g0(pt.d dVar, pt.d dVar2, ArrayList arrayList) {
        return FlowKt.flowOf(kotlin.collections.i0.f76187a);
    }
}
