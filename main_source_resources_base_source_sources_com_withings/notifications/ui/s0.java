package com.withings.notifications.ui;

import android.content.Context;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: NotificationsSection.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.notifications.ui.NotificationsSectionKt$NotificationsSection$1$1$1", f = "NotificationsSection.kt", l = {41}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class s0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f43094a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r0 f43095b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Context f43096c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ c10.c<?> f43097d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ long f43098e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(r0 r0Var, Context context, c10.c<?> cVar, long j5, qm0.d<? super s0> dVar) {
        super(2, dVar);
        this.f43095b = r0Var;
        this.f43096c = context;
        this.f43097d = cVar;
        this.f43098e = j5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new s0(this.f43095b, this.f43096c, this.f43097d, this.f43098e, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((s0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f43094a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            w00.a A = this.f43095b.A();
            this.f43094a = 1;
            if (A.c(this.f43096c, this.f43097d, this.f43098e, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
