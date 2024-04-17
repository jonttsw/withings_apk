package com.withings.wiscale2.device.common.feature.ecg;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class m0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f51513a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(EcgActivationActivity ecgActivationActivity) {
        super(0);
        this.f51513a = ecgActivationActivity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        this.f51513a.finish();
        return nm0.y.f85009a;
    }
}
