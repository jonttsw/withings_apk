package com.withings.manualLogging.ui.feature.addNote;

import android.os.Bundle;
import com.samsung.android.sdk.healthdata.HealthConstants;
/* compiled from: AddManualLogActivity.kt */
/* loaded from: classes4.dex */
final class s0 extends kotlin.jvm.internal.w implements ym0.r<r0.h, androidx.navigation.d, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ r8.n f41571a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(r8.n nVar) {
        super(4);
        this.f41571a = nVar;
    }

    @Override // ym0.r
    public final nm0.y invoke(r0.h hVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        r0.h bottomSheet = hVar;
        androidx.navigation.d backStackEntry = dVar;
        num.intValue();
        kotlin.jvm.internal.u.j(bottomSheet, "$this$bottomSheet");
        kotlin.jvm.internal.u.j(backStackEntry, "backStackEntry");
        Bundle c11 = backStackEntry.c();
        kotlin.jvm.internal.u.g(c11);
        String string = c11.getString("title");
        Bundle c12 = backStackEntry.c();
        kotlin.jvm.internal.u.g(c12);
        String string2 = c12.getString(HealthConstants.FoodInfo.DESCRIPTION);
        kotlin.jvm.internal.u.g(string);
        kotlin.jvm.internal.u.g(string2);
        yx.e.a(string, string2, new r0(this.f41571a), aVar, 0);
        return nm0.y.f85009a;
    }
}
