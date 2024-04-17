package com.withings.ecg.heartsound;

import com.withings.ecg.model.HeartSignalMeasurement;
import com.withings.ecg.webservices.GetSignalDataSyncFactory;
import com.withings.webservices.legacy.sync.SyncJob;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: HeartSoundDetailsFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.ecg.heartsound.HeartSoundDetailsViewModel$downloadSignalData$1", f = "HeartSoundDetailsFragment.kt", l = {477}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class u extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f38535a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f38536b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ r f38537c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(r rVar, qm0.d<? super u> dVar) {
        super(2, dVar);
        this.f38537c = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        u uVar = new u(this.f38537c, dVar);
        uVar.f38536b = obj;
        return uVar;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((u) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        androidx.lifecycle.j0 j0Var;
        t00.d dVar;
        GetSignalDataSyncFactory getSignalDataSyncFactory;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f38535a;
        try {
        } catch (Throwable th2) {
            nm0.l.a(th2);
        }
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f38536b;
            r rVar = this.f38537c;
            j0Var = rVar.f38511g;
            HeartSignalMeasurement heartSignalMeasurement = (HeartSignalMeasurement) j0Var.getValue();
            if (heartSignalMeasurement != null) {
                dVar = rVar.f38509e;
                getSignalDataSyncFactory = rVar.f38510f;
                SyncJob create = getSignalDataSyncFactory.create(heartSignalMeasurement);
                this.f38535a = 1;
                obj = t00.g.a(dVar, create, "view_heart_sounds", this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return nm0.y.f85009a;
        }
        ((Boolean) obj).getClass();
        return nm0.y.f85009a;
    }
}
