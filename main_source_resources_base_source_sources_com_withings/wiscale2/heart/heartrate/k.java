package com.withings.wiscale2.heart.heartrate;

import com.withings.common.compose.component.u1;
import com.withings.common.compose.component.w1;
import java.util.List;
/* compiled from: HeartRateAwakeAverageActivity.kt */
/* loaded from: classes5.dex */
final class k extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<u1> f57681a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(List<u1> list) {
        super(2);
        this.f57681a = list;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            w1.e(70, 0, aVar2, androidx.compose.foundation.layout.e1.e(androidx.compose.ui.e.f8927a, 1.0f), this.f57681a);
        }
        return nm0.y.f85009a;
    }
}
