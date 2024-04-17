package com.withings.target.data;

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
@e(c = "com.withings.target.data.LocalTargetRepository$changeHeartRateThresholdActivation$2", f = "LocalTargetRepository.kt", l = {300}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class LocalTargetRepository$changeHeartRateThresholdActivation$2 extends i implements p<CoroutineScope, d<? super y>, Object> {
    final /* synthetic */ int $hrMeasureType;
    final /* synthetic */ boolean $isActivate;
    final /* synthetic */ long $userId;
    int label;
    final /* synthetic */ LocalTargetRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalTargetRepository$changeHeartRateThresholdActivation$2(LocalTargetRepository localTargetRepository, long j5, int i11, boolean z5, d<? super LocalTargetRepository$changeHeartRateThresholdActivation$2> dVar) {
        super(2, dVar);
        this.this$0 = localTargetRepository;
        this.$userId = j5;
        this.$hrMeasureType = i11;
        this.$isActivate = z5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new LocalTargetRepository$changeHeartRateThresholdActivation$2(this.this$0, this.$userId, this.$hrMeasureType, this.$isActivate, dVar);
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
            Target hRLastTarget = this.this$0.getHRLastTarget(this.$userId, this.$hrMeasureType);
            if (hRLastTarget != null) {
                if (hRLastTarget.getId() == null) {
                    hRLastTarget = null;
                }
                Target target = hRLastTarget;
                if (target != null) {
                    LocalTargetRepository localTargetRepository = this.this$0;
                    boolean z5 = this.$isActivate;
                    targetDataSource = localTargetRepository.dataSource;
                    DateTime now = DateTime.now();
                    DateTime now2 = DateTime.now();
                    u.g(now2);
                    Target copy$default = Target.copy$default(target, null, null, 0L, 0, 0, Integer.MIN_VALUE, 0, 0, z5, now, null, now2, null, false, null, 21727, null);
                    this.label = 1;
                    if (targetDataSource.update(copy$default, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
        }
        return y.f85009a;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((LocalTargetRepository$changeHeartRateThresholdActivation$2) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
