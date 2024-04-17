package com.withings.device.details;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DeviceDetailFragment.kt */
/* loaded from: classes3.dex */
public final class g extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h f36816a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f36817b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f36818c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f36819d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f36820e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, ym0.a<nm0.y> aVar3, int i11) {
        super(2);
        this.f36816a = hVar;
        this.f36817b = aVar;
        this.f36818c = aVar2;
        this.f36819d = aVar3;
        this.f36820e = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f36820e | 1);
        ym0.a<nm0.y> aVar2 = this.f36818c;
        ym0.a<nm0.y> aVar3 = this.f36819d;
        h.v1(this.f36816a, this.f36817b, aVar2, aVar3, aVar, g11);
        return nm0.y.f85009a;
    }
}
