package com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.vasistas.model.Vasistas;
import com.withings.webservices.legacy.sync.ActionSyncJob;
import com.withings.wiscale2.track.data.Track;
import com.withings.wiscale2.track.data.TrackKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SleepDisorderDetailsFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.SleepDisorderDetailsViewModel$downloadSleepVasistas$1", f = "SleepDisorderDetailsFragment.kt", l = {ConstantsWs.WS_STATUS_OAUTHWRONGTOKEN, ConstantsWs.WS_STATUS_WRONGROLEID}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class h0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Track f61337a;

    /* renamed from: b  reason: collision with root package name */
    int f61338b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ Object f61339c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ g0 f61340d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Track f61341e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(g0 g0Var, Track track, qm0.d<? super h0> dVar) {
        super(2, dVar);
        this.f61340d = g0Var;
        this.f61341e = track;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        h0 h0Var = new h0(this.f61340d, this.f61341e, dVar);
        h0Var.f61339c = obj;
        return h0Var;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((h0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Track track;
        t00.d dVar;
        lj0.k kVar;
        g0 g0Var;
        t00.d dVar2;
        lj0.k kVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f61338b;
        g0 g0Var2 = this.f61340d;
        try {
        } catch (Throwable th2) {
            nm0.l.a(th2);
        }
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    nm0.l.b(obj);
                    ((Boolean) obj).getClass();
                    g0Var2.f61313j = false;
                    return nm0.y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            track = this.f61337a;
            g0Var = (g0) this.f61339c;
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f61339c;
            g0Var2.f61313j = true;
            track = this.f61341e;
            dVar = g0Var2.f61311h;
            kVar = g0Var2.f61310g;
            ActionSyncJob a11 = kVar.a(g0Var2.f61304a.getId(), Vasistas.Category.BED, TrackKt.getEffectiveStartDate(track), TrackKt.getEffectiveEndDate(track));
            this.f61339c = g0Var2;
            this.f61337a = track;
            this.f61338b = 1;
            if (t00.g.a(dVar, a11, "sleep_disorder_get_bed_vasistas", this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            g0Var = g0Var2;
        }
        dVar2 = g0Var.f61311h;
        kVar2 = g0Var.f61310g;
        ActionSyncJob a12 = kVar2.a(g0Var.f61304a.getId(), Vasistas.Category.AHI, TrackKt.getEffectiveStartDate(track), TrackKt.getEffectiveEndDate(track));
        this.f61339c = null;
        this.f61337a = null;
        this.f61338b = 2;
        obj = t00.g.a(dVar2, a12, "sleep_disorder_get_ahi_vasistas", this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        ((Boolean) obj).getClass();
        g0Var2.f61313j = false;
        return nm0.y.f85009a;
    }
}
