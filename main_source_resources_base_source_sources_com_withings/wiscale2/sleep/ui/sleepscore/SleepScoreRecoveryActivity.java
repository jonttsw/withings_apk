package com.withings.wiscale2.sleep.ui.sleepscore;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.widget.TextView;
import com.withings.util.log.Fail;
import com.withings.vasistas.model.SleepLevel;
import com.withings.views.view.HorizontalSausageWithLegendsView;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.track.data.SleepScore;
import com.withings.wiscale2.track.data.SleepScoreColorHelper;
import com.withings.wiscale2.track.data.SleepScoreHelper;
import com.withings.wiscale2.track.data.SleepScoreHelperKt;
import com.withings.wiscale2.track.data.SleepTrackData;
import com.withings.wiscale2.track.data.Track;
import java.text.NumberFormat;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.joda.time.Duration;
import pm.e;
/* compiled from: SleepScoreRecoveryActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/sleep/ui/sleepscore/SleepScoreRecoveryActivity;", "Lcom/withings/wiscale2/sleep/ui/sleepscore/BaseSleepDetailActivity;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SleepScoreRecoveryActivity extends Hilt_SleepScoreRecoveryActivity {
    @Inject

    /* renamed from: g  reason: collision with root package name */
    public ei0.q f60697g;

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f60698h = nm0.h.b(new f());

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f60699i = nm0.h.b(new h());

    /* renamed from: j  reason: collision with root package name */
    private final nm0.g f60700j = nm0.h.b(new b());

    /* renamed from: k  reason: collision with root package name */
    private final nm0.g f60701k = nm0.h.b(new c());

    /* renamed from: l  reason: collision with root package name */
    private final g f60702l = new g(this);

    /* renamed from: m  reason: collision with root package name */
    private final nm0.g f60703m = nm0.h.b(new e());

    /* renamed from: n  reason: collision with root package name */
    private final pm.e f60704n;

    /* renamed from: o  reason: collision with root package name */
    private final NumberFormat f60705o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f60706p;

    /* renamed from: q  reason: collision with root package name */
    private Track f60707q;

    /* renamed from: r  reason: collision with root package name */
    private SleepTrackData f60708r;

    /* renamed from: s  reason: collision with root package name */
    private SleepScore.Info f60709s;

    /* renamed from: t  reason: collision with root package name */
    private SparseArray<List<CharSequence>> f60710t;

    /* renamed from: v  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f60696v = {androidx.camera.core.v.c(SleepScoreRecoveryActivity.class, "sleepTrackId", "getSleepTrackId()J", 0)};

    /* renamed from: u  reason: collision with root package name */
    public static final a f60695u = new Object();

    /* compiled from: SleepScoreRecoveryActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    /* compiled from: SleepScoreRecoveryActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<TextView> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) SleepScoreRecoveryActivity.this.findViewById(C1987R.id.bottom_text);
        }
    }

    /* compiled from: SleepScoreRecoveryActivity.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<HorizontalSausageWithLegendsView> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final HorizontalSausageWithLegendsView invoke() {
            return (HorizontalSausageWithLegendsView) SleepScoreRecoveryActivity.this.findViewById(C1987R.id.night_recovery_data);
        }
    }

    /* compiled from: SleepScoreRecoveryActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SleepScoreRecoveryActivity$onCreate$1", f = "SleepScoreRecoveryActivity.kt", l = {71}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class d extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        SleepScoreRecoveryActivity f60713a;

        /* renamed from: b  reason: collision with root package name */
        int f60714b;

        /* renamed from: c  reason: collision with root package name */
        private /* synthetic */ Object f60715c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SleepScoreRecoveryActivity.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SleepScoreRecoveryActivity$onCreate$1$1", f = "SleepScoreRecoveryActivity.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super Track>, Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ SleepScoreRecoveryActivity f60717a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(SleepScoreRecoveryActivity sleepScoreRecoveryActivity, qm0.d<? super a> dVar) {
                super(2, dVar);
                this.f60717a = sleepScoreRecoveryActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                return new a(this.f60717a, dVar);
            }

            @Override // ym0.p
            public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super Track> dVar) {
                return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                nm0.l.b(obj);
                SleepScoreRecoveryActivity sleepScoreRecoveryActivity = this.f60717a;
                ei0.q qVar = sleepScoreRecoveryActivity.f60697g;
                if (qVar != null) {
                    return qVar.o(SleepScoreRecoveryActivity.H3(sleepScoreRecoveryActivity));
                }
                kotlin.jvm.internal.u.s("sleepTrackManager");
                throw null;
            }
        }

        d(qm0.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            d dVar2 = new d(dVar);
            dVar2.f60715c = obj;
            return dVar2;
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((d) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            SleepScoreRecoveryActivity sleepScoreRecoveryActivity;
            SleepScore.Info info;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f60714b;
            boolean z5 = true;
            SleepScoreRecoveryActivity sleepScoreRecoveryActivity2 = SleepScoreRecoveryActivity.this;
            if (i11 != 0) {
                if (i11 == 1) {
                    sleepScoreRecoveryActivity = this.f60713a;
                    CoroutineScope coroutineScope = (CoroutineScope) this.f60715c;
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(sleepScoreRecoveryActivity2, null);
                this.f60715c = (CoroutineScope) this.f60715c;
                this.f60713a = sleepScoreRecoveryActivity2;
                this.f60714b = 1;
                obj = BuildersKt.withContext(io2, aVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                sleepScoreRecoveryActivity = sleepScoreRecoveryActivity2;
            }
            sleepScoreRecoveryActivity.f60707q = (Track) obj;
            Track track = sleepScoreRecoveryActivity2.f60707q;
            if (track != null) {
                Parcelable data = track.getData();
                kotlin.jvm.internal.u.h(data, "null cannot be cast to non-null type com.withings.wiscale2.track.data.SleepTrackData");
                sleepScoreRecoveryActivity2.f60708r = (SleepTrackData) data;
                p pVar = new p(sleepScoreRecoveryActivity2, SleepScoreHelperKt.getSleepScoreConstants());
                Track track2 = sleepScoreRecoveryActivity2.f60707q;
                if (track2 != null) {
                    sleepScoreRecoveryActivity2.f60710t = pVar.f(track2);
                    Track track3 = sleepScoreRecoveryActivity2.f60707q;
                    if (track3 != null) {
                        SleepScore sleepScore = track3.getSleepScore();
                        if (sleepScore != null) {
                            info = sleepScore.getRecovery();
                        } else {
                            info = null;
                        }
                        if (info != null) {
                            sleepScoreRecoveryActivity2.f60709s = info;
                            SleepScoreRecoveryActivity.I3(sleepScoreRecoveryActivity2);
                            SleepTrackData sleepTrackData = sleepScoreRecoveryActivity2.f60708r;
                            if (sleepTrackData != null) {
                                int D3 = SleepScoreRecoveryActivity.D3(sleepScoreRecoveryActivity2, sleepTrackData.getDurationOrZero(sleepTrackData.getDeepSleepDuration()).getMillis());
                                int D32 = SleepScoreRecoveryActivity.D3(sleepScoreRecoveryActivity2, sleepTrackData.getDurationOrZero(sleepTrackData.getRemSleepDuration()).getMillis());
                                int D33 = SleepScoreRecoveryActivity.D3(sleepScoreRecoveryActivity2, sleepTrackData.getDurationOrZero(sleepTrackData.getManualSleepDuration()).getMillis());
                                int D34 = SleepScoreRecoveryActivity.D3(sleepScoreRecoveryActivity2, sleepTrackData.getDurationOrZero(sleepTrackData.getUnspecifiedSleepDuration()).getMillis());
                                int i12 = ((100 - D3) - D32) - D33;
                                SleepScoreRecoveryActivity.N3(sleepScoreRecoveryActivity2);
                                if (ah.m.z(sleepTrackData.getManualSleepDuration()) <= 0) {
                                    z5 = false;
                                }
                                sleepScoreRecoveryActivity2.f60706p = z5;
                                SleepScoreRecoveryActivity.P3(sleepScoreRecoveryActivity2, D3, i12, D32, D33, D34);
                                return nm0.y.f85009a;
                            }
                            kotlin.jvm.internal.u.s("sleepTrackData");
                            throw null;
                        }
                        sleepScoreRecoveryActivity2.finish();
                        return nm0.y.f85009a;
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
    }

    /* compiled from: SleepScoreRecoveryActivity.kt */
    /* loaded from: classes5.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.a<Random> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final Random invoke() {
            return new Random(SleepScoreRecoveryActivity.H3(SleepScoreRecoveryActivity.this));
        }
    }

    /* compiled from: SleepScoreRecoveryActivity.kt */
    /* loaded from: classes5.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.a<ViewGroup> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final ViewGroup invoke() {
            return (ViewGroup) SleepScoreRecoveryActivity.this.findViewById(C1987R.id.motionLayout);
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class g implements bn0.d<Activity, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f60720a = nm0.h.b(new f3(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f60721b;

        public g(Activity activity) {
            this.f60721b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f60720a.getValue();
        }
    }

    /* compiled from: SleepScoreRecoveryActivity.kt */
    /* loaded from: classes5.dex */
    static final class h extends kotlin.jvm.internal.w implements ym0.a<TextView> {
        h() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) SleepScoreRecoveryActivity.this.findViewById(C1987R.id.top_text);
        }
    }

    public SleepScoreRecoveryActivity() {
        e.a aVar = new e.a(this, 0);
        aVar.w(true);
        aVar.v();
        this.f60704n = new pm.e(aVar);
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        percentInstance.setMaximumFractionDigits(0);
        this.f60705o = percentInstance;
    }

    public static final int D3(SleepScoreRecoveryActivity sleepScoreRecoveryActivity, long j5) {
        double d11 = 100.0f * j5;
        SleepTrackData sleepTrackData = sleepScoreRecoveryActivity.f60708r;
        if (sleepTrackData != null) {
            return (int) Math.floor(d11 / sleepTrackData.getTotalSleep().getMillis());
        }
        kotlin.jvm.internal.u.s("sleepTrackData");
        throw null;
    }

    public static final ViewGroup E3(SleepScoreRecoveryActivity sleepScoreRecoveryActivity) {
        return (ViewGroup) sleepScoreRecoveryActivity.f60698h.getValue();
    }

    public static final long H3(SleepScoreRecoveryActivity sleepScoreRecoveryActivity) {
        return ((Number) sleepScoreRecoveryActivity.f60702l.getValue(sleepScoreRecoveryActivity, f60696v[0])).longValue();
    }

    public static final void I3(SleepScoreRecoveryActivity sleepScoreRecoveryActivity) {
        String string;
        String string2 = sleepScoreRecoveryActivity.getString(C1987R.string.sleepScore_recovery);
        kotlin.jvm.internal.u.i(string2, "getString(...)");
        SleepScore.Info info = sleepScoreRecoveryActivity.f60709s;
        if (info != null) {
            int status = info.getStatus();
            if (status == SleepScoreHelperKt.getSleepScoreConstants().getStatusGood()) {
                string = sleepScoreRecoveryActivity.getString(C1987R.string.sleepScore_recoveryGood);
            } else if (status == SleepScoreHelperKt.getSleepScoreConstants().getStatusAverage()) {
                string = sleepScoreRecoveryActivity.getString(C1987R.string.sleepScore_recoveryAverage);
            } else if (status == SleepScoreHelperKt.getSleepScoreConstants().getStatusBad()) {
                string = sleepScoreRecoveryActivity.getString(C1987R.string.sleepScore_recoveryBad);
            } else {
                string = sleepScoreRecoveryActivity.getString(C1987R.string.sleepScore_recoveryUnknown);
            }
            kotlin.jvm.internal.u.g(string);
            sleepScoreRecoveryActivity.B3(string2, string);
            SleepScoreHelper sleepScoreHelper = SleepScoreHelper.INSTANCE;
            SleepScore.Info info2 = sleepScoreRecoveryActivity.f60709s;
            if (info2 != null) {
                int sleepScoreGlyph = sleepScoreHelper.getSleepScoreGlyph(info2);
                SleepScoreColorHelper sleepScoreColorHelper = SleepScoreColorHelper.INSTANCE;
                SleepScore.Info info3 = sleepScoreRecoveryActivity.f60709s;
                if (info3 != null) {
                    int statusTextGlyphColor$default = SleepScoreColorHelper.getStatusTextGlyphColor$default(sleepScoreColorHelper, info3, false, 2, null);
                    SleepScore.Info info4 = sleepScoreRecoveryActivity.f60709s;
                    if (info4 != null) {
                        sleepScoreRecoveryActivity.C3(sleepScoreGlyph, statusTextGlyphColor$default, sleepScoreColorHelper.getSleepInfoColorRes(info4));
                        return;
                    } else {
                        kotlin.jvm.internal.u.s("sleepScoreInfo");
                        throw null;
                    }
                }
                kotlin.jvm.internal.u.s("sleepScoreInfo");
                throw null;
            }
            kotlin.jvm.internal.u.s("sleepScoreInfo");
            throw null;
        }
        kotlin.jvm.internal.u.s("sleepScoreInfo");
        throw null;
    }

    public static final void N3(SleepScoreRecoveryActivity sleepScoreRecoveryActivity) {
        List<CharSequence> list;
        SleepScore.Info info = sleepScoreRecoveryActivity.f60709s;
        if (info != null) {
            int status = info.getStatus();
            if (status == SleepScoreHelperKt.getSleepScoreConstants().getStatusGood()) {
                SparseArray<List<CharSequence>> sparseArray = sleepScoreRecoveryActivity.f60710t;
                if (sparseArray != null) {
                    list = sparseArray.get(SleepScoreHelperKt.getSleepScoreConstants().getStatusGood());
                } else {
                    kotlin.jvm.internal.u.s("wordings");
                    throw null;
                }
            } else if (status == SleepScoreHelperKt.getSleepScoreConstants().getStatusAverage()) {
                SparseArray<List<CharSequence>> sparseArray2 = sleepScoreRecoveryActivity.f60710t;
                if (sparseArray2 != null) {
                    list = sparseArray2.get(SleepScoreHelperKt.getSleepScoreConstants().getStatusAverage());
                } else {
                    kotlin.jvm.internal.u.s("wordings");
                    throw null;
                }
            } else if (status == SleepScoreHelperKt.getSleepScoreConstants().getStatusBad()) {
                SparseArray<List<CharSequence>> sparseArray3 = sleepScoreRecoveryActivity.f60710t;
                if (sparseArray3 != null) {
                    list = sparseArray3.get(SleepScoreHelperKt.getSleepScoreConstants().getStatusBad());
                } else {
                    kotlin.jvm.internal.u.s("wordings");
                    throw null;
                }
            } else {
                Fail.j("Invalid status for duration");
                SparseArray<List<CharSequence>> sparseArray4 = sleepScoreRecoveryActivity.f60710t;
                if (sparseArray4 != null) {
                    list = sparseArray4.get(SleepScoreHelperKt.getSleepScoreConstants().getStatusGood());
                } else {
                    kotlin.jvm.internal.u.s("wordings");
                    throw null;
                }
            }
            ((TextView) sleepScoreRecoveryActivity.f60699i.getValue()).setText(list.get(((Random) sleepScoreRecoveryActivity.f60703m.getValue()).nextInt(list.size())));
            ((TextView) sleepScoreRecoveryActivity.f60700j.getValue()).setText(sleepScoreRecoveryActivity.getString(C1987R.string.sleepScoreDetail_recoveryPart2Alt1));
            return;
        }
        kotlin.jvm.internal.u.s("sleepScoreInfo");
        throw null;
    }

    public static final void P3(SleepScoreRecoveryActivity sleepScoreRecoveryActivity, int i11, int i12, int i13, int i14, int i15) {
        boolean z5;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SleepTrackData sleepTrackData = sleepScoreRecoveryActivity.f60708r;
        if (sleepTrackData != null) {
            if (ah.m.z(sleepTrackData.getUnspecifiedSleepDuration()) > 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            SleepTrackData sleepTrackData2 = sleepScoreRecoveryActivity.f60708r;
            if (sleepTrackData2 != null) {
                Duration deepSleepDuration = sleepTrackData2.getDeepSleepDuration();
                if (z5) {
                    deepSleepDuration = null;
                }
                sleepScoreRecoveryActivity.Q3(linkedHashMap, deepSleepDuration, SleepLevel.Deep, i11);
                SleepTrackData sleepTrackData3 = sleepScoreRecoveryActivity.f60708r;
                if (sleepTrackData3 != null) {
                    Duration remSleepDuration = sleepTrackData3.getRemSleepDuration();
                    if (z5) {
                        remSleepDuration = null;
                    }
                    sleepScoreRecoveryActivity.Q3(linkedHashMap, remSleepDuration, SleepLevel.Rem, i13);
                    SleepTrackData sleepTrackData4 = sleepScoreRecoveryActivity.f60708r;
                    if (sleepTrackData4 != null) {
                        Duration lightSleepDuration = sleepTrackData4.getLightSleepDuration();
                        if (z5) {
                            lightSleepDuration = null;
                        }
                        sleepScoreRecoveryActivity.Q3(linkedHashMap, lightSleepDuration, SleepLevel.Light, i12);
                        SleepTrackData sleepTrackData5 = sleepScoreRecoveryActivity.f60708r;
                        if (sleepTrackData5 != null) {
                            sleepScoreRecoveryActivity.Q3(linkedHashMap, sleepTrackData5.getUnspecifiedSleepDuration(), SleepLevel.Unspecified, i15);
                            boolean z11 = sleepScoreRecoveryActivity.f60706p;
                            nm0.g gVar = sleepScoreRecoveryActivity.f60701k;
                            if (!z11) {
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                Track track = sleepScoreRecoveryActivity.f60707q;
                                if (track != null) {
                                    if (kotlin.collections.l.l(new int[]{61, 63}, track.getDeviceModel())) {
                                        linkedHashMap2.put(1, new nm0.j(null, Integer.valueOf((int) C1987R.string.sleepScoreDetail_recoveryLightDefinition)));
                                        linkedHashMap2.put(2, new nm0.j(Integer.valueOf((int) C1987R.string.sleepScoreDetail_recoveryDeepDefinitionRecommendation), Integer.valueOf((int) C1987R.string.sleepScoreDetail_recoveryDeepDefinition)));
                                        linkedHashMap2.put(3, new nm0.j(Integer.valueOf((int) C1987R.string.sleepScoreDetail_recoveryRemDefinitionRecommendation), Integer.valueOf((int) C1987R.string.sleepScoreDetail_recoveryRemDefinition)));
                                    } else {
                                        linkedHashMap2.put(1, new nm0.j(null, Integer.valueOf((int) C1987R.string.sleepScoreDetail_recoveryIfNoRemLightDefinition)));
                                        linkedHashMap2.put(2, new nm0.j(Integer.valueOf((int) C1987R.string.sleepScoreDetail_recoveryIfNoRemDeepDefinitionRecommendation), Integer.valueOf((int) C1987R.string.sleepScoreDetail_recoveryIfNoRemDeepDefinition)));
                                    }
                                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                                        int intValue = ((Number) entry.getKey()).intValue();
                                        HorizontalSausageWithLegendsView.b bVar = (HorizontalSausageWithLegendsView.b) entry.getValue();
                                        nm0.j jVar = (nm0.j) linkedHashMap2.get(Integer.valueOf(intValue));
                                        if (jVar != null) {
                                            Integer num = (Integer) jVar.c();
                                            String str = (num == null || (str = sleepScoreRecoveryActivity.getString(num.intValue())) == null) ? "" : "";
                                            String string = sleepScoreRecoveryActivity.getString(((Number) jVar.d()).intValue());
                                            kotlin.jvm.internal.u.i(string, "getString(...)");
                                            bVar.j(str, string);
                                        }
                                    }
                                    ((HorizontalSausageWithLegendsView) gVar.getValue()).setExpandableLegendListener(new e3(sleepScoreRecoveryActivity));
                                } else {
                                    kotlin.jvm.internal.u.s("sleepTrack");
                                    throw null;
                                }
                            } else {
                                SleepLevel sleepLevel = SleepLevel.Manual;
                                Integer valueOf = Integer.valueOf(sleepLevel.getVasistasType());
                                int colorRes = sleepLevel.getColorRes();
                                SleepTrackData sleepTrackData6 = sleepScoreRecoveryActivity.f60708r;
                                if (sleepTrackData6 != null) {
                                    HorizontalSausageWithLegendsView.b R3 = sleepScoreRecoveryActivity.R3(colorRes, C1987R.string._MANUAL_, i14, ah.m.z(sleepTrackData6.getManualSleepDuration()));
                                    R3.k();
                                    R3.i();
                                    linkedHashMap.put(valueOf, R3);
                                } else {
                                    kotlin.jvm.internal.u.s("sleepTrackData");
                                    throw null;
                                }
                            }
                            ((HorizontalSausageWithLegendsView) gVar.getValue()).setLegends(kotlin.collections.x.Q0(linkedHashMap.values()));
                            return;
                        }
                        kotlin.jvm.internal.u.s("sleepTrackData");
                        throw null;
                    }
                    kotlin.jvm.internal.u.s("sleepTrackData");
                    throw null;
                }
                kotlin.jvm.internal.u.s("sleepTrackData");
                throw null;
            }
            kotlin.jvm.internal.u.s("sleepTrackData");
            throw null;
        }
        kotlin.jvm.internal.u.s("sleepTrackData");
        throw null;
    }

    private final void Q3(LinkedHashMap linkedHashMap, Duration duration, SleepLevel sleepLevel, int i11) {
        if (ah.m.z(duration) > 0) {
            HorizontalSausageWithLegendsView.b bVar = (HorizontalSausageWithLegendsView.b) linkedHashMap.put(Integer.valueOf(sleepLevel.getVasistasType()), R3(sleepLevel.getColorRes(), sleepLevel.getStringResID(), i11, ah.m.z(duration)));
        }
    }

    private final HorizontalSausageWithLegendsView.b R3(int i11, int i12, int i13, long j5) {
        String a11 = this.f60704n.a(j5);
        float f11 = i13 / 100.0f;
        String format = this.f60705o.format(Float.valueOf(f11));
        kotlin.jvm.internal.u.i(format, "format(...)");
        String str = a11 + " - " + format;
        String string = getString(i12);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        return new HorizontalSausageWithLegendsView.b(i11, string, str, f11, true, 16);
    }

    @Override // com.withings.wiscale2.sleep.ui.sleepscore.Hilt_SleepScoreRecoveryActivity, com.withings.wiscale2.sleep.ui.sleepscore.BaseSleepDetailActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), null, null, new d(null), 3, null);
    }

    @Override // com.withings.wiscale2.sleep.ui.sleepscore.BaseSleepDetailActivity
    public final int z3() {
        return C1987R.layout.detail_view_sleep_recovery;
    }
}
