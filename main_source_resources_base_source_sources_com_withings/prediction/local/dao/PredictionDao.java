package com.withings.prediction.local.dao;

import androidx.health.connect.client.records.CervicalMucusRecord;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.prediction.local.model.PredictionEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import nm0.y;
import org.joda.time.Instant;
import qm0.d;
/* compiled from: PredictionDao.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H§@¢\u0006\u0004\b\u0005\u0010\tJ\u001e\u0010\n\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0097@¢\u0006\u0004\b\n\u0010\tJ#\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\r2\u0006\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H'¢\u0006\u0004\b\u000e\u0010\u0012J#\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\r2\u0006\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\u0013\u0010\u000fJ+\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H'¢\u0006\u0004\b\u0013\u0010\u0012J\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0017\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u0017\u0010\u0016J\u0018\u0010\u0019\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u0019\u0010\u0016¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Lcom/withings/prediction/local/dao/PredictionDao;", "", "Lcom/withings/prediction/local/model/PredictionEntity;", "prediction", "Lnm0/y;", "upsert", "(Lcom/withings/prediction/local/model/PredictionEntity;Lqm0/d;)Ljava/lang/Object;", "", "predictions", "(Ljava/util/List;Lqm0/d;)Ljava/lang/Object;", "replaceAll", "", NavigationArguments.USER_ID, "Lkotlinx/coroutines/flow/Flow;", "get", "(J)Lkotlinx/coroutines/flow/Flow;", "", "type", "(JI)Lkotlinx/coroutines/flow/Flow;", "getActive", "Lorg/joda/time/Instant;", "getLastModified", "(JLqm0/d;)Ljava/lang/Object;", CervicalMucusRecord.Appearance.CLEAR, "(Lqm0/d;)Ljava/lang/Object;", "clearAllUnactivePredictions", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface PredictionDao {

    /* compiled from: PredictionDao.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static Object replaceAll(PredictionDao predictionDao, List<PredictionEntity> list, d<? super y> dVar) {
            Object replaceAll = PredictionDao.super.replaceAll(list, dVar);
            if (replaceAll == CoroutineSingletons.f76214a) {
                return replaceAll;
            }
            return y.f85009a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cc  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00ca -> B:24:0x008d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.Object replaceAll$suspendImpl(com.withings.prediction.local.dao.PredictionDao r9, java.util.List<com.withings.prediction.local.model.PredictionEntity> r10, qm0.d<? super nm0.y> r11) {
        /*
            boolean r0 = r11 instanceof com.withings.prediction.local.dao.PredictionDao$replaceAll$1
            if (r0 == 0) goto L13
            r0 = r11
            com.withings.prediction.local.dao.PredictionDao$replaceAll$1 r0 = (com.withings.prediction.local.dao.PredictionDao$replaceAll$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.prediction.local.dao.PredictionDao$replaceAll$1 r0 = new com.withings.prediction.local.dao.PredictionDao$replaceAll$1
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4d
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r9 = r0.L$1
            java.util.Iterator r9 = (java.util.Iterator) r9
            java.lang.Object r10 = r0.L$0
            com.withings.prediction.local.dao.PredictionDao r10 = (com.withings.prediction.local.dao.PredictionDao) r10
            nm0.l.b(r11)
            r8 = r10
            r10 = r9
            r9 = r8
            goto L8d
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            java.lang.Object r9 = r0.L$2
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r10 = r0.L$1
            java.util.Iterator r10 = (java.util.Iterator) r10
            java.lang.Object r2 = r0.L$0
            com.withings.prediction.local.dao.PredictionDao r2 = (com.withings.prediction.local.dao.PredictionDao) r2
            nm0.l.b(r11)
            goto Lba
        L4d:
            nm0.l.b(r11)
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>()
            java.util.Iterator r10 = r10.iterator()
        L5b:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L85
            java.lang.Object r2 = r10.next()
            r5 = r2
            com.withings.prediction.local.model.PredictionEntity r5 = (com.withings.prediction.local.model.PredictionEntity) r5
            long r5 = r5.getUserId()
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r5)
            java.lang.Object r5 = r11.get(r7)
            if (r5 != 0) goto L7f
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r11.put(r7, r5)
        L7f:
            java.util.List r5 = (java.util.List) r5
            r5.add(r2)
            goto L5b
        L85:
            java.util.Set r10 = r11.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L8d:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto Lcc
            java.lang.Object r11 = r10.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Number r2 = (java.lang.Number) r2
            long r5 = r2.longValue()
            java.lang.Object r11 = r11.getValue()
            java.util.List r11 = (java.util.List) r11
            r0.L$0 = r9
            r0.L$1 = r10
            r0.L$2 = r11
            r0.label = r4
            java.lang.Object r2 = r9.clear(r5, r0)
            if (r2 != r1) goto Lb8
            return r1
        Lb8:
            r2 = r9
            r9 = r11
        Lba:
            r0.L$0 = r2
            r0.L$1 = r10
            r11 = 0
            r0.L$2 = r11
            r0.label = r3
            java.lang.Object r9 = r2.upsert(r9, r0)
            if (r9 != r1) goto Lca
            return r1
        Lca:
            r9 = r2
            goto L8d
        Lcc:
            nm0.y r9 = nm0.y.f85009a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.prediction.local.dao.PredictionDao.replaceAll$suspendImpl(com.withings.prediction.local.dao.PredictionDao, java.util.List, qm0.d):java.lang.Object");
    }

    Object clear(long j5, d<? super y> dVar);

    Object clear(d<? super y> dVar);

    Object clearAllUnactivePredictions(long j5, d<? super y> dVar);

    Flow<List<PredictionEntity>> get(long j5);

    Flow<List<PredictionEntity>> get(long j5, int i11);

    Flow<List<PredictionEntity>> getActive(long j5);

    Flow<List<PredictionEntity>> getActive(long j5, int i11);

    Object getLastModified(long j5, d<? super Instant> dVar);

    default Object replaceAll(List<PredictionEntity> list, d<? super y> dVar) {
        return replaceAll$suspendImpl(this, list, dVar);
    }

    Object upsert(PredictionEntity predictionEntity, d<? super y> dVar);

    Object upsert(List<PredictionEntity> list, d<? super y> dVar);
}
