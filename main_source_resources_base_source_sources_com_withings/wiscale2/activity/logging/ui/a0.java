package com.withings.wiscale2.activity.logging.ui;
/* compiled from: EditWorkoutActivity.kt */
/* loaded from: classes4.dex */
final class a0 extends kotlin.jvm.internal.w implements ym0.l<Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EditWorkoutActivity f48331a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(EditWorkoutActivity editWorkoutActivity) {
        super(1);
        this.f48331a = editWorkoutActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(Integer num) {
        nm0.y yVar;
        Integer num2 = num;
        EditWorkoutActivity editWorkoutActivity = this.f48331a;
        if (num2 != null) {
            int intValue = num2.intValue();
            EditWorkoutActivity.h4(editWorkoutActivity).setValue(String.valueOf(intValue));
            EditWorkoutActivity.h4(editWorkoutActivity).setVisibility(0);
            EditWorkoutActivity.w4(editWorkoutActivity, Integer.valueOf(intValue));
            yVar = nm0.y.f85009a;
        } else {
            yVar = null;
        }
        if (yVar == null) {
            EditWorkoutActivity.h4(editWorkoutActivity).setVisibility(8);
        }
        return nm0.y.f85009a;
    }
}
