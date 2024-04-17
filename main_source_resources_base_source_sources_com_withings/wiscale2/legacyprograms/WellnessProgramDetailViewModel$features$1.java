package com.withings.wiscale2.legacyprograms;

import com.withings.programs.model.program.FeatureDomain;
import com.withings.programs.model.program.ProgramDomain;
import com.withings.programs.model.program.SpecificsDomain;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import ym0.l;
/* compiled from: WellnessProgramDetailsActivity.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/withings/programs/model/program/ProgramDomain$LegacyDomain;", "it", "", "Lcom/withings/programs/model/program/FeatureDomain;", "invoke", "(Lcom/withings/programs/model/program/ProgramDomain$LegacyDomain;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class WellnessProgramDetailViewModel$features$1 extends w implements l<ProgramDomain.LegacyDomain, List<FeatureDomain>> {
    public static final WellnessProgramDetailViewModel$features$1 INSTANCE = new WellnessProgramDetailViewModel$features$1();

    WellnessProgramDetailViewModel$features$1() {
        super(1);
    }

    @Override // ym0.l
    public final List<FeatureDomain> invoke(ProgramDomain.LegacyDomain legacyDomain) {
        SpecificsDomain specifics;
        if (legacyDomain == null || (specifics = legacyDomain.getSpecifics()) == null) {
            return null;
        }
        return specifics.getFeatures();
    }
}
