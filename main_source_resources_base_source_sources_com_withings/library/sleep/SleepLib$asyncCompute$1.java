package com.withings.library.sleep;

import com.withings.library.sleep.platform.DispatcherRepository;
import gb.b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import qm0.d;
import ym0.l;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SleepLib.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
@e(c = "com.withings.library.sleep.SleepLib$asyncCompute$1", f = "SleepLib.kt", l = {125}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class SleepLib$asyncCompute$1 extends i implements p<CoroutineScope, d<? super y>, Object> {
    final /* synthetic */ int[] $bedInTimes;
    final /* synthetic */ int[] $bedOutTimes;
    final /* synthetic */ l $callback;
    final /* synthetic */ int $countPreviousNights;
    final /* synthetic */ int $deepDuration;
    final /* synthetic */ int $deviceModel;
    final /* synthetic */ int $durationToSleep;
    final /* synthetic */ int $durationToWakeUp;
    final /* synthetic */ boolean $enableAsleepTile;
    final /* synthetic */ boolean $enableWakeUpTile;
    final /* synthetic */ int $endDate;
    final /* synthetic */ int $lightDuration;
    final /* synthetic */ int $manualDuration;
    final /* synthetic */ int $remDuration;
    final /* synthetic */ int $startDate;
    final /* synthetic */ int $wakeUpCount;
    int label;
    final /* synthetic */ SleepLib this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SleepLib.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    @e(c = "com.withings.library.sleep.SleepLib$asyncCompute$1$1", f = "SleepLib.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.withings.library.sleep.SleepLib$asyncCompute$1$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends i implements p<CoroutineScope, d<? super y>, Object> {
        int label;

        AnonymousClass1(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> completion) {
            u.j(completion, "completion");
            return new AnonymousClass1(completion);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
            return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            NativeSleepLib nativeSleepLib;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            if (this.label == 0) {
                nm0.l.b(obj);
                nativeSleepLib = SleepLib$asyncCompute$1.this.this$0.nativeSleepLib;
                SleepLib$asyncCompute$1 sleepLib$asyncCompute$1 = SleepLib$asyncCompute$1.this;
                int i11 = sleepLib$asyncCompute$1.$lightDuration;
                int i12 = sleepLib$asyncCompute$1.$deepDuration;
                int i13 = sleepLib$asyncCompute$1.$remDuration;
                int i14 = sleepLib$asyncCompute$1.$manualDuration;
                int i15 = sleepLib$asyncCompute$1.$wakeUpCount;
                int i16 = sleepLib$asyncCompute$1.$durationToWakeUp;
                boolean z5 = sleepLib$asyncCompute$1.$enableWakeUpTile;
                int i17 = sleepLib$asyncCompute$1.$durationToSleep;
                boolean z11 = sleepLib$asyncCompute$1.$enableAsleepTile;
                SleepLib$asyncCompute$1.this.$callback.invoke(nativeSleepLib.compute(i11, i12, i13, i14, i15, i16, z5 ? 1 : 0, i17, z11 ? 1 : 0, sleepLib$asyncCompute$1.$startDate, sleepLib$asyncCompute$1.$endDate, sleepLib$asyncCompute$1.$bedInTimes, sleepLib$asyncCompute$1.$bedOutTimes, sleepLib$asyncCompute$1.$countPreviousNights, sleepLib$asyncCompute$1.$deviceModel));
                return y.f85009a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepLib$asyncCompute$1(SleepLib sleepLib, int i11, int i12, int i13, int i14, int i15, int i16, boolean z5, int i17, boolean z11, int i18, int i19, int[] iArr, int[] iArr2, int i21, int i22, l lVar, d dVar) {
        super(2, dVar);
        this.this$0 = sleepLib;
        this.$lightDuration = i11;
        this.$deepDuration = i12;
        this.$remDuration = i13;
        this.$manualDuration = i14;
        this.$wakeUpCount = i15;
        this.$durationToWakeUp = i16;
        this.$enableWakeUpTile = z5;
        this.$durationToSleep = i17;
        this.$enableAsleepTile = z11;
        this.$startDate = i18;
        this.$endDate = i19;
        this.$bedInTimes = iArr;
        this.$bedOutTimes = iArr2;
        this.$countPreviousNights = i21;
        this.$deviceModel = i22;
        this.$callback = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> completion) {
        u.j(completion, "completion");
        return new SleepLib$asyncCompute$1(this.this$0, this.$lightDuration, this.$deepDuration, this.$remDuration, this.$manualDuration, this.$wakeUpCount, this.$durationToWakeUp, this.$enableWakeUpTile, this.$durationToSleep, this.$enableAsleepTile, this.$startDate, this.$endDate, this.$bedInTimes, this.$bedOutTimes, this.$countPreviousNights, this.$deviceModel, this.$callback, completion);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((SleepLib$asyncCompute$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        DispatcherRepository dispatcherRepository;
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
            dispatcherRepository = this.this$0.dispatcherRepository;
            CoroutineDispatcher backgroundDispatcher = dispatcherRepository.backgroundDispatcher();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.label = 1;
            if (b.a.a(backgroundDispatcher, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }
}
