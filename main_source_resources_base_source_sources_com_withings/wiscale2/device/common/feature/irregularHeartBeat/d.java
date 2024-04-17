package com.withings.wiscale2.device.common.feature.irregularHeartBeat;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.device.Device;
import com.withings.wiscale2.device.common.feature.irregularHeartBeat.IrregularHeartBeatActivationActivity;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.w;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class d extends w implements ym0.a<Device> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ IrregularHeartBeatActivationActivity.c f52357a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(IrregularHeartBeatActivationActivity.c cVar) {
        super(0);
        this.f52357a = cVar;
    }

    @Override // ym0.a
    public final Device invoke() {
        IrregularHeartBeatActivationActivity.c cVar = this.f52357a;
        cVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Device.class);
        Activity activity = cVar.f52335b;
        if (isAssignableFrom) {
            return (Device) b0.F(activity, "device");
        }
        if (Serializable.class.isAssignableFrom(Device.class)) {
            return (Device) b0.H(activity, "device");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra device of class ", q0.b(Device.class), " is not supported"));
    }
}
