package com.withings.tutorials.ui.screens;

import kotlinx.coroutines.CoroutineScope;
import nm0.y;
/* compiled from: SetupScaleForMultipleUsersViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.tutorials.ui.screens.SetupScaleForMultipleUsersViewModel$checkNewUser$1", f = "SetupScaleForMultipleUsersViewModel.kt", l = {62}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class v extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f46305a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SetupScaleForMultipleUsersViewModel f46306b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(SetupScaleForMultipleUsersViewModel setupScaleForMultipleUsersViewModel, qm0.d<? super v> dVar) {
        super(2, dVar);
        this.f46306b = setupScaleForMultipleUsersViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new v(this.f46306b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((v) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0089 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r14.f46305a
            com.withings.tutorials.ui.screens.SetupScaleForMultipleUsersViewModel r2 = r14.f46306b
            r3 = 1
            if (r1 == 0) goto L18
            if (r1 != r3) goto L10
            nm0.l.b(r15)
            goto L8a
        L10:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L18:
            nm0.l.b(r15)
            m70.i r15 = com.withings.tutorials.ui.screens.SetupScaleForMultipleUsersViewModel.i0(r2)
            java.util.List r15 = r15.d()
            java.lang.String r1 = "getAllUsers(...)"
            kotlin.jvm.internal.u.i(r15, r1)
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.Iterator r15 = r15.iterator()
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto Ld7
            java.lang.Object r1 = r15.next()
            boolean r4 = r15.hasNext()
            if (r4 != 0) goto L3f
            goto L5f
        L3f:
            r4 = r1
            com.withings.user.User r4 = (com.withings.user.User) r4
            org.joda.time.DateTime r4 = r4.h()
        L46:
            java.lang.Object r5 = r15.next()
            r6 = r5
            com.withings.user.User r6 = (com.withings.user.User) r6
            org.joda.time.DateTime r6 = r6.h()
            int r7 = r4.compareTo(r6)
            if (r7 >= 0) goto L59
            r1 = r5
            r4 = r6
        L59:
            boolean r5 = r15.hasNext()
            if (r5 != 0) goto L46
        L5f:
            com.withings.user.User r1 = (com.withings.user.User) r1
            fy.o r4 = com.withings.tutorials.ui.screens.SetupScaleForMultipleUsersViewModel.g0(r2)
            long r5 = r1.q()
            int[] r9 = new int[]{r3}
            org.joda.time.DateTime r15 = org.joda.time.DateTime.now()
            long r7 = r15.getMillis()
            java.lang.Long r15 = new java.lang.Long
            r15.<init>(r7)
            r14.f46305a = r3
            r11 = 0
            r13 = 242(0xf2, float:3.39E-43)
            r7 = 0
            r10 = 0
            r8 = r15
            r12 = r14
            java.lang.Object r15 = fy.o.a(r4, r5, r7, r8, r9, r10, r11, r12, r13)
            if (r15 != r0) goto L8a
            return r0
        L8a:
            java.util.List r15 = (java.util.List) r15
            java.lang.Object r15 = kotlin.collections.x.U(r15)
            ky.d r15 = (ky.d) r15
            if (r15 == 0) goto La4
            ky.a r15 = ly.a.d(r3, r15)
            if (r15 == 0) goto La4
            double r0 = r15.f()
            java.lang.Double r15 = new java.lang.Double
            r15.<init>(r0)
            goto La5
        La4:
            r15 = 0
        La5:
            if (r15 != 0) goto Lbd
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "New user doesn't have a weight"
            r15.<init>(r0)
            x70.b.p(r15)
            xw.n r15 = com.withings.tutorials.ui.screens.SetupScaleForMultipleUsersViewModel.j0(r2)
            com.withings.tutorials.ui.screens.SetupScaleForMultipleUsersViewModel$a$a r0 = com.withings.tutorials.ui.screens.SetupScaleForMultipleUsersViewModel.a.C0620a.f44807a
            r15.postValue(r0)
            nm0.y r15 = nm0.y.f85009a
            return r15
        Lbd:
            r0 = 4613937818241073152(0x4008000000000000, double:3.0)
            r3 = 4624633867356078080(0x402e000000000000, double:15.0)
            en0.f r0 = en0.r.o(r0, r3)
            boolean r15 = r0.c(r15)
            if (r15 == 0) goto Ld4
            xw.n r15 = com.withings.tutorials.ui.screens.SetupScaleForMultipleUsersViewModel.j0(r2)
            com.withings.tutorials.ui.screens.SetupScaleForMultipleUsersViewModel$a$e r0 = com.withings.tutorials.ui.screens.SetupScaleForMultipleUsersViewModel.a.e.f44811a
            r15.postValue(r0)
        Ld4:
            nm0.y r15 = nm0.y.f85009a
            return r15
        Ld7:
            java.util.NoSuchElementException r15 = new java.util.NoSuchElementException
            r15.<init>()
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.tutorials.ui.screens.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
