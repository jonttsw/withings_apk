package com.withings.library.healthscore.domain.body;

import com.withings.library.healthscore.domain.interfaces.BMIScoreInterface;
import com.withings.library.healthscore.domain.interfaces.BodyCompositionScoreInterface;
import com.withings.library.healthscore.domain.interfaces.BodyScoreInterface;
import com.withings.library.healthscore.domain.interfaces.WeightEngagementScoreInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: CalculateBodyScoreUseCase.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJU\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0002\u0010\u0019R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/withings/library/healthscore/domain/body/CalculateBodyScoreUseCase;", "Lcom/withings/library/healthscore/domain/interfaces/BodyScoreInterface;", "calculateWeightEngagementScoreV2UseCase", "Lcom/withings/library/healthscore/domain/interfaces/WeightEngagementScoreInterface;", "calculateBodyCompositionScoreV2UseCase", "Lcom/withings/library/healthscore/domain/interfaces/BodyCompositionScoreInterface;", "calculateBMIScoreV2UseCase", "Lcom/withings/library/healthscore/domain/interfaces/BMIScoreInterface;", "(Lcom/withings/library/healthscore/domain/interfaces/WeightEngagementScoreInterface;Lcom/withings/library/healthscore/domain/interfaces/BodyCompositionScoreInterface;Lcom/withings/library/healthscore/domain/interfaces/BMIScoreInterface;)V", "getBodyScore", "Lcom/withings/library/healthscore/models/HSResult;", "Lcom/withings/library/healthscore/models/BodyScores;", "userInfo", "Lcom/withings/library/healthscore/models/api/UserInfo;", "heightInMeter", "", "weights", "", "Lcom/withings/library/healthscore/models/api/WeightMeasureGroup;", "numberOfWeekOfTheAcquisition", "", "dateOfScoreInMillis", "", "lastBodyData", "previousBodyScore", "(Lcom/withings/library/healthscore/models/api/UserInfo;DLjava/util/List;IJLcom/withings/library/healthscore/models/api/WeightMeasureGroup;Ljava/lang/Double;)Lcom/withings/library/healthscore/models/HSResult;", "HealthScore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CalculateBodyScoreUseCase implements BodyScoreInterface {
    private final BMIScoreInterface calculateBMIScoreV2UseCase;
    private final BodyCompositionScoreInterface calculateBodyCompositionScoreV2UseCase;
    private final WeightEngagementScoreInterface calculateWeightEngagementScoreV2UseCase;

    public CalculateBodyScoreUseCase(WeightEngagementScoreInterface calculateWeightEngagementScoreV2UseCase, BodyCompositionScoreInterface calculateBodyCompositionScoreV2UseCase, BMIScoreInterface calculateBMIScoreV2UseCase) {
        u.j(calculateWeightEngagementScoreV2UseCase, "calculateWeightEngagementScoreV2UseCase");
        u.j(calculateBodyCompositionScoreV2UseCase, "calculateBodyCompositionScoreV2UseCase");
        u.j(calculateBMIScoreV2UseCase, "calculateBMIScoreV2UseCase");
        this.calculateWeightEngagementScoreV2UseCase = calculateWeightEngagementScoreV2UseCase;
        this.calculateBodyCompositionScoreV2UseCase = calculateBodyCompositionScoreV2UseCase;
        this.calculateBMIScoreV2UseCase = calculateBMIScoreV2UseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010e A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:4:0x0012, B:6:0x001e, B:7:0x0026, B:9:0x002c, B:15:0x003e, B:21:0x004d, B:23:0x0053, B:26:0x006a, B:29:0x0076, B:31:0x0089, B:33:0x0091, B:35:0x009a, B:37:0x00b1, B:40:0x00b9, B:42:0x00cd, B:46:0x00de, B:55:0x00f3, B:60:0x010e, B:62:0x011c, B:64:0x0122, B:66:0x0135, B:68:0x0144, B:70:0x014f, B:71:0x015d, B:72:0x0168, B:49:0x00e7, B:34:0x0096, B:16:0x0041, B:73:0x0175), top: B:77:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0122 A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:4:0x0012, B:6:0x001e, B:7:0x0026, B:9:0x002c, B:15:0x003e, B:21:0x004d, B:23:0x0053, B:26:0x006a, B:29:0x0076, B:31:0x0089, B:33:0x0091, B:35:0x009a, B:37:0x00b1, B:40:0x00b9, B:42:0x00cd, B:46:0x00de, B:55:0x00f3, B:60:0x010e, B:62:0x011c, B:64:0x0122, B:66:0x0135, B:68:0x0144, B:70:0x014f, B:71:0x015d, B:72:0x0168, B:49:0x00e7, B:34:0x0096, B:16:0x0041, B:73:0x0175), top: B:77:0x0010 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0168 A[Catch: Exception -> 0x003a, TryCatch #0 {Exception -> 0x003a, blocks: (B:4:0x0012, B:6:0x001e, B:7:0x0026, B:9:0x002c, B:15:0x003e, B:21:0x004d, B:23:0x0053, B:26:0x006a, B:29:0x0076, B:31:0x0089, B:33:0x0091, B:35:0x009a, B:37:0x00b1, B:40:0x00b9, B:42:0x00cd, B:46:0x00de, B:55:0x00f3, B:60:0x010e, B:62:0x011c, B:64:0x0122, B:66:0x0135, B:68:0x0144, B:70:0x014f, B:71:0x015d, B:72:0x0168, B:49:0x00e7, B:34:0x0096, B:16:0x0041, B:73:0x0175), top: B:77:0x0010 }] */
    @Override // com.withings.library.healthscore.domain.interfaces.BodyScoreInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.withings.library.healthscore.models.HSResult<com.withings.library.healthscore.models.BodyScores> getBodyScore(com.withings.library.healthscore.models.api.UserInfo r17, double r18, java.util.List<com.withings.library.healthscore.models.api.WeightMeasureGroup> r20, int r21, long r22, com.withings.library.healthscore.models.api.WeightMeasureGroup r24, java.lang.Double r25) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.healthscore.domain.body.CalculateBodyScoreUseCase.getBodyScore(com.withings.library.healthscore.models.api.UserInfo, double, java.util.List, int, long, com.withings.library.healthscore.models.api.WeightMeasureGroup, java.lang.Double):com.withings.library.healthscore.models.HSResult");
    }
}
