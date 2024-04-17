package com.withings.wiscale2.device.common.feature.highlowhr;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.airbnb.lottie.LottieAnimationView;
import com.withings.device.Device;
import com.withings.device.DeviceModel;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import tb0.z1;
/* compiled from: HighLowHRActivationNavigation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/common/feature/highlowhr/HighLowHrActivateFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class HighLowHrActivateFragment extends Fragment {

    /* renamed from: d  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f52210d = {androidx.camera.core.v.c(HighLowHrActivateFragment.class, "binding", "getBinding()Lcom/withings/wiscale2/databinding/FragmentDeviceFeatureActivationBinding;", 0)};

    /* renamed from: c  reason: collision with root package name */
    private final LifecycleViewBindingProperty f52211c;

    /* compiled from: FragmentViewBindings.kt */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.l<HighLowHrActivateFragment, z1> {
        @Override // ym0.l
        public final z1 invoke(HighLowHrActivateFragment highLowHrActivateFragment) {
            return android.support.v4.media.session.c.d(highLowHrActivateFragment, "fragment");
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public HighLowHrActivateFragment() {
        super(C1987R.layout.fragment_device_feature_activation);
        this.f52211c = by.kirich1409.viewbindingdelegate.e.a(this, new kotlin.jvm.internal.w(1), u9.a.a());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        Device device;
        Integer num;
        int i11;
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
        z1 z1Var = (z1) this.f52211c.getValue(this, f52210d[0]);
        TextView textView = z1Var.f99676d;
        if (device != null && (model2 = device.getModel()) != null) {
            num = Integer.valueOf(model2.b());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 94) {
            i11 = C1987R.string.heartEvents_afib_tutorial_disclaimer_title_hwa10;
        } else if (num != null && num.intValue() == 95) {
            i11 = C1987R.string.heartEvents_afib_tutorial_disclaimer_title_hwa11;
        } else {
            i11 = C1987R.string.heartEvents_afib_tutorial_disclaimer_title;
        }
        textView.setText(i11);
        z1Var.f99673a.setText(C1987R.string.heartEvents_afib_tutorial_disclaimer_description);
        if (device != null && (model = device.getModel()) != null) {
            num2 = Integer.valueOf(model.b());
        }
        if (num2 != null && num2.intValue() == 94) {
            z1Var.f99674b.setImageResource(2131231420);
            return;
        }
        LottieAnimationView lottieAnimationView = z1Var.f99675c;
        lottieAnimationView.setVisibility(0);
        lottieAnimationView.setImageAssetsFolder("lottie/hwa09_tutorials/images");
        lottieAnimationView.setAnimation("lottie/hwa09_tutorials/cantDetectStrokes.json");
        lottieAnimationView.setRepeatCount(-1);
        lottieAnimationView.m();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.u.j(view, "view");
        super.onViewCreated(view, bundle);
        ay.b.n(view, false, true, 23);
    }
}
