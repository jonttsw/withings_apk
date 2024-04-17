package com.withings.ecg.pdf;

import com.withings.ecg.details.b2;
import com.withings.ecg.graph.EcgEntry;
import com.withings.ecg.model.SignalMeta;
import com.withings.library.ecg.EcgLeadType;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.i0;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import nm0.y;
import org.joda.time.DateTime;
/* compiled from: OneLeadEcgPDF.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.ecg.pdf.OneLeadEcgPDF$setGraphData$1", f = "OneLeadEcgPDF.kt", l = {125, 130}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class i extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    SignalMeta f38789a;

    /* renamed from: b  reason: collision with root package name */
    f f38790b;

    /* renamed from: c  reason: collision with root package name */
    int f38791c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ b2 f38792d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ f f38793e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ kq.d f38794f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OneLeadEcgPDF.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.ecg.pdf.OneLeadEcgPDF$setGraphData$1$1", f = "OneLeadEcgPDF.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super List<? extends List<? extends EcgEntry>>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b2 f38795a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f38796b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f38797c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ SignalMeta f38798d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(b2 b2Var, int i11, f fVar, SignalMeta signalMeta, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f38795a = b2Var;
            this.f38796b = i11;
            this.f38797c = fVar;
            this.f38798d = signalMeta;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f38795a, this.f38796b, this.f38797c, this.f38798d, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super List<? extends List<? extends EcgEntry>>> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            List<EcgEntry> list = this.f38795a.a().get(EcgLeadType.DI);
            if (list == null) {
                list = i0.f76187a;
            }
            int i11 = this.f38796b;
            ArrayList<List> x11 = x.x(list, i11);
            ArrayList arrayList = new ArrayList(x.y(x11, 10));
            for (List list2 : x11) {
                if (list2.size() < i11) {
                    this.f38797c.getClass();
                    ArrayList S0 = x.S0(list2);
                    int size = i11 - list2.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        S0.add(new EcgEntry((i12 / this.f38798d.getSamplingFreq()) + ((EcgEntry) x.T(S0)).f(), 0.0f));
                    }
                    list2 = x.Q0(S0);
                }
                arrayList.add(list2);
            }
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(b2 b2Var, f fVar, kq.d dVar, qm0.d<? super i> dVar2) {
        super(2, dVar2);
        this.f38792d = b2Var;
        this.f38793e = fVar;
        this.f38794f = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new i(this.f38792d, this.f38793e, this.f38794f, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((i) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i11;
        SignalMeta signalMeta;
        f fVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i12 = this.f38791c;
        b2 b2Var = this.f38792d;
        f fVar2 = this.f38793e;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    nm0.l.b(obj);
                    return y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar = this.f38790b;
            signalMeta = this.f38789a;
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            SignalMeta meta = b2Var.b().getSignal().getMeta();
            int samplingFreq = meta.getSamplingFreq() * 10;
            List<EcgEntry> list = b2Var.a().get(EcgLeadType.DI);
            if (list != null) {
                i11 = list.size() / samplingFreq;
            } else {
                i11 = 0;
            }
            fVar2.f38770e = 0;
            int i13 = i11 / 3;
            if (i11 % 3 != 0) {
                i13++;
            }
            fVar2.f38769d = i13;
            CoroutineDispatcher io2 = Dispatchers.getIO();
            a aVar = new a(this.f38792d, samplingFreq, this.f38793e, meta, null);
            this.f38789a = meta;
            this.f38790b = fVar2;
            this.f38791c = 1;
            Object withContext = BuildersKt.withContext(io2, aVar, this);
            if (withContext == coroutineSingletons) {
                return coroutineSingletons;
            }
            signalMeta = meta;
            obj = withContext;
            fVar = fVar2;
        }
        fVar.f38771f = (List) obj;
        DateTime timestamp = b2Var.b().getTimestamp();
        this.f38789a = null;
        this.f38790b = null;
        this.f38791c = 2;
        if (f.i(fVar2, this.f38794f, signalMeta, timestamp, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return y.f85009a;
    }
}
