package com.withings.wiscale2.sleep.ui.sleepscore;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.widget.TextView;
import com.withings.library.sleep.SleepLib;
import com.withings.library.sleep.SleepScoreConstants;
import com.withings.library.sleep.SleepScoreGenericConstants;
import com.withings.util.log.Fail;
import com.withings.views.view.HorizontalScaleView;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.track.data.SleepScore;
import com.withings.wiscale2.track.data.SleepScoreColorHelper;
import com.withings.wiscale2.track.data.SleepScoreHelper;
import com.withings.wiscale2.track.data.SleepScoreHelperKt;
import com.withings.wiscale2.track.data.SleepTrackData;
import com.withings.wiscale2.track.data.Track;
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
import org.joda.time.DateTimeConstants;
import pm.e;
/* compiled from: SleepScoreTimeToSleepActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/sleep/ui/sleepscore/SleepScoreTimeToSleepActivity;", "Lcom/withings/wiscale2/sleep/ui/sleepscore/BaseSleepDetailActivity;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SleepScoreTimeToSleepActivity extends Hilt_SleepScoreTimeToSleepActivity {
    @Inject

    /* renamed from: g  reason: collision with root package name */
    public ei0.q f60847g;

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f60848h = nm0.h.b(new f());

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f60849i = nm0.h.b(new e());

    /* renamed from: j  reason: collision with root package name */
    private final nm0.g f60850j = nm0.h.b(new h());

    /* renamed from: k  reason: collision with root package name */
    private final nm0.g f60851k = nm0.h.b(new g());

    /* renamed from: l  reason: collision with root package name */
    private final d f60852l = new d(this);

    /* renamed from: m  reason: collision with root package name */
    private final nm0.g f60853m = nm0.h.b(new c());

    /* renamed from: n  reason: collision with root package name */
    private Track f60854n;

    /* renamed from: o  reason: collision with root package name */
    private SleepTrackData f60855o;

    /* renamed from: p  reason: collision with root package name */
    private SleepScore.Info f60856p;

    /* renamed from: q  reason: collision with root package name */
    private SparseArray<List<CharSequence>> f60857q;

    /* renamed from: r  reason: collision with root package name */
    private SleepScoreConstants f60858r;

    /* renamed from: t  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f60846t = {androidx.camera.core.v.c(SleepScoreTimeToSleepActivity.class, "sleepTrackId", "getSleepTrackId()J", 0)};

    /* renamed from: s  reason: collision with root package name */
    public static final a f60845s = new Object();

    /* compiled from: SleepScoreTimeToSleepActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    /* compiled from: SleepScoreTimeToSleepActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SleepScoreTimeToSleepActivity$onCreate$1", f = "SleepScoreTimeToSleepActivity.kt", l = {65}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        SleepScoreTimeToSleepActivity f60859a;

        /* renamed from: b  reason: collision with root package name */
        int f60860b;

        /* renamed from: c  reason: collision with root package name */
        private /* synthetic */ Object f60861c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SleepScoreTimeToSleepActivity.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SleepScoreTimeToSleepActivity$onCreate$1$1", f = "SleepScoreTimeToSleepActivity.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super Track>, Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ SleepScoreTimeToSleepActivity f60863a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(SleepScoreTimeToSleepActivity sleepScoreTimeToSleepActivity, qm0.d<? super a> dVar) {
                super(2, dVar);
                this.f60863a = sleepScoreTimeToSleepActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                return new a(this.f60863a, dVar);
            }

            @Override // ym0.p
            public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super Track> dVar) {
                return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                nm0.l.b(obj);
                SleepScoreTimeToSleepActivity sleepScoreTimeToSleepActivity = this.f60863a;
                ei0.q qVar = sleepScoreTimeToSleepActivity.f60847g;
                if (qVar != null) {
                    return qVar.o(SleepScoreTimeToSleepActivity.G3(sleepScoreTimeToSleepActivity));
                }
                kotlin.jvm.internal.u.s("sleepTrackManager");
                throw null;
            }
        }

        b(qm0.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f60861c = obj;
            return bVar;
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object withContext;
            SleepScoreTimeToSleepActivity sleepScoreTimeToSleepActivity;
            List W;
            SleepScore.Info info;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f60860b;
            SleepScoreTimeToSleepActivity sleepScoreTimeToSleepActivity2 = SleepScoreTimeToSleepActivity.this;
            if (i11 != 0) {
                if (i11 == 1) {
                    sleepScoreTimeToSleepActivity = this.f60859a;
                    CoroutineScope coroutineScope = (CoroutineScope) this.f60861c;
                    nm0.l.b(obj);
                    withContext = obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(sleepScoreTimeToSleepActivity2, null);
                this.f60861c = (CoroutineScope) this.f60861c;
                this.f60859a = sleepScoreTimeToSleepActivity2;
                this.f60860b = 1;
                withContext = BuildersKt.withContext(io2, aVar, this);
                if (withContext == coroutineSingletons) {
                    return coroutineSingletons;
                }
                sleepScoreTimeToSleepActivity = sleepScoreTimeToSleepActivity2;
            }
            sleepScoreTimeToSleepActivity.f60854n = (Track) withContext;
            Track track = sleepScoreTimeToSleepActivity2.f60854n;
            if (track != null) {
                Parcelable data = track.getData();
                kotlin.jvm.internal.u.h(data, "null cannot be cast to non-null type com.withings.wiscale2.track.data.SleepTrackData");
                sleepScoreTimeToSleepActivity2.f60855o = (SleepTrackData) data;
                SleepScoreGenericConstants sleepScoreGenerics = SleepScoreHelperKt.getSleepScoreConstants();
                kotlin.jvm.internal.u.j(sleepScoreGenerics, "sleepScoreGenerics");
                q4 q4Var = new q4(sleepScoreTimeToSleepActivity2, sleepScoreGenerics);
                Track track2 = sleepScoreTimeToSleepActivity2.f60854n;
                if (track2 != null) {
                    Parcelable data2 = track2.getData();
                    kotlin.jvm.internal.u.h(data2, "null cannot be cast to non-null type com.withings.wiscale2.track.data.SleepTrackData");
                    long standardMinutes = ((SleepTrackData) data2).getDurationToSleep().getStandardMinutes();
                    SparseArray sparseArray = new SparseArray();
                    int statusGood = q4Var.b().getStatusGood();
                    if (standardMinutes == 0) {
                        String string = q4Var.c().getString(C1987R.string.sleepScoreDetail_timeToSleepIfGoodPart1InstantAlt1);
                        kotlin.jvm.internal.u.i(string, "getString(...)");
                        String string2 = q4Var.c().getString(C1987R.string.sleepScoreDetail_timeToSleepIfGoodPart1InstantAlt2);
                        kotlin.jvm.internal.u.i(string2, "getString(...)");
                        String string3 = q4Var.c().getString(C1987R.string.sleepScoreDetail_timeToSleepIfGoodPart1InstantAlt3);
                        kotlin.jvm.internal.u.i(string3, "getString(...)");
                        W = kotlin.collections.x.W(string, string2, string3);
                    } else if (standardMinutes == 1) {
                        String string4 = q4Var.c().getString(C1987R.string.sleepScoreDetail_timeToSleepIfGoodPart1OneMinuteAlt1);
                        kotlin.jvm.internal.u.i(string4, "getString(...)");
                        String string5 = q4Var.c().getString(C1987R.string.sleepScoreDetail_timeToSleepIfGoodPart1OneMinuteAlt2);
                        kotlin.jvm.internal.u.i(string5, "getString(...)");
                        String string6 = q4Var.c().getString(C1987R.string.sleepScoreDetail_timeToSleepIfGoodPart1OneMinuteAlt3);
                        kotlin.jvm.internal.u.i(string6, "getString(...)");
                        W = kotlin.collections.x.W(string4, string5, string6);
                    } else {
                        String string7 = q4Var.c().getString(C1987R.string.sleepScoreDetail_timeToSleepIfGoodPart1Alt1_formatted, String.valueOf(standardMinutes));
                        kotlin.jvm.internal.u.i(string7, "getString(...)");
                        String string8 = q4Var.c().getString(C1987R.string.sleepScoreDetail_timeToSleepIfGoodPart1Alt2_formatted, String.valueOf(standardMinutes));
                        kotlin.jvm.internal.u.i(string8, "getString(...)");
                        String string9 = q4Var.c().getString(C1987R.string.sleepScoreDetail_timeToSleepIfGoodPart1Alt3_formatted, String.valueOf(standardMinutes));
                        kotlin.jvm.internal.u.i(string9, "getString(...)");
                        W = kotlin.collections.x.W(string7, string8, string9);
                    }
                    sparseArray.put(statusGood, W);
                    int statusAverage = q4Var.b().getStatusAverage();
                    String string10 = q4Var.c().getString(C1987R.string.sleepScoreDetail_timeToSleepIfAveragePart1Alt1_formatted, String.valueOf(standardMinutes));
                    kotlin.jvm.internal.u.i(string10, "getString(...)");
                    String string11 = q4Var.c().getString(C1987R.string.sleepScoreDetail_timeToSleepIfAveragePart1Alt2_formatted, String.valueOf(standardMinutes));
                    kotlin.jvm.internal.u.i(string11, "getString(...)");
                    String string12 = q4Var.c().getString(C1987R.string.sleepScoreDetail_timeToSleepIfAveragePart1Alt3_formatted, String.valueOf(standardMinutes));
                    kotlin.jvm.internal.u.i(string12, "getString(...)");
                    sparseArray.put(statusAverage, kotlin.collections.x.W(string10, string11, string12));
                    sleepScoreTimeToSleepActivity2.f60857q = sparseArray;
                    SleepLib sleepLib = new SleepLib();
                    Track track3 = sleepScoreTimeToSleepActivity2.f60854n;
                    if (track3 != null) {
                        sleepScoreTimeToSleepActivity2.f60858r = sleepLib.getConstants(track3.getDeviceModel());
                        Track track4 = sleepScoreTimeToSleepActivity2.f60854n;
                        if (track4 != null) {
                            SleepScore sleepScore = track4.getSleepScore();
                            if (sleepScore != null) {
                                info = sleepScore.getTimeToFallAsleep();
                            } else {
                                info = null;
                            }
                            if (info != null) {
                                sleepScoreTimeToSleepActivity2.f60856p = info;
                                SleepScoreTimeToSleepActivity.H3(sleepScoreTimeToSleepActivity2);
                                SleepScoreTimeToSleepActivity.M3(sleepScoreTimeToSleepActivity2);
                                SleepScoreTimeToSleepActivity.O3(sleepScoreTimeToSleepActivity2);
                                return nm0.y.f85009a;
                            }
                            sleepScoreTimeToSleepActivity2.finish();
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
            kotlin.jvm.internal.u.s("sleepTrack");
            throw null;
        }
    }

    /* compiled from: SleepScoreTimeToSleepActivity.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<Random> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final Random invoke() {
            return new Random(SleepScoreTimeToSleepActivity.G3(SleepScoreTimeToSleepActivity.this));
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class d implements bn0.d<Activity, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f60865a = nm0.h.b(new t3(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f60866b;

        public d(Activity activity) {
            this.f60866b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f60865a.getValue();
        }
    }

    /* compiled from: SleepScoreTimeToSleepActivity.kt */
    /* loaded from: classes5.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.a<Integer> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final Integer invoke() {
            SleepScoreConstants sleepScoreConstants = SleepScoreTimeToSleepActivity.this.f60858r;
            if (sleepScoreConstants != null) {
                return Integer.valueOf(sleepScoreConstants.getTimeToSleepLongThreshold() * DateTimeConstants.MILLIS_PER_MINUTE);
            }
            kotlin.jvm.internal.u.s("sleepScoreConstantsForModel");
            throw null;
        }
    }

    /* compiled from: SleepScoreTimeToSleepActivity.kt */
    /* loaded from: classes5.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.a<Integer> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final Integer invoke() {
            SleepScoreConstants sleepScoreConstants = SleepScoreTimeToSleepActivity.this.f60858r;
            if (sleepScoreConstants != null) {
                return Integer.valueOf(sleepScoreConstants.getTimeToSleepGoodThreshold() * DateTimeConstants.MILLIS_PER_MINUTE);
            }
            kotlin.jvm.internal.u.s("sleepScoreConstantsForModel");
            throw null;
        }
    }

    /* compiled from: SleepScoreTimeToSleepActivity.kt */
    /* loaded from: classes5.dex */
    static final class g extends kotlin.jvm.internal.w implements ym0.a<HorizontalScaleView> {
        g() {
            super(0);
        }

        @Override // ym0.a
        public final HorizontalScaleView invoke() {
            return (HorizontalScaleView) SleepScoreTimeToSleepActivity.this.findViewById(C1987R.id.time_to_sleep_scale);
        }
    }

    /* compiled from: SleepScoreTimeToSleepActivity.kt */
    /* loaded from: classes5.dex */
    static final class h extends kotlin.jvm.internal.w implements ym0.a<TextView> {
        h() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) SleepScoreTimeToSleepActivity.this.findViewById(C1987R.id.top_text);
        }
    }

    public static String D3(SleepScoreTimeToSleepActivity this$0, double d11) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        return this$0.P3((long) d11);
    }

    public static final long G3(SleepScoreTimeToSleepActivity sleepScoreTimeToSleepActivity) {
        return ((Number) sleepScoreTimeToSleepActivity.f60852l.getValue(sleepScoreTimeToSleepActivity, f60846t[0])).longValue();
    }

    public static final void H3(SleepScoreTimeToSleepActivity sleepScoreTimeToSleepActivity) {
        String string = sleepScoreTimeToSleepActivity.getString(C1987R.string.sleepScore_timeToSleep);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        SleepTrackData sleepTrackData = sleepScoreTimeToSleepActivity.f60855o;
        if (sleepTrackData != null) {
            sleepScoreTimeToSleepActivity.B3(string, sleepScoreTimeToSleepActivity.P3(sleepTrackData.getDurationToSleep().getMillis()));
            SleepScoreHelper sleepScoreHelper = SleepScoreHelper.INSTANCE;
            SleepScore.Info info = sleepScoreTimeToSleepActivity.f60856p;
            if (info != null) {
                int sleepScoreGlyphSpecialUnknown = sleepScoreHelper.getSleepScoreGlyphSpecialUnknown(info);
                SleepScoreColorHelper sleepScoreColorHelper = SleepScoreColorHelper.INSTANCE;
                SleepScore.Info info2 = sleepScoreTimeToSleepActivity.f60856p;
                if (info2 != null) {
                    int statusTextGlyphColorForNonRelevantInfo = sleepScoreColorHelper.getStatusTextGlyphColorForNonRelevantInfo(info2);
                    SleepScore.Info info3 = sleepScoreTimeToSleepActivity.f60856p;
                    if (info3 != null) {
                        sleepScoreTimeToSleepActivity.C3(sleepScoreGlyphSpecialUnknown, statusTextGlyphColorForNonRelevantInfo, sleepScoreColorHelper.getInfoColorResSpecialUnknown(info3));
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
        kotlin.jvm.internal.u.s("sleepTrackData");
        throw null;
    }

    public static final void M3(SleepScoreTimeToSleepActivity sleepScoreTimeToSleepActivity) {
        List<CharSequence> list;
        SleepScore.Info info = sleepScoreTimeToSleepActivity.f60856p;
        if (info != null) {
            int status = info.getStatus();
            if (status == SleepScoreHelperKt.getSleepScoreConstants().getStatusGood()) {
                SparseArray<List<CharSequence>> sparseArray = sleepScoreTimeToSleepActivity.f60857q;
                if (sparseArray != null) {
                    list = sparseArray.get(SleepScoreHelperKt.getSleepScoreConstants().getStatusGood());
                } else {
                    kotlin.jvm.internal.u.s("wordings");
                    throw null;
                }
            } else if (status == SleepScoreHelperKt.getSleepScoreConstants().getStatusAverage() || status == SleepScoreHelperKt.getSleepScoreConstants().getStatusBad() || status == SleepScoreHelperKt.getSleepScoreConstants().getStatusUnknown()) {
                SparseArray<List<CharSequence>> sparseArray2 = sleepScoreTimeToSleepActivity.f60857q;
                if (sparseArray2 != null) {
                    list = sparseArray2.get(SleepScoreHelperKt.getSleepScoreConstants().getStatusAverage());
                } else {
                    kotlin.jvm.internal.u.s("wordings");
                    throw null;
                }
            } else {
                Fail.j("Invalid status for timeToSleep");
                SparseArray<List<CharSequence>> sparseArray3 = sleepScoreTimeToSleepActivity.f60857q;
                if (sparseArray3 != null) {
                    list = sparseArray3.get(SleepScoreHelperKt.getSleepScoreConstants().getStatusGood());
                } else {
                    kotlin.jvm.internal.u.s("wordings");
                    throw null;
                }
            }
            ((TextView) sleepScoreTimeToSleepActivity.f60850j.getValue()).setText(list.get(((Random) sleepScoreTimeToSleepActivity.f60853m.getValue()).nextInt(list.size() - 1)));
            return;
        }
        kotlin.jvm.internal.u.s("sleepScoreInfo");
        throw null;
    }

    public static final void O3(SleepScoreTimeToSleepActivity sleepScoreTimeToSleepActivity) {
        String string = sleepScoreTimeToSleepActivity.getString(C1987R.string.sleepScoreDetail_timeToSleepGraphGood);
        nm0.g gVar = sleepScoreTimeToSleepActivity.f60848h;
        HorizontalScaleView.f fVar = new HorizontalScaleView.f(string, ((Number) gVar.getValue()).intValue(), androidx.core.content.a.getColor(sleepScoreTimeToSleepActivity, C1987R.color.statusGood));
        fVar.f46631d = 1;
        HorizontalScaleView.f fVar2 = new HorizontalScaleView.f(sleepScoreTimeToSleepActivity.getString(C1987R.string.sleepScoreDetail_timeToSleepGraphAverage), ((Number) sleepScoreTimeToSleepActivity.f60849i.getValue()).intValue() - ((Number) gVar.getValue()).intValue(), androidx.core.content.a.getColor(sleepScoreTimeToSleepActivity, C1987R.color.background3));
        fVar2.f46631d = 2;
        HorizontalScaleView.e eVar = new HorizontalScaleView.e(0, kotlin.collections.x.W(fVar, fVar2));
        HorizontalScaleView horizontalScaleView = (HorizontalScaleView) sleepScoreTimeToSleepActivity.f60851k.getValue();
        horizontalScaleView.setScale(eVar);
        horizontalScaleView.setDelegate(new androidx.camera.lifecycle.b(sleepScoreTimeToSleepActivity, 6));
        horizontalScaleView.n();
        SleepTrackData sleepTrackData = sleepScoreTimeToSleepActivity.f60855o;
        if (sleepTrackData != null) {
            horizontalScaleView.a(1000L, sleepTrackData.getDurationToSleep().getMillis());
        } else {
            kotlin.jvm.internal.u.s("sleepTrackData");
            throw null;
        }
    }

    private final String P3(long j5) {
        e.a aVar = new e.a(this, 0);
        aVar.a(true);
        aVar.w(true);
        aVar.t(true);
        aVar.v();
        return new pm.e(aVar).a(j5);
    }

    @Override // com.withings.wiscale2.sleep.ui.sleepscore.Hilt_SleepScoreTimeToSleepActivity, com.withings.wiscale2.sleep.ui.sleepscore.BaseSleepDetailActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), null, null, new b(null), 3, null);
    }

    @Override // com.withings.wiscale2.sleep.ui.sleepscore.BaseSleepDetailActivity
    public final int z3() {
        return C1987R.layout.detail_view_sleep_time_to_sleep;
    }
}
