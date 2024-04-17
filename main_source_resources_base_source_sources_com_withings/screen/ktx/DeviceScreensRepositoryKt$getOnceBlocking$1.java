package com.withings.screen.ktx;

import com.withings.screen.model.DeviceScreensGroup;
import com.withings.screen.repository.DeviceScreensRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: DeviceScreensRepository.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "Lcom/withings/screen/model/DeviceScreensGroup;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.screen.ktx.DeviceScreensRepositoryKt$getOnceBlocking$1", f = "DeviceScreensRepository.kt", l = {13}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DeviceScreensRepositoryKt$getOnceBlocking$1 extends i implements p<CoroutineScope, d<? super List<? extends DeviceScreensGroup>>, Object> {
    final /* synthetic */ long $deviceId;
    final /* synthetic */ DeviceScreensRepository $this_getOnceBlocking;
    final /* synthetic */ Long $userId;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceScreensRepositoryKt$getOnceBlocking$1(DeviceScreensRepository deviceScreensRepository, long j5, Long l5, d<? super DeviceScreensRepositoryKt$getOnceBlocking$1> dVar) {
        super(2, dVar);
        this.$this_getOnceBlocking = deviceScreensRepository;
        this.$deviceId = j5;
        this.$userId = l5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new DeviceScreensRepositoryKt$getOnceBlocking$1(this.$this_getOnceBlocking, this.$deviceId, this.$userId, dVar);
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, d<? super List<? extends DeviceScreensGroup>> dVar) {
        return invoke2(coroutineScope, (d<? super List<DeviceScreensGroup>>) dVar);
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
            DeviceScreensRepository deviceScreensRepository = this.$this_getOnceBlocking;
            long j5 = this.$deviceId;
            Long l5 = this.$userId;
            this.label = 1;
            obj = DeviceScreensRepositoryKt.getOnce(deviceScreensRepository, j5, l5, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, d<? super List<DeviceScreensGroup>> dVar) {
        return ((DeviceScreensRepositoryKt$getOnceBlocking$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
