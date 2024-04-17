package com.withings.library.ecg.leads;

import com.withings.library.ecg.EcgLeadType;
import com.withings.library.ecg.EcgSignal;
import com.withings.library.ecg.EcgSignalType;
import com.withings.library.ecg.parser.EcgSampleParser;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.s0;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import nm0.j;
/* compiled from: EcgLeadsProvider.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J$\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011J4\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\rH\u0002J\u0018\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b*\u00020\u0017H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/withings/library/ecg/leads/EcgLeadsProvider;", "", "frequency", "", "gain", "(II)V", "ecgSampleParser", "Lcom/withings/library/ecg/parser/EcgSampleParser;", "nativeEcgLeadsProvider", "Lcom/withings/library/ecg/leads/NativeEcgLeadsProvider;", "computeLeads", "", "Lcom/withings/library/ecg/EcgLeadType;", "", "ecgSignal", "Lcom/withings/library/ecg/EcgSignal;", "chunkLost", "", "computeLeadsFromDIIDIII", "dII", "dIII", "computeLeadsFromDIIDIIIFiltered", "extractLeads", "Lcom/withings/library/ecg/leads/ComputeResult;", "ecg-library_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EcgLeadsProvider {
    private final int frequency;
    private final int gain;
    private final NativeEcgLeadsProvider nativeEcgLeadsProvider = new NativeEcgLeadsProvider();
    private final EcgSampleParser ecgSampleParser = new EcgSampleParser();

    /* compiled from: EcgLeadsProvider.kt */
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

    public EcgLeadsProvider(int i11, int i12) {
        this.frequency = i11;
        this.gain = i12;
    }

    public static /* synthetic */ Map computeLeads$default(EcgLeadsProvider ecgLeadsProvider, EcgSignal ecgSignal, boolean z5, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z5 = false;
        }
        return ecgLeadsProvider.computeLeads(ecgSignal, z5);
    }

    private final Map<EcgLeadType, short[]> computeLeadsFromDIIDIII(short[] sArr, short[] sArr2, int i11, int i12) {
        return extractLeads(this.nativeEcgLeadsProvider.computeLeadsFromdIIdIII(i11, i12, sArr, sArr2));
    }

    private final Map<EcgLeadType, short[]> computeLeadsFromDIIDIIIFiltered(short[] sArr, short[] sArr2) {
        int min = Math.min(sArr.length, sArr2.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i11 = 0; i11 < min; i11++) {
            arrayList.add(Short.valueOf((short) (sArr[i11] - sArr2[i11])));
        }
        short[] V0 = x.V0(arrayList);
        j[] jVarArr = new j[6];
        jVarArr[0] = new j(EcgLeadType.DI, V0);
        jVarArr[1] = new j(EcgLeadType.DII, sArr);
        jVarArr[2] = new j(EcgLeadType.DIII, sArr2);
        EcgLeadType ecgLeadType = EcgLeadType.AVR;
        int min2 = Math.min(V0.length, sArr.length);
        ArrayList arrayList2 = new ArrayList(min2);
        for (int i12 = 0; i12 < min2; i12++) {
            arrayList2.add(Short.valueOf((short) (((-V0[i12]) / 2) - (sArr[i12] / 2))));
        }
        jVarArr[3] = new j(ecgLeadType, x.V0(arrayList2));
        EcgLeadType ecgLeadType2 = EcgLeadType.AVL;
        int min3 = Math.min(sArr.length, sArr2.length);
        ArrayList arrayList3 = new ArrayList(min3);
        for (int i13 = 0; i13 < min3; i13++) {
            arrayList3.add(Short.valueOf((short) (V0[i13] - (sArr[i13] / 2))));
        }
        jVarArr[4] = new j(ecgLeadType2, x.V0(arrayList3));
        EcgLeadType ecgLeadType3 = EcgLeadType.AVF;
        int min4 = Math.min(sArr.length, V0.length);
        ArrayList arrayList4 = new ArrayList(min4);
        for (int i14 = 0; i14 < min4; i14++) {
            arrayList4.add(Short.valueOf((short) (sArr[i14] - (V0[i14] / 2))));
        }
        jVarArr[5] = new j(ecgLeadType3, x.V0(arrayList4));
        return s0.j(jVarArr);
    }

    private final Map<EcgLeadType, short[]> extractLeads(ComputeResult computeResult) {
        return s0.j(new j(EcgLeadType.DI, computeResult.getDI()), new j(EcgLeadType.DII, computeResult.getDII()), new j(EcgLeadType.DIII, computeResult.getDIII()), new j(EcgLeadType.AVR, computeResult.getAVR()), new j(EcgLeadType.AVL, computeResult.getAVL()), new j(EcgLeadType.AVF, computeResult.getAVF()));
    }

    public final Map<EcgLeadType, short[]> computeLeads(EcgSignal ecgSignal, boolean z5) {
        u.j(ecgSignal, "ecgSignal");
        Map<EcgLeadType, short[]> samplesByLead = this.ecgSampleParser.getSamplesByLead(ecgSignal, z5);
        int i11 = WhenMappings.$EnumSwitchMapping$0[ecgSignal.getSignalType().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4 && i11 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    EcgLeadType ecgLeadType = EcgLeadType.DI;
                    short[] sArr = samplesByLead.get(EcgLeadType.DI_FILTERED);
                    u.g(sArr);
                    return s0.i(new j(ecgLeadType, sArr));
                }
                short[] sArr2 = samplesByLead.get(EcgLeadType.DII_FILTERED);
                u.g(sArr2);
                short[] sArr3 = samplesByLead.get(EcgLeadType.DIII_FILTERED);
                u.g(sArr3);
                return computeLeadsFromDIIDIIIFiltered(sArr2, sArr3);
            }
            short[] sArr4 = samplesByLead.get(EcgLeadType.DII);
            u.g(sArr4);
            short[] sArr5 = samplesByLead.get(EcgLeadType.DIII);
            u.g(sArr5);
            return computeLeadsFromDIIDIII(sArr4, sArr5, this.frequency, this.gain);
        }
        return samplesByLead;
    }
}
