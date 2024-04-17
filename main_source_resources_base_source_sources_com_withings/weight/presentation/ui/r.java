package com.withings.weight.presentation.ui;

import com.withings.weight.presentation.viewmodel.BodyCompViewModel;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: BodyCompositionActivity.kt */
/* loaded from: classes4.dex */
final class r extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ StateFlow<m90.e> f47283a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BodyCompositionActivity f47284b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r(StateFlow<? extends m90.e> stateFlow, BodyCompositionActivity bodyCompositionActivity) {
        super(2);
        this.f47283a = stateFlow;
        this.f47284b = bodyCompositionActivity;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [ym0.l, kotlin.jvm.internal.a] */
    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        BodyCompViewModel B3;
        BodyCompViewModel B32;
        BodyCompViewModel B33;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            BodyCompositionActivity bodyCompositionActivity = this.f47284b;
            B3 = bodyCompositionActivity.B3();
            j jVar = new j(B3);
            B32 = bodyCompositionActivity.B3();
            ?? aVar3 = new kotlin.jvm.internal.a(1, B32, BodyCompViewModel.class, "onViewportChanged", "onViewportChanged(Lcom/withings/graph/model/TimeGraphViewport;)Lkotlinx/coroutines/Job;", 8);
            B33 = bodyCompositionActivity.B3();
            l90.e.a((m90.e) h6.b.c(this.f47283a, aVar2).getValue(), new m(bodyCompositionActivity), new l(B33), new n(bodyCompositionActivity), jVar, aVar3, new o(bodyCompositionActivity), new p(bodyCompositionActivity), new q(bodyCompositionActivity), aVar2, 0);
        }
        return nm0.y.f85009a;
    }
}
