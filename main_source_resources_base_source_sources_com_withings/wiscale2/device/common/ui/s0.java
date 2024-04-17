package com.withings.wiscale2.device.common.ui;

import com.withings.device.DeviceModel;
/* compiled from: DeviceSharingActivity.kt */
/* loaded from: classes5.dex */
final class s0 extends kotlin.jvm.internal.w implements ym0.p<fl.o, DeviceModel, Integer> {

    /* renamed from: a  reason: collision with root package name */
    public static final s0 f54075a = new kotlin.jvm.internal.w(2);

    @Override // ym0.p
    public final Integer invoke(fl.o oVar, DeviceModel deviceModel) {
        fl.o hmDeviceModel = oVar;
        DeviceModel deviceModel2 = deviceModel;
        kotlin.jvm.internal.u.j(hmDeviceModel, "hmDeviceModel");
        kotlin.jvm.internal.u.j(deviceModel2, "deviceModel");
        return Integer.valueOf(hmDeviceModel.M(deviceModel2.a()));
    }
}
