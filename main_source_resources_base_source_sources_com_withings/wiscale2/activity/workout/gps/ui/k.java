package com.withings.wiscale2.activity.workout.gps.ui;

import androidx.navigation.compose.s;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import r8.n;
import ym0.p;
/* compiled from: RequestLocationPermissionAndSettingsActivity.kt */
/* loaded from: classes4.dex */
final class k extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ RequestLocationPermissionAndSettingsActivity f48783a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(RequestLocationPermissionAndSettingsActivity requestLocationPermissionAndSettingsActivity) {
        super(2);
        this.f48783a = requestLocationPermissionAndSettingsActivity;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        n nVar;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            RequestLocationPermissionAndSettingsActivity requestLocationPermissionAndSettingsActivity = this.f48783a;
            nVar = requestLocationPermissionAndSettingsActivity.f48766e;
            if (nVar != null) {
                s.b(nVar, "requestLocationPermission/home", null, null, null, null, null, null, null, new j(requestLocationPermissionAndSettingsActivity), aVar2, 56, ConstantsWs.WS_STATUS_WRONG_STRIPE_ENV);
            } else {
                u.s("navHostController");
                throw null;
            }
        }
        return y.f85009a;
    }
}
