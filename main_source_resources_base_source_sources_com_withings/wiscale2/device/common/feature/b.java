package com.withings.wiscale2.device.common.feature;

import com.withings.device.Device;
import com.withings.screen.model.DeviceScreensGroup;
import com.withings.screen.repository.DeviceScreensRepository;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DeviceScreenModifier.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.DeviceScreenModifier$forceScreenActivation$2", f = "DeviceScreenModifier.kt", l = {48}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f51048a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ c f51049b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Device f51050c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ long f51051d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ List<DeviceScreensGroup> f51052e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Device device, long j5, List<DeviceScreensGroup> list, qm0.d<? super b> dVar) {
        super(2, dVar);
        this.f51049b = cVar;
        this.f51050c = device;
        this.f51051d = j5;
        this.f51052e = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new b(this.f51049b, this.f51050c, this.f51051d, this.f51052e, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        DeviceScreensRepository deviceScreensRepository;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f51048a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            deviceScreensRepository = this.f51049b.f51055b;
            long id2 = this.f51050c.getId();
            this.f51048a = 1;
            if (deviceScreensRepository.updateOrderAndSelectedScreens(id2, this.f51051d, this.f51052e, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }
}
