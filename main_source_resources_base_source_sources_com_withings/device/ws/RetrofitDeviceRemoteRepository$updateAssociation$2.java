package com.withings.device.ws;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
/* compiled from: RetrofitDeviceRemoteRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/withings/device/ws/DeviceApi;", "Lnm0/y;", "invoke", "(Lcom/withings/device/ws/DeviceApi;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class RetrofitDeviceRemoteRepository$updateAssociation$2 extends w implements l<DeviceApi, y> {
    final /* synthetic */ long $associationId;
    final /* synthetic */ String $data;
    final /* synthetic */ String $name;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitDeviceRemoteRepository$updateAssociation$2(long j5, String str, String str2) {
        super(1);
        this.$associationId = j5;
        this.$name = str;
        this.$data = str2;
    }

    @Override // ym0.l
    public /* bridge */ /* synthetic */ y invoke(DeviceApi deviceApi) {
        invoke2(deviceApi);
        return y.f85009a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(DeviceApi withApiForAccount) {
        u.j(withApiForAccount, "$this$withApiForAccount");
        withApiForAccount.updateAssociation(this.$associationId, this.$name, this.$data);
    }
}
