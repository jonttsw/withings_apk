package com.withings.library.healthscore.domain.body.v2;

import com.withings.library.healthscore.domain.body.ComputeBmiUseCase;
import com.withings.library.healthscore.domain.interfaces.BMIScoreInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: CalculateBMIScoreV2UseCase.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0002\u0010\tJ\u0015\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/withings/library/healthscore/domain/body/v2/CalculateBMIScoreV2UseCase;", "Lcom/withings/library/healthscore/domain/interfaces/BMIScoreInterface;", "computeBmiUseCase", "Lcom/withings/library/healthscore/domain/body/ComputeBmiUseCase;", "(Lcom/withings/library/healthscore/domain/body/ComputeBmiUseCase;)V", "getBMIScore", "", "heightInMeter", "weightInKilogram", "(DD)Ljava/lang/Double;", "getScoreFromBmi", "bmi", "(D)Ljava/lang/Double;", "HealthScore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CalculateBMIScoreV2UseCase implements BMIScoreInterface {
    private final ComputeBmiUseCase computeBmiUseCase;

    public CalculateBMIScoreV2UseCase(ComputeBmiUseCase computeBmiUseCase) {
        u.j(computeBmiUseCase, "computeBmiUseCase");
        this.computeBmiUseCase = computeBmiUseCase;
    }

    @Override // com.withings.library.healthscore.domain.interfaces.BMIScoreInterface
    public Double getBMIScore(double d11, double d12) {
        return getScoreFromBmi(this.computeBmiUseCase.execute(d11, d12));
    }

    public final Double getScoreFromBmi(double d11) {
        if (d11 >= 14.0d && d11 <= 80.0d) {
            if (d11 < 18.5d) {
                return Double.valueOf(((d11 - 10.0d) * 9.411764705882353d) + 20.0d);
            }
            if (d11 < 25.0d) {
                return Double.valueOf(100.0d);
            }
            if (d11 < 30.0d) {
                return Double.valueOf(100.0d - ((d11 - 25.0d) * 10));
            }
            if (d11 < 50.0d) {
                return Double.valueOf(50.0d - ((d11 - 30.0d) * 1.5d));
            }
            return Double.valueOf(20.0d);
        }
        return null;
    }
}
