package com.withings.notifications.ui;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: NotificationsActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.notifications.ui.NotificationsActivity$onCreate$1$1$1$2$1", f = "NotificationsActivity.kt", l = {ConstantsWs.MEASURE_TYPE_APNEA_HYPOPNEA_INDEX}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class t extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f43099a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NotificationsActivity f43100b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ c10.c<?> f43101c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(NotificationsActivity notificationsActivity, c10.c<?> cVar, qm0.d<? super t> dVar) {
        super(2, dVar);
        this.f43100b = notificationsActivity;
        this.f43101c = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new t(this.f43100b, this.f43101c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((t) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f43099a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            NotificationsActivity notificationsActivity = this.f43100b;
            w00.a aVar = notificationsActivity.f42841e;
            if (aVar != null) {
                long z32 = NotificationsActivity.z3(notificationsActivity);
                this.f43099a = 1;
                if (aVar.c(notificationsActivity, this.f43101c, z32, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                kotlin.jvm.internal.u.s("notificationRedirection");
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}
