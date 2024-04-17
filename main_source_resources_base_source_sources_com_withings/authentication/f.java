package com.withings.authentication;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import th.z;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AuthenticationActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.AuthenticationActivity$AuthProviderSheetContent$1", f = "AuthenticationActivity.kt", l = {385}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class f extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f31508a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AuthenticationActivity f31509b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f31510c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AuthenticationActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f31511a;

        a(ym0.a<nm0.y> aVar) {
            this.f31511a = aVar;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, qm0.d dVar) {
            if (((z.a) obj) instanceof z.a.c) {
                System.out.println((Object) "authProviderSheetContent short code sent !!");
                this.f31511a.invoke();
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(AuthenticationActivity authenticationActivity, ym0.a<nm0.y> aVar, qm0.d<? super f> dVar) {
        super(2, dVar);
        this.f31509b = authenticationActivity;
        this.f31510c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new f(this.f31509b, this.f31510c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        ((f) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        return CoroutineSingletons.f76214a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f31508a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            MutableStateFlow<z.a> W0 = AuthenticationActivity.P3(this.f31509b).W0();
            a aVar = new a(this.f31510c);
            this.f31508a = 1;
            if (W0.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        throw new KotlinNothingValueException();
    }
}
