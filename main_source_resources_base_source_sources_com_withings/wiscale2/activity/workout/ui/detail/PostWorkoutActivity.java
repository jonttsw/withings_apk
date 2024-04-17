package com.withings.wiscale2.activity.workout.ui.detail;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.ActionBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.activity.workout.category.ui.ChooseWorkoutCategoryActivity;
import com.withings.wiscale2.activity.workout.ui.detail.x1;
import com.withings.workout.category.model.WorkoutCategory;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
/* compiled from: PostWorkoutActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/activity/workout/ui/detail/PostWorkoutActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PostWorkoutActivity extends Hilt_PostWorkoutActivity {
    @Inject

    /* renamed from: e  reason: collision with root package name */
    public ua0.a f49062e;

    /* renamed from: f  reason: collision with root package name */
    private final b f49063f = new b(this);

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f49064g = nm0.h.b(new c());

    /* renamed from: h  reason: collision with root package name */
    private x1 f49065h;

    /* renamed from: i  reason: collision with root package name */
    private l1 f49066i;

    /* renamed from: j  reason: collision with root package name */
    private tb0.i0 f49067j;

    /* renamed from: l  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f49061l = {androidx.camera.core.v.c(PostWorkoutActivity.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0)};

    /* renamed from: k  reason: collision with root package name */
    public static final a f49060k = new Object();

    /* compiled from: PostWorkoutActivity.kt */
    /* loaded from: classes4.dex */
    public static final class a {
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class b implements bn0.d<Activity, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f49068a = nm0.h.b(new i1(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f49069b;

        public b(Activity activity) {
            this.f49069b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f49068a.getValue();
        }
    }

    /* compiled from: PostWorkoutActivity.kt */
    /* loaded from: classes4.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<Long> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final Long invoke() {
            return Long.valueOf(PostWorkoutActivity.this.getIntent().getLongExtra("workoutId", -1L));
        }
    }

    public static final void A3(PostWorkoutActivity postWorkoutActivity) {
        postWorkoutActivity.getClass();
        ChooseWorkoutCategoryActivity.a aVar = ChooseWorkoutCategoryActivity.f48655i;
        fn0.k<Object> kVar = f49061l[0];
        aVar.getClass();
        postWorkoutActivity.startActivityForResult(ChooseWorkoutCategoryActivity.a.a(postWorkoutActivity, (User) postWorkoutActivity.f49063f.getValue(postWorkoutActivity, kVar), false, null), 2222);
    }

    public static final long C3(PostWorkoutActivity postWorkoutActivity) {
        return ((Number) postWorkoutActivity.f49064g.getValue()).longValue();
    }

    public static final void D3(PostWorkoutActivity postWorkoutActivity, boolean z5) {
        int i11;
        tb0.i0 i0Var = postWorkoutActivity.f49067j;
        if (i0Var != null) {
            ConstraintLayout b10 = i0Var.f99160c.b();
            kotlin.jvm.internal.u.i(b10, "getRoot(...)");
            int i12 = 8;
            if (z5) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            b10.setVisibility(i11);
            tb0.i0 i0Var2 = postWorkoutActivity.f49067j;
            if (i0Var2 != null) {
                FrameLayout content = i0Var2.f99159b;
                kotlin.jvm.internal.u.i(content, "content");
                if (!z5) {
                    i12 = 0;
                }
                content.setVisibility(i12);
                return;
            }
            kotlin.jvm.internal.u.s("binding");
            throw null;
        }
        kotlin.jvm.internal.u.s("binding");
        throw null;
    }

    public static void z3(PostWorkoutActivity this$0) {
        View findViewById;
        kotlin.jvm.internal.u.j(this$0, "this$0");
        x1 x1Var = this$0.f49065h;
        if (x1Var != null) {
            View view = x1Var.getView();
            if (view != null && (findViewById = view.findViewById(C1987R.id.sharable)) != null) {
                Window window = this$0.getWindow();
                kotlin.jvm.internal.u.i(window, "getWindow(...)");
                o40.b.a(window, findViewById, new b1(this$0));
                return;
            }
            return;
        }
        kotlin.jvm.internal.u.s("fragment");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i11, int i12, Intent intent) {
        WorkoutCategory workoutCategory;
        Integer num;
        super.onActivityResult(i11, i12, intent);
        if (i11 == 2222) {
            if (intent != null) {
                workoutCategory = (WorkoutCategory) intent.getParcelableExtra("result_category");
            } else {
                workoutCategory = null;
            }
            l1 l1Var = this.f49066i;
            if (l1Var != null) {
                if (workoutCategory != null) {
                    num = Integer.valueOf((int) workoutCategory.getId());
                } else {
                    num = null;
                }
                BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.h1.a(l1Var), Dispatchers.getIO(), null, new k1(l1Var, num, null), 2, null);
                return;
            }
            kotlin.jvm.internal.u.s("viewModel");
            throw null;
        }
    }

    @Override // com.withings.wiscale2.activity.workout.ui.detail.Hilt_PostWorkoutActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        tb0.i0 b10 = tb0.i0.b(getLayoutInflater());
        this.f49067j = b10;
        setContentView(b10.a());
        tb0.i0 i0Var = this.f49067j;
        if (i0Var != null) {
            setSupportActionBar(i0Var.f99163f);
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.o(true);
            }
            x1.a aVar = x1.B;
            fn0.k<Object> kVar = f49061l[0];
            long longValue = ((Number) this.f49064g.getValue()).longValue();
            aVar.getClass();
            this.f49065h = x1.a.a((User) this.f49063f.getValue(this, kVar), longValue, null);
            androidx.fragment.app.m0 m11 = getSupportFragmentManager().m();
            x1 x1Var = this.f49065h;
            if (x1Var != null) {
                m11.l(C1987R.id.content, x1Var, null);
                m11.f();
                tb0.i0 i0Var2 = this.f49067j;
                if (i0Var2 != null) {
                    i0Var2.f99161d.setOnClickListener(new com.google.android.material.search.g(this, 6));
                    tb0.i0 i0Var3 = this.f49067j;
                    if (i0Var3 != null) {
                        i0Var3.f99162e.setOnClickListener(new com.withings.alarm.ui.f(this, 6));
                        l1 l1Var = (l1) new androidx.lifecycle.k1(this, new c1(this)).a(l1.class);
                        xw.d.c(this, l1Var.q0(), new d1(this));
                        xw.d.c(this, l1Var.r0(), new e1(this));
                        xw.d.c(this, l1Var.m0(), new f1(this));
                        xw.d.c(this, l1Var.k0(), new g1(this));
                        xw.d.c(this, l1Var.p0(), new h1(this));
                        this.f49066i = l1Var;
                        return;
                    }
                    kotlin.jvm.internal.u.s("binding");
                    throw null;
                }
                kotlin.jvm.internal.u.s("binding");
                throw null;
            }
            kotlin.jvm.internal.u.s("fragment");
            throw null;
        }
        kotlin.jvm.internal.u.s("binding");
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
