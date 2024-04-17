package com.withings.library.ecg.filter.v2;

import com.google.android.gms.fitness.data.WorkoutExercises;
import com.withings.library.ecg.EcgLeadType;
import com.withings.library.ecg.EcgSignal;
import com.withings.library.ecg.EcgSignalFormat;
import com.withings.library.ecg.EcgSignalType;
import com.withings.library.ecg.WearPosition;
import com.withings.library.ecg.filter.EcgFilter;
import com.withings.library.ecg.leads.EcgLeadsProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.l;
import kotlin.collections.s0;
import kotlin.collections.x;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import nm0.j;
/* compiled from: EcgFilterV2.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010'\u001a\u00020\u0012\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b*\u0010+J\u0013\u0010\u0003\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006,"}, d2 = {"Lcom/withings/library/ecg/filter/v2/EcgFilterV2;", "Lcom/withings/library/ecg/filter/EcgFilter$InternalEcgFilter;", "", "flipSignal", "([I)[I", "", "values", "", "chunkLost", "", "Lcom/withings/library/ecg/EcgLeadType;", "filterValues", "([BZ)Ljava/util/Map;", "filterBatch", "([B)Ljava/util/Map;", "Lnm0/y;", WorkoutExercises.CLEAN, "()V", "", "frequency", "I", "Lcom/withings/library/ecg/EcgSignalFormat;", "ecgSignalFormat", "Lcom/withings/library/ecg/EcgSignalFormat;", "Lcom/withings/library/ecg/filter/EcgFilter$HrListener;", "hrListener", "Lcom/withings/library/ecg/filter/EcgFilter$HrListener;", "Lcom/withings/library/ecg/filter/v2/NativeEcgFilterV2;", "nativeEcgFilterV2", "Lcom/withings/library/ecg/filter/v2/NativeEcgFilterV2;", "Lnm0/j;", "", "contextPair", "Lnm0/j;", "Lcom/withings/library/ecg/leads/EcgLeadsProvider;", "ecgLeadsProvider", "Lcom/withings/library/ecg/leads/EcgLeadsProvider;", "shouldFlip", "Z", "gain", "Lcom/withings/library/ecg/WearPosition;", "wearPosition", "<init>", "(IILcom/withings/library/ecg/WearPosition;Lcom/withings/library/ecg/EcgSignalFormat;Lcom/withings/library/ecg/filter/EcgFilter$HrListener;)V", "ecg-library_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes4.dex */
public final class EcgFilterV2 implements EcgFilter.InternalEcgFilter {
    private final j<Long, Long> contextPair;
    private final EcgLeadsProvider ecgLeadsProvider;
    private final EcgSignalFormat ecgSignalFormat;
    private final int frequency;
    private final EcgFilter.HrListener hrListener;
    private final NativeEcgFilterV2 nativeEcgFilterV2;
    private final boolean shouldFlip;

    public EcgFilterV2(int i11, int i12, WearPosition wearPosition, EcgSignalFormat ecgSignalFormat, EcgFilter.HrListener hrListener) {
        u.j(wearPosition, "wearPosition");
        u.j(ecgSignalFormat, "ecgSignalFormat");
        this.frequency = i11;
        this.ecgSignalFormat = ecgSignalFormat;
        this.hrListener = hrListener;
        NativeEcgFilterV2 nativeEcgFilterV2 = new NativeEcgFilterV2();
        this.nativeEcgFilterV2 = nativeEcgFilterV2;
        this.contextPair = nativeEcgFilterV2.init(i11, i12);
        this.ecgLeadsProvider = new EcgLeadsProvider(i11, i12);
        this.shouldFlip = wearPosition == WearPosition.WRIST_RIGHT;
    }

    private final int[] flipSignal(int[] iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i11 : iArr) {
            arrayList.add(Integer.valueOf(i11 * (-1)));
        }
        return x.P0(arrayList);
    }

    @Override // com.withings.library.ecg.filter.EcgFilter.InternalEcgFilter
    public void clean() {
        this.nativeEcgFilterV2.finish(this.contextPair.c().longValue(), this.contextPair.d().longValue());
    }

    @Override // com.withings.library.ecg.filter.EcgFilter.InternalEcgFilter
    public Map<EcgLeadType, int[]> filterBatch(byte[] values) {
        int[] filtered;
        u.j(values, "values");
        Object obj = EcgLeadsProvider.computeLeads$default(this.ecgLeadsProvider, new EcgSignal(values, EcgSignalType.DI, this.ecgSignalFormat), false, 2, null).get(EcgLeadType.DI);
        u.g(obj);
        List<Number> V = l.V((short[]) obj, this.frequency * 30);
        ArrayList arrayList = new ArrayList(x.y(V, 10));
        for (Number number : V) {
            arrayList.add(Integer.valueOf(number.shortValue()));
        }
        BatchResult filterBatch = this.nativeEcgFilterV2.filterBatch(this.contextPair.c().longValue(), this.contextPair.d().longValue(), x.P0(arrayList));
        EcgFilter.HrListener hrListener = this.hrListener;
        if (hrListener != null) {
            hrListener.onHrReceived(filterBatch.getHr());
        }
        if (this.shouldFlip) {
            filtered = flipSignal(filterBatch.getFiltered());
        } else {
            filtered = filterBatch.getFiltered();
        }
        return s0.i(new j(EcgLeadType.DI, filtered));
    }

    @Override // com.withings.library.ecg.filter.EcgFilter.InternalEcgFilter
    public Map<EcgLeadType, int[]> filterValues(byte[] values, boolean z5) {
        u.j(values, "values");
        Object obj = EcgLeadsProvider.computeLeads$default(this.ecgLeadsProvider, new EcgSignal(values, EcgSignalType.DI, this.ecgSignalFormat), false, 2, null).get(EcgLeadType.DI);
        u.g(obj);
        List<Number> V = l.V((short[]) obj, this.frequency * 30);
        ArrayList arrayList = new ArrayList(x.y(V, 10));
        for (Number number : V) {
            arrayList.add(Integer.valueOf(number.shortValue()));
        }
        int[] filterAll = this.nativeEcgFilterV2.filterAll(this.contextPair.c().longValue(), this.contextPair.d().longValue(), x.P0(arrayList));
        if (this.shouldFlip) {
            filterAll = flipSignal(filterAll);
        }
        return s0.i(new j(EcgLeadType.DI, filterAll));
    }

    public /* synthetic */ EcgFilterV2(int i11, int i12, WearPosition wearPosition, EcgSignalFormat ecgSignalFormat, EcgFilter.HrListener hrListener, int i13, m mVar) {
        this(i11, i12, wearPosition, ecgSignalFormat, (i13 & 16) != 0 ? null : hrListener);
    }
}
