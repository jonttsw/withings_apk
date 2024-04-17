package com.withings.wiscale2.device.common.feature.activitygoal;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.appbar.AppBarLayout;
import com.withings.device.Device;
import com.withings.device.DevicePictures;
import com.withings.devicesetup.ui.LottieData;
import com.withings.wiscale2.C1987R;
import ga.f;
import kotlin.Metadata;
import kotlin.jvm.internal.q0;
import tb0.j1;
/* compiled from: FitnessAndStepsGoalIntroFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/common/feature/activitygoal/FitnessAndStepsGoalIntroFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class FitnessAndStepsGoalIntroFragment extends Fragment {

    /* renamed from: e  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f50879e = {androidx.camera.core.v.c(FitnessAndStepsGoalIntroFragment.class, "binding", "getBinding()Lcom/withings/wiscale2/databinding/FragmentActivityGoalIntroBinding;", 0)};

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f50880f = 0;

    /* renamed from: c  reason: collision with root package name */
    private final r8.g f50881c;

    /* renamed from: d  reason: collision with root package name */
    private final LifecycleViewBindingProperty f50882d;

    /* compiled from: FragmentNavArgsLazy.kt */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.a<Bundle> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Fragment f50883a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
            super(0);
            this.f50883a = fragment;
        }

        @Override // ym0.a
        public final Bundle invoke() {
            Fragment fragment = this.f50883a;
            Bundle arguments = fragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException(androidx.fragment.app.o.c("Fragment ", fragment, " has null arguments"));
        }
    }

    /* compiled from: FragmentViewBindings.kt */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.l<FitnessAndStepsGoalIntroFragment, j1> {
        @Override // ym0.l
        public final j1 invoke(FitnessAndStepsGoalIntroFragment fitnessAndStepsGoalIntroFragment) {
            FitnessAndStepsGoalIntroFragment fragment = fitnessAndStepsGoalIntroFragment;
            kotlin.jvm.internal.u.j(fragment, "fragment");
            return j1.a(fragment.requireView());
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [ym0.l, kotlin.jvm.internal.w] */
    public FitnessAndStepsGoalIntroFragment() {
        super(C1987R.layout.fragment_activity_goal_intro);
        this.f50881c = new r8.g(q0.b(g.class), new a(this));
        this.f50882d = by.kirich1409.viewbindingdelegate.e.a(this, new kotlin.jvm.internal.w(1), u9.a.a());
    }

    private final j1 s1() {
        return (j1) this.f50882d.getValue(this, f50879e[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        gl.i iVar;
        LottieData lottieData;
        kotlin.jvm.internal.u.j(view, "view");
        super.onViewCreated(view, bundle);
        int i11 = 0;
        ay.b.n(view, false, true, 23);
        AppBarLayout appBar = s1().f99229a;
        kotlin.jvm.internal.u.i(appBar, "appBar");
        ay.b.n(appBar, true, false, 29);
        FragmentActivity requireActivity = requireActivity();
        kotlin.jvm.internal.u.h(requireActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        AppCompatActivity appCompatActivity = (AppCompatActivity) requireActivity;
        appCompatActivity.setSupportActionBar(s1().f99233e);
        ActionBar supportActionBar = appCompatActivity.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.q(false);
            supportActionBar.o(true);
        }
        Device a11 = ((g) this.f50881c.getValue()).a();
        fl.o g11 = fl.p.f67672b.a().g(a11);
        String str = null;
        if (g11 instanceof gl.i) {
            iVar = (gl.i) g11;
        } else {
            iVar = null;
        }
        if (iVar != null) {
            a11.getColor();
            lottieData = iVar.b0();
        } else {
            lottieData = null;
        }
        DevicePictures pictures = a11.getPictures();
        if (pictures != null) {
            str = pictures.getUrl(1);
        }
        int M = g11.M(a11.getColor());
        if (lottieData != null) {
            LottieAnimationView lottieAnimationView = s1().f99231c;
            kotlin.jvm.internal.u.g(lottieAnimationView);
            lottieAnimationView.setVisibility(0);
            lottieAnimationView.setAnimation(lottieData.b());
            lottieAnimationView.setImageAssetsFolder(lottieData.a());
            if (lottieData.d()) {
                i11 = -1;
            }
            lottieAnimationView.setRepeatCount(i11);
            lottieAnimationView.m();
        } else if (str != null) {
            ImageView deviceFeatureImage = s1().f99230b;
            kotlin.jvm.internal.u.i(deviceFeatureImage, "deviceFeatureImage");
            w9.g a12 = w9.a.a(deviceFeatureImage.getContext());
            f.a aVar = new f.a(deviceFeatureImage.getContext());
            aVar.d(str);
            aVar.q(deviceFeatureImage);
            aVar.k(M);
            a12.d(aVar.b());
        } else {
            s1().f99230b.setImageResource(M);
        }
        s1().f99232d.setOnClickListener(new com.google.android.material.search.k(this, 9));
    }
}
