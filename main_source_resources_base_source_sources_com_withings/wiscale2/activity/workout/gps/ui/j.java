package com.withings.wiscale2.activity.workout.gps.ui;

import androidx.navigation.compose.n;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import r8.m;
/* compiled from: RequestLocationPermissionAndSettingsActivity.kt */
/* loaded from: classes4.dex */
final class j extends w implements ym0.l<m, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ RequestLocationPermissionAndSettingsActivity f48782a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(RequestLocationPermissionAndSettingsActivity requestLocationPermissionAndSettingsActivity) {
        super(1);
        this.f48782a = requestLocationPermissionAndSettingsActivity;
    }

    @Override // ym0.l
    public final y invoke(m mVar) {
        m NavHost = mVar;
        u.j(NavHost, "$this$NavHost");
        RequestLocationPermissionAndSettingsActivity requestLocationPermissionAndSettingsActivity = this.f48782a;
        n.b(NavHost, "requestLocationPermission/home", null, null, null, null, null, null, new s1.a(true, 1693678166, new b(requestLocationPermissionAndSettingsActivity)), 126);
        n.b(NavHost, "requestLocationPermission/foregroundPermission", null, null, null, null, null, null, new s1.a(true, 1122961599, new d(requestLocationPermissionAndSettingsActivity)), 126);
        n.b(NavHost, "requestLocationPermission/backgroundPermission", null, null, null, null, null, null, new s1.a(true, -1939874402, new f(requestLocationPermissionAndSettingsActivity)), 126);
        n.b(NavHost, "requestLocationPermission/askSecondPermission", null, null, null, null, null, null, new s1.a(true, -707743107, new i(requestLocationPermissionAndSettingsActivity)), 126);
        return y.f85009a;
    }
}
