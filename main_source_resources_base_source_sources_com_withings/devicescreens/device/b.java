package com.withings.devicescreens.device;

import com.withings.device.Device;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.screen.repository.DeviceScreensRepository;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: SendDeviceScreensConversation.kt */
@e(c = "com.withings.devicescreens.device.SendDeviceScreensConversation$setSyncedWithDevice$1", f = "SendDeviceScreensConversation.kt", l = {ConstantsWs.MEASURE_TYPE_VIRUS_SARS_COV_2}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class b extends i implements p<CoroutineScope, d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f37689a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SendDeviceScreensConversation f37690b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Device f37691c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SendDeviceScreensConversation sendDeviceScreensConversation, Device device, d<? super b> dVar) {
        super(2, dVar);
        this.f37690b = sendDeviceScreensConversation;
        this.f37691c = device;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new b(this.f37690b, this.f37691c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        DeviceScreensRepository deviceScreensRepository;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f37689a;
        if (i11 != 0) {
            if (i11 == 1) {
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            l.b(obj);
            deviceScreensRepository = this.f37690b.f37684g;
            long id2 = this.f37691c.getId();
            this.f37689a = 1;
            if (deviceScreensRepository.setSyncedWithDevice(id2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }
}
