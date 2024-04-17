package com.withings.common.device.util;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.withings.devicesetup.ui.EnablePermissionsForScanActivity;
import fl.p;
import gl.j;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import yi.d;
/* compiled from: DeviceModelScanningAbilityProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/common/device/util/DeviceModelScanningAbilityProvider;", "Lcom/withings/devicesetup/ui/EnablePermissionsForScanActivity$ScanningAbilityProvider;", "common-device_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class DeviceModelScanningAbilityProvider implements EnablePermissionsForScanActivity.ScanningAbilityProvider {
    public static final Parcelable.Creator<DeviceModelScanningAbilityProvider> CREATOR = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final int f35241a;

    /* compiled from: DeviceModelScanningAbilityProvider.kt */
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<DeviceModelScanningAbilityProvider> {
        @Override // android.os.Parcelable.Creator
        public final DeviceModelScanningAbilityProvider createFromParcel(Parcel parcel) {
            u.j(parcel, "parcel");
            return new DeviceModelScanningAbilityProvider(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final DeviceModelScanningAbilityProvider[] newArray(int i11) {
            return new DeviceModelScanningAbilityProvider[i11];
        }
    }

    public DeviceModelScanningAbilityProvider(int i11) {
        this.f35241a = i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i11) {
        u.j(out, "out");
        out.writeInt(this.f35241a);
    }

    @Override // com.withings.devicesetup.ui.EnablePermissionsForScanActivity.ScanningAbilityProvider
    public final d x(Context context) {
        u.j(context, "context");
        return ((j) p.f67672b.a().d(this.f35241a)).b(context);
    }
}
