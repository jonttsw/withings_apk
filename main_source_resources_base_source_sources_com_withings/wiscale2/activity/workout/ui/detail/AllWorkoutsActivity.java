package com.withings.wiscale2.activity.workout.ui.detail;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.location.domain.uc.ComputePace;
import com.withings.location.domain.uc.ComputeSpeed;
import com.withings.location.domain.uc.HasEnoughGpsLocations;
import com.withings.location.repository.GpsLocationRepository;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.activity.logging.ui.EditWorkoutActivity;
import gi.j;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
/* compiled from: AllWorkoutsActivity.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b²\u0006\u0012\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/withings/wiscale2/activity/workout/ui/detail/AllWorkoutsActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "a", "", "Lcom/withings/wiscale2/activity/workout/ui/detail/o7$a;", "workoutCountByCategory", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AllWorkoutsActivity extends Hilt_AllWorkoutsActivity {
    @Inject

    /* renamed from: e  reason: collision with root package name */
    public GpsLocationRepository f49013e;
    @Inject

    /* renamed from: f  reason: collision with root package name */
    public HasEnoughGpsLocations f49014f;
    @Inject

    /* renamed from: g  reason: collision with root package name */
    public ComputePace f49015g;
    @Inject

    /* renamed from: h  reason: collision with root package name */
    public ComputeSpeed f49016h;

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f49017i = nm0.h.b(new c());

    /* renamed from: j  reason: collision with root package name */
    private final nm0.g f49018j = nm0.h.b(new g());

    /* renamed from: k  reason: collision with root package name */
    private final nm0.g f49019k = nm0.h.b(new d());

    /* renamed from: l  reason: collision with root package name */
    private final nm0.g f49020l = nm0.h.b(new e());

    /* renamed from: m  reason: collision with root package name */
    private final f f49021m = new f(this);

    /* renamed from: n  reason: collision with root package name */
    private final nm0.g f49022n = nm0.h.b(new b());

    /* renamed from: o  reason: collision with root package name */
    private o7 f49023o;

    /* renamed from: q  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f49012q = {androidx.camera.core.v.c(AllWorkoutsActivity.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0)};

    /* renamed from: p  reason: collision with root package name */
    public static final a f49011p = new Object();

    /* compiled from: AllWorkoutsActivity.kt */
    /* loaded from: classes4.dex */
    public static final class a {
    }

    /* compiled from: AllWorkoutsActivity.kt */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<h5> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final h5 invoke() {
            AllWorkoutsActivity allWorkoutsActivity = AllWorkoutsActivity.this;
            return new h5(allWorkoutsActivity, m0.t.l(allWorkoutsActivity));
        }
    }

    /* compiled from: AllWorkoutsActivity.kt */
    /* loaded from: classes4.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<AppBarLayout> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final AppBarLayout invoke() {
            return (AppBarLayout) AllWorkoutsActivity.this.findViewById(C1987R.id.appbar);
        }
    }

    /* compiled from: AllWorkoutsActivity.kt */
    /* loaded from: classes4.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<View> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final View invoke() {
            return AllWorkoutsActivity.this.findViewById(C1987R.id.loading);
        }
    }

    /* compiled from: AllWorkoutsActivity.kt */
    /* loaded from: classes4.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.a<RecyclerView> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final RecyclerView invoke() {
            return (RecyclerView) AllWorkoutsActivity.this.findViewById(C1987R.id.recyclerview);
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class f implements bn0.d<Activity, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f49028a = nm0.h.b(new p(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f49029b;

        public f(Activity activity) {
            this.f49029b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f49028a.getValue();
        }
    }

    /* compiled from: AllWorkoutsActivity.kt */
    /* loaded from: classes4.dex */
    static final class g extends kotlin.jvm.internal.w implements ym0.a<Toolbar> {
        g() {
            super(0);
        }

        @Override // ym0.a
        public final Toolbar invoke() {
            return (Toolbar) AllWorkoutsActivity.this.findViewById(C1987R.id.toolbar);
        }
    }

    public static final void B3(AllWorkoutsActivity allWorkoutsActivity, List list) {
        allWorkoutsActivity.getClass();
        if (list.isEmpty()) {
            allWorkoutsActivity.startActivity(EditWorkoutActivity.a.c(allWorkoutsActivity, (User) allWorkoutsActivity.f49021m.getValue(allWorkoutsActivity, f49012q[0]), 28));
            allWorkoutsActivity.finish();
            return;
        }
        Object value = allWorkoutsActivity.f49019k.getValue();
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        ((View) value).setVisibility(8);
        ((h5) allWorkoutsActivity.f49022n.getValue()).submitList(list);
    }

    public static final User z3(AllWorkoutsActivity allWorkoutsActivity) {
        allWorkoutsActivity.getClass();
        return (User) allWorkoutsActivity.f49021m.getValue(allWorkoutsActivity, f49012q[0]);
    }

    @Override // com.withings.wiscale2.activity.workout.ui.detail.Hilt_AllWorkoutsActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.core.view.l1.a(getWindow(), false);
        setContentView(C1987R.layout.activity_all_workouts);
        Object value = this.f49019k.getValue();
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        ((View) value).setVisibility(0);
        Object value2 = this.f49018j.getValue();
        kotlin.jvm.internal.u.i(value2, "getValue(...)");
        setSupportActionBar((Toolbar) value2);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
            supportActionBar.w(getString(C1987R.string.homescreen_allWorkouts_title));
        }
        Object value3 = this.f49017i.getValue();
        kotlin.jvm.internal.u.i(value3, "getValue(...)");
        ay.b.n((AppBarLayout) value3, true, false, 29);
        nm0.g gVar = this.f49020l;
        RecyclerView recyclerView = (RecyclerView) gVar.getValue();
        kotlin.jvm.internal.u.g(recyclerView);
        ay.b.n(recyclerView, false, true, 23);
        recyclerView.setScrollBarStyle(33554432);
        recyclerView.setHasFixedSize(false);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        recyclerView.m(new com.withings.wiscale2.activity.workout.ui.detail.d(this));
        ((RecyclerView) gVar.getValue()).setAdapter((h5) this.f49022n.getValue());
        this.f49023o = (o7) new androidx.lifecycle.k1(this, new com.withings.wiscale2.activity.workout.ui.detail.e(this)).a(o7.class);
        m0.t.l(this).b(new com.withings.wiscale2.activity.workout.ui.detail.f(this, null));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        kotlin.jvm.internal.u.j(menu, "menu");
        getMenuInflater().inflate(C1987R.menu.workout_list, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.u.j(item, "item");
        int itemId = item.getItemId();
        if (itemId == C1987R.id.action_filter) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            kotlin.jvm.internal.u.i(supportFragmentManager, "getSupportFragmentManager(...)");
            j.a aVar = new j.a(supportFragmentManager);
            aVar.v(C1987R.layout.sheet_compose_view, new o(this));
            aVar.x();
            return true;
        } else if (itemId == 16908332) {
            finish();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }
}
