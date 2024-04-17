package com.withings.wiscale2.vascularage;

import com.withings.learnmore.adapter.LearnMoreCategories;
import com.withings.learnmore.adapter.LearnMoreEntryTranslations;
import com.withings.learnmore.adapter.LearnMoreManager;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowCollector;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VascularAgeViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.vascularage.VascularAgeViewModel$educationArticle$1", f = "VascularAgeViewModel.kt", l = {ConstantsWs.WS_STATUS_WRONGBLINDCODE, ConstantsWs.WS_STATUS_WRONGBLINDCODE}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class v0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<FlowCollector<? super List<? extends LearnMoreEntryTranslations>>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f62488a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f62489b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r0 f62490c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(r0 r0Var, qm0.d<? super v0> dVar) {
        super(2, dVar);
        this.f62490c = r0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        v0 v0Var = new v0(this.f62490c, dVar);
        v0Var.f62489b = obj;
        return v0Var;
    }

    @Override // ym0.p
    public final Object invoke(FlowCollector<? super List<? extends LearnMoreEntryTranslations>> flowCollector, qm0.d<? super nm0.y> dVar) {
        return ((v0) create(flowCollector, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector;
        LearnMoreManager learnMoreManager;
        List<LearnMoreEntryTranslations> list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f62488a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    nm0.l.b(obj);
                    return nm0.y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowCollector = (FlowCollector) this.f62489b;
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            flowCollector = (FlowCollector) this.f62489b;
            learnMoreManager = this.f62490c.f62448i;
            this.f62489b = flowCollector;
            this.f62488a = 1;
            obj = learnMoreManager.getLearnMoreCategories(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        LearnMoreCategories learnMoreCategories = (LearnMoreCategories) obj;
        if (learnMoreCategories == null || (list = learnMoreCategories.getVascularAge()) == null) {
            list = kotlin.collections.i0.f76187a;
        }
        this.f62489b = null;
        this.f62488a = 2;
        if (flowCollector.emit(list, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return nm0.y.f85009a;
    }
}
