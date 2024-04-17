package com.withings.wiscale2.device.common.feature.workout;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.camera.core.v;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/common/feature/workout/WorkoutFullGpsFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class WorkoutFullGpsFragment extends Fragment {

    /* renamed from: d  reason: collision with root package name */
    static final /* synthetic */ k<Object>[] f52619d = {v.c(WorkoutFullGpsFragment.class, "binding", "getBinding()Lcom/withings/wiscale2/databinding/FragmentDeviceFeatureActivationBinding;", 0)};

    /* renamed from: c  reason: collision with root package name */
    private final LifecycleViewBindingProperty f52620c;

    /* compiled from: FragmentViewBindings.kt */
    /* loaded from: classes5.dex */
    public static final class a extends w implements l<WorkoutFullGpsFragment, z1> {
        @Override // ym0.l
        public final z1 invoke(WorkoutFullGpsFragment workoutFullGpsFragment) {
            return android.support.v4.media.session.c.d(workoutFullGpsFragment, "fragment");
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public WorkoutFullGpsFragment() {
        super(C1987R.layout.fragment_device_feature_activation);
        this.f52620c = by.kirich1409.viewbindingdelegate.e.a(this, new w(1), u9.a.a());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        Device device;
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
        z1 z1Var = (z1) this.f52620c.getValue(this, f52619d[0]);
        z1Var.f99676d.setText(C1987R.string.installation_gpsAlreadyTitle_android);
        z1Var.f99673a.setText(C1987R.string.installation_gpsAlreadyDescription_android);
        if (device != null && (model = device.getModel()) != null) {
            num = Integer.valueOf(model.b());
        }
        int i11 = 2131232923;
        if ((num == null || num.intValue() != 95) && (num == null || num.intValue() != 94)) {
            i11 = 2131232798;
        }
        z1Var.f99674b.setImageResource(i11);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        u.j(view, "view");
        super.onViewCreated(view, bundle);
        ay.b.n(view, false, true, 23);
    }
}
