package com.withings.wiscale2.device.common.feature.respiratoryscan;

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
/* compiled from: RespiratoryScanNavigation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/common/feature/respiratoryscan/RespiratoryScanStartFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RespiratoryScanStartFragment extends Fragment {

    /* renamed from: d  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f52443d = {v.c(RespiratoryScanStartFragment.class, "binding", "getBinding()Lcom/withings/wiscale2/databinding/FragmentDeviceFeatureActivationBinding;", 0)};

    /* renamed from: c  reason: collision with root package name */
    private final LifecycleViewBindingProperty f52444c;

    /* compiled from: FragmentViewBindings.kt */
    /* loaded from: classes5.dex */
    public static final class a extends w implements ym0.l<RespiratoryScanStartFragment, z1> {
        @Override // ym0.l
        public final z1 invoke(RespiratoryScanStartFragment respiratoryScanStartFragment) {
            return android.support.v4.media.session.c.d(respiratoryScanStartFragment, "fragment");
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public RespiratoryScanStartFragment() {
        super(C1987R.layout.fragment_device_feature_activation);
        this.f52444c = by.kirich1409.viewbindingdelegate.e.a(this, new w(1), u9.a.a());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Device device;
        Integer num;
        int i11;
        Integer num2;
        int i12;
        int i13;
        DeviceModel model;
        DeviceModel model2;
        DeviceModel model3;
        Intent intent;
        Object obj;
        u.j(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        Integer num3 = null;
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
        z1 z1Var = (z1) this.f52444c.getValue(this, f52443d[0]);
        ImageView imageView = z1Var.f99674b;
        if (device != null && (model3 = device.getModel()) != null) {
            num = Integer.valueOf(model3.b());
        } else {
            num = null;
        }
        if ((num != null && num.intValue() == 94) || (num != null && num.intValue() == 95)) {
            i11 = 2131231171;
        } else {
            i11 = 2131232773;
        }
        imageView.setImageResource(i11);
        if (device != null && (model2 = device.getModel()) != null) {
            num2 = Integer.valueOf(model2.b());
        } else {
            num2 = null;
        }
        if (num2 != null && num2.intValue() == 94) {
            i12 = C1987R.string.respiratoryScan_tutorial_start_hwa10Title;
        } else if (num2 != null && num2.intValue() == 95) {
            i12 = C1987R.string.respiratoryScan_tutorial_start_hwa11Title;
        } else {
            i12 = C1987R.string.respiratoryScan_tutorial_start_hwa09Title;
        }
        z1Var.f99676d.setText(i12);
        if (device != null && (model = device.getModel()) != null) {
            num3 = Integer.valueOf(model.b());
        }
        if (num3 != null && num3.intValue() == 94) {
            i13 = C1987R.string.respiratoryScan_tutorial_start_hwa10description;
        } else if (num3 != null && num3.intValue() == 95) {
            i13 = C1987R.string.respiratoryScan_tutorial_start_hwa11description;
        } else {
            i13 = C1987R.string.respiratoryScan_tutorial_start_hwa09description;
        }
        z1Var.f99673a.setText(i13);
    }
}
