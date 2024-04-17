package com.withings.tutorials.ui.screens.modes.pregnancy;

import android.content.Intent;
import com.withings.tutorials.ui.screens.modes.pregnancy.w1;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import org.joda.time.DateTime;
/* compiled from: PregnancyModeActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.tutorials.ui.screens.modes.pregnancy.PregnancyModeActivity$onCreate$1$1$3", f = "PregnancyModeActivity.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class z extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f46190a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PregnancyModeActivity f46191b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r8.n f46192c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ k1.o1<Boolean> f46193d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ k1.o1<DateTime> f46194e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PregnancyModeActivity.kt */
    /* loaded from: classes4.dex */
    public static final class a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r8.n f46195a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ PregnancyModeActivity f46196b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k1.o1<Boolean> f46197c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k1.o1<DateTime> f46198d;

        a(k1.o1 o1Var, k1.o1 o1Var2, r8.n nVar, PregnancyModeActivity pregnancyModeActivity) {
            this.f46195a = nVar;
            this.f46196b = pregnancyModeActivity;
            this.f46197c = o1Var;
            this.f46198d = o1Var2;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, qm0.d dVar) {
            long j5;
            w1 w1Var = (w1) obj;
            boolean z5 = w1Var instanceof w1.b;
            r8.n nVar = this.f46195a;
            if (z5) {
                androidx.navigation.e.L(nVar, "loading", null, 6);
            } else {
                boolean z11 = w1Var instanceof w1.a;
                if (z11 && n0.a(this.f46197c)) {
                    Intent intent = new Intent();
                    DateTime value = this.f46198d.getValue();
                    if (value != null) {
                        j5 = value.getMillis();
                    } else {
                        j5 = -1;
                    }
                    Intent putExtra = intent.putExtra("due", j5);
                    PregnancyModeActivity pregnancyModeActivity = this.f46196b;
                    pregnancyModeActivity.setResult(-1, putExtra);
                    PregnancyModeActivity.A3(pregnancyModeActivity, Boolean.TRUE);
                } else if (z11) {
                    androidx.navigation.e.L(nVar, "enabledFeature", null, 6);
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(PregnancyModeActivity pregnancyModeActivity, r8.n nVar, k1.o1<Boolean> o1Var, k1.o1<DateTime> o1Var2, qm0.d<? super z> dVar) {
        super(2, dVar);
        this.f46191b = pregnancyModeActivity;
        this.f46192c = nVar;
        this.f46193d = o1Var;
        this.f46194e = o1Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new z(this.f46191b, this.f46192c, this.f46193d, this.f46194e, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        ((z) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        return CoroutineSingletons.f76214a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f46190a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            PregnancyModeActivity pregnancyModeActivity = this.f46191b;
            SharedFlow<w1> i12 = PregnancyModeActivity.z3(pregnancyModeActivity).i1();
            a aVar = new a(this.f46193d, this.f46194e, this.f46192c, pregnancyModeActivity);
            this.f46190a = 1;
            if (i12.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        throw new KotlinNothingValueException();
    }
}
