package com.withings.weight.ui.limbExplore;

import android.app.Application;
import androidx.lifecycle.h1;
import com.withings.common.compose.component.m4;
import com.withings.periodsbar.Period;
import com.withings.weight.core.model.LimbModel;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.joda.time.DateTime;
import org.joda.time.Interval;
import ws.b;
/* compiled from: SegmentalLimbExploreViewModel.kt */
/* loaded from: classes4.dex */
public final class a0 extends androidx.lifecycle.b {

    /* renamed from: a  reason: collision with root package name */
    private final v90.g f47665a;

    /* renamed from: b  reason: collision with root package name */
    private final v90.c f47666b;

    /* renamed from: c  reason: collision with root package name */
    private final r70.c f47667c;

    /* renamed from: d  reason: collision with root package name */
    private final a f47668d;

    /* renamed from: e  reason: collision with root package name */
    private final v90.f f47669e;

    /* renamed from: f  reason: collision with root package name */
    private final l70.u f47670f;

    /* renamed from: g  reason: collision with root package name */
    private final SharedFlow<Boolean> f47671g;

    /* renamed from: h  reason: collision with root package name */
    private final MutableStateFlow<Interval> f47672h;

    /* renamed from: i  reason: collision with root package name */
    private final at.a f47673i;

    /* renamed from: j  reason: collision with root package name */
    private final SharedFlow<Interval> f47674j;

    /* renamed from: k  reason: collision with root package name */
    private final SharedFlow<m> f47675k;

    /* renamed from: l  reason: collision with root package name */
    private final SharedFlow<List<ts.d>> f47676l;

    /* renamed from: m  reason: collision with root package name */
    private final SharedFlow<o> f47677m;

    /* renamed from: n  reason: collision with root package name */
    private final SharedFlow<p> f47678n;

    /* renamed from: o  reason: collision with root package name */
    private final SharedFlow<List<m4>> f47679o;

    /* renamed from: p  reason: collision with root package name */
    private final StateFlow<ws.b> f47680p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(long j5, LimbModel limb, DateTime initialDate, Period period, jm.a aVar, Application application, v90.g gVar, t80.c cVar, v90.c cVar2, r70.c userRepository, a aVar2, v90.f fVar) {
        super(application);
        kotlin.jvm.internal.u.j(limb, "limb");
        kotlin.jvm.internal.u.j(initialDate, "initialDate");
        kotlin.jvm.internal.u.j(period, "period");
        kotlin.jvm.internal.u.j(userRepository, "userRepository");
        this.f47665a = gVar;
        this.f47666b = cVar2;
        this.f47667c = userRepository;
        this.f47668d = aVar2;
        this.f47669e = fVar;
        this.f47670f = aVar.g(1);
        w wVar = new w(FlowKt.filterNotNull(userRepository.g(j5)));
        CoroutineScope a11 = h1.a(this);
        SharingStarted.Companion companion = SharingStarted.Companion;
        SharedFlow<Boolean> shareIn = FlowKt.shareIn(wVar, a11, companion.getEagerly(), 1);
        this.f47671g = shareIn;
        MutableStateFlow<Interval> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.f47672h = MutableStateFlow;
        this.f47673i = new at.a(h20.a.c(period), initialDate);
        SharedFlow<Interval> shareIn2 = FlowKt.shareIn(FlowKt.flow(new q(this, j5, null)), h1.a(this), companion.getEagerly(), 1);
        this.f47674j = shareIn2;
        SharedFlow<m> shareIn3 = FlowKt.shareIn(new x(cVar.a(limb, j5, null, null, true), limb), h1.a(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
        this.f47675k = shareIn3;
        SharedFlow<List<ts.d>> shareIn4 = FlowKt.shareIn(FlowKt.combine(shareIn3, shareIn, new r(this, null)), h1.a(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
        this.f47676l = shareIn4;
        SharedFlow<o> shareIn5 = FlowKt.shareIn(FlowKt.combine(shareIn3, shareIn2, shareIn, new s(this, null)), h1.a(this), companion.getEagerly(), 1);
        this.f47677m = shareIn5;
        SharedFlow<p> shareIn6 = FlowKt.shareIn(new y(shareIn, this), h1.a(this), companion.getEagerly(), 1);
        this.f47678n = shareIn6;
        SharedFlow<List<m4>> shareIn7 = FlowKt.shareIn(FlowKt.transformLatest(MutableStateFlow, new v(null, this, limb, j5)), h1.a(this), SharingStarted.Companion.WhileSubscribed$default(companion, 0L, 0L, 3, null), 1);
        this.f47679o = shareIn7;
        this.f47680p = FlowKt.stateIn(FlowKt.combine(MutableStateFlow, shareIn5, shareIn7, shareIn6, shareIn4, new z(application, this, null)), h1.a(this), companion.getLazily(), b.a.f106052a);
    }

    public static final String f0(a0 a0Var, v90.h hVar, boolean z5, boolean z11) {
        l70.u uVar = a0Var.f47670f;
        Double d11 = null;
        v90.f fVar = a0Var.f47669e;
        if (z5 && z11) {
            if (hVar != null) {
                d11 = Double.valueOf(hVar.e());
            }
            return fVar.a(d11, true, uVar);
        } else if (z5 && !z11) {
            if (hVar != null) {
                d11 = Double.valueOf(hVar.d());
            }
            return fVar.a(d11, false, uVar);
        } else if (!z5 && z11) {
            if (hVar != null) {
                d11 = Double.valueOf(hVar.c());
            }
            return fVar.a(d11, true, uVar);
        } else {
            if (hVar != null) {
                d11 = Double.valueOf(hVar.b());
            }
            return fVar.a(d11, false, uVar);
        }
    }

    public final StateFlow<ws.b> t0() {
        return this.f47680p;
    }
}
