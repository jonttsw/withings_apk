package com.withings.device.ws;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.l;
/* compiled from: RetrofitDeviceRemoteRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/withings/device/ws/Associations;", "Lcom/withings/device/ws/DeviceApi;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class RetrofitDeviceRemoteRepository$getAssociationsByType$2 extends w implements l<DeviceApi, Associations> {
    final /* synthetic */ String $enrich;
    final /* synthetic */ int $type;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitDeviceRemoteRepository$getAssociationsByType$2(int i11, String str) {
        super(1);
        this.$type = i11;
        this.$enrich = str;
    }

    @Override // ym0.l
    public final Associations invoke(DeviceApi withApiForAccount) {
        u.j(withApiForAccount, "$this$withApiForAccount");
        return withApiForAccount.getAssociationsByType(this.$type, this.$enrich);
    }
}
