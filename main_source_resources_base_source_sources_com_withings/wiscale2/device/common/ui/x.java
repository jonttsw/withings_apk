package com.withings.wiscale2.device.common.ui;

import com.withings.wiscale2.device.common.ui.DeviceBondingActivity;
/* compiled from: Activity.kt */
/* loaded from: classes5.dex */
public final class x extends kotlin.jvm.internal.w implements ym0.a<String> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DeviceBondingActivity.c f54118a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(DeviceBondingActivity.c cVar) {
        super(0);
        this.f54118a = cVar;
    }

    @Override // ym0.a
    public final String invoke() {
        return com.withings.wiscale2.device.hwa08.postinstall.b0.I(this.f54118a.f53662b, "key_mac_address");
    }
}
