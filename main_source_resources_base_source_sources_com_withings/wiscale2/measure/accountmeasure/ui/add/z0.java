package com.withings.wiscale2.measure.accountmeasure.ui.add;

import androidx.lifecycle.LiveData;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.wiscale2.measure.accountmeasure.ui.add.o0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.Dispatchers;
/* compiled from: AddWeightFragment.kt */
/* loaded from: classes5.dex */
public final class z0 extends androidx.lifecycle.g1 {

    /* renamed from: a  reason: collision with root package name */
    private final User f58293a;

    /* renamed from: b  reason: collision with root package name */
    private final fy.p f58294b;

    /* renamed from: c  reason: collision with root package name */
    private final cy.a f58295c;

    /* renamed from: d  reason: collision with root package name */
    private final zx.c f58296d;

    /* renamed from: e  reason: collision with root package name */
    private final androidx.lifecycle.j0 f58297e;

    /* renamed from: f  reason: collision with root package name */
    private final androidx.lifecycle.f f58298f;

    /* renamed from: g  reason: collision with root package name */
    private final a f58299g;

    /* compiled from: AddWeightFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a extends androidx.lifecycle.j0<Double> {

        /* renamed from: a  reason: collision with root package name */
        private final LiveData<Double> f58300a;

        /* renamed from: b  reason: collision with root package name */
        private final LiveData<ky.d> f58301b;

        /* renamed from: c  reason: collision with root package name */
        private final LiveData<ky.d> f58302c;

        public a(androidx.lifecycle.k0 k0Var, zx.c cVar, androidx.lifecycle.j0 j0Var) {
            this.f58300a = k0Var;
            this.f58301b = cVar;
            this.f58302c = j0Var;
            addSource(k0Var, new o0.b(new w0(this)));
            addSource(cVar, new o0.b(new x0(this)));
            addSource(j0Var, new o0.b(new y0(this)));
        }

        public static final void t(a aVar) {
            Double d11;
            float f11;
            Double value = aVar.f58300a.getValue();
            ky.d value2 = aVar.f58301b.getValue();
            ky.d value3 = aVar.f58302c.getValue();
            Double d12 = null;
            if (value == null) {
                if (value2 != null) {
                    ky.a c11 = ly.a.c(1, value2);
                    if (c11 != null) {
                        value = Double.valueOf(c11.f());
                    }
                    value = null;
                } else if (value3 != null) {
                    ky.a c12 = ly.a.c(4, value3);
                    if (c12 != null) {
                        d11 = Double.valueOf(c12.f());
                    } else {
                        d11 = null;
                    }
                    if (d11 != null) {
                        float doubleValue = (float) d11.doubleValue();
                        if (doubleValue < 1.0f) {
                            f11 = 0.0f;
                        } else {
                            f11 = doubleValue * 22.0f * doubleValue;
                        }
                        value = Double.valueOf(f11);
                    }
                    value = null;
                } else {
                    value = Double.valueOf(50.0d);
                }
            }
            if (value != null) {
                double doubleValue2 = value.doubleValue();
                if (doubleValue2 > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && !kotlin.jvm.internal.u.a(doubleValue2, aVar.getValue())) {
                    d12 = value;
                }
                if (d12 != null) {
                    aVar.postValue(Double.valueOf(d12.doubleValue()));
                }
            }
        }
    }

    /* compiled from: AddWeightFragment.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.measure.accountmeasure.ui.add.AddWeightViewModel$fatmassValue$1", f = "AddWeightFragment.kt", l = {ConstantsWs.MEASURE_TYPE_VASISTAS_TYPE_WALKING_ASYMETRY}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<Double>, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f58303a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f58304b;

        b(qm0.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f58304b = obj;
            return bVar;
        }

        @Override // ym0.p
        public final Object invoke(androidx.lifecycle.h0<Double> h0Var, qm0.d<? super nm0.y> dVar) {
            return ((b) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Double d11;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f58303a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                androidx.lifecycle.h0 h0Var = (androidx.lifecycle.h0) this.f58304b;
                z0 z0Var = z0.this;
                ky.d value = z0Var.m0().getValue();
                if (value != null) {
                    d11 = z0.f0(z0Var, value);
                } else {
                    d11 = null;
                }
                this.f58303a = 1;
                if (h0Var.emit(d11, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: AddWeightFragment.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.l<nm0.j<Double, ky.d>, LiveData<ky.d>> {
        c() {
            super(1);
        }

        @Override // ym0.l
        public final LiveData<ky.d> invoke(nm0.j<Double, ky.d> jVar) {
            nm0.j<Double, ky.d> jVar2 = jVar;
            Double a11 = jVar2.a();
            ky.d b10 = jVar2.b();
            if (a11 == null && b10 == null) {
                z0 z0Var = z0.this;
                return new zx.c(androidx.lifecycle.h1.a(z0Var).getCoroutineContext(), z0Var.getUser(), 4, z0Var.f58294b, z0Var.f58295c);
            }
            return xw.d.a(null);
        }
    }

    public z0(User user, double d11, fy.p pVar, cy.a aVar) {
        this.f58293a = user;
        this.f58294b = pVar;
        this.f58295c = aVar;
        androidx.lifecycle.k0 a11 = xw.d.a(d11 <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? null : Double.valueOf(d11));
        zx.c cVar = new zx.c(androidx.lifecycle.h1.a(this).getCoroutineContext(), user, 1, pVar, aVar);
        this.f58296d = cVar;
        androidx.lifecycle.j0 c11 = androidx.lifecycle.e1.c(xw.a.b(new nm0.j(a11, cVar)), new c());
        this.f58297e = c11;
        this.f58298f = androidx.lifecycle.h.a(Dispatchers.getIO(), new b(null), 2);
        this.f58299g = new a(a11, cVar, c11);
    }

    public static final Double f0(z0 z0Var, ky.d dVar) {
        Double d11;
        z0Var.getClass();
        ky.a c11 = ly.a.c(8, dVar);
        Double d12 = null;
        if (c11 != null) {
            d11 = Double.valueOf(c11.f());
        } else {
            d11 = null;
        }
        if (z0Var.f58293a.C()) {
            ky.a c12 = ly.a.c(1, dVar);
            if (c12 != null) {
                d12 = Double.valueOf(c12.f());
            }
            return (Double) cr.a.a(new nm0.j(d11, d12), a1.f58126a);
        }
        return d11;
    }

    public final User getUser() {
        return this.f58293a;
    }

    public final androidx.lifecycle.f j0() {
        return this.f58298f;
    }

    public final androidx.lifecycle.j0 k0() {
        return this.f58297e;
    }

    public final zx.c m0() {
        return this.f58296d;
    }

    public final a p0() {
        return this.f58299g;
    }
}
