package com.withings.manualLogging.ui.feature.addNote;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: AddNotesViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.manualLogging.ui.feature.addNote.AddNotesViewModel$startNewPatientSession$1", f = "AddNotesViewModel.kt", l = {128, 130}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class l1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f41511a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1 f41512b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f41513c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(k1 k1Var, String str, qm0.d<? super l1> dVar) {
        super(2, dVar);
        this.f41512b = k1Var;
        this.f41513c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new l1(this.f41512b, this.f41513c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((l1) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pi.c cVar;
        pi.j jVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f41511a;
        k1 k1Var = this.f41512b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    nm0.l.b(obj);
                    return nm0.y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            cVar = k1Var.f41489j;
            this.f41511a = 1;
            obj = cVar.a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        String str = (String) obj;
        String str2 = this.f41513c;
        if ((true ^ dp0.j.D(str2)) && !kotlin.jvm.internal.u.e(str, str2)) {
            jVar = k1Var.f41491l;
            this.f41511a = 2;
            if (jVar.a(str2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
