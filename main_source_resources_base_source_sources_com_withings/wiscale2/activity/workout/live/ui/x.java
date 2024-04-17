package com.withings.wiscale2.activity.workout.live.ui;

import androidx.constraintlayout.widget.Group;
/* compiled from: LiveWorkoutDistanceFragment.kt */
/* loaded from: classes4.dex */
final class x extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d0 f48944a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(d0 d0Var) {
        super(1);
        this.f48944a = d0Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(Boolean bool) {
        Group group;
        int i11;
        Boolean bool2 = bool;
        if (bool2 != null) {
            boolean booleanValue = bool2.booleanValue();
            group = this.f48944a.f48874k;
            if (group != null) {
                if (booleanValue) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                group.setVisibility(i11);
            } else {
                kotlin.jvm.internal.u.s("hrViews");
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}
