package com.withings.target;

import com.withings.target.data.TargetRepository;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import nm0.y;
import qm0.d;
import ym0.l;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TargetObserver.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.target.TargetObserverKt$observeStepTargetUpdateForTrackerSync$1", f = "TargetObserver.kt", l = {32}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class TargetObserverKt$observeStepTargetUpdateForTrackerSync$1 extends i implements p<CoroutineScope, d<? super y>, Object> {
    final /* synthetic */ l<Long, y> $body;
    final /* synthetic */ TargetRepository $this_observeStepTargetUpdateForTrackerSync;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TargetObserver.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/withings/target/Target;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @e(c = "com.withings.target.TargetObserverKt$observeStepTargetUpdateForTrackerSync$1$2", f = "TargetObserver.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.withings.target.TargetObserverKt$observeStepTargetUpdateForTrackerSync$1$2  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2 extends i implements p<Target, d<? super Long>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(d<? super AnonymousClass2> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // ym0.p
        public final Object invoke(Target target, d<? super Long> dVar) {
            return ((AnonymousClass2) create(target, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            if (this.label == 0) {
                nm0.l.b(obj);
                Target target = (Target) this.L$0;
                if (target != null) {
                    return new Long(target.getUserId());
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TargetObserver.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lnm0/y;", "<anonymous>", "(J)V"}, k = 3, mv = {1, 9, 0})
    @e(c = "com.withings.target.TargetObserverKt$observeStepTargetUpdateForTrackerSync$1$3", f = "TargetObserver.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.withings.target.TargetObserverKt$observeStepTargetUpdateForTrackerSync$1$3  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass3 extends i implements p<Long, d<? super y>, Object> {
        final /* synthetic */ l<Long, y> $body;
        /* synthetic */ long J$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass3(l<? super Long, y> lVar, d<? super AnonymousClass3> dVar) {
            super(2, dVar);
            this.$body = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$body, dVar);
            anonymousClass3.J$0 = ((Number) obj).longValue();
            return anonymousClass3;
        }

        public final Object invoke(long j5, d<? super y> dVar) {
            return ((AnonymousClass3) create(Long.valueOf(j5), dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            if (this.label == 0) {
                nm0.l.b(obj);
                this.$body.invoke(new Long(this.J$0));
                return y.f85009a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // ym0.p
        public /* bridge */ /* synthetic */ Object invoke(Long l5, d<? super y> dVar) {
            return invoke(l5.longValue(), dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TargetObserverKt$observeStepTargetUpdateForTrackerSync$1(TargetRepository targetRepository, l<? super Long, y> lVar, d<? super TargetObserverKt$observeStepTargetUpdateForTrackerSync$1> dVar) {
        super(2, dVar);
        this.$this_observeStepTargetUpdateForTrackerSync = targetRepository;
        this.$body = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new TargetObserverKt$observeStepTargetUpdateForTrackerSync$1(this.$this_observeStepTargetUpdateForTrackerSync, this.$body, dVar);
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
            final Flow flowOn = FlowKt.flowOn(this.$this_observeStepTargetUpdateForTrackerSync.getActiveStepTargetsForAllUser(), Dispatchers.getIO());
            Flow filterNotNull = FlowKt.filterNotNull(FlowKt.mapLatest(FlowKt.distinctUntilChanged(new Flow<Target>() { // from class: com.withings.target.TargetObserverKt$observeStepTargetUpdateForTrackerSync$1$invokeSuspend$$inlined$map$1

                /* compiled from: Emitters.kt */
                @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lnm0/y;", "emit", "(Ljava/lang/Object;Lqm0/d;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.withings.target.TargetObserverKt$observeStepTargetUpdateForTrackerSync$1$invokeSuspend$$inlined$map$1$2  reason: invalid class name */
                /* loaded from: classes4.dex */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    /* compiled from: Emitters.kt */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    @e(c = "com.withings.target.TargetObserverKt$observeStepTargetUpdateForTrackerSync$1$invokeSuspend$$inlined$map$1$2", f = "TargetObserver.kt", l = {223}, m = "emit")
                    /* renamed from: com.withings.target.TargetObserverKt$observeStepTargetUpdateForTrackerSync$1$invokeSuspend$$inlined$map$1$2$1  reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass1 extends c {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(d dVar) {
                            super(dVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(java.lang.Object r5, qm0.d r6) {
                        /*
                            r4 = this;
                            boolean r0 = r6 instanceof com.withings.target.TargetObserverKt$observeStepTargetUpdateForTrackerSync$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r6
                            com.withings.target.TargetObserverKt$observeStepTargetUpdateForTrackerSync$1$invokeSuspend$$inlined$map$1$2$1 r0 = (com.withings.target.TargetObserverKt$observeStepTargetUpdateForTrackerSync$1$invokeSuspend$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.withings.target.TargetObserverKt$observeStepTargetUpdateForTrackerSync$1$invokeSuspend$$inlined$map$1$2$1 r0 = new com.withings.target.TargetObserverKt$observeStepTargetUpdateForTrackerSync$1$invokeSuspend$$inlined$map$1$2$1
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.result
                            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L2f
                            if (r2 != r3) goto L27
                            nm0.l.b(r6)
                            goto L43
                        L27:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r6)
                            throw r5
                        L2f:
                            nm0.l.b(r6)
                            kotlinx.coroutines.flow.FlowCollector r6 = r4.$this_unsafeFlow
                            java.util.List r5 = (java.util.List) r5
                            java.lang.Object r5 = kotlin.collections.x.U(r5)
                            r0.label = r3
                            java.lang.Object r5 = r6.emit(r5, r0)
                            if (r5 != r1) goto L43
                            return r1
                        L43:
                            nm0.y r5 = nm0.y.f85009a
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.withings.target.TargetObserverKt$observeStepTargetUpdateForTrackerSync$1$invokeSuspend$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, qm0.d):java.lang.Object");
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Target> flowCollector, d dVar) {
                    Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), dVar);
                    if (collect == CoroutineSingletons.f76214a) {
                        return collect;
                    }
                    return y.f85009a;
                }
            }), new AnonymousClass2(null)));
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$body, null);
            this.label = 1;
            if (FlowKt.collectLatest(filterNotNull, anonymousClass3, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((TargetObserverKt$observeStepTargetUpdateForTrackerSync$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
