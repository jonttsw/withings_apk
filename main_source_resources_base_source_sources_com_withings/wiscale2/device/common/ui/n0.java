package com.withings.wiscale2.device.common.ui;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.wiscale2.device.common.ui.DeviceSharingActivity;
import java.io.Serializable;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class n0 extends kotlin.jvm.internal.w implements ym0.a<u70.i> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DeviceSharingActivity.c f54031a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(DeviceSharingActivity.c cVar) {
        super(0);
        this.f54031a = cVar;
    }

    @Override // ym0.a
    public final u70.i invoke() {
        DeviceSharingActivity.c cVar = this.f54031a;
        cVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(u70.i.class);
        Activity activity = cVar.f53701b;
        if (isAssignableFrom) {
            return (u70.i) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "EXTRA_MAC_ADDRESS");
        }
        if (Serializable.class.isAssignableFrom(u70.i.class)) {
            return (u70.i) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "EXTRA_MAC_ADDRESS");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra EXTRA_MAC_ADDRESS of class ", kotlin.jvm.internal.q0.b(u70.i.class), " is not supported"));
    }
}
