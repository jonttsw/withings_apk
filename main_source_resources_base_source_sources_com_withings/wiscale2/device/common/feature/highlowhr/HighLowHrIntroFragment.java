package com.withings.wiscale2.device.common.feature.highlowhr;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.withings.device.Device;
import com.withings.device.DeviceModel;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import tb0.z1;
/* compiled from: HighLowHRActivationNavigation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/common/feature/highlowhr/HighLowHrIntroFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class HighLowHrIntroFragment extends Fragment {

    /* renamed from: d  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f52214d = {androidx.camera.core.v.c(HighLowHrIntroFragment.class, "binding", "getBinding()Lcom/withings/wiscale2/databinding/FragmentDeviceFeatureActivationBinding;", 0)};

    /* renamed from: c  reason: collision with root package name */
    private final LifecycleViewBindingProperty f52215c;

    /* compiled from: FragmentViewBindings.kt */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.l<HighLowHrIntroFragment, z1> {
        @Override // ym0.l
        public final z1 invoke(HighLowHrIntroFragment highLowHrIntroFragment) {
            return android.support.v4.media.session.c.d(highLowHrIntroFragment, "fragment");
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public HighLowHrIntroFragment() {
        super(C1987R.layout.fragment_device_feature_activation);
        this.f52215c = by.kirich1409.viewbindingdelegate.e.a(this, new kotlin.jvm.internal.w(1), u9.a.a());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        Device device;
        int i11;
        DeviceModel model;
        Intent intent;
        Object obj;
        super.onResume();
        FragmentActivity activity = getActivity();
        Integer num = null;
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
        z1 z1Var = (z1) this.f52215c.getValue(this, f52214d[0]);
        z1Var.f99676d.setText(C1987R.string.heartEvents_tutorial_highLowHR_whatIS_title);
        z1Var.f99673a.setText(C1987R.string.heartEvents_tutorial_highLowHR_whatIS_description);
        if (device != null && (model = device.getModel()) != null) {
            num = Integer.valueOf(model.b());
        }
        if (num != null && num.intValue() == 94) {
            i11 = 2131232496;
        } else {
            i11 = 2131231475;
        }
        z1Var.f99674b.setImageResource(i11);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.u.j(view, "view");
        super.onViewCreated(view, bundle);
        ay.b.n(view, false, true, 23);
    }
}
