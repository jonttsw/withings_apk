package com.withings.wiscale2.activity.workout.recognition.webservices;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.wiscale2.activity.workout.recognition.webservices.WsClassifier;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import qm0.d;
import s00.a;
import s00.b;
/* compiled from: RetrofitRecognitionRemoteRepository.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0004\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/withings/wiscale2/activity/workout/recognition/webservices/RetrofitRecognitionRemoteRepository;", "Lcom/withings/wiscale2/activity/workout/recognition/webservices/RecognitionRemoteRepository;", "", "syncContext", "withSyncContext", "(Ljava/lang/String;)Lcom/withings/wiscale2/activity/workout/recognition/webservices/RecognitionRemoteRepository;", "", NavigationArguments.USER_ID, "", "algoVersion", "algoFormat", "forceGlobal", "Lcom/withings/wiscale2/activity/workout/recognition/webservices/WsClassifier$Response;", "getClassifierForUser", "(JIIILqm0/d;)Ljava/lang/Object;", "Ls00/b;", "compatWebservicesFactory", "Ls00/b;", "Ls00/a;", "Lcom/withings/wiscale2/activity/workout/recognition/webservices/RecognitionRetrofit1Api;", "Lcom/withings/wiscale2/activity/workout/recognition/webservices/RecognitionRetrofit2Api;", "compatWs", "Ls00/a;", "<init>", "(Ls00/b;Ljava/lang/String;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RetrofitRecognitionRemoteRepository implements RecognitionRemoteRepository {
    public static final int $stable = 8;
    private final b compatWebservicesFactory;
    private final a<RecognitionRetrofit1Api, RecognitionRetrofit2Api> compatWs;

    public RetrofitRecognitionRemoteRepository(b compatWebservicesFactory, String str) {
        u.j(compatWebservicesFactory, "compatWebservicesFactory");
        this.compatWebservicesFactory = compatWebservicesFactory;
        this.compatWs = compatWebservicesFactory.a(str, RecognitionRetrofit1Api.class, RecognitionRetrofit2Api.class);
    }

    @Override // com.withings.wiscale2.activity.workout.recognition.webservices.RecognitionRemoteRepository
    public Object getClassifierForUser(long j5, int i11, int i12, int i13, d<? super WsClassifier.Response> dVar) {
        return a.d(this.compatWs, new RetrofitRecognitionRemoteRepository$getClassifierForUser$2(j5, i11, i12, i13), new RetrofitRecognitionRemoteRepository$getClassifierForUser$3(j5, i11, i12, i13, null), null, false, dVar, 124);
    }

    @Override // com.withings.wiscale2.activity.workout.recognition.webservices.RecognitionRemoteRepository
    public RecognitionRemoteRepository withSyncContext(String str) {
        return new RetrofitRecognitionRemoteRepository(this.compatWebservicesFactory, str);
    }

    public /* synthetic */ RetrofitRecognitionRemoteRepository(b bVar, String str, int i11, m mVar) {
        this(bVar, (i11 & 2) != 0 ? null : str);
    }
}
