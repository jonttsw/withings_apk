package com.withings.wiscale2.legacyprograms;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ProgramOptionSheetFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.legacyprograms.ProgramOptionSheetFragment$leaveProgram$1", f = "ProgramOptionSheetFragment.kt", l = {78}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ProgramOptionSheetFragment$leaveProgram$1 extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ProgramOptionSheetFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgramOptionSheetFragment$leaveProgram$1(ProgramOptionSheetFragment programOptionSheetFragment, qm0.d<? super ProgramOptionSheetFragment$leaveProgram$1> dVar) {
        super(2, dVar);
        this.this$0 = programOptionSheetFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        ProgramOptionSheetFragment$leaveProgram$1 programOptionSheetFragment$leaveProgram$1 = new ProgramOptionSheetFragment$leaveProgram$1(this.this$0, dVar);
        programOptionSheetFragment$leaveProgram$1.L$0 = obj;
        return programOptionSheetFragment$leaveProgram$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r7.label
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 != r3) goto L14
            java.lang.Object r0 = r7.L$0
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            nm0.l.b(r8)     // Catch: java.lang.Throwable -> L12
            goto L3a
        L12:
            r8 = move-exception
            goto L41
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            nm0.l.b(r8)
            java.lang.Object r8 = r7.L$0
            kotlinx.coroutines.CoroutineScope r8 = (kotlinx.coroutines.CoroutineScope) r8
            com.withings.wiscale2.legacyprograms.ProgramOptionSheetFragment r1 = r7.this$0
            kotlinx.coroutines.CoroutineDispatcher r4 = kotlinx.coroutines.Dispatchers.getIO()     // Catch: java.lang.Throwable -> L3d
            com.withings.wiscale2.legacyprograms.ProgramOptionSheetFragment$leaveProgram$1$1$1 r5 = new com.withings.wiscale2.legacyprograms.ProgramOptionSheetFragment$leaveProgram$1$1$1     // Catch: java.lang.Throwable -> L3d
            r5.<init>(r1, r2)     // Catch: java.lang.Throwable -> L3d
            r7.L$0 = r8     // Catch: java.lang.Throwable -> L3d
            r7.label = r3     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r1 = kotlinx.coroutines.BuildersKt.withContext(r4, r5, r7)     // Catch: java.lang.Throwable -> L3d
            if (r1 != r0) goto L39
            return r0
        L39:
            r0 = r8
        L3a:
            nm0.y r8 = nm0.y.f85009a     // Catch: java.lang.Throwable -> L12
            goto L45
        L3d:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L41:
            nm0.k$a r8 = nm0.l.a(r8)
        L45:
            com.withings.wiscale2.legacyprograms.ProgramOptionSheetFragment r1 = r7.this$0
            java.lang.Throwable r8 = nm0.k.b(r8)
            if (r8 == 0) goto L7a
            android.app.ProgressDialog r8 = com.withings.wiscale2.legacyprograms.ProgramOptionSheetFragment.access$getProgressDialog$p(r1)
            if (r8 == 0) goto L74
            r8.dismiss()
            androidx.fragment.app.FragmentActivity r8 = r1.getActivity()
            java.lang.String r2 = "Error. Can't leave the program."
            android.widget.Toast r8 = android.widget.Toast.makeText(r8, r2, r3)
            r8.show()
            int r8 = com.withings.wiscale2.legacyprograms.ProgramOptionSheetFragment.access$getProgramId$p(r1)
            java.lang.String r1 = "Failed to cancel the program "
            java.lang.String r8 = android.support.v4.media.a.a(r1, r8)
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            x70.b.d(r0, r8, r1)
            goto L7a
        L74:
            java.lang.String r8 = "progressDialog"
            kotlin.jvm.internal.u.s(r8)
            throw r2
        L7a:
            nm0.y r8 = nm0.y.f85009a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.legacyprograms.ProgramOptionSheetFragment$leaveProgram$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((ProgramOptionSheetFragment$leaveProgram$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
