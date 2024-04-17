package com.withings.target.data.api.model;

import com.withings.target.Target;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: DataConversion.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"toEntity", "Lcom/withings/target/Target;", "Lcom/withings/target/data/api/model/TargetWS;", "isSyncedWithApi", "", "target_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DataConversionKt {
    public static final Target toEntity(TargetWS targetWS, boolean z5) {
        int i11;
        u.j(targetWS, "<this>");
        Long id2 = targetWS.getId();
        Long wsId = targetWS.getWsId();
        long userId = targetWS.getUserId();
        int type = targetWS.getType();
        int measureType = targetWS.getMeasureType();
        Integer range = targetWS.getRange();
        if (range != null) {
            i11 = range.intValue();
        } else {
            i11 = Integer.MIN_VALUE;
        }
        return new Target(id2, wsId, userId, type, measureType, i11, targetWS.getMantissa(), targetWS.getExponent(), targetWS.isActive(), targetWS.getDeactivated(), targetWS.getCreated(), targetWS.getModified(), targetWS.getDate(), z5, targetWS.getAttrib());
    }

    public static /* synthetic */ Target toEntity$default(TargetWS targetWS, boolean z5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z5 = targetWS.isSyncedWithApi();
        }
        return toEntity(targetWS, z5);
    }
}
