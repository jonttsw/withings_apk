package com.withings.ecg.details;

import com.withings.ecg.model.HeartSignalMeasurement;
import com.withings.ecg.webservices.GetSignalDataSyncFactory;
import com.withings.webservices.legacy.sync.SyncJob;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: EcgDetailsFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.ecg.details.EcgDetailsViewModel$downloadSignalData$1", f = "EcgDetailsFragment.kt", l = {674}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class f0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f38187a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f38188b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ b0 f38189c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(b0 b0Var, qm0.d<? super f0> dVar) {
        super(2, dVar);
        this.f38189c = b0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        f0 f0Var = new f0(this.f38189c, dVar);
        f0Var.f38188b = obj;
        return f0Var;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((f0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        t00.d dVar;
        GetSignalDataSyncFactory getSignalDataSyncFactory;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f38187a;
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
            CoroutineScope coroutineScope = (CoroutineScope) this.f38188b;
            b0 b0Var = this.f38189c;
            HeartSignalMeasurement value = b0Var.R0().getValue();
            if (value != null) {
                dVar = b0Var.f38104h;
                getSignalDataSyncFactory = b0Var.f38103g;
                SyncJob create = getSignalDataSyncFactory.create(value);
                this.f38187a = 1;
                obj = t00.g.a(dVar, create, "view_ecg_details", this);
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
