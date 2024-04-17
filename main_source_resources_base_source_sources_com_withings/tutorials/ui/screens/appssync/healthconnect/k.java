package com.withings.tutorials.ui.screens.appssync.healthconnect;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.tutorials.ui.screens.appssync.healthconnect.HealthConnectActivationActivity;
import java.io.Serializable;
/* compiled from: Activity.kt */
/* loaded from: classes4.dex */
public final class k extends kotlin.jvm.internal.w implements ym0.a<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HealthConnectActivationActivity.b f44980a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(HealthConnectActivationActivity.b bVar) {
        super(0);
        this.f44980a = bVar;
    }

    @Override // ym0.a
    public final Boolean invoke() {
        HealthConnectActivationActivity.b bVar = this.f44980a;
        bVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Boolean.class);
        Activity activity = bVar.f44879b;
        if (isAssignableFrom) {
            return (Boolean) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "activated");
        }
        if (Serializable.class.isAssignableFrom(Boolean.class)) {
            return (Boolean) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "activated");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra activated of class ", kotlin.jvm.internal.q0.b(Boolean.class), " is not supported"));
    }
}
