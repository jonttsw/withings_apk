package com.withings.measurements.ui;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.withings.measurement.model.MeasurementsVertical;
import com.withings.measurements.ui.verticals.a;
import com.withings.user.core.models.User;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: HealthVerticalActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.measurements.ui.HealthVerticalActivity$onCreate$1$1$1$1", f = "HealthVerticalActivity.kt", l = {107}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class c extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f42025a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ com.withings.measurements.ui.verticals.a f42026b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ u0.i0 f42027c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ androidx.lifecycle.d0 f42028d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ HealthVerticalActivity f42029e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HealthVerticalActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.measurements.ui.HealthVerticalActivity$onCreate$1$1$1$1$1", f = "HealthVerticalActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ HealthVerticalActivity f42030a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ MeasurementsVertical f42031b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(HealthVerticalActivity healthVerticalActivity, MeasurementsVertical measurementsVertical, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f42030a = healthVerticalActivity;
            this.f42031b = measurementsVertical;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f42030a, this.f42031b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            User I3;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            I3 = this.f42030a.I3();
            u1.c(I3.getId(), this.f42031b);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.withings.measurements.ui.verticals.a aVar, u0.i0 i0Var, androidx.lifecycle.d0 d0Var, HealthVerticalActivity healthVerticalActivity, qm0.d<? super c> dVar) {
        super(2, dVar);
        this.f42026b = aVar;
        this.f42027c = i0Var;
        this.f42028d = d0Var;
        this.f42029e = healthVerticalActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new c(this.f42026b, this.f42027c, this.f42028d, this.f42029e, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((c) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f42025a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            MeasurementsVertical measurementsVertical = (MeasurementsVertical) kotlin.collections.x.N(this.f42027c.L(), ((a.C0560a) this.f42026b).a());
            if (measurementsVertical == null) {
                return nm0.y.f85009a;
            }
            Lifecycle.State state = Lifecycle.State.f14376e;
            a aVar = new a(this.f42029e, measurementsVertical, null);
            this.f42025a = 1;
            if (RepeatOnLifecycleKt.b(this.f42028d, state, aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
