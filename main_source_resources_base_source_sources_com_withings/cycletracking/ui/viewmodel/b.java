package com.withings.cycletracking.ui.viewmodel;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CycleTrackingFactorEditionViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.cycletracking.ui.viewmodel.CycleTrackingFactorEditionViewModel$1", f = "CycleTrackingFactorEditionViewModel.kt", l = {75}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35865a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c f35866b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CycleTrackingFactorEditionViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.cycletracking.ui.viewmodel.CycleTrackingFactorEditionViewModel$1$1", f = "CycleTrackingFactorEditionViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<fr.a, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f35867a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f35868b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c cVar, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f35868b = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            a aVar = new a(this.f35868b, dVar);
            aVar.f35867a = obj;
            return aVar;
        }

        @Override // ym0.p
        public final Object invoke(fr.a aVar, qm0.d<? super nm0.y> dVar) {
            return ((a) create(aVar, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            MutableStateFlow mutableStateFlow;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            mutableStateFlow = this.f35868b.f35876h;
            mutableStateFlow.setValue((fr.a) this.f35867a);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, qm0.d<? super b> dVar) {
        super(2, dVar);
        this.f35866b = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new b(this.f35866b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((b) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        gn.a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f35865a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            c cVar = this.f35866b;
            aVar = cVar.f35875g;
            a aVar2 = new a(cVar, null);
            this.f35865a = 1;
            if (FlowKt.collectLatest(aVar, aVar2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
