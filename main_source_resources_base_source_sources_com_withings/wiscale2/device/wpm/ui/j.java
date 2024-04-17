package com.withings.wiscale2.device.wpm.ui;

import com.withings.library.measure.MeasuresGroup;
import com.withings.wiscale2.device.wpm.ui.Wpm0203Activity;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Wpm0203Activity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.wpm.ui.Wpm0203Activity$Wpm02ViewModel$deleteMeasureGroup$1", f = "Wpm0203Activity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class j extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MeasuresGroup f55748a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Wpm0203Activity.d f55749b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(MeasuresGroup measuresGroup, Wpm0203Activity.d dVar, qm0.d<? super j> dVar2) {
        super(2, dVar2);
        this.f55748a = measuresGroup;
        this.f55749b = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new j(this.f55748a, this.f55749b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((j) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        sw.a z5 = sw.a.z();
        kotlin.jvm.internal.u.i(z5, "get(...)");
        zx.v vVar = new zx.v(z5);
        zx.j a11 = zx.j.f111082d.a();
        new fy.a(vVar, new fy.d(vVar, a11), new ey.a(new fy.x(new ey.b(vVar))), a11).b(hy.g.a(this.f55748a));
        this.f55749b.U0().postValue(null);
        return nm0.y.f85009a;
    }
}
