package com.withings.wiscale2.heart.heartrate;

import com.withings.common.compose.component.u1;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HeartRateAwakeAverageActivity.kt */
/* loaded from: classes5.dex */
public final class l extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<u1> f57686a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ArrayList arrayList) {
        super(2);
        this.f57686a = arrayList;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            yk.o.b(false, s1.b.b(aVar2, -2056005889, new k(this.f57686a)), aVar2, 48, 1);
        }
        return nm0.y.f85009a;
    }
}
