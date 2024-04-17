package com.withings.location.repository;

import com.withings.location.repository.data.db.GpsLocationDao;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: RoomGpsLocationRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.location.repository.RoomGpsLocationRepository$clear$2", f = "RoomGpsLocationRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class RoomGpsLocationRepository$clear$2 extends i implements p<CoroutineScope, d<? super y>, Object> {
    int label;
    final /* synthetic */ RoomGpsLocationRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomGpsLocationRepository$clear$2(RoomGpsLocationRepository roomGpsLocationRepository, d<? super RoomGpsLocationRepository$clear$2> dVar) {
        super(2, dVar);
        this.this$0 = roomGpsLocationRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new RoomGpsLocationRepository$clear$2(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        GpsLocationDao gpsLocationDao;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        if (this.label == 0) {
            l.b(obj);
            gpsLocationDao = this.this$0.dao;
            gpsLocationDao.deleteAll();
            return y.f85009a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((RoomGpsLocationRepository$clear$2) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
