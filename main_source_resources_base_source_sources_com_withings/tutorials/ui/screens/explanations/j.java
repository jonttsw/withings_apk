package com.withings.tutorials.ui.screens.explanations;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BreathingDisturbance.kt */
/* loaded from: classes4.dex */
public final class j extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f45168a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f45169b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f45170c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, int i11) {
        super(2);
        this.f45168a = aVar;
        this.f45169b = aVar2;
        this.f45170c = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f45170c | 1);
        m.b(this.f45168a, this.f45169b, aVar, g11);
        return nm0.y.f85009a;
    }
}
