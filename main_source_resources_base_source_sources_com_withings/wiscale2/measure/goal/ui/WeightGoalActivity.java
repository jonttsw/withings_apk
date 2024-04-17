package com.withings.wiscale2.measure.goal.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.b0;
import androidx.core.view.l1;
import androidx.core.view.u0;
import androidx.core.view.z1;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m0;
import com.google.android.material.appbar.AppBarLayout;
import com.withings.partner.model.Partner;
import com.withings.target.WeightGoal;
import com.withings.target.data.LocalTargetRepository;
import com.withings.user.User;
import com.withings.util.log.Fail;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.food.ui.setup.FoodSetupActivity;
import javax.inject.Inject;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.joda.time.DateTime;
import tb0.k0;
import vh.m;
import vh.o;
import ym0.p;
/* loaded from: classes5.dex */
public class WeightGoalActivity extends com.withings.wiscale2.measure.goal.ui.b {

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ int f58383n = 0;
    @Inject

    /* renamed from: e  reason: collision with root package name */
    protected fy.i f58384e;

    /* renamed from: f  reason: collision with root package name */
    private User f58385f;

    /* renamed from: g  reason: collision with root package name */
    private double f58386g;

    /* renamed from: h  reason: collision with root package name */
    private double f58387h;

    /* renamed from: i  reason: collision with root package name */
    private WeightGoal f58388i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f58389j;

    /* renamed from: k  reason: collision with root package name */
    private k0 f58390k;

    /* renamed from: l  reason: collision with root package name */
    private WeightGoalTargetFragment f58391l;

    /* renamed from: m  reason: collision with root package name */
    private k f58392m;

    /* loaded from: classes5.dex */
    final class a extends pm.h<c> {
        a() {
        }

        @Override // vh.m.b
        public final void onResult(Object obj) {
            c cVar = (c) obj;
            if (cVar.f58396a != null && cVar.f58397b != null) {
                WeightGoalActivity.C3(WeightGoalActivity.this, cVar);
                return;
            }
            throw new IllegalStateException("User has no height or weight !");
        }
    }

    /* loaded from: classes5.dex */
    public static class b implements m<c> {

        /* renamed from: a  reason: collision with root package name */
        private final User f58394a;

        /* renamed from: b  reason: collision with root package name */
        private final fy.i f58395b;

        public b(User user, fy.i iVar) {
            this.f58394a = user;
            this.f58395b = iVar;
        }

        @Override // vh.m
        public final c call() throws Exception {
            double doubleValue;
            User user = this.f58394a;
            fy.i iVar = this.f58395b;
            ky.d b10 = iVar.b(user.q(), 4);
            ky.d b11 = iVar.b(user.q(), 1);
            c cVar = new c(0);
            if (b11 != null && b10 != null) {
                cVar.f58396a = Double.valueOf(ly.a.c(4, b10).f());
                cVar.f58397b = Double.valueOf(ly.a.c(1, b11).f());
                WeightGoal weightGoal = LocalTargetRepository.get().getWeightGoal(user.q());
                cVar.f58398c = weightGoal;
                if (weightGoal == null) {
                    double doubleValue2 = cVar.f58397b.doubleValue();
                    double doubleValue3 = cVar.f58396a.doubleValue();
                    double d11 = (doubleValue2 / doubleValue3) / doubleValue3;
                    double d12 = 18.5d;
                    if (d11 < 18.5d) {
                        doubleValue = cVar.f58396a.doubleValue();
                    } else {
                        d12 = 25.0d;
                        if (d11 > 25.0d) {
                            doubleValue = cVar.f58396a.doubleValue();
                        } else {
                            doubleValue = cVar.f58396a.doubleValue();
                            d12 = 21.75d;
                        }
                    }
                    cVar.f58398c = new WeightGoal(d12 * doubleValue * doubleValue, 0.3d);
                }
            }
            return cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        Double f58396a;

        /* renamed from: b  reason: collision with root package name */
        Double f58397b;

        /* renamed from: c  reason: collision with root package name */
        WeightGoal f58398c;

        /* synthetic */ c(int i11) {
            this();
        }

        private c() {
        }
    }

