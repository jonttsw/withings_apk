package com.withings.wiscale2.measure.list;

import com.withings.library.measure.MeasuresGroup;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MeasureListActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.measure.list.ListViewModel$deleteMeasure$1", f = "MeasureListActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class e extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g f58535a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MeasuresGroup f58536b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, MeasuresGroup measuresGroup, qm0.d<? super e> dVar) {
        super(2, dVar);
        this.f58535a = gVar;
        this.f58536b = measuresGroup;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new e(this.f58535a, this.f58536b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((e) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        fy.a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        g gVar = this.f58535a;
        aVar = gVar.f58546f;
        aVar.b(hy.g.a(this.f58536b));
        gVar.p0().postValue(Boolean.TRUE);
        return nm0.y.f85009a;
    }
}
