package com.withings.authentication.mfa.resolve;

import android.content.Context;
import com.withings.library.authentication.api.ConstantsWs;
import kotlinx.coroutines.CoroutineScope;
import qf.b;
/* compiled from: MfaResolutionViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.mfa.resolve.MfaResolutionViewModel$logout$1", f = "MfaResolutionViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_PWV_REACHED_COUNT, ConstantsWs.MEASURE_TYPE_HR_BCGIPG, ConstantsWs.MEASURE_TYPE_CAN, ConstantsWs.MEASURE_TYPE_NHS_FEET}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class e extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    MfaResolutionViewModel f32055a;

    /* renamed from: b  reason: collision with root package name */
    int f32056b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ Object f32057c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ MfaResolutionViewModel f32058d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Context f32059e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MfaResolutionViewModel.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.l<qf.b, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.l0 f32060a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(kotlin.jvm.internal.l0 l0Var) {
            super(1);
            this.f32060a = l0Var;
        }

        @Override // ym0.l
        public final nm0.y invoke(qf.b bVar) {
            qf.b state = bVar;
            kotlin.jvm.internal.u.j(state, "state");
            if (state instanceof b.c) {
                this.f32060a.f76251a = true;
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(MfaResolutionViewModel mfaResolutionViewModel, Context context, qm0.d<? super e> dVar) {
        super(2, dVar);
        this.f32058d = mfaResolutionViewModel;
        this.f32059e = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        e eVar = new e(this.f32058d, this.f32059e, dVar);
        eVar.f32057c = obj;
        return eVar;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((e) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009a  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r10.f32056b
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            com.withings.authentication.mfa.resolve.MfaResolutionViewModel r6 = r10.f32058d
            r7 = 0
            if (r1 == 0) goto L32
            if (r1 == r5) goto L28
            if (r1 == r4) goto L22
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1a
            nm0.l.b(r11)
            goto Lad
        L1a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L22:
            nm0.l.b(r11)     // Catch: java.lang.Throwable -> L26
            goto L8d
        L26:
            r11 = move-exception
            goto L90
        L28:
            com.withings.authentication.mfa.resolve.MfaResolutionViewModel r1 = r10.f32055a
            java.lang.Object r5 = r10.f32057c
            kotlin.jvm.internal.l0 r5 = (kotlin.jvm.internal.l0) r5
            nm0.l.b(r11)     // Catch: java.lang.Throwable -> L26
            goto L63
        L32:
            nm0.l.b(r11)
            java.lang.Object r11 = r10.f32057c
            kotlinx.coroutines.CoroutineScope r11 = (kotlinx.coroutines.CoroutineScope) r11
            kotlinx.coroutines.flow.MutableStateFlow r11 = com.withings.authentication.mfa.resolve.MfaResolutionViewModel.y0(r6)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r11.setValue(r1)
            kotlin.jvm.internal.l0 r11 = new kotlin.jvm.internal.l0
            r11.<init>()
            android.content.Context r1 = r10.f32059e
            qf.a r8 = com.withings.authentication.mfa.resolve.MfaResolutionViewModel.k0(r6)     // Catch: java.lang.Throwable -> L26
            com.withings.authentication.mfa.resolve.e$a r9 = new com.withings.authentication.mfa.resolve.e$a     // Catch: java.lang.Throwable -> L26
            r9.<init>(r11)     // Catch: java.lang.Throwable -> L26
            r10.f32057c = r11     // Catch: java.lang.Throwable -> L26
            r10.f32055a = r6     // Catch: java.lang.Throwable -> L26
            r10.f32056b = r5     // Catch: java.lang.Throwable -> L26
            com.withings.wiscale2.settings.k0 r8 = (com.withings.wiscale2.settings.k0) r8     // Catch: java.lang.Throwable -> L26
            java.lang.Object r1 = r8.a(r1, r10, r9)     // Catch: java.lang.Throwable -> L26
            if (r1 != r0) goto L61
            return r0
        L61:
            r5 = r11
            r1 = r6
        L63:
            boolean r11 = r5.f76251a     // Catch: java.lang.Throwable -> L26
            if (r11 == 0) goto L7a
            kotlinx.coroutines.flow.MutableSharedFlow r11 = com.withings.authentication.mfa.resolve.MfaResolutionViewModel.r0(r1)     // Catch: java.lang.Throwable -> L26
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L26
            r10.f32057c = r7     // Catch: java.lang.Throwable -> L26
            r10.f32055a = r7     // Catch: java.lang.Throwable -> L26
            r10.f32056b = r4     // Catch: java.lang.Throwable -> L26
            java.lang.Object r11 = r11.emit(r1, r10)     // Catch: java.lang.Throwable -> L26
            if (r11 != r0) goto L8d
            return r0
        L7a:
            kotlinx.coroutines.flow.MutableSharedFlow r11 = com.withings.authentication.mfa.resolve.MfaResolutionViewModel.r0(r1)     // Catch: java.lang.Throwable -> L26
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L26
            r10.f32057c = r7     // Catch: java.lang.Throwable -> L26
            r10.f32055a = r7     // Catch: java.lang.Throwable -> L26
            r10.f32056b = r3     // Catch: java.lang.Throwable -> L26
            java.lang.Object r11 = r11.emit(r1, r10)     // Catch: java.lang.Throwable -> L26
            if (r11 != r0) goto L8d
            return r0
        L8d:
            nm0.y r11 = nm0.y.f85009a     // Catch: java.lang.Throwable -> L26
            goto L94
        L90:
            nm0.k$a r11 = nm0.l.a(r11)
        L94:
            java.lang.Throwable r1 = nm0.k.b(r11)
            if (r1 == 0) goto Lad
            kotlinx.coroutines.flow.MutableSharedFlow r1 = com.withings.authentication.mfa.resolve.MfaResolutionViewModel.r0(r6)
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r10.f32057c = r11
            r10.f32055a = r7
            r10.f32056b = r2
            java.lang.Object r11 = r1.emit(r3, r10)
            if (r11 != r0) goto Lad
            return r0
        Lad:
            kotlinx.coroutines.flow.MutableStateFlow r11 = com.withings.authentication.mfa.resolve.MfaResolutionViewModel.y0(r6)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r11.setValue(r0)
            nm0.y r11 = nm0.y.f85009a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.authentication.mfa.resolve.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
