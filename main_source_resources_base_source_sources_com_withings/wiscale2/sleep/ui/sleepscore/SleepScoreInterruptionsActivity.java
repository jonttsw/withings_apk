package com.withings.wiscale2.sleep.ui.sleepscore;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.withings.environment.ui.sleep.a;
import com.withings.graph.GraphView;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.sleep.SleepScoreGenericConstants;
import com.withings.user.User;
import com.withings.util.log.Fail;
import com.withings.vasistas.model.SleepLevel;
import com.withings.vasistas.model.Vasistas;
import com.withings.views.graphs.GraphPopupView;
import com.withings.views.widget.LineCellView;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.sleep.libc.SleepScoreRecalculator;
import com.withings.wiscale2.track.data.SleepScore;
import com.withings.wiscale2.track.data.SleepScoreColorHelper;
import com.withings.wiscale2.track.data.SleepScoreHelper;
import com.withings.wiscale2.track.data.SleepScoreHelperKt;
import com.withings.wiscale2.track.data.SleepTrackData;
import com.withings.wiscale2.track.data.Track;
import com.withings.wiscale2.track.data.TrackKt;
import java.util.ArrayList;
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
import org.joda.time.Duration;
import pm.e;
/* compiled from: SleepScoreInterruptionsActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/sleep/ui/sleepscore/SleepScoreInterruptionsActivity;", "Lcom/withings/wiscale2/sleep/ui/sleepscore/BaseSleepDetailActivity;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SleepScoreInterruptionsActivity extends Hilt_SleepScoreInterruptionsActivity {
    @Inject

    /* renamed from: g  reason: collision with root package name */
    public ei0.q f60667g;

    /* renamed from: q  reason: collision with root package name */
    private String f60677q;

    /* renamed from: r  reason: collision with root package name */
    private Duration f60678r;

    /* renamed from: u  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f60662u = {androidx.camera.core.v.c(SleepScoreInterruptionsActivity.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0), androidx.camera.core.v.c(SleepScoreInterruptionsActivity.class, "sleepTrackId", "getSleepTrackId()J", 0)};

    /* renamed from: t  reason: collision with root package name */
    public static final a f60661t = new Object();

    /* renamed from: v  reason: collision with root package name */
    private static final int f60663v = C1987R.color.datavizMonochromaticGhost1;

    /* renamed from: w  reason: collision with root package name */
    private static final int f60664w = C1987R.color.datavizMonochromaticGhost3;

    /* renamed from: x  reason: collision with root package name */
    private static final int f60665x = C1987R.color.datavizMonochromaticGhost5;

    /* renamed from: y  reason: collision with root package name */
    private static final int f60666y = C1987R.color.datavizMonochromaticGhost3;

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f60668h = nm0.h.b(new k());

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f60669i = nm0.h.b(new b());

    /* renamed from: j  reason: collision with root package name */
    private final nm0.g f60670j = nm0.h.b(new f());

    /* renamed from: k  reason: collision with root package name */
    private final nm0.g f60671k = nm0.h.b(new d());

    /* renamed from: l  reason: collision with root package name */
    private final nm0.g f60672l = nm0.h.b(new c());

    /* renamed from: m  reason: collision with root package name */
    private final nm0.g f60673m = nm0.h.b(new l());

    /* renamed from: n  reason: collision with root package name */
    private final i f60674n = new i(this);

    /* renamed from: o  reason: collision with root package name */
    private final j f60675o = new j(this);

    /* renamed from: p  reason: collision with root package name */
    private final nm0.g f60676p = nm0.h.b(new g());

    /* renamed from: s  reason: collision with root package name */
    private final nm0.g f60679s = nm0.h.b(new h());

    /* compiled from: SleepScoreInterruptionsActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    /* compiled from: SleepScoreInterruptionsActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<GraphView> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final GraphView invoke() {
            return (GraphView) SleepScoreInterruptionsActivity.this.findViewById(C1987R.id.graph_view);
        }
    }

    /* compiled from: SleepScoreInterruptionsActivity.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<ImageView> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final ImageView invoke() {
            return (ImageView) SleepScoreInterruptionsActivity.this.findViewById(C1987R.id.awake_legend_icon);
        }
    }

    /* compiled from: SleepScoreInterruptionsActivity.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<ProgressBar> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final ProgressBar invoke() {
            return (ProgressBar) SleepScoreInterruptionsActivity.this.findViewById(C1987R.id.loading);
        }
    }

    /* compiled from: SleepScoreInterruptionsActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SleepScoreInterruptionsActivity$onCreate$1", f = "SleepScoreInterruptionsActivity.kt", l = {90}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class e extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f60683a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SleepScoreInterruptionsActivity.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SleepScoreInterruptionsActivity$onCreate$1$sleepTrack$1", f = "SleepScoreInterruptionsActivity.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super Track>, Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ SleepScoreInterruptionsActivity f60685a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(SleepScoreInterruptionsActivity sleepScoreInterruptionsActivity, qm0.d<? super a> dVar) {
                super(2, dVar);
                this.f60685a = sleepScoreInterruptionsActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                return new a(this.f60685a, dVar);
            }

            @Override // ym0.p
            public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super Track> dVar) {
                return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                nm0.l.b(obj);
                SleepScoreInterruptionsActivity sleepScoreInterruptionsActivity = this.f60685a;
                ei0.q qVar = sleepScoreInterruptionsActivity.f60667g;
                if (qVar != null) {
                    return qVar.o(SleepScoreInterruptionsActivity.F3(sleepScoreInterruptionsActivity));
                }
                kotlin.jvm.internal.u.s("sleepTrackManager");
                throw null;
            }
        }

        e(qm0.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new e(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((e) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object withContext;
            SleepScore.Info info;
            String string;
            int i11;
            String string2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i12 = this.f60683a;
            SleepScoreInterruptionsActivity context = SleepScoreInterruptionsActivity.this;
            if (i12 != 0) {
                if (i12 == 1) {
                    nm0.l.b(obj);
                    withContext = obj;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(context, null);
                this.f60683a = 1;
                withContext = BuildersKt.withContext(io2, aVar, this);
                if (withContext == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            Track track = (Track) withContext;
            Parcelable data = track.getData();
            kotlin.jvm.internal.u.h(data, "null cannot be cast to non-null type com.withings.wiscale2.track.data.SleepTrackData");
            SleepTrackData sleepTrackData = (SleepTrackData) data;
            SleepScore sleepScore = track.getSleepScore();
            if (sleepScore != null) {
                info = sleepScore.getSleepInterruptions();
            } else {
                info = null;
            }
            SleepScoreGenericConstants sleepScoreGenerics = SleepScoreHelperKt.getSleepScoreConstants();
            kotlin.jvm.internal.u.j(context, "context");
            kotlin.jvm.internal.u.j(sleepScoreGenerics, "sleepScoreGenerics");
            q4 q4Var = new q4(context, sleepScoreGenerics);
            Parcelable data2 = track.getData();
            kotlin.jvm.internal.u.h(data2, "null cannot be cast to non-null type com.withings.wiscale2.track.data.SleepTrackData");
            SleepTrackData sleepTrackData2 = (SleepTrackData) data2;
            Duration minus = new Duration(TrackKt.getEffectiveDurationMillis(track)).minus(sleepTrackData2.getTotalSleep()).minus(sleepTrackData2.getDurationToGetUp()).minus(sleepTrackData2.getDurationToSleep());
            String a11 = q4Var.a(minus.getMillis());
            Integer wakeUpCount = sleepTrackData2.getWakeUpCount();
            String valueOf = String.valueOf(minus.getStandardMinutes());
            String a12 = q4Var.a(sleepTrackData2.getTotalSleep().getMillis());
            SparseArray sparseArray = new SparseArray();
            int statusPerfect = q4Var.b().getStatusPerfect();
            String string3 = q4Var.c().getString(C1987R.string.sleepScoreDetail_sleepInterruptionsIfGoodPart1NoInterruptionAlt1);
            kotlin.jvm.internal.u.i(string3, "getString(...)");
            String string4 = q4Var.c().getString(C1987R.string.sleepScoreDetail_sleepInterruptionsIfGoodPart1NoInterruptionAlt2_formatted, a12);
            kotlin.jvm.internal.u.i(string4, "getString(...)");
            String string5 = q4Var.c().getString(C1987R.string.sleepScoreDetail_sleepInterruptionsIfGoodPart1NoInterruptionAlt3);
            kotlin.jvm.internal.u.i(string5, "getString(...)");
            sparseArray.put(statusPerfect, kotlin.collections.x.W(string3, string4, string5));
            int statusGood = q4Var.b().getStatusGood();
            long millis = minus.getMillis();
            ArrayList arrayList = new ArrayList();
            int i13 = (millis > 0L ? 1 : (millis == 0L ? 0 : -1));
            if (i13 > 0) {
                string = q4Var.c().getString(C1987R.string.sleepScoreDetail_sleepInterruptionsIfGoodPart1Alt1);
            } else {
                string = q4Var.c().getString(C1987R.string.sleepScoreDetail_sleepInterruptionsIfGoodPart1NoInterruptionAlt2_formatted, a12);
            }
            kotlin.jvm.internal.u.g(string);
            arrayList.add(string);
            String string6 = q4Var.c().getString(C1987R.string.sleepScoreDetail_sleepInterruptionsIfGoodPart1Alt3);
            kotlin.jvm.internal.u.i(string6, "getString(...)");
            arrayList.add(string6);
            if (i13 > 0) {
                String string7 = q4Var.c().getString(C1987R.string.sleepScoreDetail_sleepInterruptionsIfGoodPart1Alt2_formatted, a11);
                kotlin.jvm.internal.u.i(string7, "getString(...)");
                arrayList.add(string7);
            }
            sparseArray.put(statusGood, arrayList);
            int statusAverage = q4Var.b().getStatusAverage();
            kotlin.jvm.internal.u.g(wakeUpCount);
            int intValue = wakeUpCount.intValue();
            ArrayList arrayList2 = new ArrayList();
            String string8 = q4Var.c().getString(C1987R.string.sleepScoreDetail_sleepInterruptionsIfAveragePart1Alt1_formatted, valueOf);
            kotlin.jvm.internal.u.i(string8, "getString(...)");
            arrayList2.add(string8);
            if (intValue == 1) {
                String string9 = q4Var.c().getString(C1987R.string.sleepScoreDetail_sleepInterruptionsIfAveragePart1OneTimeAlt2);
                kotlin.jvm.internal.u.i(string9, "getString(...)");
                arrayList2.add(string9);
                String string10 = q4Var.c().getString(C1987R.string.sleepScoreDetail_sleepInterruptionsIfAveragePart1OneTimeAlt3);
                kotlin.jvm.internal.u.i(string10, "getString(...)");
                arrayList2.add(string10);
            } else {
                String string11 = q4Var.c().getString(C1987R.string.sleepScoreDetail_sleepInterruptionsIfAveragePart1Alt2_formatted, String.valueOf(intValue));
                kotlin.jvm.internal.u.i(string11, "getString(...)");
                arrayList2.add(string11);
                String string12 = q4Var.c().getString(C1987R.string.sleepScoreDetail_sleepInterruptionsIfAveragePart1Alt3_formatted, String.valueOf(intValue));
                kotlin.jvm.internal.u.i(string12, "getString(...)");
                arrayList2.add(string12);
            }
            sparseArray.put(statusAverage, arrayList2);
            int statusBad = q4Var.b().getStatusBad();
            int intValue2 = wakeUpCount.intValue();
            CharSequence[] charSequenceArr = new CharSequence[3];
            String string13 = q4Var.c().getString(C1987R.string.sleepScoreDetail_sleepInterruptionsIfBadPart1Alt1_formatted, a11);
            kotlin.jvm.internal.u.i(string13, "getString(...)");
            charSequenceArr[0] = string13;
            Context c11 = q4Var.c();
            if (intValue2 == 1) {
                i11 = C1987R.string.sleepScoreDetail_sleepInterruptionsIfBadPart1OneTimeAlt2;
            } else {
                i11 = C1987R.string.sleepScoreDetail_sleepInterruptionsIfBadPart1Alt2_formatted;
            }
            String string14 = c11.getString(i11, String.valueOf(intValue2));
            kotlin.jvm.internal.u.i(string14, "getString(...)");
            charSequenceArr[1] = string14;
            String string15 = q4Var.c().getString(C1987R.string.sleepScoreDetail_sleepInterruptionsIfBadPart1Alt3);
            kotlin.jvm.internal.u.i(string15, "getString(...)");
            charSequenceArr[2] = string15;
            sparseArray.put(statusBad, kotlin.collections.x.W(charSequenceArr));
            if (info == null) {
                context.finish();
                return nm0.y.f85009a;
            }
            Duration minus2 = new Duration(TrackKt.getEffectiveDurationMillis(track)).minus(sleepTrackData.getTotalSleep()).minus(sleepTrackData.getDurationToGetUp()).minus(sleepTrackData.getDurationToSleep());
            kotlin.jvm.internal.u.i(minus2, "minus(...)");
            context.f60678r = minus2;
            Duration duration = context.f60678r;
            if (duration != null) {
                long millis2 = duration.getMillis();
                e.a aVar2 = new e.a(context, 0);
                aVar2.a(true);
                aVar2.w(true);
                aVar2.t(true);
                aVar2.v();
                context.f60677q = new pm.e(aVar2).a(millis2);
                Integer wakeUpCount2 = sleepTrackData.getWakeUpCount();
                String string16 = context.getString(C1987R.string.sleepScore_interruptions);
                kotlin.jvm.internal.u.i(string16, "getString(...)");
                if (wakeUpCount2 != null && wakeUpCount2.intValue() == 0) {
                    string2 = context.getString(C1987R.string.sleepScore_interruptionsNone_Female);
                } else if (wakeUpCount2 != null && wakeUpCount2.intValue() == 1) {
                    string2 = context.getString(C1987R.string.D_TIME, wakeUpCount2);
                } else {
                    string2 = context.getString(C1987R.string.D_TIMES, wakeUpCount2);
                }
                kotlin.jvm.internal.u.g(string2);
                context.B3(string16, string2);
                int sleepScoreGlyph = SleepScoreHelper.INSTANCE.getSleepScoreGlyph(info);
                SleepScoreColorHelper sleepScoreColorHelper = SleepScoreColorHelper.INSTANCE;
                context.C3(sleepScoreGlyph, SleepScoreColorHelper.getStatusTextGlyphColor$default(sleepScoreColorHelper, info, false, 2, null), sleepScoreColorHelper.getSleepInfoColorRes(info));
                SleepScoreInterruptionsActivity.I3(context, track, info);
                SleepScoreInterruptionsActivity.K3(context, info, sleepTrackData, sparseArray);
                SleepScoreInterruptionsActivity.N3(context);
                return nm0.y.f85009a;
            }
            kotlin.jvm.internal.u.s("totalAwakeTime");
            throw null;
        }
    }

    /* compiled from: SleepScoreInterruptionsActivity.kt */
    /* loaded from: classes5.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.a<GraphPopupView> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final GraphPopupView invoke() {
            return (GraphPopupView) SleepScoreInterruptionsActivity.this.findViewById(C1987R.id.view_popup_sleep);
        }
    }

    /* compiled from: SleepScoreInterruptionsActivity.kt */
    /* loaded from: classes5.dex */
    static final class g extends kotlin.jvm.internal.w implements ym0.a<Random> {
        g() {
            super(0);
        }

        @Override // ym0.a
        public final Random invoke() {
            return new Random(SleepScoreInterruptionsActivity.F3(SleepScoreInterruptionsActivity.this));
        }
    }

    /* compiled from: SleepScoreInterruptionsActivity.kt */
    /* loaded from: classes5.dex */
    static final class h extends kotlin.jvm.internal.w implements ym0.a<SleepScoreRecalculator> {
        h() {
            super(0);
        }

        @Override // ym0.a
        public final SleepScoreRecalculator invoke() {
            return SleepScoreRecalculator.Companion.get$default(SleepScoreRecalculator.Companion, SleepScoreInterruptionsActivity.H3(SleepScoreInterruptionsActivity.this).q(), null, 2, null);
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class i implements bn0.d<Activity, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f60689a = nm0.h.b(new b3(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f60690b;

        public i(Activity activity) {
            this.f60690b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f60689a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class j implements bn0.d<Activity, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f60691a = nm0.h.b(new c3(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f60692b;

        public j(Activity activity) {
            this.f60692b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f60691a.getValue();
        }
    }

    /* compiled from: SleepScoreInterruptionsActivity.kt */
    /* loaded from: classes5.dex */
    static final class k extends kotlin.jvm.internal.w implements ym0.a<TextView> {
        k() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) SleepScoreInterruptionsActivity.this.findViewById(C1987R.id.top_text);
        }
    }

    /* compiled from: SleepScoreInterruptionsActivity.kt */
    /* loaded from: classes5.dex */
    static final class l extends kotlin.jvm.internal.w implements ym0.a<LineCellView> {
        l() {
            super(0);
        }

        @Override // ym0.a
        public final LineCellView invoke() {
            return (LineCellView) SleepScoreInterruptionsActivity.this.findViewById(C1987R.id.total_time_awake);
        }
    }

    public static final ProgressBar D3(SleepScoreInterruptionsActivity sleepScoreInterruptionsActivity) {
        return (ProgressBar) sleepScoreInterruptionsActivity.f60671k.getValue();
    }

    public static final SleepScoreRecalculator E3(SleepScoreInterruptionsActivity sleepScoreInterruptionsActivity) {
        return (SleepScoreRecalculator) sleepScoreInterruptionsActivity.f60679s.getValue();
    }

    public static final long F3(SleepScoreInterruptionsActivity sleepScoreInterruptionsActivity) {
        return ((Number) sleepScoreInterruptionsActivity.f60675o.getValue(sleepScoreInterruptionsActivity, f60662u[1])).longValue();
    }

    public static final User H3(SleepScoreInterruptionsActivity sleepScoreInterruptionsActivity) {
        return (User) sleepScoreInterruptionsActivity.f60674n.getValue(sleepScoreInterruptionsActivity, f60662u[0]);
    }

    public static final void I3(SleepScoreInterruptionsActivity sleepScoreInterruptionsActivity, Track track, SleepScore.Info info) {
        ((GraphView) sleepScoreInterruptionsActivity.f60669i.getValue()).setZoomEnabled(false);
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(sleepScoreInterruptionsActivity), null, null, new a3(sleepScoreInterruptionsActivity, info, track, null), 3, null);
    }

    public static final void K3(SleepScoreInterruptionsActivity sleepScoreInterruptionsActivity, SleepScore.Info info, SleepTrackData sleepTrackData, SparseArray sparseArray) {
        List list;
        int statusGood;
        sleepScoreInterruptionsActivity.getClass();
        int status = info.getStatus();
        if (status == SleepScoreHelperKt.getSleepScoreConstants().getStatusAverage()) {
            Object obj = sparseArray.get(SleepScoreHelperKt.getSleepScoreConstants().getStatusAverage());
            kotlin.jvm.internal.u.i(obj, "get(...)");
            list = (List) obj;
        } else if (status == SleepScoreHelperKt.getSleepScoreConstants().getStatusBad()) {
            Object obj2 = sparseArray.get(SleepScoreHelperKt.getSleepScoreConstants().getStatusBad());
            kotlin.jvm.internal.u.i(obj2, "get(...)");
            list = (List) obj2;
        } else if (status == SleepScoreHelperKt.getSleepScoreConstants().getStatusGood()) {
            Integer wakeUpCount = sleepTrackData.getWakeUpCount();
            if (wakeUpCount != null && wakeUpCount.intValue() == 0) {
                statusGood = SleepScoreHelperKt.getSleepScoreConstants().getStatusPerfect();
            } else {
                statusGood = SleepScoreHelperKt.getSleepScoreConstants().getStatusGood();
            }
            Object obj3 = sparseArray.get(statusGood);
            kotlin.jvm.internal.u.g(obj3);
            list = (List) obj3;
        } else {
            Fail.j("Invalid status for interruptions");
            Object obj4 = sparseArray.get(SleepScoreHelperKt.getSleepScoreConstants().getStatusGood());
            kotlin.jvm.internal.u.g(obj4);
            list = (List) obj4;
        }
        ((TextView) sleepScoreInterruptionsActivity.f60668h.getValue()).setText((CharSequence) list.get(((Random) sleepScoreInterruptionsActivity.f60676p.getValue()).nextInt(kotlin.collections.x.M(list))));
    }

    public static final void M3(SleepScoreInterruptionsActivity sleepScoreInterruptionsActivity, di0.a aVar, SleepScore.Info info) {
        Parcelable parcelable;
        ((GraphView) sleepScoreInterruptionsActivity.f60669i.getValue()).setOnScrubbingListener(new z2(sleepScoreInterruptionsActivity));
        Track d11 = aVar.d();
        boolean z5 = false;
        if (d11 != null && d11.getDeviceType() == 32) {
            z5 = true;
        }
        SleepScoreColorHelper sleepScoreColorHelper = SleepScoreColorHelper.INSTANCE;
        ((ImageView) sleepScoreInterruptionsActivity.f60672l.getValue()).setImageDrawable(y70.a.a(C1987R.drawable.rectangle_radius_3dp_white, sleepScoreInterruptionsActivity, sleepScoreColorHelper.getSleepInfoColorRes(info)));
        Vasistas vasistas = (Vasistas) kotlin.collections.x.I(aVar.a());
        Vasistas vasistas2 = (Vasistas) kotlin.collections.x.T(aVar.a());
        int sleepLevel = vasistas.getSleepLevel();
        SleepLevel sleepLevel2 = SleepLevel.Awake;
        if (sleepLevel == sleepLevel2.getVasistasType()) {
            aVar.f(kotlin.collections.x.Q0(kotlin.collections.x.g0(kotlin.collections.x.S0(aVar.a()), vasistas)));
        }
        if (vasistas2.getSleepLevel() == sleepLevel2.getVasistasType()) {
            aVar.f(kotlin.collections.x.Q0(kotlin.collections.x.g0(kotlin.collections.x.S0(aVar.a()), vasistas2)));
        }
        nm0.g gVar = sleepScoreInterruptionsActivity.f60669i;
        a.b bVar = new a.b((GraphView) gVar.getValue(), aVar.a());
        bVar.D();
        bVar.F();
        bVar.y();
        bVar.v();
        bVar.C(((GraphView) gVar.getValue()).getContext().getResources().getDimension(C1987R.dimen.keyline_1));
        bVar.B();
        Track d12 = aVar.d();
        if (d12 != null) {
            parcelable = d12.getData();
        } else {
            parcelable = null;
        }
        kotlin.jvm.internal.u.h(parcelable, "null cannot be cast to non-null type com.withings.wiscale2.track.data.SleepTrackData");
        bVar.I(((SleepTrackData) parcelable).getTotalSleep().getMillis());
        bVar.A(z5);
        bVar.z((GraphPopupView) sleepScoreInterruptionsActivity.f60670j.getValue());
        bVar.E();
        bVar.G(sleepScoreColorHelper.getSleepInfoColorRes(info), f60663v, f60664w, f60665x, f60666y);
        bVar.w();
        bVar.x();
        bVar.u().x(TrackKt.getEffectiveStartDate(aVar.d()), TrackKt.getEffectiveEndDate(aVar.d()));
    }

    public static final void N3(SleepScoreInterruptionsActivity sleepScoreInterruptionsActivity) {
        LineCellView lineCellView = (LineCellView) sleepScoreInterruptionsActivity.f60673m.getValue();
        String str = sleepScoreInterruptionsActivity.f60677q;
        if (str != null) {
            lineCellView.setValue(str);
        } else {
            kotlin.jvm.internal.u.s("formattedTotalAwakeTime");
            throw null;
        }
    }

    @Override // com.withings.wiscale2.sleep.ui.sleepscore.Hilt_SleepScoreInterruptionsActivity, com.withings.wiscale2.sleep.ui.sleepscore.BaseSleepDetailActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), null, null, new e(null), 3, null);
    }

    @Override // com.withings.wiscale2.sleep.ui.sleepscore.BaseSleepDetailActivity
    public final int z3() {
        return C1987R.layout.detail_view_sleep_interruptions;
    }
}
