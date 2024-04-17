package com.withings.wiscale2.device.common.feature.afib;

import com.withings.wiscale2.C1987R;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: AfibActivationActivity.kt */
/* loaded from: classes5.dex */
final class a extends w implements ym0.l<Boolean, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AfibActivationActivity f51012a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AfibActivationActivity afibActivationActivity) {
        super(1);
        this.f51012a = afibActivationActivity;
    }

    @Override // ym0.l
    public final y invoke(Boolean bool) {
        androidx.navigation.e navController;
        bool.booleanValue();
        AfibActivationActivity afibActivationActivity = this.f51012a;
        navController = afibActivationActivity.getNavController();
        androidx.navigation.t y11 = navController.y();
        if (y11 != null && y11.r() == C1987R.id.afib_document) {
            afibActivationActivity.finish();
        }
        return y.f85009a;
    }
}
