package com.withings.wiscale2.device.common.ui;

import android.app.Application;
import com.withings.device.DeviceModel;
import com.withings.wiscale2.C1987R;
import java.util.Arrays;
/* compiled from: DeviceSharingActivity.kt */
/* loaded from: classes5.dex */
final class q0 extends kotlin.jvm.internal.w implements ym0.p<fl.o, DeviceModel, String> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Application f54061a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(Application application) {
        super(2);
        this.f54061a = application;
    }

    @Override // ym0.p
    public final String invoke(fl.o oVar, DeviceModel deviceModel) {
        fl.o hmDeviceModel = oVar;
        DeviceModel deviceModel2 = deviceModel;
        kotlin.jvm.internal.u.j(hmDeviceModel, "hmDeviceModel");
        kotlin.jvm.internal.u.j(deviceModel2, "deviceModel");
        Application application = this.f54061a;
        String string = application.getString(C1987R.string.deviceSharing_description);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        return String.format(string, Arrays.copyOf(new Object[]{application.getString(hmDeviceModel.I(deviceModel2.a()))}, 1));
    }
}
