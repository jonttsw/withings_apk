package com.withings.details.height;

import com.withings.common.compose.component.v0;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.measure.MeasuresGroup;
import java.util.List;
import java.util.Map;
/* compiled from: LazyDsl.kt */
/* loaded from: classes3.dex */
public final class o extends kotlin.jvm.internal.w implements ym0.r<s0.b, Integer, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List f36623a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ HeightListActivity f36624b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ List f36625c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Map f36626d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(List list, HeightListActivity heightListActivity, List list2, Map map) {
        super(4);
        this.f36623a = list;
        this.f36624b = heightListActivity;
        this.f36625c = list2;
        this.f36626d = map;
    }

    @Override // ym0.r
    public final nm0.y invoke(s0.b bVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
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
            aVar2.s(482194921);
            Map map = this.f36626d;
            HeightListActivity heightListActivity = this.f36624b;
            heightListActivity.A3((MeasuresGroup) this.f36623a.get(intValue), new m(heightListActivity, map), aVar2, ConstantsWs.WS_STATUS_ALREADY_EXIST);
            if (intValue != kotlin.collections.x.M(this.f36625c)) {
                v0.b(0.0f, aVar2, 0, 1);
            }
            aVar2.J();
        }
        return nm0.y.f85009a;
    }
}
