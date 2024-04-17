package com.withings.badge.list;

import com.withings.badge.model.BadgeSection;
import com.withings.badge.model.BadgeSectionType;
import java.util.Map;
import k3.p;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: BadgesScreen.kt */
/* loaded from: classes3.dex */
final class i extends w implements ym0.l<p, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Map<BadgeSectionType, Integer> f32831a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ BadgeSection f32832b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f32833c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f32834d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f32835e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Map<BadgeSectionType, Integer> map, BadgeSection badgeSection, int i11, int i12, int i13) {
        super(1);
        this.f32831a = map;
        this.f32832b = badgeSection;
        this.f32833c = i11;
        this.f32834d = i12;
        this.f32835e = i13;
    }

    @Override // ym0.l
    public final y invoke(p pVar) {
        int i11;
        long e11 = pVar.e();
        BadgeSectionType badgeSectionType = this.f32832b.getBadgeSectionType();
        int i12 = (int) (e11 & 4294967295L);
        if (this.f32833c == 0) {
            i11 = this.f32834d;
        } else {
            i11 = this.f32835e;
        }
        this.f32831a.put(badgeSectionType, Integer.valueOf(i12 + i11));
        return y.f85009a;
    }
}
