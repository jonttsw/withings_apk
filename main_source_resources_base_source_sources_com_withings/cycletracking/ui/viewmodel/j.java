package com.withings.cycletracking.ui.viewmodel;

import com.withings.periodsbar.Period;
import com.withings.wiscale2.device.hwa08.postinstall.b0;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import org.joda.time.DateTime;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CycleTrackingViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.cycletracking.ui.viewmodel.CycleTrackingViewModel$1", f = "CycleTrackingViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class j extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CycleTrackingViewModel f35901a;

    /* compiled from: CycleTrackingViewModel.kt */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ sm0.a<Period> f35902a = sm0.b.a(Period.values());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(CycleTrackingViewModel cycleTrackingViewModel, qm0.d<? super j> dVar) {
        super(2, dVar);
        this.f35901a = cycleTrackingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new j(this.f35901a, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((j) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CycleTrackingViewModel cycleTrackingViewModel;
        Object obj2;
        int i11;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        Iterator<E> it = a.f35902a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            cycleTrackingViewModel = this.f35901a;
            if (hasNext) {
                obj2 = it.next();
                int ordinal = ((Period) obj2).ordinal();
                i11 = cycleTrackingViewModel.f35798i;
                if (ordinal == i11) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        Period period = (Period) obj2;
        if (period == null) {
            period = Period.f43721f;
        }
        DateTime now = DateTime.now();
        kotlin.jvm.internal.u.i(now, "now(...)");
        b0.V(cycleTrackingViewModel, period, now);
        return nm0.y.f85009a;
    }
}
