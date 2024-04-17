package com.withings.wiscale2.device.common.notifications.ui;

import com.withings.wiscale2.device.common.notifications.ui.l1;
/* compiled from: DeviceNotificationSettingsFragment.kt */
/* loaded from: classes5.dex */
final class e0 extends kotlin.jvm.internal.w implements ym0.q<s0.b, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ m f52867a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ f1 f52868b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ l1.a f52869c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(m mVar, f1 f1Var, l1.a aVar) {
        super(3);
        this.f52867a = mVar;
        this.f52868b = f1Var;
        this.f52869c = aVar;
    }

    @Override // ym0.q
    public final nm0.y invoke(s0.b bVar, androidx.compose.runtime.a aVar, Integer num) {
        s0.b stickyHeader = bVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(stickyHeader, "$this$stickyHeader");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            m.t1(this.f52867a, new d0(this.f52868b, this.f52869c), aVar2, 64);
        }
        return nm0.y.f85009a;
    }
}
