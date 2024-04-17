package com.withings.wiscale2.device.wpa.wpa02.ui.details;

import kotlin.jvm.internal.w;
import nm0.y;
import yk.o;
import ym0.p;
/* compiled from: HydrationDetailsScreen.kt */
/* loaded from: classes5.dex */
final class c extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HydrationDetailsScreen f55103a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ double f55104b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(HydrationDetailsScreen hydrationDetailsScreen, double d11) {
        super(2);
        this.f55103a = hydrationDetailsScreen;
        this.f55104b = d11;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            o.b(false, s1.b.b(aVar2, 1899033868, new b(this.f55103a, this.f55104b)), aVar2, 48, 1);
        }
        return y.f85009a;
    }
}
