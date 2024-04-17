package com.withings.wiscale2.device.common.notifications.ui;

import androidx.activity.result.ActivityResult;
/* compiled from: DeviceNotificationSettingsFragment.kt */
/* loaded from: classes5.dex */
final class x extends kotlin.jvm.internal.w implements ym0.l<ActivityResult, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f1 f53039a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(f1 f1Var) {
        super(1);
        this.f53039a = f1Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(ActivityResult activityResult) {
        ActivityResult it = activityResult;
        kotlin.jvm.internal.u.j(it, "it");
        if (it.b() != -1) {
            this.f53039a.W0();
        }
        return nm0.y.f85009a;
    }
}
