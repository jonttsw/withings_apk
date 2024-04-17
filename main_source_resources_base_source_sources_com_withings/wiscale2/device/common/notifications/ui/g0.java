package com.withings.wiscale2.device.common.notifications.ui;

import com.withings.wiscale2.device.common.notifications.ui.l1;
/* compiled from: DeviceNotificationSettingsFragment.kt */
/* loaded from: classes5.dex */
final class g0 extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f1 f52896a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a f52897b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ l1.a f52898c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(f1 f1Var, a aVar, l1.a aVar2) {
        super(1);
        this.f52896a = f1Var;
        this.f52897b = aVar;
        this.f52898c = aVar2;
    }

    @Override // ym0.l
    public final nm0.y invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        this.f52896a.X0(this.f52897b.c(), booleanValue, this.f52898c.c());
        return nm0.y.f85009a;
    }
}
