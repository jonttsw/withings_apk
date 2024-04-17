package com.withings.wiscale2.device.common.notifications.ui;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DeviceNotificationSettingsFragment.kt */
/* loaded from: classes5.dex */
public final class t extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ m f53012a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f53013b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(m mVar, int i11) {
        super(2);
        this.f53012a = mVar;
        this.f53013b = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f53013b | 1);
        m.x1(this.f53012a, aVar, g11);
        return nm0.y.f85009a;
    }
}
