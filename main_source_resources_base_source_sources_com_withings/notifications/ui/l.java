package com.withings.notifications.ui;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: NotificationSectionViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.notifications.ui.NotificationSectionViewModel$setAsRead$1", f = "NotificationSectionViewModel.kt", l = {25}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class l extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f42967a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NotificationSectionViewModel f42968b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ long f42969c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ c10.c<?> f42970d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(NotificationSectionViewModel notificationSectionViewModel, long j5, c10.c<?> cVar, qm0.d<? super l> dVar) {
        super(2, dVar);
        this.f42968b = notificationSectionViewModel;
        this.f42969c = j5;
        this.f42970d = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new l(this.f42968b, this.f42969c, this.f42970d, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((l) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a10.a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f42967a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            aVar = this.f42968b.f42838a;
            c10.c<?> a11 = c10.c.a(this.f42970d, true, null, null, null, 1983);
            this.f42967a = 1;
            if (aVar.e(this.f42969c, a11, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
