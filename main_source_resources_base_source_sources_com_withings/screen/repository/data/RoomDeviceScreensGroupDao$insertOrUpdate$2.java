package com.withings.screen.repository.data;

import com.withings.screen.repository.data.db.DeviceScreensGroupDao;
import com.withings.screen.repository.data.model.DeviceScreensGroupEntity;
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
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RoomDeviceScreensGroupDao.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.screen.repository.data.RoomDeviceScreensGroupDao$insertOrUpdate$2", f = "RoomDeviceScreensGroupDao.kt", l = {21}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class RoomDeviceScreensGroupDao$insertOrUpdate$2 extends i implements p<CoroutineScope, d<? super y>, Object> {
    final /* synthetic */ List<DeviceScreensGroupEntity> $groups;
    int label;
    final /* synthetic */ RoomDeviceScreensGroupDao this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomDeviceScreensGroupDao$insertOrUpdate$2(RoomDeviceScreensGroupDao roomDeviceScreensGroupDao, List<DeviceScreensGroupEntity> list, d<? super RoomDeviceScreensGroupDao$insertOrUpdate$2> dVar) {
        super(2, dVar);
        this.this$0 = roomDeviceScreensGroupDao;
        this.$groups = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new RoomDeviceScreensGroupDao$insertOrUpdate$2(this.this$0, this.$groups, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        DeviceScreensGroupDao deviceScreensGroupDao;
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
            deviceScreensGroupDao = this.this$0.dao;
            List<DeviceScreensGroupEntity> list = this.$groups;
            this.label = 1;
            if (deviceScreensGroupDao.insertOrUpdate(list, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((RoomDeviceScreensGroupDao$insertOrUpdate$2) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
