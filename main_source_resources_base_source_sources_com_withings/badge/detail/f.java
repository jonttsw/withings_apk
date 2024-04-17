package com.withings.badge.detail;

import androidx.compose.runtime.a;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* compiled from: BadgeDetailActivity.kt */
/* loaded from: classes3.dex */
final class f extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BadgeDetailActivity f32748a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(BadgeDetailActivity badgeDetailActivity) {
        super(2);
        this.f32748a = badgeDetailActivity;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            g.a aVar3 = new g.a();
            aVar2.s(-1807685509);
            BadgeDetailActivity badgeDetailActivity = this.f32748a;
            boolean K = aVar2.K(badgeDetailActivity);
            Object t11 = aVar2.t();
            if (K || t11 == a.C0060a.a()) {
                t11 = new e(badgeDetailActivity);
                aVar2.n(t11);
            }
            aVar2.J();
            e.n a11 = e.d.a(aVar3, (ym0.l) t11, aVar2, 8);
            aVar2.s(-1807685377);
            boolean K2 = aVar2.K(badgeDetailActivity);
            Object t12 = aVar2.t();
            if (K2 || t12 == a.C0060a.a()) {
                t12 = new a(badgeDetailActivity);
                aVar2.n(t12);
            }
            ym0.l lVar = (ym0.l) t12;
            aVar2.J();
            aVar2.s(-1807685276);
            boolean K3 = aVar2.K(badgeDetailActivity);
            Object t13 = aVar2.t();
            if (K3 || t13 == a.C0060a.a()) {
                t13 = new b(badgeDetailActivity);
                aVar2.n(t13);
            }
            ym0.l lVar2 = (ym0.l) t13;
            aVar2.J();
            aVar2.s(-1807685183);
            boolean K4 = aVar2.K(badgeDetailActivity);
            Object t14 = aVar2.t();
            if (K4 || t14 == a.C0060a.a()) {
                t14 = new c(badgeDetailActivity);
                aVar2.n(t14);
            }
            aVar2.J();
            h.a(null, lVar, lVar2, (ym0.a) ((fn0.g) t14), new d(a11, badgeDetailActivity), aVar2, 0, 1);
        }
        return y.f85009a;
    }
}
