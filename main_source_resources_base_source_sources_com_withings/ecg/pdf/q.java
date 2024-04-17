package com.withings.ecg.pdf;

import com.withings.ecg.details.b2;
import com.withings.ecg.graph.EcgEntry;
import com.withings.ecg.model.SignalMeta;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.ecg.EcgLeadType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.s0;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import nm0.y;
import org.joda.time.DateTime;
/* compiled from: SixLeadEcgPDF.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.ecg.pdf.SixLeadEcgPDF$setGraphData$1", f = "SixLeadEcgPDF.kt", l = {ConstantsWs.MEASURE_TYPE_ECG_QT_INTERVAL_DURATION, ConstantsWs.MEASURE_TYPE_LUTEINIZING_HORMONE}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class q extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    SignalMeta f38822a;

    /* renamed from: b  reason: collision with root package name */
    r f38823b;

    /* renamed from: c  reason: collision with root package name */
    int f38824c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ b2 f38825d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ r f38826e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ kq.e f38827f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SixLeadEcgPDF.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.ecg.pdf.SixLeadEcgPDF$setGraphData$1$1", f = "SixLeadEcgPDF.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super List<? extends Map<EcgLeadType, ? extends List<? extends EcgEntry>>>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b2 f38828a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r f38829b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f38830c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ SignalMeta f38831d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(b2 b2Var, r rVar, int i11, SignalMeta signalMeta, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f38828a = b2Var;
            this.f38829b = rVar;
            this.f38830c = i11;
            this.f38831d = signalMeta;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f38828a, this.f38829b, this.f38830c, this.f38831d, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super List<? extends Map<EcgLeadType, ? extends List<? extends EcgEntry>>>> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i11;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            Map<EcgLeadType, List<EcgEntry>> a11 = this.f38828a.a();
            LinkedHashMap linkedHashMap = new LinkedHashMap(s0.h(a11.size()));
            Iterator<T> it = a11.entrySet().iterator();
            while (true) {
                i11 = 0;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                this.f38829b.getClass();
                int i12 = this.f38830c;
                ArrayList<List> x11 = x.x((List) entry.getValue(), i12);
                ArrayList arrayList = new ArrayList(x.y(x11, 10));
                for (List list : x11) {
                    if (list.size() < i12) {
                        ArrayList S0 = x.S0(list);
                        int size = i12 - list.size();
                        for (int i13 = 0; i13 < size; i13++) {
                            S0.add(new EcgEntry((i13 / this.f38831d.getSamplingFreq()) + ((EcgEntry) x.T(S0)).f(), 0.0f));
                        }
                        list = x.Q0(S0);
                    }
                    arrayList.add(list);
                }
                linkedHashMap.put(key, arrayList);
            }
            List list2 = (List) x.H(linkedHashMap.values());
            ArrayList arrayList2 = new ArrayList(x.y(list2, 10));
            for (Object obj2 : list2) {
                int i14 = i11 + 1;
                if (i11 >= 0) {
                    List list3 = (List) obj2;
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(s0.h(linkedHashMap.size()));
                    for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                        linkedHashMap2.put(entry2.getKey(), (List) ((List) entry2.getValue()).get(i11));
                    }
                    arrayList2.add(linkedHashMap2);
                    i11 = i14;
                } else {
                    x.K0();
                    throw null;
                }
            }
            return arrayList2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(b2 b2Var, r rVar, kq.e eVar, qm0.d<? super q> dVar) {
        super(2, dVar);
        this.f38825d = b2Var;
        this.f38826e = rVar;
        this.f38827f = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new q(this.f38825d, this.f38826e, this.f38827f, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((q) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        SignalMeta signalMeta;
        r rVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f38824c;
        b2 b2Var = this.f38825d;
        r rVar2 = this.f38826e;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    nm0.l.b(obj);
                    return y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rVar = this.f38823b;
            signalMeta = this.f38822a;
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            SignalMeta meta = b2Var.b().getSignal().getMeta();
            int samplingFreq = meta.getSamplingFreq() * 6;
            rVar2.f38835d = ((List) x.H(b2Var.a().values())).size() / samplingFreq;
            rVar2.f38836e = 0;
            CoroutineDispatcher io2 = Dispatchers.getIO();
            a aVar = new a(this.f38825d, this.f38826e, samplingFreq, meta, null);
            this.f38822a = meta;
            this.f38823b = rVar2;
            this.f38824c = 1;
            Object withContext = BuildersKt.withContext(io2, aVar, this);
            if (withContext == coroutineSingletons) {
                return coroutineSingletons;
            }
            signalMeta = meta;
            obj = withContext;
            rVar = rVar2;
        }
        rVar.f38837f = (List) obj;
        DateTime timestamp = b2Var.b().getTimestamp();
        this.f38822a = null;
        this.f38823b = null;
        this.f38824c = 2;
        if (r.i(this.f38827f, signalMeta, rVar2, this, timestamp) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return y.f85009a;
    }
}
