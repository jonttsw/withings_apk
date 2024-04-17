package com.withings.badge.profile;

import androidx.compose.foundation.h;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import com.withings.badge.model.BadgeModelUI;
import java.util.List;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
import ym0.r;
/* compiled from: LazyDsl.kt */
/* loaded from: classes3.dex */
public final class b extends w implements r<s0.b, Integer, androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List f32857a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p f32858b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p pVar, List list) {
        super(4);
        this.f32857a = list;
        this.f32858b = pVar;
    }

    @Override // ym0.r
    public final y invoke(s0.b bVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
        int i11;
        int i12;
        int i13;
        s0.b bVar2 = bVar;
        int intValue = num.intValue();
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue2 = num2.intValue();
        if ((intValue2 & 14) == 0) {
            if (aVar2.K(bVar2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | intValue2;
        } else {
            i11 = intValue2;
        }
        if ((intValue2 & 112) == 0) {
            if (aVar2.c(intValue)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 731) == 146 && aVar2.h()) {
            aVar2.C();
        } else {
            BadgeModelUI.UnlockedBadgeModelUI unlockedBadgeModelUI = (BadgeModelUI.UnlockedBadgeModelUI) this.f32857a.get(intValue);
            aVar2.s(-848020759);
            e.a aVar3 = e.f8927a;
            aVar2.s(-848020696);
            p pVar = this.f32858b;
            boolean K = aVar2.K(pVar) | aVar2.K(unlockedBadgeModelUI);
            Object t11 = aVar2.t();
            if (K || t11 == a.C0060a.a()) {
                t11 = new a(pVar, unlockedBadgeModelUI);
                aVar2.n(t11);
            }
            aVar2.J();
            yh.d.a(h.b(aVar3, false, (ym0.a) t11, 7), unlockedBadgeModelUI, aVar2, 0, 0);
            aVar2.J();
        }
        return y.f85009a;
    }
}
