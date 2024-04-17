package com.withings.wiscale2.vo2max.view;

import android.view.View;
import com.withings.views.view.HorizontalScaleView;
import com.withings.wiscale2.C1987R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Vo2MaxImprovement.kt */
/* loaded from: classes5.dex */
public final class j0 extends kotlin.jvm.internal.w implements ym0.a<HorizontalScaleView> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ q0 f62777a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(q0 q0Var) {
        super(0);
        this.f62777a = q0Var;
    }

    @Override // ym0.a
    public final HorizontalScaleView invoke() {
        View view;
        view = this.f62777a.f62801b;
        return (HorizontalScaleView) view.findViewById(C1987R.id.vo2max_improvement_view_scale);
    }
}
