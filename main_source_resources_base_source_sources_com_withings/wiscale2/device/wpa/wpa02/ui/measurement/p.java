package com.withings.wiscale2.device.wpa.wpa02.ui.measurement;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Wpa02LaunchMeasurementActivity.kt */
/* loaded from: classes5.dex */
public final class p extends kotlin.jvm.internal.w implements ym0.l<r8.m, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Wpa02LaunchMeasurementActivity f55574a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f55575b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Wpa02LaunchMeasurementActivity wpa02LaunchMeasurementActivity, ym0.a<nm0.y> aVar) {
        super(1);
        this.f55574a = wpa02LaunchMeasurementActivity;
        this.f55575b = aVar;
    }

    @Override // ym0.l
    public final nm0.y invoke(r8.m mVar) {
        r8.m NavHost = mVar;
        kotlin.jvm.internal.u.j(NavHost, "$this$NavHost");
        Wpa02LaunchMeasurementActivity wpa02LaunchMeasurementActivity = this.f55574a;
        ym0.a<nm0.y> aVar = this.f55575b;
        androidx.navigation.compose.n.b(NavHost, "SelectBiomarkersScreen", null, null, null, null, null, null, new s1.a(true, -1253864646, new l(wpa02LaunchMeasurementActivity, aVar)), 126);
        androidx.navigation.compose.n.b(NavHost, "DeviceConnectionStateScreen", null, null, null, null, null, null, new s1.a(true, -261231631, new m(wpa02LaunchMeasurementActivity, aVar)), 126);
        androidx.navigation.compose.n.b(NavHost, "DeviceMeasurementErrorScreen", null, null, null, null, null, null, new s1.a(true, 1004839154, new n(wpa02LaunchMeasurementActivity, aVar)), 126);
        androidx.navigation.compose.n.b(NavHost, "DeviceReadyToCollectScreen", null, null, null, null, null, null, new s1.a(true, -2024057357, new o(wpa02LaunchMeasurementActivity)), 126);
        return nm0.y.f85009a;
    }
}
