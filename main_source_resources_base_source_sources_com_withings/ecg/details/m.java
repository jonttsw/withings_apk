package com.withings.ecg.details;
/* compiled from: EcgDetailsFragment.kt */
/* loaded from: classes3.dex */
final class m extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g f38263a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(g gVar) {
        super(2);
        this.f38263a = gVar;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            yk.o.b(false, s1.b.b(aVar2, -713463886, new l(this.f38263a)), aVar2, 48, 1);
        }
        return nm0.y.f85009a;
    }
}
