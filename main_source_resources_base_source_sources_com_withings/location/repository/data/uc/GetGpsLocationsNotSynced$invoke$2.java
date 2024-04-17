package com.withings.location.repository.data.uc;

import com.withings.location.model.GpsLocation;
import com.withings.location.repository.data.db.GpsLocationDao;
import com.withings.location.repository.data.mapper.GpsLocationEntityMapper;
import com.withings.location.repository.data.model.GpsLocationEntity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
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
/* compiled from: GetGpsLocationsNotSynced.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "Lcom/withings/location/model/GpsLocation;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.location.repository.data.uc.GetGpsLocationsNotSynced$invoke$2", f = "GetGpsLocationsNotSynced.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class GetGpsLocationsNotSynced$invoke$2 extends i implements p<CoroutineScope, d<? super List<? extends GpsLocation>>, Object> {
    final /* synthetic */ DateTime $from;
    final /* synthetic */ DateTime $to;
    final /* synthetic */ long $userId;
    int label;
    final /* synthetic */ GetGpsLocationsNotSynced this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetGpsLocationsNotSynced$invoke$2(GetGpsLocationsNotSynced getGpsLocationsNotSynced, long j5, DateTime dateTime, DateTime dateTime2, d<? super GetGpsLocationsNotSynced$invoke$2> dVar) {
        super(2, dVar);
        this.this$0 = getGpsLocationsNotSynced;
        this.$userId = j5;
        this.$from = dateTime;
        this.$to = dateTime2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new GetGpsLocationsNotSynced$invoke$2(this.this$0, this.$userId, this.$from, this.$to, dVar);
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, d<? super List<? extends GpsLocation>> dVar) {
        return invoke2(coroutineScope, (d<? super List<GpsLocation>>) dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        GpsLocationDao gpsLocationDao;
        GpsLocationEntityMapper gpsLocationEntityMapper;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        if (this.label == 0) {
            l.b(obj);
            gpsLocationDao = this.this$0.dao;
            List<GpsLocationEntity> notSyncedForUserBetweenDates = gpsLocationDao.getNotSyncedForUserBetweenDates(this.$userId, this.$from.getMillis(), this.$to.getMillis());
            GetGpsLocationsNotSynced getGpsLocationsNotSynced = this.this$0;
            ArrayList arrayList = new ArrayList(x.y(notSyncedForUserBetweenDates, 10));
            for (GpsLocationEntity gpsLocationEntity : notSyncedForUserBetweenDates) {
                gpsLocationEntityMapper = getGpsLocationsNotSynced.mapper;
                arrayList.add(gpsLocationEntityMapper.toGpsLocation(gpsLocationEntity));
            }
            return arrayList;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, d<? super List<GpsLocation>> dVar) {
        return ((GetGpsLocationsNotSynced$invoke$2) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
