package com.withings.wiscale2.activity.logging.ui;

import com.withings.wiscale2.activity.logging.ui.m0;
/* compiled from: EditWorkoutActivity.kt */
/* loaded from: classes4.dex */
final class x extends kotlin.jvm.internal.w implements ym0.l<nm0.j<? extends m0.c, ? extends Boolean>, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EditWorkoutActivity f48464a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(EditWorkoutActivity editWorkoutActivity) {
        super(1);
        this.f48464a = editWorkoutActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(nm0.j<? extends m0.c, ? extends Boolean> jVar) {
        nm0.y yVar;
        nm0.j<? extends m0.c, ? extends Boolean> jVar2 = jVar;
        m0.c a11 = jVar2.a();
        boolean booleanValue = jVar2.b().booleanValue();
        EditWorkoutActivity editWorkoutActivity = this.f48464a;
        if (a11 != null) {
            EditWorkoutActivity.e4(editWorkoutActivity).setValue(a11.d());
            EditWorkoutActivity.e4(editWorkoutActivity).setVisibility(0);
            EditWorkoutActivity.v4(editWorkoutActivity, a11, booleanValue);
            yVar = nm0.y.f85009a;
        } else {
            yVar = null;
        }
        if (yVar == null) {
            EditWorkoutActivity.e4(editWorkoutActivity).setVisibility(8);
        }
        return nm0.y.f85009a;
    }
}
