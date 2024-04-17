package com.withings.wiscale2.features;

import androidx.compose.foundation.layout.x0;
import androidx.compose.material.b2;
import com.withings.common.compose.component.o;
import java.util.List;
import kotlin.collections.x;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.r;
/* compiled from: LazyDsl.kt */
/* loaded from: classes5.dex */
public final class e extends w implements r<s0.b, Integer, androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List f56110a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ List f56111b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(List list, List list2) {
        super(4);
        this.f56110a = list;
        this.f56111b = list2;
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
            pf0.h hVar = (pf0.h) this.f56110a.get(intValue);
            aVar2.s(1982330804);
            o.l(x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2), hVar.b(), new d(hVar), null, hVar.a().getTitle(), hVar.a().b(), false, false, false, null, aVar2, 0, 968);
            if (intValue != x.M(this.f56111b)) {
                b2.a(0.0f, 0.0f, 0, 15, 0L, aVar2, null);
            }
            aVar2.J();
        }
        return y.f85009a;
    }
}
