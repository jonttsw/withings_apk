package com.withings.wiscale2.activity.workout.ui.detail;
/* compiled from: WorkoutPhoto.kt */
/* loaded from: classes4.dex */
final class d7 extends kotlin.jvm.internal.w implements ym0.p<w0, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b7 f49165a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7(b7 b7Var) {
        super(2);
        this.f49165a = b7Var;
    }

    @Override // ym0.p
    public final nm0.y invoke(w0 w0Var, Integer num) {
        w0 photoItem = w0Var;
        num.intValue();
        kotlin.jvm.internal.u.j(photoItem, "photoItem");
        b7 b7Var = this.f49165a;
        b7Var.a().I0(b7Var, photoItem);
        return nm0.y.f85009a;
    }
}
