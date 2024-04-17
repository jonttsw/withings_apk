package com.withings.wiscale2.device.common.feature.ecg;
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class z0 extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f52142a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(EcgActivationActivity ecgActivationActivity) {
        super(1);
        this.f52142a = ecgActivationActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(Boolean bool) {
        this.f52142a.U3().X0(bool.booleanValue());
        return nm0.y.f85009a;
    }
}
