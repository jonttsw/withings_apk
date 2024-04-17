package com.withings.library.healthscore.domain.common;

import com.google.android.gms.internal.mlkit_common.a;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.healthscore.models.internal.common.Measurement;
import com.withings.library.healthscore.utils.date.DateUtilsKt;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: ComputeMeasurementDaysUseCase.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¨\u0006\b"}, d2 = {"Lcom/withings/library/healthscore/domain/common/ComputeMeasurementDaysUseCase;", "", "()V", "execute", "", ConstantsWs.CHANNEL_PUSH_MEASUREMENTS, "", "Lcom/withings/library/healthscore/models/internal/common/Measurement;", "HealthScore_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComputeMeasurementDaysUseCase {
    public final int execute(List<? extends Measurement> measurements) {
        u.j(measurements, "measurements");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : measurements) {
            Integer valueOf = Integer.valueOf(DateUtilsKt.getDay(((Measurement) obj).getDateInMillis()));
            Object obj2 = linkedHashMap.get(valueOf);
            if (obj2 == null) {
                obj2 = a.d(linkedHashMap, valueOf);
            }
            ((List) obj2).add(obj);
        }
        return linkedHashMap.size();
    }
}
