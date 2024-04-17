package com.withings.wiscale2.vo2max.view;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
/* compiled from: Vo2MaxComparison.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.vo2max.view.Vo2MaxComparisonView$onUserInitialized$1$1", f = "Vo2MaxComparison.kt", l = {220}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class s extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f62822a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ u0.i0 f62823b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Vo2MaxComparisonView f62824c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Vo2MaxComparison.kt */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u0.i0 f62825a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(u0.i0 i0Var) {
            super(0);
            this.f62825a = i0Var;
        }

        @Override // ym0.a
        public final Integer invoke() {
            return Integer.valueOf(this.f62825a.s());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Vo2MaxComparison.kt */
    /* loaded from: classes5.dex */
    public static final class b<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Vo2MaxComparisonView f62826a;

        b(Vo2MaxComparisonView vo2MaxComparisonView) {
            this.f62826a = vo2MaxComparisonView;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, qm0.d dVar) {
            i0 i0Var;
            int intValue = ((Number) obj).intValue();
            i0Var = this.f62826a.f62649s;
            if (i0Var != null) {
                i0Var.m0(intValue);
                return nm0.y.f85009a;
            }
            kotlin.jvm.internal.u.s("viewModel");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u0.i0 i0Var, Vo2MaxComparisonView vo2MaxComparisonView, qm0.d<? super s> dVar) {
        super(2, dVar);
        this.f62823b = i0Var;
        this.f62824c = vo2MaxComparisonView;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new s(this.f62823b, this.f62824c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((s) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f62822a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            Flow n11 = androidx.compose.runtime.l0.n(new a(this.f62823b));
            b bVar = new b(this.f62824c);
            this.f62822a = 1;
            if (n11.collect(bVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
