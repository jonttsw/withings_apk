package com.withings.wiscale2.device.common.feature.workout;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.camera.core.v;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.airbnb.lottie.LottieAnimationView;
import com.withings.device.Device;
import com.withings.device.DeviceModel;
import com.withings.wiscale2.C1987R;
import fn0.k;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import tb0.z1;
import ym0.l;
/* compiled from: WorkoutTutorialNavigation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/common/feature/workout/WorkoutLongPressFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class WorkoutLongPressFragment extends Fragment {

    /* renamed from: d  reason: collision with root package name */
    static final /* synthetic */ k<Object>[] f52623d = {v.c(WorkoutLongPressFragment.class, "binding", "getBinding()Lcom/withings/wiscale2/databinding/FragmentDeviceFeatureActivationBinding;", 0)};

    /* renamed from: c  reason: collision with root package name */
    private final LifecycleViewBindingProperty f52624c;

    /* compiled from: FragmentViewBindings.kt */
    /* loaded from: classes5.dex */
    public static final class a extends w implements l<WorkoutLongPressFragment, z1> {
        @Override // ym0.l
        public final z1 invoke(WorkoutLongPressFragment workoutLongPressFragment) {
            return android.support.v4.media.session.c.d(workoutLongPressFragment, "fragment");
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public WorkoutLongPressFragment() {
        super(C1987R.layout.fragment_device_feature_activation);
        this.f52624c = by.kirich1409.viewbindingdelegate.e.a(this, new w(1), u9.a.a());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        Device device;
        Integer num;
        String str;
        String str2;
        DeviceModel model;
        DeviceModel model2;
        Intent intent;
        Object obj;
        super.onResume();
        FragmentActivity activity = getActivity();
        Integer num2 = null;
        if (activity != null && (intent = activity.getIntent()) != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                obj = intent.getSerializableExtra("device", Device.class);
            } else {
                Object serializableExtra = intent.getSerializableExtra("device");
                if (!(serializableExtra instanceof Device)) {
                    serializableExtra = null;
                }
                obj = (Device) serializableExtra;
            }
            device = (Device) obj;
        } else {
            device = null;
        }
        if (device != null && (model2 = device.getModel()) != null) {
            num = Integer.valueOf(model2.b());
        } else {
            num = null;
        }
        if ((num != null && num.intValue() == 95) || (num != null && num.intValue() == 94)) {
            str = "lottie/hwa10-11_tutorials/images";
        } else {
            str = "lottie/scanwatch_install_flow/images";
        }
        if (device != null && (model = device.getModel()) != null) {
            num2 = Integer.valueOf(model.b());
        }
        if (num2 != null && num2.intValue() == 95) {
            str2 = "lottie/hwa10-11_tutorials/LOTTIE-SCANWATCHROSEGOLD-LONG-PRESS-STOP-WORKOUT.json";
        } else if (num2 != null && num2.intValue() == 94) {
            str2 = "lottie/hwa10-11_tutorials/LOTTIE-SCANWATCHBLACK-LONG-PRESS-STOP-WORKOUT.json";
        } else {
            str2 = "lottie/scanwatch_install_flow/workout_003.json";
        }
        z1 z1Var = (z1) this.f52624c.getValue(this, f52623d[0]);
        z1Var.f99676d.setText(C1987R.string.hwa09_tutorial_workout_end_title);
        z1Var.f99673a.setText(C1987R.string.hwa09_tutorial_workout_end_description);
        LottieAnimationView lottieAnimationView = z1Var.f99675c;
        lottieAnimationView.k(true);
        lottieAnimationView.setVisibility(0);
        lottieAnimationView.setImageAssetsFolder(str);
        lottieAnimationView.setAnimation(str2);
        lottieAnimationView.setRepeatCount(-1);
        lottieAnimationView.m();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        u.j(view, "view");
        super.onViewCreated(view, bundle);
        ay.b.n(view, false, true, 23);
    }
}
