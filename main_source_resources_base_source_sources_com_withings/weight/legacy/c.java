package com.withings.weight.legacy;

import androidx.lifecycle.e1;
import androidx.lifecycle.g1;
import androidx.lifecycle.h0;
import androidx.lifecycle.j0;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.Dispatchers;
/* compiled from: WeightDetailActivity.kt */
/* loaded from: classes4.dex */
public final class c extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.lifecycle.f f47036a;

    /* renamed from: b  reason: collision with root package name */
    private final j0 f47037b;

    /* renamed from: c  reason: collision with root package name */
    private final j0 f47038c;

    /* compiled from: WeightDetailActivity.kt */
    /* loaded from: classes4.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.l<List<ky.d>, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f47039a = new kotlin.jvm.internal.w(1);

        @Override // ym0.l
        public final Boolean invoke(List<ky.d> list) {
            List<ky.d> it = list;
            kotlin.jvm.internal.u.j(it, "it");
            return Boolean.valueOf(it.isEmpty());
        }
    }

    /* compiled from: WeightDetailActivity.kt */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.l<List<ky.d>, Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Long f47040a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Long l5) {
            super(1);
            this.f47040a = l5;
        }

        @Override // ym0.l
        public final Integer invoke(List<ky.d> list) {
            Object obj;
            List<ky.d> weightList = list;
            kotlin.jvm.internal.u.j(weightList, "weightList");
            Iterator<T> it = weightList.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    long d11 = ((ky.d) obj).d();
                    Long l5 = this.f47040a;
                    if (l5 != null && d11 == l5.longValue()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            int size = weightList.size() - 1;
            int indexOf = weightList.indexOf((ky.d) obj);
            if (indexOf > -1) {
                size = indexOf;
            }
            return Integer.valueOf(size);
        }
    }

    /* compiled from: WeightDetailActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.legacy.OldWeightDetailActivityViewModel$weightMeasureList$1", f = "WeightDetailActivity.kt", l = {ConstantsWs.MEASURE_TYPE_GLUCOSE_PERIOD, ConstantsWs.MEASURE_TYPE_BLOOD_GLUCOSE}, m = "invokeSuspend")
    /* renamed from: com.withings.weight.legacy.c$c  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0641c extends kotlin.coroutines.jvm.internal.i implements ym0.p<h0<List<? extends ky.d>>, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f47041a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f47042b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ User f47043c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f47044d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ fy.n f47045e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0641c(User user, int i11, fy.n nVar, qm0.d<? super C0641c> dVar) {
            super(2, dVar);
            this.f47043c = user;
            this.f47044d = i11;
            this.f47045e = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            C0641c c0641c = new C0641c(this.f47043c, this.f47044d, this.f47045e, dVar);
            c0641c.f47042b = obj;
            return c0641c;
        }

        @Override // ym0.p
        public final Object invoke(h0<List<? extends ky.d>> h0Var, qm0.d<? super nm0.y> dVar) {
            return ((C0641c) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            h0 h0Var;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f47041a;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        nm0.l.b(obj);
                        return nm0.y.f85009a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h0Var = (h0) this.f47042b;
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                h0Var = (h0) this.f47042b;
                this.f47042b = h0Var;
                this.f47041a = 1;
                obj = this.f47045e.a(this.f47043c.q(), null, true, null, new int[]{this.f47044d}, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            this.f47042b = null;
            this.f47041a = 2;
            if (h0Var.emit(obj, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return nm0.y.f85009a;
        }
    }

    public c(User user, int i11, Long l5, fy.n nVar) {
        kotlin.jvm.internal.u.j(user, "user");
        androidx.lifecycle.f a11 = androidx.lifecycle.h.a(Dispatchers.getIO(), new C0641c(user, i11, nVar, null), 2);
        this.f47036a = a11;
        this.f47037b = e1.b(a11, new b(l5));
        this.f47038c = e1.b(a11, a.f47039a);
    }

    public final j0 f0() {
        return this.f47037b;
    }

    public final androidx.lifecycle.f g0() {
        return this.f47036a;
    }

    public final j0 i0() {
        return this.f47038c;
    }
}
