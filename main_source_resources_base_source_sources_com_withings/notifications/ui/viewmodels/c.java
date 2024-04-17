package com.withings.notifications.ui.viewmodels;

import java.util.Iterator;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NotificationActivityViewModel.kt */
@e(c = "com.withings.notifications.ui.viewmodels.NotificationActivityViewModel$markOlderUnreadNotificationsAsRead$1", f = "NotificationActivityViewModel.kt", l = {60, 62}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class c extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    NotificationActivityViewModel f43132a;

    /* renamed from: b  reason: collision with root package name */
    Iterator f43133b;

    /* renamed from: c  reason: collision with root package name */
    int f43134c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ NotificationActivityViewModel f43135d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(NotificationActivityViewModel notificationActivityViewModel, qm0.d<? super c> dVar) {
        super(2, dVar);
        this.f43135d = notificationActivityViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new c(this.f43135d, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((c) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r12.f43134c
            com.withings.notifications.ui.viewmodels.NotificationActivityViewModel r2 = r12.f43135d
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1e
            if (r1 != r3) goto L16
            java.util.Iterator r1 = r12.f43133b
            com.withings.notifications.ui.viewmodels.NotificationActivityViewModel r2 = r12.f43132a
            nm0.l.b(r13)
            goto L5f
        L16:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1e:
            nm0.l.b(r13)
            goto L32
        L22:
            nm0.l.b(r13)
            kotlinx.coroutines.flow.SharedFlow r13 = com.withings.notifications.ui.viewmodels.NotificationActivityViewModel.i0(r2)
            r12.f43134c = r4
            java.lang.Object r13 = kotlinx.coroutines.flow.FlowKt.first(r13, r12)
            if (r13 != r0) goto L32
            return r0
        L32:
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r13 = r13.iterator()
        L3d:
            boolean r4 = r13.hasNext()
            if (r4 == 0) goto L5a
            java.lang.Object r4 = r13.next()
            r5 = r4
            c10.c r5 = (c10.c) r5
            boolean r6 = r5.l()
            if (r6 != 0) goto L3d
            boolean r5 = p0.d.m(r5)
            if (r5 != 0) goto L3d
            r1.add(r4)
            goto L3d
        L5a:
            java.util.Iterator r13 = r1.iterator()
            r1 = r13
        L5f:
            boolean r13 = r1.hasNext()
            if (r13 == 0) goto L8b
            java.lang.Object r13 = r1.next()
            r4 = r13
            c10.c r4 = (c10.c) r4
            a10.a r13 = com.withings.notifications.ui.viewmodels.NotificationActivityViewModel.g0(r2)
            long r10 = com.withings.notifications.ui.viewmodels.NotificationActivityViewModel.j0(r2)
            r7 = 0
            r8 = 0
            r5 = 1
            r6 = 0
            r9 = 1983(0x7bf, float:2.779E-42)
            c10.c r4 = c10.c.a(r4, r5, r6, r7, r8, r9)
            r12.f43132a = r2
            r12.f43133b = r1
            r12.f43134c = r3
            java.lang.Object r13 = r13.e(r10, r4, r12)
            if (r13 != r0) goto L5f
            return r0
        L8b:
            nm0.y r13 = nm0.y.f85009a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.notifications.ui.viewmodels.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
