package com.withings.wiscale2.device.common.tutorial.navigation;

import android.app.Activity;
import android.os.Parcelable;
import androidx.work.impl.g;
import com.withings.device.Device;
import com.withings.wiscale2.device.common.tutorial.navigation.NavigationTutorialActivity;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.w;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class d extends w implements ym0.a<Device> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ NavigationTutorialActivity.f f53649a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(NavigationTutorialActivity.f fVar) {
        super(0);
        this.f53649a = fVar;
    }

    @Override // ym0.a
    public final Device invoke() {
        NavigationTutorialActivity.f fVar = this.f53649a;
        fVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Device.class);
        Activity activity = fVar.f53644b;
        if (isAssignableFrom) {
            return (Device) b0.F(activity, "device");
        }
        if (Serializable.class.isAssignableFrom(Device.class)) {
            return (Device) b0.H(activity, "device");
        }
        throw new IllegalArgumentException(g.a("extra device of class ", q0.b(Device.class), " is not supported"));
    }
}
