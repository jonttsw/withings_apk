package com.withings.wiscale2.sleep.ui.sleepscore;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.view.MenuItem;
import android.widget.ProgressBar;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import com.withings.environment.ui.sleep.a;
import com.withings.graph.GraphView;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.core.models.User;
import com.withings.util.ui.CustomTextAppearanceSpan;
import com.withings.vasistas.model.Vasistas;
import com.withings.views.graphs.GraphPopupView;
import com.withings.views.widget.LineCellView;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.sleep.ui.SleepGraphLevelsLegendView;
import com.withings.wiscale2.track.data.SleepStat;
import com.withings.wiscale2.track.data.SleepStatsFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import k60.b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.joda.time.Duration;
import pm.e;
/* compiled from: SecondarySleepActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/withings/wiscale2/sleep/ui/sleepscore/SecondarySleepActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "a", com.huawei.hms.feature.dynamic.e.b.f28627a, "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SecondarySleepActivity extends Hilt_SecondarySleepActivity {
    @Inject

    /* renamed from: e  reason: collision with root package name */
    public wb0.j f60532e;
    @Inject

    /* renamed from: f  reason: collision with root package name */
    public l60.a f60533f;

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f60534g = nm0.h.b(new o());

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f60535h = nm0.h.b(new f());

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f60536i = nm0.h.b(new k());

    /* renamed from: j  reason: collision with root package name */
    private final nm0.g f60537j = nm0.h.b(new i());

    /* renamed from: k  reason: collision with root package name */
    private final nm0.g f60538k = nm0.h.b(new e());

    /* renamed from: l  reason: collision with root package name */
    private final nm0.g f60539l = nm0.h.b(new d());

    /* renamed from: m  reason: collision with root package name */
    private final nm0.g f60540m = nm0.h.b(new n());

    /* renamed from: n  reason: collision with root package name */
    private final nm0.g f60541n = nm0.h.b(new c());

    /* renamed from: o  reason: collision with root package name */
    private final nm0.g f60542o = nm0.h.b(new g());

    /* renamed from: p  reason: collision with root package name */
    private final l f60543p = new l(this);

    /* renamed from: q  reason: collision with root package name */
    private final m f60544q = new m(this);

    /* renamed from: r  reason: collision with root package name */
    private final nm0.g f60545r = nm0.h.b(new h());

    /* renamed from: s  reason: collision with root package name */
    private final pm.e f60546s;

    /* renamed from: t  reason: collision with root package name */
    private final aj0.a f60547t;

    /* renamed from: v  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f60531v = {androidx.camera.core.v.c(SecondarySleepActivity.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/core/models/User;", 0), androidx.camera.core.v.c(SecondarySleepActivity.class, "napTrackId", "getNapTrackId()J", 0)};

    /* renamed from: u  reason: collision with root package name */
    public static final a f60530u = new Object();

    /* compiled from: SecondarySleepActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        public static Intent a(Context context, User user, long j5) {
            kotlin.jvm.internal.u.j(user, "user");
            Intent putExtra = new Intent(context, SecondarySleepActivity.class).putExtra("EXTRA_USER", user).putExtra("EXTRA_TRACK_ID", j5).putExtra("EXTRA_IS_NAP", true);
            kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
            return putExtra;
        }

        public static Intent b(Context context, User user, long j5) {
            kotlin.jvm.internal.u.j(user, "user");
            Intent putExtra = new Intent(context, SecondarySleepActivity.class).putExtra("EXTRA_USER", user).putExtra("EXTRA_TRACK_ID", j5).putExtra("EXTRA_IS_NAP", false);
            kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
            return putExtra;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SecondarySleepActivity.kt */
    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final k60.b f60548a;

        /* renamed from: b  reason: collision with root package name */
        private final List<Vasistas> f60549b;

        public b(k60.b sleepTrack, ArrayList arrayList) {
            kotlin.jvm.internal.u.j(sleepTrack, "sleepTrack");
            this.f60548a = sleepTrack;
            this.f60549b = arrayList;
        }

        public final k60.b a() {
            return this.f60548a;
        }

        public final List<Vasistas> b() {
            return this.f60549b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (kotlin.jvm.internal.u.e(this.f60548a, bVar.f60548a) && kotlin.jvm.internal.u.e(this.f60549b, bVar.f60549b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f60549b.hashCode() + (this.f60548a.hashCode() * 31);
        }

        public final String toString() {
            return "NapData(sleepTrack=" + this.f60548a + ", vasistasList=" + this.f60549b + ")";
        }
    }

    /* compiled from: SecondarySleepActivity.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<LineCellView> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final LineCellView invoke() {
            return (LineCellView) SecondarySleepActivity.this.findViewById(C1987R.id.line_asleep_in);
        }
    }

    /* compiled from: SecondarySleepActivity.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<LineCellView> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final LineCellView invoke() {
            return (LineCellView) SecondarySleepActivity.this.findViewById(C1987R.id.line_duration);
        }
    }

    /* compiled from: SecondarySleepActivity.kt */
    /* loaded from: classes5.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.a<SleepGraphLevelsLegendView> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final SleepGraphLevelsLegendView invoke() {
            return (SleepGraphLevelsLegendView) SecondarySleepActivity.this.findViewById(C1987R.id.legend_view);
        }
    }

    /* compiled from: SecondarySleepActivity.kt */
    /* loaded from: classes5.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.a<GraphView> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final GraphView invoke() {
            return (GraphView) SecondarySleepActivity.this.findViewById(C1987R.id.graph);
        }
    }

    /* compiled from: SecondarySleepActivity.kt */
    /* loaded from: classes5.dex */
    static final class g extends kotlin.jvm.internal.w implements ym0.a<LineCellView> {
        g() {
            super(0);
        }

        @Override // ym0.a
        public final LineCellView invoke() {
            return (LineCellView) SecondarySleepActivity.this.findViewById(C1987R.id.line_hr);
        }
    }

    /* compiled from: SecondarySleepActivity.kt */
    /* loaded from: classes5.dex */
    static final class h extends kotlin.jvm.internal.w implements ym0.a<Boolean> {
        h() {
            super(0);
        }

        @Override // ym0.a
        public final Boolean invoke() {
            return Boolean.valueOf(SecondarySleepActivity.this.getIntent().getBooleanExtra("EXTRA_IS_NAP", false));
        }
    }

    /* compiled from: SecondarySleepActivity.kt */
    /* loaded from: classes5.dex */
    static final class i extends kotlin.jvm.internal.w implements ym0.a<ProgressBar> {
        i() {
            super(0);
        }

        @Override // ym0.a
        public final ProgressBar invoke() {
            return (ProgressBar) SecondarySleepActivity.this.findViewById(C1987R.id.graph_loading);
        }
    }

    /* compiled from: SecondarySleepActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SecondarySleepActivity$onCreate$1", f = "SecondarySleepActivity.kt", l = {92, 94}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class j extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f60557a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SecondarySleepActivity.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SecondarySleepActivity$onCreate$1$1", f = "SecondarySleepActivity.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super Flow<? extends k60.b>>, Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ SecondarySleepActivity f60559a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(SecondarySleepActivity secondarySleepActivity, qm0.d<? super a> dVar) {
                super(2, dVar);
                this.f60559a = secondarySleepActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                return new a(this.f60559a, dVar);
            }

            @Override // ym0.p
            public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super Flow<? extends k60.b>> dVar) {
                return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                nm0.l.b(obj);
                SecondarySleepActivity secondarySleepActivity = this.f60559a;
                l60.a aVar = secondarySleepActivity.f60533f;
                if (aVar != null) {
                    return ((cj0.i) aVar).b(null, new Long(SecondarySleepActivity.A3(secondarySleepActivity)));
                }
                kotlin.jvm.internal.u.s("sleepTrackRepository");
                throw null;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SecondarySleepActivity.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SecondarySleepActivity$onCreate$1$2", f = "SecondarySleepActivity.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes5.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<k60.b, qm0.d<? super nm0.y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            /* synthetic */ Object f60560a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ SecondarySleepActivity f60561b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(SecondarySleepActivity secondarySleepActivity, qm0.d<? super b> dVar) {
                super(2, dVar);
                this.f60561b = secondarySleepActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                b bVar = new b(this.f60561b, dVar);
                bVar.f60560a = obj;
                return bVar;
            }

            @Override // ym0.p
            public final Object invoke(k60.b bVar, qm0.d<? super nm0.y> dVar) {
                return ((b) create(bVar, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                nm0.l.b(obj);
                k60.b bVar = (k60.b) this.f60560a;
                SecondarySleepActivity secondarySleepActivity = this.f60561b;
                ActionBar supportActionBar = secondarySleepActivity.getSupportActionBar();
                if (supportActionBar != null) {
                    if (SecondarySleepActivity.B3(secondarySleepActivity)) {
                        supportActionBar.v(C1987R.string._NAP_);
                    } else {
                        wb0.j jVar = secondarySleepActivity.f60532e;
                        if (jVar != null) {
                            supportActionBar.w(jVar.a(bVar.o().b()));
                        } else {
                            kotlin.jvm.internal.u.s("getDeviceNameWhenPotentialPartner");
                            throw null;
                        }
                    }
                    supportActionBar.o(true);
                }
                a aVar = SecondarySleepActivity.f60530u;
                BuildersKt__Builders_commonKt.launch$default(m0.t.l(secondarySleepActivity), null, null, new r(secondarySleepActivity, bVar, null), 3, null);
                return nm0.y.f85009a;
            }
        }

        j(qm0.d<? super j> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new j(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((j) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f60557a;
            SecondarySleepActivity secondarySleepActivity = SecondarySleepActivity.this;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        nm0.l.b(obj);
                        return nm0.y.f85009a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(secondarySleepActivity, null);
                this.f60557a = 1;
                obj = BuildersKt.withContext(io2, aVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            Flow filterNotNull = FlowKt.filterNotNull((Flow) obj);
            b bVar = new b(secondarySleepActivity, null);
            this.f60557a = 2;
            if (FlowKt.collectLatest(filterNotNull, bVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: SecondarySleepActivity.kt */
    /* loaded from: classes5.dex */
    static final class k extends kotlin.jvm.internal.w implements ym0.a<GraphPopupView> {
        k() {
            super(0);
        }

        @Override // ym0.a
        public final GraphPopupView invoke() {
            return (GraphPopupView) SecondarySleepActivity.this.findViewById(C1987R.id.view_popup);
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class l implements bn0.d<Activity, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f60563a = nm0.h.b(new s(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f60564b;

        public l(Activity activity) {
            this.f60564b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.core.models.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f60563a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class m implements bn0.d<Activity, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f60565a = nm0.h.b(new t(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f60566b;

        public m(Activity activity) {
            this.f60566b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f60565a.getValue();
        }
    }

    /* compiled from: SecondarySleepActivity.kt */
    /* loaded from: classes5.dex */
    static final class n extends kotlin.jvm.internal.w implements ym0.a<LineCellView> {
        n() {
            super(0);
        }

        @Override // ym0.a
        public final LineCellView invoke() {
            return (LineCellView) SecondarySleepActivity.this.findViewById(C1987R.id.line_in_bed);
        }
    }

    /* compiled from: SecondarySleepActivity.kt */
    /* loaded from: classes5.dex */
    static final class o extends kotlin.jvm.internal.w implements ym0.a<Toolbar> {
        o() {
            super(0);
        }

        @Override // ym0.a
        public final Toolbar invoke() {
            return (Toolbar) SecondarySleepActivity.this.findViewById(C1987R.id.toolbar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, aj0.a] */
    public SecondarySleepActivity() {
        e.a aVar = new e.a(this, 0);
        aVar.v();
        this.f60546s = new pm.e(aVar);
        this.f60547t = new Object();
    }

    public static final long A3(SecondarySleepActivity secondarySleepActivity) {
        return ((Number) secondarySleepActivity.f60544q.getValue(secondarySleepActivity, f60531v[1])).longValue();
    }

    public static final boolean B3(SecondarySleepActivity secondarySleepActivity) {
        return ((Boolean) secondarySleepActivity.f60545r.getValue()).booleanValue();
    }

    public static final void C3(SecondarySleepActivity secondarySleepActivity, b bVar) {
        long j5;
        boolean z5;
        boolean z11;
        boolean z12;
        Integer num;
        Object obj;
        secondarySleepActivity.getClass();
        k60.b a11 = bVar.a();
        nm0.g gVar = secondarySleepActivity.f60535h;
        Object value = gVar.getValue();
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        ((GraphView) value).setZoomEnabled(false);
        Object value2 = gVar.getValue();
        kotlin.jvm.internal.u.i(value2, "getValue(...)");
        a.b bVar2 = new a.b((GraphView) value2, bVar.b());
        Object value3 = gVar.getValue();
        kotlin.jvm.internal.u.i(value3, "getValue(...)");
        bVar2.C(((GraphView) value3).getContext().getResources().getDimension(C1987R.dimen.keyline_1));
        bVar2.D();
        Duration g11 = bVar.a().p().g();
        if (g11 != null) {
            j5 = g11.getMillis();
        } else {
            j5 = 0;
        }
        if (j5 > 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        bVar2.A(z5);
        Object value4 = secondarySleepActivity.f60536i.getValue();
        kotlin.jvm.internal.u.i(value4, "getValue(...)");
        bVar2.z((GraphPopupView) value4);
        bVar2.I(k60.h.a(bVar.a()).getMillis());
        bVar2.u().x(k60.h.g(bVar.a()), k60.h.e(bVar.a()));
        Object value5 = secondarySleepActivity.f60537j.getValue();
        kotlin.jvm.internal.u.i(value5, "getValue(...)");
        ((ProgressBar) value5).setVisibility(8);
        nm0.g gVar2 = secondarySleepActivity.f60538k;
        Object value6 = gVar2.getValue();
        kotlin.jvm.internal.u.i(value6, "getValue(...)");
        SleepGraphLevelsLegendView sleepGraphLevelsLegendView = (SleepGraphLevelsLegendView) value6;
        if (ah.m.z(a11.p().g()) > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        sleepGraphLevelsLegendView.setREMVisible(z11);
        Object value7 = gVar2.getValue();
        kotlin.jvm.internal.u.i(value7, "getValue(...)");
        SleepGraphLevelsLegendView sleepGraphLevelsLegendView2 = (SleepGraphLevelsLegendView) value7;
        if (ah.m.z(a11.p().i()) > 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        sleepGraphLevelsLegendView2.setUnspecifiedVisible(z12);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CustomTextAppearanceSpan customTextAppearanceSpan = new CustomTextAppearanceSpan(secondarySleepActivity, C1987R.style.data3);
        int length = spannableStringBuilder.length();
        long millis = k60.c.c(a11.p()).getMillis();
        pm.e eVar = secondarySleepActivity.f60546s;
        spannableStringBuilder.append((CharSequence) eVar.a(millis));
        spannableStringBuilder.setSpan(customTextAppearanceSpan, length, spannableStringBuilder.length(), 17);
        SpannedString spannedString = new SpannedString(spannableStringBuilder);
        Object value8 = secondarySleepActivity.f60539l.getValue();
        kotlin.jvm.internal.u.i(value8, "getValue(...)");
        ((LineCellView) value8).setValue(spannedString);
        Object value9 = secondarySleepActivity.f60540m.getValue();
        kotlin.jvm.internal.u.i(value9, "getValue(...)");
        b.C1164b p11 = a11.p();
        kotlin.jvm.internal.u.j(p11, "<this>");
        Duration plus = k60.c.c(p11).plus(p11.j());
        kotlin.jvm.internal.u.i(plus, "plus(...)");
        ((LineCellView) value9).setValue(eVar.a(plus.getMillis()));
        int c11 = bVar.a().o().c();
        nm0.g gVar3 = secondarySleepActivity.f60541n;
        if (c11 == 16) {
            Object value10 = gVar3.getValue();
            kotlin.jvm.internal.u.i(value10, "getValue(...)");
            ((LineCellView) value10).setVisibility(8);
        } else {
            Duration c12 = a11.p().c();
            if (c12 != null) {
                Object value11 = gVar3.getValue();
                kotlin.jvm.internal.u.i(value11, "getValue(...)");
                ((LineCellView) value11).setValue(eVar.a(c12.getMillis()));
            }
        }
        Context context = secondarySleepActivity.D3().getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        SleepStatsFactory sleepStatsFactory = new SleepStatsFactory(context, (User) secondarySleepActivity.f60543p.getValue(secondarySleepActivity, f60531v[0]));
        k60.b a12 = bVar.a();
        secondarySleepActivity.f60547t.getClass();
        Iterator<T> it = sleepStatsFactory.generateSleepStats(aj0.a.a(a12)).iterator();
        while (true) {
            num = null;
            if (it.hasNext()) {
                obj = it.next();
                if (((SleepStat) obj).getId() == 7) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (obj != null) {
            secondarySleepActivity.D3().setVisibility(0);
            LineCellView D3 = secondarySleepActivity.D3();
            Object[] objArr = new Object[2];
            b.c q11 = a11.q();
            if (q11 != null) {
                num = Integer.valueOf((int) q11.a());
            }
            objArr[0] = num;
            objArr[1] = secondarySleepActivity.getString(C1987R.string._BPM_);
            D3.setValue(String.format("%d %s", Arrays.copyOf(objArr, 2)));
            if (((Boolean) secondarySleepActivity.f60545r.getValue()).booleanValue()) {
                secondarySleepActivity.D3().setLabel(secondarySleepActivity.getString(C1987R.string.sleepScoreNap_napHr));
                return;
            } else {
                secondarySleepActivity.D3().setLabel(secondarySleepActivity.getString(C1987R.string.sleepScore_nightHR));
                return;
            }
        }
        secondarySleepActivity.D3().setVisibility(8);
    }

    private final LineCellView D3() {
        Object value = this.f60542o.getValue();
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        return (LineCellView) value;
    }

    public static final b z3(SecondarySleepActivity secondarySleepActivity, k60.b bVar) {
        secondarySleepActivity.getClass();
        Vasistas.Category fromDeviceType = Vasistas.Category.Companion.fromDeviceType(bVar.o().c());
        List<Vasistas> o11 = lj0.h0.e().o(((User) secondarySleepActivity.f60543p.getValue(secondarySleepActivity, f60531v[0])).getId(), fromDeviceType, k60.h.g(bVar), k60.h.e(bVar));
        kotlin.jvm.internal.u.g(o11);
        return new b(bVar, ei0.y.a(o11));
    }

    @Override // com.withings.wiscale2.sleep.ui.sleepscore.Hilt_SecondarySleepActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1987R.layout.activity_nap_details);
        Object value = this.f60534g.getValue();
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        setSupportActionBar((Toolbar) value);
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), null, null, new j(null), 3, null);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.u.j(item, "item");
        if (item.getItemId() == 16908332) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
