package com.withings.tutorials.ui.screens.modes.pregnancy;

import com.withings.tutorials.ui.screens.modes.pregnancy.c;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
/* compiled from: PregnancyModeActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.tutorials.ui.screens.modes.pregnancy.PregnancyModeActivity$onCreate$1$1$2", f = "PregnancyModeActivity.kt", l = {70}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class y extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f46181a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PregnancyModeActivity f46182b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r8.n f46183c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ k1.o1<Boolean> f46184d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PregnancyModeActivity.kt */
    /* loaded from: classes4.dex */
    public static final class a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PregnancyModeActivity f46185a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r8.n f46186b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k1.o1<Boolean> f46187c;

        a(PregnancyModeActivity pregnancyModeActivity, r8.n nVar, k1.o1<Boolean> o1Var) {
            this.f46185a = pregnancyModeActivity;
            this.f46186b = nVar;
            this.f46187c = o1Var;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, qm0.d dVar) {
            c cVar = (c) obj;
            if (!n0.a(this.f46187c)) {
                boolean z5 = cVar instanceof c.a;
                PregnancyModeActivity pregnancyModeActivity = this.f46185a;
                if (z5) {
                    PregnancyModeActivity.B3(pregnancyModeActivity);
                } else if (cVar instanceof c.b) {
                    int i11 = PregnancyModeActivity.f45779h;
                    pregnancyModeActivity.getClass();
                    androidx.navigation.e.L(this.f46186b, "enabledFeature", null, 6);
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(PregnancyModeActivity pregnancyModeActivity, r8.n nVar, k1.o1<Boolean> o1Var, qm0.d<? super y> dVar) {
        super(2, dVar);
        this.f46182b = pregnancyModeActivity;
        this.f46183c = nVar;
        this.f46184d = o1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new y(this.f46182b, this.f46183c, this.f46184d, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        ((y) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        return CoroutineSingletons.f76214a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f46181a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            PregnancyModeActivity pregnancyModeActivity = this.f46182b;
            SharedFlow<c> a12 = PregnancyModeActivity.z3(pregnancyModeActivity).a1();
            a aVar = new a(pregnancyModeActivity, this.f46183c, this.f46184d);
            this.f46181a = 1;
            if (a12.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        throw new KotlinNothingValueException();
    }
}
