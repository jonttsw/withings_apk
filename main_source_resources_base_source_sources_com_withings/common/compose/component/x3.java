package com.withings.common.compose.component;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SectionCard.kt */
/* loaded from: classes3.dex */
public final class x3 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f34918a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f34919b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f34920c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(int i11, String str, int i12) {
        super(2);
        this.f34918a = i11;
        this.f34919b = str;
        this.f34920c = i12;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f34920c | 1);
        y3.a(this.f34918a, g11, aVar, this.f34919b);
        return nm0.y.f85009a;
    }
}
