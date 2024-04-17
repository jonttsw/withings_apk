package com.withings.device.ws;

import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: RetrofitDeviceRemoteRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/withings/device/ws/DeviceRetrofit2Api;", "Lnm0/y;", "<anonymous>", "(Lcom/withings/device/ws/DeviceRetrofit2Api;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.device.ws.RetrofitDeviceRemoteRepository$updateProperties$3", f = "RetrofitDeviceRemoteRepository.kt", l = {205}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RetrofitDeviceRemoteRepository$updateProperties$3 extends i implements p<DeviceRetrofit2Api, d<? super y>, Object> {
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
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitDeviceRemoteRepository$updateProperties$3(long j5, double d11, double d12, String str, long j11, long j12, String str2, boolean z5, boolean z11, int i11, String str3, Integer num, Boolean bool, d<? super RetrofitDeviceRemoteRepository$updateProperties$3> dVar) {
        super(2, dVar);
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

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitDeviceRemoteRepository$updateProperties$3 retrofitDeviceRemoteRepository$updateProperties$3 = new RetrofitDeviceRemoteRepository$updateProperties$3(this.$deviceId, this.$latitude, this.$longitude, this.$timezone, this.$impedancemeter, this.$debug, this.$prefLang, this.$micMute, this.$isExtraSensitivityEnabled, this.$measurementIntervalTime, this.$data, this.$classification, this.$vuMeter, dVar);
        retrofitDeviceRemoteRepository$updateProperties$3.L$0 = obj;
        return retrofitDeviceRemoteRepository$updateProperties$3;
    }

    @Override // ym0.p
    public final Object invoke(DeviceRetrofit2Api deviceRetrofit2Api, d<? super y> dVar) {
        return ((RetrofitDeviceRemoteRepository$updateProperties$3) create(deviceRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            l.b(obj);
            DeviceRetrofit2Api deviceRetrofit2Api = (DeviceRetrofit2Api) this.L$0;
            long j5 = this.$deviceId;
            double d11 = this.$latitude;
            double d12 = this.$longitude;
            String str = this.$timezone;
            long j11 = this.$impedancemeter;
            long j12 = this.$debug;
            String str2 = this.$prefLang;
            boolean z5 = this.$micMute;
            boolean z11 = this.$isExtraSensitivityEnabled;
            int i12 = this.$measurementIntervalTime;
            String str3 = this.$data;
            Integer num = this.$classification;
            Boolean bool = this.$vuMeter;
            this.label = 1;
            if (deviceRetrofit2Api.updateProperties(j5, d11, d12, str, j11, j12, str2, z5, z11, i12, str3, num, bool, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }
}
