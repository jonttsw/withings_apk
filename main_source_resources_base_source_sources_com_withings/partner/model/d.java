package com.withings.partner.model;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.partner.exchanges.google.healthconnect.HealthConnect;
import java.util.Set;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Partner.kt */
@e(c = "com.withings.partner.model.PartnerKt$forcePartnerLinkIfPermissionsGranted$grantedPermissions$1", f = "Partner.kt", l = {ConstantsWs.WS_STATUS_P4_ERROR_INVALID_CROP_ARGS}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class d extends i implements p<CoroutineScope, qm0.d<? super Set<? extends String>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f43564a;

    d() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new i(2, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super Set<? extends String>> dVar) {
        return ((d) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f43564a;
        if (i11 != 0) {
            if (i11 == 1) {
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            l.b(obj);
            HealthConnect.e eVar = HealthConnect.e.f43397a;
            this.f43564a = 1;
            obj = eVar.h(true, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
