package com.withings.wiscale2.sleep.ui.sleepscore;

import android.widget.ProgressBar;
import com.withings.wiscale2.sleep.libc.SleepScoreRecalculator;
import com.withings.wiscale2.sleep.ui.sleepscore.h2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
/* compiled from: SleepMonthFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SleepMonthFragment$loadAndShowData$1", f = "SleepMonthFragment.kt", l = {213}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class j2 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f61058a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ h2 f61059b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SleepMonthFragment.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SleepMonthFragment$loadAndShowData$1$sleepMonthViewModelResult$1", f = "SleepMonthFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super q2>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h2 f61060a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h2 h2Var, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f61060a = h2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f61060a, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super q2> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            SleepScoreRecalculator sleepScoreRecalculator;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            ei0.q qVar = ei0.q.f65441d;
            if (qVar != null) {
                if (qVar != null) {
                    h2 h2Var = this.f61060a;
                    sleepScoreRecalculator = h2Var.f61004t;
                    if (sleepScoreRecalculator != null) {
                        q2 q2Var = new q2(qVar, h2Var, sleepScoreRecalculator);
                        q2Var.e(h2.y1(h2Var), h2.u1(h2Var));
                        return q2Var;
                    }
                    kotlin.jvm.internal.u.s("sleepScoreRecalculator");
                    throw null;
                }
                kotlin.jvm.internal.u.s("instance");
                throw null;
            }
            kotlin.jvm.internal.u.s("instance");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(h2 h2Var, qm0.d<? super j2> dVar) {
        super(2, dVar);
        this.f61059b = h2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new j2(this.f61059b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((j2) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ProgressBar progressBar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f61058a;
        h2 h2Var = this.f61059b;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            a aVar = new a(h2Var, null);
            this.f61058a = 1;
            obj = BuildersKt.withContext(io2, aVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        q2 q2Var = (q2) obj;
        h2.a aVar2 = h2.f60985u;
        h2Var.getClass();
        progressBar = h2Var.f60994j;
        if (progressBar != null) {
            progressBar.setVisibility(8);
            if (!q2Var.b().isEmpty()) {
                h2.z1(h2Var, q2Var);
            } else {
                h2.A1(h2Var);
            }
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("monthLoading");
        throw null;
    }
}
