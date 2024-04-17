package com.withings.common.compose.component;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HorizontalBar.kt */
/* loaded from: classes3.dex */
public final class x1 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f34912a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f34913b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f34914c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f34915d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(int i11, int i12, int i13, int i14) {
        super(2);
        this.f34912a = i11;
        this.f34913b = i12;
        this.f34914c = i13;
        this.f34915d = i14;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f34915d | 1);
        int i11 = this.f34913b;
        int i12 = this.f34914c;
        w1.d(this.f34912a, i11, i12, g11, aVar);
        return nm0.y.f85009a;
    }
}
