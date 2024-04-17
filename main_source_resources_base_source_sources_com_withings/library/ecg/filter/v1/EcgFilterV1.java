package com.withings.library.ecg.filter.v1;

import co.touchlab.kermit.Severity;
import com.google.android.gms.fitness.data.WorkoutExercises;
import com.withings.library.ecg.EcgLeadType;
import com.withings.library.ecg.EcgSignal;
import com.withings.library.ecg.EcgSignalFormat;
import com.withings.library.ecg.EcgSignalType;
import com.withings.library.ecg.WearPosition;
import com.withings.library.ecg.filter.EcgFilter;
import com.withings.library.ecg.leads.EcgLeadsProvider;
import com.withings.library.ecg.parser.decompressor.DecompressionException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.x;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import v9.e;
/* compiled from: EcgFilterV1.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0017\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u00018BK\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u0010 \u001a\u00020\u001c\u0012\u0006\u0010!\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010&\u001a\u00020%\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b6\u00107J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000b*\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\f\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0014\u0010 \u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0014\u0010!\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001eR\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u001c8\u0002X\u0082D¢\u0006\u0006\n\u0004\b(\u0010\u001eR\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R \u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020-0,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00103¨\u00069"}, d2 = {"Lcom/withings/library/ecg/filter/v1/EcgFilterV1;", "Lcom/withings/library/ecg/filter/EcgFilter$InternalEcgFilter;", "Lcom/withings/library/ecg/EcgLeadType;", "leadType", "", "shouldFlip", "Lcom/withings/library/ecg/filter/EcgFilter$HrListener;", "hrListener", "Lnm0/y;", "addFilterContext", "(Lcom/withings/library/ecg/EcgLeadType;ZLcom/withings/library/ecg/filter/EcgFilter$HrListener;)V", "", "values", "filterRawValues", "(Lcom/withings/library/ecg/EcgLeadType;[S)[S", "nativeFilterRawValues", "flipSignal", "([S)[S", "", "chunkLost", "", "", "filterValues", "([BZ)Ljava/util/Map;", "filterBatch", "([B)Ljava/util/Map;", WorkoutExercises.CLEAN, "()V", "", "frequency", "I", "nbSample", "gain", "deviceModel", "Lcom/withings/library/ecg/EcgSignalFormat;", "ecgSignalFormat", "Lcom/withings/library/ecg/EcgSignalFormat;", "Lcom/withings/library/ecg/EcgSignalType;", "ecgSignalType", "Lcom/withings/library/ecg/EcgSignalType;", "medicalMode", "Lcom/withings/library/ecg/filter/v1/NativeEcgFilter;", "nativeEcgFilter", "Lcom/withings/library/ecg/filter/v1/NativeEcgFilter;", "", "", "contextMap", "Ljava/util/Map;", "Lcom/withings/library/ecg/leads/EcgLeadsProvider;", "ecgLeadsProvider", "Lcom/withings/library/ecg/leads/EcgLeadsProvider;", "Z", "Lcom/withings/library/ecg/WearPosition;", "wearPosition", "<init>", "(IILcom/withings/library/ecg/WearPosition;IILcom/withings/library/ecg/EcgSignalFormat;Lcom/withings/library/ecg/EcgSignalType;Lcom/withings/library/ecg/filter/EcgFilter$HrListener;)V", "FlipMode", "ecg-library_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes4.dex */
public final class EcgFilterV1 implements EcgFilter.InternalEcgFilter {
    private final Map<EcgLeadType, Long> contextMap;
    private final int deviceModel;
    private final EcgLeadsProvider ecgLeadsProvider;
    private final EcgSignalFormat ecgSignalFormat;
    private final EcgSignalType ecgSignalType;
    private final int frequency;
    private final int gain;
    private final int medicalMode;
    private final NativeEcgFilter nativeEcgFilter;
    private final int nbSample;
    private final boolean shouldFlip;

