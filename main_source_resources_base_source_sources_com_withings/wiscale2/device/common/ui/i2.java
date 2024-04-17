package com.withings.wiscale2.device.common.ui;

import com.withings.device.Device;
import com.withings.features.platform.model.PlatformFeature;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import org.joda.time.DateTime;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RespiratoryScanSettingsActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.ui.RespiratoryScanViewModel$updateAndSyncFeature$1$1", f = "RespiratoryScanSettingsActivity.kt", l = {250, ConstantsWs.WS_STATUS_NODATAFOUND, ConstantsWs.WS_STATUS_WRONGBATTERYLVL}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class i2 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f53994a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ h2 f53995b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ List<PlatformFeature> f53996c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f53997d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ DateTime f53998e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(h2 h2Var, List<PlatformFeature> list, int i11, DateTime dateTime, qm0.d<? super i2> dVar) {
        super(2, dVar);
        this.f53995b = h2Var;
        this.f53996c = list;
        this.f53997d = i11;
        this.f53998e = dateTime;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new i2(this.f53995b, this.f53996c, this.f53997d, this.f53998e, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((i2) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        com.withings.wiscale2.device.common.feature.u uVar;
        androidx.lifecycle.j0 j0Var;
        androidx.lifecycle.j0 j0Var2;
        androidx.lifecycle.k0 k0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f53994a;
        h2 h2Var = this.f53995b;
        if (i11 != 0) {
            if (i11 != 1 && i11 != 2 && i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            uVar = h2Var.f53958d;
            Device device = h2Var.f53955a;
            List<PlatformFeature> features = this.f53996c;
            kotlin.jvm.internal.u.i(features, "$features");
            com.withings.wiscale2.device.common.feature.t a11 = uVar.a(device, features, null);
            j0Var = h2Var.f53963i;
            T value = j0Var.getValue();
            Boolean bool = Boolean.TRUE;
            if (kotlin.jvm.internal.u.e(value, bool)) {
                int i12 = this.f53997d;
                if (i12 == 0) {
                    this.f53994a = 1;
                    if (a11.j(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    DateTime dateTime = this.f53998e;
                    if (i12 == 1) {
                        j0Var2 = h2Var.f53963i;
                        if (kotlin.jvm.internal.u.e(j0Var2.getValue(), bool)) {
                            this.f53994a = 2;
                            if (a11.h(dateTime, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    if (i12 == 1 || i12 == 2) {
                        this.f53994a = 3;
                        if (a11.i(dateTime, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
            }
        }
        k0Var = h2Var.f53959e;
        k0Var.postValue(Boolean.TRUE);
        return nm0.y.f85009a;
    }
}
