package com.withings.common.device.companion;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.common.device.companion.CompanionLinkActivity;
import com.withings.device.Device;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.w;
/* compiled from: Activity.kt */
/* loaded from: classes3.dex */
public final class f extends w implements ym0.a<Device> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CompanionLinkActivity.b f35096a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CompanionLinkActivity.b bVar) {
        super(0);
        this.f35096a = bVar;
    }

    @Override // ym0.a
    public final Device invoke() {
        CompanionLinkActivity.b bVar = this.f35096a;
        bVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Device.class);
        Activity activity = bVar.f35068b;
        if (isAssignableFrom) {
            return (Device) b0.F(activity, "device");
        }
        if (Serializable.class.isAssignableFrom(Device.class)) {
            return (Device) b0.H(activity, "device");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra device of class ", q0.b(Device.class), " is not supported"));
    }
}
