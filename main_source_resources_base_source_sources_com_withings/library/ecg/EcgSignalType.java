package com.withings.library.ecg;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum DI uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:289)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: EcgSignalType.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B+\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/withings/library/ecg/EcgSignalType;", "", "includedLeads", "", "Lcom/withings/library/ecg/EcgLeadType;", "filteredLeads", "diagnosticLead", "(Ljava/lang/String;ILjava/util/List;Ljava/util/List;Lcom/withings/library/ecg/EcgLeadType;)V", "getDiagnosticLead", "()Lcom/withings/library/ecg/EcgLeadType;", "getFilteredLeads", "()Ljava/util/List;", "getIncludedLeads", "DI", "DI_FILTERED", "DI_DI_FILTERED", "DII_DIII", "DII_DIII_FILTERED", "ecg-library_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EcgSignalType {
    private static final /* synthetic */ EcgSignalType[] $VALUES;
    public static final EcgSignalType DI;
    public static final EcgSignalType DII_DIII;
    public static final EcgSignalType DII_DIII_FILTERED;
    public static final EcgSignalType DI_DI_FILTERED;
    public static final EcgSignalType DI_FILTERED;
    private final EcgLeadType diagnosticLead;
    private final List<EcgLeadType> filteredLeads;
    private final List<EcgLeadType> includedLeads;

    private static final /* synthetic */ EcgSignalType[] $values() {
        return new EcgSignalType[]{DI, DI_FILTERED, DI_DI_FILTERED, DII_DIII, DII_DIII_FILTERED};
    }

    static {
        EcgLeadType ecgLeadType = EcgLeadType.DI;
        DI = new EcgSignalType("DI", 0, x.V(ecgLeadType), x.V(ecgLeadType), ecgLeadType);
        EcgLeadType ecgLeadType2 = EcgLeadType.DI_FILTERED;
        DI_FILTERED = new EcgSignalType("DI_FILTERED", 1, x.V(ecgLeadType2), x.V(ecgLeadType), ecgLeadType);
        DI_DI_FILTERED = new EcgSignalType("DI_DI_FILTERED", 2, x.W(ecgLeadType, ecgLeadType2), x.V(ecgLeadType), ecgLeadType);
        EcgLeadType ecgLeadType3 = EcgLeadType.DII;
        EcgLeadType ecgLeadType4 = EcgLeadType.DIII;
        List W = x.W(ecgLeadType3, ecgLeadType4);
        EcgLeadType ecgLeadType5 = EcgLeadType.AVF;
        EcgLeadType ecgLeadType6 = EcgLeadType.AVR;
        EcgLeadType ecgLeadType7 = EcgLeadType.AVL;
        DII_DIII = new EcgSignalType("DII_DIII", 3, W, x.W(ecgLeadType, ecgLeadType3, ecgLeadType4, ecgLeadType5, ecgLeadType6, ecgLeadType7), ecgLeadType);
        DII_DIII_FILTERED = new EcgSignalType("DII_DIII_FILTERED", 4, x.W(ecgLeadType3, EcgLeadType.DII_FILTERED, ecgLeadType4, EcgLeadType.DIII_FILTERED), x.W(ecgLeadType, ecgLeadType3, ecgLeadType4, ecgLeadType5, ecgLeadType6, ecgLeadType7), ecgLeadType);
        $VALUES = $values();
    }

    private EcgSignalType(String str, int i11, List list, List list2, EcgLeadType ecgLeadType) {
        this.includedLeads = list;
        this.filteredLeads = list2;
        this.diagnosticLead = ecgLeadType;
    }

    public static EcgSignalType valueOf(String str) {
        return (EcgSignalType) Enum.valueOf(EcgSignalType.class, str);
    }

    public static EcgSignalType[] values() {
        return (EcgSignalType[]) $VALUES.clone();
    }

    public final EcgLeadType getDiagnosticLead() {
        return this.diagnosticLead;
    }

    public final List<EcgLeadType> getFilteredLeads() {
        return this.filteredLeads;
    }

    public final List<EcgLeadType> getIncludedLeads() {
        return this.includedLeads;
    }
}
