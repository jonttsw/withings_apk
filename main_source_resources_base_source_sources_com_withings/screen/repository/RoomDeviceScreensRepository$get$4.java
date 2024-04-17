package com.withings.screen.repository;

import com.withings.screen.model.DeviceScreensGroup;
import com.withings.screen.repository.data.model.DeviceScreenContentEntity;
import com.withings.screen.repository.data.model.DeviceScreenEntity;
import com.withings.screen.repository.data.model.DeviceScreensGroupEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.r;
/* compiled from: RoomDeviceScreensRepository.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0001H\u008a@"}, d2 = {"<anonymous>", "", "Lcom/withings/screen/model/DeviceScreensGroup;", "groups", "Lcom/withings/screen/repository/data/model/DeviceScreensGroupEntity;", "screens", "Lcom/withings/screen/repository/data/model/DeviceScreenEntity;", "contents", "Lcom/withings/screen/repository/data/model/DeviceScreenContentEntity;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.screen.repository.RoomDeviceScreensRepository$get$4", f = "RoomDeviceScreensRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class RoomDeviceScreensRepository$get$4 extends i implements r<List<? extends DeviceScreensGroupEntity>, List<? extends DeviceScreenEntity>, List<? extends DeviceScreenContentEntity>, d<? super List<? extends DeviceScreensGroup>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ RoomDeviceScreensRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomDeviceScreensRepository$get$4(RoomDeviceScreensRepository roomDeviceScreensRepository, d<? super RoomDeviceScreensRepository$get$4> dVar) {
        super(4, dVar);
        this.this$0 = roomDeviceScreensRepository;
    }

    @Override // ym0.r
    public /* bridge */ /* synthetic */ Object invoke(List<? extends DeviceScreensGroupEntity> list, List<? extends DeviceScreenEntity> list2, List<? extends DeviceScreenContentEntity> list3, d<? super List<? extends DeviceScreensGroup>> dVar) {
        return invoke2((List<DeviceScreensGroupEntity>) list, (List<DeviceScreenEntity>) list2, (List<DeviceScreenContentEntity>) list3, (d<? super List<DeviceScreensGroup>>) dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        List map;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        if (this.label == 0) {
            l.b(obj);
            map = this.this$0.map((List) this.L$0, (List) this.L$1, (List) this.L$2);
            return map;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(List<DeviceScreensGroupEntity> list, List<DeviceScreenEntity> list2, List<DeviceScreenContentEntity> list3, d<? super List<DeviceScreensGroup>> dVar) {
        RoomDeviceScreensRepository$get$4 roomDeviceScreensRepository$get$4 = new RoomDeviceScreensRepository$get$4(this.this$0, dVar);
        roomDeviceScreensRepository$get$4.L$0 = list;
        roomDeviceScreensRepository$get$4.L$1 = list2;
        roomDeviceScreensRepository$get$4.L$2 = list3;
        return roomDeviceScreensRepository$get$4.invokeSuspend(y.f85009a);
    }
}
