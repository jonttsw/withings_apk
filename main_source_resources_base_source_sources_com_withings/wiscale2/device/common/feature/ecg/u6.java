package com.withings.wiscale2.device.common.feature.ecg;

import android.os.Bundle;
import com.samsung.android.sdk.healthdata.HealthConstants;
import com.withings.wiscale2.C1987R;
/* compiled from: WBS08EcgActivationActivity.kt */
/* loaded from: classes5.dex */
final class u6 extends kotlin.jvm.internal.w implements ym0.r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationActivity f51767a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u6(WBS08EcgActivationActivity wBS08EcgActivationActivity) {
        super(4);
        this.f51767a = wBS08EcgActivationActivity;
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
        WBS08EcgActivationActivity wBS08EcgActivationActivity = this.f51767a;
        a aVar3 = new a(C1987R.string.go_to_support, new r6(wBS08EcgActivationActivity));
        a aVar4 = new a(C1987R.string._EXIT_, new s6(wBS08EcgActivationActivity));
        WBS08EcgActivationActivity.F3(this.f51767a, 2131232225, i13, i14, new t6(wBS08EcgActivationActivity), aVar3, aVar4, aVar2, 2097152, 0);
        return nm0.y.f85009a;
    }
}
