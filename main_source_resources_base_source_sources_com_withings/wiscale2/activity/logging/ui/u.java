package com.withings.wiscale2.activity.logging.ui;
/* compiled from: EditWorkoutActivity.kt */
/* loaded from: classes4.dex */
final class u extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EditWorkoutActivity f48454a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(EditWorkoutActivity editWorkoutActivity) {
        super(1);
        this.f48454a = editWorkoutActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(Boolean bool) {
        Boolean bool2 = bool;
        if (bool2 != null) {
            EditWorkoutActivity.z4(this.f48454a, bool2.booleanValue());
        }
        return nm0.y.f85009a;
    }
}
