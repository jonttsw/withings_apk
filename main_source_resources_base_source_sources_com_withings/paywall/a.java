package com.withings.paywall;

import android.app.Activity;
import android.content.Context;
import com.android.billingclient.api.a;
import com.android.billingclient.api.d;
import com.android.billingclient.api.k;
import com.withings.paywall.e;
import com.withings.paywall.w;
import com.withings.paywall.x;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
/* compiled from: BillingClientWrapper.kt */
/* loaded from: classes4.dex */
public final class a implements com.android.billingclient.api.j, com.android.billingclient.api.h {

    /* renamed from: a  reason: collision with root package name */
    private final com.android.billingclient.api.a f43574a;

    /* renamed from: b  reason: collision with root package name */
    private final MutableStateFlow<e> f43575b;

    /* renamed from: c  reason: collision with root package name */
    private final StateFlow<e> f43576c;

    /* renamed from: d  reason: collision with root package name */
    private final MutableSharedFlow<x> f43577d;

    /* renamed from: e  reason: collision with root package name */
    private final SharedFlow<x> f43578e;

    /* compiled from: BillingClientWrapper.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.paywall.BillingClientWrapper$onPurchasesUpdated$1", f = "BillingClientWrapper.kt", l = {112, 120}, m = "invokeSuspend")
    /* renamed from: com.withings.paywall.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0587a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f43579a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.android.billingclient.api.e f43580b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List<com.android.billingclient.api.i> f43581c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f43582d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0587a(com.android.billingclient.api.e eVar, List<? extends com.android.billingclient.api.i> list, a aVar, qm0.d<? super C0587a> dVar) {
            super(2, dVar);
            this.f43580b = eVar;
            this.f43581c = list;
            this.f43582d = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new C0587a(this.f43580b, this.f43581c, this.f43582d, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((C0587a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            w wVar;
            String str;
            int i11;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i12 = this.f43579a;
            if (i12 != 0) {
                if (i12 != 1 && i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                com.android.billingclient.api.e eVar = this.f43580b;
                int b10 = eVar.b();
                a aVar = this.f43582d;
                if (b10 == 0) {
                    List<com.android.billingclient.api.i> list = this.f43581c;
                    List<com.android.billingclient.api.i> list2 = list;
                    if (list2 != null && !list2.isEmpty()) {
                        MutableSharedFlow mutableSharedFlow = aVar.f43577d;
                        String a11 = ((com.android.billingclient.api.i) kotlin.collections.x.I(list)).a();
                        kotlin.jvm.internal.u.i(a11, "getPurchaseToken(...)");
                        x.b bVar = new x.b(a11);
                        this.f43579a = 1;
                        if (mutableSharedFlow.emit(bVar, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
                int b11 = eVar.b();
                if (b11 != 3) {
                    if (b11 != 4) {
                        if (b11 != 7) {
                            int b12 = eVar.b();
                            aVar.getClass();
                            Field[] fields = a.InterfaceC0338a.class.getFields();
                            kotlin.jvm.internal.u.i(fields, "getFields(...)");
                            try {
                            } catch (Exception unused) {
                                str = "UNKNOWN_RESPONSE_CODE";
                            }
                            for (Field field : fields) {
                                if (field.getInt(null) == b12) {
                                    str = field.getName();
                                    kotlin.jvm.internal.u.g(str);
                                    wVar = new w.b(str);
                                }
                            }
                            throw new NoSuchElementException("Array contains no element matching the predicate.");
                        }
                        wVar = w.a.f43706a;
                    } else {
                        wVar = w.d.f43709a;
                    }
                } else {
                    wVar = w.c.f43708a;
                }
                MutableSharedFlow mutableSharedFlow2 = aVar.f43577d;
                x.a aVar2 = new x.a(wVar);
                this.f43579a = 2;
                if (mutableSharedFlow2.emit(aVar2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: BillingClientWrapper.kt */
    /* loaded from: classes4.dex */
    public static final class b implements com.android.billingclient.api.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CancellableContinuation<Boolean> f43584b;

