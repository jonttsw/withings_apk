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
@e(c = "com.withings.notifications.ui.viewmodels.NotificationActivityViewModel$deleteNotification$1", f = "NotificationActivityViewModel.kt", l = {68}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class a extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f43127a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NotificationActivityViewModel f43128b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ c10.c<?> f43129c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(NotificationActivityViewModel notificationActivityViewModel, c10.c<?> cVar, qm0.d<? super a> dVar) {
        super(2, dVar);
        this.f43128b = notificationActivityViewModel;
        this.f43129c = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new a(this.f43128b, this.f43129c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a10.a aVar;
        long j5;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f43127a;
        if (i11 != 0) {
            if (i11 == 1) {
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            l.b(obj);
            NotificationActivityViewModel notificationActivityViewModel = this.f43128b;
            aVar = notificationActivityViewModel.f43120b;
            j5 = notificationActivityViewModel.f43121c;
            this.f43127a = 1;
            if (aVar.c(j5, this.f43129c, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }
}
