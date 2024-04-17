package com.withings.wiscale2.activity.workout.goal.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.k1;
import androidx.lifecycle.l0;
import com.withings.android.activity.WithingsActivity;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.target.Target;
import com.withings.user.User;
import com.withings.views.view.SetValueView;
import com.withings.wiscale2.C1987R;
import java.text.NumberFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import m0.t;
import nm0.g;
import nm0.h;
import org.joda.time.DateTime;
import tb0.e4;
import tb0.h4;
import tb0.k0;
import ym0.l;
/* compiled from: WorkoutGoalActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/activity/workout/goal/ui/WorkoutGoalActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class WorkoutGoalActivity extends WithingsActivity {

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ int f48710g = 0;

    /* renamed from: a  reason: collision with root package name */
    private final g f48711a;

    /* renamed from: b  reason: collision with root package name */
    private final g f48712b;

    /* renamed from: c  reason: collision with root package name */
    private ma0.e f48713c;

    /* renamed from: d  reason: collision with root package name */
    private k0 f48714d;

    /* renamed from: e  reason: collision with root package name */
    private final g f48715e;

    /* renamed from: f  reason: collision with root package name */
    private final g f48716f;

    /* compiled from: WorkoutGoalActivity.kt */
    /* loaded from: classes4.dex */
    public static final class a {
        public static Intent a(long j5, Context context, User user) {
            u.j(context, "context");
            u.j(user, "user");
            Intent putExtra = new Intent(context, WorkoutGoalActivity.class).putExtra("EXTRA_CATEGORY", j5).putExtra(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, user);
            u.i(putExtra, "putExtra(...)");
            return putExtra;
        }
    }

    /* compiled from: WorkoutGoalActivity.kt */
    /* loaded from: classes4.dex */
    static final class b extends w implements ym0.a<Integer> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final Integer invoke() {
            return Integer.valueOf((int) WorkoutGoalActivity.this.getIntent().getLongExtra("EXTRA_CATEGORY", 0L));
        }
    }

    /* compiled from: WorkoutGoalActivity.kt */
    /* loaded from: classes4.dex */
    static final class c implements l0, p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f48718a;

        c(l lVar) {
            this.f48718a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof l0) || !(obj instanceof p)) {
                return false;
            }
            return u.e(this.f48718a, ((p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f48718a;
        }

        public final int hashCode() {
            return this.f48718a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f48718a.invoke(obj);
        }
    }

    /* compiled from: WorkoutGoalActivity.kt */
    /* loaded from: classes4.dex */
    static final class d extends w implements ym0.a<h4> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final h4 invoke() {
            WorkoutGoalActivity workoutGoalActivity = WorkoutGoalActivity.this;
            LayoutInflater from = LayoutInflater.from(workoutGoalActivity);
            k0 k0Var = workoutGoalActivity.f48714d;
            if (k0Var != null) {
                return h4.b(from, k0Var.f99261f);
            }
            u.s("binding");
            throw null;
        }
    }

    /* compiled from: WorkoutGoalActivity.kt */
    /* loaded from: classes4.dex */
    static final class e extends w implements ym0.a<User> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final User invoke() {
            Parcelable parcelableExtra = WorkoutGoalActivity.this.getIntent().getParcelableExtra(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT);
            u.h(parcelableExtra, "null cannot be cast to non-null type com.withings.user.User");
            return (User) parcelableExtra;
        }
    }

    /* compiled from: WorkoutGoalActivity.kt */
    /* loaded from: classes4.dex */
    static final class f extends w implements ym0.a<e4> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final e4 invoke() {
            WorkoutGoalActivity workoutGoalActivity = WorkoutGoalActivity.this;
            LayoutInflater from = LayoutInflater.from(workoutGoalActivity);
            k0 k0Var = workoutGoalActivity.f48714d;
            if (k0Var != null) {
                return e4.b(from, k0Var.f99261f);
            }
            u.s("binding");
            throw null;
        }
    }

    public WorkoutGoalActivity() {
        super(C1987R.layout.activity_set_goal);
        this.f48711a = h.b(new b());
        this.f48712b = h.b(new e());
        this.f48715e = h.b(new d());
        this.f48716f = h.b(new f());
    }

    public static void A3(WorkoutGoalActivity this$0) {
        u.j(this$0, "this$0");
        ma0.e eVar = this$0.f48713c;
        if (eVar != null) {
            eVar.p0(0);
        } else {
            u.s("viewModel");
            throw null;
        }
    }

    public static final void B3(WorkoutGoalActivity workoutGoalActivity, String str) {
        int dimensionPixelSize = workoutGoalActivity.getResources().getDimensionPixelSize(C1987R.dimen.keyline_3);
        TextView textView = new TextView(workoutGoalActivity);
        textView.setText(workoutGoalActivity.getString(C1987R.string._GOAL_ACTIVITY__s_TUTORIAL_TITLE_, str));
        textView.setGravity(17);
        xq.a.a(textView, C1987R.style.header4);
        textView.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        textView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        k0 k0Var = workoutGoalActivity.f48714d;
        if (k0Var != null) {
            k0Var.f99261f.g(textView);
        } else {
            u.s("binding");
            throw null;
        }
    }

    public static final void C3(WorkoutGoalActivity workoutGoalActivity, String str, int i11) {
        ((h4) workoutGoalActivity.f48715e.getValue()).f99154b.setText(workoutGoalActivity.getString(C1987R.string._GOAL_ACTIVITY__s_TUTORIAL_DESCRIPTION_, str));
        k0 k0Var = workoutGoalActivity.f48714d;
        if (k0Var != null) {
            k0Var.f99261f.h(((h4) workoutGoalActivity.f48715e.getValue()).a(), i11);
            return;
        }
        u.s("binding");
        throw null;
    }

    public static final int E3(WorkoutGoalActivity workoutGoalActivity) {
        return ((Number) workoutGoalActivity.f48711a.getValue()).intValue();
    }

    public static final User F3(WorkoutGoalActivity workoutGoalActivity) {
        return (User) workoutGoalActivity.f48712b.getValue();
    }

    public static final e4 G3(WorkoutGoalActivity workoutGoalActivity) {
        return (e4) workoutGoalActivity.f48716f.getValue();
    }

    public static final void I3(WorkoutGoalActivity workoutGoalActivity, int i11) {
        DateTime dateTime;
        workoutGoalActivity.getClass();
        BuildersKt__Builders_commonKt.launch$default(t.l(workoutGoalActivity), null, null, new com.withings.wiscale2.activity.workout.goal.ui.c(workoutGoalActivity, i11, null), 3, null);
        if (i11 != 0) {
            Toast.makeText(workoutGoalActivity, (int) C1987R.string._GOAL_SET_FOR_CURRENT_WEEK_, 0).show();
        }
        DateTime now = DateTime.now();
        int intValue = ((Number) workoutGoalActivity.f48711a.getValue()).intValue();
        if (i11 == 0) {
            dateTime = now;
        } else {
            dateTime = null;
        }
        u.g(now);
        workoutGoalActivity.setResult(-1, new Intent().putExtra("EXTRA_GOAL", new Target(null, null, 0L, 0, intValue, 0, i11, 0, true, dateTime, now, now, now, false, null, 24751, null)));
        workoutGoalActivity.finish();
    }

    public static final void J3(WorkoutGoalActivity workoutGoalActivity, int i11) {
        k0 k0Var = workoutGoalActivity.f48714d;
        if (k0Var != null) {
            k0Var.f99261f.setVisibility(0);
            k0 k0Var2 = workoutGoalActivity.f48714d;
            if (k0Var2 != null) {
                float f11 = i11;
                k0Var2.f99261f.setValue(f11);
                k0 k0Var3 = workoutGoalActivity.f48714d;
                if (k0Var3 != null) {
                    k0Var3.f99261f.o(((h4) workoutGoalActivity.f48715e.getValue()).a(), f11);
                    e4 e4Var = (e4) workoutGoalActivity.f48716f.getValue();
                    u.i(e4Var, "<get-valueBinding>(...)");
                    workoutGoalActivity.M3(e4Var, i11);
                    return;
                }
                u.s("binding");
                throw null;
            }
            u.s("binding");
            throw null;
        }
        u.s("binding");
        throw null;
    }

    private final void L3(String str, float f11) {
        TextView textView = new TextView(this);
        textView.setText(str);
        xq.a.a(textView, C1987R.style.detail1);
        textView.setGravity(8388611);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(ah.g.k(90, this), -2);
        marginLayoutParams.rightMargin = textView.getResources().getDimensionPixelSize(C1987R.dimen.basic4);
        textView.setLayoutParams(marginLayoutParams);
        k0 k0Var = this.f48714d;
        if (k0Var != null) {
            k0Var.f99261f.f(textView, f11);
        } else {
            u.s("binding");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M3(e4 e4Var, int i11) {
        String format = NumberFormat.getInstance().format(i11);
        TextView value = e4Var.f99052b;
        value.setText(format);
        u.i(value, "value");
        int applyDimension = (int) TypedValue.applyDimension(1, (int) ((((i11 - 0.0f) / 7.0f) * 50) + 70), getResources().getDisplayMetrics());
        if (applyDimension != value.getLayoutParams().width) {
            value.getLayoutParams().width = applyDimension;
            value.getLayoutParams().height = applyDimension;
            value.requestLayout();
        }
    }

    public static void z3(WorkoutGoalActivity this$0) {
        u.j(this$0, "this$0");
        k0 k0Var = this$0.f48714d;
        if (k0Var != null) {
            int b10 = an0.a.b(k0Var.f99261f.getValue() / 1);
            ma0.e eVar = this$0.f48713c;
            if (eVar != null) {
                eVar.p0(b10);
                return;
            } else {
                u.s("viewModel");
                throw null;
            }
        }
        u.s("binding");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        k0 b10 = k0.b(getLayoutInflater());
        this.f48714d = b10;
        setContentView(b10.a());
        k0 k0Var = this.f48714d;
        if (k0Var != null) {
            setSupportActionBar(k0Var.f99262g);
            int w11 = ah.u.w(C1987R.attr.colorOnSurface, this, -65281);
            k0 k0Var2 = this.f48714d;
            if (k0Var2 != null) {
                k0Var2.f99262g.setNavigationIcon(y70.a.c(C1987R.drawable.icon_medium_navigation_close, this, w11));
                g gVar = this.f48716f;
                ((e4) gVar.getValue()).f99052b.setTextColor(-1);
                ((e4) gVar.getValue()).a().getBackground().setColorFilter(new PorterDuffColorFilter(getColor(C1987R.color.statusInfo), PorterDuff.Mode.SRC_IN));
                int k11 = ah.g.k(72, this);
                k0 k0Var3 = this.f48714d;
                if (k0Var3 != null) {
                    ConstraintLayout a11 = ((e4) gVar.getValue()).a();
                    SetValueView setValueView = k0Var3.f99261f;
                    setValueView.setValueView(a11);
                    setValueView.setScaleHeight(3000);
                    setValueView.m(0.0f, 7.0f);
                    setValueView.n(k11, k11);
                    setValueView.setListener(new com.withings.wiscale2.activity.workout.goal.ui.d(this));
                    String string = getString(C1987R.string._GOAL_ACTIVITY_0_SESSIONS_);
                    u.i(string, "getString(...)");
                    L3(string, 0.0f);
                    String string2 = getString(C1987R.string._GOAL_ACTIVITY_1_SESSIONS_);
                    u.i(string2, "getString(...)");
                    L3(string2, 1.0f);
                    String string3 = getString(C1987R.string._GOAL_ACTIVITY_2_SESSIONS_);
                    u.i(string3, "getString(...)");
                    L3(string3, 2.0f);
                    String string4 = getString(C1987R.string._GOAL_ACTIVITY_3_SESSIONS_);
                    u.i(string4, "getString(...)");
                    L3(string4, 3.0f);
                    String string5 = getString(C1987R.string._GOAL_ACTIVITY_4_SESSIONS_);
                    u.i(string5, "getString(...)");
                    L3(string5, 4.0f);
                    String string6 = getString(C1987R.string._GOAL_ACTIVITY_5_SESSIONS_);
                    u.i(string6, "getString(...)");
                    L3(string6, 5.0f);
                    String string7 = getString(C1987R.string._GOAL_ACTIVITY_6_SESSIONS_);
                    u.i(string7, "getString(...)");
                    L3(string7, 6.0f);
                    String string8 = getString(C1987R.string._GOAL_ACTIVITY_7_SESSIONS_);
                    u.i(string8, "getString(...)");
                    L3(string8, 7.0f);
                    k0 k0Var4 = this.f48714d;
                    if (k0Var4 != null) {
                        k0Var4.f99259d.setVisibility(0);
                        k0 k0Var5 = this.f48714d;
                        if (k0Var5 != null) {
                            k0Var5.f99259d.setOnClickListener(new gi.e(this, 4));
                            k0 k0Var6 = this.f48714d;
                            if (k0Var6 != null) {
                                k0Var6.f99260e.setOnClickListener(new gi.f(this, 9));
                                ma0.e eVar = (ma0.e) new k1(this, new ma0.a(this)).a(ma0.e.class);
                                eVar.g0().observe(this, new c(new com.withings.wiscale2.activity.workout.goal.ui.a(this)));
                                this.f48713c = eVar;
                                BuildersKt__Builders_commonKt.launch$default(t.l(this), null, null, new com.withings.wiscale2.activity.workout.goal.ui.b(this, null), 3, null);
                                return;
                            }
                            u.s("binding");
                            throw null;
                        }
                        u.s("binding");
                        throw null;
                    }
                    u.s("binding");
                    throw null;
                }
                u.s("binding");
                throw null;
            }
            u.s("binding");
            throw null;
        }
        u.s("binding");
        throw null;
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
