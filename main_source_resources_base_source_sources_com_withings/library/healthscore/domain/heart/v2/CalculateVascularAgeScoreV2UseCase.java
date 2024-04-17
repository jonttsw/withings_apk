package com.withings.library.healthscore.domain.heart.v2;

import com.withings.library.healthscore.domain.interfaces.VascularAgeScoreInterface;
import kotlin.Metadata;
/* compiled from: CalculateVascularAgeScoreV2UseCase.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/library/healthscore/domain/heart/v2/CalculateVascularAgeScoreV2UseCase;", "Lcom/withings/library/healthscore/domain/interfaces/VascularAgeScoreInterface;", "()V", "getVascularAgeScore", "", "age", "", "vascularAgeResults", "", "Lcom/withings/library/healthscore/models/api/VascularAgeMeasureGroup;", "(ILjava/util/List;)Ljava/lang/Double;", "HealthScore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CalculateVascularAgeScoreV2UseCase implements VascularAgeScoreInterface {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    @Override // com.withings.library.healthscore.domain.interfaces.VascularAgeScoreInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Double getVascularAgeScore(int r8, java.util.List<com.withings.library.healthscore.models.api.VascularAgeMeasureGroup> r9) {
        /*
            r7 = this;
            java.lang.String r0 = "vascularAgeResults"
            kotlin.jvm.internal.u.j(r9, r0)
            r0 = r9
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L85
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L7f
            java.lang.Object r0 = r9.next()
            boolean r1 = r9.hasNext()
            if (r1 != 0) goto L27
            goto L45
        L27:
            r1 = r0
            com.withings.library.healthscore.models.api.VascularAgeMeasureGroup r1 = (com.withings.library.healthscore.models.api.VascularAgeMeasureGroup) r1
            long r1 = r1.getDateInMillis()
        L2e:
            java.lang.Object r3 = r9.next()
            r4 = r3
            com.withings.library.healthscore.models.api.VascularAgeMeasureGroup r4 = (com.withings.library.healthscore.models.api.VascularAgeMeasureGroup) r4
            long r4 = r4.getDateInMillis()
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 >= 0) goto L3f
            r0 = r3
            r1 = r4
        L3f:
            boolean r3 = r9.hasNext()
            if (r3 != 0) goto L2e
        L45:
            com.withings.library.healthscore.models.api.VascularAgeMeasureGroup r0 = (com.withings.library.healthscore.models.api.VascularAgeMeasureGroup) r0
            int r9 = r0.getVascularAge()
            int r8 = r8 - r9
            int r9 = r8 + 10
            r0 = 6
            r1 = 4621819117588971520(0x4024000000000000, double:10.0)
            if (r9 >= r0) goto L5c
            double r8 = (double) r8
            double r8 = r8 + r1
            r0 = 4617315517961601024(0x4014000000000000, double:5.0)
            double r8 = r8 * r0
            r0 = 4629137466983448576(0x403e000000000000, double:30.0)
            double r8 = r8 + r0
            goto L74
        L5c:
            double r8 = (double) r8
            double r1 = r1 + r8
            r3 = 4618441417868443648(0x4018000000000000, double:6.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r1 = 4636737291354636288(0x4059000000000000, double:100.0)
            if (r0 < 0) goto L73
            double r8 = r8 + r3
            r3 = 4632233691727265792(0x4049000000000000, double:50.0)
            double r8 = r8 * r3
            r5 = 4622945017495814144(0x4028000000000000, double:12.0)
            double r8 = r8 / r5
            double r8 = r8 + r3
            double r8 = java.lang.Math.min(r1, r8)
            goto L74
        L73:
            r8 = r1
        L74:
            r0 = 4626322717216342016(0x4034000000000000, double:20.0)
            double r8 = java.lang.Math.max(r0, r8)
            java.lang.Double r8 = java.lang.Double.valueOf(r8)
            goto L86
        L7f:
            java.util.NoSuchElementException r8 = new java.util.NoSuchElementException
            r8.<init>()
            throw r8
        L85:
            r8 = 0
        L86:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.library.healthscore.domain.heart.v2.CalculateVascularAgeScoreV2UseCase.getVascularAgeScore(int, java.util.List):java.lang.Double");
    }
}
