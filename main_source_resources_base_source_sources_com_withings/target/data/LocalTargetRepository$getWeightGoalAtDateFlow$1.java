package com.withings.target.data;

import com.withings.target.Target;
import com.withings.target.WeightGoal;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import nm0.l;
import nm0.y;
import org.joda.time.DateTime;
import qm0.d;
import ym0.q;
/* compiled from: LocalTargetRepository.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/target/WeightGoal;", "weight", "Lcom/withings/target/Target;", "weightSpeed"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.target.data.LocalTargetRepository$getWeightGoalAtDateFlow$1", f = "LocalTargetRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class LocalTargetRepository$getWeightGoalAtDateFlow$1 extends i implements q<Target, Target, d<? super WeightGoal>, Object> {
    final /* synthetic */ DateTime $date;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalTargetRepository$getWeightGoalAtDateFlow$1(DateTime dateTime, d<? super LocalTargetRepository$getWeightGoalAtDateFlow$1> dVar) {
        super(3, dVar);
        this.$date = dateTime;
    }

    @Override // ym0.q
    public final Object invoke(Target target, Target target2, d<? super WeightGoal> dVar) {
        LocalTargetRepository$getWeightGoalAtDateFlow$1 localTargetRepository$getWeightGoalAtDateFlow$1 = new LocalTargetRepository$getWeightGoalAtDateFlow$1(this.$date, dVar);
        localTargetRepository$getWeightGoalAtDateFlow$1.L$0 = target;
        localTargetRepository$getWeightGoalAtDateFlow$1.L$1 = target2;
        return localTargetRepository$getWeightGoalAtDateFlow$1.invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        if (this.label == 0) {
            l.b(obj);
            Target target = (Target) this.L$0;
            Target target2 = (Target) this.L$1;
            if (target != null && target2 != null) {
                return new WeightGoal(target.getAsDouble(), target2.getAsDouble(), this.$date);
            }
            return null;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
