package com.withings.wiscale2.activity.logging.ui;

import com.google.android.material.button.MaterialButton;
/* compiled from: EditWorkoutActivity.kt */
/* loaded from: classes4.dex */
final class b0 extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EditWorkoutActivity f48334a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(EditWorkoutActivity editWorkoutActivity) {
        super(1);
        this.f48334a = editWorkoutActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(Boolean bool) {
        int i11;
        Boolean bool2 = bool;
        MaterialButton d42 = EditWorkoutActivity.d4(this.f48334a);
        kotlin.jvm.internal.u.g(bool2);
        if (bool2.booleanValue()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        d42.setVisibility(i11);
        return nm0.y.f85009a;
    }
}
