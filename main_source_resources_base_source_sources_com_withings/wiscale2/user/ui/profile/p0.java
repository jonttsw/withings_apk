package com.withings.wiscale2.user.ui.profile;

import com.withings.device.Device;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* compiled from: EditProfileViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.user.ui.profile.EditProfileViewModel$showAthleticOptions$1", f = "EditProfileViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_HR_LEVEL_MAX}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class p0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<Boolean>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f62016a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f62017b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ fl.i f62018c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ fl.p f62019d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(fl.i iVar, fl.p pVar, qm0.d<? super p0> dVar) {
        super(2, dVar);
        this.f62018c = iVar;
        this.f62019d = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        p0 p0Var = new p0(this.f62018c, this.f62019d, dVar);
        p0Var.f62017b = obj;
        return p0Var;
    }

    @Override // ym0.p
    public final Object invoke(androidx.lifecycle.h0<Boolean> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((p0) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f62016a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            androidx.lifecycle.h0 h0Var = (androidx.lifecycle.h0) this.f62017b;
            ArrayList a11 = this.f62018c.a(gl.d0.class);
            boolean z5 = false;
            if (!a11.isEmpty()) {
                Iterator it = a11.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Device device = (Device) it.next();
                    if (((gl.d0) this.f62019d.d(device.getModelId())).k(device.getFirmware())) {
                        z5 = true;
                        break;
                    }
                }
            }
            Boolean valueOf = Boolean.valueOf(z5);
            this.f62016a = 1;
            if (h0Var.emit(valueOf, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
