package com.withings.tutorials.ui.screens.modes.pregnancy;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
/* compiled from: PregnancyModeActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.tutorials.ui.screens.modes.pregnancy.PregnancyModeActivity$onCreate$1$1$4", f = "PregnancyModeActivity.kt", l = {93}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class a0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f45840a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PregnancyModeActivity f45841b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PregnancyModeActivity.kt */
    /* loaded from: classes4.dex */
    public static final class a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PregnancyModeActivity f45842a;

        a(PregnancyModeActivity pregnancyModeActivity) {
            this.f45842a = pregnancyModeActivity;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, qm0.d dVar) {
            nm0.y yVar = (nm0.y) obj;
            this.f45842a.finish();
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(PregnancyModeActivity pregnancyModeActivity, qm0.d<? super a0> dVar) {
        super(2, dVar);
        this.f45841b = pregnancyModeActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new a0(this.f45841b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        ((a0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        return CoroutineSingletons.f76214a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f45840a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            PregnancyModeActivity pregnancyModeActivity = this.f45841b;
            SharedFlow<nm0.y> W0 = PregnancyModeActivity.z3(pregnancyModeActivity).W0();
            a aVar = new a(pregnancyModeActivity);
            this.f45840a = 1;
            if (W0.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        throw new KotlinNothingValueException();
    }
}
