package com.withings.wiscale2.user.ui;

import com.withings.wiscale2.C1987R;
/* compiled from: EditUserMeasureActivity.kt */
/* loaded from: classes5.dex */
final class l extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EditUserMeasureActivity f61836a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(EditUserMeasureActivity editUserMeasureActivity) {
        super(1);
        this.f61836a = editUserMeasureActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(Boolean bool) {
        tb0.l K3;
        tb0.l K32;
        boolean e11 = kotlin.jvm.internal.u.e(bool, Boolean.TRUE);
        EditUserMeasureActivity editUserMeasureActivity = this.f61836a;
        if (e11) {
            K32 = editUserMeasureActivity.K3();
            K32.f99293c.h(C1987R.string._INVALID_HEIGHT_);
        } else {
            K3 = editUserMeasureActivity.K3();
            K3.f99293c.e();
        }
        return nm0.y.f85009a;
    }
}
