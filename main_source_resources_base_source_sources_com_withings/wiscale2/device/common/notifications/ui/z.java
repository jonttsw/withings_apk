package com.withings.wiscale2.device.common.notifications.ui;

import com.withings.comm.wpp.generated.object.AncsStatus;
import com.withings.wiscale2.device.common.notifications.ui.m;
/* compiled from: DeviceNotificationSettingsFragment.kt */
/* loaded from: classes5.dex */
final class z extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f1 f53051a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ m f53052b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(f1 f1Var, m mVar) {
        super(1);
        this.f53051a = f1Var;
        this.f53052b = mVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(Boolean bool) {
        m.a aVar;
        bool.getClass();
        AncsStatus a12 = this.f53051a.a1();
        aVar = this.f53052b.f52955n;
        if (aVar != null) {
            aVar.C1(a12);
        }
        return nm0.y.f85009a;
    }
}
