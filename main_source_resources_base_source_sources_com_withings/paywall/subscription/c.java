package com.withings.paywall.subscription;

import androidx.compose.material3.z4;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* compiled from: SubscriptionScreen.kt */
/* loaded from: classes4.dex */
final class c extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<y> f43681a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ym0.a<y> aVar) {
        super(2);
        this.f43681a = aVar;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            z4.b(this.f43681a, null, false, null, null, f20.a.f66000a, aVar2, 196608, 30);
        }
        return y.f85009a;
    }
}
