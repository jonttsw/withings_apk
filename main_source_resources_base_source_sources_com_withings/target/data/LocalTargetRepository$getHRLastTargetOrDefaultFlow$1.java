package com.withings.target.data;

import com.withings.target.Target;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: LocalTargetRepository.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/target/Target;", "it"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.target.data.LocalTargetRepository$getHRLastTargetOrDefaultFlow$1", f = "LocalTargetRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class LocalTargetRepository$getHRLastTargetOrDefaultFlow$1 extends i implements p<Target, d<? super Target>, Object> {
    final /* synthetic */ int $hrMeasureType;
    final /* synthetic */ long $userId;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LocalTargetRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalTargetRepository$getHRLastTargetOrDefaultFlow$1(LocalTargetRepository localTargetRepository, long j5, int i11, d<? super LocalTargetRepository$getHRLastTargetOrDefaultFlow$1> dVar) {
        super(2, dVar);
        this.this$0 = localTargetRepository;
        this.$userId = j5;
        this.$hrMeasureType = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        LocalTargetRepository$getHRLastTargetOrDefaultFlow$1 localTargetRepository$getHRLastTargetOrDefaultFlow$1 = new LocalTargetRepository$getHRLastTargetOrDefaultFlow$1(this.this$0, this.$userId, this.$hrMeasureType, dVar);
        localTargetRepository$getHRLastTargetOrDefaultFlow$1.L$0 = obj;
        return localTargetRepository$getHRLastTargetOrDefaultFlow$1;
    }

    @Override // ym0.p
    public final Object invoke(Target target, d<? super Target> dVar) {
        return ((LocalTargetRepository$getHRLastTargetOrDefaultFlow$1) create(target, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Target defaultHRTarget;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        if (this.label == 0) {
            l.b(obj);
            Target target = (Target) this.L$0;
            if (target == null) {
                defaultHRTarget = this.this$0.getDefaultHRTarget(this.$userId, this.$hrMeasureType);
                return defaultHRTarget;
            }
            return target;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
