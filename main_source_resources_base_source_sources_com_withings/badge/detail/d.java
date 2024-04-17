package com.withings.badge.detail;

import android.content.Intent;
import androidx.activity.result.ActivityResult;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.badge.list.BadgesActivity;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: BadgeDetailActivity.kt */
/* loaded from: classes3.dex */
final class d extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e.n<Intent, ActivityResult> f32745a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BadgeDetailActivity f32746b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e.n<Intent, ActivityResult> nVar, BadgeDetailActivity badgeDetailActivity) {
        super(0);
        this.f32745a = nVar;
        this.f32746b = badgeDetailActivity;
    }

    @Override // ym0.a
    public final y invoke() {
        int i11 = BadgesActivity.f32793e;
        BadgeDetailActivity badgeDetailActivity = this.f32746b;
        this.f32745a.a(BadgesActivity.a.a(badgeDetailActivity, badgeDetailActivity.getIntent().getLongExtra(HealthUserProfile.USER_PROFILE_KEY_USER_ID, -1L)));
        return y.f85009a;
    }
}
