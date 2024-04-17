package com.withings.wiscale2.spo2;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e1;
import androidx.lifecycle.g1;
import androidx.lifecycle.h0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.withings.features.InternalSetting;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.vasistas.model.SpO2Vasistas;
import com.withings.vasistas.model.SpO2VasistasKt;
import com.withings.vasistas.model.Vasistas;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.Dispatchers;
import org.joda.time.DateTime;
/* compiled from: SpO2MeasuresListActivity.kt */
/* loaded from: classes5.dex */
public final class y extends g1 {

    /* renamed from: a */
    private final long f61706a;

    /* renamed from: b */
    private final fy.l f61707b;

    /* renamed from: c */
    private final fy.b f61708c;

    /* renamed from: d */
    private final User f61709d;

    /* renamed from: e */
    private final DateTime f61710e;

    /* renamed from: f */
    private final k0<Boolean> f61711f;

    /* renamed from: g */
    private final j0 f61712g;

    /* renamed from: h */
    private final androidx.lifecycle.f f61713h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpO2MeasuresListActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.l<Boolean, LiveData<List<ky.d>>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a() {
            super(1);
            y.this = r1;
        }

        @Override // ym0.l
        public final LiveData<List<ky.d>> invoke(Boolean bool) {
            return androidx.lifecycle.h.a(Dispatchers.getIO(), new x(y.this, null), 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpO2MeasuresListActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.spo2.Spo2MeasuresViewModel$spo2Vasistas$1", f = "SpO2MeasuresListActivity.kt", l = {ConstantsWs.MEASURE_TYPE_EDA_LEFT_FOOT, ConstantsWs.MEASURE_TYPE_DURATION_MEDIUM_HIGH_ACTIVITY}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<h0<List<? extends Vasistas>>, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a */
        int f61715a;

        /* renamed from: b */
        private /* synthetic */ Object f61716b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(qm0.d<? super b> dVar) {
            super(2, dVar);
            y.this = r1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f61716b = obj;
            return bVar;
        }

        @Override // ym0.p
        public final Object invoke(h0<List<? extends Vasistas>> h0Var, qm0.d<? super nm0.y> dVar) {
            return ((b) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f61715a;
            if (i11 != 0) {
                if (i11 != 1 && i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                h0 h0Var = (h0) this.f61716b;
                if (wr.b.c(InternalSetting.f39151j)) {
                    int i12 = o.f61687c;
                    y yVar = y.this;
                    ArrayList a11 = o.a(yVar.getUser().q(), new DateTime(yVar.f61706a));
                    ArrayList arrayList = new ArrayList(kotlin.collections.x.y(a11, 10));
                    Iterator it = a11.iterator();
                    while (it.hasNext()) {
                        arrayList.add(SpO2VasistasKt.toVasistas((SpO2Vasistas) it.next()));
                    }
                    this.f61715a = 1;
                    if (h0Var.emit(arrayList, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    i0 i0Var = i0.f76187a;
                    this.f61715a = 2;
                    if (h0Var.emit(i0Var, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            return nm0.y.f85009a;
        }
    }

    public y(long j5, fy.l lVar, fy.b bVar, User user) {
        kotlin.jvm.internal.u.j(user, "user");
        this.f61706a = j5;
        this.f61707b = lVar;
        this.f61708c = bVar;
        this.f61709d = user;
        this.f61710e = hn.a.m(new DateTime(j5));
        k0<Boolean> k0Var = new k0<>(Boolean.TRUE);
        this.f61711f = k0Var;
        this.f61712g = e1.c(k0Var, new a());
        this.f61713h = androidx.lifecycle.h.a(Dispatchers.getIO(), new b(null), 2);
    }

    public static final /* synthetic */ fy.b f0(y yVar) {
        return yVar.f61708c;
    }

    public static final void k0(y yVar) {
        yVar.f61711f.postValue(Boolean.TRUE);
    }

    public final User getUser() {
        return this.f61709d;
    }

    public final j0 m0() {
        return this.f61712g;
    }

    public final androidx.lifecycle.f p0() {
        return this.f61713h;
    }
}
