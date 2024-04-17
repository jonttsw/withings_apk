package com.withings.wiscale2.activity.workout.ui.detail;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: AllWorkoutsActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.detail.AllWorkoutsActivity$initViewModel$3", f = "AllWorkoutsActivity.kt", l = {255}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class f extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f49181a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AllWorkoutsActivity f49182b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AllWorkoutsActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.detail.AllWorkoutsActivity$initViewModel$3$1", f = "AllWorkoutsActivity.kt", l = {256}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f49183a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AllWorkoutsActivity f49184b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AllWorkoutsActivity.kt */
        /* renamed from: com.withings.wiscale2.activity.workout.ui.detail.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C0671a extends kotlin.jvm.internal.a implements ym0.p<List<? extends l7>, qm0.d<? super nm0.y>, Object> {
            @Override // ym0.p
            public final Object invoke(List<? extends l7> list, qm0.d<? super nm0.y> dVar) {
                AllWorkoutsActivity.B3((AllWorkoutsActivity) this.f76230a, list);
                return nm0.y.f85009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AllWorkoutsActivity allWorkoutsActivity, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f49184b = allWorkoutsActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f49184b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.internal.a, ym0.p] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            o7 o7Var;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f49183a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                o7Var = this.f49184b.f49023o;
                if (o7Var != null) {
                    Flow<List<l7>> p02 = o7Var.p0();
                    ?? aVar = new kotlin.jvm.internal.a(2, this.f49184b, AllWorkoutsActivity.class, "updateWorkoutsList", "updateWorkoutsList(Ljava/util/List;)V", 4);
                    this.f49183a = 1;
                    if (FlowKt.collectLatest(p02, aVar, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    kotlin.jvm.internal.u.s("viewModel");
                    throw null;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(AllWorkoutsActivity allWorkoutsActivity, qm0.d<? super f> dVar) {
        super(2, dVar);
        this.f49182b = allWorkoutsActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new f(this.f49182b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((f) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f49181a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            Lifecycle.State state = Lifecycle.State.f14375d;
            AllWorkoutsActivity allWorkoutsActivity = this.f49182b;
            a aVar = new a(allWorkoutsActivity, null);
            this.f49181a = 1;
            if (RepeatOnLifecycleKt.b(allWorkoutsActivity, state, aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
