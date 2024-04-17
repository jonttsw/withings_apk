package com.withings.weight.ui.limbExplore;

import android.app.Application;
import com.withings.common.compose.component.m4;
import com.withings.common.compose.component.t1;
import com.withings.graph.filters.Filter;
import com.withings.wiscale2.C1987R;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.joda.time.Interval;
import ws.b;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SegmentalLimbExploreViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.ui.limbExplore.SegmentalLimbExploreViewModel$uiState$1", f = "SegmentalLimbExploreViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class z extends kotlin.coroutines.jvm.internal.i implements ym0.t<Interval, o, List<? extends m4>, p, List<? extends ts.d>, qm0.d<? super b.C1829b>, Object> {

    /* renamed from: a  reason: collision with root package name */
    /* synthetic */ Interval f47753a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ o f47754b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ List f47755c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ p f47756d;

    /* renamed from: e  reason: collision with root package name */
    /* synthetic */ List f47757e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ Application f47758f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ a0 f47759g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Application application, a0 a0Var, qm0.d<? super z> dVar) {
        super(6, dVar);
        this.f47758f = application;
        this.f47759g = a0Var;
    }

    @Override // ym0.t
    public final Object c(Interval interval, o oVar, List<? extends m4> list, p pVar, List<? extends ts.d> list2, qm0.d<? super b.C1829b> dVar) {
        z zVar = new z(this.f47758f, this.f47759g, dVar);
        zVar.f47753a = interval;
        zVar.f47754b = oVar;
        zVar.f47755c = list;
        zVar.f47756d = pVar;
        zVar.f47757e = list2;
        return zVar.invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        at.a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        Interval interval = this.f47753a;
        o oVar = this.f47754b;
        List list = this.f47755c;
        Application application = this.f47758f;
        String string = application.getString(C1987R.string.muscle_legend_name);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        nm0.j jVar = new nm0.j(new t1(string, new Integer((int) C1987R.drawable.legend_label_circle_muscle_mass)), list.get(0));
        String string2 = application.getString(C1987R.string.fat_legend_name);
        kotlin.jvm.internal.u.i(string2, "getString(...)");
        List W = kotlin.collections.x.W(jVar, new nm0.j(new t1(string2, new Integer((int) C1987R.drawable.legend_label_square_fat_mass)), list.get(1)));
        aVar = this.f47759g.f47673i;
        Filter filter = Filter.f39917a;
        return new b.C1829b(interval, W, aVar, oVar, this.f47756d, this.f47757e);
    }
}
