package com.withings.wiscale2.device.common.ui;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.common.device.DeviceSettingsActivity;
import com.withings.device.Device;
import kotlin.Metadata;
/* compiled from: TrackerPositionFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/common/ui/TrackerPositionDelegate;", "Lcom/withings/common/device/DeviceSettingsActivity$DeviceSettingsDelegate;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class TrackerPositionDelegate implements DeviceSettingsActivity.DeviceSettingsDelegate {
    public static final Parcelable.Creator<TrackerPositionDelegate> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final Device f53756a;

    /* compiled from: TrackerPositionFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator<TrackerPositionDelegate> {
        @Override // android.os.Parcelable.Creator
        public final TrackerPositionDelegate createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.u.j(parcel, "parcel");
            return new TrackerPositionDelegate((Device) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final TrackerPositionDelegate[] newArray(int i11) {
            return new TrackerPositionDelegate[i11];
        }
    }

    public TrackerPositionDelegate(Device device) {
        kotlin.jvm.internal.u.j(device, "device");
        this.f53756a = device;
    }

    @Override // com.withings.common.device.DeviceSettingsActivity.DeviceSettingsDelegate
    public final Fragment H1() {
        p2.f54048k.getClass();
        Device device = this.f53756a;
        kotlin.jvm.internal.u.j(device, "device");
        p2 p2Var = new p2();
        p2Var.setArguments(androidx.core.os.e.a(new nm0.j("key_device", device)));
        return p2Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.withings.common.device.DeviceSettingsActivity.DeviceSettingsDelegate
    public final WppDeviceConversation n0() {
        return new TrackerPositionConversation(0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i11) {
        kotlin.jvm.internal.u.j(out, "out");
        out.writeSerializable(this.f53756a);
    }
}
