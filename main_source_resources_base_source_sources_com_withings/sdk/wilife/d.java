package com.withings.sdk.wilife;

import ah.h;
import android.app.Application;
import g4.e;
import g4.f;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WilifeApplication.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.sdk.wilife.WilifeApplicationKt$setChangelogDisplayed$1", f = "WilifeApplication.kt", l = {109}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class d extends i implements p<CoroutineScope, qm0.d<? super g4.e>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f43988a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Application f43989b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f43990c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WilifeApplication.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.sdk.wilife.WilifeApplicationKt$setChangelogDisplayed$1$1", f = "WilifeApplication.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends i implements p<g4.a, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f43991a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f43992b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f43992b = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            a aVar = new a(this.f43992b, dVar);
            aVar.f43991a = obj;
            return aVar;
        }

        @Override // ym0.p
        public final Object invoke(g4.a aVar, qm0.d<? super y> dVar) {
            return ((a) create(aVar, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            l.b(obj);
            g4.a aVar = (g4.a) this.f43991a;
            e.a<?> f11 = h.f(this.f43992b);
            Long l5 = new Long(System.currentTimeMillis());
            aVar.getClass();
            aVar.k(f11, l5);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Application application, String str, qm0.d<? super d> dVar) {
        super(2, dVar);
        this.f43989b = application;
        this.f43990c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new d(this.f43989b, this.f43990c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super g4.e> dVar) {
        return ((d) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f43988a;
        if (i11 != 0) {
            if (i11 == 1) {
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            l.b(obj);
            c4.h a11 = b.a(this.f43989b);
            a aVar = new a(this.f43990c, null);
            this.f43988a = 1;
            obj = f.a(a11, aVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
