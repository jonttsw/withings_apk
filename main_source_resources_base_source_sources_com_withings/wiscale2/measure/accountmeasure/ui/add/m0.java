package com.withings.wiscale2.measure.accountmeasure.ui.add;

import com.withings.library.measure.MeasuresGroup;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AddMeasureManuallyFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.measure.accountmeasure.ui.add.AddMeasureManuallyFragment$saveMeasure$2$1", f = "AddMeasureManuallyFragment.kt", l = {121}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class m0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f58250a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f58251b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ j0 f58252c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ MeasuresGroup f58253d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(j0 j0Var, MeasuresGroup measuresGroup, qm0.d<? super m0> dVar) {
        super(2, dVar);
        this.f58252c = j0Var;
        this.f58253d = measuresGroup;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        m0 m0Var = new m0(this.f58252c, this.f58253d, dVar);
        m0Var.f58251b = obj;
        return m0Var;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((m0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006d  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r9.f58250a
            com.withings.library.measure.MeasuresGroup r2 = r9.f58253d
            com.withings.wiscale2.measure.accountmeasure.ui.add.j0 r3 = r9.f58252c
            r4 = 1
            if (r1 == 0) goto L1f
            if (r1 != r4) goto L17
            java.lang.Object r0 = r9.f58251b
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            nm0.l.b(r10)     // Catch: java.lang.Throwable -> L15
            goto L45
        L15:
            r10 = move-exception
            goto L4e
        L17:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1f:
            nm0.l.b(r10)
            java.lang.Object r10 = r9.f58251b
            kotlinx.coroutines.CoroutineScope r10 = (kotlinx.coroutines.CoroutineScope) r10
            com.withings.user.User r1 = r3.getUser()     // Catch: java.lang.Throwable -> L4c
            r9.f58251b = r10     // Catch: java.lang.Throwable -> L4c
            r9.f58250a = r4     // Catch: java.lang.Throwable -> L4c
            kotlinx.coroutines.CoroutineDispatcher r5 = kotlinx.coroutines.Dispatchers.getIO()     // Catch: java.lang.Throwable -> L4c
            com.withings.wiscale2.measure.accountmeasure.ui.add.l0 r6 = new com.withings.wiscale2.measure.accountmeasure.ui.add.l0     // Catch: java.lang.Throwable -> L4c
            r7 = 0
            r6.<init>(r3, r1, r2, r7)     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r1 = kotlinx.coroutines.BuildersKt.withContext(r5, r6, r9)     // Catch: java.lang.Throwable -> L4c
            if (r1 != r0) goto L3f
            goto L41
        L3f:
            nm0.y r1 = nm0.y.f85009a     // Catch: java.lang.Throwable -> L4c
        L41:
            if (r1 != r0) goto L44
            return r0
        L44:
            r0 = r10
        L45:
            nm0.y r10 = nm0.y.f85009a     // Catch: java.lang.Throwable -> L15
            goto L52
        L48:
            r8 = r0
            r0 = r10
            r10 = r8
            goto L4e
        L4c:
            r0 = move-exception
            goto L48
        L4e:
            nm0.k$a r10 = nm0.l.a(r10)
        L52:
            boolean r1 = r10 instanceof nm0.k.a
            r1 = r1 ^ r4
            r4 = 0
            if (r1 == 0) goto L67
            r1 = r10
            nm0.y r1 = (nm0.y) r1
            com.withings.wiscale2.measure.accountmeasure.ui.add.h0$a r1 = r3.t1()
            if (r1 == 0) goto L64
            r1.b2(r2)
        L64:
            r3.y1(r4)
        L67:
            java.lang.Throwable r10 = nm0.k.b(r10)
            if (r10 == 0) goto L7f
            java.lang.String r10 = r10.getLocalizedMessage()
            java.lang.String r1 = "error inserting measurement group "
            java.lang.String r10 = androidx.activity.a0.b(r1, r10)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            x70.b.d(r0, r10, r1)
            r3.y1(r4)
        L7f:
            nm0.y r10 = nm0.y.f85009a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.measure.accountmeasure.ui.add.m0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
