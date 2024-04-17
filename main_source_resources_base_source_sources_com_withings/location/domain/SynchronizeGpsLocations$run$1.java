package com.withings.location.domain;

import com.withings.location.repository.GpsLocationRepository;
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
/* compiled from: SynchronizeGpsLocations.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.location.domain.SynchronizeGpsLocations$run$1", f = "SynchronizeGpsLocations.kt", l = {18}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SynchronizeGpsLocations$run$1 extends i implements p<CoroutineScope, d<? super y>, Object> {
    final /* synthetic */ DateTime $lastUpdate;
    int label;
    final /* synthetic */ SynchronizeGpsLocations this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SynchronizeGpsLocations$run$1(SynchronizeGpsLocations synchronizeGpsLocations, DateTime dateTime, d<? super SynchronizeGpsLocations$run$1> dVar) {
        super(2, dVar);
        this.this$0 = synchronizeGpsLocations;
        this.$lastUpdate = dateTime;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new SynchronizeGpsLocations$run$1(this.this$0, this.$lastUpdate, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        GpsLocationRepository gpsLocationRepository;
        long j5;
        int i11;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i12 = this.label;
        if (i12 != 0) {
            if (i12 == 1) {
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            l.b(obj);
            gpsLocationRepository = this.this$0.gpsLocationRepository;
            j5 = this.this$0.userId;
            DateTime dateTime = this.$lastUpdate;
            if (dateTime == null) {
                dateTime = new DateTime(0L);
            }
            DateTime dateTime2 = dateTime;
            i11 = this.this$0.maxDaysToSync;
            String syncContext = this.this$0.getSyncContext();
            if (syncContext == null) {
                syncContext = "unknown_context";
            }
            this.label = 1;
            if (gpsLocationRepository.synchronize(j5, dateTime2, i11, syncContext, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((SynchronizeGpsLocations$run$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
