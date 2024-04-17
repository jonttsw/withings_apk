package com.withings.wiscale2.device.wpa.wpa02.ui.features.cartridge;

import com.withings.wiscale2.device.consumable.model.Consumable;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.joda.time.DateTime;
import re0.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Wpa02CartridgeActivationViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.wpa.wpa02.ui.features.cartridge.Wpa02CartridgeActivationViewModel$getRemainingConsumableInfo$1", f = "Wpa02CartridgeActivationViewModel.kt", l = {217}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class d0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    b0 f55168a;

    /* renamed from: b  reason: collision with root package name */
    int f55169b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ u70.i f55170c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ b0 f55171d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(u70.i iVar, b0 b0Var, qm0.d<? super d0> dVar) {
        super(2, dVar);
        this.f55170c = iVar;
        this.f55171d = b0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new d0(this.f55170c, this.f55171d, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((d0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        b0 b0Var;
        Long printedExpirationDate;
        MutableStateFlow mutableStateFlow2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f55169b;
        if (i11 != 0) {
            if (i11 == 1) {
                b0Var = this.f55168a;
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            u70.i iVar = this.f55170c;
            if (iVar != null) {
                b0 b0Var2 = this.f55171d;
                mutableStateFlow = b0Var2.f55136n;
                if (mutableStateFlow.getValue() == null) {
                    this.f55168a = b0Var2;
                    this.f55169b = 1;
                    obj = b0.j0(iVar, b0Var2, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    b0Var = b0Var2;
                }
            }
            return nm0.y.f85009a;
        }
        Consumable consumable = (Consumable) obj;
        if (consumable != null && (printedExpirationDate = consumable.getPrintedExpirationDate()) != null) {
            long longValue = printedExpirationDate.longValue();
            Long effectiveExpirationDate = consumable.getEffectiveExpirationDate();
            if (effectiveExpirationDate != null) {
                long longValue2 = effectiveExpirationDate.longValue();
                long j5 = 1000;
                if (new DateTime(longValue * j5).isBeforeNow()) {
                    b0Var.f55133k.setValue(a.c.d.f94762a);
                } else if (!new DateTime(longValue2 * j5).isBeforeNow()) {
                    mutableStateFlow2 = b0Var.f55136n;
                    mutableStateFlow2.setValue(consumable);
                } else {
                    b0Var.f55133k.setValue(a.c.f.f94764a);
                }
            }
        }
        return nm0.y.f85009a;
    }
}
