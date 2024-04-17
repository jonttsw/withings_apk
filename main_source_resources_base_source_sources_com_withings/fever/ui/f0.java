package com.withings.fever.ui;

import com.withings.learnmore.adapter.LearnMoreCategories;
import com.withings.learnmore.adapter.LearnMoreEntryTranslations;
import com.withings.learnmore.adapter.LearnMoreManager;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowCollector;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BodyTemperatureViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.fever.ui.BodyTemperatureViewModel$educationArticle$1", f = "BodyTemperatureViewModel.kt", l = {119, 119}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class f0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<FlowCollector<? super List<? extends LearnMoreEntryTranslations>>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f39235a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f39236b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ o0 f39237c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(o0 o0Var, qm0.d<? super f0> dVar) {
        super(2, dVar);
        this.f39237c = o0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        f0 f0Var = new f0(this.f39237c, dVar);
        f0Var.f39236b = obj;
        return f0Var;
    }

    @Override // ym0.p
    public final Object invoke(FlowCollector<? super List<? extends LearnMoreEntryTranslations>> flowCollector, qm0.d<? super nm0.y> dVar) {
        return ((f0) create(flowCollector, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        LearnMoreManager learnMoreManager;
        List<LearnMoreEntryTranslations> list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f39235a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    nm0.l.b(obj);
                    return nm0.y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowCollector = (FlowCollector) this.f39236b;
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            flowCollector = (FlowCollector) this.f39236b;
            learnMoreManager = this.f39237c.f39386f;
            this.f39236b = flowCollector;
            this.f39235a = 1;
            obj = learnMoreManager.getLearnMoreCategories(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        LearnMoreCategories learnMoreCategories = (LearnMoreCategories) obj;
        if (learnMoreCategories == null || (list = learnMoreCategories.getVascularAge()) == null) {
            list = kotlin.collections.i0.f76187a;
        }
        this.f39236b = null;
        this.f39235a = 2;
        if (flowCollector.emit(list, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return nm0.y.f85009a;
    }
}
