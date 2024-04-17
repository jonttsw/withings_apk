package com.withings.common.compose.component;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Cells.kt */
/* loaded from: classes3.dex */
public final class s extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f34656a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f34657b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f34658c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f34659d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f34660e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(int i11, int i12, androidx.compose.ui.e eVar, String str, String str2) {
        super(2);
        this.f34656a = eVar;
        this.f34657b = str;
        this.f34658c = str2;
        this.f34659d = i11;
        this.f34660e = i12;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f34659d | 1);
        o.f(g11, this.f34660e, aVar, this.f34656a, this.f34657b, this.f34658c);
        return nm0.y.f85009a;
    }
}
