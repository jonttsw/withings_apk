package com.withings.wiscale2.device.common.onboarding;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.wiscale2.device.common.onboarding.SleepApneaOnboardingActivity;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.w;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class g extends w implements ym0.a<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SleepApneaOnboardingActivity.m f53115a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(SleepApneaOnboardingActivity.m mVar) {
        super(0);
        this.f53115a = mVar;
    }

    @Override // ym0.a
    public final Boolean invoke() {
        SleepApneaOnboardingActivity.m mVar = this.f53115a;
        mVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Boolean.class);
        Activity activity = mVar.f53083b;
        if (isAssignableFrom) {
            return (Boolean) b0.F(activity, "extra_from_my_devices");
        }
        if (Serializable.class.isAssignableFrom(Boolean.class)) {
            return (Boolean) b0.H(activity, "extra_from_my_devices");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra extra_from_my_devices of class ", q0.b(Boolean.class), " is not supported"));
    }
}
