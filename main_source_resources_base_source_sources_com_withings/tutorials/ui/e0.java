package com.withings.tutorials.ui;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.device.Device;
import com.withings.tutorials.ui.TutorialActivity;
import java.io.Serializable;
import kotlin.jvm.internal.q0;
/* compiled from: Activity.kt */
/* loaded from: classes4.dex */
public final class e0 extends kotlin.jvm.internal.w implements ym0.a<Device> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TutorialActivity.e f44741a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(TutorialActivity.e eVar) {
        super(0);
        this.f44741a = eVar;
    }

    @Override // ym0.a
    public final Device invoke() {
        TutorialActivity.e eVar = this.f44741a;
        eVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Device.class);
        Activity activity = eVar.f44693b;
        if (isAssignableFrom) {
            return (Device) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "device");
        }
        if (Serializable.class.isAssignableFrom(Device.class)) {
            return (Device) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "device");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra device of class ", q0.b(Device.class), " is not supported"));
    }
}
