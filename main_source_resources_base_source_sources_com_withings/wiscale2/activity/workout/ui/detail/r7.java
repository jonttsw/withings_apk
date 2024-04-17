package com.withings.wiscale2.activity.workout.ui.detail;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* compiled from: WorkoutPreviewViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.activity.workout.ui.detail.WorkoutPreviewViewModel$filterByCategory$1", f = "WorkoutPreviewViewModel.kt", l = {122, 123}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class r7 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f49595a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ o7 f49596b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ long f49597c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(o7 o7Var, long j5, qm0.d<? super r7> dVar) {
        super(2, dVar);
        this.f49596b = o7Var;
        this.f49597c = j5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new r7(this.f49596b, this.f49597c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((r7) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        int i11;
        MutableStateFlow mutableStateFlow2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i12 = this.f49595a;
        o7 o7Var = this.f49596b;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    nm0.l.b(obj);
                    return nm0.y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            mutableStateFlow = o7Var.f49522f;
            i11 = o7Var.f49517a;
            Integer num = new Integer(i11);
            this.f49595a = 1;
            if (mutableStateFlow.emit(num, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        mutableStateFlow2 = o7Var.f49521e;
        Long l5 = new Long(this.f49597c);
        this.f49595a = 2;
        if (mutableStateFlow2.emit(l5, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return nm0.y.f85009a;
    }
}
