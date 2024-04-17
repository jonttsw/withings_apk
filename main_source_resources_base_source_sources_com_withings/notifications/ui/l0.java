package com.withings.notifications.ui;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
/* compiled from: NotificationsActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.notifications.ui.NotificationsActivityKt$animatedNotificationCards$2$1$1", f = "NotificationsActivity.kt", l = {ConstantsWs.HTTP_STATUS_PRECONDITION_REQUIRED}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class l0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f42971a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f42972b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f42973c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ k1.o0 f42974d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(boolean z5, k1.r0<Boolean> r0Var, k1.o0 o0Var, qm0.d<? super l0> dVar) {
        super(2, dVar);
        this.f42972b = z5;
        this.f42973c = r0Var;
        this.f42974d = o0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new l0(this.f42972b, this.f42973c, this.f42974d, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((l0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f42971a;
        k1.o0 o0Var = this.f42974d;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            this.f42973c.setValue(Boolean.TRUE);
            if (this.f42972b) {
                o0Var.t(-2.0f);
                this.f42971a = 1;
                if (DelayKt.delay(300L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
        o0Var.t(0.0f);
        return nm0.y.f85009a;
    }
}
