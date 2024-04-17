package com.withings.target.data;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.target.Target;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import org.joda.time.DateTime;
import qm0.d;
import ym0.p;
/* compiled from: LocalTargetRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.target.data.LocalTargetRepository$saveStepTarget$2", f = "LocalTargetRepository.kt", l = {ConstantsWs.MEASURE_TYPE_HR_SD_NN, ConstantsWs.MEASURE_TYPE_INTRACELLULAR_WATER}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class LocalTargetRepository$saveStepTarget$2 extends i implements p<CoroutineScope, d<? super y>, Object> {
    final /* synthetic */ int $goal;
    final /* synthetic */ long $userId;
    int label;
    final /* synthetic */ LocalTargetRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalTargetRepository$saveStepTarget$2(LocalTargetRepository localTargetRepository, long j5, int i11, d<? super LocalTargetRepository$saveStepTarget$2> dVar) {
        super(2, dVar);
        this.this$0 = localTargetRepository;
        this.$userId = j5;
        this.$goal = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new LocalTargetRepository$saveStepTarget$2(this.this$0, this.$userId, this.$goal, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        TargetDataSource targetDataSource;
        TargetDataSource targetDataSource2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    l.b(obj);
                    return y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l.b(obj);
        } else {
            l.b(obj);
            Target lastActiveStepsTargetOrDefault = this.this$0.getLastActiveStepsTargetOrDefault(this.$userId);
            if (lastActiveStepsTargetOrDefault.getId() != null) {
                targetDataSource = this.this$0.dataSource;
                Target copy$default = Target.copy$default(lastActiveStepsTargetOrDefault, null, null, 0L, 0, 0, 0, 0, 0, false, null, null, null, null, false, null, 32511, null);
                this.label = 1;
                if (targetDataSource.update(copy$default, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        DateTime now = DateTime.now();
        long j5 = this.$userId;
        int i12 = this.$goal;
        u.g(now);
        Target target = new Target(null, null, j5, 2, 36, 1, i12, 0, true, null, now, now, now, false, null, 16899, null);
        targetDataSource2 = this.this$0.dataSource;
        this.label = 2;
        if (targetDataSource2.insert(target, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return y.f85009a;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((LocalTargetRepository$saveStepTarget$2) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
