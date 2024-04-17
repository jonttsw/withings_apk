package com.withings.wiscale2.device.common.feature.activitygoal;

import android.os.Bundle;
import android.os.Parcelable;
import com.withings.device.Device;
import java.io.Serializable;
/* compiled from: FitnessAndStepsGoalIntroFragmentArgs.kt */
/* loaded from: classes5.dex */
public final class g implements r8.f {

    /* renamed from: a  reason: collision with root package name */
    private final Device f50940a;

    public g(Device device) {
        this.f50940a = device;
    }

    public static final g fromBundle(Bundle bundle) {
        kotlin.jvm.internal.u.j(bundle, "bundle");
        bundle.setClassLoader(g.class.getClassLoader());
        if (bundle.containsKey("device")) {
            if (!Parcelable.class.isAssignableFrom(Device.class) && !Serializable.class.isAssignableFrom(Device.class)) {
                throw new UnsupportedOperationException(Device.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            Device device = (Device) bundle.get("device");
            if (device != null) {
                return new g(device);
            }
            throw new IllegalArgumentException("Argument \"device\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"device\" is missing and does not have an android:defaultValue");
    }

    public final Device a() {
        return this.f50940a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof g) && kotlin.jvm.internal.u.e(this.f50940a, ((g) obj).f50940a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f50940a.hashCode();
    }

    public final String toString() {
        return "FitnessAndStepsGoalIntroFragmentArgs(device=" + this.f50940a + ")";
    }
}
