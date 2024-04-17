package com.withings.wiscale2.device.hwa03.conversation;

import ah.g;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import l70.v;
import l70.w;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: Hwa03InitConversation.kt */
@e(c = "com.withings.wiscale2.device.hwa03.conversation.Hwa03InitConversation$sendDistanceUnit$distance$1", f = "Hwa03InitConversation.kt", l = {95}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class a extends i implements p<CoroutineScope, d<? super v>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f54229a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Hwa03InitConversation f54230b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Hwa03InitConversation hwa03InitConversation, d<? super a> dVar) {
        super(2, dVar);
        this.f54230b = hwa03InitConversation;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new a(this.f54230b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super v> dVar) {
        return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        w wVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f54229a;
        if (i11 != 0) {
            if (i11 == 1) {
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            l.b(obj);
            wVar = this.f54230b.f54216i;
            this.f54229a = 1;
            obj = g.q(wVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
