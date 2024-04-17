package com.withings.wiscale2.sleep.ui.sleepscore;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.withings.graph.GraphView;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.measure.detail.graduation.week.WeeklyLegendView;
import com.withings.user.User;
import com.withings.util.log.Fail;
import com.withings.views.graphs.GraphPopupView;
import com.withings.views.widget.LineCellView;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.sleep.libc.SleepScoreRecalculator;
import com.withings.wiscale2.track.data.SleepScore;
import com.withings.wiscale2.track.data.SleepScoreColorHelper;
import com.withings.wiscale2.track.data.SleepScoreHelper;
import com.withings.wiscale2.track.data.SleepScoreHelperKt;
import com.withings.wiscale2.track.data.Track;
import com.withings.wiscale2.track.data.TrackKt;
import ii0.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import pm.e;
/* compiled from: SleepScoreRegularityActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/sleep/ui/sleepscore/SleepScoreRegularityActivity;", "Lcom/withings/wiscale2/sleep/ui/sleepscore/BaseSleepDetailActivity;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SleepScoreRegularityActivity extends Hilt_SleepScoreRegularityActivity {
    private SleepScore.Info A;
    @Inject

    /* renamed from: g  reason: collision with root package name */
    public ei0.q f60723g;

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f60724h = nm0.h.b(new q());

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f60725i = nm0.h.b(new h());

    /* renamed from: j  reason: collision with root package name */
    private final nm0.g f60726j = nm0.h.b(new k());

    /* renamed from: k  reason: collision with root package name */
    private final nm0.g f60727k = nm0.h.b(new i());

    /* renamed from: l  reason: collision with root package name */
    private final nm0.g f60728l = nm0.h.b(new j());

    /* renamed from: m  reason: collision with root package name */
    private final nm0.g f60729m = nm0.h.b(new s());

    /* renamed from: n  reason: collision with root package name */
    private final nm0.g f60730n = nm0.h.b(new t());

    /* renamed from: o  reason: collision with root package name */
    private final nm0.g f60731o = nm0.h.b(new r());

    /* renamed from: p  reason: collision with root package name */
    private final nm0.g f60732p = nm0.h.b(new g());

    /* renamed from: q  reason: collision with root package name */
    private final nm0.g f60733q = nm0.h.b(new e());

    /* renamed from: r  reason: collision with root package name */
    private final nm0.g f60734r = nm0.h.b(new f());

    /* renamed from: s  reason: collision with root package name */
    private final o f60735s = new o(this);

    /* renamed from: t  reason: collision with root package name */
    private final p f60736t = new p(this);

    /* renamed from: u  reason: collision with root package name */
    private final nm0.g f60737u = nm0.h.b(new m());

    /* renamed from: v  reason: collision with root package name */
    private final nm0.g f60738v = nm0.h.b(c.f60744a);

    /* renamed from: w  reason: collision with root package name */
    private final nm0.g f60739w = nm0.h.b(d.f60745a);

    /* renamed from: x  reason: collision with root package name */
    private final nm0.g f60740x = nm0.h.b(b.f60743a);

    /* renamed from: y  reason: collision with root package name */
    private final nm0.g f60741y = nm0.h.b(new n());

    /* renamed from: z  reason: collision with root package name */
    private Track f60742z;
    static final /* synthetic */ fn0.k<Object>[] F = {androidx.camera.core.v.c(SleepScoreRegularityActivity.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0), androidx.camera.core.v.c(SleepScoreRegularityActivity.class, "sleepTrackId", "getSleepTrackId()J", 0)};
    public static final a B = new Object();

    /* compiled from: SleepScoreRegularityActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    /* compiled from: SleepScoreRegularityActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<List<String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f60743a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final List<String> invoke() {
            return new ArrayList();
        }
    }

    /* compiled from: SleepScoreRegularityActivity.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<List<String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f60744a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final List<String> invoke() {
            return new ArrayList();
        }
    }

    /* compiled from: SleepScoreRegularityActivity.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<List<String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f60745a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final List<String> invoke() {
            return new ArrayList();
        }
    }

    /* compiled from: SleepScoreRegularityActivity.kt */
    /* loaded from: classes5.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.a<LineCellView> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final LineCellView invoke() {
            return (LineCellView) SleepScoreRegularityActivity.this.findViewById(C1987R.id.average_bed_in);
        }
    }

    /* compiled from: SleepScoreRegularityActivity.kt */
    /* loaded from: classes5.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.a<LineCellView> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final LineCellView invoke() {
            return (LineCellView) SleepScoreRegularityActivity.this.findViewById(C1987R.id.average_bed_out);
        }
    }

    /* compiled from: SleepScoreRegularityActivity.kt */
    /* loaded from: classes5.dex */
    static final class g extends kotlin.jvm.internal.w implements ym0.a<View> {
        g() {
            super(0);
        }

        @Override // ym0.a
        public final View invoke() {
            return SleepScoreRegularityActivity.this.findViewById(C1987R.id.average_container);
        }
    }

    /* compiled from: SleepScoreRegularityActivity.kt */
    /* loaded from: classes5.dex */
    static final class h extends kotlin.jvm.internal.w implements ym0.a<TextView> {
        h() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) SleepScoreRegularityActivity.this.findViewById(C1987R.id.bottom_text);
        }
    }

    /* compiled from: SleepScoreRegularityActivity.kt */
    /* loaded from: classes5.dex */
    static final class i extends kotlin.jvm.internal.w implements ym0.a<View> {
        i() {
            super(0);
        }

        @Override // ym0.a
        public final View invoke() {
            return SleepScoreRegularityActivity.this.findViewById(C1987R.id.graph_container);
        }
    }

    /* compiled from: SleepScoreRegularityActivity.kt */
    /* loaded from: classes5.dex */
    static final class j extends kotlin.jvm.internal.w implements ym0.a<WeeklyLegendView> {
        j() {
            super(0);
        }

        @Override // ym0.a
        public final WeeklyLegendView invoke() {
            return (WeeklyLegendView) SleepScoreRegularityActivity.this.findViewById(C1987R.id.weeklyTimeLine);
        }
    }

    /* compiled from: SleepScoreRegularityActivity.kt */
    /* loaded from: classes5.dex */
    static final class k extends kotlin.jvm.internal.w implements ym0.a<TextView> {
        k() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) SleepScoreRegularityActivity.this.findViewById(C1987R.id.graph_title);
        }
    }

    /* compiled from: SleepScoreRegularityActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SleepScoreRegularityActivity$onCreate$1", f = "SleepScoreRegularityActivity.kt", l = {87}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class l extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        SleepScoreRegularityActivity f60753a;

        /* renamed from: b  reason: collision with root package name */
        int f60754b;

        /* renamed from: c  reason: collision with root package name */
        private /* synthetic */ Object f60755c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SleepScoreRegularityActivity.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SleepScoreRegularityActivity$onCreate$1$1", f = "SleepScoreRegularityActivity.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super Track>, Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ SleepScoreRegularityActivity f60757a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(SleepScoreRegularityActivity sleepScoreRegularityActivity, qm0.d<? super a> dVar) {
                super(2, dVar);
                this.f60757a = sleepScoreRegularityActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                return new a(this.f60757a, dVar);
            }

            @Override // ym0.p
            public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super Track> dVar) {
                return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                nm0.l.b(obj);
                SleepScoreRegularityActivity sleepScoreRegularityActivity = this.f60757a;
                ei0.q qVar = sleepScoreRegularityActivity.f60723g;
                if (qVar != null) {
                    return qVar.o(SleepScoreRegularityActivity.F3(sleepScoreRegularityActivity));
                }
                kotlin.jvm.internal.u.s("sleepTrackManager");
                throw null;
            }
        }

        l(qm0.d<? super l> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            l lVar = new l(dVar);
            lVar.f60755c = obj;
            return lVar;
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((l) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            SleepScoreRegularityActivity sleepScoreRegularityActivity;
            SleepScore.Info info;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f60754b;
            SleepScoreRegularityActivity sleepScoreRegularityActivity2 = SleepScoreRegularityActivity.this;
            if (i11 != 0) {
                if (i11 == 1) {
                    sleepScoreRegularityActivity = this.f60753a;
                    CoroutineScope coroutineScope = (CoroutineScope) this.f60755c;
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(sleepScoreRegularityActivity2, null);
                this.f60755c = (CoroutineScope) this.f60755c;
                this.f60753a = sleepScoreRegularityActivity2;
                this.f60754b = 1;
                obj = BuildersKt.withContext(io2, aVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                sleepScoreRegularityActivity = sleepScoreRegularityActivity2;
            }
            sleepScoreRegularityActivity.f60742z = (Track) obj;
            Track track = sleepScoreRegularityActivity2.f60742z;
            if (track != null) {
                SleepScore sleepScore = track.getSleepScore();
                if (sleepScore != null) {
                    info = sleepScore.getRegularity();
                } else {
                    info = null;
                }
                if (info != null) {
                    sleepScoreRegularityActivity2.A = info;
                    SleepScoreRegularityActivity.H3(sleepScoreRegularityActivity2);
                    SleepScore.Info info2 = sleepScoreRegularityActivity2.A;
                    if (info2 != null) {
                        if (info2.getStatus() != SleepScoreHelperKt.getSleepScoreConstants().getStatusError()) {
                            SleepScore.Info info3 = sleepScoreRegularityActivity2.A;
                            if (info3 != null) {
                                if (info3.getStatus() != SleepScoreHelperKt.getSleepScoreConstants().getStatusUnknown()) {
                                    SleepScoreRegularityActivity.I3(sleepScoreRegularityActivity2);
                                    return nm0.y.f85009a;
                                }
                            } else {
                                kotlin.jvm.internal.u.s("regularityInfo");
                                throw null;
                            }
                        }
                        SleepScoreRegularityActivity.N3(sleepScoreRegularityActivity2);
                        return nm0.y.f85009a;
                    }
                    kotlin.jvm.internal.u.s("regularityInfo");
                    throw null;
                }
                sleepScoreRegularityActivity2.finish();
                return nm0.y.f85009a;
            }
            kotlin.jvm.internal.u.s("sleepTrack");
            throw null;
        }
    }

    /* compiled from: SleepScoreRegularityActivity.kt */
    /* loaded from: classes5.dex */
    static final class m extends kotlin.jvm.internal.w implements ym0.a<Random> {
        m() {
            super(0);
        }

        @Override // ym0.a
        public final Random invoke() {
            return new Random(SleepScoreRegularityActivity.F3(SleepScoreRegularityActivity.this));
        }
    }

    /* compiled from: SleepScoreRegularityActivity.kt */
    /* loaded from: classes5.dex */
    static final class n extends kotlin.jvm.internal.w implements ym0.a<SleepScoreRecalculator> {
        n() {
            super(0);
        }

        @Override // ym0.a
        public final SleepScoreRecalculator invoke() {
            return SleepScoreRecalculator.Companion.get$default(SleepScoreRecalculator.Companion, SleepScoreRegularityActivity.G3(SleepScoreRegularityActivity.this).q(), null, 2, null);
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class o implements bn0.d<Activity, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f60760a = nm0.h.b(new j3(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f60761b;

        public o(Activity activity) {
            this.f60761b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f60760a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class p implements bn0.d<Activity, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f60762a = nm0.h.b(new k3(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f60763b;

        public p(Activity activity) {
            this.f60763b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f60762a.getValue();
        }
    }

    /* compiled from: SleepScoreRegularityActivity.kt */
    /* loaded from: classes5.dex */
    static final class q extends kotlin.jvm.internal.w implements ym0.a<TextView> {
        q() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) SleepScoreRegularityActivity.this.findViewById(C1987R.id.top_text);
        }
    }

    /* compiled from: SleepScoreRegularityActivity.kt */
    /* loaded from: classes5.dex */
    static final class r extends kotlin.jvm.internal.w implements ym0.a<GraphPopupView> {
        r() {
            super(0);
        }

        @Override // ym0.a
        public final GraphPopupView invoke() {
            return (GraphPopupView) SleepScoreRegularityActivity.this.findViewById(C1987R.id.view_popup);
        }
    }

    /* compiled from: SleepScoreRegularityActivity.kt */
    /* loaded from: classes5.dex */
    static final class s extends kotlin.jvm.internal.w implements ym0.a<ProgressBar> {
        s() {
            super(0);
        }

        @Override // ym0.a
        public final ProgressBar invoke() {
            return (ProgressBar) SleepScoreRegularityActivity.this.findViewById(C1987R.id.graph_loading);
        }
    }

    /* compiled from: SleepScoreRegularityActivity.kt */
    /* loaded from: classes5.dex */
    static final class t extends kotlin.jvm.internal.w implements ym0.a<GraphView> {
        t() {
            super(0);
        }

        @Override // ym0.a
        public final GraphView invoke() {
            return (GraphView) SleepScoreRegularityActivity.this.findViewById(C1987R.id.week_sleep_graph);
        }
    }

    public static final long F3(SleepScoreRegularityActivity sleepScoreRegularityActivity) {
        return ((Number) sleepScoreRegularityActivity.f60736t.getValue(sleepScoreRegularityActivity, F[1])).longValue();
    }

    public static final User G3(SleepScoreRegularityActivity sleepScoreRegularityActivity) {
        sleepScoreRegularityActivity.getClass();
        return (User) sleepScoreRegularityActivity.f60735s.getValue(sleepScoreRegularityActivity, F[0]);
    }

    public static final void H3(SleepScoreRegularityActivity sleepScoreRegularityActivity) {
        String string;
        String string2 = sleepScoreRegularityActivity.getString(C1987R.string.sleepScore_regularity);
        kotlin.jvm.internal.u.i(string2, "getString(...)");
        SleepScore.Info info = sleepScoreRegularityActivity.A;
        if (info != null) {
            int status = info.getStatus();
            if (status == SleepScoreHelperKt.getSleepScoreConstants().getStatusGood()) {
                string = sleepScoreRegularityActivity.getString(C1987R.string.sleepScore_regularityRegular);
            } else if (status == SleepScoreHelperKt.getSleepScoreConstants().getStatusAverage()) {
                string = sleepScoreRegularityActivity.getString(C1987R.string.sleepScore_regularityAverage);
            } else if (status == SleepScoreHelperKt.getSleepScoreConstants().getStatusBad()) {
                string = sleepScoreRegularityActivity.getString(C1987R.string.sleepScore_regularityIrregular);
            } else if (status == SleepScoreHelperKt.getSleepScoreConstants().getStatusUnknown()) {
                string = sleepScoreRegularityActivity.getString(C1987R.string.sleepScore_regularityUnknown);
            } else if (status == SleepScoreHelperKt.getSleepScoreConstants().getStatusError()) {
                string = sleepScoreRegularityActivity.getString(C1987R.string.sleepScore_regularityUnknown);
            } else {
                SleepScore.Info info2 = sleepScoreRegularityActivity.A;
                if (info2 != null) {
                    Integer valueOf = Integer.valueOf(info2.getStatus());
                    Fail.j("Illegal regularity status " + valueOf);
                    string = sleepScoreRegularityActivity.getString(C1987R.string.sleepScore_regularityUnknown);
                } else {
                    kotlin.jvm.internal.u.s("regularityInfo");
                    throw null;
                }
            }
            kotlin.jvm.internal.u.g(string);
            sleepScoreRegularityActivity.B3(string2, string);
            SleepScoreHelper sleepScoreHelper = SleepScoreHelper.INSTANCE;
            SleepScore.Info info3 = sleepScoreRegularityActivity.A;
            if (info3 != null) {
                int sleepScoreGlyph = sleepScoreHelper.getSleepScoreGlyph(info3);
                SleepScoreColorHelper sleepScoreColorHelper = SleepScoreColorHelper.INSTANCE;
                SleepScore.Info info4 = sleepScoreRegularityActivity.A;
                if (info4 != null) {
                    int statusTextGlyphColor = sleepScoreColorHelper.getStatusTextGlyphColor(info4, true);
                    SleepScore.Info info5 = sleepScoreRegularityActivity.A;
                    if (info5 != null) {
                        sleepScoreRegularityActivity.C3(sleepScoreGlyph, statusTextGlyphColor, sleepScoreColorHelper.getSleepInfoColorRes(info5));
                        return;
                    } else {
                        kotlin.jvm.internal.u.s("regularityInfo");
                        throw null;
                    }
                }
                kotlin.jvm.internal.u.s("regularityInfo");
                throw null;
            }
            kotlin.jvm.internal.u.s("regularityInfo");
            throw null;
        }
        kotlin.jvm.internal.u.s("regularityInfo");
        throw null;
    }

    public static final void I3(SleepScoreRegularityActivity sleepScoreRegularityActivity) {
        ((ProgressBar) sleepScoreRegularityActivity.f60729m.getValue()).setVisibility(0);
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(sleepScoreRegularityActivity), null, null, new h3(sleepScoreRegularityActivity, null), 3, null);
    }

    public static final ArrayList J3(SleepScoreRegularityActivity sleepScoreRegularityActivity) {
        sleepScoreRegularityActivity.getClass();
        en0.i iVar = new en0.i(6, 0, -1);
        ArrayList arrayList = new ArrayList();
        en0.j it = iVar.iterator();
        while (it.hasNext()) {
            int a11 = it.a();
            Track track = sleepScoreRegularityActivity.f60742z;
            Track track2 = null;
            if (track != null) {
                DateTime minusDays = TrackKt.getEffectiveEndDate(track).minusDays(a11);
                ei0.q qVar = ei0.q.f65441d;
                if (qVar != null) {
                    long q11 = ((User) sleepScoreRegularityActivity.f60735s.getValue(sleepScoreRegularityActivity, F[0])).q();
                    kotlin.jvm.internal.u.g(minusDays);
                    Track C = qVar.C(q11, minusDays, (SleepScoreRecalculator) sleepScoreRegularityActivity.f60741y.getValue());
                    if (C != null && (!C.isInProgress())) {
                        track2 = C;
                    }
                    if (track2 != null) {
                        arrayList.add(track2);
                    }
                } else {
                    kotlin.jvm.internal.u.s("instance");
                    throw null;
                }
            } else {
                kotlin.jvm.internal.u.s("sleepTrack");
                throw null;
            }
        }
        return arrayList;
    }

    public static final void M3(SleepScoreRegularityActivity sleepScoreRegularityActivity, List list) {
        int i11;
        int i12;
        int minuteOfDay;
        int intValue;
        int i13;
        List<String> Q3;
        int i14;
        Track track;
        ((ProgressBar) sleepScoreRegularityActivity.f60729m.getValue()).setVisibility(8);
        Track track2 = sleepScoreRegularityActivity.f60742z;
        if (track2 != null) {
            DateTime plusDays = TrackKt.getEffectiveEndDate(track2).minusWeeks(1).plusDays(1);
            ((WeeklyLegendView) sleepScoreRegularityActivity.f60728l.getValue()).setFirstDay(plusDays);
            a.c cVar = new a.c();
            cVar.f(list);
            List<Track> c11 = cVar.c();
            ArrayList arrayList = new ArrayList();
            for (Object obj : c11) {
                Long id2 = ((Track) obj).getId();
                if (sleepScoreRegularityActivity.f60742z != null) {
                    if (!kotlin.jvm.internal.u.e(id2, track.getId())) {
                        arrayList.add(obj);
                    }
                } else {
                    kotlin.jvm.internal.u.s("sleepTrack");
                    throw null;
                }
            }
            ArrayList arrayList2 = new ArrayList(kotlin.collections.x.y(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Track track3 = (Track) it.next();
                int minuteOfDay2 = TrackKt.getEffectiveStartDate(track3).getMinuteOfDay();
                int minuteOfDay3 = TrackKt.getEffectiveEndDate(track3).getMinuteOfDay();
                if (minuteOfDay2 > minuteOfDay3) {
                    minuteOfDay2 -= 1440;
                }
                arrayList2.add(new nm0.j(Integer.valueOf(minuteOfDay2), Integer.valueOf(minuteOfDay3)));
            }
            ArrayList arrayList3 = new ArrayList(kotlin.collections.x.y(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(Integer.valueOf(((Number) ((nm0.j) it2.next()).c()).intValue()));
            }
            double w11 = kotlin.collections.x.w(arrayList3);
            Double valueOf = Double.valueOf(w11);
            if (Double.isNaN(w11)) {
                valueOf = null;
            }
            int i15 = 0;
            if (valueOf != null) {
                i11 = Integer.valueOf((int) valueOf.doubleValue());
            } else {
                i11 = 0;
            }
            cVar.d(i11);
            ArrayList arrayList4 = new ArrayList(kotlin.collections.x.y(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList4.add(Integer.valueOf(((Number) ((nm0.j) it3.next()).d()).intValue()));
            }
            double w12 = kotlin.collections.x.w(arrayList4);
            Double valueOf2 = Double.valueOf(w12);
            if (Double.isNaN(w12)) {
                valueOf2 = null;
            }
            if (valueOf2 != null) {
                i12 = Integer.valueOf((int) valueOf2.doubleValue());
            } else {
                i12 = 0;
            }
            cVar.e(i12);
            Track track4 = sleepScoreRegularityActivity.f60742z;
            if (track4 != null) {
                Integer a11 = cVar.a();
                Integer b10 = cVar.b();
                if (TrackKt.getEffectiveStartDate(track4).getMinuteOfDay() > TrackKt.getEffectiveEndDate(track4).getMinuteOfDay()) {
                    minuteOfDay = TrackKt.getEffectiveStartDate(track4).getMinuteOfDay() - 1440;
                    if (a11 != null) {
                        intValue = a11.intValue();
                    }
                    intValue = 0;
                } else {
                    minuteOfDay = TrackKt.getEffectiveStartDate(track4).getMinuteOfDay();
                    if (a11 != null) {
                        intValue = a11.intValue();
                    }
                    intValue = 0;
                }
                int i16 = minuteOfDay - intValue;
                int minuteOfDay4 = TrackKt.getEffectiveEndDate(track4).getMinuteOfDay();
                if (b10 != null) {
                    i13 = b10.intValue();
                } else {
                    i13 = 0;
                }
                int i17 = minuteOfDay4 - i13;
                long j5 = (long) DateTimeConstants.MILLIS_PER_MINUTE;
                String O3 = sleepScoreRegularityActivity.O3(Math.abs(i16) * j5);
                String O32 = sleepScoreRegularityActivity.O3(Math.abs(i17) * j5);
                if (i16 >= 0 && i17 >= 0) {
                    sleepScoreRegularityActivity.Q3().add(S3(sleepScoreRegularityActivity, O3, O32, C1987R.string.sleepScoreDetail_regularityIfGoodPart1Alt1LaterLater_formatted));
                    sleepScoreRegularityActivity.R3().add(S3(sleepScoreRegularityActivity, O3, O32, C1987R.string.sleepScoreDetail_regularityIfAveragePart1Alt1LaterLater_formatted));
                    sleepScoreRegularityActivity.P3().add(S3(sleepScoreRegularityActivity, O3, O32, C1987R.string.sleepScoreDetail_regularityIfBadPart1Alt1LaterLater_formatted));
                } else if (i16 >= 0 && i17 <= 0) {
                    sleepScoreRegularityActivity.Q3().add(S3(sleepScoreRegularityActivity, O3, O32, C1987R.string.sleepScoreDetail_regularityIfGoodPart1Alt1LaterEarlier_formatted));
                    sleepScoreRegularityActivity.R3().add(S3(sleepScoreRegularityActivity, O3, O32, C1987R.string.sleepScoreDetail_regularityIfAveragePart1Alt1LaterEarlier_formatted));
                    sleepScoreRegularityActivity.P3().add(S3(sleepScoreRegularityActivity, O3, O32, C1987R.string.sleepScoreDetail_regularityIfBadPart1Alt1LaterEarlier_formatted));
                } else if (i16 <= 0 && i17 >= 0) {
                    sleepScoreRegularityActivity.Q3().add(S3(sleepScoreRegularityActivity, O3, O32, C1987R.string.sleepScoreDetail_regularityIfGoodPart1Alt1EarlierLater_formatted));
                    sleepScoreRegularityActivity.R3().add(S3(sleepScoreRegularityActivity, O3, O32, C1987R.string.sleepScoreDetail_regularityIfAveragePart1Alt1EarlierLater_formatted));
                    sleepScoreRegularityActivity.P3().add(S3(sleepScoreRegularityActivity, O3, O32, C1987R.string.sleepScoreDetail_regularityIfBadPart1Alt1EarlierLater_formatted));
                } else {
                    sleepScoreRegularityActivity.Q3().add(S3(sleepScoreRegularityActivity, O3, O32, C1987R.string.sleepScoreDetail_regularityIfGoodPart1Alt1EarlierEarlier_formatted));
                    sleepScoreRegularityActivity.R3().add(S3(sleepScoreRegularityActivity, O3, O32, C1987R.string.sleepScoreDetail_regularityIfAveragePart1Alt1EarlierEarlier_formatted));
                    sleepScoreRegularityActivity.P3().add(S3(sleepScoreRegularityActivity, O3, O32, C1987R.string.sleepScoreDetail_regularityIfBadPart1Alt1EarlierEarlier_formatted));
                }
                List<String> Q32 = sleepScoreRegularityActivity.Q3();
                String string = sleepScoreRegularityActivity.getString(C1987R.string.sleepScoreDetail_regularityIfGoodPart1Alt2);
                kotlin.jvm.internal.u.i(string, "getString(...)");
                Q32.add(string);
                List<String> Q33 = sleepScoreRegularityActivity.Q3();
                String string2 = sleepScoreRegularityActivity.getString(C1987R.string.sleepScoreDetail_regularityIfGoodPart1Alt3);
                kotlin.jvm.internal.u.i(string2, "getString(...)");
                Q33.add(string2);
                List<String> R3 = sleepScoreRegularityActivity.R3();
                String string3 = sleepScoreRegularityActivity.getString(C1987R.string.sleepScoreDetail_regularityIfAveragePart1Alt2);
                kotlin.jvm.internal.u.i(string3, "getString(...)");
                R3.add(string3);
                List<String> R32 = sleepScoreRegularityActivity.R3();
                String string4 = sleepScoreRegularityActivity.getString(C1987R.string.sleepScoreDetail_regularityIfAveragePart1Alt3);
                kotlin.jvm.internal.u.i(string4, "getString(...)");
                R32.add(string4);
                List<String> P3 = sleepScoreRegularityActivity.P3();
                String string5 = sleepScoreRegularityActivity.getString(C1987R.string.sleepScoreDetail_regularityIfBadPart1Alt2);
                kotlin.jvm.internal.u.i(string5, "getString(...)");
                P3.add(string5);
                List<String> P32 = sleepScoreRegularityActivity.P3();
                String string6 = sleepScoreRegularityActivity.getString(C1987R.string.sleepScoreDetail_regularityIfBadPart1Alt3);
                kotlin.jvm.internal.u.i(string6, "getString(...)");
                P32.add(string6);
                SleepScore.Info info = sleepScoreRegularityActivity.A;
                if (info != null) {
                    int status = info.getStatus();
                    if (status == SleepScoreHelperKt.getSleepScoreConstants().getStatusGood()) {
                        Q3 = sleepScoreRegularityActivity.Q3();
                    } else if (status == SleepScoreHelperKt.getSleepScoreConstants().getStatusAverage()) {
                        Q3 = sleepScoreRegularityActivity.R3();
                    } else if (status == SleepScoreHelperKt.getSleepScoreConstants().getStatusBad()) {
                        Q3 = sleepScoreRegularityActivity.P3();
                    } else {
                        Fail.j("Invalid status for regularity");
                        Q3 = sleepScoreRegularityActivity.Q3();
                    }
                    ((TextView) sleepScoreRegularityActivity.f60724h.getValue()).setText(Q3.get(((Random) sleepScoreRegularityActivity.f60737u.getValue()).nextInt(Q3.size() - 1)));
                    nm0.g gVar = sleepScoreRegularityActivity.f60733q;
                    LineCellView lineCellView = (LineCellView) gVar.getValue();
                    DateTime withTimeAtStartOfDay = DateTime.now().withTimeAtStartOfDay();
                    Integer a12 = cVar.a();
                    if (a12 != null) {
                        i14 = a12.intValue();
                    } else {
                        i14 = 0;
                    }
                    DateTime plusMinutes = withTimeAtStartOfDay.plusMinutes(i14);
                    kotlin.jvm.internal.u.i(plusMinutes, "plusMinutes(...)");
                    Context context = ((LineCellView) gVar.getValue()).getContext();
                    kotlin.jvm.internal.u.i(context, "getContext(...)");
                    lineCellView.setValue(b50.b.t(context, plusMinutes));
                    nm0.g gVar2 = sleepScoreRegularityActivity.f60734r;
                    LineCellView lineCellView2 = (LineCellView) gVar2.getValue();
                    DateTime withTimeAtStartOfDay2 = DateTime.now().withTimeAtStartOfDay();
                    Integer b11 = cVar.b();
                    if (b11 != null) {
                        i15 = b11.intValue();
                    }
                    DateTime plusMinutes2 = withTimeAtStartOfDay2.plusMinutes(i15);
                    kotlin.jvm.internal.u.i(plusMinutes2, "plusMinutes(...)");
                    Context context2 = ((LineCellView) gVar2.getValue()).getContext();
                    kotlin.jvm.internal.u.i(context2, "getContext(...)");
                    lineCellView2.setValue(b50.b.t(context2, plusMinutes2));
                    nm0.g gVar3 = sleepScoreRegularityActivity.f60731o;
                    ((GraphPopupView) gVar3.getValue()).setShouldDrawPopupLineFromBottom(true);
                    nm0.g gVar4 = sleepScoreRegularityActivity.f60730n;
                    GraphView graphView = (GraphView) gVar4.getValue();
                    kotlin.jvm.internal.u.i(graphView, "<get-weekSleepGraph>(...)");
                    ii0.a aVar = new ii0.a(graphView, cVar);
                    aVar.f(null);
                    aVar.n((GraphPopupView) gVar3.getValue());
                    aVar.g();
                    aVar.l();
                    aVar.h(plusDays);
                    aVar.o();
                    aVar.m();
                    aVar.d();
                    ((GraphView) gVar4.getValue()).setOnScrubbingListener(new i3(sleepScoreRegularityActivity));
                    return;
                }
                kotlin.jvm.internal.u.s("regularityInfo");
                throw null;
            }
            kotlin.jvm.internal.u.s("sleepTrack");
            throw null;
        }
        kotlin.jvm.internal.u.s("sleepTrack");
        throw null;
    }

    public static final void N3(SleepScoreRegularityActivity sleepScoreRegularityActivity) {
        ((ProgressBar) sleepScoreRegularityActivity.f60729m.getValue()).setVisibility(8);
        ((View) sleepScoreRegularityActivity.f60727k.getValue()).setVisibility(8);
        ((View) sleepScoreRegularityActivity.f60732p.getValue()).setVisibility(8);
        ((TextView) sleepScoreRegularityActivity.f60725i.getValue()).setVisibility(8);
        ((WeeklyLegendView) sleepScoreRegularityActivity.f60728l.getValue()).setVisibility(8);
        ((TextView) sleepScoreRegularityActivity.f60726j.getValue()).setVisibility(8);
        ((TextView) sleepScoreRegularityActivity.f60724h.getValue()).setText(C1987R.string.sleepScoreDetail_regularityIfUnknown);
    }

    private final String O3(long j5) {
        e.a aVar = new e.a(this, 0);
        aVar.a(true);
        aVar.w(true);
        aVar.t(true);
        aVar.v();
        return new pm.e(aVar).a(j5);
    }

    private final List<String> P3() {
        return (List) this.f60740x.getValue();
    }

    private final List<String> Q3() {
        return (List) this.f60738v.getValue();
    }

    private final List<String> R3() {
        return (List) this.f60739w.getValue();
    }

    private static final String S3(SleepScoreRegularityActivity sleepScoreRegularityActivity, String str, String str2, int i11) {
        String string = sleepScoreRegularityActivity.getString(i11, str, str2);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        return string;
    }

    @Override // com.withings.wiscale2.sleep.ui.sleepscore.Hilt_SleepScoreRegularityActivity, com.withings.wiscale2.sleep.ui.sleepscore.BaseSleepDetailActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), null, null, new l(null), 3, null);
    }

    @Override // com.withings.wiscale2.sleep.ui.sleepscore.BaseSleepDetailActivity
    public final int z3() {
        return C1987R.layout.detail_view_sleep_regularity;
    }
}
