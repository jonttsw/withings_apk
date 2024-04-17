package com.withings.wiscale2.user.ui;
/* compiled from: EditUserMeasureActivity.kt */
/* loaded from: classes5.dex */
final class q extends kotlin.jvm.internal.w implements ym0.l<Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EditUserMeasureActivity f62129a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(EditUserMeasureActivity editUserMeasureActivity) {
        super(1);
        this.f62129a = editUserMeasureActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(Integer num) {
        tb0.l K3;
        tb0.l K32;
        int intValue = num.intValue();
        EditUserMeasureActivity editUserMeasureActivity = this.f62129a;
        K3 = editUserMeasureActivity.K3();
        l70.u unit = K3.f99293c.getUnit();
        if (unit == null || intValue != unit.j()) {
            K32 = editUserMeasureActivity.K3();
            K32.f99293c.j(intValue);
            EditUserMeasureActivity.C3(editUserMeasureActivity).K0(intValue);
        }
        return nm0.y.f85009a;
    }
}
