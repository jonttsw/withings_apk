package com.withings.common.compose.component;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HorizontalBar.kt */
/* loaded from: classes3.dex */
public final class y1 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f34932a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ u1 f34933b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ long f34934c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ float f34935d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f34936e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f34937f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(androidx.compose.ui.e eVar, u1 u1Var, long j5, float f11, int i11, int i12) {
        super(2);
        this.f34932a = eVar;
        this.f34933b = u1Var;
        this.f34934c = j5;
        this.f34935d = f11;
        this.f34936e = i11;
        this.f34937f = i12;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f34936e | 1);
        long j5 = this.f34934c;
        float f11 = this.f34935d;
        w1.i(this.f34932a, this.f34933b, j5, f11, aVar, g11, this.f34937f);
        return nm0.y.f85009a;
    }
}
