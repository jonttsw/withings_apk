package com.withings.wiscale2.device.common.ui.geoloc;
/* compiled from: WeatherAirQualityScreen.kt */
/* loaded from: classes5.dex */
final class s extends kotlin.jvm.internal.w implements ym0.l<String, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.l<String, nm0.y> f53924a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s(ym0.l<? super String, nm0.y> lVar) {
        super(1);
        this.f53924a = lVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(String str) {
        String inputLocation = str;
        kotlin.jvm.internal.u.j(inputLocation, "inputLocation");
        this.f53924a.invoke(inputLocation);
        return nm0.y.f85009a;
    }
}
