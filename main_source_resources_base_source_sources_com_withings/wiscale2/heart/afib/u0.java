package com.withings.wiscale2.heart.afib;

import android.app.Application;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.measure.Measure;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.Dispatchers;
import org.joda.time.DateTime;
/* compiled from: AFibDetailActivity.kt */
/* loaded from: classes5.dex */
public final class u0 extends androidx.lifecycle.b {

    /* renamed from: a  reason: collision with root package name */
    private Measure f57247a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.lifecycle.k0<Integer> f57248b;

    /* renamed from: c  reason: collision with root package name */
    private final androidx.lifecycle.f f57249c;

    /* compiled from: AFibDetailActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.heart.afib.PagesViewModel$dataList$1", f = "AFibDetailActivity.kt", l = {ConstantsWs.MEASURE_TYPE_NITRITES}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<n0>, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f57250a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f57251b;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ long f57253d;

        /* compiled from: Comparisons.kt */
        /* renamed from: com.withings.wiscale2.heart.afib.u0$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0744a<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t11, T t12) {
                return pm0.a.b(((Measure) t11).getDate(), ((Measure) t12).getDate());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j5, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f57253d = j5;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            a aVar = new a(this.f57253d, dVar);
            aVar.f57251b = obj;
            return aVar;
        }

        @Override // ym0.p
        public final Object invoke(androidx.lifecycle.h0<n0> h0Var, qm0.d<? super nm0.y> dVar) {
            return ((a) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.Comparator] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i11;
            int i12;
            int M;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i13 = this.f57250a;
            if (i13 != 0) {
                if (i13 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                androidx.lifecycle.h0 h0Var = (androidx.lifecycle.h0) this.f57251b;
                sw.a z5 = sw.a.z();
                double millis = DateTime.now().getMillis();
                u0 u0Var = u0.this;
                if (u0Var.f57247a.getType() != 145) {
                    i11 = 139;
                } else {
                    i11 = 145;
                }
                List D0 = kotlin.collections.x.D0(z5.F(this.f57253d, i11, millis), new Object());
                ListIterator listIterator = D0.listIterator(D0.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (((Measure) listIterator.previous()).getGroup().getId() == u0Var.f57247a.getGroup().getId()) {
                            i12 = listIterator.nextIndex();
                            break;
                        }
                    } else {
                        i12 = -1;
                        break;
                    }
                }
                Integer num = new Integer(i12);
                if (num.intValue() == -1) {
                    num = null;
                }
                if (num != null) {
                    M = num.intValue();
                } else {
                    M = kotlin.collections.x.M(D0);
                }
                n0 n0Var = new n0(D0, M);
                this.f57250a = 1;
                if (h0Var.emit(n0Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(Application application, long j5, Measure selectedMeasure) {
        super(application);
        kotlin.jvm.internal.u.j(selectedMeasure, "selectedMeasure");
        this.f57247a = selectedMeasure;
        this.f57248b = new androidx.lifecycle.k0<>();
        this.f57249c = androidx.lifecycle.h.a(Dispatchers.getIO(), new a(j5, null), 2);
    }

    public final androidx.lifecycle.f g0() {
        return this.f57249c;
    }

    public final androidx.lifecycle.k0<Integer> i0() {
        return this.f57248b;
    }
}
