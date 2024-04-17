package com.withings.wiscale2.activity.workout.gps.ui;

import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: RequestLocationPermissionAndSettingsActivity.kt */
/* loaded from: classes4.dex */
final class h extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ RequestLocationPermissionAndSettingsActivity f48780a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(RequestLocationPermissionAndSettingsActivity requestLocationPermissionAndSettingsActivity) {
        super(0);
        this.f48780a = requestLocationPermissionAndSettingsActivity;
    }

    @Override // ym0.a
    public final y invoke() {
        this.f48780a.finish();
        return y.f85009a;
    }
}
