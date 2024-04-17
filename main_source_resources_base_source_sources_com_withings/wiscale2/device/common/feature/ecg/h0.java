package com.withings.wiscale2.device.common.feature.ecg;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EcgActivationActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.EcgActivationActivity$EcgLiveVideoScreen$1", f = "EcgActivationActivity.kt", l = {884}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class h0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f51383a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ EcgActivationActivity f51384b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f51385c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EcgActivationActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.EcgActivationActivity$EcgLiveVideoScreen$1$1", f = "EcgActivationActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        private /* synthetic */ Object f51386a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f51387b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: EcgActivationActivity.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.EcgActivationActivity$EcgLiveVideoScreen$1$1$1", f = "EcgActivationActivity.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.withings.wiscale2.device.common.feature.ecg.h0$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0692a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ym0.a<nm0.y> f51388a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0692a(ym0.a<nm0.y> aVar, qm0.d<? super C0692a> dVar) {
                super(2, dVar);
                this.f51388a = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                return new C0692a(this.f51388a, dVar);
            }

            @Override // ym0.p
            public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
                return ((C0692a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                nm0.l.b(obj);
                this.f51388a.invoke();
                return nm0.y.f85009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ym0.a<nm0.y> aVar, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f51387b = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            a aVar = new a(this.f51387b, dVar);
            aVar.f51386a = obj;
            return aVar;
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            BuildersKt__Builders_commonKt.launch$default((CoroutineScope) this.f51386a, null, null, new C0692a(this.f51387b, null), 3, null);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(EcgActivationActivity ecgActivationActivity, ym0.a<nm0.y> aVar, qm0.d<? super h0> dVar) {
        super(2, dVar);
        this.f51384b = ecgActivationActivity;
        this.f51385c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new h0(this.f51384b, this.f51385c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((h0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f51383a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            Lifecycle.State state = Lifecycle.State.f14376e;
            a aVar = new a(this.f51385c, null);
            this.f51383a = 1;
            if (RepeatOnLifecycleKt.b(this.f51384b, state, aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
