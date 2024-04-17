package com.withings.wiscale2.device.common.ui;

import android.widget.ImageView;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
/* compiled from: DeviceSharingActivity.kt */
/* loaded from: classes5.dex */
final class l0 extends kotlin.jvm.internal.w implements ym0.l<Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DeviceSharingActivity f54016a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(DeviceSharingActivity deviceSharingActivity) {
        super(1);
        this.f54016a = deviceSharingActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(Integer num) {
        ImageView imageView;
        Integer num2 = num;
        if (num2 != null) {
            int intValue = num2.intValue();
            imageView = this.f54016a.f53693c;
            if (imageView != null) {
                imageView.setImageResource(intValue);
            } else {
                kotlin.jvm.internal.u.s(HealthUserProfile.USER_PROFILE_KEY_IMAGE);
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}
