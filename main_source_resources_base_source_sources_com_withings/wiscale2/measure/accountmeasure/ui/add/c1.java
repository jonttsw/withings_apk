package com.withings.wiscale2.measure.accountmeasure.ui.add;

import com.withings.library.measure.Measure;
import com.withings.user.User;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.Dispatchers;
/* compiled from: AddHeightFragment.kt */
/* loaded from: classes5.dex */
public final class c1 extends androidx.lifecycle.g1 {

    /* renamed from: a  reason: collision with root package name */
    private final androidx.lifecycle.f f58149a;

    /* compiled from: AddHeightFragment.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.measure.accountmeasure.ui.add.HeightMeasurementViewModel$heightMeasureLiveData$1", f = "AddHeightFragment.kt", l = {86, 85}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<Measure>, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f58150a;

        /* renamed from: b  reason: collision with root package name */
        int f58151b;

        /* renamed from: c  reason: collision with root package name */
        private /* synthetic */ Object f58152c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ fy.p f58153d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ User f58154e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(fy.p pVar, User user, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f58153d = pVar;
            this.f58154e = user;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            a aVar = new a(this.f58153d, this.f58154e, dVar);
            aVar.f58152c = obj;
            return aVar;
        }

        @Override // ym0.p
        public final Object invoke(androidx.lifecycle.h0<Measure> h0Var, qm0.d<? super nm0.y> dVar) {
            return ((a) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i11;
            androidx.lifecycle.h0 h0Var;
            Measure measure;
            ky.a d11;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i12 = this.f58151b;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        nm0.l.b(obj);
                        return nm0.y.f85009a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i11 = this.f58150a;
                h0Var = (androidx.lifecycle.h0) this.f58152c;
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                androidx.lifecycle.h0 h0Var2 = (androidx.lifecycle.h0) this.f58152c;
                long q11 = this.f58154e.q();
                i11 = 4;
                this.f58152c = h0Var2;
                this.f58150a = 4;
                this.f58151b = 1;
                Object a11 = fy.p.a(this.f58153d, q11, null, new int[]{4}, this, 54);
                if (a11 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                h0Var = h0Var2;
                obj = a11;
            }
            ky.d dVar = (ky.d) obj;
            if (dVar != null && (d11 = ly.a.d(i11, dVar)) != null) {
                measure = hy.g.d(d11, null);
            } else {
                measure = null;
            }
            this.f58152c = null;
            this.f58151b = 2;
            if (h0Var.emit(measure, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return nm0.y.f85009a;
        }
    }

    public c1(User user, fy.p pVar) {
        this.f58149a = androidx.lifecycle.h.a(Dispatchers.getIO(), new a(pVar, user, null), 2);
    }

    public final androidx.lifecycle.f f0() {
        return this.f58149a;
    }
}
