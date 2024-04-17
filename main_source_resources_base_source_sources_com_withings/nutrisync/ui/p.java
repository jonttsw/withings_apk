package com.withings.nutrisync.ui;
/* compiled from: VitaminCDatavizActivity.kt */
/* loaded from: classes4.dex */
final class p extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ VitaminCDatavizActivity f43278a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(VitaminCDatavizActivity vitaminCDatavizActivity) {
        super(0);
        this.f43278a = vitaminCDatavizActivity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        VitaminCDatavizActivity vitaminCDatavizActivity = this.f43278a;
        vitaminCDatavizActivity.setResult(0);
        vitaminCDatavizActivity.finish();
        return nm0.y.f85009a;
    }
}
