package com.withings.workout.category.webservices;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.workout.category.model.WorkoutCategory;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import qm0.d;
import s00.a;
import s00.b;
/* compiled from: RetrofitWorkoutCategoryRemoteRepository.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0004\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/withings/workout/category/webservices/RetrofitWorkoutCategoryRemoteRepository;", "Lcom/withings/workout/category/webservices/WorkoutCategoryRemoteRepository;", "", "syncContext", "withSyncContext", "(Ljava/lang/String;)Lcom/withings/workout/category/webservices/WorkoutCategoryRemoteRepository;", "", NavigationArguments.USER_ID, "lastUpdate", "Lcom/withings/workout/category/model/WorkoutCategory$Response;", "getCategories", "(JJLqm0/d;)Ljava/lang/Object;", "Ls00/b;", "compatWebservicesFactory", "Ls00/b;", "Ls00/a;", "Lcom/withings/workout/category/webservices/WorkoutCategoryRetrofit1Api;", "Lcom/withings/workout/category/webservices/WorkoutCategoryRetrofit2Api;", "compatWs", "Ls00/a;", "<init>", "(Ls00/b;Ljava/lang/String;)V", "core-data-workout_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RetrofitWorkoutCategoryRemoteRepository implements WorkoutCategoryRemoteRepository {
    private final b compatWebservicesFactory;
    private final a<WorkoutCategoryRetrofit1Api, WorkoutCategoryRetrofit2Api> compatWs;

    public RetrofitWorkoutCategoryRemoteRepository(b compatWebservicesFactory, String str) {
        u.j(compatWebservicesFactory, "compatWebservicesFactory");
        this.compatWebservicesFactory = compatWebservicesFactory;
        this.compatWs = compatWebservicesFactory.a(str, WorkoutCategoryRetrofit1Api.class, WorkoutCategoryRetrofit2Api.class);
    }

    @Override // com.withings.workout.category.webservices.WorkoutCategoryRemoteRepository
    public Object getCategories(long j5, long j11, d<? super WorkoutCategory.Response> dVar) {
        return a.d(this.compatWs, new RetrofitWorkoutCategoryRemoteRepository$getCategories$2(j5, j11), new RetrofitWorkoutCategoryRemoteRepository$getCategories$3(j5, j11, null), null, false, dVar, 124);
    }

    @Override // com.withings.workout.category.webservices.WorkoutCategoryRemoteRepository
    public WorkoutCategoryRemoteRepository withSyncContext(String str) {
        return new RetrofitWorkoutCategoryRemoteRepository(this.compatWebservicesFactory, str);
    }

    public /* synthetic */ RetrofitWorkoutCategoryRemoteRepository(b bVar, String str, int i11, m mVar) {
        this(bVar, (i11 & 2) != 0 ? null : str);
    }
}
