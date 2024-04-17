package com.withings.wiscale2.activity.workout.ui.detail;

import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.activity.workout.ui.detail.x1;
/* compiled from: WorkoutDetailFragment.kt */
/* loaded from: classes4.dex */
final class u2 extends kotlin.jvm.internal.w implements ym0.l<xw.c<? extends Boolean>, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ x1 f49679a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(x1 x1Var) {
        super(1);
        this.f49679a = x1Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(xw.c<? extends Boolean> cVar) {
        Boolean a11;
        xw.c<? extends Boolean> cVar2 = cVar;
        if (cVar2 != null && (a11 = cVar2.a()) != null) {
            boolean booleanValue = a11.booleanValue();
            x1 x1Var = this.f49679a;
            if (booleanValue) {
                x1.W1(x1Var);
            } else {
                x1.a aVar = x1.B;
                qc.b B = new qc.b(x1Var.requireContext()).B(x1Var.getString(C1987R.string._DELETE_MANUAL_ACTIVITY_CONFIRMATION_));
                B.A(x1Var.getString(C1987R.string._YES_), new vn.c(x1Var, 3));
                B.w(C1987R.string._CANCEL_, new dq.l(x1Var, 2)).s();
            }
        }
        return nm0.y.f85009a;
    }
}
