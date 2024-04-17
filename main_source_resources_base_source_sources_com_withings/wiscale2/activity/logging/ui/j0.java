package com.withings.wiscale2.activity.logging.ui;
/* compiled from: EditWorkoutActivity.kt */
/* loaded from: classes4.dex */
final class j0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EditWorkoutActivity f48356a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(EditWorkoutActivity editWorkoutActivity) {
        super(0);
        this.f48356a = editWorkoutActivity;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        EditWorkoutActivity editWorkoutActivity = this.f48356a;
        editWorkoutActivity.setResult(-1);
        editWorkoutActivity.finish();
        return nm0.y.f85009a;
    }
}
