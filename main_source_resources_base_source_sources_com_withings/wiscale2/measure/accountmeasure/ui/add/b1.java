package com.withings.wiscale2.measure.accountmeasure.ui.add;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.Dispatchers;
/* compiled from: AddBloodPressureFragment.kt */
/* loaded from: classes5.dex */
public final class b1 extends androidx.lifecycle.g1 {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.lifecycle.f f58129a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.lifecycle.f f58130b;

    /* renamed from: c  reason: collision with root package name */
    private final androidx.lifecycle.f f58131c;

    /* compiled from: AddBloodPressureFragment.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.measure.accountmeasure.ui.add.BloodPressureMeasurementViewModel$diastolMeasureLiveData$1", f = "AddBloodPressureFragment.kt", l = {ConstantsWs.MEASURE_TYPE_CAN, ConstantsWs.MEASURE_TYPE_CAN}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<ky.a>, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f58132a;

        /* renamed from: b  reason: collision with root package name */
        int f58133b;

        /* renamed from: c  reason: collision with root package name */
        private /* synthetic */ Object f58134c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ fy.p f58135d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ User f58136e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(fy.p pVar, User user, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f58135d = pVar;
            this.f58136e = user;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            a aVar = new a(this.f58135d, this.f58136e, dVar);
            aVar.f58134c = obj;
            return aVar;
        }

        @Override // ym0.p
        public final Object invoke(androidx.lifecycle.h0<ky.a> h0Var, qm0.d<? super nm0.y> dVar) {
            return ((a) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i11;
            androidx.lifecycle.h0 h0Var;
            ky.a aVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i12 = this.f58133b;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        nm0.l.b(obj);
                        return nm0.y.f85009a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i11 = this.f58132a;
                h0Var = (androidx.lifecycle.h0) this.f58134c;
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                androidx.lifecycle.h0 h0Var2 = (androidx.lifecycle.h0) this.f58134c;
                long q11 = this.f58136e.q();
                i11 = 9;
                this.f58134c = h0Var2;
                this.f58132a = 9;
                this.f58133b = 1;
                Object a11 = fy.p.a(this.f58135d, q11, null, new int[]{9}, this, 54);
                if (a11 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                h0Var = h0Var2;
                obj = a11;
            }
            ky.d dVar = (ky.d) obj;
            if (dVar != null) {
                aVar = ly.a.d(i11, dVar);
            } else {
                aVar = null;
            }
            this.f58134c = null;
            this.f58133b = 2;
            if (h0Var.emit(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: AddBloodPressureFragment.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.measure.accountmeasure.ui.add.BloodPressureMeasurementViewModel$heartRateMeasureLiveData$1", f = "AddBloodPressureFragment.kt", l = {ConstantsWs.MEASURE_TYPE_PWV_REACHED_COUNT, ConstantsWs.MEASURE_TYPE_PWV_REACHED_COUNT}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<ky.a>, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f58137a;

        /* renamed from: b  reason: collision with root package name */
        int f58138b;

        /* renamed from: c  reason: collision with root package name */
        private /* synthetic */ Object f58139c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ fy.p f58140d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ User f58141e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(fy.p pVar, User user, qm0.d<? super b> dVar) {
            super(2, dVar);
            this.f58140d = pVar;
            this.f58141e = user;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            b bVar = new b(this.f58140d, this.f58141e, dVar);
            bVar.f58139c = obj;
            return bVar;
        }

        @Override // ym0.p
        public final Object invoke(androidx.lifecycle.h0<ky.a> h0Var, qm0.d<? super nm0.y> dVar) {
            return ((b) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i11;
            androidx.lifecycle.h0 h0Var;
            ky.a aVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i12 = this.f58138b;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        nm0.l.b(obj);
                        return nm0.y.f85009a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i11 = this.f58137a;
                h0Var = (androidx.lifecycle.h0) this.f58139c;
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                androidx.lifecycle.h0 h0Var2 = (androidx.lifecycle.h0) this.f58139c;
                long q11 = this.f58141e.q();
                i11 = 11;
                this.f58139c = h0Var2;
                this.f58137a = 11;
                this.f58138b = 1;
                Object a11 = fy.p.a(this.f58140d, q11, null, new int[]{11}, this, 54);
                if (a11 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                h0Var = h0Var2;
                obj = a11;
            }
            ky.d dVar = (ky.d) obj;
            if (dVar != null) {
                aVar = ly.a.d(i11, dVar);
            } else {
                aVar = null;
            }
            this.f58139c = null;
            this.f58138b = 2;
            if (h0Var.emit(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: AddBloodPressureFragment.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.measure.accountmeasure.ui.add.BloodPressureMeasurementViewModel$systolMeasureLiveData$1", f = "AddBloodPressureFragment.kt", l = {ConstantsWs.MEASURE_TYPE_BLOOD_GLUCOSE, ConstantsWs.MEASURE_TYPE_BLOOD_GLUCOSE}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class c extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<ky.a>, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f58142a;

        /* renamed from: b  reason: collision with root package name */
        int f58143b;

        /* renamed from: c  reason: collision with root package name */
        private /* synthetic */ Object f58144c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ fy.p f58145d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ User f58146e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(fy.p pVar, User user, qm0.d<? super c> dVar) {
            super(2, dVar);
            this.f58145d = pVar;
            this.f58146e = user;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            c cVar = new c(this.f58145d, this.f58146e, dVar);
            cVar.f58144c = obj;
            return cVar;
        }

        @Override // ym0.p
        public final Object invoke(androidx.lifecycle.h0<ky.a> h0Var, qm0.d<? super nm0.y> dVar) {
            return ((c) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i11;
            androidx.lifecycle.h0 h0Var;
            ky.a aVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i12 = this.f58143b;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        nm0.l.b(obj);
                        return nm0.y.f85009a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i11 = this.f58142a;
                h0Var = (androidx.lifecycle.h0) this.f58144c;
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                androidx.lifecycle.h0 h0Var2 = (androidx.lifecycle.h0) this.f58144c;
                long q11 = this.f58146e.q();
                i11 = 10;
                this.f58144c = h0Var2;
                this.f58142a = 10;
                this.f58143b = 1;
                Object a11 = fy.p.a(this.f58145d, q11, null, new int[]{10}, this, 54);
                if (a11 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                h0Var = h0Var2;
                obj = a11;
            }
            ky.d dVar = (ky.d) obj;
            if (dVar != null) {
                aVar = ly.a.d(i11, dVar);
            } else {
                aVar = null;
            }
            this.f58144c = null;
            this.f58143b = 2;
            if (h0Var.emit(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return nm0.y.f85009a;
        }
    }

    public b1(User user, fy.p pVar) {
        this.f58129a = androidx.lifecycle.h.a(Dispatchers.getIO(), new b(pVar, user, null), 2);
        this.f58130b = androidx.lifecycle.h.a(Dispatchers.getIO(), new c(pVar, user, null), 2);
        this.f58131c = androidx.lifecycle.h.a(Dispatchers.getIO(), new a(pVar, user, null), 2);
    }

    public final androidx.lifecycle.f f0() {
        return this.f58131c;
    }

    public final androidx.lifecycle.f g0() {
        return this.f58129a;
    }

    public final androidx.lifecycle.f i0() {
        return this.f58130b;
    }
}
