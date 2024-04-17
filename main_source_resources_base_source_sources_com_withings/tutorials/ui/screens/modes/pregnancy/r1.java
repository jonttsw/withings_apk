package com.withings.tutorials.ui.screens.modes.pregnancy;

import com.withings.tutorials.ui.screens.modes.pregnancy.c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import vu.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PregnancyModeViewModel.kt */
/* loaded from: classes4.dex */
public final class r1<T> implements FlowCollector {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ PregnancyModeViewModel f46123a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r1(PregnancyModeViewModel pregnancyModeViewModel) {
        this.f46123a = pregnancyModeViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, qm0.d dVar) {
        Object obj2;
        MutableSharedFlow mutableSharedFlow;
        if (((vu.a) obj) instanceof a.b) {
            obj2 = c.a.f45847a;
        } else {
            obj2 = c.b.f45848a;
        }
        mutableSharedFlow = this.f46123a.P;
        Object emit = mutableSharedFlow.emit(obj2, dVar);
        if (emit != CoroutineSingletons.f76214a) {
            return nm0.y.f85009a;
        }
        return emit;
    }
}
