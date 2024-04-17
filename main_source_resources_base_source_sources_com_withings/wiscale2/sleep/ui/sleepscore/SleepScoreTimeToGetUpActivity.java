package com.withings.wiscale2.sleep.ui.sleepscore;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.widget.TextView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
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
import org.joda.time.Duration;
import pm.e;
/* compiled from: SleepScoreTimeToGetUpActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/sleep/ui/sleepscore/SleepScoreTimeToGetUpActivity;", "Lcom/withings/wiscale2/sleep/ui/sleepscore/BaseSleepDetailActivity;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SleepScoreTimeToGetUpActivity extends Hilt_SleepScoreTimeToGetUpActivity {
    @Inject

    /* renamed from: g  reason: collision with root package name */
    public ei0.q f60819g;

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f60820h = nm0.h.b(new b());

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f60821i = nm0.h.b(new h());

    /* renamed from: j  reason: collision with root package name */
    private final nm0.g f60822j = nm0.h.b(new g());

    /* renamed from: k  reason: collision with root package name */
    private final nm0.g f60823k = nm0.h.b(new i());

    /* renamed from: l  reason: collision with root package name */
    private final nm0.g f60824l = nm0.h.b(new f());

    /* renamed from: m  reason: collision with root package name */
    private final e f60825m = new e(this);

    /* renamed from: n  reason: collision with root package name */
    private final nm0.g f60826n = nm0.h.b(new d());

    /* renamed from: o  reason: collision with root package name */
    private final nm0.g f60827o = nm0.h.b(new j());

    /* renamed from: p  reason: collision with root package name */
    private Track f60828p;

    /* renamed from: q  reason: collision with root package name */
    private SleepTrackData f60829q;

    /* renamed from: r  reason: collision with root package name */
    private SleepScore.Info f60830r;

    /* renamed from: t  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f60818t = {androidx.camera.core.v.c(SleepScoreTimeToGetUpActivity.class, "sleepTrackId", "getSleepTrackId()J", 0)};

    /* renamed from: s  reason: collision with root package name */
    public static final a f60817s = new Object();

    /* compiled from: SleepScoreTimeToGetUpActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    /* compiled from: SleepScoreTimeToGetUpActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<SleepScoreConstants> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final SleepScoreConstants invoke() {
            SleepLib sleepLib = new SleepLib();
            Track track = SleepScoreTimeToGetUpActivity.this.f60828p;
            if (track != null) {
                return sleepLib.getConstants(track.getDeviceModel());
            }
            kotlin.jvm.internal.u.s("sleepTrack");
            throw null;
        }
    }

    /* compiled from: SleepScoreTimeToGetUpActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SleepScoreTimeToGetUpActivity$onCreate$1", f = "SleepScoreTimeToGetUpActivity.kt", l = {65}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class c extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        SleepScoreTimeToGetUpActivity f60832a;

        /* renamed from: b  reason: collision with root package name */
        int f60833b;

        /* renamed from: c  reason: collision with root package name */
        private /* synthetic */ Object f60834c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SleepScoreTimeToGetUpActivity.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SleepScoreTimeToGetUpActivity$onCreate$1$1", f = "SleepScoreTimeToGetUpActivity.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super Track>, Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ SleepScoreTimeToGetUpActivity f60836a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(SleepScoreTimeToGetUpActivity sleepScoreTimeToGetUpActivity, qm0.d<? super a> dVar) {
                super(2, dVar);
                this.f60836a = sleepScoreTimeToGetUpActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                return new a(this.f60836a, dVar);
            }

            @Override // ym0.p
            public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super Track> dVar) {
                return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                nm0.l.b(obj);
                SleepScoreTimeToGetUpActivity sleepScoreTimeToGetUpActivity = this.f60836a;
                ei0.q qVar = sleepScoreTimeToGetUpActivity.f60819g;
                if (qVar != null) {
                    return qVar.o(SleepScoreTimeToGetUpActivity.G3(sleepScoreTimeToGetUpActivity));
                }
                kotlin.jvm.internal.u.s("sleepTrackManager");
                throw null;
            }
        }

        c(qm0.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.f60834c = obj;
            return cVar;
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            SleepScoreTimeToGetUpActivity sleepScoreTimeToGetUpActivity;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f60833b;
            SleepScore.Info info = null;
            SleepScoreTimeToGetUpActivity sleepScoreTimeToGetUpActivity2 = SleepScoreTimeToGetUpActivity.this;
            if (i11 != 0) {
                if (i11 == 1) {
                    sleepScoreTimeToGetUpActivity = this.f60832a;
                    CoroutineScope coroutineScope = (CoroutineScope) this.f60834c;
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(sleepScoreTimeToGetUpActivity2, null);
                this.f60834c = (CoroutineScope) this.f60834c;
                this.f60832a = sleepScoreTimeToGetUpActivity2;
                this.f60833b = 1;
                obj = BuildersKt.withContext(io2, aVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                sleepScoreTimeToGetUpActivity = sleepScoreTimeToGetUpActivity2;
            }
            sleepScoreTimeToGetUpActivity.f60828p = (Track) obj;
            Track track = sleepScoreTimeToGetUpActivity2.f60828p;
            if (track != null) {
                Parcelable data = track.getData();
                kotlin.jvm.internal.u.h(data, "null cannot be cast to non-null type com.withings.wiscale2.track.data.SleepTrackData");
                sleepScoreTimeToGetUpActivity2.f60829q = (SleepTrackData) data;
                Track track2 = sleepScoreTimeToGetUpActivity2.f60828p;
                if (track2 != null) {
                    SleepScore sleepScore = track2.getSleepScore();
                    if (sleepScore != null) {
                        info = sleepScore.getTimeToGetUp();
                    }
                    if (info != null) {
                        sleepScoreTimeToGetUpActivity2.f60830r = info;
                        SleepScoreTimeToGetUpActivity.H3(sleepScoreTimeToGetUpActivity2);
                        SleepScoreTimeToGetUpActivity.L3(sleepScoreTimeToGetUpActivity2);
                        SleepScoreTimeToGetUpActivity.M3(sleepScoreTimeToGetUpActivity2);
                        return nm0.y.f85009a;
                    }
                    sleepScoreTimeToGetUpActivity2.finish();
                    return nm0.y.f85009a;
                }
                kotlin.jvm.internal.u.s("sleepTrack");
                throw null;
            }
            kotlin.jvm.internal.u.s("sleepTrack");
            throw null;
        }
    }

    /* compiled from: SleepScoreTimeToGetUpActivity.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<Random> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final Random invoke() {
            return new Random(SleepScoreTimeToGetUpActivity.G3(SleepScoreTimeToGetUpActivity.this));
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class e implements bn0.d<Activity, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f60838a = nm0.h.b(new r3(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f60839b;

        public e(Activity activity) {
            this.f60839b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f60838a.getValue();
        }
    }

    /* compiled from: SleepScoreTimeToGetUpActivity.kt */
    /* loaded from: classes5.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.a<HorizontalScaleView> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final HorizontalScaleView invoke() {
            return (HorizontalScaleView) SleepScoreTimeToGetUpActivity.this.findViewById(C1987R.id.time_to_get_up_scale);
        }
    }

    /* compiled from: SleepScoreTimeToGetUpActivity.kt */
    /* loaded from: classes5.dex */
    static final class g extends kotlin.jvm.internal.w implements ym0.a<Integer> {
        g() {
            super(0);
        }

        @Override // ym0.a
        public final Integer invoke() {
            return Integer.valueOf(SleepScoreTimeToGetUpActivity.E3(SleepScoreTimeToGetUpActivity.this).getWakeupLongThreshold() * DateTimeConstants.MILLIS_PER_MINUTE);
        }
    }

    /* compiled from: SleepScoreTimeToGetUpActivity.kt */
    /* loaded from: classes5.dex */
    static final class h extends kotlin.jvm.internal.w implements ym0.a<Integer> {
        h() {
            super(0);
        }

        @Override // ym0.a
        public final Integer invoke() {
            return Integer.valueOf(SleepScoreTimeToGetUpActivity.E3(SleepScoreTimeToGetUpActivity.this).getWakeupGoodThreshold() * DateTimeConstants.MILLIS_PER_MINUTE);
        }
    }

    /* compiled from: SleepScoreTimeToGetUpActivity.kt */
    /* loaded from: classes5.dex */
    static final class i extends kotlin.jvm.internal.w implements ym0.a<TextView> {
        i() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) SleepScoreTimeToGetUpActivity.this.findViewById(C1987R.id.top_text);
        }
    }

    /* compiled from: SleepScoreTimeToGetUpActivity.kt */
    /* loaded from: classes5.dex */
    static final class j extends kotlin.jvm.internal.w implements ym0.a<SparseArray<List<? extends CharSequence>>> {
        j() {
            super(0);
        }

        @Override // ym0.a
        public final SparseArray<List<? extends CharSequence>> invoke() {
            long j5;
            List<? extends CharSequence> W;
            SleepScoreGenericConstants sleepScoreGenerics = SleepScoreHelperKt.getSleepScoreConstants();
            SleepScoreTimeToGetUpActivity context = SleepScoreTimeToGetUpActivity.this;
            kotlin.jvm.internal.u.j(context, "context");
            kotlin.jvm.internal.u.j(sleepScoreGenerics, "sleepScoreGenerics");
            q4 q4Var = new q4(context, sleepScoreGenerics);
            Track track = context.f60828p;
            if (track != null) {
                Parcelable data = track.getData();
                kotlin.jvm.internal.u.h(data, "null cannot be cast to non-null type com.withings.wiscale2.track.data.SleepTrackData");
                Duration durationToGetUp = ((SleepTrackData) data).getDurationToGetUp();
                if (durationToGetUp != null) {
                    j5 = durationToGetUp.getStandardMinutes();
                } else {
                    j5 = 0;
                }
                SparseArray<List<? extends CharSequence>> sparseArray = new SparseArray<>();
                int statusGood = q4Var.b().getStatusGood();
                if (j5 == 0) {
                    String string = q4Var.c().getString(C1987R.string.sleepScoreDetail_timeToGetUpIfGoodPart1InstantAlt1);
                    kotlin.jvm.internal.u.i(string, "getString(...)");
                    String string2 = q4Var.c().getString(C1987R.string.sleepScoreDetail_timeToGetUpIfGoodPart1InstantAlt2);
                    kotlin.jvm.internal.u.i(string2, "getString(...)");
                    String string3 = q4Var.c().getString(C1987R.string.sleepScoreDetail_timeToGetUpIfGoodPart1InstantAlt3);
                    kotlin.jvm.internal.u.i(string3, "getString(...)");
                    W = kotlin.collections.x.W(string, string2, string3);
                } else if (j5 == 1) {
                    String string4 = q4Var.c().getString(C1987R.string.sleepScoreDetail_timeToGetUpIfGoodPart1OneMinuteAlt1);
                    kotlin.jvm.internal.u.i(string4, "getString(...)");
                    String string5 = q4Var.c().getString(C1987R.string.sleepScoreDetail_timeToGetUpIfGoodPart1OneMinuteAlt2);
                    kotlin.jvm.internal.u.i(string5, "getString(...)");
                    String string6 = q4Var.c().getString(C1987R.string.sleepScoreDetail_timeToGetUpIfGoodPart1OneMinuteAlt3);
                    kotlin.jvm.internal.u.i(string6, "getString(...)");
                    W = kotlin.collections.x.W(string4, string5, string6);
                } else {
                    String string7 = q4Var.c().getString(C1987R.string.sleepScoreDetail_timeToGetUpIfGoodPart1Alt1_formatted, String.valueOf(j5));
                    kotlin.jvm.internal.u.i(string7, "getString(...)");
                    String string8 = q4Var.c().getString(C1987R.string.sleepScoreDetail_timeToGetUpIfGoodPart1Alt2_formatted, String.valueOf(j5));
                    kotlin.jvm.internal.u.i(string8, "getString(...)");
                    String string9 = q4Var.c().getString(C1987R.string.sleepScoreDetail_timeToGetUpIfGoodPart1Alt3_formatted, String.valueOf(j5));
                    kotlin.jvm.internal.u.i(string9, "getString(...)");
                    W = kotlin.collections.x.W(string7, string8, string9);
                }
                sparseArray.put(statusGood, W);
                int statusAverage = q4Var.b().getStatusAverage();
                String string10 = q4Var.c().getString(C1987R.string.sleepScoreDetail_timeToGetUpIfAveragePart1Alt1_formatted, String.valueOf(j5));
                kotlin.jvm.internal.u.i(string10, "getString(...)");
                String string11 = q4Var.c().getString(C1987R.string.sleepScoreDetail_timeToGetUpIfAveragePart1Alt2_formatted, String.valueOf(j5));
                kotlin.jvm.internal.u.i(string11, "getString(...)");
                String string12 = q4Var.c().getString(C1987R.string.sleepScoreDetail_timeToGetUpIfAveragePart1Alt3_formatted, String.valueOf(j5));
                kotlin.jvm.internal.u.i(string12, "getString(...)");
                sparseArray.put(statusAverage, kotlin.collections.x.W(string10, string11, string12));
                return sparseArray;
            }
            kotlin.jvm.internal.u.s("sleepTrack");
            throw null;
        }
    }

    public static String D3(SleepScoreTimeToGetUpActivity this$0, double d11) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        return this$0.N3((long) d11);
    }

    public static final SleepScoreConstants E3(SleepScoreTimeToGetUpActivity sleepScoreTimeToGetUpActivity) {
        return (SleepScoreConstants) sleepScoreTimeToGetUpActivity.f60820h.getValue();
    }

    public static final long G3(SleepScoreTimeToGetUpActivity sleepScoreTimeToGetUpActivity) {
        return ((Number) sleepScoreTimeToGetUpActivity.f60825m.getValue(sleepScoreTimeToGetUpActivity, f60818t[0])).longValue();
    }

    public static final void H3(SleepScoreTimeToGetUpActivity sleepScoreTimeToGetUpActivity) {
        long j5;
        String string = sleepScoreTimeToGetUpActivity.getString(C1987R.string.sleepScore_timeToGetUp);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        SleepTrackData sleepTrackData = sleepScoreTimeToGetUpActivity.f60829q;
        if (sleepTrackData != null) {
            Duration durationToGetUp = sleepTrackData.getDurationToGetUp();
            if (durationToGetUp != null) {
                j5 = durationToGetUp.getMillis();
            } else {
                j5 = 0;
            }
            sleepScoreTimeToGetUpActivity.B3(string, sleepScoreTimeToGetUpActivity.N3(j5));
            SleepScoreHelper sleepScoreHelper = SleepScoreHelper.INSTANCE;
            SleepScore.Info info = sleepScoreTimeToGetUpActivity.f60830r;
            if (info != null) {
                int sleepScoreGlyphSpecialUnknown = sleepScoreHelper.getSleepScoreGlyphSpecialUnknown(info);
                SleepScoreColorHelper sleepScoreColorHelper = SleepScoreColorHelper.INSTANCE;
                SleepScore.Info info2 = sleepScoreTimeToGetUpActivity.f60830r;
                if (info2 != null) {
                    int statusTextGlyphColorForNonRelevantInfo = sleepScoreColorHelper.getStatusTextGlyphColorForNonRelevantInfo(info2);
                    SleepScore.Info info3 = sleepScoreTimeToGetUpActivity.f60830r;
                    if (info3 != null) {
                        sleepScoreTimeToGetUpActivity.C3(sleepScoreGlyphSpecialUnknown, statusTextGlyphColorForNonRelevantInfo, sleepScoreColorHelper.getInfoColorResSpecialUnknown(info3));
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

    public static final void L3(SleepScoreTimeToGetUpActivity sleepScoreTimeToGetUpActivity) {
        List list;
        SleepScore.Info info = sleepScoreTimeToGetUpActivity.f60830r;
        if (info != null) {
            int status = info.getStatus();
            int statusGood = SleepScoreHelperKt.getSleepScoreConstants().getStatusGood();
            nm0.g gVar = sleepScoreTimeToGetUpActivity.f60827o;
            if (status == statusGood) {
                list = (List) ((SparseArray) gVar.getValue()).get(SleepScoreHelperKt.getSleepScoreConstants().getStatusGood());
            } else if (status == SleepScoreHelperKt.getSleepScoreConstants().getStatusAverage() || status == SleepScoreHelperKt.getSleepScoreConstants().getStatusBad() || status == SleepScoreHelperKt.getSleepScoreConstants().getStatusUnknown()) {
                list = (List) ((SparseArray) gVar.getValue()).get(SleepScoreHelperKt.getSleepScoreConstants().getStatusAverage());
            } else {
                Fail.j("Invalid status for timeToGetUp");
                list = (List) ((SparseArray) gVar.getValue()).get(SleepScoreHelperKt.getSleepScoreConstants().getStatusGood());
            }
            ((TextView) sleepScoreTimeToGetUpActivity.f60823k.getValue()).setText((CharSequence) list.get(((Random) sleepScoreTimeToGetUpActivity.f60826n.getValue()).nextInt(list.size() - 1)));
            return;
        }
        kotlin.jvm.internal.u.s("sleepScoreInfo");
        throw null;
    }

    public static final void M3(SleepScoreTimeToGetUpActivity sleepScoreTimeToGetUpActivity) {
        double d11;
        String string = sleepScoreTimeToGetUpActivity.getString(C1987R.string.sleepScoreDetail_timeToSleepGraphGood);
        nm0.g gVar = sleepScoreTimeToGetUpActivity.f60821i;
        HorizontalScaleView.f fVar = new HorizontalScaleView.f(string, ((Number) gVar.getValue()).intValue(), androidx.core.content.a.getColor(sleepScoreTimeToGetUpActivity, C1987R.color.statusGood));
        fVar.f46631d = 1;
        HorizontalScaleView.f fVar2 = new HorizontalScaleView.f(sleepScoreTimeToGetUpActivity.getString(C1987R.string.sleepScoreDetail_timeToSleepGraphAverage), ((Number) sleepScoreTimeToGetUpActivity.f60822j.getValue()).intValue() - ((Number) gVar.getValue()).intValue(), androidx.core.content.a.getColor(sleepScoreTimeToGetUpActivity, C1987R.color.background3));
        fVar2.f46631d = 2;
        HorizontalScaleView.e eVar = new HorizontalScaleView.e(0, kotlin.collections.x.W(fVar, fVar2));
        HorizontalScaleView horizontalScaleView = (HorizontalScaleView) sleepScoreTimeToGetUpActivity.f60824l.getValue();
        horizontalScaleView.setScale(eVar);
        horizontalScaleView.setDelegate(new e2.n(sleepScoreTimeToGetUpActivity, 6));
        horizontalScaleView.n();
        SleepTrackData sleepTrackData = sleepScoreTimeToGetUpActivity.f60829q;
        if (sleepTrackData != null) {
            Duration durationToGetUp = sleepTrackData.getDurationToGetUp();
            if (durationToGetUp != null) {
                d11 = durationToGetUp.getMillis();
            } else {
                d11 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            }
            horizontalScaleView.a(1000L, d11);
            return;
        }
        kotlin.jvm.internal.u.s("sleepTrackData");
        throw null;
    }

    private final String N3(long j5) {
        e.a aVar = new e.a(this, 0);
        aVar.a(true);
        aVar.w(true);
        aVar.t(true);
        aVar.v();
        return new pm.e(aVar).a(j5);
    }

    @Override // com.withings.wiscale2.sleep.ui.sleepscore.Hilt_SleepScoreTimeToGetUpActivity, com.withings.wiscale2.sleep.ui.sleepscore.BaseSleepDetailActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), null, null, new c(null), 3, null);
    }

    @Override // com.withings.wiscale2.sleep.ui.sleepscore.BaseSleepDetailActivity
    public final int z3() {
        return C1987R.layout.detail_view_sleep_time_to_get_up;
    }
}
