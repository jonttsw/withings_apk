package com.withings.wiscale2.vo2max.view;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.withings.wiscale2.C1987R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Vo2MaxImprovement.kt */
/* loaded from: classes5.dex */
public final class o0 extends kotlin.jvm.internal.w implements ym0.a<NestedScrollView> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ q0 f62794a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(q0 q0Var) {
        super(0);
        this.f62794a = q0Var;
    }

    @Override // ym0.a
    public final NestedScrollView invoke() {
        View view;
        view = this.f62794a.f62801b;
        return (NestedScrollView) view.findViewById(C1987R.id.scroll_view);
    }
}
