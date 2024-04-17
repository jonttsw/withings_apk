package com.withings.wiscale2.heart.heartrate;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.ActionBar;
import androidx.compose.material.g6;
import androidx.fragment.app.FragmentManager;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.google.android.material.appbar.AppBarLayout;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.features.FeatureFlag;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.views.view.BlockableViewPager;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.heart.heartrate.a1;
import com.withings.wiscale2.track.data.Track;
import java.util.Arrays;
import javax.inject.Inject;
import kotlin.Metadata;
import org.joda.time.DateTime;
/* compiled from: HeartRateDayActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/withings/wiscale2/heart/heartrate/HeartRateDayActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lcom/withings/views/view/BlockableViewPager$b;", "Lpy/a;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class HeartRateDayActivity extends Hilt_HeartRateDayActivity implements BlockableViewPager.b, py.a {

    /* renamed from: e  reason: collision with root package name */
    private final e f57500e;

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f57501f;

    /* renamed from: g  reason: collision with root package name */
    private int f57502g;

    /* renamed from: h  reason: collision with root package name */
    private v f57503h;

    /* renamed from: i  reason: collision with root package name */
    private p f57504i;

    /* renamed from: j  reason: collision with root package name */
    private final by.kirich1409.viewbindingdelegate.f f57505j;

    /* renamed from: k  reason: collision with root package name */
    private d0 f57506k;

    /* renamed from: l  reason: collision with root package name */
    private final nm0.g f57507l;

    /* renamed from: m  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f57508m;
    @Inject

    /* renamed from: n  reason: collision with root package name */
    public dg.a f57509n;

    /* renamed from: o  reason: collision with root package name */
    private final String f57510o;

    /* renamed from: q  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f57499q = {androidx.camera.core.v.c(HeartRateDayActivity.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0), androidx.camera.core.v.c(HeartRateDayActivity.class, "binding", "getBinding()Lcom/withings/wiscale2/databinding/ActivityHeartRateDayBinding;", 0)};

    /* renamed from: p  reason: collision with root package name */
    public static final a f57498p = new Object();

    /* compiled from: HeartRateDayActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        public static Intent a(Context context, User user, DateTime dateTime) {
            kotlin.jvm.internal.u.j(context, "context");
            kotlin.jvm.internal.u.j(user, "user");
            Intent putExtra = new Intent(context, HeartRateDayActivity.class).putExtra(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, user).putExtra("date", dateTime);
            kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
            return putExtra;
        }
    }

    /* compiled from: HeartRateDayActivity.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<DateTime> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final DateTime invoke() {
            Object obj;
            Intent intent = HeartRateDayActivity.this.getIntent();
            kotlin.jvm.internal.u.i(intent, "getIntent(...)");
            DateTime dateTime = null;
            if (Build.VERSION.SDK_INT >= 33) {
                obj = com.withings.measure.detail.paged.a.a(intent);
            } else {
                Object serializableExtra = intent.getSerializableExtra("date");
                if (!(serializableExtra instanceof DateTime)) {
                    serializableExtra = null;
                }
                obj = (DateTime) serializableExtra;
            }
            DateTime dateTime2 = (DateTime) obj;
            if (dateTime2 != null) {
                if (dateTime2.isBeforeNow()) {
                    dateTime = dateTime2;
                }
                if (dateTime != null) {
                    return dateTime;
                }
            }
            return DateTime.now();
        }
    }

    /* compiled from: HeartRateDayActivity.kt */
    /* loaded from: classes5.dex */
    static final class c implements androidx.lifecycle.l0, kotlin.jvm.internal.p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ym0.l f57512a;

        c(ym0.l lVar) {
            this.f57512a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.l0) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return kotlin.jvm.internal.u.e(this.f57512a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f57512a;
        }

        public final int hashCode() {
            return this.f57512a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f57512a.invoke(obj);
        }
    }

    /* compiled from: HeartRateDayActivity.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<hi0.b> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final hi0.b invoke() {
            HeartRateDayActivity heartRateDayActivity = HeartRateDayActivity.this;
            return new hi0.b(heartRateDayActivity, o70.a.d(heartRateDayActivity.getUser()));
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class e implements bn0.d<Activity, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f57514a = nm0.h.b(new t(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f57515b;

        public e(Activity activity) {
            this.f57515b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f57514a.getValue();
        }
    }

    /* compiled from: ActivityViewBindings.kt */
    /* loaded from: classes5.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.l<ComponentActivity, tb0.u> {
        @Override // ym0.l
        public final tb0.u invoke(ComponentActivity componentActivity) {
            ComponentActivity activity = componentActivity;
            kotlin.jvm.internal.u.j(activity, "activity");
            View e11 = androidx.core.app.a.e(activity, C1987R.id.root);
            kotlin.jvm.internal.u.i(e11, "requireViewById(this, id)");
            return tb0.u.a(e11);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public HeartRateDayActivity() {
        super(0);
        this.f57500e = new e(this);
        this.f57501f = nm0.h.b(new b());
        this.f57505j = by.kirich1409.viewbindingdelegate.b.a(this, u9.a.a(), new kotlin.jvm.internal.w(1));
        this.f57507l = nm0.h.b(new d());
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new g.a(), new cq.f(this, 3));
        kotlin.jvm.internal.u.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f57508m = registerForActivityResult;
        this.f57510o = "heart_rate";
    }

    public static final void C3(HeartRateDayActivity heartRateDayActivity, DateTime dateTime) {
        Context context = heartRateDayActivity.G3().f99519c.getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        FragmentManager supportFragmentManager = heartRateDayActivity.getSupportFragmentManager();
        kotlin.jvm.internal.u.i(supportFragmentManager, "getSupportFragmentManager(...)");
        heartRateDayActivity.f57503h = new v(context, supportFragmentManager, heartRateDayActivity.getUser(), dateTime);
        heartRateDayActivity.f57504i = new p(heartRateDayActivity);
        heartRateDayActivity.G3().f99518b.setOffscreenPageLimit(2);
        heartRateDayActivity.G3().f99518b.setNestedScrollingEnabled(true);
        Object value = heartRateDayActivity.f57501f.getValue();
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        DateTime dateTime2 = (DateTime) value;
        v vVar = heartRateDayActivity.f57503h;
        if (vVar != null) {
            DateTime theMaxDateTime = vVar.getTheMaxDateTime();
            kotlin.jvm.internal.u.i(theMaxDateTime, "getTheMaxDateTime(...)");
            int a11 = pm.d.a(dateTime2, theMaxDateTime);
            v vVar2 = heartRateDayActivity.f57503h;
            if (vVar2 != null) {
                heartRateDayActivity.f57502g = (vVar2.getCount() - 1) - a11;
                tb0.u G3 = heartRateDayActivity.G3();
                p pVar = heartRateDayActivity.f57504i;
                if (pVar != null) {
                    G3.f99518b.A(pVar);
                    tb0.u G32 = heartRateDayActivity.G3();
                    p pVar2 = heartRateDayActivity.f57504i;
                    if (pVar2 != null) {
                        G32.f99518b.c(pVar2);
                        tb0.u G33 = heartRateDayActivity.G3();
                        v vVar3 = heartRateDayActivity.f57503h;
                        if (vVar3 != null) {
                            G33.f99518b.setAdapter(vVar3);
                            tb0.u G34 = heartRateDayActivity.G3();
                            G34.f99518b.D(heartRateDayActivity.f57502g, false);
                            return;
                        }
                        kotlin.jvm.internal.u.s("dayPagerAdapter");
                        throw null;
                    }
                    kotlin.jvm.internal.u.s("pageChangeListener");
                    throw null;
                }
                kotlin.jvm.internal.u.s("pageChangeListener");
                throw null;
            }
            kotlin.jvm.internal.u.s("dayPagerAdapter");
            throw null;
        }
        kotlin.jvm.internal.u.s("dayPagerAdapter");
        throw null;
    }

    public static final void E3(HeartRateDayActivity heartRateDayActivity) {
        if (((hi0.b) heartRateDayActivity.f57507l.getValue()).b()) {
            heartRateDayActivity.f57508m.a(((hi0.b) heartRateDayActivity.f57507l.getValue()).a());
            return;
        }
        heartRateDayActivity.H3();
    }

    private final void F3() {
        v vVar = this.f57503h;
        if (vVar != null) {
            if (vVar != null) {
                DateTime date = vVar.getDate(this.f57502g);
                kotlin.jvm.internal.u.i(date, "getDate(...)");
                setResult(-1, new Intent().putExtra("result_extra_day", date));
            } else {
                kotlin.jvm.internal.u.s("dayPagerAdapter");
                throw null;
            }
        }
        finish();
    }

    private final tb0.u G3() {
        Object value = ((LifecycleViewBindingProperty) this.f57505j).getValue(this, f57499q[1]);
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        return (tb0.u) value;
    }

    private final void H3() {
        sf.d a11;
        String string;
        d0 d0Var = this.f57506k;
        if (d0Var != null) {
            Track value = d0Var.i0().getValue();
            if (value != null) {
                User user = getUser();
                if (!wr.b.c(FeatureFlag.f39120n0)) {
                    a11 = null;
                } else {
                    dg.a aVar = this.f57509n;
                    if (aVar != null) {
                        a11 = dg.b.a(aVar, false);
                    } else {
                        kotlin.jvm.internal.u.s("activeSessionProvider");
                        throw null;
                    }
                }
                if (a11 != null) {
                    string = g6.i(a11.h(), "/sleephr/night?userid=%1$s&amp;activityid=%2$s");
                } else {
                    string = getString(C1987R.string.sleepHR_explanationLearnMoreURL_night);
                    kotlin.jvm.internal.u.g(string);
                }
                startActivity(HMWebActivity.f35395c.c(this, null, String.format(string, Arrays.copyOf(new Object[]{String.valueOf(user.q()), String.valueOf(value.getWsId())}, 2))));
                return;
            }
            return;
        }
        kotlin.jvm.internal.u.s("viewModel");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final User getUser() {
        return (User) this.f57500e.getValue(this, f57499q[0]);
    }

    public static void z3(HeartRateDayActivity this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        if (!((hi0.b) this$0.f57507l.getValue()).b()) {
            this$0.H3();
        }
    }

    @Override // com.withings.views.view.BlockableViewPager.b
    public final void Q1(boolean z5) {
        G3().f99518b.setPagingEnabled(z5);
    }

    @Override // py.a
    public final String getAnalyticsDetailsViewIdentifier() {
        return this.f57510o;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        F3();
    }

    @Override // com.withings.wiscale2.heart.heartrate.Hilt_HeartRateDayActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.core.view.l1.a(getWindow(), false);
        setSupportActionBar(G3().f99520d);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
        }
        AppBarLayout appbar = G3().f99517a;
        kotlin.jvm.internal.u.i(appbar, "appbar");
        ay.b.n(appbar, true, false, 29);
        d0 d0Var = (d0) new androidx.lifecycle.k1(this, new q(this)).a(d0.class);
        d0Var.g0().observe(this, new c(new r(this)));
        d0Var.i0().v(this, new s(this));
        this.f57506k = d0Var;
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        kotlin.jvm.internal.u.j(menu, "menu");
        getMenuInflater().inflate(C1987R.menu.menu_hr_day_activity, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.u.j(item, "item");
        int itemId = item.getItemId();
        if (itemId == 16908332) {
            F3();
            return true;
        } else if (itemId == C1987R.id.action_display_bottom_sheet) {
            a1.a aVar = a1.f57549d;
            User user = getUser();
            aVar.getClass();
            kotlin.jvm.internal.u.j(user, "user");
            a1 a1Var = new a1();
            Bundle bundle = new Bundle();
            bundle.putParcelable("extra_user", user);
            a1Var.setArguments(bundle);
            a1Var.show(getSupportFragmentManager(), a1.class.getName());
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }
}
