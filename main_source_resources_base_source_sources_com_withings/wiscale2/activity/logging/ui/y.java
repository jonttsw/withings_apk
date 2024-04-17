package com.withings.wiscale2.activity.logging.ui;

import com.withings.wiscale2.activity.logging.ui.m0;
/* compiled from: EditWorkoutActivity.kt */
/* loaded from: classes4.dex */
final class y extends kotlin.jvm.internal.w implements ym0.l<m0.b, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EditWorkoutActivity f48465a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(EditWorkoutActivity editWorkoutActivity) {
        super(1);
        this.f48465a = editWorkoutActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(m0.b bVar) {
        m0.b bVar2 = bVar;
        EditWorkoutActivity editWorkoutActivity = this.f48465a;
        if (bVar2 != null) {
            EditWorkoutActivity.a4(editWorkoutActivity).setValue(bVar2.b());
            EditWorkoutActivity.u4(editWorkoutActivity, bVar2);
        }
        EditWorkoutActivity.i4(editWorkoutActivity).setVisibility(8);
        EditWorkoutActivity.j4(editWorkoutActivity).setVisibility(0);
        return nm0.y.f85009a;
    }
}
