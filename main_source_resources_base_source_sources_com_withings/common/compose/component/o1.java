package com.withings.common.compose.component;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Glyph.kt */
/* loaded from: classes3.dex */
public final class o1 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ long f34482a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f34483b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ float f34484c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f34485d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f34486e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f34487f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(float f11, int i11, int i12, long j5, androidx.compose.ui.e eVar, ym0.p pVar) {
        super(2);
        this.f34482a = j5;
        this.f34483b = eVar;
        this.f34484c = f11;
        this.f34485d = pVar;
        this.f34486e = i11;
        this.f34487f = i12;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f34486e | 1);
        n1.e(this.f34484c, g11, this.f34487f, this.f34482a, aVar, this.f34483b, this.f34485d);
        return nm0.y.f85009a;
    }
}
