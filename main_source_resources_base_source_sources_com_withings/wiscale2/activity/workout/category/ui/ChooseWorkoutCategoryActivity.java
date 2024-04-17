package com.withings.wiscale2.activity.workout.category.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.camera.core.v;
import androidx.core.view.l1;
import androidx.lifecycle.h1;
import androidx.lifecycle.k1;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import com.withings.workout.category.model.WorkoutCategory;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import nm0.y;
import ya0.a;
/* compiled from: ChooseWorkoutCategoryActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/withings/wiscale2/activity/workout/category/ui/ChooseWorkoutCategoryActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lya0/a$b;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ChooseWorkoutCategoryActivity extends Hilt_ChooseWorkoutCategoryActivity implements a.b {

    /* renamed from: e  reason: collision with root package name */
    private final c f48657e = new c(this);

    /* renamed from: f  reason: collision with root package name */
    private final d f48658f = new d(this);

    /* renamed from: g  reason: collision with root package name */
    private com.withings.wiscale2.activity.workout.category.ui.b f48659g;
    @Inject

    /* renamed from: h  reason: collision with root package name */
    public g f48660h;

    /* renamed from: j  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f48656j = {v.c(ChooseWorkoutCategoryActivity.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0), v.c(ChooseWorkoutCategoryActivity.class, "shouldShowWorkoutLaunchType", "getShouldShowWorkoutLaunchType()Z", 0)};

    /* renamed from: i  reason: collision with root package name */
    public static final a f48655i = new Object();

    /* compiled from: ChooseWorkoutCategoryActivity.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public static Intent a(Context context, User user, boolean z5, Integer num) {
            u.j(context, "context");
            u.j(user, "user");
            Intent putExtra = new Intent(context, ChooseWorkoutCategoryActivity.class).putExtra(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, user).putExtra("show_type_workout_launch", z5).putExtra("result_category", num);
            u.i(putExtra, "putExtra(...)");
            return putExtra;
        }
    }

    /* compiled from: ChooseWorkoutCategoryActivity.kt */
    /* loaded from: classes4.dex */
    static final class b extends w implements ym0.p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f48662b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i11) {
            super(2);
            this.f48662b = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                ChooseWorkoutCategoryActivity chooseWorkoutCategoryActivity = ChooseWorkoutCategoryActivity.this;
                com.withings.wiscale2.activity.workout.category.ui.b bVar = chooseWorkoutCategoryActivity.f48659g;
                if (bVar != null) {
                    List list = (List) t1.d.a(bVar.m0(), aVar2).getValue();
                    if (list != null) {
                        yk.o.b(false, s1.b.b(aVar2, 1014421447, new l(chooseWorkoutCategoryActivity, this.f48662b, list)), aVar2, 48, 1);
                    }
                } else {
                    u.s("viewModel");
                    throw null;
                }
            }
            return y.f85009a;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class c implements bn0.d<Activity, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f48663a = nm0.h.b(new m(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f48664b;

        public c(Activity activity) {
            this.f48664b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f48663a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class d implements bn0.d<Activity, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f48665a = nm0.h.b(new n(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f48666b;

        public d(Activity activity) {
            this.f48666b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Boolean, java.lang.Object] */
        @Override // bn0.d
        public final Boolean getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f48665a.getValue();
        }
    }

    public static final void B3(ChooseWorkoutCategoryActivity chooseWorkoutCategoryActivity, WorkoutCategory workoutCategory) {
        if (((Boolean) chooseWorkoutCategoryActivity.f48658f.getValue(chooseWorkoutCategoryActivity, f48656j[1])).booleanValue()) {
            ya0.a.f108707h.getClass();
            u.j(workoutCategory, "workoutCategory");
            ya0.a aVar = new ya0.a();
            aVar.setArguments(androidx.core.os.e.a(new nm0.j("workoutCategory", workoutCategory)));
            aVar.show(chooseWorkoutCategoryActivity.getSupportFragmentManager(), ya0.a.class.getSimpleName());
            return;
        }
        Intent putExtra = new Intent().putExtra("result_category", workoutCategory);
        u.i(putExtra, "putExtra(...)");
        chooseWorkoutCategoryActivity.setResult(-1, putExtra);
        chooseWorkoutCategoryActivity.finish();
    }

    public static final User z3(ChooseWorkoutCategoryActivity chooseWorkoutCategoryActivity) {
        return (User) chooseWorkoutCategoryActivity.f48657e.getValue(chooseWorkoutCategoryActivity, f48656j[0]);
    }

    @Override // ya0.a.b
    public final void a1(ya0.a activityTypeSheet, WorkoutCategory workoutCategory) {
        u.j(activityTypeSheet, "activityTypeSheet");
        u.j(workoutCategory, "workoutCategory");
        Intent putExtra = new Intent().putExtra("result_category", workoutCategory);
        u.i(putExtra, "putExtra(...)");
        setResult(-1, putExtra);
        finish();
    }

    @Override // ya0.a.b
    public final void m0(ya0.a activityTypeSheet, WorkoutCategory workoutCategory) {
        u.j(activityTypeSheet, "activityTypeSheet");
        u.j(workoutCategory, "workoutCategory");
        com.withings.wiscale2.activity.workout.category.ui.b bVar = this.f48659g;
        if (bVar != null) {
            BuildersKt__Builders_commonKt.launch$default(h1.a(bVar), Dispatchers.getIO(), null, new com.withings.wiscale2.activity.workout.category.ui.d(workoutCategory, bVar, null), 2, null);
        } else {
            u.s("viewModel");
            throw null;
        }
    }

    @Override // com.withings.wiscale2.activity.workout.category.ui.Hilt_ChooseWorkoutCategoryActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        Integer num;
        int i11;
        super.onCreate(bundle);
        l1.a(getWindow(), false);
        Bundle extras = getIntent().getExtras();
        Integer num2 = null;
        if (extras != null) {
            num = Integer.valueOf(extras.getInt("result_category", -1));
        } else {
            num = null;
        }
        if (num == null || num.intValue() != -1) {
            num2 = num;
        }
        if (num2 != null) {
            i11 = C1987R.string._EDIT_;
        } else {
            i11 = C1987R.string._NEW_ACTIVITY_;
        }
        com.withings.wiscale2.activity.workout.category.ui.b bVar = (com.withings.wiscale2.activity.workout.category.ui.b) new k1(this, new h(this)).a(com.withings.wiscale2.activity.workout.category.ui.b.class);
        xw.d.c(this, bVar.k0(), new i(this));
        this.f48659g = bVar;
        e.k.a(this, new s1.a(true, -1917076002, new b(i11)));
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        u.j(item, "item");
        if (item.getItemId() == 16908332) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
