package com.withings.wiscale2.activity.logging.ui;

import com.withings.wiscale2.activity.logging.ui.m0;
/* compiled from: EditWorkoutActivity.kt */
/* loaded from: classes4.dex */
final class w extends kotlin.jvm.internal.w implements ym0.l<m0.d, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EditWorkoutActivity f48463a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(EditWorkoutActivity editWorkoutActivity) {
        super(1);
        this.f48463a = editWorkoutActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(m0.d dVar) {
        m0.d dVar2 = dVar;
        if (dVar2 != null) {
            EditWorkoutActivity editWorkoutActivity = this.f48463a;
            EditWorkoutActivity.l4(editWorkoutActivity).setValue(dVar2.b());
            EditWorkoutActivity.f4(editWorkoutActivity).setValue(dVar2.a());
        }
        return nm0.y.f85009a;
    }
}
