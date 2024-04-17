package com.withings.device.ws;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
/* compiled from: RetrofitDeviceRemoteRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/withings/device/ws/DeviceApi;", "Lnm0/y;", "invoke", "(Lcom/withings/device/ws/DeviceApi;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class RetrofitDeviceRemoteRepository$updateProperties$2 extends w implements l<DeviceApi, y> {
    final /* synthetic */ Integer $classification;
    final /* synthetic */ String $data;
    final /* synthetic */ long $debug;
    final /* synthetic */ long $deviceId;
    final /* synthetic */ long $impedancemeter;
    final /* synthetic */ boolean $isExtraSensitivityEnabled;
    final /* synthetic */ double $latitude;
    final /* synthetic */ double $longitude;
    final /* synthetic */ int $measurementIntervalTime;
    final /* synthetic */ boolean $micMute;
    final /* synthetic */ String $prefLang;
    final /* synthetic */ String $timezone;
    final /* synthetic */ Boolean $vuMeter;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitDeviceRemoteRepository$updateProperties$2(long j5, double d11, double d12, String str, long j11, long j12, String str2, boolean z5, boolean z11, int i11, String str3, Integer num, Boolean bool) {
        super(1);
        this.$deviceId = j5;
        this.$latitude = d11;
        this.$longitude = d12;
        this.$timezone = str;
        this.$impedancemeter = j11;
        this.$debug = j12;
        this.$prefLang = str2;
        this.$micMute = z5;
        this.$isExtraSensitivityEnabled = z11;
        this.$measurementIntervalTime = i11;
        this.$data = str3;
        this.$classification = num;
        this.$vuMeter = bool;
    }

    @Override // ym0.l
    public /* bridge */ /* synthetic */ y invoke(DeviceApi deviceApi) {
        invoke2(deviceApi);
        return y.f85009a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(DeviceApi withApiForAccount) {
        u.j(withApiForAccount, "$this$withApiForAccount");
        withApiForAccount.updateProperties(this.$deviceId, this.$latitude, this.$longitude, this.$timezone, this.$impedancemeter, this.$debug, this.$prefLang, this.$micMute, this.$isExtraSensitivityEnabled, this.$measurementIntervalTime, this.$data, this.$classification, this.$vuMeter);
    }
}
