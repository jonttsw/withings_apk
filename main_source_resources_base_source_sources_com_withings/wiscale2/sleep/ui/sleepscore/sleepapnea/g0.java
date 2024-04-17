package com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea;

import android.content.Context;
import android.os.Parcelable;
import androidx.lifecycle.LiveData;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.gson.Gson;
import com.withings.insight.android.entity.Insight;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.core.models.User;
import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.track.data.SleepTrackData;
import com.withings.wiscale2.track.data.Track;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
/* compiled from: SleepDisorderDetailsFragment.kt */
/* loaded from: classes5.dex */
public final class g0 extends androidx.lifecycle.g1 {

    /* renamed from: a  reason: collision with root package name */
    private final User f61304a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f61305b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f61306c;

    /* renamed from: d  reason: collision with root package name */
    private final ei0.q f61307d;

    /* renamed from: e  reason: collision with root package name */
    private final fy.p f61308e;

    /* renamed from: f  reason: collision with root package name */
    private final lj0.h0 f61309f;

    /* renamed from: g  reason: collision with root package name */
    private final lj0.k f61310g;

    /* renamed from: h  reason: collision with root package name */
    private final t00.d f61311h;

    /* renamed from: i  reason: collision with root package name */
    private final lj0.b f61312i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f61313j;

    /* renamed from: k  reason: collision with root package name */
    private final androidx.lifecycle.k0<xw.c<Insight>> f61314k;

    /* renamed from: l  reason: collision with root package name */
    private final LiveData<Track> f61315l;

    /* renamed from: m  reason: collision with root package name */
    private final androidx.lifecycle.j0 f61316m;

    /* renamed from: n  reason: collision with root package name */
    private final androidx.lifecycle.j0 f61317n;

    /* renamed from: o  reason: collision with root package name */
    private final androidx.lifecycle.j0 f61318o;

    /* compiled from: SleepDisorderDetailsFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f61319a;

        /* renamed from: b  reason: collision with root package name */
        private final List<DatedValue> f61320b;

        public a(int i11, List<DatedValue> list) {
            this.f61319a = i11;
            this.f61320b = list;
        }

        public final int a() {
            return this.f61319a;
        }

        public final List<DatedValue> b() {
            return this.f61320b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f61319a == aVar.f61319a && kotlin.jvm.internal.u.e(this.f61320b, aVar.f61320b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f61320b.hashCode() + (Integer.hashCode(this.f61319a) * 31);
        }

        public final String toString() {
            return "SleepDisorderGraphData(dayValue=" + this.f61319a + ", values=" + this.f61320b + ")";
        }
    }

    /* compiled from: SleepDisorderDetailsFragment.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.l<Track, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f61321a = new kotlin.jvm.internal.w(1);

        @Override // ym0.l
        public final String invoke(Track track) {
            Track it = track;
            kotlin.jvm.internal.u.j(it, "it");
            return it.getNote();
        }
    }

    /* compiled from: SleepDisorderDetailsFragment.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.SleepDisorderDetailsViewModel$onInsightWithContextRequested$1", f = "SleepDisorderDetailsFragment.kt", l = {ConstantsWs.WS_STATUS_INVITATION_NOTFOUND, ConstantsWs.WS_STATUS_BAD_INVITATION_TYPE}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class c extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f61322a;

        /* renamed from: b  reason: collision with root package name */
        int f61323b;

        /* renamed from: c  reason: collision with root package name */
        Float f61324c;

