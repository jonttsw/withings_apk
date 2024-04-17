package com.withings.wiscale2.coretemperature.ui;

import android.content.Context;
import com.withings.graph.filters.Filter;
import com.withings.wiscale2.coretemperature.ui.n;
import k1.r0;
import kotlin.collections.i0;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import nm0.y;
import org.joda.time.Interval;
import ws.b;
import ym0.r;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ExploreCoreTemperatureActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.coretemperature.ui.ExploreCoreTemperatureActivityKt$rememberExploreDataState$1$1", f = "ExploreCoreTemperatureActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class f extends kotlin.coroutines.jvm.internal.i implements r<xs.c, ts.d, n.b, qm0.d<? super b.C1829b>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ xs.c f50432a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ ts.d f50433b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ n.b f50434c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ r0<ys.e> f50435d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Context f50436e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(r0<ys.e> r0Var, Context context, qm0.d<? super f> dVar) {
        super(4, dVar);
        this.f50435d = r0Var;
        this.f50436e = context;
    }

    @Override // ym0.r
    public final Object invoke(xs.c cVar, ts.d dVar, n.b bVar, qm0.d<? super b.C1829b> dVar2) {
        f fVar = new f(this.f50435d, this.f50436e, dVar2);
        fVar.f50432a = cVar;
        fVar.f50433b = dVar;
        fVar.f50434c = bVar;
        return fVar.invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        xs.c cVar = this.f50432a;
        ts.d dVar = this.f50433b;
        n.b bVar = this.f50434c;
        Interval c11 = bVar.c();
        i0 i0Var = i0.f76187a;
        at.a b10 = bVar.b();
        Filter filter = Filter.f39917a;
        return new b.C1829b(c11, i0Var, b10, cVar, new ys.b(this.f50435d, this.f50436e, "°C", null, false, 24), x.V(dVar));
    }
}
