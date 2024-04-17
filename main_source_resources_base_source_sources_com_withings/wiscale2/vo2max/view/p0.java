package com.withings.wiscale2.vo2max.view;

import android.view.View;
import android.widget.TextView;
import com.withings.wiscale2.C1987R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Vo2MaxImprovement.kt */
/* loaded from: classes5.dex */
public final class p0 extends kotlin.jvm.internal.w implements ym0.a<TextView> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ q0 f62797a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(q0 q0Var) {
        super(0);
        this.f62797a = q0Var;
    }

    @Override // ym0.a
    public final TextView invoke() {
        View view;
        view = this.f62797a.f62801b;
        return (TextView) view.findViewById(C1987R.id.vo2max_improvement_view_subtitle);
    }
}
