package com.withings.wiscale2.activity.workout.ui.detail;

import com.google.android.material.button.MaterialButton;
/* compiled from: PostWorkoutActivity.kt */
/* loaded from: classes4.dex */
final class f1 extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ PostWorkoutActivity f49186a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(PostWorkoutActivity postWorkoutActivity) {
        super(1);
        this.f49186a = postWorkoutActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(Boolean bool) {
        tb0.i0 i0Var;
        int i11;
        boolean booleanValue = bool.booleanValue();
        i0Var = this.f49186a.f49067j;
        if (i0Var != null) {
            MaterialButton summaryShare = i0Var.f99162e;
            kotlin.jvm.internal.u.i(summaryShare, "summaryShare");
            if (booleanValue) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            summaryShare.setVisibility(i11);
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("binding");
        throw null;
    }
}
