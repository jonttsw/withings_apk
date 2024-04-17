package com.withings.fever.ui;

import androidx.lifecycle.g1;
import androidx.lifecycle.h1;
import com.withings.fever.ui.e0;
import com.withings.graph.GraphPeriod;
import com.withings.learnmore.adapter.LearnMoreEntryTranslations;
import com.withings.learnmore.adapter.LearnMoreManager;
import com.withings.periodsbar.Period;
import com.withings.user.core.models.User;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import org.joda.time.DateTime;
import org.joda.time.Interval;
/* compiled from: BodyTemperatureViewModel.kt */
/* loaded from: classes3.dex */
public final class o0 extends g1 {

    /* renamed from: a  reason: collision with root package name */
    private final iy.e f39381a;

    /* renamed from: b  reason: collision with root package name */
    private final yr.a f39382b;

    /* renamed from: c  reason: collision with root package name */
    private final ky.c f39383c;

    /* renamed from: d  reason: collision with root package name */
    private final r70.c f39384d;

    /* renamed from: e  reason: collision with root package name */
    private final v90.g f39385e;

    /* renamed from: f  reason: collision with root package name */
    private final LearnMoreManager f39386f;

    /* renamed from: g  reason: collision with root package name */
    private final ox.c f39387g;

    /* renamed from: h  reason: collision with root package name */
    private final Flow<User> f39388h;

    /* renamed from: i  reason: collision with root package name */
    private final Flow<User> f39389i;

    /* renamed from: j  reason: collision with root package name */
    private final i0 f39390j;

    /* renamed from: k  reason: collision with root package name */
    private final MutableSharedFlow<Interval> f39391k;

    /* renamed from: l  reason: collision with root package name */
    private final Flow<Interval> f39392l;

    /* renamed from: m  reason: collision with root package name */
    private final at.a f39393m;

    /* renamed from: n  reason: collision with root package name */
    private final Flow<List<as.h>> f39394n;

    /* renamed from: o  reason: collision with root package name */
    private final SharedFlow<List<LearnMoreEntryTranslations>> f39395o;

    /* renamed from: p  reason: collision with root package name */
    private final SharedFlow<bs.b> f39396p;

    /* renamed from: q  reason: collision with root package name */
    private final StateFlow<e0> f39397q;

    public o0(Long l5, iy.e measuresGroupRepositoryV2, yr.a aVar, ky.c measureListenerManagerInterface, r70.c userRepository, v90.g gVar, LearnMoreManager learnMoreManager, ox.c cVar) {
        Period period = Period.f43723h;
        kotlin.jvm.internal.u.j(measuresGroupRepositoryV2, "measuresGroupRepositoryV2");
        kotlin.jvm.internal.u.j(measureListenerManagerInterface, "measureListenerManagerInterface");
        kotlin.jvm.internal.u.j(userRepository, "userRepository");
        this.f39381a = measuresGroupRepositoryV2;
        this.f39382b = aVar;
        this.f39383c = measureListenerManagerInterface;
        this.f39384d = userRepository;
        this.f39385e = gVar;
        this.f39386f = learnMoreManager;
        this.f39387g = cVar;
        Flow<User> flowOf = (l5 == null || (flowOf = userRepository.g(l5.longValue())) == null) ? FlowKt.flowOf(null) : flowOf;
        this.f39388h = flowOf;
        Flow<User> filterNotNull = FlowKt.filterNotNull(flowOf);
        this.f39389i = filterNotNull;
        i0 i0Var = new i0(filterNotNull, this);
        this.f39390j = i0Var;
        MutableSharedFlow<Interval> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, null, 6, null);
        this.f39391k = MutableSharedFlow$default;
        Flow<Interval> merge = FlowKt.merge(MutableSharedFlow$default, i0Var);
        this.f39392l = merge;
        GraphPeriod c11 = h20.a.c(period);
        DateTime withTimeAtStartOfDay = DateTime.now().withTimeAtStartOfDay();
        kotlin.jvm.internal.u.i(withTimeAtStartOfDay, "withTimeAtStartOfDay(...)");
        this.f39393m = new at.a(c11, withTimeAtStartOfDay);
        Flow<List<as.h>> transformLatest = FlowKt.transformLatest(filterNotNull, new h0(this, null));
        this.f39394n = transformLatest;
        Flow flowOn = FlowKt.flowOn(FlowKt.flow(new f0(this, null)), Dispatchers.getIO());
        CoroutineScope a11 = h1.a(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        SharedFlow<List<LearnMoreEntryTranslations>> shareIn = FlowKt.shareIn(flowOn, a11, companion.getEagerly(), 1);
        this.f39395o = shareIn;
        SharedFlow<bs.b> shareIn2 = FlowKt.shareIn(new j0(w70.b.b(filterNotNull, merge, new l0(this, null))), h1.a(this), companion.getLazily(), 1);
        this.f39396p = shareIn2;
        this.f39397q = FlowKt.stateIn(FlowKt.combine(filterNotNull, transformLatest, i0Var, shareIn, shareIn2, new k0(this, null)), h1.a(this), companion.getLazily(), e0.a.f39227a);
    }

    public static final void t0(o0 o0Var, GraphPeriod graphPeriod, DateTime dateTime) {
        at.a.h(o0Var.f39393m, graphPeriod, dateTime);
    }

    public final StateFlow<e0> y0() {
        return this.f39397q;
    }
}
