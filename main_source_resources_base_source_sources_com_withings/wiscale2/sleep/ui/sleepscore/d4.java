package com.withings.wiscale2.sleep.ui.sleepscore;

import android.content.Context;
import android.widget.ImageView;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.sleep.ui.sleepscore.y3;
import com.withings.wiscale2.track.data.Track;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
/* compiled from: SleepWeekFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SleepWeekFragment$loadAndShowData$1", f = "SleepWeekFragment.kt", l = {ConstantsWs.MEASURE_TYPE_R5KHZ_SEGMENT, ConstantsWs.MEASURE_TYPE_MENSTRUATION_FLOW}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class d4 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f60910a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ tb0.c3 f60911b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ y3 f60912c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SleepWeekFragment.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SleepWeekFragment$loadAndShowData$1$tracks$1", f = "SleepWeekFragment.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super List<? extends Track>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ y3 f60913a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(y3 y3Var, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f60913a = y3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f60913a, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super List<? extends Track>> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            return y3.w1(this.f60913a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(tb0.c3 c3Var, y3 y3Var, qm0.d<? super d4> dVar) {
        super(2, dVar);
        this.f60911b = c3Var;
        this.f60912c = y3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new d4(this.f60911b, this.f60912c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((d4) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i11;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i12 = this.f60910a;
        y3 y3Var = this.f60912c;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    nm0.l.b(obj);
                    i11 = y3Var.f61570g;
                    y3Var.customScrollTo(i11);
                    return nm0.y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            a aVar = new a(y3Var, null);
            this.f60910a = 1;
            obj = BuildersKt.withContext(io2, aVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        List list = (List) obj;
        tb0.c3 c3Var = this.f60911b;
        c3Var.f98910g.setVisibility(8);
        if (list.isEmpty()) {
            y3.a aVar2 = y3.f61564j;
            y3Var.getClass();
            c3Var.f98906c.setVisibility(8);
            c3Var.f98909f.setVisibility(0);
            ImageView imageView = c3Var.f98907d;
            Context context = imageView.getContext();
            kotlin.jvm.internal.u.i(context, "getContext(...)");
            int w11 = ah.u.w(C1987R.attr.colorOnBackground, context, -65281);
            Context context2 = imageView.getContext();
            kotlin.jvm.internal.u.i(context2, "getContext(...)");
            imageView.setImageDrawable(y70.a.c(C1987R.drawable.ic_stock_trend_36dp, context2, w11));
        } else {
            y3.x1(c3Var, y3Var, list);
        }
        this.f60910a = 2;
        if (DelayKt.delay(200L, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        i11 = y3Var.f61570g;
        y3Var.customScrollTo(i11);
        return nm0.y.f85009a;
    }
}
