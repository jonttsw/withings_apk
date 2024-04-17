package com.withings.wiscale2.activity.workout.ui.detail;

import com.withings.wiscale2.track.data.Track;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
/* compiled from: WorkoutPreviewViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.detail.WorkoutPreviewViewModel$loadMoreWorkouts$1", f = "WorkoutPreviewViewModel.kt", l = {108}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class s7 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f49634a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ o7 f49635b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WorkoutPreviewViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.detail.WorkoutPreviewViewModel$loadMoreWorkouts$1$1", f = "WorkoutPreviewViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.q<List<? extends Track>, Integer, qm0.d<? super nm0.j<? extends List<? extends Track>, ? extends Integer>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ List f49636a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ int f49637b;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.wiscale2.activity.workout.ui.detail.s7$a, kotlin.coroutines.jvm.internal.i] */
        @Override // ym0.q
        public final Object invoke(List<? extends Track> list, Integer num, qm0.d<? super nm0.j<? extends List<? extends Track>, ? extends Integer>> dVar) {
            int intValue = num.intValue();
            ?? iVar = new kotlin.coroutines.jvm.internal.i(3, dVar);
            iVar.f49636a = list;
            iVar.f49637b = intValue;
            return iVar.invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            return new nm0.j(this.f49636a, new Integer(this.f49637b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WorkoutPreviewViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.detail.WorkoutPreviewViewModel$loadMoreWorkouts$1$2", f = "WorkoutPreviewViewModel.kt", l = {110}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<nm0.j<? extends List<? extends Track>, ? extends Integer>, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f49638a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f49639b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ o7 f49640c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(o7 o7Var, qm0.d<? super b> dVar) {
            super(2, dVar);
            this.f49640c = o7Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            b bVar = new b(this.f49640c, dVar);
            bVar.f49639b = obj;
            return bVar;
        }

        @Override // ym0.p
        public final Object invoke(nm0.j<? extends List<? extends Track>, ? extends Integer> jVar, qm0.d<? super nm0.y> dVar) {
            return ((b) create(jVar, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            MutableStateFlow mutableStateFlow;
            int i11;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i12 = this.f49638a;
            if (i12 != 0) {
                if (i12 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                nm0.j jVar = (nm0.j) this.f49639b;
                int intValue = ((Number) jVar.b()).intValue();
                if (((List) jVar.a()).size() == intValue) {
                    o7 o7Var = this.f49640c;
                    mutableStateFlow = o7Var.f49522f;
                    i11 = o7Var.f49517a;
                    Integer num = new Integer(i11 + intValue);
                    this.f49638a = 1;
                    if (mutableStateFlow.emit(num, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(o7 o7Var, qm0.d<? super s7> dVar) {
        super(2, dVar);
        this.f49635b = o7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new s7(this.f49635b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((s7) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [ym0.q, kotlin.coroutines.jvm.internal.i] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Flow flow;
        MutableStateFlow mutableStateFlow;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f49634a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            o7 o7Var = this.f49635b;
            flow = o7Var.f49523g;
            mutableStateFlow = o7Var.f49522f;
            Flow flowOn = FlowKt.flowOn(FlowKt.combine(flow, mutableStateFlow, new kotlin.coroutines.jvm.internal.i(3, null)), Dispatchers.getIO());
            b bVar = new b(o7Var, null);
            this.f49634a = 1;
            if (FlowKt.collectLatest(flowOn, bVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
