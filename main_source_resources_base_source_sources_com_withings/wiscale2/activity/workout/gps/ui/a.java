package com.withings.wiscale2.activity.workout.gps.ui;

import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import r8.n;
/* compiled from: RequestLocationPermissionAndSettingsActivity.kt */
/* loaded from: classes4.dex */
final class a extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ RequestLocationPermissionAndSettingsActivity f48773a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(RequestLocationPermissionAndSettingsActivity requestLocationPermissionAndSettingsActivity) {
        super(0);
        this.f48773a = requestLocationPermissionAndSettingsActivity;
    }

    @Override // ym0.a
    public final y invoke() {
        n nVar;
        RequestLocationPermissionAndSettingsActivity requestLocationPermissionAndSettingsActivity = this.f48773a;
        nVar = requestLocationPermissionAndSettingsActivity.f48766e;
        if (nVar != null) {
            RequestLocationPermissionAndSettingsActivity.C3(requestLocationPermissionAndSettingsActivity, nVar);
            return y.f85009a;
        }
        u.s("navHostController");
        throw null;
    }
}
