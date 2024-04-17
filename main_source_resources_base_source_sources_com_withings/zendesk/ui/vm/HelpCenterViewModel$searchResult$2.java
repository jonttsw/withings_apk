package com.withings.zendesk.ui.vm;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.flow.FlowCollector;
import nm0.j;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.q;
/* compiled from: HelpCenterViewModel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007*\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00010\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u008a@¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lnm0/j;", "", "", "", "", "it", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.zendesk.ui.vm.HelpCenterViewModel$searchResult$2", f = "HelpCenterViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class HelpCenterViewModel$searchResult$2 extends i implements q<FlowCollector<? super j<? extends String, ? extends List<? extends Object>>>, Throwable, d<? super y>, Object> {
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public HelpCenterViewModel$searchResult$2(d<? super HelpCenterViewModel$searchResult$2> dVar) {
        super(3, dVar);
    }

    @Override // ym0.q
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super j<? extends String, ? extends List<? extends Object>>> flowCollector, Throwable th2, d<? super y> dVar) {
        return invoke2((FlowCollector<? super j<String, ? extends List<? extends Object>>>) flowCollector, th2, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        if (this.label == 0) {
            l.b(obj);
            return y.f85009a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<? super j<String, ? extends List<? extends Object>>> flowCollector, Throwable th2, d<? super y> dVar) {
        return new HelpCenterViewModel$searchResult$2(dVar).invokeSuspend(y.f85009a);
    }
}
