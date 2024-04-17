package com.withings.wiscale2.device.common.screen.ui;

import android.widget.Toast;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.common.screen.ui.ScreenSelectionViewModel;
/* compiled from: ScreenSelectionActivity.kt */
/* loaded from: classes5.dex */
final class d extends kotlin.jvm.internal.w implements ym0.l<ScreenSelectionViewModel.CloseEvent, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ScreenSelectionActivity f53279a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ScreenSelectionActivity screenSelectionActivity) {
        super(1);
        this.f53279a = screenSelectionActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(ScreenSelectionViewModel.CloseEvent closeEvent) {
        ScreenSelectionViewModel.CloseEvent event = closeEvent;
        kotlin.jvm.internal.u.j(event, "event");
        ScreenSelectionViewModel.CloseEvent closeEvent2 = ScreenSelectionViewModel.CloseEvent.f53184b;
        ScreenSelectionActivity screenSelectionActivity = this.f53279a;
        if (event == closeEvent2) {
            fn0.k<Object>[] kVarArr = ScreenSelectionActivity.f53124l;
            Toast.makeText(screenSelectionActivity, screenSelectionActivity.getString(C1987R.string._WAM_MODIF_ALERT_), 0).show();
        }
        screenSelectionActivity.finish();
        return nm0.y.f85009a;
    }
}
