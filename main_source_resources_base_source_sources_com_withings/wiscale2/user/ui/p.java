package com.withings.wiscale2.user.ui;
/* compiled from: EditUserMeasureActivity.kt */
/* loaded from: classes5.dex */
final class p extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EditUserMeasureActivity f61840a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(EditUserMeasureActivity editUserMeasureActivity) {
        super(1);
        this.f61840a = editUserMeasureActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(Boolean bool) {
        Boolean bool2 = bool;
        kotlin.jvm.internal.u.g(bool2);
        boolean booleanValue = bool2.booleanValue();
        EditUserMeasureActivity editUserMeasureActivity = this.f61840a;
        if (booleanValue) {
            EditUserMeasureActivity.J3(editUserMeasureActivity);
        } else {
            EditUserMeasureActivity.D3(editUserMeasureActivity);
        }
        return nm0.y.f85009a;
    }
}
