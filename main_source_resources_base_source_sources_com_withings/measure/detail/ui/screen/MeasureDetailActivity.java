package com.withings.measure.detail.ui.screen;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.l0;
import androidx.compose.runtime.v0;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.k1;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.measure.MeasuresGroup;
import com.withings.periodsbar.Period;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import k1.r0;
import kotlin.Metadata;
import kotlin.collections.x;
import org.joda.time.DateTime;
import qy.g0;
/* compiled from: MeasureDetailActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/withings/measure/detail/ui/screen/MeasureDetailActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lry/d;", "<init>", "()V", "a", "measure-detail_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class MeasureDetailActivity extends Hilt_MeasureDetailActivity implements ry.d {
    @Inject

    /* renamed from: e  reason: collision with root package name */
    public cy.a f41735e;

    /* renamed from: f  reason: collision with root package name */
    private final e f41736f;

    /* renamed from: g  reason: collision with root package name */
    private final f f41737g;

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f41738h;

    /* renamed from: i  reason: collision with root package name */
    private final g f41739i;

    /* renamed from: j  reason: collision with root package name */
    private final h f41740j;

    /* renamed from: k  reason: collision with root package name */
    private final nm0.g f41741k;

    /* renamed from: l  reason: collision with root package name */
    private ry.l f41742l;

    /* renamed from: m  reason: collision with root package name */
    private final by.kirich1409.viewbindingdelegate.f f41743m;

    /* renamed from: n  reason: collision with root package name */
    private final nm0.g f41744n;

    /* renamed from: p  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f41734p = {androidx.camera.core.v.c(MeasureDetailActivity.class, NavigationArguments.USER_ID, "getUserId()J", 0), androidx.camera.core.v.c(MeasureDetailActivity.class, "defaultPeriod", "getDefaultPeriod()Lcom/withings/periodsbar/Period;", 0), androidx.camera.core.v.c(MeasureDetailActivity.class, "entryPointMeasurementGroupId", "getEntryPointMeasurementGroupId()J", 0), androidx.camera.core.v.c(MeasureDetailActivity.class, "measureDetailScreen", "getMeasureDetailScreen()Lcom/withings/measure/detail/ui/screen/MeasureDetailScreen;", 0), androidx.camera.core.v.c(MeasureDetailActivity.class, "binding", "getBinding()Lcom/withings/measure/detail/databinding/ActivityMeasureDetailBinding;", 0)};

    /* renamed from: o  reason: collision with root package name */
    public static final a f41733o = new Object();

    /* compiled from: MeasureDetailActivity.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public static Intent a(Context context, long j5, MeasureDetailScreen measureDetailScreen, long j11) {
            Period period = Period.f43720e;
            kotlin.jvm.internal.u.j(context, "context");
            kotlin.jvm.internal.u.j(measureDetailScreen, "measureDetailScreen");
            Intent putExtra = new Intent(context, MeasureDetailActivity.class).putExtra("EXTRA_USER_ID", j5).putExtra("EXTRA_PERIOD", period).putExtra("EXTRA_SCREEN", measureDetailScreen).putExtra("EXTRA_MEASURES_GROUP_ID", j11);
            kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
            return putExtra;
        }
    }

    /* compiled from: MeasureDetailActivity.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f41745a;

        static {
            int[] iArr = new int[Period.values().length];
            try {
                Period.a aVar = Period.f43718c;
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f41745a = iArr;
        }
    }

    /* compiled from: MeasureDetailActivity.kt */
    /* loaded from: classes4.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<g0> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final g0 invoke() {
            MeasureDetailActivity measureDetailActivity = MeasureDetailActivity.this;
            FragmentManager supportFragmentManager = measureDetailActivity.getSupportFragmentManager();
            kotlin.jvm.internal.u.i(supportFragmentManager, "getSupportFragmentManager(...)");
            return new g0(supportFragmentManager, measureDetailActivity.getUserId(), measureDetailActivity.M3());
        }
    }

    /* compiled from: MeasureDetailActivity.kt */
    /* loaded from: classes4.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<r0<Period>> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final r0<Period> invoke() {
            ParcelableSnapshotMutableState f11;
            f11 = l0.f(MeasureDetailActivity.A3(MeasureDetailActivity.this), v0.f8878a);
            return f11;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class e implements bn0.d<Activity, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f41748a = nm0.h.b(new com.withings.measure.detail.ui.screen.j(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f41749b;

        public e(Activity activity) {
            this.f41749b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f41748a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class f implements bn0.d<Activity, Period> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f41750a = nm0.h.b(new k(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f41751b;

        public f(Activity activity) {
            this.f41751b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.periodsbar.Period, java.lang.Object] */
        @Override // bn0.d
        public final Period getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f41750a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class g implements bn0.d<Activity, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f41752a = nm0.h.b(new l(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f41753b;

        public g(Activity activity) {
            this.f41753b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f41752a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class h implements bn0.d<Activity, MeasureDetailScreen<Double>> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f41754a = nm0.h.b(new m(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f41755b;

        public h(Activity activity) {
            this.f41755b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.measure.detail.ui.screen.MeasureDetailScreen<java.lang.Double>, java.lang.Object] */
        @Override // bn0.d
        public final MeasureDetailScreen<Double> getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f41754a.getValue();
        }
    }

    /* compiled from: ActivityViewBindings.kt */
    /* loaded from: classes4.dex */
    public static final class i extends kotlin.jvm.internal.w implements ym0.l<ComponentActivity, oy.b> {
        @Override // ym0.l
        public final oy.b invoke(ComponentActivity componentActivity) {
            ComponentActivity activity = componentActivity;
            kotlin.jvm.internal.u.j(activity, "activity");
            View e11 = androidx.core.app.a.e(activity, C1987R.id.container);
            kotlin.jvm.internal.u.i(e11, "requireViewById(this, id)");
            return oy.b.a(e11);
        }
    }

    /* compiled from: MeasureDetailActivity.kt */
    /* loaded from: classes4.dex */
    static final class j extends kotlin.jvm.internal.w implements ym0.a<q> {
        j() {
            super(0);
        }

        @Override // ym0.a
        public final q invoke() {
            MeasureDetailActivity measureDetailActivity = MeasureDetailActivity.this;
            return (q) new k1(measureDetailActivity, new o(measureDetailActivity)).a(q.class);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public MeasureDetailActivity() {
        super(0);
        this.f41736f = new e(this);
        this.f41737g = new f(this);
        this.f41738h = nm0.h.b(new d());
        this.f41739i = new g(this);
        this.f41740j = new h(this);
        this.f41741k = nm0.h.b(new c());
        this.f41743m = by.kirich1409.viewbindingdelegate.b.a(this, u9.a.a(), new kotlin.jvm.internal.w(1));
        this.f41744n = nm0.h.b(new j());
    }

    public static final Period A3(MeasureDetailActivity measureDetailActivity) {
        return (Period) measureDetailActivity.f41737g.getValue(measureDetailActivity, f41734p[1]);
    }

    public static final long B3(MeasureDetailActivity measureDetailActivity) {
        return ((Number) measureDetailActivity.f41739i.getValue(measureDetailActivity, f41734p[2])).longValue();
    }

    public static final r0 E3(MeasureDetailActivity measureDetailActivity) {
        return (r0) measureDetailActivity.f41738h.getValue();
    }

    public static final q G3(MeasureDetailActivity measureDetailActivity) {
        return (q) measureDetailActivity.f41744n.getValue();
    }

    public static final void H3(MeasureDetailActivity measureDetailActivity, DateTime dateTime, List list) {
        measureDetailActivity.getClass();
        List<Object> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (Object obj : list2) {
                if (obj instanceof MeasuresGroup) {
                    measureDetailActivity.M3().s0();
                    Period.a aVar = Period.f43718c;
                    if (b.f41745a[0] == 1) {
                        FragmentManager supportFragmentManager = measureDetailActivity.getSupportFragmentManager();
                        kotlin.jvm.internal.u.i(supportFragmentManager, "getSupportFragmentManager(...)");
                        new qy.v(measureDetailActivity.getUserId(), measureDetailActivity, supportFragmentManager, measureDetailActivity.M3(), dateTime);
                        measureDetailActivity.getClass();
                        return;
                    }
                    g0 g0Var = (g0) measureDetailActivity.f41741k.getValue();
                    ArrayList arrayList = new ArrayList(x.y(list2, 10));
                    for (Object obj2 : list2) {
                        kotlin.jvm.internal.u.h(obj2, "null cannot be cast to non-null type com.withings.library.measure.MeasuresGroup");
                        arrayList.add(new g0.a(obj2, b50.b.m(new DateTime(((MeasuresGroup) obj2).getDate()), measureDetailActivity, true, 4)));
                    }
                    g0Var.b(arrayList);
                    return;
                }
            }
        }
    }

    public static final void I3(MeasureDetailActivity measureDetailActivity, DateTime dateTime) {
        long userId = measureDetailActivity.getUserId();
        FragmentManager supportFragmentManager = measureDetailActivity.getSupportFragmentManager();
        kotlin.jvm.internal.u.i(supportFragmentManager, "getSupportFragmentManager(...)");
        measureDetailActivity.f41742l = new ry.l(userId, measureDetailActivity, supportFragmentManager, measureDetailActivity.M3(), dateTime);
    }

    public static final void J3(MeasureDetailActivity measureDetailActivity, Period period) {
        androidx.viewpager.widget.e eVar;
        oy.b L3 = measureDetailActivity.L3();
        if (period == Period.f43723h) {
            eVar = measureDetailActivity.f41742l;
            if (eVar == null) {
                kotlin.jvm.internal.u.s("monthAdapter");
                throw null;
            }
        } else {
            measureDetailActivity.M3().s0();
            Period.a aVar = Period.f43718c;
            Period.a aVar2 = Period.f43718c;
            eVar = (g0) measureDetailActivity.f41741k.getValue();
        }
        L3.f90078d.setAdapter(eVar);
        ((r0) measureDetailActivity.f41738h.getValue()).setValue(period);
    }

    public static final void K3(MeasureDetailActivity measureDetailActivity, int i11) {
        measureDetailActivity.L3().f90078d.setCurrentItem(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final oy.b L3() {
        Object value = ((LifecycleViewBindingProperty) this.f41743m).getValue(this, f41734p[4]);
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        return (oy.b) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MeasureDetailScreen<Double> M3() {
        return this.f41740j.getValue(this, f41734p[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getUserId() {
        return ((Number) this.f41736f.getValue(this, f41734p[0])).longValue();
    }

    @Override // ry.d
    public final void b(int i11) {
        com.withings.measure.detail.paged.g gVar;
        androidx.viewpager.widget.e adapter = L3().f90078d.getAdapter();
        if (adapter instanceof com.withings.measure.detail.paged.g) {
            gVar = (com.withings.measure.detail.paged.g) adapter;
        } else {
            gVar = null;
        }
        if (gVar != null) {
            gVar.setCurrentScroll(i11);
        }
    }

    @Override // ry.d
    public final void e(DateTime newDate) {
        kotlin.jvm.internal.u.j(newDate, "newDate");
        ((q) this.f41744n.getValue()).y0(newDate);
    }

    @Override // com.withings.measure.detail.ui.screen.Hilt_MeasureDetailActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setSupportActionBar(L3().f90076b);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
        }
        setSupportActionBar(L3().f90076b);
        ActionBar supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.o(true);
            supportActionBar2.v(M3().b0());
        }
        ComposeView topPeriodBar = L3().f90077c;
        kotlin.jvm.internal.u.i(topPeriodBar, "topPeriodBar");
        g20.g.f(M3().getPeriodList(), (r0) this.f41738h.getValue(), topPeriodBar, new com.withings.measure.detail.ui.screen.c(this));
        oy.b L3 = L3();
        L3.f90078d.c(new com.withings.measure.detail.ui.screen.i(this));
        q qVar = (q) this.f41744n.getValue();
        xw.d.c(this, qVar.q0(), new com.withings.measure.detail.ui.screen.d(this));
        xw.d.c(this, qVar.t0(), new com.withings.measure.detail.ui.screen.e(this));
        xw.d.c(this, qVar.r0(), new com.withings.measure.detail.ui.screen.f(this));
        xw.d.c(this, qVar.p0(), new com.withings.measure.detail.ui.screen.g(this));
        xw.d.c(this, qVar.m0(), new com.withings.measure.detail.ui.screen.h(this));
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
