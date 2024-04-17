package com.withings.common.compose.component;
/* compiled from: AdaptableHorizontalContent.kt */
/* loaded from: classes3.dex */
final class i1 extends kotlin.jvm.internal.w implements ym0.q<androidx.compose.ui.e, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.r<androidx.compose.ui.e, Object, androidx.compose.runtime.a, Integer, nm0.y> f33857a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Object f33858b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(s1.a aVar, Object obj) {
        super(3);
        this.f33857a = aVar;
        this.f33858b = obj;
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
            this.f33857a.invoke(it, this.f33858b, aVar2, Integer.valueOf(intValue & 14));
        }
        return nm0.y.f85009a;
    }
}
