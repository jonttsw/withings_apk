package com.withings.wiscale2.food.ws;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.food.model.MealNameResponse;
import com.withings.wiscale2.food.model.MealResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement;
import qm0.d;
import s00.a;
import s00.b;
/* compiled from: RetrofitFoodRemoteRepository.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u0004\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ0\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/withings/wiscale2/food/ws/RetrofitFoodRemoteRepository;", "Lcom/withings/wiscale2/food/ws/FoodRemoteRepository;", "", "syncContext", "withSyncContext", "(Ljava/lang/String;)Lcom/withings/wiscale2/food/ws/FoodRemoteRepository;", "", NavigationArguments.USER_ID, "Lcom/withings/wiscale2/food/model/MealNameResponse;", "getMealNames", "(JLqm0/d;)Ljava/lang/Object;", "startDate", "endDate", "", ValidateElement.RangeValidateElement.METHOD, "Lcom/withings/wiscale2/food/model/MealResponse;", "getMeals", "(JLjava/lang/String;Ljava/lang/String;ILqm0/d;)Ljava/lang/Object;", "Ls00/b;", "compatWebservicesFactory", "Ls00/b;", "Ls00/a;", "Lcom/withings/wiscale2/food/ws/FoodRetrofit1Api;", "Lcom/withings/wiscale2/food/ws/FoodRetrofit2Api;", "compatWs", "Ls00/a;", "<init>", "(Ls00/b;Ljava/lang/String;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RetrofitFoodRemoteRepository implements FoodRemoteRepository {
    public static final int $stable = 8;
    private final b compatWebservicesFactory;
    private final a<FoodRetrofit1Api, FoodRetrofit2Api> compatWs;

    public RetrofitFoodRemoteRepository(b compatWebservicesFactory, String str) {
        u.j(compatWebservicesFactory, "compatWebservicesFactory");
        this.compatWebservicesFactory = compatWebservicesFactory;
        this.compatWs = compatWebservicesFactory.a(str, FoodRetrofit1Api.class, FoodRetrofit2Api.class);
    }

    @Override // com.withings.wiscale2.food.ws.FoodRemoteRepository
    public Object getMealNames(long j5, d<? super MealNameResponse> dVar) {
        return a.d(this.compatWs, new RetrofitFoodRemoteRepository$getMealNames$2(j5), new RetrofitFoodRemoteRepository$getMealNames$3(j5, null), null, false, dVar, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
    }

    @Override // com.withings.wiscale2.food.ws.FoodRemoteRepository
    public Object getMeals(long j5, String str, String str2, int i11, d<? super MealResponse> dVar) {
        return a.d(this.compatWs, new RetrofitFoodRemoteRepository$getMeals$2(j5, str, str2, i11), new RetrofitFoodRemoteRepository$getMeals$3(j5, str, str2, i11, null), null, false, dVar, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
    }

    @Override // com.withings.wiscale2.food.ws.FoodRemoteRepository
    public FoodRemoteRepository withSyncContext(String str) {
        return new RetrofitFoodRemoteRepository(this.compatWebservicesFactory, str);
    }

    public /* synthetic */ RetrofitFoodRemoteRepository(b bVar, String str, int i11, m mVar) {
        this(bVar, (i11 & 2) != 0 ? null : str);
    }
}
