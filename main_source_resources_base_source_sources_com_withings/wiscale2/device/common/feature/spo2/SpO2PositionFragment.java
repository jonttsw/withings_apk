package com.withings.wiscale2.device.common.feature.spo2;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.camera.core.v;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.google.android.material.textview.MaterialTextView;
import com.withings.device.Device;
import com.withings.device.DeviceModel;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import tb0.a2;
/* compiled from: SpO2ActivationNavigation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/common/feature/spo2/SpO2PositionFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SpO2PositionFragment extends Fragment {

    /* renamed from: d  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f52493d = {v.c(SpO2PositionFragment.class, "binding", "getBinding()Lcom/withings/wiscale2/databinding/FragmentDeviceFeatureActivationWithBulletsBinding;", 0)};

    /* renamed from: c  reason: collision with root package name */
    private final LifecycleViewBindingProperty f52494c;

    /* compiled from: FragmentViewBindings.kt */
    /* loaded from: classes5.dex */
    public static final class a extends w implements ym0.l<SpO2PositionFragment, a2> {
        @Override // ym0.l
        public final a2 invoke(SpO2PositionFragment spO2PositionFragment) {
            SpO2PositionFragment fragment = spO2PositionFragment;
            u.j(fragment, "fragment");
            return a2.a(fragment.requireView());
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public SpO2PositionFragment() {
        super(C1987R.layout.fragment_device_feature_activation_with_bullets);
        this.f52494c = by.kirich1409.viewbindingdelegate.e.a(this, new w(1), u9.a.a());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Device device;
        int i11;
        DeviceModel model;
        Intent intent;
        Object obj;
        u.j(view, "view");
        super.onViewCreated(view, bundle);
        ay.b.n(view, false, true, 23);
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
        a2 a2Var = (a2) this.f52494c.getValue(this, f52493d[0]);
        ImageView imageView = a2Var.f98852b;
        if (device != null && (model = device.getModel()) != null) {
            num = Integer.valueOf(model.b());
        }
        if (num != null && num.intValue() == 94) {
            i11 = 2131231421;
        } else {
            i11 = 2131232801;
        }
        imageView.setImageResource(i11);
        a2Var.f98853c.setText(C1987R.string.spo2_live_preRequisite_title);
        int[] iArr = {C1987R.string.spo2_live_preRequisite_bullet1, C1987R.string.spo2_live_preRequisite_bullet2, C1987R.string.spo2_live_preRequisite_bullet3};
        int i12 = 0;
        for (int i13 = 0; i13 < 3; i13++) {
            int i14 = iArr[i13];
            i12++;
            LayoutInflater layoutInflater = getLayoutInflater();
            LinearLayout linearLayout = a2Var.f98851a;
            View inflate = layoutInflater.inflate(C1987R.layout.view_activation_bullets, (ViewGroup) linearLayout, false);
            ((MaterialTextView) inflate.findViewById(C1987R.id.bullet)).setText(String.valueOf(i12));
            ((MaterialTextView) inflate.findViewById(C1987R.id.text)).setText(i14);
            linearLayout.addView(inflate);
        }
    }
}
