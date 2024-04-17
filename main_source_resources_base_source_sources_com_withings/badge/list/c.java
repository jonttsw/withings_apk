package com.withings.badge.list;

import androidx.compose.runtime.a;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* compiled from: BadgesActivity.kt */
/* loaded from: classes3.dex */
final class c extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BadgesActivity f32805a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(BadgesActivity badgesActivity) {
        super(2);
        this.f32805a = badgesActivity;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            aVar2.s(75506265);
            BadgesActivity badgesActivity = this.f32805a;
            boolean K = aVar2.K(badgesActivity);
            Object t11 = aVar2.t();
            if (K || t11 == a.C0060a.a()) {
                t11 = new a(badgesActivity);
                aVar2.n(t11);
            }
            p pVar = (p) t11;
            aVar2.J();
            aVar2.s(75506391);
            boolean K2 = aVar2.K(badgesActivity);
            Object t12 = aVar2.t();
            if (K2 || t12 == a.C0060a.a()) {
                t12 = new b(badgesActivity);
                aVar2.n(t12);
            }
            aVar2.J();
            g.c(null, pVar, (ym0.a) ((fn0.g) t12), aVar2, 0, 1);
        }
        return y.f85009a;
    }
}
