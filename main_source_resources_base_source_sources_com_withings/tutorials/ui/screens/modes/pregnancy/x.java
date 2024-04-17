package com.withings.tutorials.ui.screens.modes.pregnancy;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
/* compiled from: PregnancyModeActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.tutorials.ui.screens.modes.pregnancy.PregnancyModeActivity$onCreate$1$1$1", f = "PregnancyModeActivity.kt", l = {63}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class x extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f46177a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PregnancyModeActivity f46178b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PregnancyModeActivity.kt */
    /* loaded from: classes4.dex */
    public static final class a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PregnancyModeActivity f46179a;

        a(PregnancyModeActivity pregnancyModeActivity) {
            this.f46179a = pregnancyModeActivity;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, qm0.d dVar) {
            Throwable th2 = (Throwable) obj;
            if (th2 != null) {
                this.f46179a.F3(th2);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(PregnancyModeActivity pregnancyModeActivity, qm0.d<? super x> dVar) {
        super(2, dVar);
        this.f46178b = pregnancyModeActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new x(this.f46178b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        ((x) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        return CoroutineSingletons.f76214a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f46177a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            PregnancyModeActivity pregnancyModeActivity = this.f46178b;
            SharedFlow<Throwable> V0 = PregnancyModeActivity.z3(pregnancyModeActivity).V0();
            a aVar = new a(pregnancyModeActivity);
            this.f46177a = 1;
            if (V0.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        throw new KotlinNothingValueException();
    }
}
