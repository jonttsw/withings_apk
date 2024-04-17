package com.withings.manualLogging.ui.feature.addNote;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AddNotesViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.manualLogging.ui.feature.addNote.AddNotesViewModel$clinicalPatientId$1", f = "AddNotesViewModel.kt", l = {78, 79, 79}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class e1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<String>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f41450a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f41451b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k1 f41452c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(k1 k1Var, qm0.d<? super e1> dVar) {
        super(2, dVar);
        this.f41452c = k1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        e1 e1Var = new e1(this.f41452c, dVar);
        e1Var.f41451b = obj;
        return e1Var;
    }

    @Override // ym0.p
    public final Object invoke(androidx.lifecycle.h0<String> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((e1) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0078 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r10.f41450a
            r2 = 3
            r3 = 2
            r4 = 1
            com.withings.manualLogging.ui.feature.addNote.k1 r5 = r10.f41452c
            if (r1 == 0) goto L2d
            if (r1 == r4) goto L25
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            nm0.l.b(r11)
            goto L79
        L15:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1d:
            java.lang.Object r1 = r10.f41451b
            androidx.lifecycle.h0 r1 = (androidx.lifecycle.h0) r1
            nm0.l.b(r11)
            goto L6d
        L25:
            java.lang.Object r1 = r10.f41451b
            androidx.lifecycle.h0 r1 = (androidx.lifecycle.h0) r1
            nm0.l.b(r11)
            goto L56
        L2d:
            nm0.l.b(r11)
            java.lang.Object r11 = r10.f41451b
            androidx.lifecycle.h0 r11 = (androidx.lifecycle.h0) r11
            pi.i r1 = com.withings.manualLogging.ui.feature.addNote.k1.A0(r5)
            long r6 = com.withings.manualLogging.ui.feature.addNote.k1.t0(r5)
            vf.c r8 = com.withings.manualLogging.ui.feature.addNote.k1.f0(r5)
            com.withings.account.core.model.Account r8 = r8.h()
            java.lang.String r8 = r8.b()
            r10.f41451b = r11
            r10.f41450a = r4
            java.lang.Boolean r1 = r1.a(r6, r8)
            if (r1 != r0) goto L53
            return r0
        L53:
            r9 = r1
            r1 = r11
            r11 = r9
        L56:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L79
            pi.c r11 = com.withings.manualLogging.ui.feature.addNote.k1.i0(r5)
            r10.f41451b = r1
            r10.f41450a = r3
            java.lang.Object r11 = r11.a(r10)
            if (r11 != r0) goto L6d
            return r0
        L6d:
            r3 = 0
            r10.f41451b = r3
            r10.f41450a = r2
            java.lang.Object r11 = r1.emit(r11, r10)
            if (r11 != r0) goto L79
            return r0
        L79:
            nm0.y r11 = nm0.y.f85009a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.manualLogging.ui.feature.addNote.e1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
