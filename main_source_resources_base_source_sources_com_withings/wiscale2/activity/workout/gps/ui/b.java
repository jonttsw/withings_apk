package com.withings.wiscale2.activity.workout.gps.ui;

import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.r;
/* compiled from: RequestLocationPermissionAndSettingsActivity.kt */
/* loaded from: classes4.dex */
final class b extends w implements r<l0.c, androidx.navigation.d, androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ RequestLocationPermissionAndSettingsActivity f48774a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(RequestLocationPermissionAndSettingsActivity requestLocationPermissionAndSettingsActivity) {
        super(4);
        this.f48774a = requestLocationPermissionAndSettingsActivity;
    }

    @Override // ym0.r
    public final y invoke(l0.c cVar, androidx.navigation.d dVar, androidx.compose.runtime.a aVar, Integer num) {
        l0.c composable = cVar;
        androidx.navigation.d it = dVar;
        num.intValue();
        u.j(composable, "$this$composable");
        u.j(it, "it");
        oa0.c.c(new a(this.f48774a), aVar, 0);
        return y.f85009a;
    }
}
