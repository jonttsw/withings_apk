package com.withings.wiscale2.profile;

import android.content.Context;
import com.withings.badge.detail.BadgeDetailActivity;
/* compiled from: ProfileFragment.kt */
/* loaded from: classes5.dex */
final class s extends kotlin.jvm.internal.w implements ym0.p<Long, String, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ q f59463a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(q qVar) {
        super(2);
        this.f59463a = qVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(Long l5, String str) {
        long longValue = l5.longValue();
        String badgeId = str;
        kotlin.jvm.internal.u.j(badgeId, "badgeId");
        int i11 = BadgeDetailActivity.f32715e;
        q qVar = this.f59463a;
        Context requireContext = qVar.requireContext();
        kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
        qVar.startActivity(BadgeDetailActivity.a.a(requireContext, badgeId, longValue));
        return nm0.y.f85009a;
    }
}
