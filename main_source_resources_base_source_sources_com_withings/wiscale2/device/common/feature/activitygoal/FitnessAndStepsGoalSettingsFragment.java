package com.withings.wiscale2.device.common.feature.activitygoal;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.l0;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.google.android.material.appbar.AppBarLayout;
import com.withings.measure.android.data.FitnessLevel;
import com.withings.wiscale2.C1987R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.q0;
import tb0.k1;
/* compiled from: FitnessAndStepsGoalSettingsFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/common/feature/activitygoal/FitnessAndStepsGoalSettingsFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FitnessAndStepsGoalSettingsFragment extends u {

    /* renamed from: l  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f50884l = {androidx.camera.core.v.c(FitnessAndStepsGoalSettingsFragment.class, "binding", "getBinding()Lcom/withings/wiscale2/databinding/FragmentActivityGoalSettingsBinding;", 0)};

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ int f50885m = 0;

    /* renamed from: h  reason: collision with root package name */
    private final r8.g f50886h;

    /* renamed from: i  reason: collision with root package name */
    private final LifecycleViewBindingProperty f50887i;

    /* renamed from: j  reason: collision with root package name */
    private com.withings.wiscale2.device.common.feature.activitygoal.a f50888j;
    @Inject

    /* renamed from: k  reason: collision with root package name */
    public com.withings.wiscale2.device.common.feature.activitygoal.d f50889k;

    /* compiled from: FitnessAndStepsGoalSettingsFragment.kt */
    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ sm0.a<FitnessLevel> f50890a = sm0.b.a(FitnessLevel.values());
    }

    /* compiled from: FitnessAndStepsGoalSettingsFragment.kt */
    /* loaded from: classes5.dex */
    static final class b implements l0, kotlin.jvm.internal.p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ym0.l f50891a;

        b(ym0.l lVar) {
            this.f50891a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof l0) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return kotlin.jvm.internal.u.e(this.f50891a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f50891a;
        }

        public final int hashCode() {
            return this.f50891a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f50891a.invoke(obj);
        }
    }

    /* compiled from: FragmentNavArgsLazy.kt */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.a<Bundle> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Fragment f50892a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Fragment fragment) {
            super(0);
            this.f50892a = fragment;
        }

        @Override // ym0.a
        public final Bundle invoke() {
            Fragment fragment = this.f50892a;
            Bundle arguments = fragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException(androidx.fragment.app.o.c("Fragment ", fragment, " has null arguments"));
        }
    }

    /* compiled from: FragmentViewBindings.kt */
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.l<FitnessAndStepsGoalSettingsFragment, k1> {
        @Override // ym0.l
        public final k1 invoke(FitnessAndStepsGoalSettingsFragment fitnessAndStepsGoalSettingsFragment) {
            FitnessAndStepsGoalSettingsFragment fragment = fitnessAndStepsGoalSettingsFragment;
            kotlin.jvm.internal.u.j(fragment, "fragment");
            return k1.a(fragment.requireView());
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [ym0.l, kotlin.jvm.internal.w] */
    public FitnessAndStepsGoalSettingsFragment() {
        super(C1987R.layout.fragment_activity_goal_settings);
        this.f50886h = new r8.g(q0.b(s.class), new c(this));
        this.f50887i = by.kirich1409.viewbindingdelegate.e.a(this, new kotlin.jvm.internal.w(1), u9.a.a());
    }

    public static final s s1(FitnessAndStepsGoalSettingsFragment fitnessAndStepsGoalSettingsFragment) {
        return (s) fitnessAndStepsGoalSettingsFragment.f50886h.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k1 v1() {
        return (k1) this.f50887i.getValue(this, f50884l[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.u.j(view, "view");
        super.onViewCreated(view, bundle);
        ay.b.n(view, false, true, 23);
        AppBarLayout appBarLayout = v1().f99263a;
        kotlin.jvm.internal.u.i(appBarLayout, "appBarLayout");
        ay.b.n(appBarLayout, true, false, 29);
        FragmentActivity requireActivity = requireActivity();
        kotlin.jvm.internal.u.h(requireActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        AppCompatActivity appCompatActivity = (AppCompatActivity) requireActivity;
        appCompatActivity.setSupportActionBar(v1().f99266d);
        ActionBar supportActionBar = appCompatActivity.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.q(true);
            supportActionBar.o(true);
        }
        com.withings.wiscale2.device.common.feature.activitygoal.a aVar = (com.withings.wiscale2.device.common.feature.activitygoal.a) new androidx.lifecycle.k1(this, new h(this)).a(com.withings.wiscale2.device.common.feature.activitygoal.a.class);
        aVar.k0().observe(getViewLifecycleOwner(), new b(new i(this)));
        aVar.j0().observe(getViewLifecycleOwner(), new b(new k(this)));
        aVar.m0().observe(getViewLifecycleOwner(), new b(new m(this)));
        this.f50888j = aVar;
        Button button = v1().f99264b;
        if (button != null) {
            button.setOnClickListener(new sg.f(this, 11));
        }
    }
}
