package com.withings.library.healthscore.domain.interfaces;

import kotlin.Metadata;
/* compiled from: ComputeBMIScoreInterface.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H&¨\u0006\u0006"}, d2 = {"Lcom/withings/library/healthscore/domain/interfaces/ComputeBMIScoreInterface;", "", "execute", "", "heightInMeter", "weightInKilogram", "HealthScore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ComputeBMIScoreInterface {
    double execute(double d11, double d12);
}
