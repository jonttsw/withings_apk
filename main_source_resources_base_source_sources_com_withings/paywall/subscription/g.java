package com.withings.paywall.subscription;

import com.withings.paywall.subscription.f;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import nm0.l;
import nm0.y;
import ym0.p;
/* compiled from: SubscriptionViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.paywall.subscription.SubscriptionViewModel$onSelectionChange$1", f = "SubscriptionViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class g extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SubscriptionViewModel f43689a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f43690b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(SubscriptionViewModel subscriptionViewModel, String str, qm0.d<? super g> dVar) {
        super(2, dVar);
        this.f43689a = subscriptionViewModel;
        this.f43690b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new g(this.f43689a, this.f43690b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((g) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        l.b(obj);
        SubscriptionViewModel subscriptionViewModel = this.f43689a;
        MutableStateFlow mutableStateFlow = subscriptionViewModel.f43628d;
        f value = subscriptionViewModel.p0().getValue();
        u.h(value, "null cannot be cast to non-null type com.withings.paywall.subscription.SubscriptionState.Ready");
        mutableStateFlow.setValue(f.c.a((f.c) value, this.f43690b));
        return y.f85009a;
    }
}
