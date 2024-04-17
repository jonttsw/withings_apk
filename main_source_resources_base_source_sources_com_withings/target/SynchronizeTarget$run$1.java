package com.withings.target;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: SynchronizeTarget.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.target.SynchronizeTarget$run$1", f = "SynchronizeTarget.kt", l = {30, 35, 38}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SynchronizeTarget$run$1 extends i implements p<CoroutineScope, d<? super y>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SynchronizeTarget this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SynchronizeTarget$run$1(SynchronizeTarget synchronizeTarget, d<? super SynchronizeTarget$run$1> dVar) {
        super(2, dVar);
        this.this$0 = synchronizeTarget;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        SynchronizeTarget$run$1 synchronizeTarget$run$1 = new SynchronizeTarget$run$1(this.this$0, dVar);
        synchronizeTarget$run$1.L$0 = obj;
        return synchronizeTarget$run$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3  */
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
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2d
            if (r1 == r4) goto L25
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            nm0.l.b(r8)
            goto Lb1
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            java.lang.Object r1 = r7.L$0
            com.withings.user.core.models.User r1 = (com.withings.user.core.models.User) r1
            nm0.l.b(r8)
            goto L9d
        L25:
            java.lang.Object r1 = r7.L$0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            nm0.l.b(r8)
            goto L4b
        L2d:
            nm0.l.b(r8)
            java.lang.Object r8 = r7.L$0
            kotlinx.coroutines.CoroutineScope r8 = (kotlinx.coroutines.CoroutineScope) r8
            com.withings.target.SynchronizeTarget r1 = r7.this$0
            r70.c r1 = com.withings.target.SynchronizeTarget.access$getUserRepository$p(r1)
            com.withings.target.SynchronizeTarget r5 = r7.this$0
            long r5 = r5.getUserId()
            r7.L$0 = r8
            r7.label = r4
            java.lang.Object r8 = r70.d.b(r1, r5, r7)
            if (r8 != r0) goto L4b
            return r0
        L4b:
            r1 = r8
            com.withings.user.core.models.User r1 = (com.withings.user.core.models.User) r1
            if (r1 != 0) goto L77
            com.withings.target.SynchronizeTarget r8 = r7.this$0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            long r1 = r8.getUserId()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "User "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = " not found in "
            r3.append(r1)
            r3.append(r8)
            java.lang.String r8 = r3.toString()
            r0.<init>(r8)
            x70.b.n(r0)
            nm0.y r8 = nm0.y.f85009a
            return r8
        L77:
            com.withings.target.SynchronizeTarget r8 = r7.this$0
            com.withings.target.data.TargetRepository r8 = com.withings.target.SynchronizeTarget.access$getRepository$p(r8)
            com.withings.target.SynchronizeTarget r4 = r7.this$0
            long r4 = r4.getUserId()
            org.joda.time.DateTime r8 = r8.mostRecentModified(r4)
            if (r8 != 0) goto L90
            org.joda.time.DateTime r8 = new org.joda.time.DateTime
            r4 = 0
            r8.<init>(r4)
        L90:
            com.withings.target.SynchronizeTarget r4 = r7.this$0
            r7.L$0 = r1
            r7.label = r3
            java.lang.Object r8 = com.withings.target.SynchronizeTarget.access$getTargetFromApi(r4, r8, r7)
            if (r8 != r0) goto L9d
            return r0
        L9d:
            boolean r8 = r1.isShared()
            if (r8 != 0) goto Lb1
            com.withings.target.SynchronizeTarget r8 = r7.this$0
            r1 = 0
            r7.L$0 = r1
            r7.label = r2
            java.lang.Object r8 = com.withings.target.SynchronizeTarget.access$saveUnsyncedWithApi(r8, r7)
            if (r8 != r0) goto Lb1
            return r0
        Lb1:
            nm0.y r8 = nm0.y.f85009a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.target.SynchronizeTarget$run$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((SynchronizeTarget$run$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
