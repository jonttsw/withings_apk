package com.withings.library.ecg.parser;

import com.withings.library.ecg.EcgLeadType;
import com.withings.library.ecg.EcgSignal;
import com.withings.library.ecg.EcgSignalFormat;
import com.withings.library.ecg.parser.decompressor.EcgDecompressor;
import cp0.f;
import cp0.j;
import cp0.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.e1;
import kotlin.collections.f1;
import kotlin.collections.m0;
import kotlin.collections.s;
import kotlin.collections.s0;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
import nm0.j;
/* compiled from: EcgSampleParser.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0017\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0005\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0012\u001a\u00020\b2\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/withings/library/ecg/parser/EcgSampleParser;", "", "", "samples", "", "chunkLost", "", "Lcom/withings/library/ecg/EcgLeadType;", "", "decodeDelta", "([BZ)Ljava/util/Map;", "Lcom/withings/library/ecg/EcgSignal;", "ecgSignal", "decodeRaw", "(Lcom/withings/library/ecg/EcgSignal;)Ljava/util/Map;", "", "", "value", "toShort", "(Ljava/util/List;)[S", "getSamplesByLead", "(Lcom/withings/library/ecg/EcgSignal;Z)Ljava/util/Map;", "Lcom/withings/library/ecg/parser/decompressor/EcgDecompressor;", "decompressor$delegate", "Lnm0/g;", "getDecompressor", "()Lcom/withings/library/ecg/parser/decompressor/EcgDecompressor;", "decompressor", "<init>", "()V", "ecg-library_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes4.dex */
public final class EcgSampleParser {
    private final g decompressor$delegate = h.b(EcgSampleParser$decompressor$2.INSTANCE);

    /* compiled from: EcgSampleParser.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EcgSignalFormat.values().length];
            iArr[EcgSignalFormat.DELTA.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final Map<EcgLeadType, short[]> decodeDelta(byte[] bArr, boolean z5) {
        if (z5) {
            getDecompressor().decompressEcgFragLost();
        }
        return s0.i(new j(EcgLeadType.DI, getDecompressor().decompressEcg(bArr)));
    }

    private final Map<EcgLeadType, short[]> decodeRaw(EcgSignal ecgSignal) {
        k sVar;
        int size = ecgSignal.getSignalType().getIncludedLeads().size();
        byte[] raw = ecgSignal.getRaw();
        u.j(raw, "<this>");
        if (raw.length == 0) {
            sVar = f.f63006a;
        } else {
            sVar = new s(raw);
        }
        e1.a(2, 2);
        cp0.j jVar = new cp0.j(new f1(sVar));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = jVar.iterator();
        while (true) {
            j.a aVar = (j.a) it;
            if (!aVar.hasNext()) {
                break;
            }
            Object next = aVar.next();
            EcgLeadType ecgLeadType = ecgSignal.getSignalType().getIncludedLeads().get(((m0) next).c() % size);
            Object obj = linkedHashMap.get(ecgLeadType);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(ecgLeadType, obj);
            }
            ((List) obj).add(next);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(s0.h(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Iterable<m0> iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(x.y(iterable, 10));
            for (m0 m0Var : iterable) {
                arrayList.add((List) m0Var.d());
            }
            linkedHashMap2.put(key, toShort(arrayList));
        }
        return linkedHashMap2;
    }

    private final EcgDecompressor getDecompressor() {
        return (EcgDecompressor) this.decompressor$delegate.getValue();
    }

    public static /* synthetic */ Map getSamplesByLead$default(EcgSampleParser ecgSampleParser, EcgSignal ecgSignal, boolean z5, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z5 = false;
        }
        return ecgSampleParser.getSamplesByLead(ecgSignal, z5);
    }

    private final short[] toShort(List<? extends List<Byte>> list) {
        List<? extends List<Byte>> list2 = list;
        ArrayList<Number> arrayList = new ArrayList(x.y(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            List list3 = (List) it.next();
            arrayList.add(Integer.valueOf((((Number) x.I(list3)).byteValue() & 255) | (((Number) x.T(list3)).byteValue() << 8)));
        }
        ArrayList arrayList2 = new ArrayList(x.y(arrayList, 10));
        for (Number number : arrayList) {
            arrayList2.add(Short.valueOf((short) number.intValue()));
        }
        return x.V0(x.Q0(arrayList2));
    }

    public final Map<EcgLeadType, short[]> getSamplesByLead(EcgSignal ecgSignal, boolean z5) {
        u.j(ecgSignal, "ecgSignal");
        if (WhenMappings.$EnumSwitchMapping$0[ecgSignal.getSignalFormat().ordinal()] == 1) {
            return decodeDelta(ecgSignal.getRaw(), z5);
        }
        return decodeRaw(ecgSignal);
    }
}
