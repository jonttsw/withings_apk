package com.withings.library.ecg.filter;

import com.google.android.gms.fitness.data.WorkoutExercises;
import com.withings.library.ecg.EcgLeadType;
import com.withings.library.ecg.EcgSignalType;
import com.withings.library.ecg.filter.v1.EcgFilterV1;
import com.withings.library.ecg.filter.v2.EcgFilterV2;
import com.withings.library.ecg.parser.decompressor.DecompressionException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.u;
/* compiled from: EcgFilter.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0019"}, d2 = {"Lcom/withings/library/ecg/filter/EcgFilter;", "", "", "values", "", "chunkLost", "", "Lcom/withings/library/ecg/EcgLeadType;", "", "filterValues", "([BZ)Ljava/util/Map;", "filterBatch", "([B)Ljava/util/Map;", "Lnm0/y;", WorkoutExercises.CLEAN, "()V", "Lcom/withings/library/ecg/filter/EcgFilter$InternalEcgFilter;", "internalEcgFilter", "Lcom/withings/library/ecg/filter/EcgFilter$InternalEcgFilter;", "Lcom/withings/library/ecg/filter/EcgFilterConfig;", "ecgFilterConfig", "<init>", "(Lcom/withings/library/ecg/filter/EcgFilterConfig;)V", "HrListener", "InternalEcgFilter", "ecg-library_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes4.dex */
public final class EcgFilter {
    private final InternalEcgFilter internalEcgFilter;

    /* compiled from: EcgFilter.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withings/library/ecg/filter/EcgFilter$HrListener;", "", "", "hrValue", "Lnm0/y;", "onHrReceived", "(I)V", "ecg-library_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes4.dex */
    public interface HrListener {
        void onHrReceived(int i11);
    }

    /* compiled from: EcgFilter.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J-\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/withings/library/ecg/filter/EcgFilter$InternalEcgFilter;", "", "", "values", "", "chunkLost", "", "Lcom/withings/library/ecg/EcgLeadType;", "", "filterValues", "([BZ)Ljava/util/Map;", "filterBatch", "([B)Ljava/util/Map;", "Lnm0/y;", WorkoutExercises.CLEAN, "()V", "ecg-library_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes4.dex */
    public interface InternalEcgFilter {

        /* compiled from: EcgFilter.kt */
        @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class DefaultImpls {
            public static /* synthetic */ Map filterValues$default(InternalEcgFilter internalEcgFilter, byte[] bArr, boolean z5, int i11, Object obj) throws DecompressionException {
                if (obj == null) {
                    if ((i11 & 2) != 0) {
                        z5 = false;
                    }
                    return internalEcgFilter.filterValues(bArr, z5);
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: filterValues");
            }
        }

        void clean();

        Map<EcgLeadType, int[]> filterBatch(byte[] bArr) throws DecompressionException;

        Map<EcgLeadType, int[]> filterValues(byte[] bArr, boolean z5) throws DecompressionException;
    }

    /* compiled from: EcgFilter.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EcgSignalType.values().length];
            iArr[EcgSignalType.DI.ordinal()] = 1;
            iArr[EcgSignalType.DI_DI_FILTERED.ordinal()] = 2;
            iArr[EcgSignalType.DII_DIII.ordinal()] = 3;
            iArr[EcgSignalType.DII_DIII_FILTERED.ordinal()] = 4;
            iArr[EcgSignalType.DI_FILTERED.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public EcgFilter(EcgFilterConfig ecgFilterConfig) {
        InternalEcgFilter ecgFilterV2;
        u.j(ecgFilterConfig, "ecgFilterConfig");
        int i11 = WhenMappings.$EnumSwitchMapping$0[ecgFilterConfig.getEcgSignalType().ordinal()];
        if (i11 != 1) {
            if (i11 != 2 && i11 != 3 && i11 != 4 && i11 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            ecgFilterV2 = new EcgFilterV1(ecgFilterConfig.getFrequency(), ecgFilterConfig.getNbSample(), ecgFilterConfig.getWearPosition(), ecgFilterConfig.getGain(), ecgFilterConfig.getDeviceModel(), ecgFilterConfig.getEcgSignalFormat(), ecgFilterConfig.getEcgSignalType(), ecgFilterConfig.getHrListener());
        } else {
            ecgFilterV2 = new EcgFilterV2(ecgFilterConfig.getFrequency(), ecgFilterConfig.getGain(), ecgFilterConfig.getWearPosition(), ecgFilterConfig.getEcgSignalFormat(), ecgFilterConfig.getHrListener());
        }
        this.internalEcgFilter = ecgFilterV2;
    }

    public static /* synthetic */ Map filterValues$default(EcgFilter ecgFilter, byte[] bArr, boolean z5, int i11, Object obj) throws DecompressionException {
        if ((i11 & 2) != 0) {
            z5 = false;
        }
        return ecgFilter.filterValues(bArr, z5);
    }

    public final void clean() {
        this.internalEcgFilter.clean();
    }

    public final Map<EcgLeadType, int[]> filterBatch(byte[] values) throws DecompressionException {
        u.j(values, "values");
        return this.internalEcgFilter.filterBatch(values);
    }

    public final Map<EcgLeadType, int[]> filterValues(byte[] values, boolean z5) throws DecompressionException {
        u.j(values, "values");
        return this.internalEcgFilter.filterValues(values, z5);
    }
}
