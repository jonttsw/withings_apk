package com.withings.wiscale2.activity.workout.recognition.webservices;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.webservices.legacy.lastupdate.LastUpdate;
import com.withings.webservices.legacy.lastupdate.UserLastUpdate;
import com.withings.webservices.legacy.sync.BaseSyncAction;
import com.withings.wiscale2.activity.workout.recognition.model.Classifier;
import com.withings.wiscale2.activity.workout.recognition.model.RecognitionManager;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import org.joda.time.DateTime;
import r70.c;
/* compiled from: ClassifierSync.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/withings/wiscale2/activity/workout/recognition/webservices/ClassifierSync;", "Lcom/withings/webservices/legacy/sync/BaseSyncAction;", "", "classifierHasBeenUpdatedOnWebServices", "()Z", "Lnm0/y;", "run", "()V", "Lcom/withings/wiscale2/activity/workout/recognition/model/RecognitionManager;", "recognitionManager", "Lcom/withings/wiscale2/activity/workout/recognition/model/RecognitionManager;", "", NavigationArguments.USER_ID, "J", "Lr70/c;", "userRepository", "Lr70/c;", "Lcom/withings/wiscale2/activity/workout/recognition/webservices/RecognitionRemoteRepository;", "recognitionRemoteRepository", "Lcom/withings/wiscale2/activity/workout/recognition/webservices/RecognitionRemoteRepository;", "<init>", "(Lcom/withings/wiscale2/activity/workout/recognition/model/RecognitionManager;JLr70/c;Lcom/withings/wiscale2/activity/workout/recognition/webservices/RecognitionRemoteRepository;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ClassifierSync extends BaseSyncAction {
    public static final int $stable = 8;
    private final RecognitionManager recognitionManager;
    private final RecognitionRemoteRepository recognitionRemoteRepository;
    private final long userId;
    private final c userRepository;

    public ClassifierSync(RecognitionManager recognitionManager, long j5, c userRepository, RecognitionRemoteRepository recognitionRemoteRepository) {
        u.j(recognitionManager, "recognitionManager");
        u.j(userRepository, "userRepository");
        u.j(recognitionRemoteRepository, "recognitionRemoteRepository");
        this.recognitionManager = recognitionManager;
        this.userId = j5;
        this.userRepository = userRepository;
        this.recognitionRemoteRepository = recognitionRemoteRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean classifierHasBeenUpdatedOnWebServices() {
        UserLastUpdate userLastUpdate;
        LastUpdate lastUpdate = getLastUpdate();
        DateTime dateTime = null;
        if (lastUpdate != null) {
            userLastUpdate = lastUpdate.getUser(this.userId);
        } else {
            userLastUpdate = null;
        }
        if (userLastUpdate == null) {
            return true;
        }
        Classifier classifierForUserId = this.recognitionManager.getClassifierForUserId(this.userId);
        if (classifierForUserId != null) {
            dateTime = classifierForUserId.getModificationDate();
        }
        if (dateTime == null) {
            return true;
        }
        return dateTime.isBefore(lastUpdate.getUser(this.userId).getClassifier());
    }

    @Override // com.withings.webservices.legacy.sync.BaseSyncAction, com.withings.webservices.legacy.sync.SyncAction.WithSyncContext, com.withings.webservices.legacy.sync.SyncAction, vh.a
    public void run() throws Exception {
        BuildersKt__BuildersKt.runBlocking$default(null, new ClassifierSync$run$1(this, null), 1, null);
    }
}
