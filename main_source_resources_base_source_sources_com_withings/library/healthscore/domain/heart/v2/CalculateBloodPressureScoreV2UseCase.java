package com.withings.library.healthscore.domain.heart.v2;

import com.withings.library.healthscore.domain.interfaces.BloodPressureBurdenScoreInterface;
import com.withings.library.healthscore.domain.interfaces.BloodPressureEngagementScoreInterface;
import com.withings.library.healthscore.domain.interfaces.BloodPressureScoreInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: CalculateBloodPressureScoreV2UseCase.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J8\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/withings/library/healthscore/domain/heart/v2/CalculateBloodPressureScoreV2UseCase;", "Lcom/withings/library/healthscore/domain/interfaces/BloodPressureScoreInterface;", "calculateBloodPressureEngagementScoreV2UseCase", "Lcom/withings/library/healthscore/domain/interfaces/BloodPressureEngagementScoreInterface;", "calculateBloodPressureBurdenScoreV2UseCase", "Lcom/withings/library/healthscore/domain/interfaces/BloodPressureBurdenScoreInterface;", "(Lcom/withings/library/healthscore/domain/interfaces/BloodPressureEngagementScoreInterface;Lcom/withings/library/healthscore/domain/interfaces/BloodPressureBurdenScoreInterface;)V", "getBloodPressureScore", "Lcom/withings/library/healthscore/models/BloodPressureScores;", "isUsCountry", "", "bloodPressures", "", "Lcom/withings/library/healthscore/models/api/BloodPressureMeasureGroup;", "dateOfScore", "", "numberOfWeeksToProcess", "", "hasBloodPressureData", "HealthScore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CalculateBloodPressureScoreV2UseCase implements BloodPressureScoreInterface {
    private final BloodPressureBurdenScoreInterface calculateBloodPressureBurdenScoreV2UseCase;
    private final BloodPressureEngagementScoreInterface calculateBloodPressureEngagementScoreV2UseCase;

    public CalculateBloodPressureScoreV2UseCase(BloodPressureEngagementScoreInterface calculateBloodPressureEngagementScoreV2UseCase, BloodPressureBurdenScoreInterface calculateBloodPressureBurdenScoreV2UseCase) {
        u.j(calculateBloodPressureEngagementScoreV2UseCase, "calculateBloodPressureEngagementScoreV2UseCase");
        u.j(calculateBloodPressureBurdenScoreV2UseCase, "calculateBloodPressureBurdenScoreV2UseCase");
        this.calculateBloodPressureEngagementScoreV2UseCase = calculateBloodPressureEngagementScoreV2UseCase;
        this.calculateBloodPressureBurdenScoreV2UseCase = calculateBloodPressureBurdenScoreV2UseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0103 A[SYNTHETIC] */
    @Override // com.withings.library.healthscore.domain.interfaces.BloodPressureScoreInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.withings.library.healthscore.models.BloodPressureScores getBloodPressureScore(boolean r14, java.util.List<com.withings.library.healthscore.models.api.BloodPressureMeasureGroup> r15, long r16, int r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.healthscore.domain.heart.v2.CalculateBloodPressureScoreV2UseCase.getBloodPressureScore(boolean, java.util.List, long, int, boolean):com.withings.library.healthscore.models.BloodPressureScores");
    }
}
