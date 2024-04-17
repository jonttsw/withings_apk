package com.withings.cycletracking.ui.viewmodel;

import com.withings.cycletracking.ui.e2;
import com.withings.learnmore.adapter.LearnMoreCategories;
import com.withings.learnmore.adapter.LearnMoreEntryTranslations;
import com.withings.learnmore.adapter.LearnMoreManager;
import java.util.List;
import kotlin.collections.i0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowCollector;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CycleTrackingViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.cycletracking.ui.viewmodel.CycleTrackingViewModel$learnMoreEntries$1", f = "CycleTrackingViewModel.kt", l = {128, 128}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class p extends kotlin.coroutines.jvm.internal.i implements ym0.p<FlowCollector<? super e2.c.a>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35930a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f35931b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ CycleTrackingViewModel f35932c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(CycleTrackingViewModel cycleTrackingViewModel, qm0.d<? super p> dVar) {
        super(2, dVar);
        this.f35932c = cycleTrackingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        p pVar = new p(this.f35932c, dVar);
        pVar.f35931b = obj;
        return pVar;
    }

    @Override // ym0.p
    public final Object invoke(FlowCollector<? super e2.c.a> flowCollector, qm0.d<? super nm0.y> dVar) {
        return ((p) create(flowCollector, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        LearnMoreManager learnMoreManager;
        List<LearnMoreEntryTranslations> list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f35930a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    nm0.l.b(obj);
                    return nm0.y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowCollector = (FlowCollector) this.f35931b;
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            flowCollector = (FlowCollector) this.f35931b;
            learnMoreManager = this.f35932c.f35792c;
            this.f35931b = flowCollector;
            this.f35930a = 1;
            obj = learnMoreManager.getLearnMoreCategories(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        LearnMoreCategories learnMoreCategories = (LearnMoreCategories) obj;
        if (learnMoreCategories == null || (list = learnMoreCategories.getCycleTracking()) == null) {
            list = i0.f76187a;
        }
        e2.c.a aVar = new e2.c.a(list);
        this.f35931b = null;
        this.f35930a = 2;
        if (flowCollector.emit(aVar, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return nm0.y.f85009a;
    }
}
