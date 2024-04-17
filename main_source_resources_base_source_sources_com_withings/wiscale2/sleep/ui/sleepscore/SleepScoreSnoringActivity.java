package com.withings.wiscale2.sleep.ui.sleepscore;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.rudderstack.android.sdk.core.util.Utils;
import com.withings.graph.GraphView;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.vasistas.model.SleepLevel;
import com.withings.vasistas.model.Vasistas;
import com.withings.views.graphs.GraphPopupView;
import com.withings.views.widget.LineCellView;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.sleep.libc.SleepScoreRecalculator;
import com.withings.wiscale2.track.data.SleepScore;
import com.withings.wiscale2.track.data.SleepTrackData;
import com.withings.wiscale2.track.data.Track;
import com.withings.wiscale2.track.data.TrackKt;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import okhttp3.internal.http2.Http2;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import pm.e;
/* compiled from: SleepScoreSnoringActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/sleep/ui/sleepscore/SleepScoreSnoringActivity;", "Lcom/withings/wiscale2/sleep/ui/sleepscore/BaseSleepDetailActivity;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SleepScoreSnoringActivity extends Hilt_SleepScoreSnoringActivity {
    @Inject

    /* renamed from: g  reason: collision with root package name */
    public ei0.q f60768g;

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f60769h = nm0.h.b(new b());

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f60770i = nm0.h.b(new c());

    /* renamed from: j  reason: collision with root package name */
    private final nm0.g f60771j = nm0.h.b(new i());

    /* renamed from: k  reason: collision with root package name */
    private final nm0.g f60772k = nm0.h.b(new j());

    /* renamed from: l  reason: collision with root package name */
    private final nm0.g f60773l = nm0.h.b(new d());

    /* renamed from: m  reason: collision with root package name */
    private final nm0.g f60774m = nm0.h.b(new f());

    /* renamed from: n  reason: collision with root package name */
    private final nm0.g f60775n = nm0.h.b(new m());

    /* renamed from: o  reason: collision with root package name */
    private final k f60776o = new k(this);

    /* renamed from: p  reason: collision with root package name */
    private final l f60777p = new l(this);

    /* renamed from: q  reason: collision with root package name */
    private final pm.e f60778q;

    /* renamed from: r  reason: collision with root package name */
    private final NumberFormat f60779r;

    /* renamed from: s  reason: collision with root package name */
    private ArrayList f60780s;

    /* renamed from: t  reason: collision with root package name */
    private DateTime f60781t;

    /* renamed from: u  reason: collision with root package name */
    private DateTime f60782u;

    /* renamed from: v  reason: collision with root package name */
    private final nm0.g f60783v;

    /* renamed from: w  reason: collision with root package name */
    private final nm0.g f60784w;

    /* renamed from: x  reason: collision with root package name */
    private final nm0.g f60785x;

    /* renamed from: y  reason: collision with root package name */
    private Track f60786y;

    /* renamed from: z  reason: collision with root package name */
    private SleepTrackData f60787z;
    static final /* synthetic */ fn0.k<Object>[] B = {androidx.camera.core.v.c(SleepScoreSnoringActivity.class, "sleepTrackId", "getSleepTrackId()J", 0), androidx.camera.core.v.c(SleepScoreSnoringActivity.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0)};
    public static final a A = new Object();

    /* compiled from: SleepScoreSnoringActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    /* compiled from: SleepScoreSnoringActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<View> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final View invoke() {
            return SleepScoreSnoringActivity.this.findViewById(C1987R.id.content);
        }
    }

    /* compiled from: SleepScoreSnoringActivity.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<View> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final View invoke() {
            return SleepScoreSnoringActivity.this.findViewById(C1987R.id.empty_snoring);
        }
    }

    /* compiled from: SleepScoreSnoringActivity.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<LineCellView> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final LineCellView invoke() {
            return (LineCellView) SleepScoreSnoringActivity.this.findViewById(C1987R.id.snoring_episode_count);
        }
    }

    /* compiled from: SleepScoreSnoringActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SleepScoreSnoringActivity$onCreate$1", f = "SleepScoreSnoringActivity.kt", l = {83, 95}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class e extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        SleepScoreSnoringActivity f60791a;

        /* renamed from: b  reason: collision with root package name */
        int f60792b;

        /* renamed from: c  reason: collision with root package name */
        private /* synthetic */ Object f60793c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SleepScoreSnoringActivity.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SleepScoreSnoringActivity$onCreate$1$1", f = "SleepScoreSnoringActivity.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super Track>, Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ SleepScoreSnoringActivity f60795a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(SleepScoreSnoringActivity sleepScoreSnoringActivity, qm0.d<? super a> dVar) {
                super(2, dVar);
                this.f60795a = sleepScoreSnoringActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                return new a(this.f60795a, dVar);
            }

            @Override // ym0.p
            public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super Track> dVar) {
                return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                nm0.l.b(obj);
                SleepScoreSnoringActivity sleepScoreSnoringActivity = this.f60795a;
                ei0.q qVar = sleepScoreSnoringActivity.f60768g;
                if (qVar != null) {
                    return qVar.o(SleepScoreSnoringActivity.H3(sleepScoreSnoringActivity));
                }
                kotlin.jvm.internal.u.s("sleepTrackManager");
                throw null;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SleepScoreSnoringActivity.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SleepScoreSnoringActivity$onCreate$1$3", f = "SleepScoreSnoringActivity.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes5.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ SleepScoreSnoringActivity f60796a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(SleepScoreSnoringActivity sleepScoreSnoringActivity, qm0.d<? super b> dVar) {
                super(2, dVar);
                this.f60796a = sleepScoreSnoringActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                return new b(this.f60796a, dVar);
            }

            @Override // ym0.p
            public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
                return ((b) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                nm0.l.b(obj);
                SleepScoreSnoringActivity.L3(this.f60796a);
                return nm0.y.f85009a;
            }
        }

        e(qm0.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            e eVar = new e(dVar);
            eVar.f60793c = obj;
            return eVar;
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((e) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            SleepScoreSnoringActivity sleepScoreSnoringActivity;
            SleepScore.Info info;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f60792b;
            SleepScoreSnoringActivity sleepScoreSnoringActivity2 = SleepScoreSnoringActivity.this;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        nm0.l.b(obj);
                        SleepScoreSnoringActivity.P3(sleepScoreSnoringActivity2);
                        SleepScoreSnoringActivity.O3(sleepScoreSnoringActivity2);
                        return nm0.y.f85009a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sleepScoreSnoringActivity = this.f60791a;
                CoroutineScope coroutineScope = (CoroutineScope) this.f60793c;
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(sleepScoreSnoringActivity2, null);
                this.f60793c = (CoroutineScope) this.f60793c;
                this.f60791a = sleepScoreSnoringActivity2;
                this.f60792b = 1;
                obj = BuildersKt.withContext(io2, aVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                sleepScoreSnoringActivity = sleepScoreSnoringActivity2;
            }
            sleepScoreSnoringActivity.f60786y = (Track) obj;
            Track track = sleepScoreSnoringActivity2.f60786y;
            if (track != null) {
                Parcelable data = track.getData();
                kotlin.jvm.internal.u.h(data, "null cannot be cast to non-null type com.withings.wiscale2.track.data.SleepTrackData");
                sleepScoreSnoringActivity2.f60787z = (SleepTrackData) data;
                Track track2 = sleepScoreSnoringActivity2.f60786y;
                if (track2 != null) {
                    SleepScore sleepScore = track2.getSleepScore();
                    if (sleepScore != null) {
                        info = sleepScore.getSnoring();
                    } else {
                        info = null;
                    }
                    if (info == null) {
                        sleepScoreSnoringActivity2.finish();
                        return nm0.y.f85009a;
                    }
                    SleepScoreSnoringActivity.J3(sleepScoreSnoringActivity2);
                    SleepTrackData sleepTrackData = sleepScoreSnoringActivity2.f60787z;
                    if (sleepTrackData != null) {
                        if (sleepTrackData.getSnoringDuration().getMillis() > 0) {
                            SleepScoreSnoringActivity.D3(sleepScoreSnoringActivity2).setVisibility(0);
                            SleepScoreSnoringActivity.E3(sleepScoreSnoringActivity2).setVisibility(8);
                            SleepScoreSnoringActivity.K3(sleepScoreSnoringActivity2);
                            CoroutineDispatcher io3 = Dispatchers.getIO();
                            b bVar = new b(sleepScoreSnoringActivity2, null);
                            this.f60793c = null;
                            this.f60791a = null;
                            this.f60792b = 2;
                            if (BuildersKt.withContext(io3, bVar, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            SleepScoreSnoringActivity.P3(sleepScoreSnoringActivity2);
                            SleepScoreSnoringActivity.O3(sleepScoreSnoringActivity2);
                            return nm0.y.f85009a;
                        }
                        SleepScoreSnoringActivity.D3(sleepScoreSnoringActivity2).setVisibility(8);
                        SleepScoreSnoringActivity.E3(sleepScoreSnoringActivity2).setVisibility(0);
                        return nm0.y.f85009a;
                    }
                    kotlin.jvm.internal.u.s("sleepTrackData");
                    throw null;
                }
                kotlin.jvm.internal.u.s("sleepTrack");
                throw null;
            }
            kotlin.jvm.internal.u.s("sleepTrack");
            throw null;
        }
    }

    /* compiled from: SleepScoreSnoringActivity.kt */
    /* loaded from: classes5.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.a<LineCellView> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final LineCellView invoke() {
            return (LineCellView) SleepScoreSnoringActivity.this.findViewById(C1987R.id.snoring_percent_of_night);
        }
    }

    /* compiled from: SleepScoreSnoringActivity.kt */
    /* loaded from: classes5.dex */
    static final class g extends kotlin.jvm.internal.w implements ym0.a<Random> {
        g() {
            super(0);
        }

        @Override // ym0.a
        public final Random invoke() {
            return new Random(SleepScoreSnoringActivity.H3(SleepScoreSnoringActivity.this));
        }
    }

    /* compiled from: SleepScoreSnoringActivity.kt */
    /* loaded from: classes5.dex */
    static final class h extends kotlin.jvm.internal.w implements ym0.a<SleepScoreRecalculator> {
        h() {
            super(0);
        }

        @Override // ym0.a
        public final SleepScoreRecalculator invoke() {
            return SleepScoreRecalculator.Companion.get$default(SleepScoreRecalculator.Companion, SleepScoreSnoringActivity.I3(SleepScoreSnoringActivity.this).q(), null, 2, null);
        }
    }

    /* compiled from: SleepScoreSnoringActivity.kt */
    /* loaded from: classes5.dex */
    static final class i extends kotlin.jvm.internal.w implements ym0.a<GraphView> {
        i() {
            super(0);
        }

        @Override // ym0.a
        public final GraphView invoke() {
            return (GraphView) SleepScoreSnoringActivity.this.findViewById(C1987R.id.snoring_graph);
        }
    }

    /* compiled from: SleepScoreSnoringActivity.kt */
    /* loaded from: classes5.dex */
    static final class j extends kotlin.jvm.internal.w implements ym0.a<GraphPopupView> {
        j() {
            super(0);
        }

        @Override // ym0.a
        public final GraphPopupView invoke() {
            return (GraphPopupView) SleepScoreSnoringActivity.this.findViewById(C1987R.id.snoring_graph_popup);
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class k implements bn0.d<Activity, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f60802a = nm0.h.b(new m3(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f60803b;

        public k(Activity activity) {
            this.f60803b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f60802a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class l implements bn0.d<Activity, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f60804a = nm0.h.b(new n3(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f60805b;

        public l(Activity activity) {
            this.f60805b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f60804a.getValue();
        }
    }

    /* compiled from: SleepScoreSnoringActivity.kt */
    /* loaded from: classes5.dex */
    static final class m extends kotlin.jvm.internal.w implements ym0.a<TextView> {
        m() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) SleepScoreSnoringActivity.this.findViewById(C1987R.id.top_text);
        }
    }

    /* compiled from: SleepScoreSnoringActivity.kt */
    /* loaded from: classes5.dex */
    static final class n extends kotlin.jvm.internal.w implements ym0.a<ArrayList<String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final n f60807a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final ArrayList<String> invoke() {
            return new ArrayList<>();
        }
    }

    public SleepScoreSnoringActivity() {
        e.a aVar = new e.a(this, 0);
        aVar.w(true);
        aVar.v();
        this.f60778q = new pm.e(aVar);
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        percentInstance.setMaximumFractionDigits(0);
        this.f60779r = percentInstance;
        this.f60783v = nm0.h.b(new g());
        this.f60784w = nm0.h.b(n.f60807a);
        this.f60785x = nm0.h.b(new h());
    }

    public static final View D3(SleepScoreSnoringActivity sleepScoreSnoringActivity) {
        return (View) sleepScoreSnoringActivity.f60769h.getValue();
    }

    public static final View E3(SleepScoreSnoringActivity sleepScoreSnoringActivity) {
        return (View) sleepScoreSnoringActivity.f60770i.getValue();
    }

    public static final long H3(SleepScoreSnoringActivity sleepScoreSnoringActivity) {
        return ((Number) sleepScoreSnoringActivity.f60776o.getValue(sleepScoreSnoringActivity, B[0])).longValue();
    }

    public static final User I3(SleepScoreSnoringActivity sleepScoreSnoringActivity) {
        sleepScoreSnoringActivity.getClass();
        return (User) sleepScoreSnoringActivity.f60777p.getValue(sleepScoreSnoringActivity, B[1]);
    }

    public static final void J3(SleepScoreSnoringActivity sleepScoreSnoringActivity) {
        String string = sleepScoreSnoringActivity.getString(C1987R.string.sleepScore_snoring);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        SleepTrackData sleepTrackData = sleepScoreSnoringActivity.f60787z;
        if (sleepTrackData != null) {
            sleepScoreSnoringActivity.B3(string, sleepScoreSnoringActivity.f60778q.a(sleepTrackData.getSnoringDuration().getMillis()));
            sleepScoreSnoringActivity.C3(C1987R.drawable.ic_rounded_snooze2, C1987R.color.textPrimary, C1987R.color.statusUndefined);
            return;
        }
        kotlin.jvm.internal.u.s("sleepTrackData");
        throw null;
    }

    public static final void K3(SleepScoreSnoringActivity sleepScoreSnoringActivity) {
        ((ArrayList) sleepScoreSnoringActivity.f60784w.getValue()).add(sleepScoreSnoringActivity.getString(C1987R.string.sleepScoreDetail_snoringPart1Alt1));
        nm0.g gVar = sleepScoreSnoringActivity.f60784w;
        ((ArrayList) gVar.getValue()).add(sleepScoreSnoringActivity.getString(C1987R.string.sleepScoreDetail_snoringPart1Alt2));
        ((ArrayList) gVar.getValue()).add(sleepScoreSnoringActivity.getString(C1987R.string.sleepScoreDetail_snoringPart1Alt3));
    }

    public static final void L3(SleepScoreSnoringActivity sleepScoreSnoringActivity) {
        Object obj;
        DateTime asleepStartDate;
        Vasistas vasistas;
        DateTime awakeStartDate;
        Vasistas.Category category;
        ArrayList arrayList;
        Vasistas copy;
        Vasistas copy2;
        sleepScoreSnoringActivity.getClass();
        ei0.q qVar = ei0.q.f65441d;
        if (qVar != null) {
            fn0.k<Object>[] kVarArr = B;
            fn0.k<Object> kVar = kVarArr[1];
            l lVar = sleepScoreSnoringActivity.f60777p;
            long q11 = ((User) lVar.getValue(sleepScoreSnoringActivity, kVar)).q();
            Track track = sleepScoreSnoringActivity.f60786y;
            if (track != null) {
                lj0.h0 e11 = lj0.h0.e();
                kotlin.jvm.internal.u.i(e11, "get(...)");
                di0.a A2 = qVar.A(q11, TrackKt.getEffectiveEndDate(track), (SleepScoreRecalculator) sleepScoreSnoringActivity.f60785x.getValue(), e11);
                Iterator<T> it = A2.a().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((Vasistas) obj).getSleepLevel() != SleepLevel.Awake.getVasistasType()) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                Vasistas vasistas2 = (Vasistas) obj;
                if (vasistas2 == null || (asleepStartDate = vasistas2.getStartDate()) == null) {
                    Track track2 = sleepScoreSnoringActivity.f60786y;
                    if (track2 != null) {
                        asleepStartDate = TrackKt.getAsleepStartDate(track2);
                    } else {
                        kotlin.jvm.internal.u.s("sleepTrack");
                        throw null;
                    }
                }
                sleepScoreSnoringActivity.f60781t = asleepStartDate;
                List<Vasistas> a11 = A2.a();
                ListIterator<Vasistas> listIterator = a11.listIterator(a11.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        vasistas = listIterator.previous();
                        if (vasistas.getSleepLevel() != SleepLevel.Awake.getVasistasType()) {
                            break;
                        }
                    } else {
                        vasistas = null;
                        break;
                    }
                }
                Vasistas vasistas3 = vasistas;
                if (vasistas3 == null || (awakeStartDate = vasistas3.getEnd()) == null) {
                    Track track3 = sleepScoreSnoringActivity.f60786y;
                    if (track3 != null) {
                        awakeStartDate = TrackKt.getAwakeStartDate(track3);
                    } else {
                        kotlin.jvm.internal.u.s("sleepTrack");
                        throw null;
                    }
                }
                sleepScoreSnoringActivity.f60782u = awakeStartDate;
                lj0.h0 e12 = lj0.h0.e();
                long q12 = ((User) lVar.getValue(sleepScoreSnoringActivity, kVarArr[1])).q();
                Track track4 = sleepScoreSnoringActivity.f60786y;
                if (track4 != null) {
                    if (track4.getDeviceType() == 32) {
                        category = Vasistas.Category.BED;
                    } else {
                        category = Vasistas.Category.BODY;
                    }
                    Vasistas.Category category2 = category;
                    Track track5 = sleepScoreSnoringActivity.f60786y;
                    if (track5 != null) {
                        DateTime effectiveStartDate = TrackKt.getEffectiveStartDate(track5);
                        Track track6 = sleepScoreSnoringActivity.f60786y;
                        if (track6 != null) {
                            List<Vasistas> o11 = e12.o(q12, category2, effectiveStartDate, TrackKt.getEffectiveEndDate(track6));
                            kotlin.jvm.internal.u.i(o11, "getVasistasBetween(...)");
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj2 : o11) {
                                if (((Vasistas) obj2).getSnoringDurationRatio() > 0) {
                                    arrayList2.add(obj2);
                                }
                            }
                            if (arrayList2.isEmpty()) {
                                arrayList = new ArrayList();
                            } else {
                                arrayList = new ArrayList();
                                copy = r10.copy((r62 & 1) != 0 ? r10.startDate : null, (r62 & 2) != 0 ? r10.f46386id : null, (r62 & 4) != 0 ? r10.userId : null, (r62 & 8) != 0 ? r10.durationMillis : 0, (r62 & 16) != 0 ? r10.type : null, (r62 & 32) != 0 ? r10.activityType : null, (r62 & 64) != 0 ? r10.category : null, (r62 & 128) != 0 ? r10.calories : 0.0f, (r62 & 256) != 0 ? r10.earnedCalories : 0.0f, (r62 & 512) != 0 ? r10.met : 0.0f, (r62 & 1024) != 0 ? r10.sleepLevel : 0, (r62 & ModuleCopy.f28574b) != 0 ? r10.sleepDebug : 0, (r62 & 4096) != 0 ? r10.snoringDurationRatio : 0, (r62 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r10.heartRate : 0, (r62 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? r10.heartRateMeasureQuality : 0, (r62 & Utils.MAX_EVENT_SIZE) != 0 ? r10.skinTemperature : 0, (r62 & 65536) != 0 ? r10.coreTemperature : 0.0f, (r62 & 131072) != 0 ? r10.activityStatus : 0, (r62 & 262144) != 0 ? r10.steps : 0, (r62 & 524288) != 0 ? r10.distance : 0.0f, (r62 & 1048576) != 0 ? r10.classifierFeature : 0.0f, (r62 & 2097152) != 0 ? r10.swimMovements : 0, (r62 & 4194304) != 0 ? r10.swimLaps : 0, (r62 & 8388608) != 0 ? r10.deviceModel : 0, (r62 & 16777216) != 0 ? r10.activityRecognitionData2 : 0, (r62 & 33554432) != 0 ? r10.version : 0, (r62 & 67108864) != 0 ? r10.swimType : 0, (r62 & 134217728) != 0 ? r10.deviceId : 0L, (r62 & 268435456) != 0 ? r10.apneaHypopneaIndex : null, (536870912 & r62) != 0 ? r10.breathingProbability : null, (r62 & ConstantsWs.DEBUG_BITMASK_EXTENDED_WPM04_RAWDATA_RESEARCH) != 0 ? r10.pauseType : null, (r62 & Integer.MIN_VALUE) != 0 ? r10.spo2 : null, (r63 & 1) != 0 ? r10.spo2Quality : null, (r63 & 2) != 0 ? r10.isSyncedToWs : false, (r63 & 4) != 0 ? r10.respiratoryRate : 0, (r63 & 8) != 0 ? r10.hrLevel : 0, (r63 & 16) != 0 ? r10.hrState : 0, (r63 & 32) != 0 ? r10.algoVersion : null, (r63 & 64) != 0 ? r10.firmwareVersion : null, (r63 & 128) != 0 ? r10.appPfmId : null, (r63 & 256) != 0 ? r10.appliVersion : null, (r63 & 512) != 0 ? r10.isTrusted : false, (r63 & 1024) != 0 ? ((Vasistas) kotlin.collections.x.I(arrayList2)).attrib : null);
                                arrayList.add(copy);
                                int size = arrayList2.size();
                                for (int i11 = 1; i11 < size; i11++) {
                                    copy2 = r10.copy((r62 & 1) != 0 ? r10.startDate : null, (r62 & 2) != 0 ? r10.f46386id : null, (r62 & 4) != 0 ? r10.userId : null, (r62 & 8) != 0 ? r10.durationMillis : 0, (r62 & 16) != 0 ? r10.type : null, (r62 & 32) != 0 ? r10.activityType : null, (r62 & 64) != 0 ? r10.category : null, (r62 & 128) != 0 ? r10.calories : 0.0f, (r62 & 256) != 0 ? r10.earnedCalories : 0.0f, (r62 & 512) != 0 ? r10.met : 0.0f, (r62 & 1024) != 0 ? r10.sleepLevel : 0, (r62 & ModuleCopy.f28574b) != 0 ? r10.sleepDebug : 0, (r62 & 4096) != 0 ? r10.snoringDurationRatio : 0, (r62 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r10.heartRate : 0, (r62 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? r10.heartRateMeasureQuality : 0, (r62 & Utils.MAX_EVENT_SIZE) != 0 ? r10.skinTemperature : 0, (r62 & 65536) != 0 ? r10.coreTemperature : 0.0f, (r62 & 131072) != 0 ? r10.activityStatus : 0, (r62 & 262144) != 0 ? r10.steps : 0, (r62 & 524288) != 0 ? r10.distance : 0.0f, (r62 & 1048576) != 0 ? r10.classifierFeature : 0.0f, (r62 & 2097152) != 0 ? r10.swimMovements : 0, (r62 & 4194304) != 0 ? r10.swimLaps : 0, (r62 & 8388608) != 0 ? r10.deviceModel : 0, (r62 & 16777216) != 0 ? r10.activityRecognitionData2 : 0, (r62 & 33554432) != 0 ? r10.version : 0, (r62 & 67108864) != 0 ? r10.swimType : 0, (r62 & 134217728) != 0 ? r10.deviceId : 0L, (r62 & 268435456) != 0 ? r10.apneaHypopneaIndex : null, (536870912 & r62) != 0 ? r10.breathingProbability : null, (r62 & ConstantsWs.DEBUG_BITMASK_EXTENDED_WPM04_RAWDATA_RESEARCH) != 0 ? r10.pauseType : null, (r62 & Integer.MIN_VALUE) != 0 ? r10.spo2 : null, (r63 & 1) != 0 ? r10.spo2Quality : null, (r63 & 2) != 0 ? r10.isSyncedToWs : false, (r63 & 4) != 0 ? r10.respiratoryRate : 0, (r63 & 8) != 0 ? r10.hrLevel : 0, (r63 & 16) != 0 ? r10.hrState : 0, (r63 & 32) != 0 ? r10.algoVersion : null, (r63 & 64) != 0 ? r10.firmwareVersion : null, (r63 & 128) != 0 ? r10.appPfmId : null, (r63 & 256) != 0 ? r10.appliVersion : null, (r63 & 512) != 0 ? r10.isTrusted : false, (r63 & 1024) != 0 ? ((Vasistas) arrayList2.get(i11)).attrib : null);
                                    Vasistas vasistas4 = (Vasistas) kotlin.collections.x.T(arrayList);
                                    if (new Duration(vasistas4.getEnd(), copy2.getStartDate()).getStandardMinutes() <= 0) {
                                        vasistas4.setDurationMillis((int) new Duration(vasistas4.getStartDate(), copy2.getEnd()).getMillis());
                                    } else {
                                        arrayList.add(copy2);
                                    }
                                }
                            }
                            sleepScoreSnoringActivity.f60780s = arrayList;
                            return;
                        }
                        kotlin.jvm.internal.u.s("sleepTrack");
                        throw null;
                    }
                    kotlin.jvm.internal.u.s("sleepTrack");
                    throw null;
                }
                kotlin.jvm.internal.u.s("sleepTrack");
                throw null;
            }
            kotlin.jvm.internal.u.s("sleepTrack");
            throw null;
        }
        kotlin.jvm.internal.u.s("instance");
        throw null;
    }

    public static final void O3(SleepScoreSnoringActivity sleepScoreSnoringActivity) {
        nm0.g gVar = sleepScoreSnoringActivity.f60784w;
        ((TextView) sleepScoreSnoringActivity.f60775n.getValue()).setText((CharSequence) ((ArrayList) gVar.getValue()).get(((Random) sleepScoreSnoringActivity.f60783v.getValue()).nextInt(((ArrayList) gVar.getValue()).size() - 1)));
    }

    public static final void P3(SleepScoreSnoringActivity sleepScoreSnoringActivity) {
        ((GraphView) sleepScoreSnoringActivity.f60771j.getValue()).setLayerType(1, null);
        GraphView graphView = (GraphView) sleepScoreSnoringActivity.f60771j.getValue();
        kotlin.jvm.internal.u.i(graphView, "<get-snoringGraph>(...)");
        ArrayList arrayList = sleepScoreSnoringActivity.f60780s;
        if (arrayList != null) {
            ii0.e eVar = new ii0.e(graphView, arrayList, (GraphPopupView) sleepScoreSnoringActivity.f60772k.getValue(), true, true, true);
            DateTime dateTime = sleepScoreSnoringActivity.f60781t;
            if (dateTime != null) {
                DateTime dateTime2 = sleepScoreSnoringActivity.f60782u;
                if (dateTime2 != null) {
                    eVar.x(dateTime, dateTime2);
                    ArrayList arrayList2 = sleepScoreSnoringActivity.f60780s;
                    if (arrayList2 != null) {
                        boolean z5 = !arrayList2.isEmpty();
                        nm0.g gVar = sleepScoreSnoringActivity.f60774m;
                        nm0.g gVar2 = sleepScoreSnoringActivity.f60773l;
                        if (z5) {
                            LineCellView lineCellView = (LineCellView) gVar2.getValue();
                            ArrayList arrayList3 = sleepScoreSnoringActivity.f60780s;
                            if (arrayList3 != null) {
                                lineCellView.setValue(String.valueOf(arrayList3.size()));
                                SleepTrackData sleepTrackData = sleepScoreSnoringActivity.f60787z;
                                if (sleepTrackData != null) {
                                    float millis = (float) sleepTrackData.getSnoringDuration().getMillis();
                                    SleepTrackData sleepTrackData2 = sleepScoreSnoringActivity.f60787z;
                                    if (sleepTrackData2 != null) {
                                        ((LineCellView) gVar.getValue()).setValue(sleepScoreSnoringActivity.f60779r.format(Float.valueOf(millis / ((float) sleepTrackData2.getTotalSleep().getMillis()))));
                                        return;
                                    }
                                    kotlin.jvm.internal.u.s("sleepTrackData");
                                    throw null;
                                }
                                kotlin.jvm.internal.u.s("sleepTrackData");
                                throw null;
                            }
                            kotlin.jvm.internal.u.s("aggregatedVasistasList");
                            throw null;
                        }
                        ((LineCellView) gVar2.getValue()).setValue("-");
                        ((LineCellView) gVar.getValue()).setValue("-");
                        return;
                    }
                    kotlin.jvm.internal.u.s("aggregatedVasistasList");
                    throw null;
                }
                kotlin.jvm.internal.u.s("awakenDate");
                throw null;
            }
            kotlin.jvm.internal.u.s("fallAsleepDate");
            throw null;
        }
        kotlin.jvm.internal.u.s("aggregatedVasistasList");
        throw null;
    }

    @Override // com.withings.wiscale2.sleep.ui.sleepscore.Hilt_SleepScoreSnoringActivity, com.withings.wiscale2.sleep.ui.sleepscore.BaseSleepDetailActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), null, null, new e(null), 3, null);
    }

    @Override // com.withings.wiscale2.sleep.ui.sleepscore.BaseSleepDetailActivity
    public final int z3() {
        return C1987R.layout.detail_view_sleep_snoring;
    }
}
