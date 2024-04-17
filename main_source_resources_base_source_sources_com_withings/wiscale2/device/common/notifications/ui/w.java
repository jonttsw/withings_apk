package com.withings.wiscale2.device.common.notifications.ui;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DeviceNotificationSettingsFragment.kt */
/* loaded from: classes5.dex */
public final class w extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ m f53033a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ f1 f53034b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f53035c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(m mVar, f1 f1Var, int i11) {
        super(2);
        this.f53033a = mVar;
        this.f53034b = f1Var;
        this.f53035c = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f53035c | 1);
        m.z1(this.f53033a, this.f53034b, aVar, g11);
        return nm0.y.f85009a;
    }
}
