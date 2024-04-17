package com.withings.wiscale2.device.common.notifications.ui;

import gb0.c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
/* compiled from: DeviceNotificationSettingsFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.notifications.ui.DeviceNotificationViewModel$appTogglesChanged$1", f = "DeviceNotificationSettingsFragment.kt", l = {475}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class x0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<ProducerScope<? super nm0.y>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f53040a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f53041b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ f1 f53042c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeviceNotificationSettingsFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f1 f53043a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f53044b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f1 f1Var, b bVar) {
            super(0);
            this.f53043a = f1Var;
            this.f53044b = bVar;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            f1.j0(this.f53043a).p(this.f53044b);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: DeviceNotificationSettingsFragment.kt */
    /* loaded from: classes5.dex */
    public static final class b implements c.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ProducerScope<nm0.y> f53045a;

        /* JADX WARN: Multi-variable type inference failed */
        b(ProducerScope<? super nm0.y> producerScope) {
            this.f53045a = producerScope;
        }

        @Override // gb0.c.a
        public final void a() {
            this.f53045a.mo66trySendJP2dKIU(nm0.y.f85009a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(f1 f1Var, qm0.d<? super x0> dVar) {
        super(2, dVar);
        this.f53042c = f1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        x0 x0Var = new x0(this.f53042c, dVar);
        x0Var.f53041b = obj;
        return x0Var;
    }

    @Override // ym0.p
    public final Object invoke(ProducerScope<? super nm0.y> producerScope, qm0.d<? super nm0.y> dVar) {
        return ((x0) create(producerScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f53040a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            ProducerScope producerScope = (ProducerScope) this.f53041b;
            b bVar = new b(producerScope);
            f1 f1Var = this.f53042c;
            f1.j0(f1Var).m(bVar);
            producerScope.mo66trySendJP2dKIU(nm0.y.f85009a);
            a aVar = new a(f1Var, bVar);
            this.f53040a = 1;
            if (ProduceKt.awaitClose(producerScope, aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
