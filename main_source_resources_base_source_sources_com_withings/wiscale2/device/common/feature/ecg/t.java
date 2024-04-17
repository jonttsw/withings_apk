package com.withings.wiscale2.device.common.feature.ecg;

import android.os.Bundle;
import com.rudderstack.android.sdk.core.util.Utils;
import com.samsung.android.sdk.healthdata.HealthConstants;
import com.withings.wiscale2.C1987R;
/* compiled from: EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class t extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f51742a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(EcgActivationActivity ecgActivationActivity) {
        super(4);
        this.f51742a = ecgActivationActivity;
    }

    @Override // ym0.r
    public final nm0.y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        int i11;
        int i12;
        l0.c composable = cVar;
        androidx.navigation.d backStackEntry = dVar;
        androidx.compose.runtime.a aVar2 = aVar;
        num.intValue();
        kotlin.jvm.internal.u.j(composable, "$this$composable");
        kotlin.jvm.internal.u.j(backStackEntry, "backStackEntry");
        Bundle c11 = backStackEntry.c();
        if (c11 != null) {
            i11 = c11.getInt("title");
        } else {
            i11 = C1987R.string.hwa09_usOnboarding_error_forbidden_title;
        }
        int i13 = i11;
        Bundle c12 = backStackEntry.c();
        if (c12 != null) {
            i12 = c12.getInt(HealthConstants.FoodInfo.DESCRIPTION);
        } else {
            i12 = C1987R.string.hwa09_usOnboarding_error_connection_paragraph;
        }
        int i14 = i12;
        EcgActivationActivity.D3(this.f51742a, 2131232225, i13, i14, new s(this.f51742a), aVar2, Utils.MAX_EVENT_SIZE);
        return nm0.y.f85009a;
    }
}
