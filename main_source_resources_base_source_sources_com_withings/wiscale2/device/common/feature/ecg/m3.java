package com.withings.wiscale2.device.common.feature.ecg;
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class m3 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f51517a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(EcgActivationActivity ecgActivationActivity) {
        super(0);
        this.f51517a = ecgActivationActivity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        this.f51517a.onBackPressed();
        return nm0.y.f85009a;
    }
}
