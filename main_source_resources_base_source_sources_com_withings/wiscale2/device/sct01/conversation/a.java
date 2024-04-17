package com.withings.wiscale2.device.sct01.conversation;

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
/* compiled from: SctInitConversation.kt */
@e(c = "com.withings.wiscale2.device.sct01.conversation.SctInitConversation$setUserUnit$temperatureUnit$1", f = "SctInitConversation.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class a extends i implements p<CoroutineScope, d<? super v>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f54799a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SctInitConversation f54800b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(SctInitConversation sctInitConversation, d<? super a> dVar) {
        super(2, dVar);
        this.f54800b = sctInitConversation;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new a(this.f54800b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super v> dVar) {
        return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        w wVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f54799a;
        if (i11 != 0) {
            if (i11 == 1) {
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            l.b(obj);
            wVar = this.f54800b.f54783f;
            this.f54799a = 1;
            obj = g.q(wVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
