package com.withings.wiscale2.legacyprograms;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import ym0.p;
/* compiled from: WellnessProgramJoiner.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.legacyprograms.WellnessProgramJoiner$joinWithProgramId$2", f = "WellnessProgramJoiner.kt", l = {79, 80, 81}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class WellnessProgramJoiner$joinWithProgramId$2 extends i implements p<CoroutineScope, qm0.d<? super Object>, Object> {
    final /* synthetic */ int $programId;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ WellnessProgramJoiner this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WellnessProgramJoiner$joinWithProgramId$2(int i11, WellnessProgramJoiner wellnessProgramJoiner, qm0.d<? super WellnessProgramJoiner$joinWithProgramId$2> dVar) {
        super(2, dVar);
        this.$programId = i11;
        this.this$0 = wellnessProgramJoiner;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        WellnessProgramJoiner$joinWithProgramId$2 wellnessProgramJoiner$joinWithProgramId$2 = new WellnessProgramJoiner$joinWithProgramId$2(this.$programId, this.this$0, dVar);
        wellnessProgramJoiner$joinWithProgramId$2.L$0 = obj;
        return wellnessProgramJoiner$joinWithProgramId$2;
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, qm0.d<? super Object> dVar) {
        return invoke2(coroutineScope, (qm0.d<Object>) dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r13.label
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L36
            if (r1 == r5) goto L2a
            if (r1 == r4) goto L22
            if (r1 != r3) goto L1a
            java.lang.Object r0 = r13.L$0
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            nm0.l.b(r14)
            goto L99
        L1a:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L22:
            java.lang.Object r1 = r13.L$0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            nm0.l.b(r14)
            goto L87
        L2a:
            java.lang.Object r1 = r13.L$1
            kotlinx.coroutines.Deferred r1 = (kotlinx.coroutines.Deferred) r1
            java.lang.Object r5 = r13.L$0
            kotlinx.coroutines.CoroutineScope r5 = (kotlinx.coroutines.CoroutineScope) r5
            nm0.l.b(r14)
            goto L71
        L36:
            nm0.l.b(r14)
            java.lang.Object r14 = r13.L$0
            kotlinx.coroutines.CoroutineScope r14 = (kotlinx.coroutines.CoroutineScope) r14
            com.withings.wiscale2.legacyprograms.WellnessProgramJoiner$joinWithProgramId$2$isAlreadyEnrolledInProgram$1 r10 = new com.withings.wiscale2.legacyprograms.WellnessProgramJoiner$joinWithProgramId$2$isAlreadyEnrolledInProgram$1
            com.withings.wiscale2.legacyprograms.WellnessProgramJoiner r1 = r13.this$0
            int r7 = r13.$programId
            r10.<init>(r1, r7, r6)
            r11 = 3
            r12 = 0
            r8 = 0
            r9 = 0
            r7 = r14
            kotlinx.coroutines.Deferred r1 = kotlinx.coroutines.BuildersKt.async$default(r7, r8, r9, r10, r11, r12)
            kotlinx.coroutines.CoroutineStart r9 = kotlinx.coroutines.CoroutineStart.LAZY
            com.withings.wiscale2.legacyprograms.WellnessProgramJoiner$joinWithProgramId$2$programToJoin$1 r10 = new com.withings.wiscale2.legacyprograms.WellnessProgramJoiner$joinWithProgramId$2$programToJoin$1
            com.withings.wiscale2.legacyprograms.WellnessProgramJoiner r7 = r13.this$0
            int r8 = r13.$programId
            r10.<init>(r7, r8, r6)
            r11 = 1
            r8 = 0
            r7 = r14
            kotlinx.coroutines.Deferred r7 = kotlinx.coroutines.BuildersKt.async$default(r7, r8, r9, r10, r11, r12)
            r13.L$0 = r14
            r13.L$1 = r7
            r13.label = r5
            java.lang.Object r1 = r1.await(r13)
            if (r1 != r0) goto L6e
            return r0
        L6e:
            r5 = r14
            r14 = r1
            r1 = r7
        L71:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 != 0) goto Lac
            r13.L$0 = r5
            r13.L$1 = r6
            r13.label = r4
            java.lang.Object r14 = r1.await(r13)
            if (r14 != r0) goto L86
            return r0
        L86:
            r1 = r5
        L87:
            com.withings.programs.model.program.ProgramDomain$LegacyDomain r14 = (com.withings.programs.model.program.ProgramDomain.LegacyDomain) r14
            if (r14 == 0) goto L9c
            com.withings.wiscale2.legacyprograms.WellnessProgramJoiner r4 = r13.this$0
            r13.L$0 = r1
            r13.label = r3
            java.lang.Object r14 = r4.join(r14, r13)
            if (r14 != r0) goto L98
            return r0
        L98:
            r0 = r1
        L99:
            if (r14 != 0) goto Lbd
            r1 = r0
        L9c:
            int r14 = r13.$programId
            java.lang.String r0 = " is not a valid programId corresponding to a known program"
            java.lang.String r14 = a1.x.b(r14, r0)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            x70.b.d(r1, r14, r0)
            nm0.y r14 = nm0.y.f85009a
            goto Lbd
        Lac:
            int r14 = r13.$programId
            java.lang.String r0 = "Program "
            java.lang.String r1 = " has already been joined. We better not join it again... unless we love status 520."
            java.lang.String r14 = androidx.camera.camera2.internal.o0.a(r0, r14, r1)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            x70.b.t(r5, r14, r0)
            nm0.y r14 = nm0.y.f85009a
        Lbd:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.legacyprograms.WellnessProgramJoiner$joinWithProgramId$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, qm0.d<Object> dVar) {
        return ((WellnessProgramJoiner$joinWithProgramId$2) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
