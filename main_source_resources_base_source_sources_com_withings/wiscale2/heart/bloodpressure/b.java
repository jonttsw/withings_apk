package com.withings.wiscale2.heart.bloodpressure;

import com.withings.library.measure.MeasuresGroup;
import hj0.a;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import nm0.k;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BloodPressureAdapter.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.heart.bloodpressure.BloodPressureAdapter$removeItemInAdapter$1", f = "BloodPressureAdapter.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ Object f57344a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ com.withings.wiscale2.heart.bloodpressure.a f57345b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f57346c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f57347d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BloodPressureAdapter.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.heart.bloodpressure.BloodPressureAdapter$removeItemInAdapter$1$2$1", f = "BloodPressureAdapter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.withings.wiscale2.heart.bloodpressure.a f57348a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f57349b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f57350c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.withings.wiscale2.heart.bloodpressure.a aVar, int i11, int i12, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f57348a = aVar;
            this.f57349b = i11;
            this.f57350c = i12;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f57348a, this.f57349b, this.f57350c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            this.f57348a.l(this.f57349b, this.f57350c);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.withings.wiscale2.heart.bloodpressure.a aVar, int i11, int i12, qm0.d<? super b> dVar) {
        super(2, dVar);
        this.f57345b = aVar;
        this.f57346c = i11;
        this.f57347d = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        b bVar = new b(this.f57345b, this.f57346c, this.f57347d, dVar);
        bVar.f57344a = obj;
        return bVar;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((b) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        List list;
        List list2;
        int i11 = this.f57347d;
        int i12 = this.f57346c;
        com.withings.wiscale2.heart.bloodpressure.a aVar = this.f57345b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f57344a;
        try {
            list2 = aVar.f57337g;
            a.c cVar = ((a.C1035a) list2.get(i12)).b().get(i11);
            kotlin.jvm.internal.u.h(cVar, "null cannot be cast to non-null type com.withings.wiscale2.utils.sectionedrecyclerview.SectionnableMeasureGroup");
            sw.a z5 = sw.a.z();
            kotlin.jvm.internal.u.i(z5, "get(...)");
            zx.v vVar = new zx.v(z5);
            zx.j a12 = zx.j.f111082d.a();
            fy.a aVar2 = new fy.a(vVar, new fy.d(vVar, a12), new ey.a(new fy.x(new ey.b(vVar))), a12);
            MeasuresGroup b10 = ((hj0.b) cVar).b();
            kotlin.jvm.internal.u.i(b10, "getMeasuresGroup(...)");
            aVar2.b(hy.g.a(b10));
            a11 = nm0.y.f85009a;
        } catch (Throwable th2) {
            a11 = nm0.l.a(th2);
        }
        if (!(a11 instanceof k.a)) {
            nm0.y yVar = (nm0.y) a11;
            list = aVar.f57337g;
            ((a.C1035a) list.get(i12)).b().remove(i11);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getMain(), null, new a(aVar, i12, i11, null), 2, null);
        }
        return nm0.y.f85009a;
    }
}
