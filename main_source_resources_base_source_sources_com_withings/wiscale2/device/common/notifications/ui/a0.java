package com.withings.wiscale2.device.common.notifications.ui;

import com.withings.wiscale2.device.common.notifications.ui.l1;
/* compiled from: DeviceNotificationSettingsFragment.kt */
/* loaded from: classes5.dex */
final class a0 extends kotlin.jvm.internal.w implements ym0.q<s0.b, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ m f52829a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ l1.a f52830b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ f1 f52831c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(m mVar, f1 f1Var, l1.a aVar) {
        super(3);
        this.f52829a = mVar;
        this.f52830b = aVar;
        this.f52831c = f1Var;
    }

    @Override // ym0.q
    public final nm0.y invoke(s0.b bVar, androidx.compose.runtime.a aVar, Integer num) {
        s0.b item = bVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(item, "$this$item");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            boolean c11 = this.f52830b.c();
            f1 f1Var = this.f52831c;
            m mVar = this.f52829a;
            m.v1(mVar, c11, new z(f1Var, mVar), aVar2, 512);
        }
        return nm0.y.f85009a;
    }
}
