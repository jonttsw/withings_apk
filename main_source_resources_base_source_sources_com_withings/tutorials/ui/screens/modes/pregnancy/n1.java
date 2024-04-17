package com.withings.tutorials.ui.screens.modes.pregnancy;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PregnancyModeViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.tutorials.ui.screens.modes.pregnancy.PregnancyModeViewModel$cancelPregnancyProgram$1", f = "PregnancyModeViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_LEUKOCYTES}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class n1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f45994a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f45995b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PregnancyModeViewModel f45996c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(PregnancyModeViewModel pregnancyModeViewModel, qm0.d<? super n1> dVar) {
        super(2, dVar);
        this.f45996c = pregnancyModeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        n1 n1Var = new n1(this.f45996c, dVar);
        n1Var.f45995b = obj;
        return n1Var;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((n1) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        MutableStateFlow mutableStateFlow;
        z30.a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f45994a;
        PregnancyModeViewModel pregnancyModeViewModel = this.f45996c;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f45995b;
                aVar = pregnancyModeViewModel.f45793g;
                long j5 = pregnancyModeViewModel.f45798l;
                this.f45994a = 1;
                if (aVar.a(j5, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            a11 = nm0.y.f85009a;
        } catch (Throwable th2) {
            a11 = nm0.l.a(th2);
        }
        Throwable b10 = nm0.k.b(a11);
        if (b10 != null) {
            mutableStateFlow = pregnancyModeViewModel.G;
            mutableStateFlow.setValue(b10);
        } else {
            nm0.y yVar = (nm0.y) a11;
        }
        return nm0.y.f85009a;
    }
}
