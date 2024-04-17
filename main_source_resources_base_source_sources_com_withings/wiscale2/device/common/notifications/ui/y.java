package com.withings.wiscale2.device.common.notifications.ui;

import com.withings.wiscale2.device.common.notifications.ui.l1;
/* compiled from: DeviceNotificationSettingsFragment.kt */
/* loaded from: classes5.dex */
final class y extends kotlin.jvm.internal.w implements ym0.q<s0.b, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ m f53046a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ l1.a f53047b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(m mVar, l1.a aVar) {
        super(3);
        this.f53046a = mVar;
        this.f53047b = aVar;
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
            m.w1(this.f53046a, this.f53047b.d(), aVar2, 64);
        }
        return nm0.y.f85009a;
    }
}
