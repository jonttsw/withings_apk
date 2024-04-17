package com.withings.wiscale2.device.common.ui;

import android.app.Application;
import androidx.lifecycle.k1;
/* compiled from: Extensions.kt */
/* loaded from: classes5.dex */
public final class i0 implements k1.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DeviceSharingActivity f53978a;

    public i0(DeviceSharingActivity deviceSharingActivity) {
        this.f53978a = deviceSharingActivity;
    }

    @Override // androidx.lifecycle.k1.b
    public final <U extends androidx.lifecycle.g1> U create(Class<U> modelClass) {
        kotlin.jvm.internal.u.j(modelClass, "modelClass");
        DeviceSharingActivity deviceSharingActivity = this.f53978a;
        Application application = deviceSharingActivity.getApplication();
        kotlin.jvm.internal.u.i(application, "getApplication(...)");
        return new p0(application, DeviceSharingActivity.C3(deviceSharingActivity), DeviceSharingActivity.E3(deviceSharingActivity));
    }
}
