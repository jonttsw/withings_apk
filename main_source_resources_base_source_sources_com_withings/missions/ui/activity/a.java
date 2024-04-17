package com.withings.missions.ui.activity;

import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: DailyMissionsSuccessActivity.kt */
/* loaded from: classes4.dex */
final class a extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DailyMissionsSuccessActivity f42318a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(DailyMissionsSuccessActivity dailyMissionsSuccessActivity) {
        super(0);
        this.f42318a = dailyMissionsSuccessActivity;
    }

    @Override // ym0.a
    public final y invoke() {
        this.f42318a.finish();
        return y.f85009a;
    }
}
