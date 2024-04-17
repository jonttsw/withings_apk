package com.withings.wiscale2.legacyprograms;

import com.withings.programs.model.program.ProgramDomain;
import com.withings.user.User;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import nm0.l;
import nm0.y;
import x30.j;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WellnessProgramJoiner.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/programs/model/program/ProgramDomain$LegacyDomain;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.legacyprograms.WellnessProgramJoiner$joinWithProgramId$2$programToJoin$1", f = "WellnessProgramJoiner.kt", l = {77}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class WellnessProgramJoiner$joinWithProgramId$2$programToJoin$1 extends i implements p<CoroutineScope, qm0.d<? super ProgramDomain.LegacyDomain>, Object> {
    final /* synthetic */ int $programId;
    int label;
    final /* synthetic */ WellnessProgramJoiner this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WellnessProgramJoiner$joinWithProgramId$2$programToJoin$1(WellnessProgramJoiner wellnessProgramJoiner, int i11, qm0.d<? super WellnessProgramJoiner$joinWithProgramId$2$programToJoin$1> dVar) {
        super(2, dVar);
        this.this$0 = wellnessProgramJoiner;
        this.$programId = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new WellnessProgramJoiner$joinWithProgramId$2$programToJoin$1(this.this$0, this.$programId, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        j jVar;
        User user;
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
            jVar = this.this$0.getProgramByIdUseCase;
            user = this.this$0.user;
            x30.i a11 = jVar.a(user.q(), this.$programId, false);
            this.label = 1;
            obj = FlowKt.first(a11, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        if (obj instanceof ProgramDomain.LegacyDomain) {
            return (ProgramDomain.LegacyDomain) obj;
        }
        return null;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super ProgramDomain.LegacyDomain> dVar) {
        return ((WellnessProgramJoiner$joinWithProgramId$2$programToJoin$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
