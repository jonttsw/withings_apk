package com.withings.manualLogging.ui.feature.addNote.cycle;

import com.withings.device.Device;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowCollector;
import org.joda.time.DateTime;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CycleManualLoggingViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.manualLogging.ui.feature.addNote.cycle.CycleManualLoggingViewModel$deviceWithCycleTracking$1", f = "CycleManualLoggingViewModel.kt", l = {93}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class a2 extends kotlin.coroutines.jvm.internal.i implements ym0.p<FlowCollector<? super Device>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f40905a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f40906b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CycleManualLoggingViewModel f40907c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(CycleManualLoggingViewModel cycleManualLoggingViewModel, qm0.d<? super a2> dVar) {
        super(2, dVar);
        this.f40907c = cycleManualLoggingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        a2 a2Var = new a2(this.f40907c, dVar);
        a2Var.f40906b = obj;
        return a2Var;
    }

    @Override // ym0.p
    public final Object invoke(FlowCollector<? super Device> flowCollector, qm0.d<? super nm0.y> dVar) {
        return ((a2) create(flowCollector, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Long l5;
        Iterable iterable;
        fl.i iVar;
        Long l6;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f40905a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.f40906b;
            CycleManualLoggingViewModel cycleManualLoggingViewModel = this.f40907c;
            l5 = cycleManualLoggingViewModel.f40763l;
            Object obj2 = null;
            if (l5 != null) {
                iVar = cycleManualLoggingViewModel.f40755d;
                l6 = cycleManualLoggingViewModel.f40763l;
                long longValue = l6.longValue();
                fn0.d b10 = kotlin.jvm.internal.q0.b(gl.z.class);
                iVar.getClass();
                iterable = iVar.b(b50.b.x(b10), longValue);
            } else {
                iterable = null;
            }
            if (iterable == null) {
                iterable = kotlin.collections.i0.f76187a;
            }
            Iterator it = iterable.iterator();
            if (it.hasNext()) {
                obj2 = it.next();
                if (it.hasNext()) {
                    DateTime associationDate = ((Device) obj2).getAssociationDate();
                    do {
                        Object next = it.next();
                        DateTime associationDate2 = ((Device) next).getAssociationDate();
                        if (associationDate.compareTo(associationDate2) < 0) {
                            obj2 = next;
                            associationDate = associationDate2;
                        }
                    } while (it.hasNext());
                }
            }
            this.f40905a = 1;
            if (flowCollector.emit(obj2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
