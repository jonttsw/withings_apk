package com.withings.wiscale2.device.common.notifications.ui;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.wiscale2.device.common.notifications.ui.DeviceNotificationSettingsActivity;
import java.io.Serializable;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class e extends kotlin.jvm.internal.w implements ym0.a<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DeviceNotificationSettingsActivity.f f52866a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(DeviceNotificationSettingsActivity.f fVar) {
        super(0);
        this.f52866a = fVar;
    }

    @Override // ym0.a
    public final Boolean invoke() {
        DeviceNotificationSettingsActivity.f fVar = this.f52866a;
        fVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Boolean.class);
        Activity activity = fVar.f52820b;
        if (isAssignableFrom) {
            return (Boolean) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "from_install");
        }
        if (Serializable.class.isAssignableFrom(Boolean.class)) {
            return (Boolean) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "from_install");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra from_install of class ", kotlin.jvm.internal.q0.b(Boolean.class), " is not supported"));
    }
}
