package com.withings.plan.android.model;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import l20.a;
import l20.d;
import l20.e;
import l20.f;
/* compiled from: PlanMapper.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0011\u0010\u0006\u001a\u00020\u0001*\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\u0002*\u00020\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\u000b\u001a\u00020\n*\u00020\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0011\u0010\u0006\u001a\u00020\u000e*\u00020\r¢\u0006\u0004\b\u0006\u0010\u000f\u001a\u0011\u0010\u0006\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0006\u0010\u0012¨\u0006\u0013"}, d2 = {"", "Ll20/e;", "Lcom/withings/plan/android/model/PlanEntity;", "toEntities", "(Ljava/util/List;)Ljava/util/List;", "Lcom/withings/plan/android/model/PlanWsResponse;", "toResponse", "(Lcom/withings/plan/android/model/PlanWsResponse;)Ll20/e;", "toEntity", "(Ll20/e;)Lcom/withings/plan/android/model/PlanEntity;", "Ll20/d;", "toDomain", "(Lcom/withings/plan/android/model/PlanEntity;)Ll20/d;", "Lcom/withings/plan/android/model/AcknowledgePurchaseWsResponse;", "Ll20/a;", "(Lcom/withings/plan/android/model/AcknowledgePurchaseWsResponse;)Ll20/a;", "Lcom/withings/plan/android/model/PurchaseStatusWsResponse;", "Ll20/f;", "(Lcom/withings/plan/android/model/PurchaseStatusWsResponse;)Ll20/f;", "android_release"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PlanMapperKt {
    public static final d toDomain(PlanEntity planEntity) {
        u.j(planEntity, "<this>");
        return new d(planEntity.getId(), planEntity.getAccountId(), planEntity.getDeviceId(), planEntity.getState(), planEntity.getType(), planEntity.getStartDate(), planEntity.getModified());
    }

    public static final List<PlanEntity> toEntities(List<e> list) {
        u.j(list, "<this>");
        List<e> list2 = list;
        ArrayList arrayList = new ArrayList(x.y(list2, 10));
        for (e eVar : list2) {
            arrayList.add(toEntity(eVar));
        }
        return arrayList;
    }

    public static final PlanEntity toEntity(e eVar) {
        u.j(eVar, "<this>");
        return new PlanEntity(eVar.c(), eVar.a(), eVar.b(), eVar.f(), eVar.g(), eVar.e(), eVar.d());
    }

    public static final a toResponse(AcknowledgePurchaseWsResponse acknowledgePurchaseWsResponse) {
        u.j(acknowledgePurchaseWsResponse, "<this>");
        return new a(acknowledgePurchaseWsResponse.getKey(), acknowledgePurchaseWsResponse.getWaitSeconds());
    }

    public static final e toResponse(PlanWsResponse planWsResponse) {
        u.j(planWsResponse, "<this>");
        return new e(planWsResponse.getId(), planWsResponse.getAccountId(), planWsResponse.getDeviceId(), planWsResponse.getState(), planWsResponse.getType(), planWsResponse.getStartDate(), planWsResponse.getModified());
    }

    public static final f toResponse(PurchaseStatusWsResponse purchaseStatusWsResponse) {
        u.j(purchaseStatusWsResponse, "<this>");
        return new f(purchaseStatusWsResponse.getStatus(), purchaseStatusWsResponse.getWaitSeconds());
    }
}
