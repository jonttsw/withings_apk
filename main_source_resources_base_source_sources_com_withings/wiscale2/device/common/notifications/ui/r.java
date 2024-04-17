package com.withings.wiscale2.device.common.notifications.ui;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DeviceNotificationSettingsFragment.kt */
/* loaded from: classes5.dex */
public final class r extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ m f53002a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ h1 f53003b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f53004c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(m mVar, h1 h1Var, int i11) {
        super(2);
        this.f53002a = mVar;
        this.f53003b = h1Var;
        this.f53004c = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f53004c | 1);
        m.w1(this.f53002a, this.f53003b, aVar, g11);
        return nm0.y.f85009a;
    }
}
