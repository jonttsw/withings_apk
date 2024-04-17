package com.withings.account.ui.vm;

import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: LoadingSensitiveActionViewModel.kt */
@e(c = "com.withings.account.ui.vm.LoadingSensitiveActionViewModel$initialiseSensitiveAction$1", f = "LoadingSensitiveActionViewModel.kt", l = {24}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class a extends i implements p<CoroutineScope, d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    LoadingSensitiveActionViewModel f31034a;

    /* renamed from: b  reason: collision with root package name */
    int f31035b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ Object f31036c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ LoadingSensitiveActionViewModel f31037d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(LoadingSensitiveActionViewModel loadingSensitiveActionViewModel, d<? super a> dVar) {
        super(2, dVar);
        this.f31037d = loadingSensitiveActionViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        a aVar = new a(this.f31037d, dVar);
        aVar.f31036c = obj;
        return aVar;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r5.f31035b
            r2 = 1
            com.withings.account.ui.vm.LoadingSensitiveActionViewModel r3 = r5.f31037d
            if (r1 == 0) goto L1d
            if (r1 != r2) goto L15
            com.withings.account.ui.vm.LoadingSensitiveActionViewModel r0 = r5.f31034a
            java.lang.Object r1 = r5.f31036c
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            nm0.l.b(r6)
            goto L46
        L15:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1d:
            nm0.l.b(r6)
            java.lang.Object r6 = r5.f31036c
            kotlinx.coroutines.CoroutineScope r6 = (kotlinx.coroutines.CoroutineScope) r6
            vf.c r1 = r3.f0()
            com.withings.account.core.model.Account r1 = r1.i()
            if (r1 == 0) goto L9c
            java.lang.String r1 = r1.b()
            if (r1 == 0) goto L9c
            hg.b r4 = r3.g0()
            r5.f31036c = r6
            r5.f31034a = r3
            r5.f31035b = r2
            java.lang.Object r6 = r4.b(r1, r5)
            if (r6 != r0) goto L45
            return r0
        L45:
            r0 = r3
        L46:
            ig.a r6 = (ig.a) r6
            ig.a$a r1 = ig.a.C1074a.f72011a
            boolean r1 = kotlin.jvm.internal.u.e(r6, r1)
            if (r1 == 0) goto L5a
            xw.n r6 = r0.i0()
            og.d$a r0 = og.d.a.f86760a
            r6.postValue(r0)
            goto L99
        L5a:
            ig.a$b r1 = ig.a.b.f72012a
            boolean r1 = kotlin.jvm.internal.u.e(r6, r1)
            if (r1 == 0) goto L6c
            xw.n r6 = r0.i0()
            og.d$b r0 = og.d.b.f86761a
            r6.postValue(r0)
            goto L99
        L6c:
            boolean r1 = r6 instanceof ig.a.c
            if (r1 == 0) goto L83
            xw.n r0 = r0.i0()
            og.d$c r1 = new og.d$c
            ig.a$c r6 = (ig.a.c) r6
            java.lang.String r6 = r6.a()
            r1.<init>(r6)
            r0.postValue(r1)
            goto L99
        L83:
            boolean r1 = r6 instanceof ig.a.d
            if (r1 == 0) goto L99
            xw.n r0 = r0.i0()
            og.d$d r1 = new og.d$d
            ig.a$d r6 = (ig.a.d) r6
            java.lang.String r6 = r6.a()
            r1.<init>(r6)
            r0.postValue(r1)
        L99:
            nm0.y r6 = nm0.y.f85009a
            goto L9d
        L9c:
            r6 = 0
        L9d:
            if (r6 != 0) goto La8
            xw.n r6 = r3.i0()
            og.d$a r0 = og.d.a.f86760a
            r6.postValue(r0)
        La8:
            nm0.y r6 = nm0.y.f85009a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.account.ui.vm.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
