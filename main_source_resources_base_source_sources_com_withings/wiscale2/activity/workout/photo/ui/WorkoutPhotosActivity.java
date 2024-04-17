package com.withings.wiscale2.activity.workout.photo.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.camera.core.v;
import androidx.core.view.l1;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
import androidx.viewpager.widget.ViewPager;
import com.withings.android.activity.WithingsActivity;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.activity.workout.model.WorkoutManager;
import fn0.k;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.g;
import nm0.y;
import sg.f;
import va0.h;
import ym0.l;
/* compiled from: WorkoutPhotosActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/activity/workout/photo/ui/WorkoutPhotosActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class WorkoutPhotosActivity extends WithingsActivity {

    /* renamed from: a  reason: collision with root package name */
    private final d f48997a = new d(this);

    /* renamed from: b  reason: collision with root package name */
    private final e f48998b = new e(this);

    /* renamed from: c  reason: collision with root package name */
    private ViewPager f48999c;

    /* renamed from: d  reason: collision with root package name */
    private com.withings.wiscale2.activity.workout.photo.ui.a f49000d;

    /* renamed from: e  reason: collision with root package name */
    private h f49001e;

    /* renamed from: g  reason: collision with root package name */
    static final /* synthetic */ k<Object>[] f48996g = {v.c(WorkoutPhotosActivity.class, "workoutId", "getWorkoutId()J", 0), v.c(WorkoutPhotosActivity.class, "photoIndex", "getPhotoIndex()I", 0)};

    /* renamed from: f  reason: collision with root package name */
    public static final a f48995f = new Object();

    /* compiled from: WorkoutPhotosActivity.kt */
    /* loaded from: classes4.dex */
    public static final class a {
    }

    /* compiled from: Extensions.kt */
    /* loaded from: classes4.dex */
    public static final class b implements k1.b {
        public b() {
        }

        @Override // androidx.lifecycle.k1.b
        public final <U extends g1> U create(Class<U> modelClass) {
            u.j(modelClass, "modelClass");
            WorkoutManager workoutManager = WorkoutManager.Companion.get();
            WorkoutPhotosActivity workoutPhotosActivity = WorkoutPhotosActivity.this;
            return new h(workoutManager, WorkoutPhotosActivity.D3(workoutPhotosActivity), WorkoutPhotosActivity.C3(workoutPhotosActivity));
        }
    }

    /* compiled from: WorkoutPhotosActivity.kt */
    /* loaded from: classes4.dex */
    static final class c extends w implements l<va0.c, y> {
        c() {
            super(1);
        }

        @Override // ym0.l
        public final y invoke(va0.c cVar) {
            va0.c it = cVar;
            u.j(it, "it");
            boolean isEmpty = it.b().isEmpty();
            WorkoutPhotosActivity workoutPhotosActivity = WorkoutPhotosActivity.this;
            if (!isEmpty) {
                com.withings.wiscale2.activity.workout.photo.ui.a aVar = workoutPhotosActivity.f49000d;
                if (aVar != null) {
                    aVar.a(it.b());
                    ViewPager viewPager = workoutPhotosActivity.f48999c;
                    if (viewPager != null) {
                        viewPager.setCurrentItem(it.a());
                    } else {
                        u.s("pager");
                        throw null;
                    }
                } else {
                    u.s("pagerAdapter");
                    throw null;
                }
            } else {
                workoutPhotosActivity.finish();
            }
            return y.f85009a;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class d implements bn0.d<Activity, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final g f49004a = nm0.h.b(new com.withings.wiscale2.activity.workout.photo.ui.b(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f49005b;

        public d(Activity activity) {
            this.f49005b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Activity activity, k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f49004a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class e implements bn0.d<Activity, Integer> {

        /* renamed from: a  reason: collision with root package name */
        private final g f49006a = nm0.h.b(new com.withings.wiscale2.activity.workout.photo.ui.c(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f49007b;

        public e(Activity activity) {
            this.f49007b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.lang.Integer] */
        @Override // bn0.d
        public final Integer getValue(Activity activity, k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f49006a.getValue();
        }
    }

    public static final int C3(WorkoutPhotosActivity workoutPhotosActivity) {
        return ((Number) workoutPhotosActivity.f48998b.getValue(workoutPhotosActivity, f48996g[1])).intValue();
    }

    public static final long D3(WorkoutPhotosActivity workoutPhotosActivity) {
        return ((Number) workoutPhotosActivity.f48997a.getValue(workoutPhotosActivity, f48996g[0])).longValue();
    }

    public static void z3(WorkoutPhotosActivity this$0) {
        u.j(this$0, "this$0");
        h hVar = this$0.f49001e;
        if (hVar != null) {
            ViewPager viewPager = this$0.f48999c;
            if (viewPager != null) {
                hVar.g0(viewPager.getCurrentItem());
                return;
            } else {
                u.s("pager");
                throw null;
            }
        }
        u.s("viewModel");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1987R.layout.activity_workout_photos);
        l1.a(getWindow(), false);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        u.i(supportFragmentManager, "getSupportFragmentManager(...)");
        this.f49000d = new com.withings.wiscale2.activity.workout.photo.ui.a(supportFragmentManager);
        View findViewById = findViewById(C1987R.id.photos_pager);
        u.i(findViewById, "findViewById(...)");
        ViewPager viewPager = (ViewPager) findViewById;
        this.f48999c = viewPager;
        com.withings.wiscale2.activity.workout.photo.ui.a aVar = this.f49000d;
        if (aVar != null) {
            viewPager.setAdapter(aVar);
            View findViewById2 = findViewById(C1987R.id.close_button);
            u.g(findViewById2);
            ay.b.m(findViewById2, true, false, 29);
            findViewById2.setOnClickListener(new f(this, 9));
            View findViewById3 = findViewById(C1987R.id.delete_button);
            u.g(findViewById3);
            ay.b.m(findViewById3, false, true, 23);
            findViewById3.setOnClickListener(new sg.g(this, 6));
            h hVar = (h) new k1(this, new b()).a(h.class);
            xw.d.c(this, hVar.i0(), new c());
            this.f49001e = hVar;
            return;
        }
        u.s("pagerAdapter");
        throw null;
    }
}
