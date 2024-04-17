package com.withings.device.ws;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.l;
/* compiled from: RetrofitDeviceRemoteRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/withings/device/ws/Links;", "Lcom/withings/device/ws/DeviceApi;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class RetrofitDeviceRemoteRepository$getUserLinks$2 extends w implements l<DeviceApi, Links> {
    final /* synthetic */ boolean $all;
    final /* synthetic */ Integer $deviceType;
    final /* synthetic */ long $userId;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitDeviceRemoteRepository$getUserLinks$2(long j5, Integer num, boolean z5) {
        super(1);
        this.$userId = j5;
        this.$deviceType = num;
        this.$all = z5;
    }

    @Override // ym0.l
    public final Links invoke(DeviceApi withApiForAccount) {
        u.j(withApiForAccount, "$this$withApiForAccount");
        return withApiForAccount.getUserLinks(this.$userId, this.$deviceType, this.$all);
    }
}
