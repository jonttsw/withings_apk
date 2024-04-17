package com.withings.wiscale2.device.common.notifications.ui;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DeviceNotificationSettingsFragment.kt */
/* loaded from: classes5.dex */
public final class l extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ m f52938a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.l<Boolean, nm0.y> f52939b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f52940c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l(m mVar, ym0.l<? super Boolean, nm0.y> lVar, int i11) {
        super(2);
        this.f52938a = mVar;
        this.f52939b = lVar;
        this.f52940c = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f52940c | 1);
        m.t1(this.f52938a, this.f52939b, aVar, g11);
        return nm0.y.f85009a;
    }
}
