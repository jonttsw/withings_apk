package com.withings.target.data;

import com.withings.target.Target;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import nm0.l;
import nm0.y;
import org.joda.time.DateTime;
import qm0.d;
import ym0.p;
/* compiled from: LocalTargetRepository.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/target/Target;", "target"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.target.data.LocalTargetRepository$getLastActiveWorkoutTargetFlow$1", f = "LocalTargetRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class LocalTargetRepository$getLastActiveWorkoutTargetFlow$1 extends i implements p<Target, d<? super Target>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LocalTargetRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalTargetRepository$getLastActiveWorkoutTargetFlow$1(LocalTargetRepository localTargetRepository, d<? super LocalTargetRepository$getLastActiveWorkoutTargetFlow$1> dVar) {
        super(2, dVar);
        this.this$0 = localTargetRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        LocalTargetRepository$getLastActiveWorkoutTargetFlow$1 localTargetRepository$getLastActiveWorkoutTargetFlow$1 = new LocalTargetRepository$getLastActiveWorkoutTargetFlow$1(this.this$0, dVar);
        localTargetRepository$getLastActiveWorkoutTargetFlow$1.L$0 = obj;
        return localTargetRepository$getLastActiveWorkoutTargetFlow$1;
    }

    @Override // ym0.p
    public final Object invoke(Target target, d<? super Target> dVar) {
        return ((LocalTargetRepository$getLastActiveWorkoutTargetFlow$1) create(target, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Target mantissaToZeroIfDeactivatedBeforeDate;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        if (this.label == 0) {
            l.b(obj);
            LocalTargetRepository localTargetRepository = this.this$0;
            DateTime now = DateTime.now();
            u.i(now, "now(...)");
            mantissaToZeroIfDeactivatedBeforeDate = localTargetRepository.setMantissaToZeroIfDeactivatedBeforeDate((Target) this.L$0, now);
            return mantissaToZeroIfDeactivatedBeforeDate;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
