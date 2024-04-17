package com.withings.wiscale2.activity.workout.ui.detail;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.ActionBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.views.view.BlockableViewPager;
import com.withings.wiscale2.C1987R;
import java.util.List;
import kotlin.Metadata;
/* compiled from: WorkoutListActivity.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/withings/wiscale2/activity/workout/ui/detail/WorkoutListActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lcom/withings/views/view/BlockableViewPager$b;", "Lpy/a;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class WorkoutListActivity extends Hilt_WorkoutListActivity implements BlockableViewPager.b, py.a {

    /* renamed from: e  reason: collision with root package name */
    private final d f49073e;

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f49074f;

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f49075g;

    /* renamed from: h  reason: collision with root package name */
    private final by.kirich1409.viewbindingdelegate.f f49076h;

    /* renamed from: i  reason: collision with root package name */
    private v5 f49077i;

    /* renamed from: j  reason: collision with root package name */
    private b4 f49078j;

    /* renamed from: k  reason: collision with root package name */
    private final String f49079k;

    /* renamed from: m  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f49072m = {androidx.camera.core.v.c(WorkoutListActivity.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0), androidx.camera.core.v.c(WorkoutListActivity.class, "layout", "getLayout()Lcom/withings/wiscale2/databinding/ActivityWorkoutListBinding;", 0)};

    /* renamed from: l  reason: collision with root package name */
    public static final a f49071l = new Object();

    /* compiled from: WorkoutListActivity.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public static Intent a(Context context, User user, Long l5, Integer num) {
            kotlin.jvm.internal.u.j(context, "context");
            kotlin.jvm.internal.u.j(user, "user");
            Intent putExtra = new Intent(context, WorkoutListActivity.class).putExtra(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, user).putExtra("initial_track_id", l5).putExtra("initial_category_id", num);
            kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
            return putExtra;
        }
    }

    /* compiled from: WorkoutListActivity.kt */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<Integer> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final Integer invoke() {
            int intExtra = WorkoutListActivity.this.getIntent().getIntExtra("initial_category_id", -1);
            Integer valueOf = Integer.valueOf(intExtra);
            if (intExtra == -1) {
                return null;
            }
            return valueOf;
        }
    }

    /* compiled from: WorkoutListActivity.kt */
    /* loaded from: classes4.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<Long> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final Long invoke() {
            long longExtra = WorkoutListActivity.this.getIntent().getLongExtra("initial_track_id", -1L);
            Long valueOf = Long.valueOf(longExtra);
            if (longExtra == -1) {
                return null;
            }
            return valueOf;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class d implements bn0.d<Activity, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f49082a = nm0.h.b(new s5(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f49083b;

        public d(Activity activity) {
            this.f49083b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f49082a.getValue();
        }
    }

    /* compiled from: ActivityViewBindings.kt */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.l<ComponentActivity, tb0.y0> {
        @Override // ym0.l
        public final tb0.y0 invoke(ComponentActivity componentActivity) {
            ComponentActivity activity = componentActivity;
            kotlin.jvm.internal.u.j(activity, "activity");
            View e11 = androidx.core.app.a.e(activity, C1987R.id.root);
            kotlin.jvm.internal.u.i(e11, "requireViewById(this, id)");
            return tb0.y0.a(e11);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public WorkoutListActivity() {
        super(0);
        this.f49073e = new d(this);
        this.f49074f = nm0.h.b(new c());
        this.f49075g = nm0.h.b(new b());
        this.f49076h = by.kirich1409.viewbindingdelegate.b.a(this, u9.a.a(), new kotlin.jvm.internal.w(1));
        this.f49079k = "activity";
    }

    public static final Long A3(WorkoutListActivity workoutListActivity) {
        return (Long) workoutListActivity.f49074f.getValue();
    }

    public static final User C3(WorkoutListActivity workoutListActivity) {
        workoutListActivity.getClass();
        return (User) workoutListActivity.f49073e.getValue(workoutListActivity, f49072m[0]);
    }

    public static final void D3(WorkoutListActivity workoutListActivity, g5 g5Var) {
        workoutListActivity.getClass();
        List<t1> a11 = g5Var.a();
        int b10 = g5Var.b();
        if (a11.isEmpty()) {
            workoutListActivity.finish();
            return;
        }
        b4 b4Var = workoutListActivity.f49078j;
        if (b4Var != null) {
            if (!kotlin.jvm.internal.u.e(b4Var.a(), a11)) {
                b4 b4Var2 = workoutListActivity.f49078j;
                if (b4Var2 != null) {
                    b4Var2.b(a11);
                    workoutListActivity.E3().f99642d.D(b10, false);
                } else {
                    kotlin.jvm.internal.u.s("pagerAdapter");
                    throw null;
                }
            }
            ConstraintLayout b11 = workoutListActivity.E3().f99640b.b();
            kotlin.jvm.internal.u.i(b11, "getRoot(...)");
            b11.setVisibility(8);
            return;
        }
        kotlin.jvm.internal.u.s("pagerAdapter");
        throw null;
    }

    private final tb0.y0 E3() {
        Object value = ((LifecycleViewBindingProperty) this.f49076h).getValue(this, f49072m[1]);
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        return (tb0.y0) value;
    }

    public static final Integer z3(WorkoutListActivity workoutListActivity) {
        return (Integer) workoutListActivity.f49075g.getValue();
    }

    @Override // com.withings.views.view.BlockableViewPager.b
    public final void Q1(boolean z5) {
        E3().f99642d.setPagingEnabled(z5);
    }

    @Override // py.a
    public final String getAnalyticsDetailsViewIdentifier() {
        return this.f49079k;
    }

    @Override // com.withings.wiscale2.activity.workout.ui.detail.Hilt_WorkoutListActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ConstraintLayout b10 = E3().f99640b.b();
        kotlin.jvm.internal.u.i(b10, "getRoot(...)");
        b10.setVisibility(0);
        setSupportActionBar(E3().f99641c);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
        }
        v5 v5Var = (v5) new androidx.lifecycle.k1(this, new n5(this)).a(v5.class);
        xw.d.c(this, v5Var.k0(), new o5(this));
        xw.d.c(this, v5Var.m0(), new p5(this));
        xw.d.c(this, v5Var.i0(), new q5(this));
        this.f49077i = v5Var;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        kotlin.jvm.internal.u.i(supportFragmentManager, "getSupportFragmentManager(...)");
        User user = (User) this.f49073e.getValue(this, f49072m[0]);
        v5 v5Var2 = this.f49077i;
        if (v5Var2 != null) {
            this.f49078j = new b4(supportFragmentManager, user, v5Var2.j0());
            tb0.y0 E3 = E3();
            E3.f99642d.requestTransparentRegion(E3().f99642d);
            tb0.y0 E32 = E3();
            E32.f99642d.c(new r5(this));
            tb0.y0 E33 = E3();
            b4 b4Var = this.f49078j;
            if (b4Var != null) {
                E33.f99642d.setAdapter(b4Var);
                tb0.y0 E34 = E3();
                E34.f99639a.setPager(E3().f99642d);
                return;
            }
            kotlin.jvm.internal.u.s("pagerAdapter");
            throw null;
        }
        kotlin.jvm.internal.u.s("viewModel");
        throw null;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.u.j(item, "item");
        if (item.getItemId() == 16908332) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
