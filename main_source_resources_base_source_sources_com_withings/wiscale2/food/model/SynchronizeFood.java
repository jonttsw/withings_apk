package com.withings.wiscale2.food.model;

import android.content.Context;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.webservices.legacy.sync.BaseSyncAction;
import com.withings.wiscale2.food.ws.FoodRemoteRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import t10.e;
/* compiled from: SynchronizeFood.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0003\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0082@¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/withings/wiscale2/food/model/SynchronizeFood;", "Lcom/withings/webservices/legacy/sync/BaseSyncAction;", "Lnm0/y;", "synchronizeMeals", "(Lqm0/d;)Ljava/lang/Object;", "", "Lcom/withings/wiscale2/food/model/MealName;", "synchronizeMealNames", "run", "()V", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/withings/user/User;", ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "Lcom/withings/user/User;", "Lt10/e;", "partnerManager", "Lt10/e;", "Lcom/withings/wiscale2/food/model/FoodManager;", "foodManager", "Lcom/withings/wiscale2/food/model/FoodManager;", "Lcom/withings/wiscale2/food/ws/FoodRemoteRepository;", "foodRemoteRepository", "Lcom/withings/wiscale2/food/ws/FoodRemoteRepository;", "<init>", "(Landroid/content/Context;Lcom/withings/user/User;Lt10/e;Lcom/withings/wiscale2/food/model/FoodManager;Lcom/withings/wiscale2/food/ws/FoodRemoteRepository;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SynchronizeFood extends BaseSyncAction {
    public static final int $stable = 8;
    private final Context context;
    private final FoodManager foodManager;
    private final FoodRemoteRepository foodRemoteRepository;
    private final e partnerManager;
    private final User user;

    public SynchronizeFood(Context context, User user, e partnerManager, FoodManager foodManager, FoodRemoteRepository foodRemoteRepository) {
        u.j(context, "context");
        u.j(user, "user");
        u.j(partnerManager, "partnerManager");
        u.j(foodManager, "foodManager");
        u.j(foodRemoteRepository, "foodRemoteRepository");
        this.context = context;
        this.user = user;
        this.partnerManager = partnerManager;
        this.foodManager = foodManager;
        this.foodRemoteRepository = foodRemoteRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object synchronizeMealNames(qm0.d<? super java.util.List<com.withings.wiscale2.food.model.MealName>> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.withings.wiscale2.food.model.SynchronizeFood$synchronizeMealNames$1
            if (r0 == 0) goto L13
            r0 = r12
            com.withings.wiscale2.food.model.SynchronizeFood$synchronizeMealNames$1 r0 = (com.withings.wiscale2.food.model.SynchronizeFood$synchronizeMealNames$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.withings.wiscale2.food.model.SynchronizeFood$synchronizeMealNames$1 r0 = new com.withings.wiscale2.food.model.SynchronizeFood$synchronizeMealNames$1
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r1 = r0.L$1
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.L$0
            com.withings.wiscale2.food.model.SynchronizeFood r0 = (com.withings.wiscale2.food.model.SynchronizeFood) r0
            nm0.l.b(r12)
            goto L68
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L37:
            nm0.l.b(r12)
            com.withings.wiscale2.food.model.FoodManager r12 = r11.foodManager
            com.withings.user.User r2 = r11.user
            java.util.List r12 = r12.getMealNamesForUser(r2)
            java.util.Collection r12 = (java.util.Collection) r12
            java.util.ArrayList r12 = kotlin.collections.x.S0(r12)
            com.withings.wiscale2.food.ws.FoodRemoteRepository r2 = r11.foodRemoteRepository
            java.lang.String r4 = r11.getSyncContext()
            com.withings.wiscale2.food.ws.FoodRemoteRepository r2 = r2.withSyncContext(r4)
            com.withings.user.User r4 = r11.user
            long r4 = r4.q()
            r0.L$0 = r11
            r0.L$1 = r12
            r0.label = r3
            java.lang.Object r0 = r2.getMealNames(r4, r0)
            if (r0 != r1) goto L65
            return r1
        L65:
            r1 = r12
            r12 = r0
            r0 = r11
        L68:
            com.withings.wiscale2.food.model.MealNameResponse r12 = (com.withings.wiscale2.food.model.MealNameResponse) r12
            java.util.List r12 = r12.getData()
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r12 = r12.iterator()
        L79:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto L97
            java.lang.Object r3 = r12.next()
            r4 = r3
            com.withings.wiscale2.food.model.MealName r4 = (com.withings.wiscale2.food.model.MealName) r4
            java.lang.String r4 = r4.getName()
            if (r4 == 0) goto L79
            int r4 = r4.length()
            if (r4 != 0) goto L93
            goto L79
        L93:
            r2.add(r3)
            goto L79
        L97:
            java.util.Iterator r12 = r2.iterator()
        L9b:
            boolean r3 = r12.hasNext()
            if (r3 == 0) goto Ldc
            java.lang.Object r3 = r12.next()
            com.withings.wiscale2.food.model.MealName r3 = (com.withings.wiscale2.food.model.MealName) r3
            r4 = r1
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        Lae:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lc8
            java.lang.Object r5 = r4.next()
            r6 = r5
            com.withings.wiscale2.food.model.MealName r6 = (com.withings.wiscale2.food.model.MealName) r6
            long r7 = r3.getId()
            long r9 = r6.getId()
            int r6 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r6 != 0) goto Lae
            goto Lc9
        Lc8:
            r5 = 0
        Lc9:
            com.withings.wiscale2.food.model.MealName r5 = (com.withings.wiscale2.food.model.MealName) r5
            if (r5 == 0) goto Ld6
            com.withings.wiscale2.food.model.FoodManager r4 = r0.foodManager
            r4.updateMealNameForUser(r3)
            r1.remove(r5)
            goto L9b
        Ld6:
            com.withings.wiscale2.food.model.FoodManager r4 = r0.foodManager
            r4.insertMealNameForUser(r3)
            goto L9b
        Ldc:
            com.withings.wiscale2.food.model.FoodManager r12 = r0.foodManager
            com.withings.user.User r0 = r0.user
            r12.deleteMealNames(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.food.model.SynchronizeFood.synchronizeMealNames(qm0.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010c A[LOOP:2: B:45:0x0106->B:47:0x010c, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object synchronizeMeals(qm0.d<? super nm0.y> r12) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.food.model.SynchronizeFood.synchronizeMeals(qm0.d):java.lang.Object");
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // com.withings.webservices.legacy.sync.BaseSyncAction, com.withings.webservices.legacy.sync.SyncAction.WithSyncContext, com.withings.webservices.legacy.sync.SyncAction, vh.a
    public void run() throws Exception {
        BuildersKt__BuildersKt.runBlocking$default(null, new SynchronizeFood$run$1(this, null), 1, null);
    }
}
