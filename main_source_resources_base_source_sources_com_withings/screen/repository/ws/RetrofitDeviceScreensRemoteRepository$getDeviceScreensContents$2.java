package com.withings.screen.repository.ws;

import com.withings.screen.model.DeviceScreenContentResponse;
import com.withings.screen.repository.ws.api.DeviceScreensRetrofit1Api;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.l;
/* compiled from: RetrofitDeviceScreensRemoteRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/withings/screen/model/DeviceScreenContentResponse;", "Lcom/withings/screen/repository/ws/api/DeviceScreensRetrofit1Api;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class RetrofitDeviceScreensRemoteRepository$getDeviceScreensContents$2 extends w implements l<DeviceScreensRetrofit1Api, DeviceScreenContentResponse> {
    final /* synthetic */ long $deviceId;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitDeviceScreensRemoteRepository$getDeviceScreensContents$2(long j5) {
        super(1);
        this.$deviceId = j5;
    }

    @Override // ym0.l
    public final DeviceScreenContentResponse invoke(DeviceScreensRetrofit1Api withApiForAccount) {
        u.j(withApiForAccount, "$this$withApiForAccount");
        return withApiForAccount.getDeviceScreensContents(this.$deviceId);
    }
}
