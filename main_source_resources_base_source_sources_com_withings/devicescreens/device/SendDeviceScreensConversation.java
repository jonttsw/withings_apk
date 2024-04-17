package com.withings.devicescreens.device;

import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.screen.domain.uc.GetMissingFeatureTagUseCase;
import com.withings.screen.repository.DeviceScreensRepository;
import fl.p;
import kn.e;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import vr.d;
/* compiled from: SendDeviceScreensConversation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/devicescreens/device/SendDeviceScreensConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "a", "devicescreens_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SendDeviceScreensConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final e f37683f;

    /* renamed from: g  reason: collision with root package name */
    private final DeviceScreensRepository f37684g;

    /* renamed from: h  reason: collision with root package name */
    private final GetMissingFeatureTagUseCase f37685h;

    /* renamed from: i  reason: collision with root package name */
    private final d f37686i;

    /* renamed from: j  reason: collision with root package name */
    private final p f37687j;

    /* compiled from: SendDeviceScreensConversation.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/withings/devicescreens/device/SendDeviceScreensConversation$a;", "", "devicescreens_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public interface a {
        GetMissingFeatureTagUseCase K();

        p N();

        DeviceScreensRepository e();

        d g();
    }

    public SendDeviceScreensConversation(e deviceManager, DeviceScreensRepository deviceScreensRepository, GetMissingFeatureTagUseCase getMissingFeatureTagUseCase, d featureTagsRepository, p hmDeviceModelFactory) {
        u.j(deviceManager, "deviceManager");
        u.j(deviceScreensRepository, "deviceScreensRepository");
        u.j(getMissingFeatureTagUseCase, "getMissingFeatureTagUseCase");
        u.j(featureTagsRepository, "featureTagsRepository");
        u.j(hmDeviceModelFactory, "hmDeviceModelFactory");
        this.f37683f = deviceManager;
        this.f37684g = deviceScreensRepository;
        this.f37685h = getMissingFeatureTagUseCase;
        this.f37686i = featureTagsRepository;
        this.f37687j = hmDeviceModelFactory;
    }

    /* JADX WARN: Removed duplicated region for block: B:173:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0557 A[SYNTHETIC] */
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D() throws com.withings.comm.wpp.exception.UnsupportedCommandException {
        /*
            Method dump skipped, instructions count: 1437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.devicescreens.device.SendDeviceScreensConversation.D():void");
    }
}
