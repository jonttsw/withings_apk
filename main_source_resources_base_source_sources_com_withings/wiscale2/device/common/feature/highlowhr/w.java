package com.withings.wiscale2.device.common.feature.highlowhr;
/* compiled from: HighLowHRSettingsActivity.kt */
/* loaded from: classes5.dex */
final class w extends kotlin.jvm.internal.w implements ym0.l<Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HighLowHRSettingsActivity f52314a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(HighLowHRSettingsActivity highLowHRSettingsActivity) {
        super(1);
        this.f52314a = highLowHRSettingsActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(Integer num) {
        tb0.x J3;
        String K3;
        HighLowHRSettingsActivity highLowHRSettingsActivity = this.f52314a;
        J3 = highLowHRSettingsActivity.J3();
        K3 = highLowHRSettingsActivity.K3(num);
        J3.f99603f.setValue(K3);
        return nm0.y.f85009a;
    }
}
