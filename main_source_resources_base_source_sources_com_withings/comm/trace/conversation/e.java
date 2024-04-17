package com.withings.comm.trace.conversation;

import com.withings.comm.trace.b;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import ym0.p;
/* compiled from: DebugDumpConversation.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.comm.trace.conversation.DebugDumpConversation$storeDebugDump$1", f = "DebugDumpConversation.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class e extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ f f33205a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ DebugDumpConversation f33206b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, DebugDumpConversation debugDumpConversation, qm0.d<? super e> dVar) {
        super(2, dVar);
        this.f33205a = fVar;
        this.f33206b = debugDumpConversation;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new e(this.f33205a, this.f33206b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((e) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        boolean z5;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        l.b(obj);
        ArrayList b10 = this.f33205a.b();
        ArrayList arrayList = new ArrayList();
        Iterator it = b10.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((kj.a) next).b().length == 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            kj.a aVar = (kj.a) it2.next();
            DebugDumpConversation debugDumpConversation = this.f33206b;
            debugDumpConversation.N().f(debugDumpConversation.x().g(), aVar.c(), new b.a(aVar.b()));
        }
        return y.f85009a;
    }
}
