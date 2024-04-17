package com.withings.target;

import com.withings.target.data.TargetRepository;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import nm0.y;
import qm0.d;
import ym0.l;
import ym0.p;
/* compiled from: TargetObserver.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.target.TargetObserverKt$observeStepTarget$1", f = "TargetObserver.kt", l = {19}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class TargetObserverKt$observeStepTarget$1 extends i implements p<CoroutineScope, d<? super y>, Object> {
    final /* synthetic */ l<Target, y> $body;
    final /* synthetic */ TargetRepository $this_observeStepTarget;
    final /* synthetic */ long $userId;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TargetObserver.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/withings/target/Target;", "it", "Lnm0/y;", "<anonymous>", "(Lcom/withings/target/Target;)V"}, k = 3, mv = {1, 9, 0})
    @e(c = "com.withings.target.TargetObserverKt$observeStepTarget$1$1", f = "TargetObserver.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.withings.target.TargetObserverKt$observeStepTarget$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends i implements p<Target, d<? super y>, Object> {
        final /* synthetic */ l<Target, y> $body;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(l<? super Target, y> lVar, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$body = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$body, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // ym0.p
        public final Object invoke(Target target, d<? super y> dVar) {
            return ((AnonymousClass1) create(target, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            if (this.label == 0) {
                nm0.l.b(obj);
                this.$body.invoke((Target) this.L$0);
                return y.f85009a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TargetObserverKt$observeStepTarget$1(TargetRepository targetRepository, long j5, l<? super Target, y> lVar, d<? super TargetObserverKt$observeStepTarget$1> dVar) {
        super(2, dVar);
        this.$this_observeStepTarget = targetRepository;
        this.$userId = j5;
        this.$body = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new TargetObserverKt$observeStepTarget$1(this.$this_observeStepTarget, this.$userId, this.$body, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            Flow filterNotNull = FlowKt.filterNotNull(this.$this_observeStepTarget.getLastActiveStepTargetFlow(this.$userId));
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$body, null);
            this.label = 1;
            if (FlowKt.collectLatest(filterNotNull, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((TargetObserverKt$observeStepTarget$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
