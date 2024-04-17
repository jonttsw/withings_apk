package com.withings.wiscale2.device.common.notifications.ui;

import com.withings.comm.wpp.generated.object.AncsStatus;
import com.withings.wiscale2.device.common.notifications.ui.m;
/* compiled from: DeviceNotificationSettingsFragment.kt */
/* loaded from: classes5.dex */
final class c0 extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f1 f52842a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ b f52843b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ m f52844c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(f1 f1Var, b bVar, m mVar) {
        super(1);
        this.f52842a = f1Var;
        this.f52843b = bVar;
        this.f52844c = mVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(Boolean bool) {
        m.a aVar;
        AncsStatus Y0 = this.f52842a.Y0(bool.booleanValue(), this.f52843b);
        aVar = this.f52844c.f52955n;
        if (aVar != null) {
            aVar.C1(Y0);
        }
        return nm0.y.f85009a;
    }
}
