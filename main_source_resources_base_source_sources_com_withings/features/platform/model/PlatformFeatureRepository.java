package com.withings.features.platform.model;

import androidx.health.connect.client.records.CervicalMucusRecord;
import androidx.lifecycle.LiveData;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.joda.time.DateTime;
/* compiled from: PlatformFeatureRepository.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u00017J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00102\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00132\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bH&¢\u0006\u0004\b\u0016\u0010\u000bJ\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00102\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00132\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010 \u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\u0010\r\u001a\u00020\u001f\"\u00020\fH&¢\u0006\u0004\b \u0010!J\u001d\u0010#\u001a\u00020\u00042\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\bH&¢\u0006\u0004\b#\u0010$J'\u0010)\u001a\u00020(2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u00172\u0006\u0010'\u001a\u00020&H&¢\u0006\u0004\b)\u0010*J'\u0010+\u001a\u00020(2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u00172\u0006\u0010'\u001a\u00020&H&¢\u0006\u0004\b+\u0010*J\u001d\u0010-\u001a\u00020\u00042\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\t0\bH&¢\u0006\u0004\b-\u0010$J\u0017\u0010/\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\tH&¢\u0006\u0004\b/\u00100J\u001d\u00101\u001a\u00020\u00042\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\bH&¢\u0006\u0004\b1\u0010$J\u000f\u00103\u001a\u000202H&¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0004H&¢\u0006\u0004\b5\u00106¨\u00068À\u0006\u0003"}, d2 = {"Lcom/withings/features/platform/model/PlatformFeatureRepository;", "", "Lcom/withings/features/platform/model/PlatformFeatureRepository$Listener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lnm0/y;", "registerListener", "(Lcom/withings/features/platform/model/PlatformFeatureRepository$Listener;)V", "unregisterListener", "", "Lcom/withings/features/platform/model/PlatformFeature;", "getNotSyncedFeatures", "()Ljava/util/List;", "", "featureId", "getFeature", "(I)Lcom/withings/features/platform/model/PlatformFeature;", "Lkotlinx/coroutines/flow/Flow;", "getFeatureAsFlow", "(I)Lkotlinx/coroutines/flow/Flow;", "Landroidx/lifecycle/LiveData;", "getFeatureLiveData", "(I)Landroidx/lifecycle/LiveData;", "getAllFeatures", "", "deviceId", "getAllFeaturesForDevice", "(J)Ljava/util/List;", "getAllFeaturesForDeviceFlow", "(J)Lkotlinx/coroutines/flow/Flow;", "getAllFeaturesForDeviceLiveData", "(J)Landroidx/lifecycle/LiveData;", "", "getPlatformFeatures", "([I)Ljava/util/List;", "features", "insertFeatures", "(Ljava/util/List;)V", "ownerId", "", "ownerType", "", "isFeatureEligibleForOwnerIdAndType", "(IJLjava/lang/String;)Z", "isFeatureEnabledForOwnerIdAndType", "platformFeatures", "updateFeatures", "platformFeature", "updateFeature", "(Lcom/withings/features/platform/model/PlatformFeature;)V", "replaceAllFeatures", "Lorg/joda/time/DateTime;", "getLastUpdate", "()Lorg/joda/time/DateTime;", CervicalMucusRecord.Appearance.CLEAR, "()V", "Listener", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface PlatformFeatureRepository {

    /* compiled from: PlatformFeatureRepository.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0006¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lcom/withings/features/platform/model/PlatformFeatureRepository$Listener;", "", "Lcom/withings/features/platform/model/PlatformFeature;", "feature", "Lnm0/y;", "onFeatureInserted", "(Lcom/withings/features/platform/model/PlatformFeature;)V", "onFeatureUpdated", "onFeatureDeleted", "android_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public interface Listener {
        void onFeatureDeleted(PlatformFeature platformFeature);

        void onFeatureInserted(PlatformFeature platformFeature);

        void onFeatureUpdated(PlatformFeature platformFeature);
    }

    void clear();

    List<PlatformFeature> getAllFeatures();

    List<PlatformFeature> getAllFeaturesForDevice(long j5);

    Flow<List<PlatformFeature>> getAllFeaturesForDeviceFlow(long j5);

    LiveData<List<PlatformFeature>> getAllFeaturesForDeviceLiveData(long j5);

    PlatformFeature getFeature(int i11);

    Flow<PlatformFeature> getFeatureAsFlow(int i11);

    LiveData<PlatformFeature> getFeatureLiveData(int i11);

    DateTime getLastUpdate();

    List<PlatformFeature> getNotSyncedFeatures();

    List<PlatformFeature> getPlatformFeatures(int... iArr);

    void insertFeatures(List<PlatformFeature> list);

    boolean isFeatureEligibleForOwnerIdAndType(int i11, long j5, String str);

    boolean isFeatureEnabledForOwnerIdAndType(int i11, long j5, String str);

    void registerListener(Listener listener);

    void replaceAllFeatures(List<PlatformFeature> list);

    void unregisterListener(Listener listener);

    void updateFeature(PlatformFeature platformFeature);

    void updateFeatures(List<PlatformFeature> list);
}
