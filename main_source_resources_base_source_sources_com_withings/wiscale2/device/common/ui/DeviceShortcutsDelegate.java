package com.withings.wiscale2.device.common.ui;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.common.device.DeviceSettingsActivity;
import com.withings.device.Device;
import kotlin.Metadata;
/* compiled from: DeviceShortcutsFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/common/ui/DeviceShortcutsDelegate;", "Lcom/withings/common/device/DeviceSettingsActivity$DeviceSettingsDelegate;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class DeviceShortcutsDelegate implements DeviceSettingsActivity.DeviceSettingsDelegate {
    public static final Parcelable.Creator<DeviceShortcutsDelegate> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final Device f53705a;

    /* compiled from: DeviceShortcutsFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator<DeviceShortcutsDelegate> {
        @Override // android.os.Parcelable.Creator
        public final DeviceShortcutsDelegate createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.u.j(parcel, "parcel");
            return new DeviceShortcutsDelegate((Device) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final DeviceShortcutsDelegate[] newArray(int i11) {
            return new DeviceShortcutsDelegate[i11];
        }
    }

    public DeviceShortcutsDelegate(Device device) {
        kotlin.jvm.internal.u.j(device, "device");
        this.f53705a = device;
    }

    @Override // com.withings.common.device.DeviceSettingsActivity.DeviceSettingsDelegate
    public final Fragment H1() {
        y0.f54124f.getClass();
        Device device = this.f53705a;
        kotlin.jvm.internal.u.j(device, "device");
        y0 y0Var = new y0();
        y0Var.setArguments(androidx.core.os.e.a(new nm0.j("arg_device", device)));
        return y0Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.withings.common.device.DeviceSettingsActivity.DeviceSettingsDelegate
    public final WppDeviceConversation n0() {
        return new DeviceShortcutConversation();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i11) {
        kotlin.jvm.internal.u.j(out, "out");
        out.writeSerializable(this.f53705a);
    }
}
