package com.withings.wiscale2.device.common.feature.ecg;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
public final class f7 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationActivity f51344a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7(WBS08EcgActivationActivity wBS08EcgActivationActivity) {
        super(0);
        this.f51344a = wBS08EcgActivationActivity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        this.f51344a.finish();
        return nm0.y.f85009a;
    }
}