        /* renamed from: d  reason: collision with root package name */
        int f61325d;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Insight f61327f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SleepDisorderDetailsFragment.kt */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.jvm.internal.w implements ym0.p<Float, Float, nm0.y> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ g0 f61328a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Insight f61329b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g0 g0Var, Insight insight) {
                super(2);
                this.f61328a = g0Var;
                this.f61329b = insight;
            }

            @Override // ym0.p
            public final nm0.y invoke(Float f11, Float f12) {
                float f13;
                float floatValue = f11.floatValue();
                float floatValue2 = f12.floatValue();
                this.f61328a.getClass();
                if (floatValue2 < 1.0f) {
                    f13 = 0.0f;
                } else {
                    f13 = floatValue / (floatValue2 * floatValue2);
                }
                if (f13 > 35.0f) {
                    Map<String, String> context = this.f61329b.getContext();
                    kotlin.jvm.internal.u.g(context);
                    context.put("stopbang_b", "1");
                }
                return nm0.y.f85009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Insight insight, qm0.d<? super c> dVar) {
            super(2, dVar);
            this.f61327f = insight;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new c(this.f61327f, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r1 = r14.f61325d
                r2 = 0
                r3 = 2
                r4 = 1
                com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.g0 r5 = com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.g0.this
                if (r1 == 0) goto L28
                if (r1 == r4) goto L20
                if (r1 != r3) goto L18
                int r0 = r14.f61322a
                java.lang.Float r1 = r14.f61324c
                nm0.l.b(r15)
                goto L83
            L18:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L20:
                int r1 = r14.f61323b
                int r4 = r14.f61322a
                nm0.l.b(r15)
                goto L50
            L28:
                nm0.l.b(r15)
                fy.p r6 = com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.g0.g0(r5)
                com.withings.user.core.models.User r15 = com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.g0.p0(r5)
                long r7 = r15.getId()
                int[] r10 = new int[]{r4}
                r14.f61322a = r4
                r15 = 4
                r14.f61323b = r15
                r14.f61325d = r4
                r9 = 0
                r12 = 54
                r11 = r14
                java.lang.Object r1 = fy.p.a(r6, r7, r9, r10, r11, r12)
                if (r1 != r0) goto L4d
                return r0
            L4d:
                r13 = r1
                r1 = r15
                r15 = r13
            L50:
                ky.d r15 = (ky.d) r15
                if (r15 == 0) goto L5f
                double r6 = ly.a.f(r4, r15)
                float r15 = (float) r6
                java.lang.Float r4 = new java.lang.Float
                r4.<init>(r15)
                goto L60
            L5f:
                r4 = r2
            L60:
                fy.p r6 = com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.g0.g0(r5)
                com.withings.user.core.models.User r15 = com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.g0.p0(r5)
                long r7 = r15.getId()
                int[] r10 = new int[]{r1}
                r14.f61324c = r4
                r14.f61322a = r1
                r14.f61325d = r3
                r9 = 0
                r12 = 54
                r11 = r14
                java.lang.Object r15 = fy.p.a(r6, r7, r9, r10, r11, r12)
                if (r15 != r0) goto L81
                return r0
            L81:
                r0 = r1
                r1 = r4
            L83:
                ky.d r15 = (ky.d) r15
                if (r15 == 0) goto L91
                double r2 = ly.a.f(r0, r15)
                float r15 = (float) r2
                java.lang.Float r2 = new java.lang.Float
                r2.<init>(r15)
            L91:
                nm0.j r15 = new nm0.j
                r15.<init>(r1, r2)
                com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.g0$c$a r0 = new com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.g0$c$a
                com.withings.insight.android.entity.Insight r1 = r14.f61327f
                r0.<init>(r5, r1)
                cr.a.a(r15, r0)
                nm0.y r15 = nm0.y.f85009a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.g0.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: SleepDisorderDetailsFragment.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.l<nm0.o<Track, Integer, List<Vasistas>>, LiveData<a>> {
        d() {
            super(1);
        }

        @Override // ym0.l
        public final LiveData<a> invoke(nm0.o<Track, Integer, List<Vasistas>> oVar) {
            nm0.o<Track, Integer, List<Vasistas>> oVar2 = oVar;
            Track a11 = oVar2.a();
            return androidx.lifecycle.h.a(Dispatchers.getIO(), new j0(oVar2.b(), oVar2.c(), g0.this, a11, null), 2);
        }
    }

    /* compiled from: SleepDisorderDetailsFragment.kt */
    /* loaded from: classes5.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.l<Track, Integer> {
        e() {
            super(1);
        }

        @Override // ym0.l
        public final Integer invoke(Track track) {
            Track it = track;
            kotlin.jvm.internal.u.j(it, "it");
            if (g0.this.f61305b) {
                Parcelable data = it.getData();
                kotlin.jvm.internal.u.h(data, "null cannot be cast to non-null type com.withings.wiscale2.track.data.SleepTrackData");
                return ((SleepTrackData) data).getApneaHypopneaIndex();
            }
            Parcelable data2 = it.getData();
            kotlin.jvm.internal.u.h(data2, "null cannot be cast to non-null type com.withings.wiscale2.track.data.SleepTrackData");
            return ((SleepTrackData) data2).getBreathingEventProbability();
        }
    }

    /* compiled from: SleepDisorderDetailsFragment.kt */
    /* loaded from: classes5.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.l<Track, LiveData<List<Vasistas>>> {
        f() {
            super(1);
        }

        @Override // ym0.l
        public final LiveData<List<Vasistas>> invoke(Track track) {
            Track track2 = track;
            kotlin.jvm.internal.u.j(track2, "track");
            return g0.k0(g0.this, track2);
        }
    }

    /* compiled from: SleepDisorderDetailsFragment.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.SleepDisorderDetailsViewModel$updateNote$1$1", f = "SleepDisorderDetailsFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class g extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Track f61334b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Track track, qm0.d<? super g> dVar) {
            super(2, dVar);
            this.f61334b = track;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new g(this.f61334b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((g) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            g0.this.f61307d.H(this.f61334b, null);
            return nm0.y.f85009a;
        }
    }

    public g0(User user, long j5, boolean z5, Context context, ei0.q sleepTrackManager, fy.p pVar, lj0.h0 vasistasManager, lj0.k kVar, t00.d networkSyncManager) {
        kotlin.jvm.internal.u.j(user, "user");
        kotlin.jvm.internal.u.j(sleepTrackManager, "sleepTrackManager");
        kotlin.jvm.internal.u.j(vasistasManager, "vasistasManager");
        kotlin.jvm.internal.u.j(networkSyncManager, "networkSyncManager");
        this.f61304a = user;
        this.f61305b = z5;
        this.f61306c = context;
        this.f61307d = sleepTrackManager;
        this.f61308e = pVar;
        this.f61309f = vasistasManager;
        this.f61310g = kVar;
        this.f61311h = networkSyncManager;
        lj0.b bVar = lj0.b.f79769c;
        if (bVar != null) {
            this.f61312i = bVar;
            this.f61314k = new androidx.lifecycle.k0<>();
            LiveData<Track> z11 = sleepTrackManager.z(j5);
            this.f61315l = z11;
            androidx.lifecycle.j0 c11 = androidx.lifecycle.e1.c(z11, new f());
            androidx.lifecycle.j0 b10 = androidx.lifecycle.e1.b(z11, new e());
            this.f61316m = b10;
            this.f61317n = androidx.lifecycle.e1.b(z11, b.f61321a);
            this.f61318o = androidx.lifecycle.e1.c(xw.a.c(new nm0.o(z11, b10, c11)), new d());
            return;
        }
        kotlin.jvm.internal.u.s("instance");
        throw null;
    }

    public static final void f0(g0 g0Var, Track track) {
        if (!g0Var.f61313j) {
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(g0Var), Dispatchers.getIO(), null, new h0(g0Var, track, null), 2, null);
        }
    }

    public static final androidx.lifecycle.j0 k0(g0 g0Var, Track track) {
        boolean z5 = g0Var.f61305b;
        User user = g0Var.f61304a;
        if (z5) {
            return androidx.lifecycle.e1.b(new lj0.d0(g0Var.f61309f, user.getId(), kotlin.collections.x.V(new nm0.j(Vasistas.Category.BED, Vasistas.VasistasType.SLEEP)), track.getStartDate(), track.getEndDate()), i0.f61345a);
        }
        return g0Var.f61312i.a(user.getId(), track.getStartDate(), track.getEndDate());
    }

    public final androidx.lifecycle.j0 A0() {
        return this.f61316m;
    }

    public final void B0() {
        BufferedReader bufferedReader;
        InputStream openRawResource = this.f61306c.getResources().openRawResource(C1987R.raw.epworth);
        kotlin.jvm.internal.u.i(openRawResource, "openRawResource(...)");
        InputStreamReader inputStreamReader = new InputStreamReader(openRawResource, dp0.c.f64094b);
        if (inputStreamReader instanceof BufferedReader) {
            bufferedReader = (BufferedReader) inputStreamReader;
        } else {
            bufferedReader = new BufferedReader(inputStreamReader, UserMetadata.MAX_INTERNAL_KEY_SIZE);
        }
        try {
            String b10 = wm0.f.b(bufferedReader);
            ge0.d.a(bufferedReader, null);
            this.f61314k.postValue(new xw.c<>((Insight) new Gson().fromJson(b10, (Class<Object>) Insight.class)));
        } finally {
        }
    }

    public final void F0() {
        BufferedReader bufferedReader;
        InputStream openRawResource = this.f61306c.getResources().openRawResource(C1987R.raw.stopbang);
        kotlin.jvm.internal.u.i(openRawResource, "openRawResource(...)");
        InputStreamReader inputStreamReader = new InputStreamReader(openRawResource, dp0.c.f64094b);
        if (inputStreamReader instanceof BufferedReader) {
            bufferedReader = (BufferedReader) inputStreamReader;
        } else {
            bufferedReader = new BufferedReader(inputStreamReader, UserMetadata.MAX_INTERNAL_KEY_SIZE);
        }
        try {
            String b10 = wm0.f.b(bufferedReader);
            Integer num = null;
            ge0.d.a(bufferedReader, null);
            Insight insight = (Insight) new Gson().fromJson(b10, (Class<Object>) Insight.class);
            insight.setContext(new LinkedHashMap());
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), Dispatchers.getIO(), null, new c(insight, null), 2, null);
            insight.setConditions(new LinkedHashMap());
            User user = this.f61304a;
            if (user.getGenderPreferences().getGender() == User.Gender.MALE) {
                Map<String, String> context = insight.getContext();
                kotlin.jvm.internal.u.g(context);
                context.put("stopbang_g", "1");
                Map<String, String> conditions = insight.getConditions();
                kotlin.jvm.internal.u.g(conditions);
                conditions.put("gender", ConstantsWs.USER_ADVANCED_GENDER_MALE);
            } else {
                Map<String, String> conditions2 = insight.getConditions();
                kotlin.jvm.internal.u.g(conditions2);
                conditions2.put("gender", ConstantsWs.USER_ADVANCED_GENDER_FEMALE);
            }
            Integer valueOf = Integer.valueOf(s70.a.a(user));
            if (valueOf.intValue() >= 50) {
                num = valueOf;
            }
            if (num != null) {
                Map<String, String> context2 = insight.getContext();
                kotlin.jvm.internal.u.g(context2);
                context2.put("stopbang_a", "1");
            }
            this.f61314k.postValue(new xw.c<>(insight));
        } finally {
        }
    }

    public final void G0(String newNote) {
        String str;
        kotlin.jvm.internal.u.j(newNote, "newNote");
        Track value = this.f61315l.getValue();
        if (value != null) {
            str = value.getNote();
        } else {
            str = null;
        }
        if (!kotlin.jvm.internal.u.e(newNote, str) && value != null) {
            value.setNote(dp0.j.i0(newNote).toString());
            BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(this), Dispatchers.getIO(), null, new g(value, null), 2, null);
        }
    }

    public final androidx.lifecycle.k0<xw.c<Insight>> t0() {
        return this.f61314k;
    }

    public final androidx.lifecycle.j0 y0() {
        return this.f61317n;
    }

    public final androidx.lifecycle.j0 z0() {
        return this.f61318o;
    }
}
