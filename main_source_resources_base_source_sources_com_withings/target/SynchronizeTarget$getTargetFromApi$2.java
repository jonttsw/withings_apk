package com.withings.target;

import com.withings.target.data.TargetRepository;
import com.withings.target.data.api.model.TargetSeriesWS;
import com.withings.target.domain.SaveTargetFromServerUseCase;
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
/* compiled from: SynchronizeTarget.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.target.SynchronizeTarget$getTargetFromApi$2", f = "SynchronizeTarget.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class SynchronizeTarget$getTargetFromApi$2 extends i implements p<CoroutineScope, d<? super y>, Object> {
    final /* synthetic */ TargetSeriesWS $seriesFromServer;
    final /* synthetic */ List<Target> $targetsFromDAO;
    int label;
    final /* synthetic */ SynchronizeTarget this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SynchronizeTarget$getTargetFromApi$2(SynchronizeTarget synchronizeTarget, TargetSeriesWS targetSeriesWS, List<Target> list, d<? super SynchronizeTarget$getTargetFromApi$2> dVar) {
        super(2, dVar);
        this.this$0 = synchronizeTarget;
        this.$seriesFromServer = targetSeriesWS;
        this.$targetsFromDAO = list;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new SynchronizeTarget$getTargetFromApi$2(this.this$0, this.$seriesFromServer, this.$targetsFromDAO, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        TargetRepository targetRepository;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        if (this.label == 0) {
            l.b(obj);
            targetRepository = this.this$0.repository;
            new SaveTargetFromServerUseCase(targetRepository).invoke(this.$seriesFromServer.getTargets(), this.$targetsFromDAO);
            return y.f85009a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((SynchronizeTarget$getTargetFromApi$2) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
