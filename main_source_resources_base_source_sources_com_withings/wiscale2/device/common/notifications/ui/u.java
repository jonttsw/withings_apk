package com.withings.wiscale2.device.common.notifications.ui;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DeviceNotificationSettingsFragment.kt */
/* loaded from: classes5.dex */
public final class u extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ m f53014a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ f1 f53015b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f53016c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(m mVar, f1 f1Var, int i11) {
        super(2);
        this.f53014a = mVar;
        this.f53015b = f1Var;
        this.f53016c = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f53016c | 1);
        m.y1(this.f53014a, this.f53015b, aVar, g11);
        return nm0.y.f85009a;
    }
}
