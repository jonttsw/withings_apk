package com.withings.badge.list;

import com.withings.badge.detail.BadgeDetailActivity;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* compiled from: BadgesActivity.kt */
/* loaded from: classes3.dex */
final class a extends w implements p<Long, String, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BadgesActivity f32804a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(BadgesActivity badgesActivity) {
        super(2);
        this.f32804a = badgesActivity;
    }

    @Override // ym0.p
    public final y invoke(Long l5, String str) {
        long longValue = l5.longValue();
        String badgeId = str;
        u.j(badgeId, "badgeId");
        int i11 = BadgeDetailActivity.f32715e;
        BadgesActivity badgesActivity = this.f32804a;
        badgesActivity.startActivity(BadgeDetailActivity.a.a(badgesActivity, badgeId, longValue));
        return y.f85009a;
    }
}
