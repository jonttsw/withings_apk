package com.withings.location.ktx;

import com.withings.location.model.GpsLocation;
import com.withings.location.repository.GpsLocationRepository;
import java.util.List;
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
/* compiled from: GpsLocationRepository.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "Lcom/withings/location/model/GpsLocation;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.location.ktx.GpsLocationRepositoryKt$getOnceBlocking$1", f = "GpsLocationRepository.kt", l = {14}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class GpsLocationRepositoryKt$getOnceBlocking$1 extends i implements p<CoroutineScope, d<? super List<? extends GpsLocation>>, Object> {
    final /* synthetic */ DateTime $from;
    final /* synthetic */ GpsLocationRepository $this_getOnceBlocking;
    final /* synthetic */ DateTime $to;
    final /* synthetic */ long $userId;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GpsLocationRepositoryKt$getOnceBlocking$1(GpsLocationRepository gpsLocationRepository, long j5, DateTime dateTime, DateTime dateTime2, d<? super GpsLocationRepositoryKt$getOnceBlocking$1> dVar) {
        super(2, dVar);
        this.$this_getOnceBlocking = gpsLocationRepository;
        this.$userId = j5;
        this.$from = dateTime;
        this.$to = dateTime2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new GpsLocationRepositoryKt$getOnceBlocking$1(this.$this_getOnceBlocking, this.$userId, this.$from, this.$to, dVar);
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, d<? super List<? extends GpsLocation>> dVar) {
        return invoke2(coroutineScope, (d<? super List<GpsLocation>>) dVar);
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
            GpsLocationRepository gpsLocationRepository = this.$this_getOnceBlocking;
            long j5 = this.$userId;
            DateTime dateTime = this.$from;
            DateTime dateTime2 = this.$to;
            this.label = 1;
            obj = GpsLocationRepositoryKt.getOnce(gpsLocationRepository, j5, dateTime, dateTime2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, d<? super List<GpsLocation>> dVar) {
        return ((GpsLocationRepositoryKt$getOnceBlocking$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
