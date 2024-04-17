package com.withings.wiscale2.device.common.ui;

import android.widget.TextView;
import com.samsung.android.sdk.healthdata.HealthConstants;
/* compiled from: DeviceSharingActivity.kt */
/* loaded from: classes5.dex */
final class k0 extends kotlin.jvm.internal.w implements ym0.l<String, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DeviceSharingActivity f54010a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(DeviceSharingActivity deviceSharingActivity) {
        super(1);
        this.f54010a = deviceSharingActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(String str) {
        TextView textView;
        String str2 = str;
        textView = this.f54010a.f53692b;
        if (textView != null) {
            textView.setText(str2);
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s(HealthConstants.FoodInfo.DESCRIPTION);
        throw null;
    }
}
