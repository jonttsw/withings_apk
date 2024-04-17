package com.withings.target.data;

import com.withings.target.Target;
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
/* compiled from: LocalTargetRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.target.data.LocalTargetRepository$disableWorkoutTarget$2", f = "LocalTargetRepository.kt", l = {485}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class LocalTargetRepository$disableWorkoutTarget$2 extends i implements p<CoroutineScope, d<? super y>, Object> {
    final /* synthetic */ long $userId;
    final /* synthetic */ int $workoutCategory;
    int label;
    final /* synthetic */ LocalTargetRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalTargetRepository$disableWorkoutTarget$2(LocalTargetRepository localTargetRepository, long j5, int i11, d<? super LocalTargetRepository$disableWorkoutTarget$2> dVar) {
        super(2, dVar);
        this.this$0 = localTargetRepository;
        this.$userId = j5;
        this.$workoutCategory = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new LocalTargetRepository$disableWorkoutTarget$2(this.this$0, this.$userId, this.$workoutCategory, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        TargetDataSource targetDataSource;
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
            Target lastActiveWorkoutTarget = this.this$0.getLastActiveWorkoutTarget(this.$userId, this.$workoutCategory);
            if (lastActiveWorkoutTarget != null) {
                targetDataSource = this.this$0.dataSource;
                Target copy$default = Target.copy$default(lastActiveWorkoutTarget, null, null, 0L, 0, 0, 0, 0, 0, false, DateTime.now(), null, null, null, false, null, 23807, null);
                this.label = 1;
                if (targetDataSource.update(copy$default, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                return y.f85009a;
            }
        }
        return y.f85009a;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((LocalTargetRepository$disableWorkoutTarget$2) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
