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
import java.util.Locale;
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
/* compiled from: SleepScoreDurationActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/sleep/ui/sleepscore/SleepScoreDurationActivity;", "Lcom/withings/wiscale2/sleep/ui/sleepscore/BaseSleepDetailActivity;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SleepScoreDurationActivity extends Hilt_SleepScoreDurationActivity {
    @Inject

    /* renamed from: g  reason: collision with root package name */
    public ei0.q f60647g;

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f60648h = nm0.h.b(new f());

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f60649i = nm0.h.b(new b());

    /* renamed from: j  reason: collision with root package name */
    private final e f60650j = new e(this);

    /* renamed from: k  reason: collision with root package name */
    private final nm0.g f60651k = nm0.h.b(new d());

    /* renamed from: m  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f60646m = {androidx.camera.core.v.c(SleepScoreDurationActivity.class, "sleepTrackId", "getSleepTrackId()J", 0)};

    /* renamed from: l  reason: collision with root package name */
    public static final a f60645l = new Object();

    /* compiled from: SleepScoreDurationActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    /* compiled from: SleepScoreDurationActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<HorizontalScaleView> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final HorizontalScaleView invoke() {
            return (HorizontalScaleView) SleepScoreDurationActivity.this.findViewById(C1987R.id.duration_scale);
        }
    }

    /* compiled from: SleepScoreDurationActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SleepScoreDurationActivity$onCreate$1", f = "SleepScoreDurationActivity.kt", l = {57}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class c extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f60653a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f60654b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SleepScoreDurationActivity.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SleepScoreDurationActivity$onCreate$1$sleepTrack$1", f = "SleepScoreDurationActivity.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super Track>, Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ SleepScoreDurationActivity f60656a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(SleepScoreDurationActivity sleepScoreDurationActivity, qm0.d<? super a> dVar) {
                super(2, dVar);
                this.f60656a = sleepScoreDurationActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                return new a(this.f60656a, dVar);
            }

            @Override // ym0.p
            public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super Track> dVar) {
                return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                nm0.l.b(obj);
                SleepScoreDurationActivity sleepScoreDurationActivity = this.f60656a;
                ei0.q qVar = sleepScoreDurationActivity.f60647g;
                if (qVar != null) {
                    return qVar.o(SleepScoreDurationActivity.E3(sleepScoreDurationActivity));
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
            cVar.f60654b = obj;
            return cVar;
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f60653a;
            SleepScore.Info info = null;
            SleepScoreDurationActivity sleepScoreDurationActivity = SleepScoreDurationActivity.this;
            if (i11 != 0) {
                if (i11 == 1) {
                    CoroutineScope coroutineScope = (CoroutineScope) this.f60654b;
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(sleepScoreDurationActivity, null);
                this.f60654b = (CoroutineScope) this.f60654b;
                this.f60653a = 1;
                obj = BuildersKt.withContext(io2, aVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            Track track = (Track) obj;
            Parcelable data = track.getData();
            kotlin.jvm.internal.u.h(data, "null cannot be cast to non-null type com.withings.wiscale2.track.data.SleepTrackData");
            SleepTrackData sleepTrackData = (SleepTrackData) data;
            SleepScoreConstants constants = new SleepLib().getConstants(track.getDeviceModel());
            SleepScore sleepScore = track.getSleepScore();
            if (sleepScore != null) {
                info = sleepScore.getSleepDuration();
            }
            if (info == null) {
                sleepScoreDurationActivity.finish();
                return nm0.y.f85009a;
            }
            SleepScoreDurationActivity.F3(sleepScoreDurationActivity, sleepTrackData, info);
            SleepScoreDurationActivity.G3(sleepScoreDurationActivity, track, sleepTrackData, info, constants);
            SleepScoreDurationActivity.H3(sleepScoreDurationActivity, sleepTrackData, info, constants);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: SleepScoreDurationActivity.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<Random> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final Random invoke() {
            return new Random(SleepScoreDurationActivity.E3(SleepScoreDurationActivity.this));
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class e implements bn0.d<Activity, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f60658a = nm0.h.b(new x2(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f60659b;

        public e(Activity activity) {
            this.f60659b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f60658a.getValue();
        }
    }

    /* compiled from: SleepScoreDurationActivity.kt */
    /* loaded from: classes5.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.a<TextView> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) SleepScoreDurationActivity.this.findViewById(C1987R.id.top_text);
        }
    }

    public static String D3(SleepScoreDurationActivity this$0, double d11) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        return this$0.I3((long) d11);
    }

    public static final long E3(SleepScoreDurationActivity sleepScoreDurationActivity) {
        return ((Number) sleepScoreDurationActivity.f60650j.getValue(sleepScoreDurationActivity, f60646m[0])).longValue();
    }

    public static final void F3(SleepScoreDurationActivity sleepScoreDurationActivity, SleepTrackData sleepTrackData, SleepScore.Info info) {
        String string = sleepScoreDurationActivity.getString(C1987R.string.sleepScore_duration);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        sleepScoreDurationActivity.B3(string, sleepScoreDurationActivity.I3(sleepTrackData.getTotalSleep().getMillis()));
        int sleepScoreGlyph = SleepScoreHelper.INSTANCE.getSleepScoreGlyph(info);
        SleepScoreColorHelper sleepScoreColorHelper = SleepScoreColorHelper.INSTANCE;
        sleepScoreDurationActivity.C3(sleepScoreGlyph, SleepScoreColorHelper.getStatusTextGlyphColor$default(sleepScoreColorHelper, info, false, 2, null), sleepScoreColorHelper.getSleepInfoColorRes(info));
    }

    public static final void G3(SleepScoreDurationActivity sleepScoreDurationActivity, Track track, SleepTrackData sleepTrackData, SleepScore.Info info, SleepScoreConstants sleepScoreConstants) {
        List list;
        sleepScoreDurationActivity.getClass();
        SleepScoreGenericConstants sleepScoreGenerics = SleepScoreHelperKt.getSleepScoreConstants();
        kotlin.jvm.internal.u.j(sleepScoreGenerics, "sleepScoreGenerics");
        q4 q4Var = new q4(sleepScoreDurationActivity, sleepScoreGenerics);
        Parcelable data = track.getData();
        kotlin.jvm.internal.u.h(data, "null cannot be cast to non-null type com.withings.wiscale2.track.data.SleepTrackData");
        String a11 = q4Var.a(((SleepTrackData) data).getTotalSleep().getMillis());
        SparseArray sparseArray = new SparseArray();
        int statusPerfect = q4Var.b().getStatusPerfect();
        String string = q4Var.c().getString(C1987R.string.sleepScoreDetail_durationIfSweetSpotPart1Alt1_formatted, a11);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        String string2 = q4Var.c().getString(C1987R.string.sleepScoreDetail_durationIfSweetSpotPart1Alt2);
        kotlin.jvm.internal.u.i(string2, "getString(...)");
        String string3 = q4Var.c().getString(C1987R.string.sleepScoreDetail_durationIfSweetSpotPart1Alt3);
        kotlin.jvm.internal.u.i(string3, "getString(...)");
        sparseArray.put(statusPerfect, kotlin.collections.x.W(string, string2, string3));
        int statusGood = q4Var.b().getStatusGood();
        String string4 = q4Var.c().getString(C1987R.string.sleepScoreDetail_durationIfGoodPart1Alt1);
        kotlin.jvm.internal.u.i(string4, "getString(...)");
        String string5 = q4Var.c().getString(C1987R.string.sleepScoreDetail_durationIfGoodPart1Alt2);
        kotlin.jvm.internal.u.i(string5, "getString(...)");
        String string6 = q4Var.c().getString(C1987R.string.sleepScoreDetail_durationIfGoodPart1Alt3);
        kotlin.jvm.internal.u.i(string6, "getString(...)");
        sparseArray.put(statusGood, kotlin.collections.x.W(string4, string5, string6));
        int statusAverage = q4Var.b().getStatusAverage();
        String string7 = q4Var.c().getString(C1987R.string.sleepScoreDetail_durationIfShortPart1Alt1);
        kotlin.jvm.internal.u.i(string7, "getString(...)");
        String string8 = q4Var.c().getString(C1987R.string.sleepScoreDetail_durationIfShortPart1Alt2);
        kotlin.jvm.internal.u.i(string8, "getString(...)");
        String string9 = q4Var.c().getString(C1987R.string.sleepScoreDetail_durationIfShortPart1Alt3);
        kotlin.jvm.internal.u.i(string9, "getString(...)");
        sparseArray.put(statusAverage, kotlin.collections.x.W(string7, string8, string9));
        int statusBad = q4Var.b().getStatusBad();
        String string10 = q4Var.c().getString(C1987R.string.sleepScoreDetail_durationIfUnhealthyPart1Alt1);
        kotlin.jvm.internal.u.i(string10, "getString(...)");
        String string11 = q4Var.c().getString(C1987R.string.sleepScoreDetail_durationIfUnhealthyPart1Alt2_formatted, a11);
        kotlin.jvm.internal.u.i(string11, "getString(...)");
        String string12 = q4Var.c().getString(C1987R.string.sleepScoreDetail_durationIfUnhealthyPart1Alt3);
        kotlin.jvm.internal.u.i(string12, "getString(...)");
        sparseArray.put(statusBad, kotlin.collections.x.W(string10, string11, string12));
        int status = info.getStatus();
        if (status == SleepScoreHelperKt.getSleepScoreConstants().getStatusGood()) {
            list = (List) sparseArray.get(SleepScoreHelperKt.getSleepScoreConstants().getStatusGood());
        } else if (status == SleepScoreHelperKt.getSleepScoreConstants().getStatusAverage()) {
            list = (List) sparseArray.get(SleepScoreHelperKt.getSleepScoreConstants().getStatusAverage());
        } else if (status == SleepScoreHelperKt.getSleepScoreConstants().getStatusBad()) {
            list = (List) sparseArray.get(SleepScoreHelperKt.getSleepScoreConstants().getStatusBad());
        } else {
            Fail.j("Invalid status for duration");
            list = (List) sparseArray.get(SleepScoreHelperKt.getSleepScoreConstants().getStatusGood());
        }
        if (J3(sleepTrackData, info, sleepScoreConstants)) {
            list = (List) sparseArray.get(SleepScoreHelperKt.getSleepScoreConstants().getStatusPerfect());
        }
        ((TextView) sleepScoreDurationActivity.f60648h.getValue()).setText((CharSequence) list.get(((Random) sleepScoreDurationActivity.f60651k.getValue()).nextInt(list.size() - 1)));
    }

    public static final void H3(SleepScoreDurationActivity sleepScoreDurationActivity, SleepTrackData sleepTrackData, SleepScore.Info info, SleepScoreConstants sleepScoreConstants) {
        int i11;
        int i12;
        int i13;
        HorizontalScaleView horizontalScaleView = (HorizontalScaleView) sleepScoreDurationActivity.f60649i.getValue();
        boolean J3 = J3(sleepTrackData, info, sleepScoreConstants);
        int status = info.getStatus();
        int statusBad = SleepScoreHelperKt.getSleepScoreConstants().getStatusBad();
        int i14 = C1987R.color.datavizMonochromaticNeutral1;
        if (status == statusBad) {
            i11 = C1987R.color.statusBad;
        } else {
            i11 = C1987R.color.datavizMonochromaticNeutral1;
        }
        if (info.getStatus() == SleepScoreHelperKt.getSleepScoreConstants().getStatusAverage()) {
            i12 = C1987R.color.statusModerate;
        } else {
            i12 = C1987R.color.datavizMonochromaticNeutral1;
        }
        if (info.getStatus() == SleepScoreHelperKt.getSleepScoreConstants().getStatusGood() && J3) {
            i13 = C1987R.color.statusGood;
        } else {
            i13 = C1987R.color.datavizMonochromaticNeutral1;
        }
        if (info.getStatus() == SleepScoreHelperKt.getSleepScoreConstants().getStatusGood() && !J3) {
            i14 = C1987R.color.statusGood;
        }
        int durationAverageThreshold = ((int) sleepScoreConstants.getDurationAverageThreshold()) * DateTimeConstants.MILLIS_PER_HOUR;
        int durationPerfectThreshold = ((int) sleepScoreConstants.getDurationPerfectThreshold()) * DateTimeConstants.MILLIS_PER_HOUR;
        int durationGoodThreshold = (((int) sleepScoreConstants.getDurationGoodThreshold()) * DateTimeConstants.MILLIS_PER_HOUR) - durationAverageThreshold;
        int i15 = (durationPerfectThreshold - durationGoodThreshold) - durationAverageThreshold;
        int i16 = ((39600000 - i15) - durationGoodThreshold) - durationAverageThreshold;
        HorizontalScaleView.f fVar = new HorizontalScaleView.f("", durationAverageThreshold, androidx.core.content.a.getColor(sleepScoreDurationActivity, i11));
        HorizontalScaleView.f fVar2 = new HorizontalScaleView.f("", durationGoodThreshold, androidx.core.content.a.getColor(sleepScoreDurationActivity, i12));
        String string = sleepScoreDurationActivity.getString(C1987R.string.sleepScoreDetail_sweetSpot);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        String upperCase = string.toUpperCase(Locale.ROOT);
        kotlin.jvm.internal.u.i(upperCase, "toUpperCase(...)");
        horizontalScaleView.setScale(new HorizontalScaleView.e(0, kotlin.collections.x.W(fVar, fVar2, new HorizontalScaleView.f(upperCase, i15, androidx.core.content.a.getColor(sleepScoreDurationActivity, i13)), new HorizontalScaleView.f("", i16, androidx.core.content.a.getColor(sleepScoreDurationActivity, i14)))));
        horizontalScaleView.setDelegate(new androidx.camera.camera2.internal.n0(sleepScoreDurationActivity));
        horizontalScaleView.n();
        horizontalScaleView.a(1000L, sleepTrackData.getTotalSleep().getMillis());
    }

    private final String I3(long j5) {
        e.a aVar = new e.a(this, 0);
        aVar.a(true);
        aVar.w(true);
        aVar.t(true);
        aVar.v();
        return new pm.e(aVar).a(j5);
    }

    private static boolean J3(SleepTrackData sleepTrackData, SleepScore.Info info, SleepScoreConstants sleepScoreConstants) {
        if (info.getStatus() == SleepScoreHelperKt.getSleepScoreConstants().getStatusGood() && sleepTrackData.getTotalSleep().getMillis() < ((int) sleepScoreConstants.getDurationPerfectThreshold()) * DateTimeConstants.MILLIS_PER_HOUR) {
            return true;
        }
        return false;
    }

    @Override // com.withings.wiscale2.sleep.ui.sleepscore.Hilt_SleepScoreDurationActivity, com.withings.wiscale2.sleep.ui.sleepscore.BaseSleepDetailActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), null, null, new c(null), 3, null);
    }

    @Override // com.withings.wiscale2.sleep.ui.sleepscore.BaseSleepDetailActivity
    public final int z3() {
        return C1987R.layout.detail_view_sleep_duration;
    }
}
