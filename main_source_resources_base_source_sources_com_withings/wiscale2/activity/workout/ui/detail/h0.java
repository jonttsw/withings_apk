package com.withings.wiscale2.activity.workout.ui.detail;

import com.withings.location.model.GpsLocation;
import java.util.List;
/* compiled from: LazyDsl.kt */
/* loaded from: classes4.dex */
public final class h0 extends kotlin.jvm.internal.w implements ym0.r<s0.b, Integer, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List f49212a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ListGpsPointActivity f49213b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(List list, ListGpsPointActivity listGpsPointActivity) {
        super(4);
        this.f49212a = list;
        this.f49213b = listGpsPointActivity;
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
            aVar2.s(-1489799221);
            ListGpsPointActivity.z3(this.f49213b, (GpsLocation) this.f49212a.get(intValue), aVar2, 72);
            aVar2.J();
        }
        return nm0.y.f85009a;
    }
}
