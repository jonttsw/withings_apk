package com.withings.wiscale2.measure.accountmeasure.unknown.ui;

import com.withings.library.measure.MeasuresGroup;
import java.util.List;
import kotlin.collections.i0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UnknownMeasuresActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.measure.accountmeasure.unknown.ui.UnknownMeasuresViewModel$deleteSelectedMeasurements$1", f = "UnknownMeasuresActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class h extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ i f58353a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, qm0.d<? super h> dVar) {
        super(2, dVar);
        this.f58353a = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new h(this.f58353a, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((h) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        l.b(obj);
        i iVar = this.f58353a;
        ih0.a f02 = i.f0(iVar);
        List<? extends MeasuresGroup> list = (List) iVar.g0().getValue();
        if (list == null) {
            list = i0.f76187a;
        }
        f02.b(list);
        return y.f85009a;
    }
}
