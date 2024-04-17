package com.withings.wiscale2.measure.goal.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.safetynet.SafetyNetStatusCodes;
import com.withings.android.activity.WithingsActivity;
import com.withings.core.data.aggregate.ActivityAggregateManager;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.measure.android.data.FitnessLevel;
import com.withings.network.android.interceptors.LogInterceptor;
import com.withings.target.data.LocalTargetRepository;
import com.withings.target.data.TargetRepository;
import com.withings.user.User;
import com.withings.views.view.SetValueView;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.b3;
import com.withings.wiscale2.device.common.feature.activitygoal.b0;
import java.text.NumberFormat;
import java.util.concurrent.CancellationException;
import jm.a;
import kotlinx.coroutines.Job;
import l70.u;
import vh.m;
import vh.o;
/* loaded from: classes5.dex */
public class StepGoalActivity extends WithingsActivity implements SetValueView.a {

    /* renamed from: a  reason: collision with root package name */
    private Job f58364a;

    /* renamed from: b  reason: collision with root package name */
    private Button f58365b;

    /* renamed from: c  reason: collision with root package name */
    private Button f58366c;

    /* renamed from: d  reason: collision with root package name */
    SetValueView f58367d;

    /* renamed from: e  reason: collision with root package name */
    private View f58368e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f58369f;

    /* renamed from: g  reason: collision with root package name */
    private ViewGroup f58370g;

    /* renamed from: h  reason: collision with root package name */
    private View f58371h;

    /* renamed from: i  reason: collision with root package name */
    private View f58372i;

    /* renamed from: j  reason: collision with root package name */
    private int f58373j;

    /* renamed from: k  reason: collision with root package name */
    private int f58374k;

    /* renamed from: l  reason: collision with root package name */
    private int f58375l;

    /* renamed from: m  reason: collision with root package name */
    private User f58376m;

    /* renamed from: n  reason: collision with root package name */
    private final m70.i f58377n = m70.i.b();

    /* renamed from: o  reason: collision with root package name */
    private final TargetRepository f58378o = LocalTargetRepository.get();

    /* renamed from: p  reason: collision with root package name */
    private final ActivityAggregateManager f58379p = ActivityAggregateManager.get();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f58380a;

        /* renamed from: b  reason: collision with root package name */
        public int f58381b;

        /* renamed from: c  reason: collision with root package name */
        public int f58382c;

        /* synthetic */ a(int i11) {
            this();
        }

