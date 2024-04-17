package com.withings.wiscale2.activity.workout.recognition.webservices;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.wiscale2.activity.workout.recognition.webservices.WsClassifier;
import kotlin.Metadata;
import qm0.d;
/* compiled from: RecognitionRemoteRepository.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ\u0019\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH¦@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lcom/withings/wiscale2/activity/workout/recognition/webservices/RecognitionRemoteRepository;", "", "", "syncContext", "withSyncContext", "(Ljava/lang/String;)Lcom/withings/wiscale2/activity/workout/recognition/webservices/RecognitionRemoteRepository;", "", NavigationArguments.USER_ID, "", "algoVersion", "algoFormat", "forceGlobal", "Lcom/withings/wiscale2/activity/workout/recognition/webservices/WsClassifier$Response;", "getClassifierForUser", "(JIIILqm0/d;)Ljava/lang/Object;", "Companion", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface RecognitionRemoteRepository {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int FORCE_GLOBAL_FALSE = 0;
    public static final int FORCE_GLOBAL_TRUE = 1;

    /* compiled from: RecognitionRemoteRepository.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/withings/wiscale2/activity/workout/recognition/webservices/RecognitionRemoteRepository$Companion;", "", "()V", "FORCE_GLOBAL_FALSE", "", "FORCE_GLOBAL_TRUE", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int FORCE_GLOBAL_FALSE = 0;
        public static final int FORCE_GLOBAL_TRUE = 1;

        private Companion() {
        }
    }

    Object getClassifierForUser(long j5, int i11, int i12, int i13, d<? super WsClassifier.Response> dVar);

    RecognitionRemoteRepository withSyncContext(String str);
}
