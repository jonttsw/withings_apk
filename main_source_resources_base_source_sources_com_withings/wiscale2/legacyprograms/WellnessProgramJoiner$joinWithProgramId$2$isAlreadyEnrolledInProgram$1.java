package com.withings.wiscale2.legacyprograms;

import com.withings.user.User;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WellnessProgramJoiner.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.legacyprograms.WellnessProgramJoiner$joinWithProgramId$2$isAlreadyEnrolledInProgram$1", f = "WellnessProgramJoiner.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class WellnessProgramJoiner$joinWithProgramId$2$isAlreadyEnrolledInProgram$1 extends i implements p<CoroutineScope, qm0.d<? super Boolean>, Object> {
    final /* synthetic */ int $programId;
    int label;
    final /* synthetic */ WellnessProgramJoiner this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WellnessProgramJoiner$joinWithProgramId$2$isAlreadyEnrolledInProgram$1(WellnessProgramJoiner wellnessProgramJoiner, int i11, qm0.d<? super WellnessProgramJoiner$joinWithProgramId$2$isAlreadyEnrolledInProgram$1> dVar) {
        super(2, dVar);
        this.this$0 = wellnessProgramJoiner;
        this.$programId = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new WellnessProgramJoiner$joinWithProgramId$2$isAlreadyEnrolledInProgram$1(this.this$0, this.$programId, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        WellnessProgramJoinerEntryPoint wellnessProgramJoinerEntryPoint;
        User user;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        if (this.label == 0) {
            l.b(obj);
            wellnessProgramJoinerEntryPoint = this.this$0.entryPoint;
            x30.l isProgramRunningUseCase = wellnessProgramJoinerEntryPoint.isProgramRunningUseCase();
            user = this.this$0.user;
            return Boolean.valueOf(isProgramRunningUseCase.b(this.$programId, user.q()));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super Boolean> dVar) {
        return ((WellnessProgramJoiner$joinWithProgramId$2$isAlreadyEnrolledInProgram$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
