package com.withings.wiscale2.device.common.feature.highlowhr;
/* compiled from: HighLowHRActivationActivity.kt */
/* loaded from: classes5.dex */
final class n extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HighLowHRActivationActivity f52303a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(HighLowHRActivationActivity highLowHRActivationActivity) {
        super(1);
        this.f52303a = highLowHRActivationActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(Boolean bool) {
        if (!bool.booleanValue()) {
            this.f52303a.finish();
        }
        return nm0.y.f85009a;
    }
}
