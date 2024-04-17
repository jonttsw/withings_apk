package com.withings.wiscale2.device.common.feature.activitygoal;

import android.os.Bundle;
import android.os.Parcelable;
import com.withings.device.Device;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import java.io.Serializable;
/* compiled from: FitnessAndStepsGoalSettingsFragmentArgs.kt */
/* loaded from: classes5.dex */
public final class s implements r8.f {

    /* renamed from: a  reason: collision with root package name */
    private final User f50959a;

    /* renamed from: b  reason: collision with root package name */
    private final Device f50960b;

    public s(Device device, User user) {
        this.f50959a = user;
        this.f50960b = device;
    }

    public static final s fromBundle(Bundle bundle) {
        kotlin.jvm.internal.u.j(bundle, "bundle");
        bundle.setClassLoader(s.class.getClassLoader());
        if (bundle.containsKey(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT)) {
            if (!Parcelable.class.isAssignableFrom(User.class) && !Serializable.class.isAssignableFrom(User.class)) {
                throw new UnsupportedOperationException(User.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            User user = (User) bundle.get(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT);
            if (user != null) {
                if (bundle.containsKey("device")) {
                    if (!Parcelable.class.isAssignableFrom(Device.class) && !Serializable.class.isAssignableFrom(Device.class)) {
                        throw new UnsupportedOperationException(Device.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                    }
                    Device device = (Device) bundle.get("device");
                    if (device != null) {
                        return new s(device, user);
                    }
                    throw new IllegalArgumentException("Argument \"device\" is marked as non-null but was passed a null value.");
                }
                throw new IllegalArgumentException("Required argument \"device\" is missing and does not have an android:defaultValue");
            }
            throw new IllegalArgumentException("Argument \"user\" is marked as non-null but was passed a null value.");
        }
        throw new IllegalArgumentException("Required argument \"user\" is missing and does not have an android:defaultValue");
    }

    public final Device a() {
        return this.f50960b;
    }

    public final User b() {
        return this.f50959a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (kotlin.jvm.internal.u.e(this.f50959a, sVar.f50959a) && kotlin.jvm.internal.u.e(this.f50960b, sVar.f50960b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f50960b.hashCode() + (this.f50959a.hashCode() * 31);
    }

    public final String toString() {
        return "FitnessAndStepsGoalSettingsFragmentArgs(user=" + this.f50959a + ", device=" + this.f50960b + ")";
    }
}
