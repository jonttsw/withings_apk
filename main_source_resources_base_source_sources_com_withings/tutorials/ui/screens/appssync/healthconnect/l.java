package com.withings.tutorials.ui.screens.appssync.healthconnect;

import android.app.Activity;
import android.os.Parcelable;
import com.withings.tutorials.ui.screens.appssync.healthconnect.HealthConnectActivationActivity;
import java.io.Serializable;
/* compiled from: Activity.kt */
/* loaded from: classes4.dex */
public final class l extends kotlin.jvm.internal.w implements ym0.a<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HealthConnectActivationActivity.c f44986a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(HealthConnectActivationActivity.c cVar) {
        super(0);
        this.f44986a = cVar;
    }

    @Override // ym0.a
    public final Boolean invoke() {
        HealthConnectActivationActivity.c cVar = this.f44986a;
        cVar.getClass();
        boolean isAssignableFrom = Parcelable.class.isAssignableFrom(Boolean.class);
        Activity activity = cVar.f44881b;
        if (isAssignableFrom) {
            return (Boolean) com.withings.wiscale2.device.hwa08.postinstall.b0.F(activity, "installed");
        }
        if (Serializable.class.isAssignableFrom(Boolean.class)) {
            return (Boolean) com.withings.wiscale2.device.hwa08.postinstall.b0.H(activity, "installed");
        }
        throw new IllegalArgumentException(androidx.work.impl.g.a("extra installed of class ", kotlin.jvm.internal.q0.b(Boolean.class), " is not supported"));
    }
}