        private a() {
        }
    }

    public static /* synthetic */ a A3(StepGoalActivity stepGoalActivity, User user) {
        stepGoalActivity.getClass();
        a aVar = new a(0);
        aVar.f58380a = stepGoalActivity.f58378o.getLastActiveStepsTargetOrDefault(user.q()).getAsInt();
        ActivityAggregateManager activityAggregateManager = stepGoalActivity.f58379p;
        aVar.f58381b = activityAggregateManager.getMaxSteps(user);
        aVar.f58382c = activityAggregateManager.getAverageSteps(user);
        return aVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.withings.wiscale2.measure.goal.ui.d] */
    public static void B3(final StepGoalActivity stepGoalActivity) {
        stepGoalActivity.f58364a = b3.a(stepGoalActivity.f58378o, stepGoalActivity.f58376m, stepGoalActivity.f58373j, new ym0.a() { // from class: com.withings.wiscale2.measure.goal.ui.d
            @Override // ym0.a
            public final Object invoke() {
                StepGoalActivity.z3(StepGoalActivity.this);
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void G3(StepGoalActivity stepGoalActivity) {
        SetValueView setValueView = stepGoalActivity.f58367d;
        if (setValueView != null) {
            setValueView.setValue(stepGoalActivity.f58373j);
            stepGoalActivity.f58367d.o(stepGoalActivity.f58368e, stepGoalActivity.f58373j);
            View view = stepGoalActivity.f58371h;
            if (view != null) {
                stepGoalActivity.f58367d.o(view, stepGoalActivity.f58374k);
            }
            View view2 = stepGoalActivity.f58372i;
            if (view2 != null) {
                stepGoalActivity.f58367d.o(view2, stepGoalActivity.f58375l);
            }
        }
        stepGoalActivity.E2(stepGoalActivity.f58373j);
    }

    private void H3(String str, float f11) {
        TextView textView = new TextView(this);
        textView.setText(str);
        xq.a.a(textView, C1987R.style.detail1);
        textView.setGravity(8388613);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.rightMargin = getResources().getDimensionPixelSize(C1987R.dimen.keyline_1);
        textView.setLayoutParams(marginLayoutParams);
        this.f58367d.f(textView, f11);
    }

    public static Intent I3(Context context, User user) {
        Intent intent = new Intent(context, StepGoalActivity.class);
        intent.putExtra(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, user);
        return intent;
    }

    public static Intent J3(Context context, User user, int i11) {
        int i12;
        if (i11 == FitnessLevel.f41674h.e()) {
            i12 = SafetyNetStatusCodes.SAFE_BROWSING_UNSUPPORTED_THREAT_TYPES;
        } else {
            i12 = 10000;
        }
        Intent I3 = I3(context, user);
        I3.putExtra("goal", i12);
        return I3;
    }

    public static /* synthetic */ void z3(StepGoalActivity stepGoalActivity) {
        stepGoalActivity.getClass();
        Intent intent = new Intent();
        intent.putExtra("goal", stepGoalActivity.f58373j);
        stepGoalActivity.setResult(-1, intent);
        stepGoalActivity.finish();
    }

    @Override // com.withings.views.view.SetValueView.a
    public final void E2(float f11) {
        int round = Math.round((int) (f11 / 1000.0f)) * 1000;
        this.f58373j = round;
        int b10 = b0.b(this.f58367d, round);
        this.f58369f.setText(NumberFormat.getInstance().format(round));
        this.f58370g.getBackground().setColorFilter(new PorterDuffColorFilter(b10, PorterDuff.Mode.SRC_IN));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().hasExtra(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT)) {
            this.f58376m = (User) getIntent().getParcelableExtra(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT);
            this.f58373j = getIntent().getIntExtra("goal", 0);
        }
        User user = this.f58376m;
        m70.i iVar = this.f58377n;
        if (user == null || iVar.i(user.q()) == null) {
            this.f58376m = iVar.f();
        }
        if (this.f58376m == null) {
            finish();
            return;
        }
        setContentView(C1987R.layout.activity_set_goal);
        Toolbar toolbar = (Toolbar) findViewById(C1987R.id.toolbar);
        this.f58365b = (Button) findViewById(C1987R.id.save);
        this.f58366c = (Button) findViewById(C1987R.id.remove);
        this.f58367d = (SetValueView) findViewById(C1987R.id.setValue);
        setSupportActionBar(toolbar);
        Drawable drawable = androidx.core.content.a.getDrawable(this, C1987R.drawable.icon_medium_navigation_close);
        if (drawable != null) {
            drawable.setTint(getColor(C1987R.color.textPrimary));
        }
        toolbar.setNavigationIcon(drawable);
        this.f58367d.setVisibility(0);
        this.f58367d.setListener(this);
        this.f58367d.setScaleHeight(LogInterceptor.LOG_CHUNK_SIZE);
        this.f58367d.m(3000.0f, 15000.0f);
        int k11 = ah.g.k(72, this);
        this.f58367d.n(k11, k11);
        View inflate = getLayoutInflater().inflate(C1987R.layout.view_set_goal_tutorial, (ViewGroup) this.f58367d, false);
        this.f58368e = inflate;
        ((TextView) inflate.findViewById(C1987R.id.text)).setText(C1987R.string._GOAL_STEP_TUTORIAL_DESCRIPTION_);
        this.f58367d.h(this.f58368e, this.f58373j);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.leftMargin = getResources().getDimensionPixelSize(C1987R.dimen.keyline_1);
        marginLayoutParams.bottomMargin = (int) TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics());
        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams2.leftMargin = getResources().getDimensionPixelSize(C1987R.dimen.keyline_1);
        marginLayoutParams2.topMargin = (int) TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics());
        u g11 = a.d.a(this).g(31);
        for (float f11 = 3000.0f; f11 <= 15000.0f; f11 += 1000.0f) {
            TextView textView = new TextView(this);
            textView.setText(NumberFormat.getNumberInstance().format((int) f11));
            xq.a.a(textView, C1987R.style.header4);
            textView.setLayoutParams(marginLayoutParams);
            this.f58367d.e(textView, f11);
            TextView textView2 = new TextView(this);
            textView2.setText(g11.g(this, 0.8f * f11, null).toString());
            xq.a.a(textView2, C1987R.style.body1);
            textView2.setLayoutParams(marginLayoutParams2);
            this.f58367d.f(textView2, f11);
        }
        View inflate2 = getLayoutInflater().inflate(C1987R.layout.view_step_goal_threshold, (ViewGroup) this.f58367d, false);
        this.f58371h = inflate2;
        ((TextView) inflate2.findViewById(C1987R.id.threshold)).setText(C1987R.string._GOAL_STEP_YOUR_BEST_);
        this.f58367d.f(this.f58371h, this.f58374k);
        View inflate3 = getLayoutInflater().inflate(C1987R.layout.view_step_goal_threshold, (ViewGroup) this.f58367d, false);
        this.f58372i = inflate3;
        ((TextView) inflate3.findViewById(C1987R.id.threshold)).setText(C1987R.string._GOAL_STEP_YOUR_AVERAGE_);
        this.f58367d.f(this.f58372i, this.f58375l);
        H3(getString(C1987R.string._GOAL_STEP_14000_VALUE_), 14000.0f);
        H3(getString(C1987R.string._GOAL_STEP_13000_VALUE_), 13000.0f);
        H3(getString(C1987R.string._GOAL_STEP_11000_VALUE_), 11000.0f);
        H3(getString(C1987R.string._GOAL_STEP_10000_VALUE_), 10000.0f);
        H3(getString(C1987R.string._GOAL_STEP_6000_VALUE_), 6000.0f);
        H3(getString(C1987R.string._GOAL_STEP_5000_VALUE_), 5000.0f);
        H3(getString(C1987R.string._GOAL_STEP_3000_VALUE_), 3000.0f);
        ViewGroup viewGroup = (ViewGroup) getLayoutInflater().inflate(C1987R.layout.view_circle_value, (ViewGroup) this.f58367d, false);
        this.f58370g = viewGroup;
        TextView textView3 = (TextView) viewGroup.findViewById(C1987R.id.value);
        this.f58369f = textView3;
        textView3.setTextColor(-1);
        this.f58367d.setValueView(this.f58370g);
        this.f58366c.setVisibility(8);
        this.f58365b.setText(C1987R.string._OK_);
        this.f58365b.setOnClickListener(new gi.e(this, 9));
        if (bundle == null) {
            this.f58367d.setValue(this.f58373j);
        }
        E2(this.f58367d.getValue());
        final User user2 = this.f58376m;
        vh.h.b(this);
        o c11 = vh.h.h().c(new m() { // from class: com.withings.wiscale2.measure.goal.ui.c
            @Override // vh.m
            public final Object call() {
                return StepGoalActivity.A3(StepGoalActivity.this, user2);
            }
        });
        c11.q(new e(this));
        c11.p(this);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            finish();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        Job job = this.f58364a;
        if (job != null && job.isActive() && !this.f58364a.isCompleted()) {
            this.f58364a.cancel(new CancellationException("onStop"));
        }
        vh.h.b(this);
    }

    @Override // com.withings.views.view.SetValueView.a
    public final void u() {
    }
}
