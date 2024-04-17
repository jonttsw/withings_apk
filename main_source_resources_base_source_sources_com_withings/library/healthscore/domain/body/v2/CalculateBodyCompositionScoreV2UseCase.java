package com.withings.library.healthscore.domain.body.v2;

import com.withings.library.healthscore.domain.interfaces.BodyCompositionScoreInterface;
import kotlin.Metadata;
/* compiled from: CalculateBodyCompositionScoreV2UseCase.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J'\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/healthscore/domain/body/v2/CalculateBodyCompositionScoreV2UseCase;", "Lcom/withings/library/healthscore/domain/interfaces/BodyCompositionScoreInterface;", "()V", "getBodyCompositionScore", "", "isBornGenderFemale", "", "age", "", "lastFatMassPercentage", "(ZID)Ljava/lang/Double;", "HealthScore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CalculateBodyCompositionScoreV2UseCase implements BodyCompositionScoreInterface {
    @Override // com.withings.library.healthscore.domain.interfaces.BodyCompositionScoreInterface
    public Double getBodyCompositionScore(boolean z5, int i11, double d11) {
        if (d11 >= 5.0d && d11 < 80.0d && i11 > 0) {
            if (!z5) {
                if (i11 < 40) {
                    if (d11 < 7.0d) {
                        return Double.valueOf(((d11 - 5.0d) * 25.0d) + 50.0d);
                    }
                    if (d11 >= 7.0d && d11 < 20.0d) {
                        return Double.valueOf(100.0d);
                    }
                    if (d11 >= 20.0d && d11 < 25.0d) {
                        return Double.valueOf(100.0d - ((d11 - 20) * 10.0d));
                    }
                    if (d11 >= 25.0d && d11 < 50.0d) {
                        return Double.valueOf(50.0d - ((d11 - 25) * 1.2d));
                    }
                    return Double.valueOf(20.0d);
                } else if (40 <= i11 && i11 < 60) {
                    if (d11 < 10.0d) {
                        return Double.valueOf(((d11 - 5.0d) * 10.0d) + 50.0d);
                    }
                    if (d11 >= 10.0d && d11 < 22.0d) {
                        return Double.valueOf(100.0d);
                    }
                    if (d11 >= 22.0d && d11 < 27.0d) {
                        return Double.valueOf(100.0d - ((d11 - 22) * 10.0d));
                    }
                    if (d11 >= 27.0d && d11 < 50.0d) {
                        return Double.valueOf(50.0d - ((d11 - 27) * 1.2d));
                    }
                    return Double.valueOf(20.0d);
                } else if (d11 < 12.0d) {
                    return Double.valueOf(((d11 - 5.0d) * 7.142857142857143d) + 50.0d);
                } else {
                    if (d11 >= 12.0d && d11 < 25.0d) {
                        return Double.valueOf(100.0d);
                    }
                    if (d11 >= 25.0d && d11 < 30.0d) {
                        return Double.valueOf(100.0d - ((d11 - 25) * 10.0d));
                    }
                    if (d11 >= 30.0d && d11 < 50.0d) {
                        return Double.valueOf(50.0d - ((d11 - 30) * 1.5d));
                    }
                    return Double.valueOf(20.0d);
                }
            } else if (i11 < 40) {
                if (d11 < 14.0d) {
                    return Double.valueOf(((d11 - 5.0d) * 5.555555555555555d) + 50.0d);
                }
                if (d11 >= 14.0d && d11 < 33.0d) {
                    return Double.valueOf(100.0d);
                }
                if (d11 >= 33.0d && d11 < 39.0d) {
                    return Double.valueOf(100.0d - ((d11 - 33) * 8.333333333333334d));
                }
                if (d11 >= 39.0d && d11 < 50.0d) {
                    return Double.valueOf(50.0d - ((d11 - 39) * 2.727272727272727d));
                }
                return Double.valueOf(20.0d);
            } else if (40 <= i11 && i11 < 60) {
                if (d11 < 16.0d) {
                    return Double.valueOf(((d11 - 5.0d) * 4.545454545454546d) + 50.0d);
                }
                if (d11 >= 16.0d && d11 < 34.0d) {
                    return Double.valueOf(100.0d);
                }
                if (d11 >= 34.0d && d11 < 40.0d) {
                    return Double.valueOf(100.0d - ((d11 - 34) * 8.333333333333334d));
                }
                if (d11 >= 40.0d && d11 < 50.0d) {
                    return Double.valueOf(50.0d - ((d11 - 40) * 3.0d));
                }
                return Double.valueOf(20.0d);
            } else if (d11 < 17.0d) {
                return Double.valueOf(((d11 - 5.0d) * 4.166666666666667d) + 50.0d);
            } else {
                if (d11 >= 17.0d && d11 < 35.0d) {
                    return Double.valueOf(100.0d);
                }
                if (d11 >= 35.0d && d11 < 41.0d) {
                    return Double.valueOf(100.0d - ((d11 - 35) * 8.333333333333334d));
                }
                if (d11 >= 41.0d && d11 < 50.0d) {
                    return Double.valueOf(50.0d - ((d11 - 41) * 3.3333333333333335d));
                }
                return Double.valueOf(20.0d);
            }
        }
        return null;
    }
}
