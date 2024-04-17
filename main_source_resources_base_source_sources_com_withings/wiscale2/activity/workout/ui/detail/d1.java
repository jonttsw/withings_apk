package com.withings.wiscale2.activity.workout.ui.detail;
/* compiled from: PostWorkoutActivity.kt */
/* loaded from: classes4.dex */
final class d1 extends kotlin.jvm.internal.w implements ym0.l<String, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ PostWorkoutActivity f49156a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(PostWorkoutActivity postWorkoutActivity) {
        super(1);
        this.f49156a = postWorkoutActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(String str) {
        tb0.i0 i0Var;
        String it = str;
        kotlin.jvm.internal.u.j(it, "it");
        i0Var = this.f49156a.f49067j;
        if (i0Var != null) {
            i0Var.f99163f.setTitle(it);
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("binding");
        throw null;
    }
}
