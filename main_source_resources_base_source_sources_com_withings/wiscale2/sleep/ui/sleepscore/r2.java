package com.withings.wiscale2.sleep.ui.sleepscore;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.track.data.Track;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.joda.time.DateTime;
/* compiled from: SleepNapListActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SleepNapListActivity$loadAndShowNaps$1", f = "SleepNapListActivity.kt", l = {79}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class r2 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f61220a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SleepNapListActivity f61221b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SleepNapListActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SleepNapListActivity$loadAndShowNaps$1$napsList$1", f = "SleepNapListActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super List<? extends Track>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SleepNapListActivity f61222a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(SleepNapListActivity sleepNapListActivity, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f61222a = sleepNapListActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f61222a, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super List<? extends Track>> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            ei0.q qVar = ei0.q.f65441d;
            if (qVar != null) {
                if (qVar != null) {
                    SleepNapListActivity sleepNapListActivity = this.f61222a;
                    List<Track> E = qVar.E(SleepNapListActivity.D3(sleepNapListActivity).getId(), new DateTime(SleepNapListActivity.z3(sleepNapListActivity)));
                    new ei0.v();
                    Track b10 = ei0.v.b(E);
                    if (!((ArrayList) E).isEmpty() && b10 != null) {
                        return ei0.v.c(E, b10, ei0.v.d(b10, E));
                    }
                    return kotlin.collections.i0.f76187a;
                }
                kotlin.jvm.internal.u.s("instance");
                throw null;
            }
            kotlin.jvm.internal.u.s("instance");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(SleepNapListActivity sleepNapListActivity, qm0.d<? super r2> dVar) {
        super(2, dVar);
        this.f61221b = sleepNapListActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new r2(this.f61221b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((r2) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f61220a;
        SleepNapListActivity sleepNapListActivity = this.f61221b;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            a aVar = new a(sleepNapListActivity, null);
            this.f61220a = 1;
            obj = BuildersKt.withContext(io2, aVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        List list = (List) obj;
        SleepNapListActivity.B3(sleepNapListActivity).setVisibility(8);
        if (!list.isEmpty()) {
            RecyclerView C3 = SleepNapListActivity.C3(sleepNapListActivity);
            kotlin.jvm.internal.u.g(C3);
            C3.setVisibility(0);
            C3.getContext();
            C3.setLayoutManager(new LinearLayoutManager(1));
            C3.setAdapter(new u2(list, SleepNapListActivity.A3(sleepNapListActivity), SleepNapListActivity.D3(sleepNapListActivity)));
            zq.b.a(C3, C1987R.drawable.list_divider_thick_with_margins, 1);
        }
        return nm0.y.f85009a;
    }
}
