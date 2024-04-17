package com.withings.wiscale2.device.common.feature.spo2;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.camera.core.v;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.airbnb.lottie.LottieAnimationView;
import com.withings.device.Device;
import com.withings.wiscale2.C1987R;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import tb0.z1;
/* compiled from: SpO2ActivationNavigation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/common/feature/spo2/SpO2DoneFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SpO2DoneFragment extends Fragment {

    /* renamed from: d  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f52488d = {v.c(SpO2DoneFragment.class, "binding", "getBinding()Lcom/withings/wiscale2/databinding/FragmentDeviceFeatureActivationBinding;", 0)};

    /* renamed from: c  reason: collision with root package name */
    private final LifecycleViewBindingProperty f52489c;

    /* compiled from: FragmentNavArgsLazy.kt */
    /* loaded from: classes5.dex */
    public static final class a extends w implements ym0.a<Bundle> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Fragment f52490a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
            super(0);
            this.f52490a = fragment;
        }

        @Override // ym0.a
        public final Bundle invoke() {
            Fragment fragment = this.f52490a;
            Bundle arguments = fragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException(androidx.fragment.app.o.c("Fragment ", fragment, " has null arguments"));
        }
    }

    /* compiled from: FragmentViewBindings.kt */
    /* loaded from: classes5.dex */
    public static final class b extends w implements ym0.l<SpO2DoneFragment, z1> {
        @Override // ym0.l
        public final z1 invoke(SpO2DoneFragment spO2DoneFragment) {
            return android.support.v4.media.session.c.d(spO2DoneFragment, "fragment");
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public SpO2DoneFragment() {
        super(C1987R.layout.fragment_device_feature_activation);
        this.f52489c = by.kirich1409.viewbindingdelegate.e.a(this, new w(1), u9.a.a());
        new r8.g(q0.b(c.class), new a(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Integer classification;
        Intent intent;
        Object obj;
        Object serializableExtra;
        u.j(view, "view");
        super.onViewCreated(view, bundle);
        ay.b.n(view, false, true, 23);
        FragmentActivity activity = getActivity();
        Device device = null;
        Serializable serializable = null;
        device = null;
        if (activity != null && (intent = activity.getIntent()) != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializableExtra = intent.getSerializableExtra("device", Device.class);
                obj = serializableExtra;
            } else {
                Serializable serializableExtra2 = intent.getSerializableExtra("device");
                if (serializableExtra2 instanceof Device) {
                    serializable = serializableExtra2;
                }
                obj = (Device) serializable;
            }
            device = (Device) obj;
        }
        z1 z1Var = (z1) this.f52489c.getValue(this, f52488d[0]);
        z1Var.f99676d.setText(C1987R.string.spo2_tutorial_endTitle);
        z1Var.f99673a.setText(C1987R.string.spo2_tutorial_endDescription);
        ImageView imageView = z1Var.f99674b;
        if (device != null && device.getModelId() == 94 && ((classification = device.getClassification()) == null || classification.intValue() != 0)) {
            imageView.setImageResource(2131232679);
        } else if (device != null && device.getModelId() == 94) {
            imageView.setImageResource(2131232678);
        } else {
            LottieAnimationView lottieAnimationView = z1Var.f99675c;
            lottieAnimationView.setVisibility(0);
            lottieAnimationView.setImageAssetsFolder("lottie/hwa09_tutorials/images");
            lottieAnimationView.setAnimation("lottie/hwa09_tutorials/spo2_results.json");
            lottieAnimationView.setRepeatCount(-1);
            lottieAnimationView.m();
        }
    }
}
