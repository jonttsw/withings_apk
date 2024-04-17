package com.withings.tutorials.ui;

import com.withings.device.Device;
import k1.o1;
import k1.r0;
/* compiled from: DeviceIntroductionActivity.kt */
/* loaded from: classes4.dex */
final class i extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ o1<Device> f44761a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ o1<Long> f44762b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ DeviceIntroductionActivity f44763c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r0 r0Var, r0 r0Var2, DeviceIntroductionActivity deviceIntroductionActivity) {
        super(0);
        this.f44761a = r0Var;
        this.f44762b = r0Var2;
        this.f44763c = deviceIntroductionActivity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        cr.a.a(new nm0.j(this.f44761a.getValue(), this.f44762b.getValue()), new h(this.f44763c));
        return nm0.y.f85009a;
    }
}
