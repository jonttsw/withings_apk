package com.withings.weight.presentation.ui;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.internal.CombineKt;
import m90.f;
/* compiled from: SafeCollector.common.kt */
/* loaded from: classes4.dex */
public final class z implements Flow<f.b> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Flow[] f47316a;

    /* compiled from: Zip.kt */
    /* loaded from: classes4.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.a<Object[]> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Flow[] f47317a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Flow[] flowArr) {
            super(0);
            this.f47317a = flowArr;
        }

        @Override // ym0.a
        public final Object[] invoke() {
            return new Object[this.f47317a.length];
        }
    }

    /* compiled from: Zip.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.presentation.ui.WeightActivity$getUiStateFlow$$inlined$combine$1$3", f = "WeightActivity.kt", l = {ConstantsWs.WS_STATUS_WRONGACCOUNTID}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.q<FlowCollector<? super f.b>, Object[], qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f47318a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ FlowCollector f47319b;

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object[] f47320c;

        /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.i, com.withings.weight.presentation.ui.z$b] */
        @Override // ym0.q
        public final Object invoke(FlowCollector<? super f.b> flowCollector, Object[] objArr, qm0.d<? super nm0.y> dVar) {
            ?? iVar = new kotlin.coroutines.jvm.internal.i(3, dVar);
            iVar.f47319b = flowCollector;
            iVar.f47320c = objArr;
            return iVar.invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            f.b.C1298b c1298b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f47318a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                FlowCollector flowCollector = this.f47319b;
                Object[] objArr = this.f47320c;
                Object obj2 = objArr[0];
                kotlin.jvm.internal.u.h(obj2, "null cannot be cast to non-null type com.withings.weight.presentation.ui.model.BodyWeightUiState.Ready.ScreenState");
                f.b.c cVar = (f.b.c) obj2;
                Object obj3 = objArr[1];
                kotlin.jvm.internal.u.h(obj3, "null cannot be cast to non-null type com.withings.weight.presentation.ui.model.BodyWeightUiState.Ready.GraphState");
                f.b.a aVar = (f.b.a) obj3;
                Object obj4 = objArr[2];
                kotlin.jvm.internal.u.h(obj4, "null cannot be cast to non-null type com.withings.weight.presentation.ui.model.BodyWeightUiState.Ready.SecondaryCardWithGraphState");
                f.b.d dVar = (f.b.d) obj4;
                Object obj5 = objArr[3];
                kotlin.jvm.internal.u.h(obj5, "null cannot be cast to non-null type com.withings.weight.presentation.ui.model.BodyWeightUiState.Ready.SecondaryCardWithGraphState");
                f.b.d dVar2 = (f.b.d) obj5;
                Object obj6 = objArr[4];
                if (obj6 instanceof f.b.C1298b) {
                    c1298b = (f.b.C1298b) obj6;
                } else {
                    c1298b = null;
                }
                f.b.C1298b c1298b2 = c1298b;
                Object obj7 = objArr[5];
                kotlin.jvm.internal.u.h(obj7, "null cannot be cast to non-null type com.withings.weight.presentation.ui.model.BodyWeightUiState.Ready.SectionsState");
                f.b bVar = new f.b(cVar, aVar, (f.b.e) obj7, dVar, dVar2, c1298b2);
                this.f47318a = 1;
                if (flowCollector.emit(bVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    public z(Flow[] flowArr) {
        this.f47316a = flowArr;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [ym0.q, kotlin.coroutines.jvm.internal.i] */
    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector<? super f.b> flowCollector, qm0.d dVar) {
        Flow[] flowArr = this.f47316a;
        Object combineInternal = CombineKt.combineInternal(flowCollector, flowArr, new a(flowArr), new kotlin.coroutines.jvm.internal.i(3, null), dVar);
        if (combineInternal == CoroutineSingletons.f76214a) {
            return combineInternal;
        }
        return nm0.y.f85009a;
    }
}
