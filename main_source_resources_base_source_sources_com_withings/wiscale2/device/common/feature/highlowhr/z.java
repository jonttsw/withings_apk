package com.withings.wiscale2.device.common.feature.highlowhr;

import android.widget.ProgressBar;
import androidx.core.widget.NestedScrollView;
import com.withings.views.view.ToggleCellView;
/* compiled from: HighLowHRSettingsActivity.kt */
/* loaded from: classes5.dex */
final class z extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HighLowHRSettingsActivity f52317a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(HighLowHRSettingsActivity highLowHRSettingsActivity) {
        super(1);
        this.f52317a = highLowHRSettingsActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(Boolean bool) {
        tb0.x J3;
        tb0.x J32;
        tb0.x J33;
        Boolean bool2 = bool;
        HighLowHRSettingsActivity highLowHRSettingsActivity = this.f52317a;
        J3 = highLowHRSettingsActivity.J3();
        kotlin.jvm.internal.u.g(bool2);
        boolean booleanValue = bool2.booleanValue();
        ToggleCellView toggleCellView = J3.f99600c;
        toggleCellView.setChecked(booleanValue);
        toggleCellView.A(new y(highLowHRSettingsActivity));
        J32 = highLowHRSettingsActivity.J3();
        ProgressBar loading = J32.f99602e;
        kotlin.jvm.internal.u.i(loading, "loading");
        loading.setVisibility(8);
        J33 = highLowHRSettingsActivity.J3();
        NestedScrollView scrollView = J33.f99604g;
        kotlin.jvm.internal.u.i(scrollView, "scrollView");
        scrollView.setVisibility(0);
        return nm0.y.f85009a;
    }
}
