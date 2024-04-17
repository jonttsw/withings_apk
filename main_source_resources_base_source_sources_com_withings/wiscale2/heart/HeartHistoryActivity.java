package com.withings.wiscale2.heart;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.app.ActionBar;
import androidx.camera.core.v;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.v0;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k0;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.withings.graph.GraphPeriod;
import com.withings.graph.TimeGraphView;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.measure.MeasuresGroup;
import com.withings.periodsbar.Period;
import com.withings.user.User;
import com.withings.views.graphs.GraphPopupView;
import com.withings.views.view.CustomNestedScrollView;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.heart.bloodpressure.BloodPressureMeasureListActivity;
import com.withings.wiscale2.heart.bloodpressure.d0;
import com.withings.wiscale2.measure.accountmeasure.ui.add.AddMeasureActivity;
import com.withings.wiscale2.measure.list.MeasureListActivity;
import java.io.Serializable;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import k1.r0;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import nm0.y;
import og0.w;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.Weeks;
/* compiled from: HeartHistoryActivity.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0005\t\n\u000b\f\rB\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/withings/wiscale2/heart/HeartHistoryActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lcom/withings/wiscale2/heart/p;", "Lcom/withings/wiscale2/heart/t;", "Lcom/withings/views/view/CustomNestedScrollView$b;", "Lcom/withings/wiscale2/heart/bloodpressure/d0$b;", "Log0/w$a;", "<init>", "()V", "a", com.huawei.hms.feature.dynamic.e.b.f28627a, "c", "d", com.huawei.hms.feature.dynamic.e.e.f28630a, "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class HeartHistoryActivity extends Hilt_HeartHistoryActivity implements p, t, CustomNestedScrollView.b, d0.b, w.a {

    /* renamed from: e  reason: collision with root package name */
    private final by.kirich1409.viewbindingdelegate.f f57025e;

    /* renamed from: f  reason: collision with root package name */
    private MenuItem f57026f;

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f57027g;
    @Inject

    /* renamed from: h  reason: collision with root package name */
    public fy.o f57028h;

    /* renamed from: i  reason: collision with root package name */
    private final l f57029i;

    /* renamed from: j  reason: collision with root package name */
    private final m f57030j;

    /* renamed from: k  reason: collision with root package name */
    private final nm0.g f57031k;

    /* renamed from: l  reason: collision with root package name */
    private final nm0.g f57032l;

    /* renamed from: m  reason: collision with root package name */
    private final nm0.g f57033m;

    /* renamed from: n  reason: collision with root package name */
    private final nm0.g f57034n;

    /* renamed from: o  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f57035o;

    /* renamed from: p  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f57036p;

    /* renamed from: q  reason: collision with root package name */
    public k0 f57037q;

    /* renamed from: r  reason: collision with root package name */
    private b f57038r;

    /* renamed from: s  reason: collision with root package name */
    private List<? extends MeasuresGroup> f57039s;

    /* renamed from: t  reason: collision with root package name */
    private DateTime f57040t;

    /* renamed from: u  reason: collision with root package name */
    private int f57041u;

    /* renamed from: v  reason: collision with root package name */
    private int f57042v;

    /* renamed from: x  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f57023x = {v.c(HeartHistoryActivity.class, "binding", "getBinding()Lcom/withings/wiscale2/databinding/ActivityHeartHistoryBinding;", 0), v.c(HeartHistoryActivity.class, "measuresType", "getMeasuresType()I", 0), v.c(HeartHistoryActivity.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0)};

    /* renamed from: w  reason: collision with root package name */
    public static final a f57022w = new Object();

    /* renamed from: y  reason: collision with root package name */
    private static final int[] f57024y = {7, 31, 365};

    /* compiled from: HeartHistoryActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        public static Intent a(Context context, User user, DateTime dateTime, Period period) {
            u.j(context, "context");
            u.j(user, "user");
            Intent putExtra = new Intent(context, HeartHistoryActivity.class).putExtra("measure_type", 0).putExtra("period", period).putExtra(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, user).putExtra("date", dateTime);
            u.i(putExtra, "putExtra(...)");
            return putExtra;
        }
    }

    /* compiled from: HeartHistoryActivity.kt */
    /* loaded from: classes5.dex */
    public interface b extends py.a {
        Fragment E1(DateTime dateTime, int i11);

        void F(int i11);

        void S0(DateTime dateTime);

        DateTime a();

        List<MeasuresGroup> i();

        void j(List<? extends MeasuresGroup> list);

        void x1(boolean z5);
    }

    /* compiled from: HeartHistoryActivity.kt */
    /* loaded from: classes5.dex */
    public final class c extends ry.o implements CustomNestedScrollView.b {

        /* renamed from: c  reason: collision with root package name */
        private final Context f57043c;

        /* renamed from: d  reason: collision with root package name */
        private final b f57044d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ HeartHistoryActivity f57045e;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public c(com.withings.wiscale2.heart.HeartHistoryActivity r2, android.content.Context r3, androidx.fragment.app.FragmentManager r4, org.joda.time.DateTime r5, com.withings.wiscale2.heart.HeartHistoryActivity.b r6) {
            /*
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.u.j(r3, r0)
                r1.f57045e = r2
                org.joda.time.DateTime r2 = org.joda.time.DateTime.now()
                java.lang.String r0 = "now(...)"
                kotlin.jvm.internal.u.i(r2, r0)
                r1.<init>(r4, r5, r2)
                r1.f57043c = r3
                r1.f57044d = r6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.heart.HeartHistoryActivity.c.<init>(com.withings.wiscale2.heart.HeartHistoryActivity, android.content.Context, androidx.fragment.app.FragmentManager, org.joda.time.DateTime, com.withings.wiscale2.heart.HeartHistoryActivity$b):void");
        }

        @Override // com.withings.views.view.CustomNestedScrollView.b
        public final void K1(int i11, int i12) {
            com.withings.wiscale2.heart.f fVar;
            HeartHistoryActivity heartHistoryActivity = this.f57045e;
            heartHistoryActivity.f57042v = i11;
            heartHistoryActivity.R3().f99486b.getLayoutParams().height = i12;
            en0.i iVar = new en0.i(-2, 2, 1);
            ArrayList<Number> arrayList = new ArrayList();
            for (Integer num : iVar) {
                if (num.intValue() != 0) {
                    arrayList.add(num);
                }
            }
            ArrayList<Fragment> arrayList2 = new ArrayList(x.y(arrayList, 10));
            for (Number number : arrayList) {
                arrayList2.add(getInstance(heartHistoryActivity.f57041u + number.intValue()));
            }
            for (Fragment fragment : arrayList2) {
                if (fragment instanceof com.withings.wiscale2.heart.f) {
                    fVar = (com.withings.wiscale2.heart.f) fragment;
                } else {
                    fVar = null;
                }
                if (fVar != null) {
                    fVar.customScrollTo(heartHistoryActivity.f57042v);
                }
            }
        }

        @Override // ry.o
        public final Fragment getFragment(DateTime dateTime) {
            return this.f57044d.E1(dateTime, this.f57045e.f57042v);
        }

        @Override // androidx.viewpager.widget.e
        public final CharSequence getPageTitle(int i11) {
            return b50.b.n(this.f57043c, a(i11));
        }
    }

    /* compiled from: HeartHistoryActivity.kt */
    /* loaded from: classes5.dex */
    public final class d extends ty.a implements CustomNestedScrollView.b {

        /* renamed from: a  reason: collision with root package name */
        private final Context f57046a;

        /* renamed from: b  reason: collision with root package name */
        private final DateTime f57047b;

        /* renamed from: c  reason: collision with root package name */
        private final b f57048c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ HeartHistoryActivity f57049d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(HeartHistoryActivity heartHistoryActivity, Context context, FragmentManager fragmentManager, DateTime dateTime, b bVar) {
            super(fragmentManager, dateTime, DateTime.now());
            u.j(context, "context");
            this.f57049d = heartHistoryActivity;
            this.f57046a = context;
            this.f57047b = dateTime;
            this.f57048c = bVar;
        }

        @Override // com.withings.views.view.CustomNestedScrollView.b
        public final void K1(int i11, int i12) {
            com.withings.wiscale2.heart.f fVar;
            HeartHistoryActivity heartHistoryActivity = this.f57049d;
            heartHistoryActivity.f57042v = i11;
            heartHistoryActivity.R3().f99486b.getLayoutParams().height = i12;
            en0.i iVar = new en0.i(-2, 2, 1);
            ArrayList<Number> arrayList = new ArrayList();
            for (Integer num : iVar) {
                if (num.intValue() != 0) {
                    arrayList.add(num);
                }
            }
            ArrayList<Fragment> arrayList2 = new ArrayList(x.y(arrayList, 10));
            for (Number number : arrayList) {
                arrayList2.add(getInstance(heartHistoryActivity.f57041u + number.intValue()));
            }
            for (Fragment fragment : arrayList2) {
                if (fragment instanceof com.withings.wiscale2.heart.f) {
                    fVar = (com.withings.wiscale2.heart.f) fragment;
                } else {
                    fVar = null;
                }
                if (fVar != null) {
                    fVar.customScrollTo(heartHistoryActivity.f57042v);
                }
            }
        }

        @Override // ty.a, androidx.viewpager.widget.e
        public final int getCount() {
            return Weeks.weeksBetween(this.f57047b.minusWeeks(1), getTheMostRecentWeek().plusWeeks(1)).getWeeks();
        }

        @Override // ty.a
        public final Fragment getFragment(DateTime day) {
            u.j(day, "day");
            return this.f57048c.E1(day, this.f57049d.f57042v);
        }

        @Override // androidx.viewpager.widget.e
        public final CharSequence getPageTitle(int i11) {
            DateTime week = getWeek(i11);
            u.i(week, "getWeek(...)");
            return b50.b.p(this.f57046a, week);
        }
    }

    /* compiled from: HeartHistoryActivity.kt */
    /* loaded from: classes5.dex */
    public final class e extends uy.a implements CustomNestedScrollView.b {

        /* renamed from: c  reason: collision with root package name */
        private final Context f57050c;

        /* renamed from: d  reason: collision with root package name */
        private final b f57051d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ HeartHistoryActivity f57052e;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public e(com.withings.wiscale2.heart.HeartHistoryActivity r2, android.content.Context r3, androidx.fragment.app.FragmentManager r4, org.joda.time.DateTime r5, com.withings.wiscale2.heart.HeartHistoryActivity.b r6) {
            /*
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.u.j(r3, r0)
                r1.f57052e = r2
                org.joda.time.DateTime r2 = org.joda.time.DateTime.now()
                java.lang.String r0 = "now(...)"
                kotlin.jvm.internal.u.i(r2, r0)
                r1.<init>(r4, r5, r2)
                r1.f57050c = r3
                r1.f57051d = r6
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.heart.HeartHistoryActivity.e.<init>(com.withings.wiscale2.heart.HeartHistoryActivity, android.content.Context, androidx.fragment.app.FragmentManager, org.joda.time.DateTime, com.withings.wiscale2.heart.HeartHistoryActivity$b):void");
        }

        @Override // com.withings.views.view.CustomNestedScrollView.b
        public final void K1(int i11, int i12) {
            com.withings.wiscale2.heart.f fVar;
            HeartHistoryActivity heartHistoryActivity = this.f57052e;
            heartHistoryActivity.f57042v = i11;
            heartHistoryActivity.R3().f99486b.getLayoutParams().height = i12;
            en0.i iVar = new en0.i(-2, 2, 1);
            ArrayList<Number> arrayList = new ArrayList();
            for (Integer num : iVar) {
                if (num.intValue() != 0) {
                    arrayList.add(num);
                }
            }
            ArrayList<Fragment> arrayList2 = new ArrayList(x.y(arrayList, 10));
            for (Number number : arrayList) {
                arrayList2.add(getInstance(heartHistoryActivity.f57041u + number.intValue()));
            }
            for (Fragment fragment : arrayList2) {
                if (fragment instanceof com.withings.wiscale2.heart.f) {
                    fVar = (com.withings.wiscale2.heart.f) fragment;
                } else {
                    fVar = null;
                }
                if (fVar != null) {
                    fVar.customScrollTo(heartHistoryActivity.f57042v);
                }
            }
        }

        @Override // uy.a
        public final Fragment getFragment(DateTime dateTime) {
            return this.f57051d.E1(dateTime, this.f57052e.f57042v);
        }

        @Override // androidx.viewpager.widget.e
        public final CharSequence getPageTitle(int i11) {
            return b50.b.q(this.f57050c, b(i11));
        }
    }

    /* compiled from: HeartHistoryActivity.kt */
    /* loaded from: classes5.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.a<Period> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final Period invoke() {
            Object obj;
            Intent intent = HeartHistoryActivity.this.getIntent();
            if (intent != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    obj = intent.getSerializableExtra("period", Period.class);
                } else {
                    Object serializableExtra = intent.getSerializableExtra("period");
                    if (!(serializableExtra instanceof Period)) {
                        serializableExtra = null;
                    }
                    obj = (Period) serializableExtra;
                }
                Period period = (Period) obj;
                if (period != null) {
                    return period;
                }
            }
            return Period.f43723h;
        }
    }

    /* compiled from: HeartHistoryActivity.kt */
    /* loaded from: classes5.dex */
    static final class g extends kotlin.jvm.internal.w implements ym0.a<r0<Integer>> {
        g() {
            super(0);
        }

        @Override // ym0.a
        public final r0<Integer> invoke() {
            ParcelableSnapshotMutableState f11;
            f11 = l0.f(Integer.valueOf(HeartHistoryActivity.G3(HeartHistoryActivity.this)), v0.f8878a);
            return f11;
        }
    }

    /* compiled from: HeartHistoryActivity.kt */
    /* loaded from: classes5.dex */
    static final class h extends kotlin.jvm.internal.w implements ym0.a<NumberFormat> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f57055a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final NumberFormat invoke() {
            return NumberFormat.getInstance();
        }
    }

    /* compiled from: HeartHistoryActivity.kt */
    /* loaded from: classes5.dex */
    /* synthetic */ class i extends kotlin.jvm.internal.s implements ym0.l<Period, y> {
        i(Object obj) {
            super(1, obj, HeartHistoryActivity.class, "onPeriodClicked", "onPeriodClicked(Lcom/withings/periodsbar/Period;)V", 0);
        }

        @Override // ym0.l
        public final y invoke(Period period) {
            Period p02 = period;
            u.j(p02, "p0");
            HeartHistoryActivity.K3((HeartHistoryActivity) this.receiver, p02);
            return y.f85009a;
        }
    }

    /* compiled from: HeartHistoryActivity.kt */
    /* loaded from: classes5.dex */
    static final class j extends kotlin.jvm.internal.w implements ym0.a<r0<Period>> {
        j() {
            super(0);
        }

        @Override // ym0.a
        public final r0<Period> invoke() {
            ParcelableSnapshotMutableState f11;
            f11 = l0.f(HeartHistoryActivity.E3(HeartHistoryActivity.this), v0.f8878a);
            return f11;
        }
    }

    /* compiled from: HeartHistoryActivity.kt */
    /* loaded from: classes5.dex */
    static final class k extends kotlin.jvm.internal.w implements ym0.a<List<? extends Period>> {

        /* renamed from: a  reason: collision with root package name */
        public static final k f57057a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final List<? extends Period> invoke() {
            HeartHistoryActivity.f57022w.getClass();
            int[] iArr = HeartHistoryActivity.f57024y;
            ArrayList arrayList = new ArrayList(iArr.length);
            for (int i11 : iArr) {
                GraphPeriod.f39501a.getClass();
                arrayList.add(GraphPeriod.a.a(i11).a());
            }
            return arrayList;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class l implements bn0.d<Activity, Integer> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f57058a = nm0.h.b(new com.withings.wiscale2.heart.m(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f57059b;

        public l(Activity activity) {
            this.f57059b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.lang.Integer] */
        @Override // bn0.d
        public final Integer getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f57058a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class m implements bn0.d<Activity, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f57060a = nm0.h.b(new com.withings.wiscale2.heart.n(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f57061b;

        public m(Activity activity) {
            this.f57061b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f57060a.getValue();
        }
    }

    /* compiled from: ActivityViewBindings.kt */
    /* loaded from: classes5.dex */
    public static final class n extends kotlin.jvm.internal.w implements ym0.l<ComponentActivity, tb0.t> {
        @Override // ym0.l
        public final tb0.t invoke(ComponentActivity componentActivity) {
            ComponentActivity activity = componentActivity;
            u.j(activity, "activity");
            View e11 = androidx.core.app.a.e(activity, C1987R.id.root);
            u.i(e11, "requireViewById(this, id)");
            return tb0.t.a(e11);
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public HeartHistoryActivity() {
        super(0);
        this.f57025e = by.kirich1409.viewbindingdelegate.b.a(this, u9.a.a(), new kotlin.jvm.internal.w(1));
        this.f57027g = nm0.h.b(h.f57055a);
        this.f57029i = new l(this);
        this.f57030j = new m(this);
        this.f57031k = nm0.h.b(new f());
        this.f57032l = nm0.h.b(new j());
        this.f57033m = nm0.h.b(k.f57057a);
        this.f57034n = nm0.h.b(new g());
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new g.a(), new com.withings.wiscale2.activity.workout.live.ui.g(this, 2));
        u.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f57035o = registerForActivityResult;
        androidx.activity.result.b<Intent> registerForActivityResult2 = registerForActivityResult(new g.a(), new com.withings.wiscale2.heart.h(this, 0));
        u.i(registerForActivityResult2, "registerForActivityResult(...)");
        this.f57036p = registerForActivityResult2;
    }

    public static void A3(HeartHistoryActivity this$0, ActivityResult activityResult) {
        DateTime dateTime;
        Object obj;
        u.j(this$0, "this$0");
        if (activityResult.b() == -1) {
            Intent a11 = activityResult.a();
            if (a11 != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    obj = com.withings.wiscale2.heart.g.a(a11);
                } else {
                    Object serializableExtra = a11.getSerializableExtra("EXTRA_NEW_MEASURES_GROUP_DATE");
                    if (!(serializableExtra instanceof DateTime)) {
                        serializableExtra = null;
                    }
                    obj = (DateTime) serializableExtra;
                }
                dateTime = (DateTime) obj;
            } else {
                dateTime = null;
            }
            b bVar = this$0.f57038r;
            if (bVar != null) {
                bVar.S0(dateTime);
                this$0.R3().f99485a.i();
                this$0.R3().f99488d.setVisibility(0);
                BuildersKt__Builders_commonKt.launch$default(m0.t.l(this$0), null, null, new com.withings.wiscale2.heart.j(this$0, null), 3, null);
                return;
            }
            u.s("delegate");
            throw null;
        }
    }

    public static final Period E3(HeartHistoryActivity heartHistoryActivity) {
        return (Period) heartHistoryActivity.f57031k.getValue();
    }

    public static final int G3(HeartHistoryActivity heartHistoryActivity) {
        Period period = (Period) heartHistoryActivity.f57031k.getValue();
        u.j(period, "<this>");
        int ordinal = period.ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal != 4) {
                    if (ordinal != 5) {
                        if (ordinal != 6) {
                            return -1;
                        }
                        return 365;
                    }
                    return 92;
                }
                return 31;
            }
            return 7;
        }
        return 1;
    }

    public static final r0 H3(HeartHistoryActivity heartHistoryActivity) {
        return (r0) heartHistoryActivity.f57032l.getValue();
    }

    public static final void K3(HeartHistoryActivity heartHistoryActivity, Period period) {
        heartHistoryActivity.getClass();
        int b10 = h20.a.c(period).b();
        if (heartHistoryActivity.S3().getValue().intValue() != b10) {
            Fragment item = heartHistoryActivity.V3().getItem(heartHistoryActivity.f57041u);
            u.i(item, "getItem(...)");
            if (item instanceof com.withings.wiscale2.heart.f) {
                ((com.withings.wiscale2.heart.f) item).X();
            }
            b bVar = heartHistoryActivity.f57038r;
            if (bVar != null) {
                bVar.F(b10);
                heartHistoryActivity.R3().f99491g.setPagingEnabled(false);
                ((r0) heartHistoryActivity.f57032l.getValue()).setValue(period);
                List<? extends MeasuresGroup> list = heartHistoryActivity.f57039s;
                if (list != null) {
                    if (list.isEmpty()) {
                        heartHistoryActivity.Y1(b10);
                        return;
                    }
                    return;
                }
                u.s("measuresGroupList");
                throw null;
            }
            u.s("delegate");
            throw null;
        }
    }

    public static final void P3(HeartHistoryActivity heartHistoryActivity, int i11, float f11, k0 k0Var) {
        heartHistoryActivity.getClass();
        if (i11 < k0Var.getCount() - 1) {
            RectF currentViewport = heartHistoryActivity.R3().f99485a.getCurrentViewport();
            float width = currentViewport.width();
            float i12 = bt.a.i(heartHistoryActivity.U3(i11));
            float i13 = (bt.a.i(heartHistoryActivity.U3(i11 + 1)) - i12) * f11;
            float f12 = width / 2;
            currentViewport.right = i12 + f12 + i13;
            currentViewport.left = (i12 - f12) + i13;
            heartHistoryActivity.R3().f99485a.m0(currentViewport);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final tb0.t R3() {
        Object value = ((LifecycleViewBindingProperty) this.f57025e).getValue(this, f57023x[0]);
        u.i(value, "getValue(...)");
        return (tb0.t) value;
    }

    private final r0<Integer> S3() {
        return (r0) this.f57034n.getValue();
    }

    private final int T3() {
        return ((Number) this.f57029i.getValue(this, f57023x[1])).intValue();
    }

    private final DateTime U3(int i11) {
        DateTime a11;
        DateTime withTimeAtStartOfDay;
        int intValue = S3().getValue().intValue();
        if (intValue != 31) {
            if (intValue != 365) {
                a11 = ((d) V3()).getDate(i11);
                u.i(a11, "getDate(...)");
            } else {
                a11 = ((e) V3()).b(i11);
            }
        } else {
            a11 = ((c) V3()).a(i11);
        }
        int intValue2 = S3().getValue().intValue();
        if (intValue2 != 31) {
            if (intValue2 != 365) {
                withTimeAtStartOfDay = a11.withDayOfWeek(1).withTimeAtStartOfDay();
            } else {
                withTimeAtStartOfDay = a11.withDayOfYear(1).withTimeAtStartOfDay();
            }
        } else {
            withTimeAtStartOfDay = a11.withDayOfMonth(1).withTimeAtStartOfDay();
        }
        DateTime plus = withTimeAtStartOfDay.plus(new Duration(withTimeAtStartOfDay, withTimeAtStartOfDay.plusDays(S3().getValue().intValue())).getMillis() / 2);
        u.i(plus, "plus(...)");
        return plus;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W3(List<? extends MeasuresGroup> list) {
        DateTime dateTime;
        DateTime dateTime2;
        int b10;
        DateTime withDayOfYear;
        DateTime theMostRecentWeek;
        if (list.isEmpty()) {
            dateTime = DateTime.now();
        } else {
            dateTime = new DateTime(((MeasuresGroup) x.I(list)).getDate());
        }
        int intValue = S3().getValue().intValue();
        if (intValue != 31) {
            if (intValue != 365) {
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                u.i(supportFragmentManager, "getSupportFragmentManager(...)");
                u.g(dateTime);
                b bVar = this.f57038r;
                if (bVar != null) {
                    d dVar = new d(this, this, supportFragmentManager, dateTime, bVar);
                    DateTime dateTime3 = this.f57040t;
                    if (dateTime3 != null) {
                        DateTime b11 = pm.d.b(dateTime3);
                        u.i(dVar.getTheMostRecentWeek(), "getTheMostRecentWeek(...)");
                        b10 = an0.a.b(pm.d.a(b11, theMostRecentWeek) / S3().getValue().intValue());
                        this.f57037q = dVar;
                    } else {
                        u.s("date");
                        throw null;
                    }
                } else {
                    u.s("delegate");
                    throw null;
                }
            } else {
                FragmentManager supportFragmentManager2 = getSupportFragmentManager();
                u.i(supportFragmentManager2, "getSupportFragmentManager(...)");
                u.g(dateTime);
                b bVar2 = this.f57038r;
                if (bVar2 != null) {
                    e eVar = new e(this, this, supportFragmentManager2, dateTime, bVar2);
                    DateTime dateTime4 = this.f57040t;
                    if (dateTime4 != null) {
                        u.i(dateTime4.withDayOfYear(1), "withDayOfYear(...)");
                        b10 = an0.a.b(pm.d.a(withDayOfYear, eVar.a()) / S3().getValue().intValue());
                        this.f57037q = eVar;
                    } else {
                        u.s("date");
                        throw null;
                    }
                } else {
                    u.s("delegate");
                    throw null;
                }
            }
        } else {
            FragmentManager supportFragmentManager3 = getSupportFragmentManager();
            u.i(supportFragmentManager3, "getSupportFragmentManager(...)");
            u.g(dateTime);
            b bVar3 = this.f57038r;
            if (bVar3 != null) {
                c cVar = new c(this, this, supportFragmentManager3, dateTime, bVar3);
                DateTime dateTime5 = this.f57040t;
                if (dateTime5 != null) {
                    DateTime withDayOfMonth = dateTime5.withDayOfMonth(1);
                    u.i(withDayOfMonth, "withDayOfMonth(...)");
                    float a11 = pm.d.a(withDayOfMonth, cVar.b());
                    if (this.f57040t != null) {
                        b10 = an0.a.b(a11 / dateTime2.dayOfMonth().getMaximumValue());
                        this.f57037q = cVar;
                    } else {
                        u.s("date");
                        throw null;
                    }
                } else {
                    u.s("date");
                    throw null;
                }
            } else {
                u.s("delegate");
                throw null;
            }
        }
        this.f57041u = (V3().getCount() - 1) - b10;
        R3().f99491g.setAdapter(V3());
        R3().f99491g.D(this.f57041u, false);
    }

    private final User getUser() {
        return (User) this.f57030j.getValue(this, f57023x[2]);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void z3(com.withings.wiscale2.heart.HeartHistoryActivity r8, androidx.activity.result.ActivityResult r9) {
        /*
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.u.j(r8, r0)
            int r0 = r9.b()
            r1 = 10
            if (r0 != r1) goto L72
            android.content.Intent r9 = r9.a()
            r0 = 0
            if (r9 == 0) goto L40
            android.os.Bundle r9 = r9.getExtras()
            if (r9 == 0) goto L40
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto L25
            java.io.Serializable r9 = com.withings.wiscale2.device.common.ui.b.b(r9)
            goto L32
        L25:
            java.lang.String r1 = "extra_measures_group"
            java.io.Serializable r9 = r9.getSerializable(r1)
            boolean r1 = r9 instanceof com.withings.library.measure.MeasuresGroup
            if (r1 != 0) goto L30
            r9 = r0
        L30:
            com.withings.library.measure.MeasuresGroup r9 = (com.withings.library.measure.MeasuresGroup) r9
        L32:
            com.withings.library.measure.MeasuresGroup r9 = (com.withings.library.measure.MeasuresGroup) r9
            if (r9 == 0) goto L40
            org.joda.time.DateTime r1 = new org.joda.time.DateTime
            java.util.Date r9 = r9.getDate()
            r1.<init>(r9)
            goto L41
        L40:
            r1 = r0
        L41:
            com.withings.wiscale2.heart.HeartHistoryActivity$b r9 = r8.f57038r
            if (r9 == 0) goto L6c
            r9.S0(r1)
            tb0.t r9 = r8.R3()
            com.withings.graph.TimeGraphView r9 = r9.f99485a
            r9.i()
            tb0.t r9 = r8.R3()
            android.widget.ProgressBar r9 = r9.f99488d
            r1 = 0
            r9.setVisibility(r1)
            androidx.lifecycle.LifecycleCoroutineScopeImpl r2 = m0.t.l(r8)
            com.withings.wiscale2.heart.j r5 = new com.withings.wiscale2.heart.j
            r5.<init>(r8, r0)
            r3 = 0
            r4 = 0
            r6 = 3
            r7 = 0
            kotlinx.coroutines.BuildersKt.launch$default(r2, r3, r4, r5, r6, r7)
            goto L72
        L6c:
            java.lang.String r8 = "delegate"
            kotlin.jvm.internal.u.s(r8)
            throw r0
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.heart.HeartHistoryActivity.z3(com.withings.wiscale2.heart.HeartHistoryActivity, androidx.activity.result.ActivityResult):void");
    }

    @Override // og0.w.a
    public final void I2(boolean z5) {
        b bVar = this.f57038r;
        if (bVar != null) {
            bVar.x1(z5);
        } else {
            u.s("delegate");
            throw null;
        }
    }

    @Override // com.withings.views.view.CustomNestedScrollView.b
    public final void K1(int i11, int i12) {
        ((CustomNestedScrollView.b) V3()).K1(i11, i12);
    }

    @Override // com.withings.wiscale2.heart.t
    public final void T1(Intent intent) {
        this.f57035o.a(intent);
    }

    public final k0 V3() {
        k0 k0Var = this.f57037q;
        if (k0Var != null) {
            return k0Var;
        }
        u.s("pagerAdapter");
        throw null;
    }

    @Override // com.withings.wiscale2.heart.p
    public final void Y1(int i11) {
        if (S3().getValue().intValue() != i11) {
            S3().setValue(Integer.valueOf(i11));
            R3().f99491g.setPagingEnabled(true);
            b bVar = this.f57038r;
            if (bVar != null) {
                DateTime a11 = bVar.a();
                if (a11 != null) {
                    this.f57040t = a11;
                }
                List<? extends MeasuresGroup> list = this.f57039s;
                if (list != null) {
                    W3(list);
                    return;
                } else {
                    u.s("measuresGroupList");
                    throw null;
                }
            }
            u.s("delegate");
            throw null;
        }
    }

    @Override // com.withings.wiscale2.heart.bloodpressure.d0.b
    public final void m() {
        AddMeasureActivity.a aVar = AddMeasureActivity.f58098m;
        long q11 = getUser().q();
        aVar.getClass();
        this.f57036p.a(AddMeasureActivity.a.a(this, 9, true, false, q11, null));
    }

    @Override // com.withings.wiscale2.heart.Hilt_HeartHistoryActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        Object obj;
        String string;
        b jVar;
        super.onCreate(bundle);
        Intent intent = getIntent();
        u.i(intent, "getIntent(...)");
        if (Build.VERSION.SDK_INT >= 33) {
            obj = com.withings.measure.detail.paged.a.a(intent);
        } else {
            Serializable serializableExtra = intent.getSerializableExtra("date");
            if (!(serializableExtra instanceof DateTime)) {
                serializableExtra = null;
            }
            obj = (DateTime) serializableExtra;
        }
        u.g(obj);
        DateTime dateTime = (DateTime) obj;
        this.f57040t = dateTime;
        if (dateTime.isAfter(DateTime.now())) {
            DateTime now = DateTime.now();
            u.i(now, "now(...)");
            this.f57040t = now;
        }
        setSupportActionBar(R3().f99489e);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
        }
        int T3 = T3();
        if (T3 != 0) {
            if (T3 != 1) {
                if (T3 != 2) {
                    string = getString(C1987R.string._HEART_);
                    u.i(string, "getString(...)");
                } else {
                    string = getString(C1987R.string._PWV_);
                    u.i(string, "getString(...)");
                }
            } else {
                string = getString(C1987R.string._HEART_RATE_);
                u.i(string, "getString(...)");
            }
        } else {
            string = getString(C1987R.string._BLOOD_PRESSURE_);
            u.i(string, "getString(...)");
        }
        setTitle(string);
        ComposeView topPeriodBar = R3().f99490f;
        u.i(topPeriodBar, "topPeriodBar");
        g20.g.f((List) this.f57033m.getValue(), (r0) this.f57032l.getValue(), topPeriodBar, new i(this));
        this.f57042v = 0;
        R3().f99491g.setOffscreenPageLimit(2);
        R3().f99491g.setNestedScrollingEnabled(true);
        R3().f99491g.c(new com.withings.wiscale2.heart.i(this));
        R3().f99485a.setOnTouchListener(new com.withings.wiscale2.heart.l(this));
        R3().f99485a.setOnScrubbingListener(new com.withings.wiscale2.heart.k(this));
        if (T3() == 2) {
            User user = getUser();
            DateTime dateTime2 = this.f57040t;
            if (dateTime2 != null) {
                TimeGraphView graph = R3().f99485a;
                u.i(graph, "graph");
                GraphPopupView graphPopup = R3().f99487c;
                u.i(graphPopup, "graphPopup");
                int intValue = S3().getValue().intValue();
                fy.o oVar = this.f57028h;
                if (oVar != null) {
                    LifecycleCoroutineScopeImpl l5 = m0.t.l(this);
                    NumberFormat numberFormat = (NumberFormat) this.f57027g.getValue();
                    u.i(numberFormat, "<get-numberFormat>(...)");
                    jVar = new og0.m(user, dateTime2, graph, graphPopup, this, this, intValue, oVar, l5, numberFormat);
                } else {
                    u.s("getMeasuresGroupList");
                    throw null;
                }
            } else {
                u.s("date");
                throw null;
            }
        } else {
            User user2 = getUser();
            DateTime dateTime3 = this.f57040t;
            if (dateTime3 != null) {
                TimeGraphView graph2 = R3().f99485a;
                u.i(graph2, "graph");
                GraphPopupView graphPopup2 = R3().f99487c;
                u.i(graphPopup2, "graphPopup");
                int intValue2 = S3().getValue().intValue();
                fy.o oVar2 = this.f57028h;
                if (oVar2 != null) {
                    jVar = new com.withings.wiscale2.heart.bloodpressure.j(user2, dateTime3, graph2, graphPopup2, this, this, intValue2, oVar2, m0.t.l(this));
                } else {
                    u.s("getMeasuresGroupList");
                    throw null;
                }
            } else {
                u.s("date");
                throw null;
            }
        }
        this.f57038r = jVar;
        R3().f99488d.setVisibility(0);
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), null, null, new com.withings.wiscale2.heart.j(this, null), 3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003a, code lost:
        if (r2.isEmpty() == false) goto L9;
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onCreateOptionsMenu(android.view.Menu r5) {
        /*
            r4 = this;
            java.lang.String r0 = "menu"
            kotlin.jvm.internal.u.j(r5, r0)
            android.view.MenuInflater r0 = r4.getMenuInflater()
            r1 = 2131689493(0x7f0f0015, float:1.9008003E38)
            r0.inflate(r1, r5)
            r0 = 2131361870(0x7f0a004e, float:1.8343505E38)
            android.view.MenuItem r0 = r5.findItem(r0)
            r1 = 1
            if (r0 != 0) goto L1a
            goto L26
        L1a:
            com.withings.user.User r2 = r4.getUser()
            boolean r2 = r2.D()
            r2 = r2 ^ r1
            r0.setVisible(r2)
        L26:
            r0 = 2131361871(0x7f0a004f, float:1.8343507E38)
            android.view.MenuItem r0 = r5.findItem(r0)
            java.util.List<? extends com.withings.library.measure.MeasuresGroup> r2 = r4.f57039s
            r3 = 0
            if (r2 == 0) goto L3d
            if (r2 == 0) goto L3f
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L3d
            goto L46
        L3d:
            r1 = r3
            goto L46
        L3f:
            java.lang.String r5 = "measuresGroupList"
            kotlin.jvm.internal.u.s(r5)
            r5 = 0
            throw r5
        L46:
            r0.setVisible(r1)
            r4.f57026f = r0
            boolean r5 = super.onCreateOptionsMenu(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.heart.HeartHistoryActivity.onCreateOptionsMenu(android.view.Menu):boolean");
    }

    @Override // com.withings.wiscale2.heart.Hilt_HeartHistoryActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected final void onDestroy() {
        this.f57042v = 0;
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        u.j(item, "item");
        int itemId = item.getItemId();
        if (itemId == 16908332) {
            finish();
            return true;
        } else if (itemId == C1987R.id.action_display_list) {
            int T3 = T3();
            androidx.activity.result.b<Intent> bVar = this.f57035o;
            if (T3 != 0) {
                if (T3 != 1) {
                    if (T3 != 2) {
                        return true;
                    }
                    MeasureListActivity.f58492n.getClass();
                    bVar.a(MeasureListActivity.a.a(this, getUser().q(), new int[]{91}, C1987R.string._PWV_));
                    return true;
                }
                MeasureListActivity.f58492n.getClass();
                startActivity(MeasureListActivity.a.a(this, getUser().q(), new int[]{11}, C1987R.string._HEART_RATE_));
                return true;
            }
            BloodPressureMeasureListActivity.b bVar2 = BloodPressureMeasureListActivity.f57302p;
            User user = getUser();
            DateTime now = DateTime.now();
            Period period = Period.f43726k;
            bVar2.getClass();
            bVar.a(BloodPressureMeasureListActivity.b.a(this, user, now, period));
            return true;
        } else if (itemId == C1987R.id.action_display_bottom_sheet) {
            if (T3() == 2) {
                int i11 = w.f86921e;
                User user2 = getUser();
                u.j(user2, "user");
                w wVar = new w();
                Bundle bundle = new Bundle();
                bundle.putParcelable("extra_user", user2);
                wVar.setArguments(bundle);
                wVar.show(getSupportFragmentManager(), w.class.getName());
                return true;
            } else if (T3() != 0) {
                return true;
            } else {
                d0.a aVar = d0.f57353f;
                User user3 = getUser();
                aVar.getClass();
                u.j(user3, "user");
                d0 d0Var = new d0();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("extra_user", user3);
                d0Var.setArguments(bundle2);
                d0Var.show(getSupportFragmentManager(), d0.class.getName());
                return true;
            }
        } else {
            return super.onOptionsItemSelected(item);
        }
    }
}
