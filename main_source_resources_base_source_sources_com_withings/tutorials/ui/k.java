package com.withings.tutorials.ui;

import com.withings.device.Device;
import k1.o1;
import k1.r0;
/* compiled from: DeviceIntroductionActivity.kt */
/* loaded from: classes4.dex */
final class k extends kotlin.jvm.internal.w implements ym0.a<String> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ o1<Device> f44769a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(r0 r0Var) {
        super(0);
        this.f44769a = r0Var;
    }

    @Override // ym0.a
    public final String invoke() {
        Device value = this.f44769a.getValue();
        if (value != null) {
            return value.getColor();
        }
        return null;
    }
}
