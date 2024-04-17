package com.withings.wiscale2.device.wpm.ui;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.device.DeviceModel;
import com.withings.wiscale2.device.wpm.ui.Wpm0203Activity;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class y extends kotlin.jvm.internal.w implements ym0.a<DeviceModel> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Wpm0203Activity.h f55794a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Wpm0203Activity.h hVar) {
        super(0);
        this.f55794a = hVar;
    }

    @Override // ym0.a
    public final DeviceModel invoke() {
        Wpm0203Activity.h hVar = this.f55794a;
        hVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(DeviceModel.class);
        Activity activity = hVar.f55676b;
        if (isAssignableFrom) {
            return (DeviceModel) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "deviceModel");
        }
        if (Serializable.class.isAssignableFrom(DeviceModel.class)) {
            return (DeviceModel) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "deviceModel");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra deviceModel of class ", q0.b(DeviceModel.class), " is not supported"));
    }
}