    /* compiled from: EcgFilterV1.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/withings/library/ecg/filter/v1/EcgFilterV1$FlipMode;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "FLIP", "NO_FLIP", "ecg-library_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public enum FlipMode {
        FLIP(1),
        NO_FLIP(0);
        
        private final int value;

        FlipMode(int i11) {
            this.value = i11;
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* compiled from: EcgFilterV1.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EcgSignalType.values().length];
            iArr[EcgSignalType.DI.ordinal()] = 1;
            iArr[EcgSignalType.DII_DIII.ordinal()] = 2;
            iArr[EcgSignalType.DII_DIII_FILTERED.ordinal()] = 3;
            iArr[EcgSignalType.DI_DI_FILTERED.ordinal()] = 4;
            iArr[EcgSignalType.DI_FILTERED.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public EcgFilterV1(int i11, int i12, WearPosition wearPosition, int i13, int i14, EcgSignalFormat ecgSignalFormat, EcgSignalType ecgSignalType, EcgFilter.HrListener hrListener) {
        u.j(wearPosition, "wearPosition");
        u.j(ecgSignalFormat, "ecgSignalFormat");
        u.j(ecgSignalType, "ecgSignalType");
        this.frequency = i11;
        this.nbSample = i12;
        this.gain = i13;
        this.deviceModel = i14;
        this.ecgSignalFormat = ecgSignalFormat;
        this.ecgSignalType = ecgSignalType;
        this.medicalMode = 3;
        this.nativeEcgFilter = new NativeEcgFilter();
        this.contextMap = new LinkedHashMap();
        this.ecgLeadsProvider = new EcgLeadsProvider(i11, i13);
        int i15 = 0;
        this.shouldFlip = wearPosition == WearPosition.WRIST_RIGHT;
        for (Object obj : ecgSignalType.getFilteredLeads()) {
            int i16 = i15 + 1;
            EcgFilter.HrListener hrListener2 = null;
            if (i15 >= 0) {
                EcgLeadType ecgLeadType = (EcgLeadType) obj;
                boolean z5 = this.shouldFlip;
                if (i15 == 0) {
                    hrListener2 = hrListener;
                }
                addFilterContext(ecgLeadType, z5, hrListener2);
                i15 = i16;
            } else {
                x.K0();
                throw null;
            }
        }
    }

    private final void addFilterContext(EcgLeadType ecgLeadType, boolean z5, EcgFilter.HrListener hrListener) {
        FlipMode flipMode;
        NativeEcgFilter nativeEcgFilter = this.nativeEcgFilter;
        int i11 = this.frequency;
        int i12 = this.medicalMode;
        int i13 = this.nbSample;
        if (z5) {
            flipMode = FlipMode.FLIP;
        } else {
            flipMode = FlipMode.NO_FLIP;
        }
        this.contextMap.put(ecgLeadType, Long.valueOf(nativeEcgFilter.init(i11, i12, i13, flipMode.getValue(), this.gain, this.deviceModel, hrListener)));
    }

    private final short[] filterRawValues(EcgLeadType ecgLeadType, short[] sArr) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.ecgSignalType.ordinal()];
        if (i11 != 1 && i11 != 2) {
            if (i11 != 3 && i11 != 4 && i11 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            if (this.shouldFlip) {
                return flipSignal(sArr);
            }
            return sArr;
        }
        return nativeFilterRawValues(ecgLeadType, sArr);
    }

    private final short[] flipSignal(short[] sArr) {
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s11 : sArr) {
            arrayList.add(Short.valueOf((short) (s11 * (-1))));
        }
        return x.V0(arrayList);
    }

    private final short[] nativeFilterRawValues(EcgLeadType ecgLeadType, short[] sArr) {
        Long l5 = this.contextMap.get(ecgLeadType);
        if (l5 != null && l5.longValue() != 0) {
            return this.nativeEcgFilter.filterAll(l5.longValue(), this.medicalMode, sArr);
        }
        e.a aVar = e.f103480c;
        Severity a11 = aVar.c().a();
        Severity severity = Severity.f23170d;
        if (a11.compareTo(severity) <= 0) {
            aVar.f(severity, "Kermit", "Ecg filter for lead " + ecgLeadType + " has been initialized with wrong parameters", null);
        }
        return null;
    }

    @Override // com.withings.library.ecg.filter.EcgFilter.InternalEcgFilter
    public void clean() {
        for (Map.Entry<EcgLeadType, Long> entry : this.contextMap.entrySet()) {
            this.nativeEcgFilter.finish(entry.getValue().longValue());
        }
        this.contextMap.clear();
    }

    @Override // com.withings.library.ecg.filter.EcgFilter.InternalEcgFilter
    public Map<EcgLeadType, int[]> filterBatch(byte[] values) {
        u.j(values, "values");
        return EcgFilter.InternalEcgFilter.DefaultImpls.filterValues$default(this, values, false, 2, null);
    }

    @Override // com.withings.library.ecg.filter.EcgFilter.InternalEcgFilter
    public Map<EcgLeadType, int[]> filterValues(byte[] values, boolean z5) throws DecompressionException {
        u.j(values, "values");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<EcgLeadType, short[]> entry : this.ecgLeadsProvider.computeLeads(new EcgSignal(values, this.ecgSignalType, this.ecgSignalFormat), z5).entrySet()) {
            short[] filterRawValues = filterRawValues(entry.getKey(), entry.getValue());
            if (filterRawValues != null) {
                EcgLeadType key = entry.getKey();
                ArrayList arrayList = new ArrayList(filterRawValues.length);
                for (short s11 : filterRawValues) {
                    arrayList.add(Integer.valueOf(s11));
                }
                linkedHashMap.put(key, x.P0(arrayList));
            }
        }
        return linkedHashMap;
    }

    public /* synthetic */ EcgFilterV1(int i11, int i12, WearPosition wearPosition, int i13, int i14, EcgSignalFormat ecgSignalFormat, EcgSignalType ecgSignalType, EcgFilter.HrListener hrListener, int i15, m mVar) {
        this(i11, i12, wearPosition, i13, i14, ecgSignalFormat, ecgSignalType, (i15 & 128) != 0 ? null : hrListener);
    }
}
