package com.withings.wiscale2.device.common.screen.ui;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.common.device.DeviceSettingsActivity;
import com.withings.device.Device;
import com.withings.workout.category.model.WorkoutCategoryManager;
import kotlin.Metadata;
/* compiled from: WorkoutScreenOrderFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/common/screen/ui/WorkoutScreenOrderDelegate;", "Lcom/withings/common/device/DeviceSettingsActivity$DeviceSettingsDelegate;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class WorkoutScreenOrderDelegate implements DeviceSettingsActivity.DeviceSettingsDelegate {
    public static final Parcelable.Creator<WorkoutScreenOrderDelegate> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final Device f53248a;

    /* compiled from: WorkoutScreenOrderFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator<WorkoutScreenOrderDelegate> {
        @Override // android.os.Parcelable.Creator
        public final WorkoutScreenOrderDelegate createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.u.j(parcel, "parcel");
            return new WorkoutScreenOrderDelegate((Device) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final WorkoutScreenOrderDelegate[] newArray(int i11) {
            return new WorkoutScreenOrderDelegate[i11];
        }
    }

    public WorkoutScreenOrderDelegate(Device device) {
        kotlin.jvm.internal.u.j(device, "device");
        this.f53248a = device;
    }

    @Override // com.withings.common.device.DeviceSettingsActivity.DeviceSettingsDelegate
    public final Fragment H1() {
        int i11 = g2.f53314h;
        Device device = this.f53248a;
        kotlin.jvm.internal.u.j(device, "device");
        g2 g2Var = new g2();
        g2Var.setArguments(androidx.core.os.e.a(new nm0.j("key_device", device)));
        return g2Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.withings.common.device.DeviceSettingsActivity.DeviceSettingsDelegate
    public final WppDeviceConversation n0() {
        WorkoutCategoryManager workoutCategoryManager = WorkoutCategoryManager.get();
        kotlin.jvm.internal.u.i(workoutCategoryManager, "get(...)");
        return new WorkoutScreenOrderSettingConversation(workoutCategoryManager);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i11) {
        kotlin.jvm.internal.u.j(out, "out");
        out.writeSerializable(this.f53248a);
    }
}
