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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/common/feature/workout/WorkoutTrackFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class WorkoutTrackFragment extends Fragment {

    /* renamed from: d  reason: collision with root package name */
    static final /* synthetic */ k<Object>[] f52638d = {v.c(WorkoutTrackFragment.class, "binding", "getBinding()Lcom/withings/wiscale2/databinding/FragmentDeviceFeatureActivationBinding;", 0)};

    /* renamed from: c  reason: collision with root package name */
    private final LifecycleViewBindingProperty f52639c;

    /* compiled from: FragmentViewBindings.kt */
    /* loaded from: classes5.dex */
    public static final class a extends w implements l<WorkoutTrackFragment, z1> {
        @Override // ym0.l
        public final z1 invoke(WorkoutTrackFragment workoutTrackFragment) {
            return android.support.v4.media.session.c.d(workoutTrackFragment, "fragment");
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public WorkoutTrackFragment() {
        super(C1987R.layout.fragment_device_feature_activation);
        this.f52639c = by.kirich1409.viewbindingdelegate.e.a(this, new w(1), u9.a.a());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        Device device;
        Integer num;
        int i11;
        int i12;
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
        z1 z1Var = (z1) this.f52639c.getValue(this, f52638d[0]);
        z1Var.f99676d.setText(C1987R.string.hwa09_tutorial_workout_trackNoGPS_title);
        if (device != null && (model2 = device.getModel()) != null) {
            num = Integer.valueOf(model2.b());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 95) {
            i11 = C1987R.string.hwa11_tutorial_workout_trackNoGPS_description;
        } else if (num != null && num.intValue() == 94) {
            i11 = C1987R.string.hwa10_tutorial_workout_trackNoGPS_description;
        } else {
            i11 = C1987R.string.hwa09_tutorial_workout_trackNoGPS_description;
        }
        z1Var.f99673a.setText(i11);
        if (device != null && (model = device.getModel()) != null) {
            num2 = Integer.valueOf(model.b());
        }
        if (num2 != null && num2.intValue() == 95) {
            i12 = 2131232920;
        } else if (num2 != null && num2.intValue() == 94) {
            i12 = 2131232917;
        } else {
            i12 = 2131232800;
        }
        z1Var.f99674b.setImageResource(i12);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        u.j(view, "view");
        super.onViewCreated(view, bundle);
        ay.b.n(view, false, true, 23);
    }
}
