package com.withings.library.healthscore.domain.body;

import com.withings.library.healthscore.domain.interfaces.ComputeBMIScoreInterface;
import kotlin.Metadata;
/* compiled from: ComputeBmiUseCase.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, d2 = {"Lcom/withings/library/healthscore/domain/body/ComputeBmiUseCase;", "Lcom/withings/library/healthscore/domain/interfaces/ComputeBMIScoreInterface;", "()V", "execute", "", "heightInMeter", "weightInKilogram", "HealthScore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComputeBmiUseCase implements ComputeBMIScoreInterface {
    @Override // com.withings.library.healthscore.domain.interfaces.ComputeBMIScoreInterface
    public double execute(double d11, double d12) {
        return d12 / (d11 * d11);
    }
}
