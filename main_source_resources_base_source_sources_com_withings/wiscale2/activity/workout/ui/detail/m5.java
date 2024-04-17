package com.withings.wiscale2.activity.workout.ui.detail;

import com.withings.wiscale2.activity.workout.model.WorkoutManager;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
/* compiled from: AllWorkoutsActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.detail.WorkoutItemViewHolder$onActivityRecognitionInvalidated$2$1", f = "AllWorkoutsActivity.kt", l = {453}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class m5 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f49447a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ com.google.android.material.bottomsheet.k f49448b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.l<Integer, nm0.y> f49449c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f49450d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ l7 f49451e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AllWorkoutsActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.detail.WorkoutItemViewHolder$onActivityRecognitionInvalidated$2$1$1", f = "AllWorkoutsActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l7 f49452a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(l7 l7Var, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f49452a = l7Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f49452a, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            WorkoutManager workoutManager = WorkoutManager.Companion.get();
            l7 l7Var = this.f49452a;
            workoutManager.delete(l7Var.j().getUserId(), l7Var.j());
            dm.a.a(null);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m5(com.google.android.material.bottomsheet.k kVar, ym0.l<? super Integer, nm0.y> lVar, int i11, l7 l7Var, qm0.d<? super m5> dVar) {
        super(2, dVar);
        this.f49448b = kVar;
        this.f49449c = lVar;
        this.f49450d = i11;
        this.f49451e = l7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new m5(this.f49448b, this.f49449c, this.f49450d, this.f49451e, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((m5) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f49447a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            a aVar = new a(this.f49451e, null);
            this.f49447a = 1;
            if (BuildersKt.withContext(io2, aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        this.f49448b.dismiss();
        this.f49449c.invoke(new Integer(this.f49450d));
        return nm0.y.f85009a;
    }
}
