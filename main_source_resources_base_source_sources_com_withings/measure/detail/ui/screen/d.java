package com.withings.measure.detail.ui.screen;

import android.widget.ProgressBar;
import nm0.y;
/* compiled from: MeasureDetailActivity.kt */
/* loaded from: classes4.dex */
final class d extends kotlin.jvm.internal.w implements ym0.l<Boolean, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ MeasureDetailActivity f41761a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(MeasureDetailActivity measureDetailActivity) {
        super(1);
        this.f41761a = measureDetailActivity;
    }

    @Override // ym0.l
    public final y invoke(Boolean bool) {
        oy.b L3;
        int i11;
        Boolean bool2 = bool;
        L3 = this.f41761a.L3();
        ProgressBar progress = L3.f90075a;
        kotlin.jvm.internal.u.i(progress, "progress");
        kotlin.jvm.internal.u.g(bool2);
        if (bool2.booleanValue()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        progress.setVisibility(i11);
        return y.f85009a;
    }
}
