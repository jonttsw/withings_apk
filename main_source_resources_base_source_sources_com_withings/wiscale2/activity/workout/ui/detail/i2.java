package com.withings.wiscale2.activity.workout.ui.detail;

import com.withings.views.view.HorizontalScaleView;
import java.util.List;
/* compiled from: WorkoutDetailFragment.kt */
/* loaded from: classes4.dex */
final class i2 extends kotlin.jvm.internal.w implements ym0.l<List<? extends HorizontalScaleView.f>, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ x1 f49235a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(x1 x1Var) {
        super(1);
        this.f49235a = x1Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(List<? extends HorizontalScaleView.f> list) {
        ab0.e0 e0Var;
        List<? extends HorizontalScaleView.f> list2 = list;
        if (list2 != null) {
            e0Var = this.f49235a.f49791s;
            if (e0Var != null) {
                e0Var.h(list2);
            } else {
                kotlin.jvm.internal.u.s("performanceView");
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}
