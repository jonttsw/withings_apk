package com.withings.badge.detail;

import androidx.activity.result.ActivityResult;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: BadgeDetailActivity.kt */
/* loaded from: classes3.dex */
final class e extends w implements ym0.l<ActivityResult, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BadgeDetailActivity f32747a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(BadgeDetailActivity badgeDetailActivity) {
        super(1);
        this.f32747a = badgeDetailActivity;
    }

    @Override // ym0.l
    public final y invoke(ActivityResult activityResult) {
        ActivityResult result = activityResult;
        u.j(result, "result");
        this.f32747a.finish();
        return y.f85009a;
    }
}
