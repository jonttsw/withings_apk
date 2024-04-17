package com.withings.badge.list;

import com.withings.badge.model.BadgeModelUI;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* compiled from: BadgesScreen.kt */
/* loaded from: classes3.dex */
final class e extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p<Long, String, y> f32806a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BadgeModelUI f32807b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(p<? super Long, ? super String, y> pVar, BadgeModelUI badgeModelUI) {
        super(0);
        this.f32806a = pVar;
        this.f32807b = badgeModelUI;
    }

    @Override // ym0.a
    public final y invoke() {
        BadgeModelUI badgeModelUI = this.f32807b;
        this.f32806a.invoke(Long.valueOf(badgeModelUI.getUserId()), badgeModelUI.getBadgeId());
        return y.f85009a;
    }
}
