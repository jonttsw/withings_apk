package com.withings.wiscale2.device.common.notifications.ui;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DeviceNotificationSettingsFragment.kt */
/* loaded from: classes5.dex */
public final class o extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ m f52983a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f52984b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.l<Boolean, nm0.y> f52985c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f52986d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o(m mVar, boolean z5, ym0.l<? super Boolean, nm0.y> lVar, int i11) {
        super(2);
        this.f52983a = mVar;
        this.f52984b = z5;
        this.f52985c = lVar;
        this.f52986d = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f52986d | 1);
        boolean z5 = this.f52984b;
        ym0.l<Boolean, nm0.y> lVar = this.f52985c;
        m.v1(this.f52983a, z5, lVar, aVar, g11);
        return nm0.y.f85009a;
    }
}
