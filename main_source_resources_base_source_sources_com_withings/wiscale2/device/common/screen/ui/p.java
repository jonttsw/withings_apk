package com.withings.wiscale2.device.common.screen.ui;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.device.Device;
import com.withings.wiscale2.device.common.screen.ui.ScreenSelectionActivity;
import java.io.Serializable;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class p extends kotlin.jvm.internal.w implements ym0.a<Device> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ScreenSelectionActivity.o f53406a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ScreenSelectionActivity.o oVar) {
        super(0);
        this.f53406a = oVar;
    }

    @Override // ym0.a
    public final Device invoke() {
        ScreenSelectionActivity.o oVar = this.f53406a;
        oVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Device.class);
        Activity activity = oVar.f53156b;
        if (isAssignableFrom) {
            return (Device) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "device");
        }
        if (Serializable.class.isAssignableFrom(Device.class)) {
            return (Device) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "device");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra device of class ", kotlin.jvm.internal.q0.b(Device.class), " is not supported"));
    }
}
