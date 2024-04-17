package com.withings.common.compose.component;
/* compiled from: HorizontalPager.kt */
/* loaded from: classes3.dex */
final class h2 extends kotlin.jvm.internal.w implements ym0.q<androidx.compose.ui.e, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.r<androidx.compose.ui.e, Object, androidx.compose.runtime.a, Integer, nm0.y> f33835a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Object f33836b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(s1.a aVar, Object obj) {
        super(3);
        this.f33835a = aVar;
        this.f33836b = obj;
    }

    @Override // ym0.q
    public final nm0.y invoke(androidx.compose.ui.e eVar, androidx.compose.runtime.a aVar, Integer num) {
        int i11;
        androidx.compose.ui.e it = eVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(it, "it");
        if ((intValue & 14) == 0) {
            if (aVar2.K(it)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            intValue |= i11;
        }
        if ((intValue & 91) == 18 && aVar2.h()) {
            aVar2.C();
        } else {
            this.f33835a.invoke(it, this.f33836b, aVar2, Integer.valueOf(intValue & 14));
        }
        return nm0.y.f85009a;
    }
}
