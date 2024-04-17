package com.withings.authentication;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AuthenticationActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.AuthenticationActivity$HandleNavigation$1", f = "AuthenticationActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class u extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AuthenticationActivity f32464a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AuthenticationActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AuthenticationActivity f32465a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AuthenticationActivity authenticationActivity) {
            super(0);
            this.f32465a = authenticationActivity;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            this.f32465a.V3(false);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AuthenticationActivity.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AuthenticationActivity f32466a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(AuthenticationActivity authenticationActivity) {
            super(0);
            this.f32466a = authenticationActivity;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            this.f32466a.V3(false);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(AuthenticationActivity authenticationActivity, qm0.d<? super u> dVar) {
        super(2, dVar);
        this.f32464a = authenticationActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new u(this.f32464a, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((u) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        AuthenticationActivity authenticationActivity = this.f32464a;
        AuthenticationActivity.Q3(authenticationActivity).A0().v(authenticationActivity, new a(authenticationActivity));
        AuthenticationActivity.M3(authenticationActivity).r0().v(authenticationActivity, new b(authenticationActivity));
        return nm0.y.f85009a;
    }
}
