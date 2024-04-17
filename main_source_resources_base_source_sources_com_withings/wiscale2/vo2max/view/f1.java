package com.withings.wiscale2.vo2max.view;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.vo2max.view.c2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
/* compiled from: Vo2maxActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.vo2max.view.Vo2maxActivity$subscribeToEvents$1", f = "Vo2maxActivity.kt", l = {ConstantsWs.MEASURE_TYPE_VASCULAR_AGE}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class f1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f62739a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Vo2maxActivity f62740b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Vo2maxActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.vo2max.view.Vo2maxActivity$subscribeToEvents$1$1", f = "Vo2maxActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<c2.b, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f62741a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Vo2maxActivity f62742b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Vo2maxActivity vo2maxActivity, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f62742b = vo2maxActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            a aVar = new a(this.f62742b, dVar);
            aVar.f62741a = obj;
            return aVar;
        }

        @Override // ym0.p
        public final Object invoke(c2.b bVar, qm0.d<? super nm0.y> dVar) {
            return ((a) create(bVar, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            c2.b bVar = (c2.b) this.f62741a;
            if (bVar != null) {
                boolean e11 = kotlin.jvm.internal.u.e(bVar, c2.b.C0797b.f62719a);
                Vo2maxActivity vo2maxActivity = this.f62742b;
                if (e11) {
                    Vo2maxActivity.D3(vo2maxActivity);
                } else if (kotlin.jvm.internal.u.e(bVar, c2.b.a.f62718a)) {
                    vo2maxActivity.finish();
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(Vo2maxActivity vo2maxActivity, qm0.d<? super f1> dVar) {
        super(2, dVar);
        this.f62740b = vo2maxActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new f1(this.f62740b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((f1) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        c2 c2Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f62739a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            Vo2maxActivity vo2maxActivity = this.f62740b;
            c2Var = vo2maxActivity.f62656i;
            if (c2Var != null) {
                SharedFlow<c2.b> k02 = c2Var.k0();
                a aVar = new a(vo2maxActivity, null);
                this.f62739a = 1;
                if (FlowKt.collectLatest(k02, aVar, this) == coroutineSingletons) {
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
