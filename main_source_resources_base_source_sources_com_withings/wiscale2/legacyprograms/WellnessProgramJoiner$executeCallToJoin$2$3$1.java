package com.withings.wiscale2.legacyprograms;

import com.withings.wiscale2.legacyprograms.WellnessProgramJoiner;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import ym0.p;
/* compiled from: WellnessProgramJoiner.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.legacyprograms.WellnessProgramJoiner$executeCallToJoin$2$3$1", f = "WellnessProgramJoiner.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class WellnessProgramJoiner$executeCallToJoin$2$3$1 extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {
    int label;
    final /* synthetic */ WellnessProgramJoiner this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WellnessProgramJoiner$executeCallToJoin$2$3$1(WellnessProgramJoiner wellnessProgramJoiner, qm0.d<? super WellnessProgramJoiner$executeCallToJoin$2$3$1> dVar) {
        super(2, dVar);
        this.this$0 = wellnessProgramJoiner;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new WellnessProgramJoiner$executeCallToJoin$2$3$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        WellnessProgramJoiner.Delegate delegate;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        if (this.label == 0) {
            l.b(obj);
            delegate = this.this$0.delegate;
            delegate.onJoinFailed();
            return y.f85009a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((WellnessProgramJoiner$executeCallToJoin$2$3$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
