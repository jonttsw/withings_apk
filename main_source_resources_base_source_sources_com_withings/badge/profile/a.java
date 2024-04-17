package com.withings.badge.profile;

import com.withings.badge.model.BadgeModelUI;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* compiled from: ProfileBadgeCarouselScreen.kt */
/* loaded from: classes3.dex */
final class a extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p<Long, String, y> f32855a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BadgeModelUI.UnlockedBadgeModelUI f32856b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(p<? super Long, ? super String, y> pVar, BadgeModelUI.UnlockedBadgeModelUI unlockedBadgeModelUI) {
        super(0);
        this.f32855a = pVar;
        this.f32856b = unlockedBadgeModelUI;
    }

    @Override // ym0.a
    public final y invoke() {
        BadgeModelUI.UnlockedBadgeModelUI unlockedBadgeModelUI = this.f32856b;
        this.f32855a.invoke(Long.valueOf(unlockedBadgeModelUI.getUserId()), unlockedBadgeModelUI.getBadgeId());
        return y.f85009a;
    }
}
