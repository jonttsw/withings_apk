package com.withings.common.compose.component;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SectionCard.kt */
/* loaded from: classes3.dex */
public final class z3 extends kotlin.jvm.internal.w implements ym0.q<s0.b, androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Integer f34987a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f34988b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(Integer num, String str) {
        super(3);
        this.f34987a = num;
        this.f34988b = str;
    }

    @Override // ym0.q
    public final nm0.y invoke(s0.b bVar, androidx.compose.runtime.a aVar, Integer num) {
        s0.b item = bVar;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        kotlin.jvm.internal.u.j(item, "$this$item");
        if ((intValue & 81) == 16 && aVar2.h()) {
            aVar2.C();
        } else {
            Integer num2 = this.f34987a;
            if (num2 != null) {
                b4.a(ay.b.u(num2.intValue(), aVar2), this.f34988b, null, null, aVar2, 0, 12);
            }
        }
        return nm0.y.f85009a;
    }
}