    public static /* synthetic */ z1 A3(WeightGoalActivity weightGoalActivity, View view, z1 z1Var) {
        weightGoalActivity.getClass();
        androidx.core.graphics.f f11 = z1Var.f(7);
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), f11.f12449d);
        AppBarLayout appBarLayout = weightGoalActivity.f58390k.f99257b;
        appBarLayout.setPadding(appBarLayout.getPaddingLeft(), f11.f12447b, weightGoalActivity.f58390k.f99257b.getPaddingRight(), weightGoalActivity.f58390k.f99257b.getPaddingBottom());
        return z1.f12712b;
    }

    public static void B3(final WeightGoalActivity weightGoalActivity) {
        Fragment X = weightGoalActivity.getSupportFragmentManager().X(C1987R.id.content);
        WeightGoalTargetFragment weightGoalTargetFragment = weightGoalActivity.f58391l;
        if (weightGoalTargetFragment != null && weightGoalTargetFragment == X) {
            weightGoalActivity.f58388i.setTarget(weightGoalTargetFragment.x1());
            if (weightGoalActivity.f58392m == null) {
                double d11 = weightGoalActivity.f58387h;
                WeightGoal weightGoal = weightGoalActivity.f58388i;
                k kVar = new k();
                Bundle bundle = new Bundle();
                bundle.putDouble("currentWeight", d11);
                bundle.putSerializable("weightGoal", weightGoal);
                kVar.setArguments(bundle);
                weightGoalActivity.f58392m = kVar;
            }
            m0 m11 = weightGoalActivity.getSupportFragmentManager().m();
            m11.m(C1987R.anim.in_from_right, C1987R.anim.out_to_left, 0, 0);
            m11.l(C1987R.id.content, weightGoalActivity.f58392m, "speed");
            m11.f();
            weightGoalActivity.f58390k.f99262g.setTitle(C1987R.string._GOAL_WEIGHT_TITLE2_);
            weightGoalActivity.f58390k.f99260e.setText(C1987R.string._SAVE_);
            return;
        }
        weightGoalActivity.f58388i.setSpeed(weightGoalActivity.f58392m.s1());
        weightGoalActivity.f58388i.setDate(DateTime.now());
        try {
            BuildersKt.runBlocking(Dispatchers.getIO(), new p() { // from class: com.withings.wiscale2.measure.goal.ui.g
                @Override // ym0.p
                public final Object invoke(Object obj, Object obj2) {
                    CoroutineScope coroutineScope = (CoroutineScope) obj;
                    return WeightGoalActivity.z3(WeightGoalActivity.this, (qm0.d) obj2);
                }
            });
        } catch (InterruptedException e11) {
            e11.printStackTrace();
        }
        if (weightGoalActivity.f58389j) {
            try {
                if (((Boolean) BuildersKt.runBlocking(Dispatchers.getIO(), new p() { // from class: com.withings.wiscale2.measure.goal.ui.h
                    @Override // ym0.p
                    public final Object invoke(Object obj, Object obj2) {
                        t10.e eVar;
                        CoroutineScope coroutineScope = (CoroutineScope) obj;
                        qm0.d<? super Boolean> dVar = (qm0.d) obj2;
                        int i11 = WeightGoalActivity.f58383n;
                        WeightGoalActivity weightGoalActivity2 = WeightGoalActivity.this;
                        weightGoalActivity2.getClass();
                        eVar = t10.e.f97966j;
                        if (eVar != null) {
                            return eVar.i(weightGoalActivity2, Partner.f43455m, dVar);
                        }
                        throw new IllegalArgumentException("you must call init before using get".toString());
                    }
                })).booleanValue()) {
                    weightGoalActivity.startActivity(FoodSetupActivity.createIntent(weightGoalActivity, true));
                }
            } catch (InterruptedException e12) {
                e12.printStackTrace();
            }
            Intent intent = new Intent();
            intent.putExtra("weightGoal", weightGoalActivity.f58388i);
            weightGoalActivity.setResult(-1, intent);
            weightGoalActivity.finish();
            return;
        }
        Intent intent2 = new Intent();
        intent2.putExtra("weightGoal", weightGoalActivity.f58388i);
        weightGoalActivity.setResult(-1, intent2);
        weightGoalActivity.finish();
    }

    static void C3(WeightGoalActivity weightGoalActivity, c cVar) {
        weightGoalActivity.getClass();
        weightGoalActivity.f58386g = cVar.f58396a.doubleValue();
        weightGoalActivity.f58387h = cVar.f58397b.doubleValue();
        weightGoalActivity.f58388i = cVar.f58398c;
        weightGoalActivity.F3(false);
    }

    public static Intent D3(Context context, User user) {
        Fail.h(user, "The User must be non null !");
        Intent intent = new Intent(context, WeightGoalActivity.class);
        intent.putExtra("EXTRA_USER", user);
        return intent;
    }

    private void E3() {
        this.f58390k.f99262g.setTitle(C1987R.string._GOAL_WEIGHT_TITLE_);
        this.f58390k.f99260e.setText(C1987R.string._NEXT_);
        Drawable drawable = androidx.core.content.a.getDrawable(this, C1987R.drawable.icon_medium_navigation_close);
        if (drawable != null) {
            drawable.setTint(getColor(C1987R.color.textPrimary));
        }
        this.f58390k.f99262g.setNavigationIcon(drawable);
    }

    private void F3(boolean z5) {
        if (this.f58391l == null) {
            double d11 = this.f58386g;
            double d12 = this.f58387h;
            WeightGoal weightGoal = this.f58388i;
            WeightGoalTargetFragment weightGoalTargetFragment = new WeightGoalTargetFragment();
            Bundle bundle = new Bundle();
            bundle.putDouble("currentHeight", d11);
            bundle.putDouble("currentWeight", d12);
            bundle.putSerializable("weightGoal", weightGoal);
            weightGoalTargetFragment.setArguments(bundle);
            this.f58391l = weightGoalTargetFragment;
        }
        m0 m11 = getSupportFragmentManager().m();
        if (z5) {
            m11.m(C1987R.anim.in_from_left, C1987R.anim.out_to_right, 0, 0);
        }
        m11.l(C1987R.id.content, this.f58391l, "target");
        m11.f();
        E3();
    }

    public static /* synthetic */ Object z3(WeightGoalActivity weightGoalActivity, qm0.d dVar) {
        weightGoalActivity.getClass();
        return LocalTargetRepository.get().saveWeightTarget(weightGoalActivity.f58385f.q(), weightGoalActivity.f58388i, dVar);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (getSupportFragmentManager().X(C1987R.id.content) == this.f58391l) {
            setResult(0);
            finish();
            return;
        }
        F3(true);
    }

    @Override // com.withings.wiscale2.measure.goal.ui.b, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l1.a(getWindow(), false);
        this.f58385f = (User) getIntent().getParcelableExtra("EXTRA_USER");
        this.f58389j = getIntent().getBooleanExtra("EXTRA_REDIRECT_TO_MFP", false);
        if (this.f58385f == null) {
            this.f58385f = m70.i.b().f();
        }
        if (this.f58385f == null) {
            finish();
            return;
        }
        k0 b10 = k0.b(getLayoutInflater());
        this.f58390k = b10;
        setContentView(b10.a());
        u0.p0(this.f58390k.a(), new b0() { // from class: com.withings.wiscale2.measure.goal.ui.f
            @Override // androidx.core.view.b0
            public final z1 a(View view, z1 z1Var) {
                return WeightGoalActivity.A3(WeightGoalActivity.this, view, z1Var);
            }
        });
        setSupportActionBar(this.f58390k.f99262g);
        this.f58390k.f99259d.setVisibility(8);
        this.f58390k.f99260e.setText(C1987R.string._NEXT_);
        this.f58390k.f99260e.setOnClickListener(new vn.d(this, 12));
        FrameLayout frameLayout = this.f58390k.f99258c;
        frameLayout.removeView(frameLayout.findViewById(C1987R.id.setValue));
    }

    @Override // com.withings.wiscale2.measure.goal.ui.b, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected final void onDestroy() {
        vh.h.b(this);
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            setResult(0);
            finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        if (bundle == null) {
            o c11 = vh.h.h().c(new b(this.f58385f, this.f58384e));
            c11.q(new a());
            c11.p(this);
            E3();
            return;
        }
        this.f58391l = (WeightGoalTargetFragment) getSupportFragmentManager().Y("target");
        k kVar = (k) getSupportFragmentManager().Y("speed");
        this.f58392m = kVar;
        if (kVar != null) {
            this.f58390k.f99262g.setTitle(C1987R.string._GOAL_WEIGHT_TITLE2_);
            this.f58390k.f99260e.setText(C1987R.string._SAVE_);
            return;
        }
        E3();
    }

    @Override // android.app.Activity
    protected final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f58387h = bundle.getDouble("currentWeight");
        this.f58388i = (WeightGoal) bundle.getSerializable("weightGoal");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putDouble("currentWeight", this.f58387h);
        bundle.putSerializable("weightGoal", this.f58388i);
    }
}
