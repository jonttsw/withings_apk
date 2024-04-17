package com.withings.wiscale2.device.common.feature.activitygoal;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.device.Device;
import com.withings.wiscale2.device.common.feature.activitygoal.SetFitnessAndStepsGoalActivity;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class z extends kotlin.jvm.internal.w implements ym0.a<Device> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SetFitnessAndStepsGoalActivity.c f50971a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(SetFitnessAndStepsGoalActivity.c cVar) {
        super(0);
        this.f50971a = cVar;
    }

    @Override // ym0.a
    public final Device invoke() {
        SetFitnessAndStepsGoalActivity.c cVar = this.f50971a;
        cVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Device.class);
        Activity activity = cVar.f50909b;
        if (isAssignableFrom) {
            return (Device) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "device");
        }
        if (Serializable.class.isAssignableFrom(Device.class)) {
            return (Device) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "device");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra device of class ", q0.b(Device.class), " is not supported"));
    }
}
