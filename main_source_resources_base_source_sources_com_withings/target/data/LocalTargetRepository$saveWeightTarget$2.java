package com.withings.target.data;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.target.Target;
import com.withings.target.WeightGoal;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: LocalTargetRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.target.data.LocalTargetRepository$saveWeightTarget$2", f = "LocalTargetRepository.kt", l = {ConstantsWs.WS_STATUS_MAX_INVITATION_SENT_BYTYPE, 405}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class LocalTargetRepository$saveWeightTarget$2 extends i implements p<CoroutineScope, d<? super y>, Object> {
    final /* synthetic */ long $userId;
    final /* synthetic */ WeightGoal $weightGoal;
    int label;
    final /* synthetic */ LocalTargetRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalTargetRepository$saveWeightTarget$2(LocalTargetRepository localTargetRepository, long j5, WeightGoal weightGoal, d<? super LocalTargetRepository$saveWeightTarget$2> dVar) {
        super(2, dVar);
        this.this$0 = localTargetRepository;
        this.$userId = j5;
        this.$weightGoal = weightGoal;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new LocalTargetRepository$saveWeightTarget$2(this.this$0, this.$userId, this.$weightGoal, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Long l5;
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
            Target weightTarget = this.this$0.getWeightTarget(this.$userId);
            if (weightTarget != null) {
                l5 = weightTarget.getId();
            } else {
                l5 = null;
            }
            if (l5 != null) {
                targetDataSource = this.this$0.dataSource;
                Target copy$default = Target.copy$default(weightTarget, null, null, 0L, 0, 0, 0, 0, 0, false, null, null, null, null, false, null, 32511, null);
                this.label = 1;
                if (targetDataSource.update(copy$default, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        Target target = new Target(null, null, this.$userId, 1, 1, Integer.MIN_VALUE, (int) (Math.pow(10.0d, 3.0d) * this.$weightGoal.getTarget()), -3, true, null, this.$weightGoal.getDate(), this.$weightGoal.getDate(), this.$weightGoal.getDate(), false, null, 16899, null);
        Target target2 = new Target(null, null, this.$userId, 1, 18, Integer.MIN_VALUE, (int) (Math.pow(10.0d, 3.0d) * this.$weightGoal.getSpeed()), -3, true, null, this.$weightGoal.getDate(), this.$weightGoal.getDate(), this.$weightGoal.getDate(), false, null, 16899, null);
        targetDataSource2 = this.this$0.dataSource;
        List<Target> W = x.W(target, target2);
        this.label = 2;
        if (targetDataSource2.insert(W, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return y.f85009a;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((LocalTargetRepository$saveWeightTarget$2) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