        /* compiled from: BillingClientWrapper.kt */
        /* renamed from: com.withings.paywall.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0588a extends kotlin.jvm.internal.w implements ym0.l<Throwable, nm0.y> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f43585a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0588a(a aVar) {
                super(1);
                this.f43585a = aVar;
            }

            @Override // ym0.l
            public final nm0.y invoke(Throwable th2) {
                Throwable it = th2;
                kotlin.jvm.internal.u.j(it, "it");
                this.f43585a.f43574a.a();
                return nm0.y.f85009a;
            }
        }

        /* compiled from: BillingClientWrapper.kt */
        /* renamed from: com.withings.paywall.a$b$b  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0589b extends kotlin.jvm.internal.w implements ym0.l<Throwable, nm0.y> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f43586a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0589b(a aVar) {
                super(1);
                this.f43586a = aVar;
            }

            @Override // ym0.l
            public final nm0.y invoke(Throwable th2) {
                Throwable it = th2;
                kotlin.jvm.internal.u.j(it, "it");
                this.f43586a.f43574a.a();
                return nm0.y.f85009a;
            }
        }

        b(CancellableContinuationImpl cancellableContinuationImpl) {
            this.f43584b = cancellableContinuationImpl;
        }

        @Override // com.android.billingclient.api.c
        public final void a(com.android.billingclient.api.e billingResult) {
            kotlin.jvm.internal.u.j(billingResult, "billingResult");
            int b10 = billingResult.b();
            CancellableContinuation<Boolean> cancellableContinuation = this.f43584b;
            a aVar = a.this;
            if (b10 == 0) {
                aVar.h();
                cancellableContinuation.resume(Boolean.TRUE, new C0588a(aVar));
                return;
            }
            cancellableContinuation.resume(Boolean.FALSE, new C0589b(aVar));
        }
    }

    /* compiled from: BillingClientWrapper.kt */
    /* loaded from: classes4.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.l<Throwable, nm0.y> {
        c() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(Throwable th2) {
            a.this.f43574a.a();
            return nm0.y.f85009a;
        }
    }

    public a(Context context) {
        a.b d11 = com.android.billingclient.api.a.d(context);
        d11.c(this);
        d11.b();
        this.f43574a = d11.a();
        MutableStateFlow<e> MutableStateFlow = StateFlowKt.MutableStateFlow(e.b.f43608a);
        this.f43575b = MutableStateFlow;
        this.f43576c = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<x> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
        this.f43577d = MutableSharedFlow$default;
        this.f43578e = FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    @Override // com.android.billingclient.api.h
    public final void a(com.android.billingclient.api.e billingResult, ArrayList arrayList) {
        kotlin.jvm.internal.u.j(billingResult, "billingResult");
        int b10 = billingResult.b();
        MutableStateFlow<e> mutableStateFlow = this.f43575b;
        if (b10 == 0) {
            if (arrayList.isEmpty()) {
                mutableStateFlow.setValue(new e.a(0));
                return;
            } else {
                mutableStateFlow.setValue(new e.c((com.android.billingclient.api.g) kotlin.collections.x.I(arrayList)));
                return;
            }
        }
        mutableStateFlow.setValue(new e.a(0));
    }

    @Override // com.android.billingclient.api.j
    public final void b(com.android.billingclient.api.e billingResult, List<? extends com.android.billingclient.api.i> list) {
        kotlin.jvm.internal.u.j(billingResult, "billingResult");
        BuildersKt__BuildersKt.runBlocking$default(null, new C0587a(billingResult, list, this, null), 1, null);
    }

    public final StateFlow<e> e() {
        return this.f43576c;
    }

    public final SharedFlow<x> f() {
        return this.f43578e;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, com.android.billingclient.api.d$b$a] */
    public final void g(Activity activity, String offerToken) {
        kotlin.jvm.internal.u.j(activity, "activity");
        kotlin.jvm.internal.u.j(offerToken, "offerToken");
        com.android.billingclient.api.a aVar = this.f43574a;
        if (aVar.b()) {
            StateFlow<e> stateFlow = this.f43576c;
            if (stateFlow.getValue() instanceof e.c) {
                d.a a11 = com.android.billingclient.api.d.a();
                ?? obj = new Object();
                e value = stateFlow.getValue();
                kotlin.jvm.internal.u.h(value, "null cannot be cast to non-null type com.withings.paywall.FetchSubscriptionResult.Success");
                obj.c(((e.c) value).a());
                obj.b(offerToken);
                a11.b(kotlin.collections.x.V(obj.a()));
                aVar.c(activity, a11.a());
                return;
            }
        }
        this.f43575b.setValue(new e.a(0));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.android.billingclient.api.k$b$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.android.billingclient.api.k$a, java.lang.Object] */
    public final void h() {
        ?? obj = new Object();
        obj.b();
        obj.c();
        k.b a11 = obj.a();
        ?? obj2 = new Object();
        obj2.b(kotlin.collections.x.V(a11));
        this.f43574a.e(obj2.a(), this);
    }

    public final Object i(qm0.d<? super Boolean> dVar) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(rm0.a.b(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        this.f43574a.f(new b(cancellableContinuationImpl));
        cancellableContinuationImpl.invokeOnCancellation(new c());
        Object result = cancellableContinuationImpl.getResult();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        return result;
    }
}
