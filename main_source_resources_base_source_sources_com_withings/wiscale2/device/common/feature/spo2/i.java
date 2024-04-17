package com.withings.wiscale2.device.common.feature.spo2;

import com.withings.wiscale2.C1987R;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: SpO2ActivationActivity.kt */
/* loaded from: classes5.dex */
final class i extends w implements ym0.l<Boolean, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Spo2ActivationActivity f52530a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Spo2ActivationActivity spo2ActivationActivity) {
        super(1);
        this.f52530a = spo2ActivationActivity;
    }

    @Override // ym0.l
    public final y invoke(Boolean bool) {
        androidx.navigation.e navController;
        androidx.navigation.e navController2;
        Boolean bool2 = bool;
        u.g(bool2);
        if (bool2.booleanValue()) {
            Spo2ActivationActivity spo2ActivationActivity = this.f52530a;
            navController = spo2ActivationActivity.getNavController();
            androidx.navigation.t y11 = navController.y();
            if (y11 != null && y11.r() == C1987R.id.spo2_document) {
                navController2 = spo2ActivationActivity.getNavController();
                navController2.H(C1987R.id.action_document_to_preparation, null);
            }
        }
        return y.f85009a;
    }
}
