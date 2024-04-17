package com.withings.notifications.ui.viewmodels;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NotificationActivityViewModel.kt */
@e(c = "com.withings.notifications.ui.viewmodels.NotificationActivityViewModel$markAllAsRead$1", f = "NotificationActivityViewModel.kt", l = {54}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class b extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f43130a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NotificationActivityViewModel f43131b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(NotificationActivityViewModel notificationActivityViewModel, qm0.d<? super b> dVar) {
        super(2, dVar);
        this.f43131b = notificationActivityViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new b(this.f43131b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        d10.b bVar;
        long j5;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f43130a;
        if (i11 != 0) {
            if (i11 == 1) {
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            l.b(obj);
            NotificationActivityViewModel notificationActivityViewModel = this.f43131b;
            bVar = notificationActivityViewModel.f43119a;
            j5 = notificationActivityViewModel.f43121c;
            this.f43130a = 1;
            if (bVar.a(j5, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }
}
