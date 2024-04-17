package com.withings.wiscale2.device.common.ui.geoloc;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WeatherAirQualityScreen.kt */
/* loaded from: classes5.dex */
public final class z extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f53934a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f53935b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f53936c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f53937d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f53938e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, ym0.a<nm0.y> aVar3, String str, int i11) {
        super(2);
        this.f53934a = aVar;
        this.f53935b = aVar2;
        this.f53936c = aVar3;
        this.f53937d = str;
        this.f53938e = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f53938e | 1);
        q.d(g11, aVar, this.f53937d, this.f53934a, this.f53935b, this.f53936c);
        return nm0.y.f85009a;
    }
}
