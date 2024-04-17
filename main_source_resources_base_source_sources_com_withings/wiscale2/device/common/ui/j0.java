package com.withings.wiscale2.device.common.ui;

import android.widget.TextView;
/* compiled from: DeviceSharingActivity.kt */
/* loaded from: classes5.dex */
final class j0 extends kotlin.jvm.internal.w implements ym0.l<String, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DeviceSharingActivity f54003a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(DeviceSharingActivity deviceSharingActivity) {
        super(1);
        this.f54003a = deviceSharingActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(String str) {
        TextView textView;
        String str2 = str;
        textView = this.f54003a.f53691a;
        if (textView != null) {
            textView.setText(str2);
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("title");
        throw null;
    }
}
