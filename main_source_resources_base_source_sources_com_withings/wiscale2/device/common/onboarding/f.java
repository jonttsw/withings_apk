package com.withings.wiscale2.device.common.onboarding;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.device.Device;
import com.withings.wiscale2.device.common.onboarding.SleepApneaOnboardingActivity;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.w;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class f extends w implements ym0.a<Device> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SleepApneaOnboardingActivity.l f53114a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(SleepApneaOnboardingActivity.l lVar) {
        super(0);
        this.f53114a = lVar;
    }

    @Override // ym0.a
    public final Device invoke() {
        SleepApneaOnboardingActivity.l lVar = this.f53114a;
        lVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Device.class);
        Activity activity = lVar.f53081b;
        if (isAssignableFrom) {
            return (Device) b0.F(activity, "extra_device");
        }
        if (Serializable.class.isAssignableFrom(Device.class)) {
            return (Device) b0.H(activity, "extra_device");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra extra_device of class ", q0.b(Device.class), " is not supported"));
    }
}
