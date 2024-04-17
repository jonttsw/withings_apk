package com.withings.wiscale2.device.common.feature.respiratoryscan;

import com.withings.wiscale2.C1987R;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: RespiratoryScanActivationActivity.kt */
/* loaded from: classes5.dex */
final class d extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ RespiratoryScanActivationActivity f52448a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(RespiratoryScanActivationActivity respiratoryScanActivationActivity) {
        super(0);
        this.f52448a = respiratoryScanActivationActivity;
    }

    @Override // ym0.a
    public final y invoke() {
        androidx.navigation.e navController;
        navController = this.f52448a.getNavController();
        navController.H(C1987R.id.action_frequency_to_reminder, null);
        return y.f85009a;
    }
}
