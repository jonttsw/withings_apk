package com.withings.weight.legacy;

import android.widget.ProgressBar;
/* compiled from: WeightDetailActivity.kt */
/* loaded from: classes4.dex */
final class e extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WeightDetailActivity f47049a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(WeightDetailActivity weightDetailActivity) {
        super(1);
        this.f47049a = weightDetailActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(Boolean bool) {
        e90.a E3;
        int i11;
        Boolean bool2 = bool;
        E3 = this.f47049a.E3();
        ProgressBar progressBar = E3.f64952b;
        kotlin.jvm.internal.u.i(progressBar, "progressBar");
        kotlin.jvm.internal.u.g(bool2);
        if (bool2.booleanValue()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        progressBar.setVisibility(i11);
        return nm0.y.f85009a;
    }
}
