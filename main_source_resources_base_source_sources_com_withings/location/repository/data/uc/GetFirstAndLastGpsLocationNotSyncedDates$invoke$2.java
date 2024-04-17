package com.withings.location.repository.data.uc;

import com.withings.location.repository.data.db.GpsLocationDao;
import com.withings.location.repository.data.model.MinMaxDates;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.j;
import nm0.l;
import nm0.y;
import org.joda.time.DateTime;
import qm0.d;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GetFirstAndLastGpsLocationNotSyncedDates.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/j;", "Lorg/joda/time/DateTime;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)Lnm0/j;"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.location.repository.data.uc.GetFirstAndLastGpsLocationNotSyncedDates$invoke$2", f = "GetFirstAndLastGpsLocationNotSyncedDates.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class GetFirstAndLastGpsLocationNotSyncedDates$invoke$2 extends i implements p<CoroutineScope, d<? super j<? extends DateTime, ? extends DateTime>>, Object> {
    final /* synthetic */ long $userId;
    int label;
    final /* synthetic */ GetFirstAndLastGpsLocationNotSyncedDates this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetFirstAndLastGpsLocationNotSyncedDates$invoke$2(GetFirstAndLastGpsLocationNotSyncedDates getFirstAndLastGpsLocationNotSyncedDates, long j5, d<? super GetFirstAndLastGpsLocationNotSyncedDates$invoke$2> dVar) {
        super(2, dVar);
        this.this$0 = getFirstAndLastGpsLocationNotSyncedDates;
        this.$userId = j5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new GetFirstAndLastGpsLocationNotSyncedDates$invoke$2(this.this$0, this.$userId, dVar);
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, d<? super j<? extends DateTime, ? extends DateTime>> dVar) {
        return invoke2(coroutineScope, (d<? super j<DateTime, DateTime>>) dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        GpsLocationDao gpsLocationDao;
        DateTime dateTime;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        if (this.label == 0) {
            l.b(obj);
            gpsLocationDao = this.this$0.dao;
            MinMaxDates firstAndLastNotSyncedDatesForUser = gpsLocationDao.getFirstAndLastNotSyncedDatesForUser(this.$userId);
            Long minValue = firstAndLastNotSyncedDatesForUser.getMinValue();
            DateTime dateTime2 = null;
            if (minValue != null) {
                dateTime = new DateTime(minValue.longValue());
            } else {
                dateTime = null;
            }
            Long maxValue = firstAndLastNotSyncedDatesForUser.getMaxValue();
            if (maxValue != null) {
                dateTime2 = new DateTime(maxValue.longValue());
            }
            return new j(dateTime, dateTime2);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, d<? super j<DateTime, DateTime>> dVar) {
        return ((GetFirstAndLastGpsLocationNotSyncedDates$invoke$2) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
