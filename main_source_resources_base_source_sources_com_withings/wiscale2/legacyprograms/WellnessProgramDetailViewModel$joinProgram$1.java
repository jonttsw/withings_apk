package com.withings.wiscale2.legacyprograms;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.programs.model.program.ProgramDomain;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WellnessProgramDetailsActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.legacyprograms.WellnessProgramDetailViewModel$joinProgram$1", f = "WellnessProgramDetailsActivity.kt", l = {ConstantsWs.WS_STATUS_INVALID_CONSUMABLE_HEADER}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class WellnessProgramDetailViewModel$joinProgram$1 extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {
    final /* synthetic */ ProgramDomain.LegacyDomain $wellnessProgram;
    int label;
    final /* synthetic */ WellnessProgramDetailViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WellnessProgramDetailViewModel$joinProgram$1(WellnessProgramDetailViewModel wellnessProgramDetailViewModel, ProgramDomain.LegacyDomain legacyDomain, qm0.d<? super WellnessProgramDetailViewModel$joinProgram$1> dVar) {
        super(2, dVar);
        this.this$0 = wellnessProgramDetailViewModel;
        this.$wellnessProgram = legacyDomain;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new WellnessProgramDetailViewModel$joinProgram$1(this.this$0, this.$wellnessProgram, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        WellnessProgramJoiner wellnessProgramJoiner;
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
            wellnessProgramJoiner = this.this$0.wellnessProgramJoiner;
            ProgramDomain.LegacyDomain legacyDomain = this.$wellnessProgram;
            this.label = 1;
            if (wellnessProgramJoiner.join(legacyDomain, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((WellnessProgramDetailViewModel$joinProgram$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
