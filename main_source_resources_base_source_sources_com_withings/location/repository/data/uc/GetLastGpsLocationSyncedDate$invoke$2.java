package com.withings.location.repository.data.uc;

import com.withings.location.repository.data.db.GpsLocationDao;
import com.withings.location.repository.data.model.GpsLocationEntity;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import org.joda.time.DateTime;
import qm0.d;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GetLastGpsLocationSyncedDate.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lorg/joda/time/DateTime;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.location.repository.data.uc.GetLastGpsLocationSyncedDate$invoke$2", f = "GetLastGpsLocationSyncedDate.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class GetLastGpsLocationSyncedDate$invoke$2 extends i implements p<CoroutineScope, d<? super DateTime>, Object> {
    final /* synthetic */ long $userId;
    int label;
    final /* synthetic */ GetLastGpsLocationSyncedDate this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLastGpsLocationSyncedDate$invoke$2(GetLastGpsLocationSyncedDate getLastGpsLocationSyncedDate, long j5, d<? super GetLastGpsLocationSyncedDate$invoke$2> dVar) {
        super(2, dVar);
        this.this$0 = getLastGpsLocationSyncedDate;
        this.$userId = j5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new GetLastGpsLocationSyncedDate$invoke$2(this.this$0, this.$userId, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        GpsLocationDao gpsLocationDao;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        if (this.label == 0) {
            l.b(obj);
            gpsLocationDao = this.this$0.gpsLocationDao;
            GpsLocationEntity lastSyncedForUser = gpsLocationDao.getLastSyncedForUser(this.$userId);
            if (lastSyncedForUser != null) {
                return lastSyncedForUser.getDate();
            }
            return null;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super DateTime> dVar) {
        return ((GetLastGpsLocationSyncedDate$invoke$2) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
