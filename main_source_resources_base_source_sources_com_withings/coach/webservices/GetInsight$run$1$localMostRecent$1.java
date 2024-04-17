package com.withings.coach.webservices;

import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GetInsight.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.coach.webservices.GetInsight$run$1$localMostRecent$1", f = "GetInsight.kt", l = {28}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class GetInsight$run$1$localMostRecent$1 extends i implements p<CoroutineScope, d<? super Long>, Object> {
    int label;
    final /* synthetic */ GetInsight this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetInsight$run$1$localMostRecent$1(GetInsight getInsight, d<? super GetInsight$run$1$localMostRecent$1> dVar) {
        super(2, dVar);
        this.this$0 = getInsight;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new GetInsight$run$1$localMostRecent$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ti.d dVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            l.b(obj);
            dVar = this.this$0.insightStateRepository;
            long userId = this.this$0.getUserId();
            this.label = 1;
            obj = dVar.b(userId, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super Long> dVar) {
        return ((GetInsight$run$1$localMostRecent$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
