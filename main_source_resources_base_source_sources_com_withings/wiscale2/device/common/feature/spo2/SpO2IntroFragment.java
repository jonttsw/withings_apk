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
import com.withings.device.Device;
import com.withings.device.DeviceModel;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import tb0.z1;
/* compiled from: SpO2ActivationNavigation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/common/feature/spo2/SpO2IntroFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SpO2IntroFragment extends Fragment {

    /* renamed from: d  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f52491d = {v.c(SpO2IntroFragment.class, "binding", "getBinding()Lcom/withings/wiscale2/databinding/FragmentDeviceFeatureActivationBinding;", 0)};

    /* renamed from: c  reason: collision with root package name */
    private final LifecycleViewBindingProperty f52492c;

    /* compiled from: FragmentViewBindings.kt */
    /* loaded from: classes5.dex */
    public static final class a extends w implements ym0.l<SpO2IntroFragment, z1> {
        @Override // ym0.l
        public final z1 invoke(SpO2IntroFragment spO2IntroFragment) {
            return android.support.v4.media.session.c.d(spO2IntroFragment, "fragment");
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public SpO2IntroFragment() {
        super(C1987R.layout.fragment_device_feature_activation);
        this.f52492c = by.kirich1409.viewbindingdelegate.e.a(this, new w(1), u9.a.a());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Device device;
        Integer num;
        int i11;
        int i12;
        DeviceModel model;
        DeviceModel model2;
        Intent intent;
        Object obj;
        u.j(view, "view");
        super.onViewCreated(view, bundle);
        ay.b.n(view, false, true, 23);
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
        z1 z1Var = (z1) this.f52492c.getValue(this, f52491d[0]);
        ImageView imageView = z1Var.f99674b;
        if (device != null && (model2 = device.getModel()) != null) {
            num = Integer.valueOf(model2.b());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 94) {
            i11 = 2131232677;
        } else {
            i11 = 2131232787;
        }
        imageView.setImageResource(i11);
        if (device != null && (model = device.getModel()) != null) {
            num2 = Integer.valueOf(model.b());
        }
        if (num2 != null && num2.intValue() == 94) {
            i12 = C1987R.string.hwa10_spo2ExplanationTutorialTitle;
        } else {
            i12 = C1987R.string.hwa09_spo2ExplanationTutorialTitle;
        }
        z1Var.f99676d.setText(i12);
        z1Var.f99673a.setText(C1987R.string.hwa09_spo2ExplanationTutorialMessage);
    }
}
