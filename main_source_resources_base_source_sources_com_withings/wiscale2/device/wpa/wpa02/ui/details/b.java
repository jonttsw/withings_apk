package com.withings.wiscale2.device.wpa.wpa02.ui.details;

import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* compiled from: HydrationDetailsScreen.kt */
/* loaded from: classes5.dex */
final class b extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HydrationDetailsScreen f55101a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ double f55102b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(HydrationDetailsScreen hydrationDetailsScreen, double d11) {
        super(2);
        this.f55101a = hydrationDetailsScreen;
        this.f55102b = d11;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            this.f55101a.b(this.f55102b, aVar2, 64);
        }
        return y.f85009a;
    }
}
