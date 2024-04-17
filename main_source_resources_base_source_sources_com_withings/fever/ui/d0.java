package com.withings.fever.ui;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BodyTemperatureScreen.kt */
/* loaded from: classes3.dex */
public final class d0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ boolean f39224a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f39225b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f39226c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(int i11, ym0.a aVar, boolean z5) {
        super(2);
        this.f39224a = z5;
        this.f39225b = aVar;
        this.f39226c = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        m.f(ah.o.g(this.f39226c | 1), aVar, this.f39225b, this.f39224a);
        return nm0.y.f85009a;
    }
}
