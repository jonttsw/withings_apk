package com.withings.nutrisync.ui;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VitaminCScreen.kt */
/* loaded from: classes4.dex */
public final class d0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ m10.b f43224a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.l<qm0.d<? super nm0.y>, Object> f43225b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f43226c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f43227d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d0(m10.b bVar, ym0.l<? super qm0.d<? super nm0.y>, ? extends Object> lVar, ym0.a<nm0.y> aVar, int i11) {
        super(2);
        this.f43224a = bVar;
        this.f43225b = lVar;
        this.f43226c = aVar;
        this.f43227d = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f43227d | 1);
        ym0.l<qm0.d<? super nm0.y>, Object> lVar = this.f43225b;
        ym0.a<nm0.y> aVar2 = this.f43226c;
        e0.d(this.f43224a, lVar, aVar2, aVar, g11);
        return nm0.y.f85009a;
    }
}
