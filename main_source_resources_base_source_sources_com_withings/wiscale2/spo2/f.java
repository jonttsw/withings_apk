package com.withings.wiscale2.spo2;

import androidx.lifecycle.LiveData;
import com.withings.user.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.joda.time.DateTime;
/* compiled from: SpO2MeasuresGroupLiveData.kt */
/* loaded from: classes5.dex */
public final class f extends LiveData<List<? extends ky.d>> implements ky.e {

    /* renamed from: a  reason: collision with root package name */
    private final CoroutineScope f61667a;

    /* renamed from: b  reason: collision with root package name */
    private final User f61668b;

    /* renamed from: c  reason: collision with root package name */
    private final DateTime f61669c;

    /* renamed from: d  reason: collision with root package name */
    private final DateTime f61670d;

    /* renamed from: e  reason: collision with root package name */
    private final cy.a f61671e;

    /* renamed from: f  reason: collision with root package name */
    private final fy.l f61672f;

    /* renamed from: g  reason: collision with root package name */
    private final ArrayList f61673g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpO2MeasuresGroupLiveData.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.spo2.SpO2MeasuresGroupLiveData$pullSPO2Measure$1", f = "SpO2MeasuresGroupLiveData.kt", l = {46}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        ArrayList f61674a;

        /* renamed from: b  reason: collision with root package name */
        n f61675b;

        /* renamed from: c  reason: collision with root package name */
        int f61676c;

        a(qm0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            n nVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f61676c;
            f fVar = f.this;
            if (i11 != 0) {
                if (i11 == 1) {
                    nVar = this.f61675b;
                    arrayList = this.f61674a;
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                fVar.f61673g.clear();
                arrayList = fVar.f61673g;
                n nVar2 = n.f61682a;
                this.f61674a = arrayList;
                this.f61675b = nVar2;
                this.f61676c = 1;
                Object c11 = fy.l.c(fVar.f61672f, fVar.f61668b.q(), new Long(fVar.f61669c.getMillis()), new Long(fVar.f61670d.getMillis()), false, new int[]{54}, this, 24);
                if (c11 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                nVar = nVar2;
                obj = c11;
            }
            n nVar3 = n.f61682a;
            nVar.getClass();
            arrayList.addAll(n.c((List) obj, false));
            fVar.postValue(fVar.f61673g);
            return nm0.y.f85009a;
        }
    }

    public f(CoroutineScope coroutineScope, User user, DateTime startDateTime, DateTime dateTime, cy.a aVar, fy.l lVar) {
        kotlin.jvm.internal.u.j(user, "user");
        kotlin.jvm.internal.u.j(startDateTime, "startDateTime");
        this.f61667a = coroutineScope;
        this.f61668b = user;
        this.f61669c = startDateTime;
        this.f61670d = dateTime;
        this.f61671e = aVar;
        this.f61672f = lVar;
        this.f61673g = new ArrayList();
    }

    private final boolean C(ky.d dVar) {
        if (ly.a.g(54, dVar) && hn.a.c(dVar.c(), this.f61669c, this.f61670d)) {
            return true;
        }
        return false;
    }

    private final void E() {
        BuildersKt__Builders_commonKt.launch$default(this.f61667a, Dispatchers.getIO(), null, new a(null), 2, null);
    }

    @Override // ky.e, ky.b
    public final void b(long j5, ky.d measuresGroup) {
        kotlin.jvm.internal.u.j(measuresGroup, "measuresGroup");
        if (C(measuresGroup)) {
            E();
        }
    }

    @Override // ky.b
    public final void d(long j5, ky.d measuresGroup, boolean z5) {
        kotlin.jvm.internal.u.j(measuresGroup, "measuresGroup");
        if (!z5 && C(measuresGroup)) {
            ArrayList arrayList = this.f61673g;
            ArrayList S0 = kotlin.collections.x.S0(arrayList);
            S0.add(measuresGroup);
            arrayList.clear();
            n.f61682a.getClass();
            arrayList.addAll(n.c(S0, false));
            postValue(arrayList);
        }
    }

    @Override // ky.b
    public final void g(long j5, ky.d measuresGroup) {
        kotlin.jvm.internal.u.j(measuresGroup, "measuresGroup");
        if (C(measuresGroup)) {
            E();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    public final void onActive() {
        super.onActive();
        this.f61671e.a(this);
        E();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    public final void onInactive() {
        this.f61671e.b(this);
        super.onInactive();
    }
}
