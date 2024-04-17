package com.withings.ecg.details;

import com.withings.ecg.graph.EcgEntry;
import com.withings.library.ecg.EcgLeadType;
import java.util.List;
import java.util.Map;
/* compiled from: EcgDetailsFragment.kt */
/* loaded from: classes3.dex */
final class i0 extends kotlin.jvm.internal.w implements ym0.l<EcgLeadType, List<EcgEntry>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Map<EcgLeadType, List<EcgEntry>> f38236a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Map<EcgLeadType, List<EcgEntry>> map) {
        super(1);
        this.f38236a = map;
    }

    @Override // ym0.l
    public final List<EcgEntry> invoke(EcgLeadType ecgLeadType) {
        EcgLeadType ecgLeadType2 = ecgLeadType;
        if (ecgLeadType2 == null) {
            ecgLeadType2 = EcgLeadType.DI;
        }
        List<EcgEntry> list = this.f38236a.get(ecgLeadType2);
        if (list == null) {
            return kotlin.collections.i0.f76187a;
        }
        return list;
    }
}
