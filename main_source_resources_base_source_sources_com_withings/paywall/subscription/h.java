package com.withings.paywall.subscription;

import android.app.Activity;
import com.withings.paywall.subscription.f;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import ym0.p;
/* compiled from: SubscriptionViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.paywall.subscription.SubscriptionViewModel$purchase$1", f = "SubscriptionViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class h extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SubscriptionViewModel f43691a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Activity f43692b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(SubscriptionViewModel subscriptionViewModel, Activity activity, qm0.d<? super h> dVar) {
        super(2, dVar);
        this.f43691a = subscriptionViewModel;
        this.f43692b = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new h(this.f43691a, this.f43692b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((h) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        com.withings.paywall.c cVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        l.b(obj);
        SubscriptionViewModel subscriptionViewModel = this.f43691a;
        SubscriptionViewModel.k0(subscriptionViewModel);
        cVar = subscriptionViewModel.f43626b;
        f value = subscriptionViewModel.p0().getValue();
        u.h(value, "null cannot be cast to non-null type com.withings.paywall.subscription.SubscriptionState.Ready");
        cVar.a(this.f43692b, ((f.c) value).b());
        return y.f85009a;
    }
}
