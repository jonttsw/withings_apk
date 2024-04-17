package com.withings.healthscore.ui.exploredata;

import com.withings.common.compose.component.m4;
import com.withings.common.compose.component.t1;
import com.withings.graph.filters.Filter;
import java.util.List;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import nm0.l;
import nm0.y;
import org.joda.time.Interval;
import ws.b;
import ym0.s;
/* compiled from: HealthScoreExploreDataActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.healthscore.ui.exploredata.HealthScoreExploreDataActivity$initFlows$1", f = "HealthScoreExploreDataActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class b extends kotlin.coroutines.jvm.internal.i implements s<ts.e, m4, Interval, g, qm0.d<? super b.C1829b>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ ts.e f40563a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ m4 f40564b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Interval f40565c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ g f40566d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ t1 f40567e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ HealthScoreExploreDataActivity f40568f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(t1 t1Var, HealthScoreExploreDataActivity healthScoreExploreDataActivity, qm0.d<? super b> dVar) {
        super(5, dVar);
        this.f40567e = t1Var;
        this.f40568f = healthScoreExploreDataActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        HealthScoreExploreDataViewModel B3;
        HealthScoreExploreDataViewModel B32;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        l.b(obj);
        ts.e eVar = this.f40563a;
        m4 m4Var = this.f40564b;
        Interval interval = this.f40565c;
        g gVar = this.f40566d;
        List V = x.V(new nm0.j(this.f40567e, m4Var));
        HealthScoreExploreDataActivity healthScoreExploreDataActivity = this.f40568f;
        B3 = healthScoreExploreDataActivity.B3();
        at.a j02 = B3.j0();
        Filter filter = Filter.f39917a;
        B32 = healthScoreExploreDataActivity.B3();
        return new b.C1829b(interval, V, j02, gVar, B32.g0(), x.V(eVar));
    }

    @Override // ym0.s
    public final Object k(ts.e eVar, m4 m4Var, Interval interval, g gVar, qm0.d<? super b.C1829b> dVar) {
        b bVar = new b(this.f40567e, this.f40568f, dVar);
        bVar.f40563a = eVar;
        bVar.f40564b = m4Var;
        bVar.f40565c = interval;
        bVar.f40566d = gVar;
        return bVar.invokeSuspend(y.f85009a);
    }
}
